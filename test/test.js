const assert = require('assert');
const parseSelectStatement = require('../index.js');

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

const specifiedSchema = {
    selectItems: [
      {
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
        ]
      },
    ],
    from: [
      {
        table: [
          "database",
          "schema",
          "table",
        ],
        originalName: "table",
      },
    ],
};

describe('Parsing of primitive SELECT statements', () => {
    it('should parse primitive SELECT statement', () => {
        const result = parseSelectStatement('SELECT column FROM table');
        assert.deepEqual(simple, filterUndefinedProperties(result));
    });
    it('should parse statement with specified database.schema.table', () => {
        const result = parseSelectStatement('SELECT database.schema.table.column FROM database.schema.table');
        assert.deepEqual(specifiedSchema, filterUndefinedProperties(result));
    });
});

describe('Parse SQL SELECT statements', () => {   
    it('should parse SELECT * queries', () => {
        const result = parseSelectStatement('SELECT * FROM table');
        assert.deepEqual(star, filterUndefinedProperties(result));
    });

    it('should parse SELECT table.* queries', () => {
        const result = parseSelectStatement('SELECT table.* FROM table');
        assert.deepEqual(star, filterUndefinedProperties(result));
    });
});

const filterUndefinedProperties = object => JSON.parse(JSON.stringify(object));
