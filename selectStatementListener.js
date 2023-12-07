const SQLSelectParserListener = require('./parser/SQLSelectParserListener');

class Listener extends SQLSelectParserListener {
    constructor() {
        super();

        this.result = null;

        this.fieldReferences = [];
        this.expressionState = null;
    }

    getResult() {
        return this.result;
    }

    setResult(result) {
        this.result = result;
    }

    isAllSelected(selectItems) {
        return selectItems?.[0]?.name === '*';
    }

    exitQuerySpecification(ctx) {
        const selectItems = ctx.selectItemList().fields || [];

        if (this.result && this.isAllSelected(selectItems)) {
            return;
        }

        this.setResult({
            selectItems: ctx.selectItemList().fields || [],
            from: (ctx.fromClause() || {}).tableList || []
        })
    }

    exitSelectItemList(ctx) {
        const isAllSelected = ctx.MULT_OPERATOR();
        const items = ctx.selectItem() || [];
        ctx.fields = items.map(item => {
            const { name, tableName, schemaName, databaseName } = getNameObject(item.identifier);

            return {
                name,
                tableName,
                schemaName,
                databaseName,
                originalName: item.originalName,
                alias: item.alias,
                fieldReferences: getFieldReferences(item.fieldReferences)
            };
        }).filter(Boolean);
        if (isAllSelected) {
            ctx.fields = [{ name: '*' }, ...ctx.fields];
        }
    }

    exitSelectItem(ctx) {
        const tableWildContext = ctx.qualifiedIdentifier() || ctx.jsonPathIdentifier();
        ctx.alias = (ctx.selectAlias() || {}).alias;
        if (tableWildContext) {
            ctx.identifier = tableWildContext.identifier;
            ctx.originalName = tableWildContext.originalName;
            return;
        }

        ctx.fieldReferences = ctx.expr().fieldReferences;
    }

    exitJsonPathIdentifier(ctx) {
        const identifiers = ctx.identifier();
        const fullTableName = ctx.qualifiedIdentifier().identifier;

        let identifier = identifiers.map(ctx => ctx.getText()) || [];
        ctx.originalName = identifier.join('.');
        ctx.identifier = [...fullTableName, identifier[identifier.length - 1]].map(removeQuotes);

        if (identifiers.some(ctx => ctx.identifierKeyword?.()?.NULL_SYMBOL() || ctx.identifierKeyword?.()?.DISTINCT_SYMBOL())) return;
        this.fieldReferences.push(ctx.identifier[ctx.identifier.length - 1]);
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
        const identifiers = ctx.identifier();
        let identifier = identifiers.map(ctx => ctx.getText()) || [];
        if (ctx.MULT_OPERATOR()) {
            identifier.push('*');
        }

        ctx.originalName = identifier[identifier.length - 1];
        ctx.identifier = identifier.map(removeQuotes);

        if (identifiers.some(ctx => ctx.identifierKeyword?.()?.NULL_SYMBOL() || ctx.identifierKeyword?.()?.DISTINCT_SYMBOL())) return;
        this.fieldReferences.push(ctx.identifier[ctx.identifier.length - 1]);
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

        ctx.tables = [...ctx.tables, ...joinedTables.flatMap(tableReferenceContext => tableReferenceContext.tables)]
    }

    exitJoinedTable(ctx) {
        ctx.tables = (ctx.tableReference() || ctx.tableFactor()).tables;
    }

    exitEscapedTableReference(ctx) {
        ctx.tables = ctx.tableFactor().tables;
        const joinedTables = ctx.joinedTable() || [];

        ctx.tables = [...ctx.tables, ...joinedTables.flatMap(tableReferenceContext => tableReferenceContext.tables)];
    }

    exitTableFactor(ctx) {
        const tableData = ctx.singleTable() || ctx.singleTableParens();
        if (tableData) {
            ctx.tables = [{
                table: tableData.table,
                schemaName: tableData.schemaName,
                databaseName: tableData.databaseName,
                originalName: tableData.originalName,
                alias: tableData.alias,
            }];
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
        const { tableName, schemaName, databaseName } = getNameObject([...(identifier || []), 'column']);

        ctx.table = tableName;
        ctx.schemaName = schemaName;
        ctx.databaseName = databaseName;
        ctx.originalName = originalName;
        ctx.alias = (ctx.tableAlias() || {}).alias;
    }

    exitSingleTableParens(ctx) {
        const tableData = ctx.singleTable() || ctx.singleTableParens();
        ctx.table = tableName;
        ctx.schemaName = schemaName;
        ctx.databaseName = databaseName;
        ctx.originalName = originalName;
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

const getFieldReferences = fieldReferences => {
    if (fieldReferences?.length > 0) {
        return fieldReferences;
    }
}

module.exports = Listener;