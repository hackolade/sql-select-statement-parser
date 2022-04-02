const simple = {
    selectItems: [{
        name: "column",
        originalName: "column",
        identifier: ["column"],
    }],
    from: [{
        table: [ "table" ],
        originalName: "table",
    }],
};

const star = {
    selectItems: [{
        identifier: ["*"]
    }],
    from: [{
        table: ["table"],
        originalName: "table",
    }],
};

const aliases = {
    selectItems: [{
        name: "column",
        originalName: "column",
        identifier: ["column"],
        alias: "columnAlias"
    }],
    from: [{
        table: ["table"],
        alias: "tableAlias",
        originalName: "table",
    }],
};

const starWithTable = {
    selectItems: [{
        name: "*",
        tableName: "table",
        originalName: "*",
        identifier: ["*", "table"],
    }],
    from: [{
        table: ["table"],
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
        identifier: [
          "column",
          "table",
          "schema",
          "database",
        ],
    }],
    from: [{
        table: [
          "database",
          "schema",
          "table",
        ],
        originalName: "table",
    }],
};

const singleQuotes = {
    selectItems: [{
        name: "column",
        tableName: "table",
        originalName: "'column'",
        identifier: ["column", "table"]
    }],
    from: [{
        table: ["schema", "table"],
        originalName: "'table'",
    }],
};

const doubleQuotes = {
    selectItems: [{
        name: "column",
        tableName: "table",
        originalName: '"column"',
        identifier: ["column", "table"]
    }],
    from: [{
        table: ["schema", "table"],
        originalName: '"table"',
    }],
};

const backtickQuotes = {
    selectItems: [{
        name: "column",
        tableName: "table",
        originalName: "`column`",
        identifier: ["column", "table"]
    }],
    from: [{
        table: ["schema", "table"],
        originalName: "`table`",
    }],
};

const squareBrackets = {
    selectItems: [{
        name: "column",
        tableName: "table",
        originalName: "[column]",
        identifier: ["column", "table"]
    }],
    from: [{
        table: ["schema", "table"],
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
        fieldReferences: ["column2", "'ID'"],
    }],
    from: [{
        table: ["table"],
        originalName: "table",
    }],
};

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
};