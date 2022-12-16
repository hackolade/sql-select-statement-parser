const simple = {
    selectItems: [{
        name: "column",
        originalName: "column",
    }],
    from: [{
        table: "table",
        originalName: "table",
    }],
};

const star = {
    selectItems: [{
        name: "*"
    }],
    from: [{
        table: "table",
        originalName: "table",
    }],
};

const aliases = {
    selectItems: [{
        name: "column",
        originalName: "column",
        alias: "columnAlias"
    }],
    from: [{
        table: "table",
        alias: "tableAlias",
        originalName: "table",
    }],
};

const starWithTable = {
    selectItems: [{
        name: "*",
        tableName: "table",
        originalName: "*",
    }],
    from: [{
        table: "table",
        originalName: "table",
    }],
};

const specifiedSchema = {
    selectItems: [{
        name: "column",
        tableName: "table",
        schemaName: "schema",
        databaseName: "database",
        originalName: "column",
    }],
    from: [{
        table: "table",
        schemaName: "schema",
        databaseName: "database",
        originalName: "table",
    }],
};

const singleQuotes = {
    selectItems: [{
        name: "column",
        tableName: "table",
        originalName: "'column'",
    }],
    from: [{
        table: "table",
        schemaName: "schema",
        originalName: "'table'",
    }],
};

const doubleQuotes = {
    selectItems: [{
        name: "column",
        tableName: "table",
        originalName: '"column"',
    }],
    from: [{
        table: "table",
        schemaName: "schema",
        originalName: '"table"',
    }],
};

const backtickQuotes = {
    selectItems: [{
        name: "column",
        tableName: "table",
        originalName: "`column`",
    }],
    from: [{
        table: "table",
        schemaName: "schema",
        originalName: "`table`",
    }],
};

const squareBrackets = {
    selectItems: [{
        name: "column",
        tableName: "table",
        originalName: "[column]",
    }],
    from: [{
        table: "table",
        schemaName: "schema",
        originalName: "[table]",
    }],
};

const functions = {
    selectItems: [{
        alias: "alias1",
        fieldReferences: ["column1"],
    },
    {
        alias: "alias2",
        fieldReferences: ["column2", "ID"],
    }],
    from: [{
        table: "table",
        originalName: "table",
    }],
};

const generatedNullColumn = {
    selectItems: [{
        alias: "test",
    }],
    from: [{
        table: "tbl",
        originalName: "tbl",
    }],
}

const functionWithDistinct = {
    from: [
        {
            originalName: 'original_tbl',
            table: 'original_tbl',
        },
    ],
    selectItems: [
        {
            alias: 'test_agg_dist',
            fieldReferences: ['id'],
        },
    ],
};

const characterVarying = {
    selectItems: [
        {
            "alias": "varying_test"
        }
    ],
    from: [{
        table: "tbl",
        originalName: "tbl",
    }]
}

module.exports = {
    simple,
    star,
    aliases,
    starWithTable,
    specifiedSchema,
    singleQuotes,
    doubleQuotes,
    backtickQuotes,
    squareBrackets,
    functions,
    generatedNullColumn,
    functionWithDistinct,
    characterVarying,
};