const SQLSelectParserListener = require('./parser/SQLSelectParserListener');

class Listener extends SQLSelectParserListener {
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
        ctx.fields = items.map(item => ({
            identifier: item.identifier,
            alias: item.alias
        }));
        if (isAllSelected) {
            ctx.fields = [ { identifier: ['*'] }, ...ctx.fields ];
        }
    }

    exitSelectItem(ctx) {
        const tableWildContext = ctx.qualifiedIdentifier();
        if (tableWildContext) {
            ctx.identifier = tableWildContext.identifier;
        }

        ctx.alias = (ctx.selectAlias() || {}).alias;
    }

    exitSelectAlias(ctx) {
        ctx.alias = removeQuotes((ctx.identifier() || ctx.textStringLiteral()).getText());
    }

    exitTableWild(ctx) {
        ctx.identifier = ctx.qualifiedIdentifier().identifier;
    }

    exitQualifiedIdentifier(ctx) {
        ctx.identifier = ctx.getText().split('.').map(removeQuotes);
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
            ctx.tables = [ { table: tableData.table, alias: tableData.alias } ];
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
        ctx.table = ctx.qualifiedIdentifier().identifier;
        ctx.alias = (ctx.tableAlias() || {}).alias;
    }

    exitTableParens(ctx) {
        const tableData = ctx.singleTable() || ctx.singleTableParens();
        ctx.table = tableData.table;
        ctx.alias = tableData.alias;
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
}

module.exports = Listener;
