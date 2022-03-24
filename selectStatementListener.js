const SQLSelectParserListener = require('./parser/SQLSelectParserListener');

class Listener extends SQLSelectParserListener {
    constructor() {
        super();

        this.result = { selectItems: [], from: [] };

        this.fieldReferences = [];
        this.expressionState = null;
    }

    getResult() {
        return this.result;
    }

    setResult(result) {
        this.result = result;
    }

    exitQuerySpecification(ctx) {
        this.setResult({
            selectItems: ctx.selectItemList().fields || [],
            from: (ctx.fromClause() || {}).tableList || []
        })
    }

    exitSelectItemList(ctx) {
        const isAllSelected = ctx.MULT_OPERATOR();
        const items = ctx.selectItem() || [];
        ctx.fields = items.map(item => {
            if (!item.identifier && !item.alias) {
                return;
            }

            const { name, tableName, schemaName, databaseName } = getNameObject(item.identifier);

            return {
                name,
                tableName,
                schemaName,
                databaseName,
                originalName: item.originalName,
                identifier: item.identifier,
                alias: item.alias,
                fieldReferences: item.fieldReferences,
            };
        }).filter(Boolean);
        if (isAllSelected) {
            ctx.fields = [ { identifier: ['*'] }, ...ctx.fields ];
        }
    }

    exitSelectItem(ctx) {
        const tableWildContext = ctx.qualifiedIdentifier();
        ctx.alias = (ctx.selectAlias() || {}).alias;
        if (tableWildContext) {
            ctx.identifier = tableWildContext.identifier;
            ctx.originalName = tableWildContext.originalName;
            return;
        }

        ctx.fieldReferences = ctx.expr().fieldReferences;
    }

    enterExpr(ctx) {
        if (!this.expressionState) {
            this.fieldReferences = [];
            this.expressionState = ctx.invokingState;
        }
    }

    exitExpr(ctx) {
        if (this.expressionState === ctx.invokingState) {
            ctx.fieldReferences = this.fieldReferences;
            this.fieldReferences = [];
            this.expressionState = null;
        }
    }

    exitSelectAlias(ctx) {
        ctx.alias = removeQuotes((ctx.identifier() || ctx.textStringLiteral()).getText());
    }

    exitTableWild(ctx) {
        const { identifier, originalName } = ctx.qualifiedIdentifier();

        ctx.identifier = identifier;
        ctx.originalName = originalName;
    }

    exitQualifiedIdentifier(ctx) {
        const identifier = ctx.identifier().map(ctx => ctx.getText()) || [];

        ctx.originalName = identifier[identifier.length - 1];
        ctx.identifier = identifier.map(removeQuotes);
        this.fieldReferences.push(ctx.originalName);
    }

    exitFromClause(ctx) {
        ctx.tableList = (ctx.tableReferenceList() || {}).tableList || [];
    }

    exitTableReferenceList(ctx) {
        ctx.tableList = ctx.tableReference().flatMap(tableReferenceContext => tableReferenceContext.tables);
    }

    exitTableReference(ctx) {
        ctx.tables = (ctx.tableFactor() || ctx.escapedTableReference()).tables

        const joinedTables = ctx.joinedTable() || [];

        ctx.tables = [ ...ctx.tables, ...joinedTables.flatMap(tableReferenceContext => tableReferenceContext.tables)]
    }

    exitJoinedTable(ctx) {
        ctx.tables = (ctx.tableReference() || ctx.tableFactor()).tables;
    }

    exitEscapedTableReference(ctx) {
        ctx.tables = ctx.tableFactor().tables;
        const joinedTables = ctx.joinedTable() || [];

        ctx.tables = [ ...ctx.tables, ...joinedTables.flatMap(tableReferenceContext => tableReferenceContext.tables)];
    }   

    exitTableFactor(ctx) {
        const tableData = ctx.singleTable() || ctx.singleTableParens();
        if (tableData) {
            ctx.tables = [ { table: tableData.table, alias: tableData.alias, originalName: tableData.originalName } ];
            return;
        }

        const tablesData = ctx.tableReferenceListParens();
        if (!tablesData) {
            ctx.tables = [];
            return;
        }

        ctx.tables = tablesData.tableList;
    }

    exitSingleTable(ctx) {
        const { originalName, identifier } = ctx.qualifiedIdentifier();
        ctx.table = identifier;
        ctx.originalName = originalName;
        ctx.alias = (ctx.tableAlias() || {}).alias;
    }

    exitSingleTableParens(ctx) {
        const tableData = ctx.singleTable() || ctx.singleTableParens();
        ctx.table = tableData.table;
        ctx.alias = tableData.alias;
        ctx.originalName = tableData.originalName;
    }

    exitTableReferenceListParens(ctx) {
        const tablesData = ctx.tableReferenceList() || ctx.tableReferenceListParens();
        ctx.tableList = tablesData.tableList;
    }

    exitTableAlias(ctx) {
        ctx.alias = removeQuotes(ctx.identifier().getText());
    }

};

const removeQuotes = str => {
    if (!str) {
        return '';
    }

    if (/^\[.*\]$|^(`|'|").*\1$/.test(str)) {
        return str.slice(1, -1);
    }

    return str;
};

const getNameObject = identifier => {
    if (!Array.isArray(identifier)) {
        return '';
    }

	const IDENTIFIER_NAMES = ['name', 'tableName', 'schemaName', 'databaseName'];

	return identifier.reverse().reduce(
		(nameObject, name, index) => ({
			...nameObject,
			[IDENTIFIER_NAMES[index]]: name,
		}),
		{},
	);
};

module.exports = Listener;