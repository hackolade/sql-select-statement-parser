const assert = require('assert');
const parseSelectStatement = require('../index');

const {
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
} = require('./results');

describe('Parsing of primitive SELECT statements', () => {
    it('should parse primitive SELECT statement', () => {
        const result = parseSelectStatement('SELECT column FROM table');
        assert.deepEqual(simple, filterUndefinedProperties(result));
    });
    it('should parse SELECT statement with aliases', () => {
        const result = parseSelectStatement('SELECT column as columnAlias FROM table as tableAlias');
        assert.deepEqual(aliases, filterUndefinedProperties(result));
    });
    it('should parse statement with specified database.schema.table', () => {
        const result = parseSelectStatement('SELECT database.schema.table.column FROM database.schema.table');
        assert.deepEqual(specifiedSchema, filterUndefinedProperties(result));
    });
});

describe('Parsing of SELECT * statements', () => {   
    it('should parse SELECT * queries', () => {
        const result = parseSelectStatement('SELECT * FROM table');
        assert.deepEqual(star, filterUndefinedProperties(result));
    });
    it('should parse SELECT table.* queries', () => {
        const result = parseSelectStatement('SELECT table.* FROM table');
        assert.deepEqual(starWithTable, filterUndefinedProperties(result));
    });
});

describe('Parsing of SELECT statements with quotes from different dialects', () => {
    it('should parse statement with single quotes (MySQL-like)', () => {
        const result = parseSelectStatement("SELECT 'table'.'column' FROM 'schema'.'table'");
        assert.deepEqual(singleQuotes, filterUndefinedProperties(result));
    });
    it('should parse statement with double quotes (PostgreSQL-like)', () => {
        const result = parseSelectStatement('SELECT "table"."column" FROM "schema"."table"');
        assert.deepEqual(doubleQuotes, filterUndefinedProperties(result));
    });
    it('should parse statement with backtick quotes (MySQL-like)', () => {
        const result = parseSelectStatement('SELECT `table`.`column` FROM `schema`.`table`');
        assert.deepEqual(backtickQuotes, filterUndefinedProperties(result));
    });
    it('should parse statement with square brackets (MSSQL-like)', () => {
        const result = parseSelectStatement('SELECT [table].[column] FROM [schema].[table]');
        assert.deepEqual(squareBrackets, filterUndefinedProperties(result));
    });
});

describe('Parsing of complex SELECT statements', () => {
     it('should parse statement with "WITH" predicate', () => {
        const result = parseSelectStatement('WITH f AS (SELECT columnWith FROM tableWith) SELECT column from table');
        assert.deepEqual(simple, filterUndefinedProperties(result));
    });
    it('should parse statement with functions', () => {
        const result = parseSelectStatement(`SELECT
            array_agg(table.column1) AS alias1,
            (to_char(column2, 'ID'::text))::integer AS alias2
            from table`);
        assert.deepEqual(functions, filterUndefinedProperties(result));
    });
});

const filterUndefinedProperties = object => JSON.parse(JSON.stringify(object));
