# SELECT statement SQL parser

Dialect-agnostic parser of SQL SELECT statements.

Function parseSelectStatement accepts SQL SELECT statement of different SQL dialects (MySQL, Oracle, PostgreSQL, T-SQL, Snowflake, etc.) and returns object describing columns and tables names used in the query.

## Installation
```
npm install @hackolade/sql-select-statement-parser
```

## Usage
```javascript
const result = parseSelectStatement(`
    SELECT "database".'schema'.table.[column] AS columnAlias
    FROM database.schema.table AS tableAlias;
`);
```

## Result structure
```javascript
{
    selectItems: [{                     // array of selected columns and expressions
        name: "column",                 // column name or *
        tableName: "table",             // table name
        schemaName: "schema",           // schema name (or database name for some dialects)
        databaseName: "database",       // database name (if schema also exists in the dialect)
        originalName: "[column]",       // original column name including quotes
                                        // (or square brackets for T-SQL)
        alias: "columnAlias",           // column alias
        fieldReferences: ["column"],    // List of column names used in expression.
                                        // Appears only when selected item is
                                        // described by expression. 
    }],
    from: [{                            // array of tables described in a FROM clause
        table: "table",                 // table name
        schemaName: "schema",           // schema name (or database name for some dialects)
        databaseName: "database",       // database name (if schema also exists in the dialect)
        alias: "tableAlias",            // table alias
        originalName: "`table`",        // original table name including quotes
                                        //(or square brackets for T-SQL)
    }]
}
```

## License
[MIT](LICENSE)
