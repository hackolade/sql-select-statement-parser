const antlr4 = require('antlr4');
const SQLSelectLexer = require('./parser/SQLSelectLexer');
const SQLSelectParser = require('./parser/SQLSelectParser');
const selectStatementListener = require('./selectStatementListener.js');

const parseSelectStatement = (sql, logger) => {
	const chars = new antlr4.InputStream(sql);
	const lexer = new SQLSelectLexer(chars);

	const tokens = new antlr4.CommonTokenStream(lexer);
	const parser = new SQLSelectParser(tokens);

	parser.removeErrorListeners();
	class ExprErrorListener extends antlr4.error.ErrorListener {
		syntaxError(recognizer, offendingSymbol, line, column, msg) {
			const error = `line ${line}:${column} ${msg}`;
			if (!logger) {
				// eslint-disable-next-line no-console
				console.log(new Error(error));
			} else {
				logger(error);
			}
		}
	}

	parser.addErrorListener(new ExprErrorListener());
	const tree = parser.query();

	const listener = new selectStatementListener(parser);
	antlr4.tree.ParseTreeWalker.DEFAULT.walk(listener, tree);

	return listener.getResult();
};

module.exports = parseSelectStatement;
