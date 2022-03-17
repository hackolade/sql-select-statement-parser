// Generated from /home/mikhail/code/select-statement-sql-parser/grammars/SQLSelectParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLSelectParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUAL_OPERATOR=1, ASSIGN_OPERATOR=2, NULL_SAFE_EQUAL_OPERATOR=3, GREATER_OR_EQUAL_OPERATOR=4, 
		GREATER_THAN_OPERATOR=5, LESS_OR_EQUAL_OPERATOR=6, LESS_THAN_OPERATOR=7, 
		NOT_EQUAL_OPERATOR=8, PLUS_OPERATOR=9, MINUS_OPERATOR=10, MULT_OPERATOR=11, 
		DIV_OPERATOR=12, MOD_OPERATOR=13, LOGICAL_NOT_OPERATOR=14, BITWISE_NOT_OPERATOR=15, 
		SHIFT_LEFT_OPERATOR=16, SHIFT_RIGHT_OPERATOR=17, LOGICAL_AND_OPERATOR=18, 
		BITWISE_AND_OPERATOR=19, BITWISE_XOR_OPERATOR=20, LOGICAL_OR_OPERATOR=21, 
		BITWISE_OR_OPERATOR=22, DOT_SYMBOL=23, COMMA_SYMBOL=24, SEMICOLON_SYMBOL=25, 
		COLON_SYMBOL=26, OPEN_PAR_SYMBOL=27, CLOSE_PAR_SYMBOL=28, OPEN_CURLY_SYMBOL=29, 
		CLOSE_CURLY_SYMBOL=30, UNDERLINE_SYMBOL=31, OPEN_BRACKET_SYMBOL=32, CLOSE_BRACKET_SYMBOL=33, 
		JSON_SEPARATOR_SYMBOL=34, JSON_UNQUOTED_SEPARATOR_SYMBOL=35, AT_SIGN_SYMBOL=36, 
		AT_TEXT_SUFFIX=37, AT_AT_SIGN_SYMBOL=38, NULL2_SYMBOL=39, PARAM_MARKER=40, 
		HEX_NUMBER=41, BIN_NUMBER=42, INT_NUMBER=43, DECIMAL_NUMBER=44, FLOAT_NUMBER=45, 
		TINYINT_SYMBOL=46, SMALLINT_SYMBOL=47, MEDIUMINT_SYMBOL=48, INT_SYMBOL=49, 
		BIGINT_SYMBOL=50, SECOND_SYMBOL=51, MINUTE_SYMBOL=52, HOUR_SYMBOL=53, 
		DAY_SYMBOL=54, WEEK_SYMBOL=55, MONTH_SYMBOL=56, QUARTER_SYMBOL=57, YEAR_SYMBOL=58, 
		DEFAULT_SYMBOL=59, UNION_SYMBOL=60, SELECT_SYMBOL=61, ALL_SYMBOL=62, DISTINCT_SYMBOL=63, 
		STRAIGHT_JOIN_SYMBOL=64, HIGH_PRIORITY_SYMBOL=65, SQL_SMALL_RESULT_SYMBOL=66, 
		SQL_BIG_RESULT_SYMBOL=67, SQL_BUFFER_RESULT_SYMBOL=68, SQL_CALC_FOUND_ROWS_SYMBOL=69, 
		LIMIT_SYMBOL=70, OFFSET_SYMBOL=71, INTO_SYMBOL=72, OUTFILE_SYMBOL=73, 
		DUMPFILE_SYMBOL=74, PROCEDURE_SYMBOL=75, ANALYSE_SYMBOL=76, HAVING_SYMBOL=77, 
		WINDOW_SYMBOL=78, AS_SYMBOL=79, PARTITION_SYMBOL=80, BY_SYMBOL=81, ROWS_SYMBOL=82, 
		RANGE_SYMBOL=83, GROUPS_SYMBOL=84, UNBOUNDED_SYMBOL=85, PRECEDING_SYMBOL=86, 
		INTERVAL_SYMBOL=87, CURRENT_SYMBOL=88, ROW_SYMBOL=89, BETWEEN_SYMBOL=90, 
		AND_SYMBOL=91, FOLLOWING_SYMBOL=92, EXCLUDE_SYMBOL=93, GROUP_SYMBOL=94, 
		TIES_SYMBOL=95, NO_SYMBOL=96, OTHERS_SYMBOL=97, WITH_SYMBOL=98, RECURSIVE_SYMBOL=99, 
		ROLLUP_SYMBOL=100, CUBE_SYMBOL=101, ORDER_SYMBOL=102, ASC_SYMBOL=103, 
		DESC_SYMBOL=104, FROM_SYMBOL=105, DUAL_SYMBOL=106, VALUES_SYMBOL=107, 
		TABLE_SYMBOL=108, SQL_NO_CACHE_SYMBOL=109, SQL_CACHE_SYMBOL=110, MAX_STATEMENT_TIME_SYMBOL=111, 
		FOR_SYMBOL=112, OF_SYMBOL=113, LOCK_SYMBOL=114, IN_SYMBOL=115, SHARE_SYMBOL=116, 
		MODE_SYMBOL=117, UPDATE_SYMBOL=118, SKIP_SYMBOL=119, LOCKED_SYMBOL=120, 
		NOWAIT_SYMBOL=121, WHERE_SYMBOL=122, OJ_SYMBOL=123, ON_SYMBOL=124, USING_SYMBOL=125, 
		NATURAL_SYMBOL=126, INNER_SYMBOL=127, JOIN_SYMBOL=128, LEFT_SYMBOL=129, 
		RIGHT_SYMBOL=130, OUTER_SYMBOL=131, CROSS_SYMBOL=132, LATERAL_SYMBOL=133, 
		JSON_TABLE_SYMBOL=134, COLUMNS_SYMBOL=135, ORDINALITY_SYMBOL=136, EXISTS_SYMBOL=137, 
		PATH_SYMBOL=138, NESTED_SYMBOL=139, EMPTY_SYMBOL=140, ERROR_SYMBOL=141, 
		NULL_SYMBOL=142, USE_SYMBOL=143, FORCE_SYMBOL=144, IGNORE_SYMBOL=145, 
		KEY_SYMBOL=146, INDEX_SYMBOL=147, PRIMARY_SYMBOL=148, IS_SYMBOL=149, TRUE_SYMBOL=150, 
		FALSE_SYMBOL=151, UNKNOWN_SYMBOL=152, NOT_SYMBOL=153, XOR_SYMBOL=154, 
		OR_SYMBOL=155, ANY_SYMBOL=156, MEMBER_SYMBOL=157, SOUNDS_SYMBOL=158, LIKE_SYMBOL=159, 
		ESCAPE_SYMBOL=160, REGEXP_SYMBOL=161, DIV_SYMBOL=162, MOD_SYMBOL=163, 
		MATCH_SYMBOL=164, AGAINST_SYMBOL=165, BINARY_SYMBOL=166, CAST_SYMBOL=167, 
		ARRAY_SYMBOL=168, CASE_SYMBOL=169, END_SYMBOL=170, CONVERT_SYMBOL=171, 
		COLLATE_SYMBOL=172, AVG_SYMBOL=173, BIT_AND_SYMBOL=174, BIT_OR_SYMBOL=175, 
		BIT_XOR_SYMBOL=176, COUNT_SYMBOL=177, MIN_SYMBOL=178, MAX_SYMBOL=179, 
		STD_SYMBOL=180, VARIANCE_SYMBOL=181, STDDEV_SAMP_SYMBOL=182, VAR_SAMP_SYMBOL=183, 
		SUM_SYMBOL=184, GROUP_CONCAT_SYMBOL=185, SEPARATOR_SYMBOL=186, GROUPING_SYMBOL=187, 
		ROW_NUMBER_SYMBOL=188, RANK_SYMBOL=189, DENSE_RANK_SYMBOL=190, CUME_DIST_SYMBOL=191, 
		PERCENT_RANK_SYMBOL=192, NTILE_SYMBOL=193, LEAD_SYMBOL=194, LAG_SYMBOL=195, 
		FIRST_VALUE_SYMBOL=196, LAST_VALUE_SYMBOL=197, NTH_VALUE_SYMBOL=198, FIRST_SYMBOL=199, 
		LAST_SYMBOL=200, OVER_SYMBOL=201, RESPECT_SYMBOL=202, NULLS_SYMBOL=203, 
		JSON_ARRAYAGG_SYMBOL=204, JSON_OBJECTAGG_SYMBOL=205, BOOLEAN_SYMBOL=206, 
		LANGUAGE_SYMBOL=207, QUERY_SYMBOL=208, EXPANSION_SYMBOL=209, CHAR_SYMBOL=210, 
		CURRENT_USER_SYMBOL=211, DATE_SYMBOL=212, INSERT_SYMBOL=213, TIME_SYMBOL=214, 
		TIMESTAMP_SYMBOL=215, USER_SYMBOL=216, ADDDATE_SYMBOL=217, SUBDATE_SYMBOL=218, 
		CURDATE_SYMBOL=219, CURTIME_SYMBOL=220, DATE_ADD_SYMBOL=221, DATE_SUB_SYMBOL=222, 
		EXTRACT_SYMBOL=223, GET_FORMAT_SYMBOL=224, NOW_SYMBOL=225, POSITION_SYMBOL=226, 
		SYSDATE_SYMBOL=227, TIMESTAMP_ADD_SYMBOL=228, TIMESTAMP_DIFF_SYMBOL=229, 
		UTC_DATE_SYMBOL=230, UTC_TIME_SYMBOL=231, UTC_TIMESTAMP_SYMBOL=232, ASCII_SYMBOL=233, 
		CHARSET_SYMBOL=234, COALESCE_SYMBOL=235, COLLATION_SYMBOL=236, DATABASE_SYMBOL=237, 
		IF_SYMBOL=238, FORMAT_SYMBOL=239, MICROSECOND_SYMBOL=240, OLD_PASSWORD_SYMBOL=241, 
		PASSWORD_SYMBOL=242, REPEAT_SYMBOL=243, REPLACE_SYMBOL=244, REVERSE_SYMBOL=245, 
		ROW_COUNT_SYMBOL=246, TRUNCATE_SYMBOL=247, WEIGHT_STRING_SYMBOL=248, CONTAINS_SYMBOL=249, 
		GEOMETRYCOLLECTION_SYMBOL=250, LINESTRING_SYMBOL=251, MULTILINESTRING_SYMBOL=252, 
		MULTIPOINT_SYMBOL=253, MULTIPOLYGON_SYMBOL=254, POINT_SYMBOL=255, POLYGON_SYMBOL=256, 
		LEVEL_SYMBOL=257, DATETIME_SYMBOL=258, TRIM_SYMBOL=259, LEADING_SYMBOL=260, 
		TRAILING_SYMBOL=261, BOTH_SYMBOL=262, SUBSTRING_SYMBOL=263, WHEN_SYMBOL=264, 
		THEN_SYMBOL=265, ELSE_SYMBOL=266, SIGNED_SYMBOL=267, UNSIGNED_SYMBOL=268, 
		DECIMAL_SYMBOL=269, JSON_SYMBOL=270, FLOAT_SYMBOL=271, SET_SYMBOL=272, 
		SECOND_MICROSECOND_SYMBOL=273, MINUTE_MICROSECOND_SYMBOL=274, MINUTE_SECOND_SYMBOL=275, 
		HOUR_MICROSECOND_SYMBOL=276, HOUR_SECOND_SYMBOL=277, HOUR_MINUTE_SYMBOL=278, 
		DAY_MICROSECOND_SYMBOL=279, DAY_SECOND_SYMBOL=280, DAY_MINUTE_SYMBOL=281, 
		DAY_HOUR_SYMBOL=282, YEAR_MONTH_SYMBOL=283, BTREE_SYMBOL=284, RTREE_SYMBOL=285, 
		HASH_SYMBOL=286, REAL_SYMBOL=287, DOUBLE_SYMBOL=288, PRECISION_SYMBOL=289, 
		NUMERIC_SYMBOL=290, FIXED_SYMBOL=291, BIT_SYMBOL=292, BOOL_SYMBOL=293, 
		VARYING_SYMBOL=294, VARCHAR_SYMBOL=295, NATIONAL_SYMBOL=296, NVARCHAR_SYMBOL=297, 
		NCHAR_SYMBOL=298, VARBINARY_SYMBOL=299, TINYBLOB_SYMBOL=300, BLOB_SYMBOL=301, 
		MEDIUMBLOB_SYMBOL=302, LONGBLOB_SYMBOL=303, LONG_SYMBOL=304, TINYTEXT_SYMBOL=305, 
		TEXT_SYMBOL=306, MEDIUMTEXT_SYMBOL=307, LONGTEXT_SYMBOL=308, ENUM_SYMBOL=309, 
		SERIAL_SYMBOL=310, GEOMETRY_SYMBOL=311, ZEROFILL_SYMBOL=312, BYTE_SYMBOL=313, 
		UNICODE_SYMBOL=314, TERMINATED_SYMBOL=315, OPTIONALLY_SYMBOL=316, ENCLOSED_SYMBOL=317, 
		ESCAPED_SYMBOL=318, LINES_SYMBOL=319, STARTING_SYMBOL=320, GLOBAL_SYMBOL=321, 
		LOCAL_SYMBOL=322, SESSION_SYMBOL=323, WHITESPACE=324, INVALID_INPUT=325, 
		UNDERSCORE_CHARSET=326, IDENTIFIER=327, NCHAR_TEXT=328, BACK_TICK_QUOTED_ID=329, 
		DOUBLE_QUOTED_TEXT=330, SINGLE_QUOTED_TEXT=331, BRACKET_QUOTED_TEXT=332, 
		VERSION_COMMENT_START=333, MYSQL_COMMENT_START=334, VERSION_COMMENT_END=335, 
		BLOCK_COMMENT=336, POUND_COMMENT=337, DASHDASH_COMMENT=338;
	public static final int
		RULE_query = 0, RULE_values = 1, RULE_selectStatement = 2, RULE_selectStatementWithInto = 3, 
		RULE_queryExpression = 4, RULE_queryExpressionBody = 5, RULE_queryExpressionParens = 6, 
		RULE_queryPrimary = 7, RULE_querySpecification = 8, RULE_subquery = 9, 
		RULE_querySpecOption = 10, RULE_limitClause = 11, RULE_limitOptions = 12, 
		RULE_limitOption = 13, RULE_intoClause = 14, RULE_procedureAnalyseClause = 15, 
		RULE_havingClause = 16, RULE_windowClause = 17, RULE_windowDefinition = 18, 
		RULE_windowSpec = 19, RULE_windowSpecDetails = 20, RULE_windowFrameClause = 21, 
		RULE_windowFrameUnits = 22, RULE_windowFrameExtent = 23, RULE_windowFrameStart = 24, 
		RULE_windowFrameBetween = 25, RULE_windowFrameBound = 26, RULE_windowFrameExclusion = 27, 
		RULE_withClause = 28, RULE_commonTableExpression = 29, RULE_groupByClause = 30, 
		RULE_olapOption = 31, RULE_orderClause = 32, RULE_direction = 33, RULE_fromClause = 34, 
		RULE_tableReferenceList = 35, RULE_tableValueConstructor = 36, RULE_explicitTable = 37, 
		RULE_rowValueExplicit = 38, RULE_selectOption = 39, RULE_lockingClauseList = 40, 
		RULE_lockingClause = 41, RULE_lockStrengh = 42, RULE_lockedRowAction = 43, 
		RULE_selectItemList = 44, RULE_selectItem = 45, RULE_selectAlias = 46, 
		RULE_whereClause = 47, RULE_tableReference = 48, RULE_escapedTableReference = 49, 
		RULE_joinedTable = 50, RULE_naturalJoinType = 51, RULE_innerJoinType = 52, 
		RULE_outerJoinType = 53, RULE_tableFactor = 54, RULE_singleTable = 55, 
		RULE_singleTableParens = 56, RULE_derivedTable = 57, RULE_tableReferenceListParens = 58, 
		RULE_tableFunction = 59, RULE_columnsClause = 60, RULE_jtColumn = 61, 
		RULE_onEmptyOrError = 62, RULE_onEmpty = 63, RULE_onError = 64, RULE_jtOnResponse = 65, 
		RULE_unionOption = 66, RULE_tableAlias = 67, RULE_indexHintList = 68, 
		RULE_indexHint = 69, RULE_indexHintType = 70, RULE_keyOrIndex = 71, RULE_indexHintClause = 72, 
		RULE_indexList = 73, RULE_indexListElement = 74, RULE_expr = 75, RULE_boolPri = 76, 
		RULE_compOp = 77, RULE_predicate = 78, RULE_predicateOperations = 79, 
		RULE_bitExpr = 80, RULE_simpleExpr = 81, RULE_jsonOperator = 82, RULE_sumExpr = 83, 
		RULE_groupingOperation = 84, RULE_windowFunctionCall = 85, RULE_windowingClause = 86, 
		RULE_leadLagInfo = 87, RULE_nullTreatment = 88, RULE_jsonFunction = 89, 
		RULE_inSumExpr = 90, RULE_identListArg = 91, RULE_identList = 92, RULE_fulltextOptions = 93, 
		RULE_runtimeFunctionCall = 94, RULE_geometryFunction = 95, RULE_timeFunctionParameters = 96, 
		RULE_fractionalPrecision = 97, RULE_weightStringLevels = 98, RULE_weightStringLevelListItem = 99, 
		RULE_dateTimeTtype = 100, RULE_trimFunction = 101, RULE_substringFunction = 102, 
		RULE_functionCall = 103, RULE_udfExprList = 104, RULE_udfExpr = 105, RULE_variable = 106, 
		RULE_userVariable = 107, RULE_systemVariable = 108, RULE_whenExpression = 109, 
		RULE_thenExpression = 110, RULE_elseExpression = 111, RULE_castType = 112, 
		RULE_exprList = 113, RULE_charset = 114, RULE_notRule = 115, RULE_not2Rule = 116, 
		RULE_interval = 117, RULE_intervalTimeStamp = 118, RULE_exprListWithParentheses = 119, 
		RULE_exprWithParentheses = 120, RULE_simpleExprWithParentheses = 121, 
		RULE_orderList = 122, RULE_orderExpression = 123, RULE_indexType = 124, 
		RULE_dataType = 125, RULE_nchar = 126, RULE_realType = 127, RULE_fieldLength = 128, 
		RULE_fieldOptions = 129, RULE_charsetWithOptBinary = 130, RULE_ascii = 131, 
		RULE_unicode = 132, RULE_wsNumCodepoints = 133, RULE_typeDatetimePrecision = 134, 
		RULE_charsetName = 135, RULE_collationName = 136, RULE_collate = 137, 
		RULE_charsetClause = 138, RULE_fieldsClause = 139, RULE_fieldTerm = 140, 
		RULE_linesClause = 141, RULE_lineTerm = 142, RULE_usePartition = 143, 
		RULE_columnInternalRefList = 144, RULE_tableAliasRefList = 145, RULE_pureIdentifier = 146, 
		RULE_identifier = 147, RULE_identifierList = 148, RULE_identifierListWithParentheses = 149, 
		RULE_qualifiedIdentifier = 150, RULE_dotIdentifier = 151, RULE_ulong_number = 152, 
		RULE_real_ulong_number = 153, RULE_ulonglong_number = 154, RULE_real_ulonglong_number = 155, 
		RULE_literal = 156, RULE_stringList = 157, RULE_textStringLiteral = 158, 
		RULE_textString = 159, RULE_textLiteral = 160, RULE_numLiteral = 161, 
		RULE_boolLiteral = 162, RULE_nullLiteral = 163, RULE_temporalLiteral = 164, 
		RULE_floatOptions = 165, RULE_precision = 166, RULE_textOrIdentifier = 167, 
		RULE_parentheses = 168, RULE_equal = 169, RULE_varIdentType = 170, RULE_identifierKeyword = 171;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "values", "selectStatement", "selectStatementWithInto", "queryExpression", 
			"queryExpressionBody", "queryExpressionParens", "queryPrimary", "querySpecification", 
			"subquery", "querySpecOption", "limitClause", "limitOptions", "limitOption", 
			"intoClause", "procedureAnalyseClause", "havingClause", "windowClause", 
			"windowDefinition", "windowSpec", "windowSpecDetails", "windowFrameClause", 
			"windowFrameUnits", "windowFrameExtent", "windowFrameStart", "windowFrameBetween", 
			"windowFrameBound", "windowFrameExclusion", "withClause", "commonTableExpression", 
			"groupByClause", "olapOption", "orderClause", "direction", "fromClause", 
			"tableReferenceList", "tableValueConstructor", "explicitTable", "rowValueExplicit", 
			"selectOption", "lockingClauseList", "lockingClause", "lockStrengh", 
			"lockedRowAction", "selectItemList", "selectItem", "selectAlias", "whereClause", 
			"tableReference", "escapedTableReference", "joinedTable", "naturalJoinType", 
			"innerJoinType", "outerJoinType", "tableFactor", "singleTable", "singleTableParens", 
			"derivedTable", "tableReferenceListParens", "tableFunction", "columnsClause", 
			"jtColumn", "onEmptyOrError", "onEmpty", "onError", "jtOnResponse", "unionOption", 
			"tableAlias", "indexHintList", "indexHint", "indexHintType", "keyOrIndex", 
			"indexHintClause", "indexList", "indexListElement", "expr", "boolPri", 
			"compOp", "predicate", "predicateOperations", "bitExpr", "simpleExpr", 
			"jsonOperator", "sumExpr", "groupingOperation", "windowFunctionCall", 
			"windowingClause", "leadLagInfo", "nullTreatment", "jsonFunction", "inSumExpr", 
			"identListArg", "identList", "fulltextOptions", "runtimeFunctionCall", 
			"geometryFunction", "timeFunctionParameters", "fractionalPrecision", 
			"weightStringLevels", "weightStringLevelListItem", "dateTimeTtype", "trimFunction", 
			"substringFunction", "functionCall", "udfExprList", "udfExpr", "variable", 
			"userVariable", "systemVariable", "whenExpression", "thenExpression", 
			"elseExpression", "castType", "exprList", "charset", "notRule", "not2Rule", 
			"interval", "intervalTimeStamp", "exprListWithParentheses", "exprWithParentheses", 
			"simpleExprWithParentheses", "orderList", "orderExpression", "indexType", 
			"dataType", "nchar", "realType", "fieldLength", "fieldOptions", "charsetWithOptBinary", 
			"ascii", "unicode", "wsNumCodepoints", "typeDatetimePrecision", "charsetName", 
			"collationName", "collate", "charsetClause", "fieldsClause", "fieldTerm", 
			"linesClause", "lineTerm", "usePartition", "columnInternalRefList", "tableAliasRefList", 
			"pureIdentifier", "identifier", "identifierList", "identifierListWithParentheses", 
			"qualifiedIdentifier", "dotIdentifier", "ulong_number", "real_ulong_number", 
			"ulonglong_number", "real_ulonglong_number", "literal", "stringList", 
			"textStringLiteral", "textString", "textLiteral", "numLiteral", "boolLiteral", 
			"nullLiteral", "temporalLiteral", "floatOptions", "precision", "textOrIdentifier", 
			"parentheses", "equal", "varIdentType", "identifierKeyword"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "':='", "'<=>'", "'>='", "'>'", "'<='", "'<'", "'!='", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'!'", "'~'", "'<<'", "'>>'", "'&&'", "'&'", 
			"'^'", "'||'", "'|'", "'.'", "','", "';'", "':'", "'('", "')'", "'{'", 
			"'}'", "'_'", "'['", "']'", "'->'", "'->>'", "'@'", null, "'@@'", "'\\N'", 
			"'?'", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'/*!'", "'*/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUAL_OPERATOR", "ASSIGN_OPERATOR", "NULL_SAFE_EQUAL_OPERATOR", 
			"GREATER_OR_EQUAL_OPERATOR", "GREATER_THAN_OPERATOR", "LESS_OR_EQUAL_OPERATOR", 
			"LESS_THAN_OPERATOR", "NOT_EQUAL_OPERATOR", "PLUS_OPERATOR", "MINUS_OPERATOR", 
			"MULT_OPERATOR", "DIV_OPERATOR", "MOD_OPERATOR", "LOGICAL_NOT_OPERATOR", 
			"BITWISE_NOT_OPERATOR", "SHIFT_LEFT_OPERATOR", "SHIFT_RIGHT_OPERATOR", 
			"LOGICAL_AND_OPERATOR", "BITWISE_AND_OPERATOR", "BITWISE_XOR_OPERATOR", 
			"LOGICAL_OR_OPERATOR", "BITWISE_OR_OPERATOR", "DOT_SYMBOL", "COMMA_SYMBOL", 
			"SEMICOLON_SYMBOL", "COLON_SYMBOL", "OPEN_PAR_SYMBOL", "CLOSE_PAR_SYMBOL", 
			"OPEN_CURLY_SYMBOL", "CLOSE_CURLY_SYMBOL", "UNDERLINE_SYMBOL", "OPEN_BRACKET_SYMBOL", 
			"CLOSE_BRACKET_SYMBOL", "JSON_SEPARATOR_SYMBOL", "JSON_UNQUOTED_SEPARATOR_SYMBOL", 
			"AT_SIGN_SYMBOL", "AT_TEXT_SUFFIX", "AT_AT_SIGN_SYMBOL", "NULL2_SYMBOL", 
			"PARAM_MARKER", "HEX_NUMBER", "BIN_NUMBER", "INT_NUMBER", "DECIMAL_NUMBER", 
			"FLOAT_NUMBER", "TINYINT_SYMBOL", "SMALLINT_SYMBOL", "MEDIUMINT_SYMBOL", 
			"INT_SYMBOL", "BIGINT_SYMBOL", "SECOND_SYMBOL", "MINUTE_SYMBOL", "HOUR_SYMBOL", 
			"DAY_SYMBOL", "WEEK_SYMBOL", "MONTH_SYMBOL", "QUARTER_SYMBOL", "YEAR_SYMBOL", 
			"DEFAULT_SYMBOL", "UNION_SYMBOL", "SELECT_SYMBOL", "ALL_SYMBOL", "DISTINCT_SYMBOL", 
			"STRAIGHT_JOIN_SYMBOL", "HIGH_PRIORITY_SYMBOL", "SQL_SMALL_RESULT_SYMBOL", 
			"SQL_BIG_RESULT_SYMBOL", "SQL_BUFFER_RESULT_SYMBOL", "SQL_CALC_FOUND_ROWS_SYMBOL", 
			"LIMIT_SYMBOL", "OFFSET_SYMBOL", "INTO_SYMBOL", "OUTFILE_SYMBOL", "DUMPFILE_SYMBOL", 
			"PROCEDURE_SYMBOL", "ANALYSE_SYMBOL", "HAVING_SYMBOL", "WINDOW_SYMBOL", 
			"AS_SYMBOL", "PARTITION_SYMBOL", "BY_SYMBOL", "ROWS_SYMBOL", "RANGE_SYMBOL", 
			"GROUPS_SYMBOL", "UNBOUNDED_SYMBOL", "PRECEDING_SYMBOL", "INTERVAL_SYMBOL", 
			"CURRENT_SYMBOL", "ROW_SYMBOL", "BETWEEN_SYMBOL", "AND_SYMBOL", "FOLLOWING_SYMBOL", 
			"EXCLUDE_SYMBOL", "GROUP_SYMBOL", "TIES_SYMBOL", "NO_SYMBOL", "OTHERS_SYMBOL", 
			"WITH_SYMBOL", "RECURSIVE_SYMBOL", "ROLLUP_SYMBOL", "CUBE_SYMBOL", "ORDER_SYMBOL", 
			"ASC_SYMBOL", "DESC_SYMBOL", "FROM_SYMBOL", "DUAL_SYMBOL", "VALUES_SYMBOL", 
			"TABLE_SYMBOL", "SQL_NO_CACHE_SYMBOL", "SQL_CACHE_SYMBOL", "MAX_STATEMENT_TIME_SYMBOL", 
			"FOR_SYMBOL", "OF_SYMBOL", "LOCK_SYMBOL", "IN_SYMBOL", "SHARE_SYMBOL", 
			"MODE_SYMBOL", "UPDATE_SYMBOL", "SKIP_SYMBOL", "LOCKED_SYMBOL", "NOWAIT_SYMBOL", 
			"WHERE_SYMBOL", "OJ_SYMBOL", "ON_SYMBOL", "USING_SYMBOL", "NATURAL_SYMBOL", 
			"INNER_SYMBOL", "JOIN_SYMBOL", "LEFT_SYMBOL", "RIGHT_SYMBOL", "OUTER_SYMBOL", 
			"CROSS_SYMBOL", "LATERAL_SYMBOL", "JSON_TABLE_SYMBOL", "COLUMNS_SYMBOL", 
			"ORDINALITY_SYMBOL", "EXISTS_SYMBOL", "PATH_SYMBOL", "NESTED_SYMBOL", 
			"EMPTY_SYMBOL", "ERROR_SYMBOL", "NULL_SYMBOL", "USE_SYMBOL", "FORCE_SYMBOL", 
			"IGNORE_SYMBOL", "KEY_SYMBOL", "INDEX_SYMBOL", "PRIMARY_SYMBOL", "IS_SYMBOL", 
			"TRUE_SYMBOL", "FALSE_SYMBOL", "UNKNOWN_SYMBOL", "NOT_SYMBOL", "XOR_SYMBOL", 
			"OR_SYMBOL", "ANY_SYMBOL", "MEMBER_SYMBOL", "SOUNDS_SYMBOL", "LIKE_SYMBOL", 
			"ESCAPE_SYMBOL", "REGEXP_SYMBOL", "DIV_SYMBOL", "MOD_SYMBOL", "MATCH_SYMBOL", 
			"AGAINST_SYMBOL", "BINARY_SYMBOL", "CAST_SYMBOL", "ARRAY_SYMBOL", "CASE_SYMBOL", 
			"END_SYMBOL", "CONVERT_SYMBOL", "COLLATE_SYMBOL", "AVG_SYMBOL", "BIT_AND_SYMBOL", 
			"BIT_OR_SYMBOL", "BIT_XOR_SYMBOL", "COUNT_SYMBOL", "MIN_SYMBOL", "MAX_SYMBOL", 
			"STD_SYMBOL", "VARIANCE_SYMBOL", "STDDEV_SAMP_SYMBOL", "VAR_SAMP_SYMBOL", 
			"SUM_SYMBOL", "GROUP_CONCAT_SYMBOL", "SEPARATOR_SYMBOL", "GROUPING_SYMBOL", 
			"ROW_NUMBER_SYMBOL", "RANK_SYMBOL", "DENSE_RANK_SYMBOL", "CUME_DIST_SYMBOL", 
			"PERCENT_RANK_SYMBOL", "NTILE_SYMBOL", "LEAD_SYMBOL", "LAG_SYMBOL", "FIRST_VALUE_SYMBOL", 
			"LAST_VALUE_SYMBOL", "NTH_VALUE_SYMBOL", "FIRST_SYMBOL", "LAST_SYMBOL", 
			"OVER_SYMBOL", "RESPECT_SYMBOL", "NULLS_SYMBOL", "JSON_ARRAYAGG_SYMBOL", 
			"JSON_OBJECTAGG_SYMBOL", "BOOLEAN_SYMBOL", "LANGUAGE_SYMBOL", "QUERY_SYMBOL", 
			"EXPANSION_SYMBOL", "CHAR_SYMBOL", "CURRENT_USER_SYMBOL", "DATE_SYMBOL", 
			"INSERT_SYMBOL", "TIME_SYMBOL", "TIMESTAMP_SYMBOL", "USER_SYMBOL", "ADDDATE_SYMBOL", 
			"SUBDATE_SYMBOL", "CURDATE_SYMBOL", "CURTIME_SYMBOL", "DATE_ADD_SYMBOL", 
			"DATE_SUB_SYMBOL", "EXTRACT_SYMBOL", "GET_FORMAT_SYMBOL", "NOW_SYMBOL", 
			"POSITION_SYMBOL", "SYSDATE_SYMBOL", "TIMESTAMP_ADD_SYMBOL", "TIMESTAMP_DIFF_SYMBOL", 
			"UTC_DATE_SYMBOL", "UTC_TIME_SYMBOL", "UTC_TIMESTAMP_SYMBOL", "ASCII_SYMBOL", 
			"CHARSET_SYMBOL", "COALESCE_SYMBOL", "COLLATION_SYMBOL", "DATABASE_SYMBOL", 
			"IF_SYMBOL", "FORMAT_SYMBOL", "MICROSECOND_SYMBOL", "OLD_PASSWORD_SYMBOL", 
			"PASSWORD_SYMBOL", "REPEAT_SYMBOL", "REPLACE_SYMBOL", "REVERSE_SYMBOL", 
			"ROW_COUNT_SYMBOL", "TRUNCATE_SYMBOL", "WEIGHT_STRING_SYMBOL", "CONTAINS_SYMBOL", 
			"GEOMETRYCOLLECTION_SYMBOL", "LINESTRING_SYMBOL", "MULTILINESTRING_SYMBOL", 
			"MULTIPOINT_SYMBOL", "MULTIPOLYGON_SYMBOL", "POINT_SYMBOL", "POLYGON_SYMBOL", 
			"LEVEL_SYMBOL", "DATETIME_SYMBOL", "TRIM_SYMBOL", "LEADING_SYMBOL", "TRAILING_SYMBOL", 
			"BOTH_SYMBOL", "SUBSTRING_SYMBOL", "WHEN_SYMBOL", "THEN_SYMBOL", "ELSE_SYMBOL", 
			"SIGNED_SYMBOL", "UNSIGNED_SYMBOL", "DECIMAL_SYMBOL", "JSON_SYMBOL", 
			"FLOAT_SYMBOL", "SET_SYMBOL", "SECOND_MICROSECOND_SYMBOL", "MINUTE_MICROSECOND_SYMBOL", 
			"MINUTE_SECOND_SYMBOL", "HOUR_MICROSECOND_SYMBOL", "HOUR_SECOND_SYMBOL", 
			"HOUR_MINUTE_SYMBOL", "DAY_MICROSECOND_SYMBOL", "DAY_SECOND_SYMBOL", 
			"DAY_MINUTE_SYMBOL", "DAY_HOUR_SYMBOL", "YEAR_MONTH_SYMBOL", "BTREE_SYMBOL", 
			"RTREE_SYMBOL", "HASH_SYMBOL", "REAL_SYMBOL", "DOUBLE_SYMBOL", "PRECISION_SYMBOL", 
			"NUMERIC_SYMBOL", "FIXED_SYMBOL", "BIT_SYMBOL", "BOOL_SYMBOL", "VARYING_SYMBOL", 
			"VARCHAR_SYMBOL", "NATIONAL_SYMBOL", "NVARCHAR_SYMBOL", "NCHAR_SYMBOL", 
			"VARBINARY_SYMBOL", "TINYBLOB_SYMBOL", "BLOB_SYMBOL", "MEDIUMBLOB_SYMBOL", 
			"LONGBLOB_SYMBOL", "LONG_SYMBOL", "TINYTEXT_SYMBOL", "TEXT_SYMBOL", "MEDIUMTEXT_SYMBOL", 
			"LONGTEXT_SYMBOL", "ENUM_SYMBOL", "SERIAL_SYMBOL", "GEOMETRY_SYMBOL", 
			"ZEROFILL_SYMBOL", "BYTE_SYMBOL", "UNICODE_SYMBOL", "TERMINATED_SYMBOL", 
			"OPTIONALLY_SYMBOL", "ENCLOSED_SYMBOL", "ESCAPED_SYMBOL", "LINES_SYMBOL", 
			"STARTING_SYMBOL", "GLOBAL_SYMBOL", "LOCAL_SYMBOL", "SESSION_SYMBOL", 
			"WHITESPACE", "INVALID_INPUT", "UNDERSCORE_CHARSET", "IDENTIFIER", "NCHAR_TEXT", 
			"BACK_TICK_QUOTED_ID", "DOUBLE_QUOTED_TEXT", "SINGLE_QUOTED_TEXT", "BRACKET_QUOTED_TEXT", 
			"VERSION_COMMENT_START", "MYSQL_COMMENT_START", "VERSION_COMMENT_END", 
			"BLOCK_COMMENT", "POUND_COMMENT", "DASHDASH_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQLSelectParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLSelectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class QueryContext extends ParserRuleContext {
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode SEMICOLON_SYMBOL() { return getToken(SQLSelectParser.SEMICOLON_SYMBOL, 0); }
		public TerminalNode EOF() { return getToken(SQLSelectParser.EOF, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			selectStatement();
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SEMICOLON_SYMBOL:
				{
				setState(345);
				match(SEMICOLON_SYMBOL);
				setState(347);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(346);
					match(EOF);
					}
					break;
				}
				}
				break;
			case EOF:
				{
				setState(349);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> DEFAULT_SYMBOL() { return getTokens(SQLSelectParser.DEFAULT_SYMBOL); }
		public TerminalNode DEFAULT_SYMBOL(int i) {
			return getToken(SQLSelectParser.DEFAULT_SYMBOL, i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(352);
				expr(0);
				}
				break;
			case 2:
				{
				setState(353);
				match(DEFAULT_SYMBOL);
				}
				break;
			}
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(356);
				match(COMMA_SYMBOL);
				setState(359);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(357);
					expr(0);
					}
					break;
				case 2:
					{
					setState(358);
					match(DEFAULT_SYMBOL);
					}
					break;
				}
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStatementContext extends ParserRuleContext {
		public QueryExpressionContext queryExpression() {
			return getRuleContext(QueryExpressionContext.class,0);
		}
		public LockingClauseListContext lockingClauseList() {
			return getRuleContext(LockingClauseListContext.class,0);
		}
		public QueryExpressionParensContext queryExpressionParens() {
			return getRuleContext(QueryExpressionParensContext.class,0);
		}
		public SelectStatementWithIntoContext selectStatementWithInto() {
			return getRuleContext(SelectStatementWithIntoContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectStatement);
		int _la;
		try {
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				queryExpression();
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR_SYMBOL || _la==LOCK_SYMBOL) {
					{
					setState(367);
					lockingClauseList();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				queryExpressionParens();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(371);
				selectStatementWithInto();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectStatementWithIntoContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public SelectStatementWithIntoContext selectStatementWithInto() {
			return getRuleContext(SelectStatementWithIntoContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public QueryExpressionContext queryExpression() {
			return getRuleContext(QueryExpressionContext.class,0);
		}
		public IntoClauseContext intoClause() {
			return getRuleContext(IntoClauseContext.class,0);
		}
		public LockingClauseListContext lockingClauseList() {
			return getRuleContext(LockingClauseListContext.class,0);
		}
		public SelectStatementWithIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatementWithInto; }
	}

	public final SelectStatementWithIntoContext selectStatementWithInto() throws RecognitionException {
		SelectStatementWithIntoContext _localctx = new SelectStatementWithIntoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectStatementWithInto);
		int _la;
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(OPEN_PAR_SYMBOL);
				setState(375);
				selectStatementWithInto();
				setState(376);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				queryExpression();
				setState(379);
				intoClause();
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR_SYMBOL || _la==LOCK_SYMBOL) {
					{
					setState(380);
					lockingClauseList();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				lockingClauseList();
				setState(384);
				intoClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryExpressionContext extends ParserRuleContext {
		public QueryExpressionBodyContext queryExpressionBody() {
			return getRuleContext(QueryExpressionBodyContext.class,0);
		}
		public QueryExpressionParensContext queryExpressionParens() {
			return getRuleContext(QueryExpressionParensContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public ProcedureAnalyseClauseContext procedureAnalyseClause() {
			return getRuleContext(ProcedureAnalyseClauseContext.class,0);
		}
		public OrderClauseContext orderClause() {
			return getRuleContext(OrderClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public QueryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryExpression; }
	}

	public final QueryExpressionContext queryExpression() throws RecognitionException {
		QueryExpressionContext _localctx = new QueryExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_queryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_SYMBOL) {
				{
				setState(388);
				withClause();
				}
			}

			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(391);
				queryExpressionBody();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_SYMBOL) {
					{
					setState(392);
					orderClause();
					}
				}

				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT_SYMBOL) {
					{
					setState(395);
					limitClause();
					}
				}

				}
				break;
			case 2:
				{
				setState(398);
				queryExpressionParens();
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_SYMBOL) {
					{
					setState(399);
					orderClause();
					}
				}

				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIMIT_SYMBOL) {
					{
					setState(402);
					limitClause();
					}
				}

				}
				break;
			}
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROCEDURE_SYMBOL) {
				{
				setState(407);
				procedureAnalyseClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryExpressionBodyContext extends ParserRuleContext {
		public List<QueryPrimaryContext> queryPrimary() {
			return getRuleContexts(QueryPrimaryContext.class);
		}
		public QueryPrimaryContext queryPrimary(int i) {
			return getRuleContext(QueryPrimaryContext.class,i);
		}
		public List<QueryExpressionParensContext> queryExpressionParens() {
			return getRuleContexts(QueryExpressionParensContext.class);
		}
		public QueryExpressionParensContext queryExpressionParens(int i) {
			return getRuleContext(QueryExpressionParensContext.class,i);
		}
		public List<TerminalNode> UNION_SYMBOL() { return getTokens(SQLSelectParser.UNION_SYMBOL); }
		public TerminalNode UNION_SYMBOL(int i) {
			return getToken(SQLSelectParser.UNION_SYMBOL, i);
		}
		public List<UnionOptionContext> unionOption() {
			return getRuleContexts(UnionOptionContext.class);
		}
		public UnionOptionContext unionOption(int i) {
			return getRuleContext(UnionOptionContext.class,i);
		}
		public QueryExpressionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryExpressionBody; }
	}

	public final QueryExpressionBodyContext queryExpressionBody() throws RecognitionException {
		QueryExpressionBodyContext _localctx = new QueryExpressionBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_queryExpressionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT_SYMBOL:
			case VALUES_SYMBOL:
			case TABLE_SYMBOL:
				{
				setState(410);
				queryPrimary();
				}
				break;
			case OPEN_PAR_SYMBOL:
				{
				setState(411);
				queryExpressionParens();
				setState(412);
				match(UNION_SYMBOL);
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL_SYMBOL || _la==DISTINCT_SYMBOL) {
					{
					setState(413);
					unionOption();
					}
				}

				setState(418);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT_SYMBOL:
				case VALUES_SYMBOL:
				case TABLE_SYMBOL:
					{
					setState(416);
					queryPrimary();
					}
					break;
				case OPEN_PAR_SYMBOL:
					{
					setState(417);
					queryExpressionParens();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==UNION_SYMBOL) {
				{
				{
				setState(422);
				match(UNION_SYMBOL);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL_SYMBOL || _la==DISTINCT_SYMBOL) {
					{
					setState(423);
					unionOption();
					}
				}

				setState(428);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT_SYMBOL:
				case VALUES_SYMBOL:
				case TABLE_SYMBOL:
					{
					setState(426);
					queryPrimary();
					}
					break;
				case OPEN_PAR_SYMBOL:
					{
					setState(427);
					queryExpressionParens();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryExpressionParensContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public QueryExpressionParensContext queryExpressionParens() {
			return getRuleContext(QueryExpressionParensContext.class,0);
		}
		public QueryExpressionContext queryExpression() {
			return getRuleContext(QueryExpressionContext.class,0);
		}
		public LockingClauseListContext lockingClauseList() {
			return getRuleContext(LockingClauseListContext.class,0);
		}
		public QueryExpressionParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryExpressionParens; }
	}

	public final QueryExpressionParensContext queryExpressionParens() throws RecognitionException {
		QueryExpressionParensContext _localctx = new QueryExpressionParensContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_queryExpressionParens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(OPEN_PAR_SYMBOL);
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(436);
				queryExpressionParens();
				}
				break;
			case 2:
				{
				setState(437);
				queryExpression();
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR_SYMBOL || _la==LOCK_SYMBOL) {
					{
					setState(438);
					lockingClauseList();
					}
				}

				}
				break;
			}
			setState(443);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public TableValueConstructorContext tableValueConstructor() {
			return getRuleContext(TableValueConstructorContext.class,0);
		}
		public ExplicitTableContext explicitTable() {
			return getRuleContext(ExplicitTableContext.class,0);
		}
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_queryPrimary);
		try {
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				querySpecification();
				}
				break;
			case VALUES_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				tableValueConstructor();
				}
				break;
			case TABLE_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				explicitTable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public TerminalNode SELECT_SYMBOL() { return getToken(SQLSelectParser.SELECT_SYMBOL, 0); }
		public SelectItemListContext selectItemList() {
			return getRuleContext(SelectItemListContext.class,0);
		}
		public List<SelectOptionContext> selectOption() {
			return getRuleContexts(SelectOptionContext.class);
		}
		public SelectOptionContext selectOption(int i) {
			return getRuleContext(SelectOptionContext.class,i);
		}
		public IntoClauseContext intoClause() {
			return getRuleContext(IntoClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_querySpecification);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(SELECT_SYMBOL);
			setState(454);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(451);
					selectOption();
					}
					} 
				}
				setState(456);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(457);
			selectItemList();
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(458);
				intoClause();
				}
				break;
			}
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM_SYMBOL) {
				{
				setState(461);
				fromClause();
				}
			}

			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_SYMBOL) {
				{
				setState(464);
				whereClause();
				}
			}

			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP_SYMBOL) {
				{
				setState(467);
				groupByClause();
				}
			}

			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING_SYMBOL) {
				{
				setState(470);
				havingClause();
				}
			}

			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW_SYMBOL) {
				{
				setState(473);
				windowClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public QueryExpressionParensContext queryExpressionParens() {
			return getRuleContext(QueryExpressionParensContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			queryExpressionParens();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecOptionContext extends ParserRuleContext {
		public TerminalNode ALL_SYMBOL() { return getToken(SQLSelectParser.ALL_SYMBOL, 0); }
		public TerminalNode DISTINCT_SYMBOL() { return getToken(SQLSelectParser.DISTINCT_SYMBOL, 0); }
		public TerminalNode STRAIGHT_JOIN_SYMBOL() { return getToken(SQLSelectParser.STRAIGHT_JOIN_SYMBOL, 0); }
		public TerminalNode HIGH_PRIORITY_SYMBOL() { return getToken(SQLSelectParser.HIGH_PRIORITY_SYMBOL, 0); }
		public TerminalNode SQL_SMALL_RESULT_SYMBOL() { return getToken(SQLSelectParser.SQL_SMALL_RESULT_SYMBOL, 0); }
		public TerminalNode SQL_BIG_RESULT_SYMBOL() { return getToken(SQLSelectParser.SQL_BIG_RESULT_SYMBOL, 0); }
		public TerminalNode SQL_BUFFER_RESULT_SYMBOL() { return getToken(SQLSelectParser.SQL_BUFFER_RESULT_SYMBOL, 0); }
		public TerminalNode SQL_CALC_FOUND_ROWS_SYMBOL() { return getToken(SQLSelectParser.SQL_CALC_FOUND_ROWS_SYMBOL, 0); }
		public QuerySpecOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecOption; }
	}

	public final QuerySpecOptionContext querySpecOption() throws RecognitionException {
		QuerySpecOptionContext _localctx = new QuerySpecOptionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_querySpecOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (ALL_SYMBOL - 62)) | (1L << (DISTINCT_SYMBOL - 62)) | (1L << (STRAIGHT_JOIN_SYMBOL - 62)) | (1L << (HIGH_PRIORITY_SYMBOL - 62)) | (1L << (SQL_SMALL_RESULT_SYMBOL - 62)) | (1L << (SQL_BIG_RESULT_SYMBOL - 62)) | (1L << (SQL_BUFFER_RESULT_SYMBOL - 62)) | (1L << (SQL_CALC_FOUND_ROWS_SYMBOL - 62)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitClauseContext extends ParserRuleContext {
		public TerminalNode LIMIT_SYMBOL() { return getToken(SQLSelectParser.LIMIT_SYMBOL, 0); }
		public LimitOptionsContext limitOptions() {
			return getRuleContext(LimitOptionsContext.class,0);
		}
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_limitClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(LIMIT_SYMBOL);
			setState(481);
			limitOptions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitOptionsContext extends ParserRuleContext {
		public List<LimitOptionContext> limitOption() {
			return getRuleContexts(LimitOptionContext.class);
		}
		public LimitOptionContext limitOption(int i) {
			return getRuleContext(LimitOptionContext.class,i);
		}
		public TerminalNode COMMA_SYMBOL() { return getToken(SQLSelectParser.COMMA_SYMBOL, 0); }
		public TerminalNode OFFSET_SYMBOL() { return getToken(SQLSelectParser.OFFSET_SYMBOL, 0); }
		public LimitOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitOptions; }
	}

	public final LimitOptionsContext limitOptions() throws RecognitionException {
		LimitOptionsContext _localctx = new LimitOptionsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_limitOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			limitOption();
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_SYMBOL || _la==OFFSET_SYMBOL) {
				{
				setState(484);
				_la = _input.LA(1);
				if ( !(_la==COMMA_SYMBOL || _la==OFFSET_SYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(485);
				limitOption();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitOptionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PARAM_MARKER() { return getToken(SQLSelectParser.PARAM_MARKER, 0); }
		public TerminalNode INT_NUMBER() { return getToken(SQLSelectParser.INT_NUMBER, 0); }
		public LimitOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitOption; }
	}

	public final LimitOptionContext limitOption() throws RecognitionException {
		LimitOptionContext _localctx = new LimitOptionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_limitOption);
		int _la;
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TINYINT_SYMBOL:
			case SMALLINT_SYMBOL:
			case MEDIUMINT_SYMBOL:
			case INT_SYMBOL:
			case BIGINT_SYMBOL:
			case SECOND_SYMBOL:
			case MINUTE_SYMBOL:
			case HOUR_SYMBOL:
			case DAY_SYMBOL:
			case WEEK_SYMBOL:
			case MONTH_SYMBOL:
			case QUARTER_SYMBOL:
			case YEAR_SYMBOL:
			case DEFAULT_SYMBOL:
			case UNION_SYMBOL:
			case SELECT_SYMBOL:
			case ALL_SYMBOL:
			case DISTINCT_SYMBOL:
			case STRAIGHT_JOIN_SYMBOL:
			case HIGH_PRIORITY_SYMBOL:
			case SQL_SMALL_RESULT_SYMBOL:
			case SQL_BIG_RESULT_SYMBOL:
			case SQL_BUFFER_RESULT_SYMBOL:
			case SQL_CALC_FOUND_ROWS_SYMBOL:
			case LIMIT_SYMBOL:
			case OFFSET_SYMBOL:
			case INTO_SYMBOL:
			case OUTFILE_SYMBOL:
			case DUMPFILE_SYMBOL:
			case PROCEDURE_SYMBOL:
			case ANALYSE_SYMBOL:
			case HAVING_SYMBOL:
			case WINDOW_SYMBOL:
			case AS_SYMBOL:
			case PARTITION_SYMBOL:
			case BY_SYMBOL:
			case ROWS_SYMBOL:
			case RANGE_SYMBOL:
			case GROUPS_SYMBOL:
			case UNBOUNDED_SYMBOL:
			case PRECEDING_SYMBOL:
			case INTERVAL_SYMBOL:
			case CURRENT_SYMBOL:
			case ROW_SYMBOL:
			case BETWEEN_SYMBOL:
			case AND_SYMBOL:
			case FOLLOWING_SYMBOL:
			case EXCLUDE_SYMBOL:
			case GROUP_SYMBOL:
			case TIES_SYMBOL:
			case NO_SYMBOL:
			case OTHERS_SYMBOL:
			case WITH_SYMBOL:
			case RECURSIVE_SYMBOL:
			case ROLLUP_SYMBOL:
			case CUBE_SYMBOL:
			case ORDER_SYMBOL:
			case ASC_SYMBOL:
			case DESC_SYMBOL:
			case FROM_SYMBOL:
			case DUAL_SYMBOL:
			case VALUES_SYMBOL:
			case TABLE_SYMBOL:
			case SQL_NO_CACHE_SYMBOL:
			case SQL_CACHE_SYMBOL:
			case MAX_STATEMENT_TIME_SYMBOL:
			case FOR_SYMBOL:
			case OF_SYMBOL:
			case LOCK_SYMBOL:
			case IN_SYMBOL:
			case SHARE_SYMBOL:
			case MODE_SYMBOL:
			case UPDATE_SYMBOL:
			case SKIP_SYMBOL:
			case LOCKED_SYMBOL:
			case NOWAIT_SYMBOL:
			case WHERE_SYMBOL:
			case OJ_SYMBOL:
			case ON_SYMBOL:
			case USING_SYMBOL:
			case NATURAL_SYMBOL:
			case INNER_SYMBOL:
			case JOIN_SYMBOL:
			case LEFT_SYMBOL:
			case RIGHT_SYMBOL:
			case OUTER_SYMBOL:
			case CROSS_SYMBOL:
			case LATERAL_SYMBOL:
			case JSON_TABLE_SYMBOL:
			case COLUMNS_SYMBOL:
			case ORDINALITY_SYMBOL:
			case EXISTS_SYMBOL:
			case PATH_SYMBOL:
			case NESTED_SYMBOL:
			case EMPTY_SYMBOL:
			case ERROR_SYMBOL:
			case NULL_SYMBOL:
			case USE_SYMBOL:
			case FORCE_SYMBOL:
			case IGNORE_SYMBOL:
			case KEY_SYMBOL:
			case INDEX_SYMBOL:
			case PRIMARY_SYMBOL:
			case IS_SYMBOL:
			case TRUE_SYMBOL:
			case FALSE_SYMBOL:
			case UNKNOWN_SYMBOL:
			case NOT_SYMBOL:
			case XOR_SYMBOL:
			case OR_SYMBOL:
			case ANY_SYMBOL:
			case MEMBER_SYMBOL:
			case SOUNDS_SYMBOL:
			case LIKE_SYMBOL:
			case ESCAPE_SYMBOL:
			case REGEXP_SYMBOL:
			case DIV_SYMBOL:
			case MOD_SYMBOL:
			case MATCH_SYMBOL:
			case AGAINST_SYMBOL:
			case BINARY_SYMBOL:
			case CAST_SYMBOL:
			case ARRAY_SYMBOL:
			case CASE_SYMBOL:
			case END_SYMBOL:
			case CONVERT_SYMBOL:
			case COLLATE_SYMBOL:
			case AVG_SYMBOL:
			case BIT_AND_SYMBOL:
			case BIT_OR_SYMBOL:
			case BIT_XOR_SYMBOL:
			case COUNT_SYMBOL:
			case MIN_SYMBOL:
			case MAX_SYMBOL:
			case STD_SYMBOL:
			case VARIANCE_SYMBOL:
			case STDDEV_SAMP_SYMBOL:
			case VAR_SAMP_SYMBOL:
			case SUM_SYMBOL:
			case GROUP_CONCAT_SYMBOL:
			case SEPARATOR_SYMBOL:
			case GROUPING_SYMBOL:
			case ROW_NUMBER_SYMBOL:
			case RANK_SYMBOL:
			case DENSE_RANK_SYMBOL:
			case CUME_DIST_SYMBOL:
			case PERCENT_RANK_SYMBOL:
			case NTILE_SYMBOL:
			case LEAD_SYMBOL:
			case LAG_SYMBOL:
			case FIRST_VALUE_SYMBOL:
			case LAST_VALUE_SYMBOL:
			case NTH_VALUE_SYMBOL:
			case FIRST_SYMBOL:
			case LAST_SYMBOL:
			case OVER_SYMBOL:
			case RESPECT_SYMBOL:
			case NULLS_SYMBOL:
			case JSON_ARRAYAGG_SYMBOL:
			case JSON_OBJECTAGG_SYMBOL:
			case BOOLEAN_SYMBOL:
			case LANGUAGE_SYMBOL:
			case QUERY_SYMBOL:
			case EXPANSION_SYMBOL:
			case CHAR_SYMBOL:
			case CURRENT_USER_SYMBOL:
			case DATE_SYMBOL:
			case INSERT_SYMBOL:
			case TIME_SYMBOL:
			case TIMESTAMP_SYMBOL:
			case USER_SYMBOL:
			case ADDDATE_SYMBOL:
			case SUBDATE_SYMBOL:
			case CURDATE_SYMBOL:
			case CURTIME_SYMBOL:
			case DATE_ADD_SYMBOL:
			case DATE_SUB_SYMBOL:
			case EXTRACT_SYMBOL:
			case GET_FORMAT_SYMBOL:
			case NOW_SYMBOL:
			case POSITION_SYMBOL:
			case SYSDATE_SYMBOL:
			case TIMESTAMP_ADD_SYMBOL:
			case TIMESTAMP_DIFF_SYMBOL:
			case UTC_DATE_SYMBOL:
			case UTC_TIME_SYMBOL:
			case UTC_TIMESTAMP_SYMBOL:
			case ASCII_SYMBOL:
			case CHARSET_SYMBOL:
			case COALESCE_SYMBOL:
			case COLLATION_SYMBOL:
			case DATABASE_SYMBOL:
			case IF_SYMBOL:
			case FORMAT_SYMBOL:
			case MICROSECOND_SYMBOL:
			case OLD_PASSWORD_SYMBOL:
			case PASSWORD_SYMBOL:
			case REPEAT_SYMBOL:
			case REPLACE_SYMBOL:
			case REVERSE_SYMBOL:
			case ROW_COUNT_SYMBOL:
			case TRUNCATE_SYMBOL:
			case WEIGHT_STRING_SYMBOL:
			case CONTAINS_SYMBOL:
			case GEOMETRYCOLLECTION_SYMBOL:
			case LINESTRING_SYMBOL:
			case MULTILINESTRING_SYMBOL:
			case MULTIPOINT_SYMBOL:
			case MULTIPOLYGON_SYMBOL:
			case POINT_SYMBOL:
			case POLYGON_SYMBOL:
			case LEVEL_SYMBOL:
			case DATETIME_SYMBOL:
			case TRIM_SYMBOL:
			case LEADING_SYMBOL:
			case TRAILING_SYMBOL:
			case BOTH_SYMBOL:
			case SUBSTRING_SYMBOL:
			case WHEN_SYMBOL:
			case THEN_SYMBOL:
			case ELSE_SYMBOL:
			case SIGNED_SYMBOL:
			case UNSIGNED_SYMBOL:
			case DECIMAL_SYMBOL:
			case JSON_SYMBOL:
			case FLOAT_SYMBOL:
			case SET_SYMBOL:
			case SECOND_MICROSECOND_SYMBOL:
			case MINUTE_MICROSECOND_SYMBOL:
			case MINUTE_SECOND_SYMBOL:
			case HOUR_MICROSECOND_SYMBOL:
			case HOUR_SECOND_SYMBOL:
			case HOUR_MINUTE_SYMBOL:
			case DAY_MICROSECOND_SYMBOL:
			case DAY_SECOND_SYMBOL:
			case DAY_MINUTE_SYMBOL:
			case DAY_HOUR_SYMBOL:
			case YEAR_MONTH_SYMBOL:
			case BTREE_SYMBOL:
			case RTREE_SYMBOL:
			case HASH_SYMBOL:
			case REAL_SYMBOL:
			case DOUBLE_SYMBOL:
			case PRECISION_SYMBOL:
			case NUMERIC_SYMBOL:
			case FIXED_SYMBOL:
			case BIT_SYMBOL:
			case BOOL_SYMBOL:
			case VARYING_SYMBOL:
			case VARCHAR_SYMBOL:
			case NATIONAL_SYMBOL:
			case NVARCHAR_SYMBOL:
			case NCHAR_SYMBOL:
			case VARBINARY_SYMBOL:
			case TINYBLOB_SYMBOL:
			case BLOB_SYMBOL:
			case MEDIUMBLOB_SYMBOL:
			case LONGBLOB_SYMBOL:
			case LONG_SYMBOL:
			case TINYTEXT_SYMBOL:
			case TEXT_SYMBOL:
			case MEDIUMTEXT_SYMBOL:
			case LONGTEXT_SYMBOL:
			case ENUM_SYMBOL:
			case SERIAL_SYMBOL:
			case GEOMETRY_SYMBOL:
			case ZEROFILL_SYMBOL:
			case BYTE_SYMBOL:
			case UNICODE_SYMBOL:
			case TERMINATED_SYMBOL:
			case OPTIONALLY_SYMBOL:
			case ENCLOSED_SYMBOL:
			case ESCAPED_SYMBOL:
			case LINES_SYMBOL:
			case STARTING_SYMBOL:
			case GLOBAL_SYMBOL:
			case LOCAL_SYMBOL:
			case SESSION_SYMBOL:
			case IDENTIFIER:
			case BACK_TICK_QUOTED_ID:
			case DOUBLE_QUOTED_TEXT:
			case SINGLE_QUOTED_TEXT:
			case BRACKET_QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				identifier();
				}
				break;
			case PARAM_MARKER:
			case INT_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(489);
				_la = _input.LA(1);
				if ( !(_la==PARAM_MARKER || _la==INT_NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntoClauseContext extends ParserRuleContext {
		public TerminalNode INTO_SYMBOL() { return getToken(SQLSelectParser.INTO_SYMBOL, 0); }
		public TerminalNode OUTFILE_SYMBOL() { return getToken(SQLSelectParser.OUTFILE_SYMBOL, 0); }
		public TextStringLiteralContext textStringLiteral() {
			return getRuleContext(TextStringLiteralContext.class,0);
		}
		public TerminalNode DUMPFILE_SYMBOL() { return getToken(SQLSelectParser.DUMPFILE_SYMBOL, 0); }
		public List<TextOrIdentifierContext> textOrIdentifier() {
			return getRuleContexts(TextOrIdentifierContext.class);
		}
		public TextOrIdentifierContext textOrIdentifier(int i) {
			return getRuleContext(TextOrIdentifierContext.class,i);
		}
		public List<UserVariableContext> userVariable() {
			return getRuleContexts(UserVariableContext.class);
		}
		public UserVariableContext userVariable(int i) {
			return getRuleContext(UserVariableContext.class,i);
		}
		public CharsetClauseContext charsetClause() {
			return getRuleContext(CharsetClauseContext.class,0);
		}
		public FieldsClauseContext fieldsClause() {
			return getRuleContext(FieldsClauseContext.class,0);
		}
		public LinesClauseContext linesClause() {
			return getRuleContext(LinesClauseContext.class,0);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public IntoClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intoClause; }
	}

	public final IntoClauseContext intoClause() throws RecognitionException {
		IntoClauseContext _localctx = new IntoClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_intoClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(INTO_SYMBOL);
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(493);
				match(OUTFILE_SYMBOL);
				setState(494);
				textStringLiteral();
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHAR_SYMBOL || _la==CHARSET_SYMBOL) {
					{
					setState(495);
					charsetClause();
					}
				}

				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLUMNS_SYMBOL) {
					{
					setState(498);
					fieldsClause();
					}
				}

				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINES_SYMBOL) {
					{
					setState(501);
					linesClause();
					}
				}

				}
				break;
			case 2:
				{
				setState(504);
				match(DUMPFILE_SYMBOL);
				setState(505);
				textStringLiteral();
				}
				break;
			case 3:
				{
				setState(508);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TINYINT_SYMBOL:
				case SMALLINT_SYMBOL:
				case MEDIUMINT_SYMBOL:
				case INT_SYMBOL:
				case BIGINT_SYMBOL:
				case SECOND_SYMBOL:
				case MINUTE_SYMBOL:
				case HOUR_SYMBOL:
				case DAY_SYMBOL:
				case WEEK_SYMBOL:
				case MONTH_SYMBOL:
				case QUARTER_SYMBOL:
				case YEAR_SYMBOL:
				case DEFAULT_SYMBOL:
				case UNION_SYMBOL:
				case SELECT_SYMBOL:
				case ALL_SYMBOL:
				case DISTINCT_SYMBOL:
				case STRAIGHT_JOIN_SYMBOL:
				case HIGH_PRIORITY_SYMBOL:
				case SQL_SMALL_RESULT_SYMBOL:
				case SQL_BIG_RESULT_SYMBOL:
				case SQL_BUFFER_RESULT_SYMBOL:
				case SQL_CALC_FOUND_ROWS_SYMBOL:
				case LIMIT_SYMBOL:
				case OFFSET_SYMBOL:
				case INTO_SYMBOL:
				case OUTFILE_SYMBOL:
				case DUMPFILE_SYMBOL:
				case PROCEDURE_SYMBOL:
				case ANALYSE_SYMBOL:
				case HAVING_SYMBOL:
				case WINDOW_SYMBOL:
				case AS_SYMBOL:
				case PARTITION_SYMBOL:
				case BY_SYMBOL:
				case ROWS_SYMBOL:
				case RANGE_SYMBOL:
				case GROUPS_SYMBOL:
				case UNBOUNDED_SYMBOL:
				case PRECEDING_SYMBOL:
				case INTERVAL_SYMBOL:
				case CURRENT_SYMBOL:
				case ROW_SYMBOL:
				case BETWEEN_SYMBOL:
				case AND_SYMBOL:
				case FOLLOWING_SYMBOL:
				case EXCLUDE_SYMBOL:
				case GROUP_SYMBOL:
				case TIES_SYMBOL:
				case NO_SYMBOL:
				case OTHERS_SYMBOL:
				case WITH_SYMBOL:
				case RECURSIVE_SYMBOL:
				case ROLLUP_SYMBOL:
				case CUBE_SYMBOL:
				case ORDER_SYMBOL:
				case ASC_SYMBOL:
				case DESC_SYMBOL:
				case FROM_SYMBOL:
				case DUAL_SYMBOL:
				case VALUES_SYMBOL:
				case TABLE_SYMBOL:
				case SQL_NO_CACHE_SYMBOL:
				case SQL_CACHE_SYMBOL:
				case MAX_STATEMENT_TIME_SYMBOL:
				case FOR_SYMBOL:
				case OF_SYMBOL:
				case LOCK_SYMBOL:
				case IN_SYMBOL:
				case SHARE_SYMBOL:
				case MODE_SYMBOL:
				case UPDATE_SYMBOL:
				case SKIP_SYMBOL:
				case LOCKED_SYMBOL:
				case NOWAIT_SYMBOL:
				case WHERE_SYMBOL:
				case OJ_SYMBOL:
				case ON_SYMBOL:
				case USING_SYMBOL:
				case NATURAL_SYMBOL:
				case INNER_SYMBOL:
				case JOIN_SYMBOL:
				case LEFT_SYMBOL:
				case RIGHT_SYMBOL:
				case OUTER_SYMBOL:
				case CROSS_SYMBOL:
				case LATERAL_SYMBOL:
				case JSON_TABLE_SYMBOL:
				case COLUMNS_SYMBOL:
				case ORDINALITY_SYMBOL:
				case EXISTS_SYMBOL:
				case PATH_SYMBOL:
				case NESTED_SYMBOL:
				case EMPTY_SYMBOL:
				case ERROR_SYMBOL:
				case NULL_SYMBOL:
				case USE_SYMBOL:
				case FORCE_SYMBOL:
				case IGNORE_SYMBOL:
				case KEY_SYMBOL:
				case INDEX_SYMBOL:
				case PRIMARY_SYMBOL:
				case IS_SYMBOL:
				case TRUE_SYMBOL:
				case FALSE_SYMBOL:
				case UNKNOWN_SYMBOL:
				case NOT_SYMBOL:
				case XOR_SYMBOL:
				case OR_SYMBOL:
				case ANY_SYMBOL:
				case MEMBER_SYMBOL:
				case SOUNDS_SYMBOL:
				case LIKE_SYMBOL:
				case ESCAPE_SYMBOL:
				case REGEXP_SYMBOL:
				case DIV_SYMBOL:
				case MOD_SYMBOL:
				case MATCH_SYMBOL:
				case AGAINST_SYMBOL:
				case BINARY_SYMBOL:
				case CAST_SYMBOL:
				case ARRAY_SYMBOL:
				case CASE_SYMBOL:
				case END_SYMBOL:
				case CONVERT_SYMBOL:
				case COLLATE_SYMBOL:
				case AVG_SYMBOL:
				case BIT_AND_SYMBOL:
				case BIT_OR_SYMBOL:
				case BIT_XOR_SYMBOL:
				case COUNT_SYMBOL:
				case MIN_SYMBOL:
				case MAX_SYMBOL:
				case STD_SYMBOL:
				case VARIANCE_SYMBOL:
				case STDDEV_SAMP_SYMBOL:
				case VAR_SAMP_SYMBOL:
				case SUM_SYMBOL:
				case GROUP_CONCAT_SYMBOL:
				case SEPARATOR_SYMBOL:
				case GROUPING_SYMBOL:
				case ROW_NUMBER_SYMBOL:
				case RANK_SYMBOL:
				case DENSE_RANK_SYMBOL:
				case CUME_DIST_SYMBOL:
				case PERCENT_RANK_SYMBOL:
				case NTILE_SYMBOL:
				case LEAD_SYMBOL:
				case LAG_SYMBOL:
				case FIRST_VALUE_SYMBOL:
				case LAST_VALUE_SYMBOL:
				case NTH_VALUE_SYMBOL:
				case FIRST_SYMBOL:
				case LAST_SYMBOL:
				case OVER_SYMBOL:
				case RESPECT_SYMBOL:
				case NULLS_SYMBOL:
				case JSON_ARRAYAGG_SYMBOL:
				case JSON_OBJECTAGG_SYMBOL:
				case BOOLEAN_SYMBOL:
				case LANGUAGE_SYMBOL:
				case QUERY_SYMBOL:
				case EXPANSION_SYMBOL:
				case CHAR_SYMBOL:
				case CURRENT_USER_SYMBOL:
				case DATE_SYMBOL:
				case INSERT_SYMBOL:
				case TIME_SYMBOL:
				case TIMESTAMP_SYMBOL:
				case USER_SYMBOL:
				case ADDDATE_SYMBOL:
				case SUBDATE_SYMBOL:
				case CURDATE_SYMBOL:
				case CURTIME_SYMBOL:
				case DATE_ADD_SYMBOL:
				case DATE_SUB_SYMBOL:
				case EXTRACT_SYMBOL:
				case GET_FORMAT_SYMBOL:
				case NOW_SYMBOL:
				case POSITION_SYMBOL:
				case SYSDATE_SYMBOL:
				case TIMESTAMP_ADD_SYMBOL:
				case TIMESTAMP_DIFF_SYMBOL:
				case UTC_DATE_SYMBOL:
				case UTC_TIME_SYMBOL:
				case UTC_TIMESTAMP_SYMBOL:
				case ASCII_SYMBOL:
				case CHARSET_SYMBOL:
				case COALESCE_SYMBOL:
				case COLLATION_SYMBOL:
				case DATABASE_SYMBOL:
				case IF_SYMBOL:
				case FORMAT_SYMBOL:
				case MICROSECOND_SYMBOL:
				case OLD_PASSWORD_SYMBOL:
				case PASSWORD_SYMBOL:
				case REPEAT_SYMBOL:
				case REPLACE_SYMBOL:
				case REVERSE_SYMBOL:
				case ROW_COUNT_SYMBOL:
				case TRUNCATE_SYMBOL:
				case WEIGHT_STRING_SYMBOL:
				case CONTAINS_SYMBOL:
				case GEOMETRYCOLLECTION_SYMBOL:
				case LINESTRING_SYMBOL:
				case MULTILINESTRING_SYMBOL:
				case MULTIPOINT_SYMBOL:
				case MULTIPOLYGON_SYMBOL:
				case POINT_SYMBOL:
				case POLYGON_SYMBOL:
				case LEVEL_SYMBOL:
				case DATETIME_SYMBOL:
				case TRIM_SYMBOL:
				case LEADING_SYMBOL:
				case TRAILING_SYMBOL:
				case BOTH_SYMBOL:
				case SUBSTRING_SYMBOL:
				case WHEN_SYMBOL:
				case THEN_SYMBOL:
				case ELSE_SYMBOL:
				case SIGNED_SYMBOL:
				case UNSIGNED_SYMBOL:
				case DECIMAL_SYMBOL:
				case JSON_SYMBOL:
				case FLOAT_SYMBOL:
				case SET_SYMBOL:
				case SECOND_MICROSECOND_SYMBOL:
				case MINUTE_MICROSECOND_SYMBOL:
				case MINUTE_SECOND_SYMBOL:
				case HOUR_MICROSECOND_SYMBOL:
				case HOUR_SECOND_SYMBOL:
				case HOUR_MINUTE_SYMBOL:
				case DAY_MICROSECOND_SYMBOL:
				case DAY_SECOND_SYMBOL:
				case DAY_MINUTE_SYMBOL:
				case DAY_HOUR_SYMBOL:
				case YEAR_MONTH_SYMBOL:
				case BTREE_SYMBOL:
				case RTREE_SYMBOL:
				case HASH_SYMBOL:
				case REAL_SYMBOL:
				case DOUBLE_SYMBOL:
				case PRECISION_SYMBOL:
				case NUMERIC_SYMBOL:
				case FIXED_SYMBOL:
				case BIT_SYMBOL:
				case BOOL_SYMBOL:
				case VARYING_SYMBOL:
				case VARCHAR_SYMBOL:
				case NATIONAL_SYMBOL:
				case NVARCHAR_SYMBOL:
				case NCHAR_SYMBOL:
				case VARBINARY_SYMBOL:
				case TINYBLOB_SYMBOL:
				case BLOB_SYMBOL:
				case MEDIUMBLOB_SYMBOL:
				case LONGBLOB_SYMBOL:
				case LONG_SYMBOL:
				case TINYTEXT_SYMBOL:
				case TEXT_SYMBOL:
				case MEDIUMTEXT_SYMBOL:
				case LONGTEXT_SYMBOL:
				case ENUM_SYMBOL:
				case SERIAL_SYMBOL:
				case GEOMETRY_SYMBOL:
				case ZEROFILL_SYMBOL:
				case BYTE_SYMBOL:
				case UNICODE_SYMBOL:
				case TERMINATED_SYMBOL:
				case OPTIONALLY_SYMBOL:
				case ENCLOSED_SYMBOL:
				case ESCAPED_SYMBOL:
				case LINES_SYMBOL:
				case STARTING_SYMBOL:
				case GLOBAL_SYMBOL:
				case LOCAL_SYMBOL:
				case SESSION_SYMBOL:
				case IDENTIFIER:
				case BACK_TICK_QUOTED_ID:
				case DOUBLE_QUOTED_TEXT:
				case SINGLE_QUOTED_TEXT:
				case BRACKET_QUOTED_TEXT:
					{
					setState(506);
					textOrIdentifier();
					}
					break;
				case AT_SIGN_SYMBOL:
				case AT_TEXT_SUFFIX:
					{
					setState(507);
					userVariable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_SYMBOL) {
					{
					{
					setState(510);
					match(COMMA_SYMBOL);
					setState(513);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TINYINT_SYMBOL:
					case SMALLINT_SYMBOL:
					case MEDIUMINT_SYMBOL:
					case INT_SYMBOL:
					case BIGINT_SYMBOL:
					case SECOND_SYMBOL:
					case MINUTE_SYMBOL:
					case HOUR_SYMBOL:
					case DAY_SYMBOL:
					case WEEK_SYMBOL:
					case MONTH_SYMBOL:
					case QUARTER_SYMBOL:
					case YEAR_SYMBOL:
					case DEFAULT_SYMBOL:
					case UNION_SYMBOL:
					case SELECT_SYMBOL:
					case ALL_SYMBOL:
					case DISTINCT_SYMBOL:
					case STRAIGHT_JOIN_SYMBOL:
					case HIGH_PRIORITY_SYMBOL:
					case SQL_SMALL_RESULT_SYMBOL:
					case SQL_BIG_RESULT_SYMBOL:
					case SQL_BUFFER_RESULT_SYMBOL:
					case SQL_CALC_FOUND_ROWS_SYMBOL:
					case LIMIT_SYMBOL:
					case OFFSET_SYMBOL:
					case INTO_SYMBOL:
					case OUTFILE_SYMBOL:
					case DUMPFILE_SYMBOL:
					case PROCEDURE_SYMBOL:
					case ANALYSE_SYMBOL:
					case HAVING_SYMBOL:
					case WINDOW_SYMBOL:
					case AS_SYMBOL:
					case PARTITION_SYMBOL:
					case BY_SYMBOL:
					case ROWS_SYMBOL:
					case RANGE_SYMBOL:
					case GROUPS_SYMBOL:
					case UNBOUNDED_SYMBOL:
					case PRECEDING_SYMBOL:
					case INTERVAL_SYMBOL:
					case CURRENT_SYMBOL:
					case ROW_SYMBOL:
					case BETWEEN_SYMBOL:
					case AND_SYMBOL:
					case FOLLOWING_SYMBOL:
					case EXCLUDE_SYMBOL:
					case GROUP_SYMBOL:
					case TIES_SYMBOL:
					case NO_SYMBOL:
					case OTHERS_SYMBOL:
					case WITH_SYMBOL:
					case RECURSIVE_SYMBOL:
					case ROLLUP_SYMBOL:
					case CUBE_SYMBOL:
					case ORDER_SYMBOL:
					case ASC_SYMBOL:
					case DESC_SYMBOL:
					case FROM_SYMBOL:
					case DUAL_SYMBOL:
					case VALUES_SYMBOL:
					case TABLE_SYMBOL:
					case SQL_NO_CACHE_SYMBOL:
					case SQL_CACHE_SYMBOL:
					case MAX_STATEMENT_TIME_SYMBOL:
					case FOR_SYMBOL:
					case OF_SYMBOL:
					case LOCK_SYMBOL:
					case IN_SYMBOL:
					case SHARE_SYMBOL:
					case MODE_SYMBOL:
					case UPDATE_SYMBOL:
					case SKIP_SYMBOL:
					case LOCKED_SYMBOL:
					case NOWAIT_SYMBOL:
					case WHERE_SYMBOL:
					case OJ_SYMBOL:
					case ON_SYMBOL:
					case USING_SYMBOL:
					case NATURAL_SYMBOL:
					case INNER_SYMBOL:
					case JOIN_SYMBOL:
					case LEFT_SYMBOL:
					case RIGHT_SYMBOL:
					case OUTER_SYMBOL:
					case CROSS_SYMBOL:
					case LATERAL_SYMBOL:
					case JSON_TABLE_SYMBOL:
					case COLUMNS_SYMBOL:
					case ORDINALITY_SYMBOL:
					case EXISTS_SYMBOL:
					case PATH_SYMBOL:
					case NESTED_SYMBOL:
					case EMPTY_SYMBOL:
					case ERROR_SYMBOL:
					case NULL_SYMBOL:
					case USE_SYMBOL:
					case FORCE_SYMBOL:
					case IGNORE_SYMBOL:
					case KEY_SYMBOL:
					case INDEX_SYMBOL:
					case PRIMARY_SYMBOL:
					case IS_SYMBOL:
					case TRUE_SYMBOL:
					case FALSE_SYMBOL:
					case UNKNOWN_SYMBOL:
					case NOT_SYMBOL:
					case XOR_SYMBOL:
					case OR_SYMBOL:
					case ANY_SYMBOL:
					case MEMBER_SYMBOL:
					case SOUNDS_SYMBOL:
					case LIKE_SYMBOL:
					case ESCAPE_SYMBOL:
					case REGEXP_SYMBOL:
					case DIV_SYMBOL:
					case MOD_SYMBOL:
					case MATCH_SYMBOL:
					case AGAINST_SYMBOL:
					case BINARY_SYMBOL:
					case CAST_SYMBOL:
					case ARRAY_SYMBOL:
					case CASE_SYMBOL:
					case END_SYMBOL:
					case CONVERT_SYMBOL:
					case COLLATE_SYMBOL:
					case AVG_SYMBOL:
					case BIT_AND_SYMBOL:
					case BIT_OR_SYMBOL:
					case BIT_XOR_SYMBOL:
					case COUNT_SYMBOL:
					case MIN_SYMBOL:
					case MAX_SYMBOL:
					case STD_SYMBOL:
					case VARIANCE_SYMBOL:
					case STDDEV_SAMP_SYMBOL:
					case VAR_SAMP_SYMBOL:
					case SUM_SYMBOL:
					case GROUP_CONCAT_SYMBOL:
					case SEPARATOR_SYMBOL:
					case GROUPING_SYMBOL:
					case ROW_NUMBER_SYMBOL:
					case RANK_SYMBOL:
					case DENSE_RANK_SYMBOL:
					case CUME_DIST_SYMBOL:
					case PERCENT_RANK_SYMBOL:
					case NTILE_SYMBOL:
					case LEAD_SYMBOL:
					case LAG_SYMBOL:
					case FIRST_VALUE_SYMBOL:
					case LAST_VALUE_SYMBOL:
					case NTH_VALUE_SYMBOL:
					case FIRST_SYMBOL:
					case LAST_SYMBOL:
					case OVER_SYMBOL:
					case RESPECT_SYMBOL:
					case NULLS_SYMBOL:
					case JSON_ARRAYAGG_SYMBOL:
					case JSON_OBJECTAGG_SYMBOL:
					case BOOLEAN_SYMBOL:
					case LANGUAGE_SYMBOL:
					case QUERY_SYMBOL:
					case EXPANSION_SYMBOL:
					case CHAR_SYMBOL:
					case CURRENT_USER_SYMBOL:
					case DATE_SYMBOL:
					case INSERT_SYMBOL:
					case TIME_SYMBOL:
					case TIMESTAMP_SYMBOL:
					case USER_SYMBOL:
					case ADDDATE_SYMBOL:
					case SUBDATE_SYMBOL:
					case CURDATE_SYMBOL:
					case CURTIME_SYMBOL:
					case DATE_ADD_SYMBOL:
					case DATE_SUB_SYMBOL:
					case EXTRACT_SYMBOL:
					case GET_FORMAT_SYMBOL:
					case NOW_SYMBOL:
					case POSITION_SYMBOL:
					case SYSDATE_SYMBOL:
					case TIMESTAMP_ADD_SYMBOL:
					case TIMESTAMP_DIFF_SYMBOL:
					case UTC_DATE_SYMBOL:
					case UTC_TIME_SYMBOL:
					case UTC_TIMESTAMP_SYMBOL:
					case ASCII_SYMBOL:
					case CHARSET_SYMBOL:
					case COALESCE_SYMBOL:
					case COLLATION_SYMBOL:
					case DATABASE_SYMBOL:
					case IF_SYMBOL:
					case FORMAT_SYMBOL:
					case MICROSECOND_SYMBOL:
					case OLD_PASSWORD_SYMBOL:
					case PASSWORD_SYMBOL:
					case REPEAT_SYMBOL:
					case REPLACE_SYMBOL:
					case REVERSE_SYMBOL:
					case ROW_COUNT_SYMBOL:
					case TRUNCATE_SYMBOL:
					case WEIGHT_STRING_SYMBOL:
					case CONTAINS_SYMBOL:
					case GEOMETRYCOLLECTION_SYMBOL:
					case LINESTRING_SYMBOL:
					case MULTILINESTRING_SYMBOL:
					case MULTIPOINT_SYMBOL:
					case MULTIPOLYGON_SYMBOL:
					case POINT_SYMBOL:
					case POLYGON_SYMBOL:
					case LEVEL_SYMBOL:
					case DATETIME_SYMBOL:
					case TRIM_SYMBOL:
					case LEADING_SYMBOL:
					case TRAILING_SYMBOL:
					case BOTH_SYMBOL:
					case SUBSTRING_SYMBOL:
					case WHEN_SYMBOL:
					case THEN_SYMBOL:
					case ELSE_SYMBOL:
					case SIGNED_SYMBOL:
					case UNSIGNED_SYMBOL:
					case DECIMAL_SYMBOL:
					case JSON_SYMBOL:
					case FLOAT_SYMBOL:
					case SET_SYMBOL:
					case SECOND_MICROSECOND_SYMBOL:
					case MINUTE_MICROSECOND_SYMBOL:
					case MINUTE_SECOND_SYMBOL:
					case HOUR_MICROSECOND_SYMBOL:
					case HOUR_SECOND_SYMBOL:
					case HOUR_MINUTE_SYMBOL:
					case DAY_MICROSECOND_SYMBOL:
					case DAY_SECOND_SYMBOL:
					case DAY_MINUTE_SYMBOL:
					case DAY_HOUR_SYMBOL:
					case YEAR_MONTH_SYMBOL:
					case BTREE_SYMBOL:
					case RTREE_SYMBOL:
					case HASH_SYMBOL:
					case REAL_SYMBOL:
					case DOUBLE_SYMBOL:
					case PRECISION_SYMBOL:
					case NUMERIC_SYMBOL:
					case FIXED_SYMBOL:
					case BIT_SYMBOL:
					case BOOL_SYMBOL:
					case VARYING_SYMBOL:
					case VARCHAR_SYMBOL:
					case NATIONAL_SYMBOL:
					case NVARCHAR_SYMBOL:
					case NCHAR_SYMBOL:
					case VARBINARY_SYMBOL:
					case TINYBLOB_SYMBOL:
					case BLOB_SYMBOL:
					case MEDIUMBLOB_SYMBOL:
					case LONGBLOB_SYMBOL:
					case LONG_SYMBOL:
					case TINYTEXT_SYMBOL:
					case TEXT_SYMBOL:
					case MEDIUMTEXT_SYMBOL:
					case LONGTEXT_SYMBOL:
					case ENUM_SYMBOL:
					case SERIAL_SYMBOL:
					case GEOMETRY_SYMBOL:
					case ZEROFILL_SYMBOL:
					case BYTE_SYMBOL:
					case UNICODE_SYMBOL:
					case TERMINATED_SYMBOL:
					case OPTIONALLY_SYMBOL:
					case ENCLOSED_SYMBOL:
					case ESCAPED_SYMBOL:
					case LINES_SYMBOL:
					case STARTING_SYMBOL:
					case GLOBAL_SYMBOL:
					case LOCAL_SYMBOL:
					case SESSION_SYMBOL:
					case IDENTIFIER:
					case BACK_TICK_QUOTED_ID:
					case DOUBLE_QUOTED_TEXT:
					case SINGLE_QUOTED_TEXT:
					case BRACKET_QUOTED_TEXT:
						{
						setState(511);
						textOrIdentifier();
						}
						break;
					case AT_SIGN_SYMBOL:
					case AT_TEXT_SUFFIX:
						{
						setState(512);
						userVariable();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureAnalyseClauseContext extends ParserRuleContext {
		public TerminalNode PROCEDURE_SYMBOL() { return getToken(SQLSelectParser.PROCEDURE_SYMBOL, 0); }
		public TerminalNode ANALYSE_SYMBOL() { return getToken(SQLSelectParser.ANALYSE_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public List<TerminalNode> INT_NUMBER() { return getTokens(SQLSelectParser.INT_NUMBER); }
		public TerminalNode INT_NUMBER(int i) {
			return getToken(SQLSelectParser.INT_NUMBER, i);
		}
		public TerminalNode COMMA_SYMBOL() { return getToken(SQLSelectParser.COMMA_SYMBOL, 0); }
		public ProcedureAnalyseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureAnalyseClause; }
	}

	public final ProcedureAnalyseClauseContext procedureAnalyseClause() throws RecognitionException {
		ProcedureAnalyseClauseContext _localctx = new ProcedureAnalyseClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_procedureAnalyseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(PROCEDURE_SYMBOL);
			setState(523);
			match(ANALYSE_SYMBOL);
			setState(524);
			match(OPEN_PAR_SYMBOL);
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_NUMBER) {
				{
				setState(525);
				match(INT_NUMBER);
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_SYMBOL) {
					{
					setState(526);
					match(COMMA_SYMBOL);
					setState(527);
					match(INT_NUMBER);
					}
				}

				}
			}

			setState(532);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING_SYMBOL() { return getToken(SQLSelectParser.HAVING_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(HAVING_SYMBOL);
			setState(535);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW_SYMBOL() { return getToken(SQLSelectParser.WINDOW_SYMBOL, 0); }
		public List<WindowDefinitionContext> windowDefinition() {
			return getRuleContexts(WindowDefinitionContext.class);
		}
		public WindowDefinitionContext windowDefinition(int i) {
			return getRuleContext(WindowDefinitionContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_windowClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(WINDOW_SYMBOL);
			setState(538);
			windowDefinition();
			setState(543);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(539);
				match(COMMA_SYMBOL);
				setState(540);
				windowDefinition();
				}
				}
				setState(545);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS_SYMBOL() { return getToken(SQLSelectParser.AS_SYMBOL, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public WindowDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowDefinition; }
	}

	public final WindowDefinitionContext windowDefinition() throws RecognitionException {
		WindowDefinitionContext _localctx = new WindowDefinitionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_windowDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			identifier();
			setState(547);
			match(AS_SYMBOL);
			setState(548);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public WindowSpecDetailsContext windowSpecDetails() {
			return getRuleContext(WindowSpecDetailsContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_windowSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(OPEN_PAR_SYMBOL);
			setState(551);
			windowSpecDetails();
			setState(552);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecDetailsContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PARTITION_SYMBOL() { return getToken(SQLSelectParser.PARTITION_SYMBOL, 0); }
		public TerminalNode BY_SYMBOL() { return getToken(SQLSelectParser.BY_SYMBOL, 0); }
		public OrderListContext orderList() {
			return getRuleContext(OrderListContext.class,0);
		}
		public OrderClauseContext orderClause() {
			return getRuleContext(OrderClauseContext.class,0);
		}
		public WindowFrameClauseContext windowFrameClause() {
			return getRuleContext(WindowFrameClauseContext.class,0);
		}
		public WindowSpecDetailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpecDetails; }
	}

	public final WindowSpecDetailsContext windowSpecDetails() throws RecognitionException {
		WindowSpecDetailsContext _localctx = new WindowSpecDetailsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_windowSpecDetails);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(554);
				identifier();
				}
				break;
			}
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION_SYMBOL) {
				{
				setState(557);
				match(PARTITION_SYMBOL);
				setState(558);
				match(BY_SYMBOL);
				setState(559);
				orderList();
				}
			}

			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_SYMBOL) {
				{
				setState(562);
				orderClause();
				}
			}

			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (ROWS_SYMBOL - 82)) | (1L << (RANGE_SYMBOL - 82)) | (1L << (GROUPS_SYMBOL - 82)))) != 0)) {
				{
				setState(565);
				windowFrameClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameClauseContext extends ParserRuleContext {
		public WindowFrameUnitsContext windowFrameUnits() {
			return getRuleContext(WindowFrameUnitsContext.class,0);
		}
		public WindowFrameExtentContext windowFrameExtent() {
			return getRuleContext(WindowFrameExtentContext.class,0);
		}
		public WindowFrameExclusionContext windowFrameExclusion() {
			return getRuleContext(WindowFrameExclusionContext.class,0);
		}
		public WindowFrameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameClause; }
	}

	public final WindowFrameClauseContext windowFrameClause() throws RecognitionException {
		WindowFrameClauseContext _localctx = new WindowFrameClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_windowFrameClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			windowFrameUnits();
			setState(569);
			windowFrameExtent();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUDE_SYMBOL) {
				{
				setState(570);
				windowFrameExclusion();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameUnitsContext extends ParserRuleContext {
		public TerminalNode ROWS_SYMBOL() { return getToken(SQLSelectParser.ROWS_SYMBOL, 0); }
		public TerminalNode RANGE_SYMBOL() { return getToken(SQLSelectParser.RANGE_SYMBOL, 0); }
		public TerminalNode GROUPS_SYMBOL() { return getToken(SQLSelectParser.GROUPS_SYMBOL, 0); }
		public WindowFrameUnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameUnits; }
	}

	public final WindowFrameUnitsContext windowFrameUnits() throws RecognitionException {
		WindowFrameUnitsContext _localctx = new WindowFrameUnitsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_windowFrameUnits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (ROWS_SYMBOL - 82)) | (1L << (RANGE_SYMBOL - 82)) | (1L << (GROUPS_SYMBOL - 82)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameExtentContext extends ParserRuleContext {
		public WindowFrameStartContext windowFrameStart() {
			return getRuleContext(WindowFrameStartContext.class,0);
		}
		public WindowFrameBetweenContext windowFrameBetween() {
			return getRuleContext(WindowFrameBetweenContext.class,0);
		}
		public WindowFrameExtentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameExtent; }
	}

	public final WindowFrameExtentContext windowFrameExtent() throws RecognitionException {
		WindowFrameExtentContext _localctx = new WindowFrameExtentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_windowFrameExtent);
		try {
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARAM_MARKER:
			case INT_NUMBER:
			case DECIMAL_NUMBER:
			case FLOAT_NUMBER:
			case UNBOUNDED_SYMBOL:
			case INTERVAL_SYMBOL:
			case CURRENT_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				windowFrameStart();
				}
				break;
			case BETWEEN_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				windowFrameBetween();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameStartContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED_SYMBOL() { return getToken(SQLSelectParser.UNBOUNDED_SYMBOL, 0); }
		public TerminalNode PRECEDING_SYMBOL() { return getToken(SQLSelectParser.PRECEDING_SYMBOL, 0); }
		public Ulonglong_numberContext ulonglong_number() {
			return getRuleContext(Ulonglong_numberContext.class,0);
		}
		public TerminalNode PARAM_MARKER() { return getToken(SQLSelectParser.PARAM_MARKER, 0); }
		public TerminalNode INTERVAL_SYMBOL() { return getToken(SQLSelectParser.INTERVAL_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode CURRENT_SYMBOL() { return getToken(SQLSelectParser.CURRENT_SYMBOL, 0); }
		public TerminalNode ROW_SYMBOL() { return getToken(SQLSelectParser.ROW_SYMBOL, 0); }
		public WindowFrameStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameStart; }
	}

	public final WindowFrameStartContext windowFrameStart() throws RecognitionException {
		WindowFrameStartContext _localctx = new WindowFrameStartContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_windowFrameStart);
		try {
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNBOUNDED_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				match(UNBOUNDED_SYMBOL);
				setState(580);
				match(PRECEDING_SYMBOL);
				}
				break;
			case INT_NUMBER:
			case DECIMAL_NUMBER:
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				ulonglong_number();
				setState(582);
				match(PRECEDING_SYMBOL);
				}
				break;
			case PARAM_MARKER:
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				match(PARAM_MARKER);
				setState(585);
				match(PRECEDING_SYMBOL);
				}
				break;
			case INTERVAL_SYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(586);
				match(INTERVAL_SYMBOL);
				setState(587);
				expr(0);
				setState(588);
				interval();
				setState(589);
				match(PRECEDING_SYMBOL);
				}
				break;
			case CURRENT_SYMBOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(591);
				match(CURRENT_SYMBOL);
				setState(592);
				match(ROW_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameBetweenContext extends ParserRuleContext {
		public TerminalNode BETWEEN_SYMBOL() { return getToken(SQLSelectParser.BETWEEN_SYMBOL, 0); }
		public List<WindowFrameBoundContext> windowFrameBound() {
			return getRuleContexts(WindowFrameBoundContext.class);
		}
		public WindowFrameBoundContext windowFrameBound(int i) {
			return getRuleContext(WindowFrameBoundContext.class,i);
		}
		public TerminalNode AND_SYMBOL() { return getToken(SQLSelectParser.AND_SYMBOL, 0); }
		public WindowFrameBetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameBetween; }
	}

	public final WindowFrameBetweenContext windowFrameBetween() throws RecognitionException {
		WindowFrameBetweenContext _localctx = new WindowFrameBetweenContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_windowFrameBetween);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(BETWEEN_SYMBOL);
			setState(596);
			windowFrameBound();
			setState(597);
			match(AND_SYMBOL);
			setState(598);
			windowFrameBound();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameBoundContext extends ParserRuleContext {
		public WindowFrameStartContext windowFrameStart() {
			return getRuleContext(WindowFrameStartContext.class,0);
		}
		public TerminalNode UNBOUNDED_SYMBOL() { return getToken(SQLSelectParser.UNBOUNDED_SYMBOL, 0); }
		public TerminalNode FOLLOWING_SYMBOL() { return getToken(SQLSelectParser.FOLLOWING_SYMBOL, 0); }
		public Ulonglong_numberContext ulonglong_number() {
			return getRuleContext(Ulonglong_numberContext.class,0);
		}
		public TerminalNode PARAM_MARKER() { return getToken(SQLSelectParser.PARAM_MARKER, 0); }
		public TerminalNode INTERVAL_SYMBOL() { return getToken(SQLSelectParser.INTERVAL_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public WindowFrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameBound; }
	}

	public final WindowFrameBoundContext windowFrameBound() throws RecognitionException {
		WindowFrameBoundContext _localctx = new WindowFrameBoundContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_windowFrameBound);
		try {
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				windowFrameStart();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				match(UNBOUNDED_SYMBOL);
				setState(602);
				match(FOLLOWING_SYMBOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(603);
				ulonglong_number();
				setState(604);
				match(FOLLOWING_SYMBOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(606);
				match(PARAM_MARKER);
				setState(607);
				match(FOLLOWING_SYMBOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(608);
				match(INTERVAL_SYMBOL);
				setState(609);
				expr(0);
				setState(610);
				interval();
				setState(611);
				match(FOLLOWING_SYMBOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameExclusionContext extends ParserRuleContext {
		public TerminalNode EXCLUDE_SYMBOL() { return getToken(SQLSelectParser.EXCLUDE_SYMBOL, 0); }
		public TerminalNode CURRENT_SYMBOL() { return getToken(SQLSelectParser.CURRENT_SYMBOL, 0); }
		public TerminalNode ROW_SYMBOL() { return getToken(SQLSelectParser.ROW_SYMBOL, 0); }
		public TerminalNode GROUP_SYMBOL() { return getToken(SQLSelectParser.GROUP_SYMBOL, 0); }
		public TerminalNode TIES_SYMBOL() { return getToken(SQLSelectParser.TIES_SYMBOL, 0); }
		public TerminalNode NO_SYMBOL() { return getToken(SQLSelectParser.NO_SYMBOL, 0); }
		public TerminalNode OTHERS_SYMBOL() { return getToken(SQLSelectParser.OTHERS_SYMBOL, 0); }
		public WindowFrameExclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrameExclusion; }
	}

	public final WindowFrameExclusionContext windowFrameExclusion() throws RecognitionException {
		WindowFrameExclusionContext _localctx = new WindowFrameExclusionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_windowFrameExclusion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(EXCLUDE_SYMBOL);
			setState(622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURRENT_SYMBOL:
				{
				setState(616);
				match(CURRENT_SYMBOL);
				setState(617);
				match(ROW_SYMBOL);
				}
				break;
			case GROUP_SYMBOL:
				{
				setState(618);
				match(GROUP_SYMBOL);
				}
				break;
			case TIES_SYMBOL:
				{
				setState(619);
				match(TIES_SYMBOL);
				}
				break;
			case NO_SYMBOL:
				{
				setState(620);
				match(NO_SYMBOL);
				setState(621);
				match(OTHERS_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode WITH_SYMBOL() { return getToken(SQLSelectParser.WITH_SYMBOL, 0); }
		public List<CommonTableExpressionContext> commonTableExpression() {
			return getRuleContexts(CommonTableExpressionContext.class);
		}
		public CommonTableExpressionContext commonTableExpression(int i) {
			return getRuleContext(CommonTableExpressionContext.class,i);
		}
		public TerminalNode RECURSIVE_SYMBOL() { return getToken(SQLSelectParser.RECURSIVE_SYMBOL, 0); }
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_withClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			match(WITH_SYMBOL);
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(625);
				match(RECURSIVE_SYMBOL);
				}
				break;
			}
			setState(628);
			commonTableExpression();
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(629);
				match(COMMA_SYMBOL);
				setState(630);
				commonTableExpression();
				}
				}
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommonTableExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS_SYMBOL() { return getToken(SQLSelectParser.AS_SYMBOL, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ColumnInternalRefListContext columnInternalRefList() {
			return getRuleContext(ColumnInternalRefListContext.class,0);
		}
		public CommonTableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commonTableExpression; }
	}

	public final CommonTableExpressionContext commonTableExpression() throws RecognitionException {
		CommonTableExpressionContext _localctx = new CommonTableExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_commonTableExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			identifier();
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR_SYMBOL) {
				{
				setState(637);
				columnInternalRefList();
				}
			}

			setState(640);
			match(AS_SYMBOL);
			setState(641);
			subquery();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP_SYMBOL() { return getToken(SQLSelectParser.GROUP_SYMBOL, 0); }
		public TerminalNode BY_SYMBOL() { return getToken(SQLSelectParser.BY_SYMBOL, 0); }
		public OrderListContext orderList() {
			return getRuleContext(OrderListContext.class,0);
		}
		public OlapOptionContext olapOption() {
			return getRuleContext(OlapOptionContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_groupByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			match(GROUP_SYMBOL);
			setState(644);
			match(BY_SYMBOL);
			setState(645);
			orderList();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_SYMBOL) {
				{
				setState(646);
				olapOption();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OlapOptionContext extends ParserRuleContext {
		public TerminalNode WITH_SYMBOL() { return getToken(SQLSelectParser.WITH_SYMBOL, 0); }
		public TerminalNode ROLLUP_SYMBOL() { return getToken(SQLSelectParser.ROLLUP_SYMBOL, 0); }
		public TerminalNode CUBE_SYMBOL() { return getToken(SQLSelectParser.CUBE_SYMBOL, 0); }
		public OlapOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_olapOption; }
	}

	public final OlapOptionContext olapOption() throws RecognitionException {
		OlapOptionContext _localctx = new OlapOptionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_olapOption);
		try {
			setState(653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649);
				match(WITH_SYMBOL);
				setState(650);
				match(ROLLUP_SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				match(WITH_SYMBOL);
				setState(652);
				match(CUBE_SYMBOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderClauseContext extends ParserRuleContext {
		public TerminalNode ORDER_SYMBOL() { return getToken(SQLSelectParser.ORDER_SYMBOL, 0); }
		public TerminalNode BY_SYMBOL() { return getToken(SQLSelectParser.BY_SYMBOL, 0); }
		public OrderListContext orderList() {
			return getRuleContext(OrderListContext.class,0);
		}
		public OrderClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderClause; }
	}

	public final OrderClauseContext orderClause() throws RecognitionException {
		OrderClauseContext _localctx = new OrderClauseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_orderClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(ORDER_SYMBOL);
			setState(656);
			match(BY_SYMBOL);
			setState(657);
			orderList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode ASC_SYMBOL() { return getToken(SQLSelectParser.ASC_SYMBOL, 0); }
		public TerminalNode DESC_SYMBOL() { return getToken(SQLSelectParser.DESC_SYMBOL, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			_la = _input.LA(1);
			if ( !(_la==ASC_SYMBOL || _la==DESC_SYMBOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM_SYMBOL() { return getToken(SQLSelectParser.FROM_SYMBOL, 0); }
		public TerminalNode DUAL_SYMBOL() { return getToken(SQLSelectParser.DUAL_SYMBOL, 0); }
		public TableReferenceListContext tableReferenceList() {
			return getRuleContext(TableReferenceListContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(FROM_SYMBOL);
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(662);
				match(DUAL_SYMBOL);
				}
				break;
			case 2:
				{
				setState(663);
				tableReferenceList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableReferenceListContext extends ParserRuleContext {
		public List<TableReferenceContext> tableReference() {
			return getRuleContexts(TableReferenceContext.class);
		}
		public TableReferenceContext tableReference(int i) {
			return getRuleContext(TableReferenceContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public TableReferenceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferenceList; }
	}

	public final TableReferenceListContext tableReferenceList() throws RecognitionException {
		TableReferenceListContext _localctx = new TableReferenceListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tableReferenceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(666);
			tableReference();
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(667);
				match(COMMA_SYMBOL);
				setState(668);
				tableReference();
				}
				}
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableValueConstructorContext extends ParserRuleContext {
		public TerminalNode VALUES_SYMBOL() { return getToken(SQLSelectParser.VALUES_SYMBOL, 0); }
		public List<RowValueExplicitContext> rowValueExplicit() {
			return getRuleContexts(RowValueExplicitContext.class);
		}
		public RowValueExplicitContext rowValueExplicit(int i) {
			return getRuleContext(RowValueExplicitContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public TableValueConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableValueConstructor; }
	}

	public final TableValueConstructorContext tableValueConstructor() throws RecognitionException {
		TableValueConstructorContext _localctx = new TableValueConstructorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tableValueConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(VALUES_SYMBOL);
			setState(675);
			rowValueExplicit();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(676);
				match(COMMA_SYMBOL);
				setState(677);
				rowValueExplicit();
				}
				}
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitTableContext extends ParserRuleContext {
		public TerminalNode TABLE_SYMBOL() { return getToken(SQLSelectParser.TABLE_SYMBOL, 0); }
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ExplicitTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitTable; }
	}

	public final ExplicitTableContext explicitTable() throws RecognitionException {
		ExplicitTableContext _localctx = new ExplicitTableContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_explicitTable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(TABLE_SYMBOL);
			setState(684);
			qualifiedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowValueExplicitContext extends ParserRuleContext {
		public TerminalNode ROW_SYMBOL() { return getToken(SQLSelectParser.ROW_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public RowValueExplicitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowValueExplicit; }
	}

	public final RowValueExplicitContext rowValueExplicit() throws RecognitionException {
		RowValueExplicitContext _localctx = new RowValueExplicitContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_rowValueExplicit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(ROW_SYMBOL);
			setState(687);
			match(OPEN_PAR_SYMBOL);
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_OPERATOR) | (1L << MINUS_OPERATOR) | (1L << LOGICAL_NOT_OPERATOR) | (1L << BITWISE_NOT_OPERATOR) | (1L << OPEN_PAR_SYMBOL) | (1L << OPEN_CURLY_SYMBOL) | (1L << AT_SIGN_SYMBOL) | (1L << AT_TEXT_SUFFIX) | (1L << AT_AT_SIGN_SYMBOL) | (1L << NULL2_SYMBOL) | (1L << PARAM_MARKER) | (1L << HEX_NUMBER) | (1L << BIN_NUMBER) | (1L << INT_NUMBER) | (1L << DECIMAL_NUMBER) | (1L << FLOAT_NUMBER) | (1L << TINYINT_SYMBOL) | (1L << SMALLINT_SYMBOL) | (1L << MEDIUMINT_SYMBOL) | (1L << INT_SYMBOL) | (1L << BIGINT_SYMBOL) | (1L << SECOND_SYMBOL) | (1L << MINUTE_SYMBOL) | (1L << HOUR_SYMBOL) | (1L << DAY_SYMBOL) | (1L << WEEK_SYMBOL) | (1L << MONTH_SYMBOL) | (1L << QUARTER_SYMBOL) | (1L << YEAR_SYMBOL) | (1L << DEFAULT_SYMBOL) | (1L << UNION_SYMBOL) | (1L << SELECT_SYMBOL) | (1L << ALL_SYMBOL) | (1L << DISTINCT_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRAIGHT_JOIN_SYMBOL - 64)) | (1L << (HIGH_PRIORITY_SYMBOL - 64)) | (1L << (SQL_SMALL_RESULT_SYMBOL - 64)) | (1L << (SQL_BIG_RESULT_SYMBOL - 64)) | (1L << (SQL_BUFFER_RESULT_SYMBOL - 64)) | (1L << (SQL_CALC_FOUND_ROWS_SYMBOL - 64)) | (1L << (LIMIT_SYMBOL - 64)) | (1L << (OFFSET_SYMBOL - 64)) | (1L << (INTO_SYMBOL - 64)) | (1L << (OUTFILE_SYMBOL - 64)) | (1L << (DUMPFILE_SYMBOL - 64)) | (1L << (PROCEDURE_SYMBOL - 64)) | (1L << (ANALYSE_SYMBOL - 64)) | (1L << (HAVING_SYMBOL - 64)) | (1L << (WINDOW_SYMBOL - 64)) | (1L << (AS_SYMBOL - 64)) | (1L << (PARTITION_SYMBOL - 64)) | (1L << (BY_SYMBOL - 64)) | (1L << (ROWS_SYMBOL - 64)) | (1L << (RANGE_SYMBOL - 64)) | (1L << (GROUPS_SYMBOL - 64)) | (1L << (UNBOUNDED_SYMBOL - 64)) | (1L << (PRECEDING_SYMBOL - 64)) | (1L << (INTERVAL_SYMBOL - 64)) | (1L << (CURRENT_SYMBOL - 64)) | (1L << (ROW_SYMBOL - 64)) | (1L << (BETWEEN_SYMBOL - 64)) | (1L << (AND_SYMBOL - 64)) | (1L << (FOLLOWING_SYMBOL - 64)) | (1L << (EXCLUDE_SYMBOL - 64)) | (1L << (GROUP_SYMBOL - 64)) | (1L << (TIES_SYMBOL - 64)) | (1L << (NO_SYMBOL - 64)) | (1L << (OTHERS_SYMBOL - 64)) | (1L << (WITH_SYMBOL - 64)) | (1L << (RECURSIVE_SYMBOL - 64)) | (1L << (ROLLUP_SYMBOL - 64)) | (1L << (CUBE_SYMBOL - 64)) | (1L << (ORDER_SYMBOL - 64)) | (1L << (ASC_SYMBOL - 64)) | (1L << (DESC_SYMBOL - 64)) | (1L << (FROM_SYMBOL - 64)) | (1L << (DUAL_SYMBOL - 64)) | (1L << (VALUES_SYMBOL - 64)) | (1L << (TABLE_SYMBOL - 64)) | (1L << (SQL_NO_CACHE_SYMBOL - 64)) | (1L << (SQL_CACHE_SYMBOL - 64)) | (1L << (MAX_STATEMENT_TIME_SYMBOL - 64)) | (1L << (FOR_SYMBOL - 64)) | (1L << (OF_SYMBOL - 64)) | (1L << (LOCK_SYMBOL - 64)) | (1L << (IN_SYMBOL - 64)) | (1L << (SHARE_SYMBOL - 64)) | (1L << (MODE_SYMBOL - 64)) | (1L << (UPDATE_SYMBOL - 64)) | (1L << (SKIP_SYMBOL - 64)) | (1L << (LOCKED_SYMBOL - 64)) | (1L << (NOWAIT_SYMBOL - 64)) | (1L << (WHERE_SYMBOL - 64)) | (1L << (OJ_SYMBOL - 64)) | (1L << (ON_SYMBOL - 64)) | (1L << (USING_SYMBOL - 64)) | (1L << (NATURAL_SYMBOL - 64)) | (1L << (INNER_SYMBOL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (JOIN_SYMBOL - 128)) | (1L << (LEFT_SYMBOL - 128)) | (1L << (RIGHT_SYMBOL - 128)) | (1L << (OUTER_SYMBOL - 128)) | (1L << (CROSS_SYMBOL - 128)) | (1L << (LATERAL_SYMBOL - 128)) | (1L << (JSON_TABLE_SYMBOL - 128)) | (1L << (COLUMNS_SYMBOL - 128)) | (1L << (ORDINALITY_SYMBOL - 128)) | (1L << (EXISTS_SYMBOL - 128)) | (1L << (PATH_SYMBOL - 128)) | (1L << (NESTED_SYMBOL - 128)) | (1L << (EMPTY_SYMBOL - 128)) | (1L << (ERROR_SYMBOL - 128)) | (1L << (NULL_SYMBOL - 128)) | (1L << (USE_SYMBOL - 128)) | (1L << (FORCE_SYMBOL - 128)) | (1L << (IGNORE_SYMBOL - 128)) | (1L << (KEY_SYMBOL - 128)) | (1L << (INDEX_SYMBOL - 128)) | (1L << (PRIMARY_SYMBOL - 128)) | (1L << (IS_SYMBOL - 128)) | (1L << (TRUE_SYMBOL - 128)) | (1L << (FALSE_SYMBOL - 128)) | (1L << (UNKNOWN_SYMBOL - 128)) | (1L << (NOT_SYMBOL - 128)) | (1L << (XOR_SYMBOL - 128)) | (1L << (OR_SYMBOL - 128)) | (1L << (ANY_SYMBOL - 128)) | (1L << (MEMBER_SYMBOL - 128)) | (1L << (SOUNDS_SYMBOL - 128)) | (1L << (LIKE_SYMBOL - 128)) | (1L << (ESCAPE_SYMBOL - 128)) | (1L << (REGEXP_SYMBOL - 128)) | (1L << (DIV_SYMBOL - 128)) | (1L << (MOD_SYMBOL - 128)) | (1L << (MATCH_SYMBOL - 128)) | (1L << (AGAINST_SYMBOL - 128)) | (1L << (BINARY_SYMBOL - 128)) | (1L << (CAST_SYMBOL - 128)) | (1L << (ARRAY_SYMBOL - 128)) | (1L << (CASE_SYMBOL - 128)) | (1L << (END_SYMBOL - 128)) | (1L << (CONVERT_SYMBOL - 128)) | (1L << (COLLATE_SYMBOL - 128)) | (1L << (AVG_SYMBOL - 128)) | (1L << (BIT_AND_SYMBOL - 128)) | (1L << (BIT_OR_SYMBOL - 128)) | (1L << (BIT_XOR_SYMBOL - 128)) | (1L << (COUNT_SYMBOL - 128)) | (1L << (MIN_SYMBOL - 128)) | (1L << (MAX_SYMBOL - 128)) | (1L << (STD_SYMBOL - 128)) | (1L << (VARIANCE_SYMBOL - 128)) | (1L << (STDDEV_SAMP_SYMBOL - 128)) | (1L << (VAR_SAMP_SYMBOL - 128)) | (1L << (SUM_SYMBOL - 128)) | (1L << (GROUP_CONCAT_SYMBOL - 128)) | (1L << (SEPARATOR_SYMBOL - 128)) | (1L << (GROUPING_SYMBOL - 128)) | (1L << (ROW_NUMBER_SYMBOL - 128)) | (1L << (RANK_SYMBOL - 128)) | (1L << (DENSE_RANK_SYMBOL - 128)) | (1L << (CUME_DIST_SYMBOL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (PERCENT_RANK_SYMBOL - 192)) | (1L << (NTILE_SYMBOL - 192)) | (1L << (LEAD_SYMBOL - 192)) | (1L << (LAG_SYMBOL - 192)) | (1L << (FIRST_VALUE_SYMBOL - 192)) | (1L << (LAST_VALUE_SYMBOL - 192)) | (1L << (NTH_VALUE_SYMBOL - 192)) | (1L << (FIRST_SYMBOL - 192)) | (1L << (LAST_SYMBOL - 192)) | (1L << (OVER_SYMBOL - 192)) | (1L << (RESPECT_SYMBOL - 192)) | (1L << (NULLS_SYMBOL - 192)) | (1L << (JSON_ARRAYAGG_SYMBOL - 192)) | (1L << (JSON_OBJECTAGG_SYMBOL - 192)) | (1L << (BOOLEAN_SYMBOL - 192)) | (1L << (LANGUAGE_SYMBOL - 192)) | (1L << (QUERY_SYMBOL - 192)) | (1L << (EXPANSION_SYMBOL - 192)) | (1L << (CHAR_SYMBOL - 192)) | (1L << (CURRENT_USER_SYMBOL - 192)) | (1L << (DATE_SYMBOL - 192)) | (1L << (INSERT_SYMBOL - 192)) | (1L << (TIME_SYMBOL - 192)) | (1L << (TIMESTAMP_SYMBOL - 192)) | (1L << (USER_SYMBOL - 192)) | (1L << (ADDDATE_SYMBOL - 192)) | (1L << (SUBDATE_SYMBOL - 192)) | (1L << (CURDATE_SYMBOL - 192)) | (1L << (CURTIME_SYMBOL - 192)) | (1L << (DATE_ADD_SYMBOL - 192)) | (1L << (DATE_SUB_SYMBOL - 192)) | (1L << (EXTRACT_SYMBOL - 192)) | (1L << (GET_FORMAT_SYMBOL - 192)) | (1L << (NOW_SYMBOL - 192)) | (1L << (POSITION_SYMBOL - 192)) | (1L << (SYSDATE_SYMBOL - 192)) | (1L << (TIMESTAMP_ADD_SYMBOL - 192)) | (1L << (TIMESTAMP_DIFF_SYMBOL - 192)) | (1L << (UTC_DATE_SYMBOL - 192)) | (1L << (UTC_TIME_SYMBOL - 192)) | (1L << (UTC_TIMESTAMP_SYMBOL - 192)) | (1L << (ASCII_SYMBOL - 192)) | (1L << (CHARSET_SYMBOL - 192)) | (1L << (COALESCE_SYMBOL - 192)) | (1L << (COLLATION_SYMBOL - 192)) | (1L << (DATABASE_SYMBOL - 192)) | (1L << (IF_SYMBOL - 192)) | (1L << (FORMAT_SYMBOL - 192)) | (1L << (MICROSECOND_SYMBOL - 192)) | (1L << (OLD_PASSWORD_SYMBOL - 192)) | (1L << (PASSWORD_SYMBOL - 192)) | (1L << (REPEAT_SYMBOL - 192)) | (1L << (REPLACE_SYMBOL - 192)) | (1L << (REVERSE_SYMBOL - 192)) | (1L << (ROW_COUNT_SYMBOL - 192)) | (1L << (TRUNCATE_SYMBOL - 192)) | (1L << (WEIGHT_STRING_SYMBOL - 192)) | (1L << (CONTAINS_SYMBOL - 192)) | (1L << (GEOMETRYCOLLECTION_SYMBOL - 192)) | (1L << (LINESTRING_SYMBOL - 192)) | (1L << (MULTILINESTRING_SYMBOL - 192)) | (1L << (MULTIPOINT_SYMBOL - 192)) | (1L << (MULTIPOLYGON_SYMBOL - 192)) | (1L << (POINT_SYMBOL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (POLYGON_SYMBOL - 256)) | (1L << (LEVEL_SYMBOL - 256)) | (1L << (DATETIME_SYMBOL - 256)) | (1L << (TRIM_SYMBOL - 256)) | (1L << (LEADING_SYMBOL - 256)) | (1L << (TRAILING_SYMBOL - 256)) | (1L << (BOTH_SYMBOL - 256)) | (1L << (SUBSTRING_SYMBOL - 256)) | (1L << (WHEN_SYMBOL - 256)) | (1L << (THEN_SYMBOL - 256)) | (1L << (ELSE_SYMBOL - 256)) | (1L << (SIGNED_SYMBOL - 256)) | (1L << (UNSIGNED_SYMBOL - 256)) | (1L << (DECIMAL_SYMBOL - 256)) | (1L << (JSON_SYMBOL - 256)) | (1L << (FLOAT_SYMBOL - 256)) | (1L << (SET_SYMBOL - 256)) | (1L << (SECOND_MICROSECOND_SYMBOL - 256)) | (1L << (MINUTE_MICROSECOND_SYMBOL - 256)) | (1L << (MINUTE_SECOND_SYMBOL - 256)) | (1L << (HOUR_MICROSECOND_SYMBOL - 256)) | (1L << (HOUR_SECOND_SYMBOL - 256)) | (1L << (HOUR_MINUTE_SYMBOL - 256)) | (1L << (DAY_MICROSECOND_SYMBOL - 256)) | (1L << (DAY_SECOND_SYMBOL - 256)) | (1L << (DAY_MINUTE_SYMBOL - 256)) | (1L << (DAY_HOUR_SYMBOL - 256)) | (1L << (YEAR_MONTH_SYMBOL - 256)) | (1L << (BTREE_SYMBOL - 256)) | (1L << (RTREE_SYMBOL - 256)) | (1L << (HASH_SYMBOL - 256)) | (1L << (REAL_SYMBOL - 256)) | (1L << (DOUBLE_SYMBOL - 256)) | (1L << (PRECISION_SYMBOL - 256)) | (1L << (NUMERIC_SYMBOL - 256)) | (1L << (FIXED_SYMBOL - 256)) | (1L << (BIT_SYMBOL - 256)) | (1L << (BOOL_SYMBOL - 256)) | (1L << (VARYING_SYMBOL - 256)) | (1L << (VARCHAR_SYMBOL - 256)) | (1L << (NATIONAL_SYMBOL - 256)) | (1L << (NVARCHAR_SYMBOL - 256)) | (1L << (NCHAR_SYMBOL - 256)) | (1L << (VARBINARY_SYMBOL - 256)) | (1L << (TINYBLOB_SYMBOL - 256)) | (1L << (BLOB_SYMBOL - 256)) | (1L << (MEDIUMBLOB_SYMBOL - 256)) | (1L << (LONGBLOB_SYMBOL - 256)) | (1L << (LONG_SYMBOL - 256)) | (1L << (TINYTEXT_SYMBOL - 256)) | (1L << (TEXT_SYMBOL - 256)) | (1L << (MEDIUMTEXT_SYMBOL - 256)) | (1L << (LONGTEXT_SYMBOL - 256)) | (1L << (ENUM_SYMBOL - 256)) | (1L << (SERIAL_SYMBOL - 256)) | (1L << (GEOMETRY_SYMBOL - 256)) | (1L << (ZEROFILL_SYMBOL - 256)) | (1L << (BYTE_SYMBOL - 256)) | (1L << (UNICODE_SYMBOL - 256)) | (1L << (TERMINATED_SYMBOL - 256)) | (1L << (OPTIONALLY_SYMBOL - 256)) | (1L << (ENCLOSED_SYMBOL - 256)) | (1L << (ESCAPED_SYMBOL - 256)) | (1L << (LINES_SYMBOL - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (STARTING_SYMBOL - 320)) | (1L << (GLOBAL_SYMBOL - 320)) | (1L << (LOCAL_SYMBOL - 320)) | (1L << (SESSION_SYMBOL - 320)) | (1L << (UNDERSCORE_CHARSET - 320)) | (1L << (IDENTIFIER - 320)) | (1L << (NCHAR_TEXT - 320)) | (1L << (BACK_TICK_QUOTED_ID - 320)) | (1L << (DOUBLE_QUOTED_TEXT - 320)) | (1L << (SINGLE_QUOTED_TEXT - 320)) | (1L << (BRACKET_QUOTED_TEXT - 320)))) != 0)) {
				{
				setState(688);
				values();
				}
			}

			setState(691);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectOptionContext extends ParserRuleContext {
		public QuerySpecOptionContext querySpecOption() {
			return getRuleContext(QuerySpecOptionContext.class,0);
		}
		public TerminalNode SQL_NO_CACHE_SYMBOL() { return getToken(SQLSelectParser.SQL_NO_CACHE_SYMBOL, 0); }
		public TerminalNode SQL_CACHE_SYMBOL() { return getToken(SQLSelectParser.SQL_CACHE_SYMBOL, 0); }
		public TerminalNode MAX_STATEMENT_TIME_SYMBOL() { return getToken(SQLSelectParser.MAX_STATEMENT_TIME_SYMBOL, 0); }
		public TerminalNode EQUAL_OPERATOR() { return getToken(SQLSelectParser.EQUAL_OPERATOR, 0); }
		public Real_ulong_numberContext real_ulong_number() {
			return getRuleContext(Real_ulong_numberContext.class,0);
		}
		public SelectOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectOption; }
	}

	public final SelectOptionContext selectOption() throws RecognitionException {
		SelectOptionContext _localctx = new SelectOptionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_selectOption);
		try {
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL_SYMBOL:
			case DISTINCT_SYMBOL:
			case STRAIGHT_JOIN_SYMBOL:
			case HIGH_PRIORITY_SYMBOL:
			case SQL_SMALL_RESULT_SYMBOL:
			case SQL_BIG_RESULT_SYMBOL:
			case SQL_BUFFER_RESULT_SYMBOL:
			case SQL_CALC_FOUND_ROWS_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				querySpecOption();
				}
				break;
			case SQL_NO_CACHE_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				match(SQL_NO_CACHE_SYMBOL);
				}
				break;
			case SQL_CACHE_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(695);
				match(SQL_CACHE_SYMBOL);
				}
				break;
			case MAX_STATEMENT_TIME_SYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(696);
				match(MAX_STATEMENT_TIME_SYMBOL);
				setState(697);
				match(EQUAL_OPERATOR);
				setState(698);
				real_ulong_number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LockingClauseListContext extends ParserRuleContext {
		public List<LockingClauseContext> lockingClause() {
			return getRuleContexts(LockingClauseContext.class);
		}
		public LockingClauseContext lockingClause(int i) {
			return getRuleContext(LockingClauseContext.class,i);
		}
		public LockingClauseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockingClauseList; }
	}

	public final LockingClauseListContext lockingClauseList() throws RecognitionException {
		LockingClauseListContext _localctx = new LockingClauseListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_lockingClauseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(701);
				lockingClause();
				}
				}
				setState(704); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FOR_SYMBOL || _la==LOCK_SYMBOL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LockingClauseContext extends ParserRuleContext {
		public TerminalNode FOR_SYMBOL() { return getToken(SQLSelectParser.FOR_SYMBOL, 0); }
		public LockStrenghContext lockStrengh() {
			return getRuleContext(LockStrenghContext.class,0);
		}
		public TerminalNode OF_SYMBOL() { return getToken(SQLSelectParser.OF_SYMBOL, 0); }
		public TableAliasRefListContext tableAliasRefList() {
			return getRuleContext(TableAliasRefListContext.class,0);
		}
		public LockedRowActionContext lockedRowAction() {
			return getRuleContext(LockedRowActionContext.class,0);
		}
		public TerminalNode LOCK_SYMBOL() { return getToken(SQLSelectParser.LOCK_SYMBOL, 0); }
		public TerminalNode IN_SYMBOL() { return getToken(SQLSelectParser.IN_SYMBOL, 0); }
		public TerminalNode SHARE_SYMBOL() { return getToken(SQLSelectParser.SHARE_SYMBOL, 0); }
		public TerminalNode MODE_SYMBOL() { return getToken(SQLSelectParser.MODE_SYMBOL, 0); }
		public LockingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockingClause; }
	}

	public final LockingClauseContext lockingClause() throws RecognitionException {
		LockingClauseContext _localctx = new LockingClauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_lockingClause);
		int _la;
		try {
			setState(719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				match(FOR_SYMBOL);
				setState(707);
				lockStrengh();
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OF_SYMBOL) {
					{
					setState(708);
					match(OF_SYMBOL);
					setState(709);
					tableAliasRefList();
					}
				}

				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SKIP_SYMBOL || _la==NOWAIT_SYMBOL) {
					{
					setState(712);
					lockedRowAction();
					}
				}

				}
				break;
			case LOCK_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				match(LOCK_SYMBOL);
				setState(716);
				match(IN_SYMBOL);
				setState(717);
				match(SHARE_SYMBOL);
				setState(718);
				match(MODE_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LockStrenghContext extends ParserRuleContext {
		public TerminalNode UPDATE_SYMBOL() { return getToken(SQLSelectParser.UPDATE_SYMBOL, 0); }
		public TerminalNode SHARE_SYMBOL() { return getToken(SQLSelectParser.SHARE_SYMBOL, 0); }
		public LockStrenghContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockStrengh; }
	}

	public final LockStrenghContext lockStrengh() throws RecognitionException {
		LockStrenghContext _localctx = new LockStrenghContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_lockStrengh);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			_la = _input.LA(1);
			if ( !(_la==SHARE_SYMBOL || _la==UPDATE_SYMBOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LockedRowActionContext extends ParserRuleContext {
		public TerminalNode SKIP_SYMBOL() { return getToken(SQLSelectParser.SKIP_SYMBOL, 0); }
		public TerminalNode LOCKED_SYMBOL() { return getToken(SQLSelectParser.LOCKED_SYMBOL, 0); }
		public TerminalNode NOWAIT_SYMBOL() { return getToken(SQLSelectParser.NOWAIT_SYMBOL, 0); }
		public LockedRowActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lockedRowAction; }
	}

	public final LockedRowActionContext lockedRowAction() throws RecognitionException {
		LockedRowActionContext _localctx = new LockedRowActionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_lockedRowAction);
		try {
			setState(726);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SKIP_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				match(SKIP_SYMBOL);
				setState(724);
				match(LOCKED_SYMBOL);
				}
				break;
			case NOWAIT_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(725);
				match(NOWAIT_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemListContext extends ParserRuleContext {
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public TerminalNode MULT_OPERATOR() { return getToken(SQLSelectParser.MULT_OPERATOR, 0); }
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public SelectItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItemList; }
	}

	public final SelectItemListContext selectItemList() throws RecognitionException {
		SelectItemListContext _localctx = new SelectItemListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_selectItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS_OPERATOR:
			case MINUS_OPERATOR:
			case LOGICAL_NOT_OPERATOR:
			case BITWISE_NOT_OPERATOR:
			case OPEN_PAR_SYMBOL:
			case OPEN_CURLY_SYMBOL:
			case AT_SIGN_SYMBOL:
			case AT_TEXT_SUFFIX:
			case AT_AT_SIGN_SYMBOL:
			case NULL2_SYMBOL:
			case PARAM_MARKER:
			case HEX_NUMBER:
			case BIN_NUMBER:
			case INT_NUMBER:
			case DECIMAL_NUMBER:
			case FLOAT_NUMBER:
			case TINYINT_SYMBOL:
			case SMALLINT_SYMBOL:
			case MEDIUMINT_SYMBOL:
			case INT_SYMBOL:
			case BIGINT_SYMBOL:
			case SECOND_SYMBOL:
			case MINUTE_SYMBOL:
			case HOUR_SYMBOL:
			case DAY_SYMBOL:
			case WEEK_SYMBOL:
			case MONTH_SYMBOL:
			case QUARTER_SYMBOL:
			case YEAR_SYMBOL:
			case DEFAULT_SYMBOL:
			case UNION_SYMBOL:
			case SELECT_SYMBOL:
			case ALL_SYMBOL:
			case DISTINCT_SYMBOL:
			case STRAIGHT_JOIN_SYMBOL:
			case HIGH_PRIORITY_SYMBOL:
			case SQL_SMALL_RESULT_SYMBOL:
			case SQL_BIG_RESULT_SYMBOL:
			case SQL_BUFFER_RESULT_SYMBOL:
			case SQL_CALC_FOUND_ROWS_SYMBOL:
			case LIMIT_SYMBOL:
			case OFFSET_SYMBOL:
			case INTO_SYMBOL:
			case OUTFILE_SYMBOL:
			case DUMPFILE_SYMBOL:
			case PROCEDURE_SYMBOL:
			case ANALYSE_SYMBOL:
			case HAVING_SYMBOL:
			case WINDOW_SYMBOL:
			case AS_SYMBOL:
			case PARTITION_SYMBOL:
			case BY_SYMBOL:
			case ROWS_SYMBOL:
			case RANGE_SYMBOL:
			case GROUPS_SYMBOL:
			case UNBOUNDED_SYMBOL:
			case PRECEDING_SYMBOL:
			case INTERVAL_SYMBOL:
			case CURRENT_SYMBOL:
			case ROW_SYMBOL:
			case BETWEEN_SYMBOL:
			case AND_SYMBOL:
			case FOLLOWING_SYMBOL:
			case EXCLUDE_SYMBOL:
			case GROUP_SYMBOL:
			case TIES_SYMBOL:
			case NO_SYMBOL:
			case OTHERS_SYMBOL:
			case WITH_SYMBOL:
			case RECURSIVE_SYMBOL:
			case ROLLUP_SYMBOL:
			case CUBE_SYMBOL:
			case ORDER_SYMBOL:
			case ASC_SYMBOL:
			case DESC_SYMBOL:
			case FROM_SYMBOL:
			case DUAL_SYMBOL:
			case VALUES_SYMBOL:
			case TABLE_SYMBOL:
			case SQL_NO_CACHE_SYMBOL:
			case SQL_CACHE_SYMBOL:
			case MAX_STATEMENT_TIME_SYMBOL:
			case FOR_SYMBOL:
			case OF_SYMBOL:
			case LOCK_SYMBOL:
			case IN_SYMBOL:
			case SHARE_SYMBOL:
			case MODE_SYMBOL:
			case UPDATE_SYMBOL:
			case SKIP_SYMBOL:
			case LOCKED_SYMBOL:
			case NOWAIT_SYMBOL:
			case WHERE_SYMBOL:
			case OJ_SYMBOL:
			case ON_SYMBOL:
			case USING_SYMBOL:
			case NATURAL_SYMBOL:
			case INNER_SYMBOL:
			case JOIN_SYMBOL:
			case LEFT_SYMBOL:
			case RIGHT_SYMBOL:
			case OUTER_SYMBOL:
			case CROSS_SYMBOL:
			case LATERAL_SYMBOL:
			case JSON_TABLE_SYMBOL:
			case COLUMNS_SYMBOL:
			case ORDINALITY_SYMBOL:
			case EXISTS_SYMBOL:
			case PATH_SYMBOL:
			case NESTED_SYMBOL:
			case EMPTY_SYMBOL:
			case ERROR_SYMBOL:
			case NULL_SYMBOL:
			case USE_SYMBOL:
			case FORCE_SYMBOL:
			case IGNORE_SYMBOL:
			case KEY_SYMBOL:
			case INDEX_SYMBOL:
			case PRIMARY_SYMBOL:
			case IS_SYMBOL:
			case TRUE_SYMBOL:
			case FALSE_SYMBOL:
			case UNKNOWN_SYMBOL:
			case NOT_SYMBOL:
			case XOR_SYMBOL:
			case OR_SYMBOL:
			case ANY_SYMBOL:
			case MEMBER_SYMBOL:
			case SOUNDS_SYMBOL:
			case LIKE_SYMBOL:
			case ESCAPE_SYMBOL:
			case REGEXP_SYMBOL:
			case DIV_SYMBOL:
			case MOD_SYMBOL:
			case MATCH_SYMBOL:
			case AGAINST_SYMBOL:
			case BINARY_SYMBOL:
			case CAST_SYMBOL:
			case ARRAY_SYMBOL:
			case CASE_SYMBOL:
			case END_SYMBOL:
			case CONVERT_SYMBOL:
			case COLLATE_SYMBOL:
			case AVG_SYMBOL:
			case BIT_AND_SYMBOL:
			case BIT_OR_SYMBOL:
			case BIT_XOR_SYMBOL:
			case COUNT_SYMBOL:
			case MIN_SYMBOL:
			case MAX_SYMBOL:
			case STD_SYMBOL:
			case VARIANCE_SYMBOL:
			case STDDEV_SAMP_SYMBOL:
			case VAR_SAMP_SYMBOL:
			case SUM_SYMBOL:
			case GROUP_CONCAT_SYMBOL:
			case SEPARATOR_SYMBOL:
			case GROUPING_SYMBOL:
			case ROW_NUMBER_SYMBOL:
			case RANK_SYMBOL:
			case DENSE_RANK_SYMBOL:
			case CUME_DIST_SYMBOL:
			case PERCENT_RANK_SYMBOL:
			case NTILE_SYMBOL:
			case LEAD_SYMBOL:
			case LAG_SYMBOL:
			case FIRST_VALUE_SYMBOL:
			case LAST_VALUE_SYMBOL:
			case NTH_VALUE_SYMBOL:
			case FIRST_SYMBOL:
			case LAST_SYMBOL:
			case OVER_SYMBOL:
			case RESPECT_SYMBOL:
			case NULLS_SYMBOL:
			case JSON_ARRAYAGG_SYMBOL:
			case JSON_OBJECTAGG_SYMBOL:
			case BOOLEAN_SYMBOL:
			case LANGUAGE_SYMBOL:
			case QUERY_SYMBOL:
			case EXPANSION_SYMBOL:
			case CHAR_SYMBOL:
			case CURRENT_USER_SYMBOL:
			case DATE_SYMBOL:
			case INSERT_SYMBOL:
			case TIME_SYMBOL:
			case TIMESTAMP_SYMBOL:
			case USER_SYMBOL:
			case ADDDATE_SYMBOL:
			case SUBDATE_SYMBOL:
			case CURDATE_SYMBOL:
			case CURTIME_SYMBOL:
			case DATE_ADD_SYMBOL:
			case DATE_SUB_SYMBOL:
			case EXTRACT_SYMBOL:
			case GET_FORMAT_SYMBOL:
			case NOW_SYMBOL:
			case POSITION_SYMBOL:
			case SYSDATE_SYMBOL:
			case TIMESTAMP_ADD_SYMBOL:
			case TIMESTAMP_DIFF_SYMBOL:
			case UTC_DATE_SYMBOL:
			case UTC_TIME_SYMBOL:
			case UTC_TIMESTAMP_SYMBOL:
			case ASCII_SYMBOL:
			case CHARSET_SYMBOL:
			case COALESCE_SYMBOL:
			case COLLATION_SYMBOL:
			case DATABASE_SYMBOL:
			case IF_SYMBOL:
			case FORMAT_SYMBOL:
			case MICROSECOND_SYMBOL:
			case OLD_PASSWORD_SYMBOL:
			case PASSWORD_SYMBOL:
			case REPEAT_SYMBOL:
			case REPLACE_SYMBOL:
			case REVERSE_SYMBOL:
			case ROW_COUNT_SYMBOL:
			case TRUNCATE_SYMBOL:
			case WEIGHT_STRING_SYMBOL:
			case CONTAINS_SYMBOL:
			case GEOMETRYCOLLECTION_SYMBOL:
			case LINESTRING_SYMBOL:
			case MULTILINESTRING_SYMBOL:
			case MULTIPOINT_SYMBOL:
			case MULTIPOLYGON_SYMBOL:
			case POINT_SYMBOL:
			case POLYGON_SYMBOL:
			case LEVEL_SYMBOL:
			case DATETIME_SYMBOL:
			case TRIM_SYMBOL:
			case LEADING_SYMBOL:
			case TRAILING_SYMBOL:
			case BOTH_SYMBOL:
			case SUBSTRING_SYMBOL:
			case WHEN_SYMBOL:
			case THEN_SYMBOL:
			case ELSE_SYMBOL:
			case SIGNED_SYMBOL:
			case UNSIGNED_SYMBOL:
			case DECIMAL_SYMBOL:
			case JSON_SYMBOL:
			case FLOAT_SYMBOL:
			case SET_SYMBOL:
			case SECOND_MICROSECOND_SYMBOL:
			case MINUTE_MICROSECOND_SYMBOL:
			case MINUTE_SECOND_SYMBOL:
			case HOUR_MICROSECOND_SYMBOL:
			case HOUR_SECOND_SYMBOL:
			case HOUR_MINUTE_SYMBOL:
			case DAY_MICROSECOND_SYMBOL:
			case DAY_SECOND_SYMBOL:
			case DAY_MINUTE_SYMBOL:
			case DAY_HOUR_SYMBOL:
			case YEAR_MONTH_SYMBOL:
			case BTREE_SYMBOL:
			case RTREE_SYMBOL:
			case HASH_SYMBOL:
			case REAL_SYMBOL:
			case DOUBLE_SYMBOL:
			case PRECISION_SYMBOL:
			case NUMERIC_SYMBOL:
			case FIXED_SYMBOL:
			case BIT_SYMBOL:
			case BOOL_SYMBOL:
			case VARYING_SYMBOL:
			case VARCHAR_SYMBOL:
			case NATIONAL_SYMBOL:
			case NVARCHAR_SYMBOL:
			case NCHAR_SYMBOL:
			case VARBINARY_SYMBOL:
			case TINYBLOB_SYMBOL:
			case BLOB_SYMBOL:
			case MEDIUMBLOB_SYMBOL:
			case LONGBLOB_SYMBOL:
			case LONG_SYMBOL:
			case TINYTEXT_SYMBOL:
			case TEXT_SYMBOL:
			case MEDIUMTEXT_SYMBOL:
			case LONGTEXT_SYMBOL:
			case ENUM_SYMBOL:
			case SERIAL_SYMBOL:
			case GEOMETRY_SYMBOL:
			case ZEROFILL_SYMBOL:
			case BYTE_SYMBOL:
			case UNICODE_SYMBOL:
			case TERMINATED_SYMBOL:
			case OPTIONALLY_SYMBOL:
			case ENCLOSED_SYMBOL:
			case ESCAPED_SYMBOL:
			case LINES_SYMBOL:
			case STARTING_SYMBOL:
			case GLOBAL_SYMBOL:
			case LOCAL_SYMBOL:
			case SESSION_SYMBOL:
			case UNDERSCORE_CHARSET:
			case IDENTIFIER:
			case NCHAR_TEXT:
			case BACK_TICK_QUOTED_ID:
			case DOUBLE_QUOTED_TEXT:
			case SINGLE_QUOTED_TEXT:
			case BRACKET_QUOTED_TEXT:
				{
				setState(728);
				selectItem();
				}
				break;
			case MULT_OPERATOR:
				{
				setState(729);
				match(MULT_OPERATOR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(732);
				match(COMMA_SYMBOL);
				setState(733);
				selectItem();
				}
				}
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemContext extends ParserRuleContext {
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public SelectAliasContext selectAlias() {
			return getRuleContext(SelectAliasContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_selectItem);
		try {
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				qualifiedIdentifier();
				setState(741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(740);
					selectAlias();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(743);
				expr(0);
				setState(745);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(744);
					selectAlias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectAliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TextStringLiteralContext textStringLiteral() {
			return getRuleContext(TextStringLiteralContext.class,0);
		}
		public TerminalNode AS_SYMBOL() { return getToken(SQLSelectParser.AS_SYMBOL, 0); }
		public SelectAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectAlias; }
	}

	public final SelectAliasContext selectAlias() throws RecognitionException {
		SelectAliasContext _localctx = new SelectAliasContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_selectAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(749);
				match(AS_SYMBOL);
				}
				break;
			}
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(752);
				identifier();
				}
				break;
			case 2:
				{
				setState(753);
				textStringLiteral();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE_SYMBOL() { return getToken(SQLSelectParser.WHERE_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(WHERE_SYMBOL);
			setState(757);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableReferenceContext extends ParserRuleContext {
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public TerminalNode OPEN_CURLY_SYMBOL() { return getToken(SQLSelectParser.OPEN_CURLY_SYMBOL, 0); }
		public EscapedTableReferenceContext escapedTableReference() {
			return getRuleContext(EscapedTableReferenceContext.class,0);
		}
		public TerminalNode CLOSE_CURLY_SYMBOL() { return getToken(SQLSelectParser.CLOSE_CURLY_SYMBOL, 0); }
		public List<JoinedTableContext> joinedTable() {
			return getRuleContexts(JoinedTableContext.class);
		}
		public JoinedTableContext joinedTable(int i) {
			return getRuleContext(JoinedTableContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OJ_SYMBOL() { return getToken(SQLSelectParser.OJ_SYMBOL, 0); }
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_tableReference);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR_SYMBOL:
			case TINYINT_SYMBOL:
			case SMALLINT_SYMBOL:
			case MEDIUMINT_SYMBOL:
			case INT_SYMBOL:
			case BIGINT_SYMBOL:
			case SECOND_SYMBOL:
			case MINUTE_SYMBOL:
			case HOUR_SYMBOL:
			case DAY_SYMBOL:
			case WEEK_SYMBOL:
			case MONTH_SYMBOL:
			case QUARTER_SYMBOL:
			case YEAR_SYMBOL:
			case DEFAULT_SYMBOL:
			case UNION_SYMBOL:
			case SELECT_SYMBOL:
			case ALL_SYMBOL:
			case DISTINCT_SYMBOL:
			case STRAIGHT_JOIN_SYMBOL:
			case HIGH_PRIORITY_SYMBOL:
			case SQL_SMALL_RESULT_SYMBOL:
			case SQL_BIG_RESULT_SYMBOL:
			case SQL_BUFFER_RESULT_SYMBOL:
			case SQL_CALC_FOUND_ROWS_SYMBOL:
			case LIMIT_SYMBOL:
			case OFFSET_SYMBOL:
			case INTO_SYMBOL:
			case OUTFILE_SYMBOL:
			case DUMPFILE_SYMBOL:
			case PROCEDURE_SYMBOL:
			case ANALYSE_SYMBOL:
			case HAVING_SYMBOL:
			case WINDOW_SYMBOL:
			case AS_SYMBOL:
			case PARTITION_SYMBOL:
			case BY_SYMBOL:
			case ROWS_SYMBOL:
			case RANGE_SYMBOL:
			case GROUPS_SYMBOL:
			case UNBOUNDED_SYMBOL:
			case PRECEDING_SYMBOL:
			case INTERVAL_SYMBOL:
			case CURRENT_SYMBOL:
			case ROW_SYMBOL:
			case BETWEEN_SYMBOL:
			case AND_SYMBOL:
			case FOLLOWING_SYMBOL:
			case EXCLUDE_SYMBOL:
			case GROUP_SYMBOL:
			case TIES_SYMBOL:
			case NO_SYMBOL:
			case OTHERS_SYMBOL:
			case WITH_SYMBOL:
			case RECURSIVE_SYMBOL:
			case ROLLUP_SYMBOL:
			case CUBE_SYMBOL:
			case ORDER_SYMBOL:
			case ASC_SYMBOL:
			case DESC_SYMBOL:
			case FROM_SYMBOL:
			case DUAL_SYMBOL:
			case VALUES_SYMBOL:
			case TABLE_SYMBOL:
			case SQL_NO_CACHE_SYMBOL:
			case SQL_CACHE_SYMBOL:
			case MAX_STATEMENT_TIME_SYMBOL:
			case FOR_SYMBOL:
			case OF_SYMBOL:
			case LOCK_SYMBOL:
			case IN_SYMBOL:
			case SHARE_SYMBOL:
			case MODE_SYMBOL:
			case UPDATE_SYMBOL:
			case SKIP_SYMBOL:
			case LOCKED_SYMBOL:
			case NOWAIT_SYMBOL:
			case WHERE_SYMBOL:
			case OJ_SYMBOL:
			case ON_SYMBOL:
			case USING_SYMBOL:
			case NATURAL_SYMBOL:
			case INNER_SYMBOL:
			case JOIN_SYMBOL:
			case LEFT_SYMBOL:
			case RIGHT_SYMBOL:
			case OUTER_SYMBOL:
			case CROSS_SYMBOL:
			case LATERAL_SYMBOL:
			case JSON_TABLE_SYMBOL:
			case COLUMNS_SYMBOL:
			case ORDINALITY_SYMBOL:
			case EXISTS_SYMBOL:
			case PATH_SYMBOL:
			case NESTED_SYMBOL:
			case EMPTY_SYMBOL:
			case ERROR_SYMBOL:
			case NULL_SYMBOL:
			case USE_SYMBOL:
			case FORCE_SYMBOL:
			case IGNORE_SYMBOL:
			case KEY_SYMBOL:
			case INDEX_SYMBOL:
			case PRIMARY_SYMBOL:
			case IS_SYMBOL:
			case TRUE_SYMBOL:
			case FALSE_SYMBOL:
			case UNKNOWN_SYMBOL:
			case NOT_SYMBOL:
			case XOR_SYMBOL:
			case OR_SYMBOL:
			case ANY_SYMBOL:
			case MEMBER_SYMBOL:
			case SOUNDS_SYMBOL:
			case LIKE_SYMBOL:
			case ESCAPE_SYMBOL:
			case REGEXP_SYMBOL:
			case DIV_SYMBOL:
			case MOD_SYMBOL:
			case MATCH_SYMBOL:
			case AGAINST_SYMBOL:
			case BINARY_SYMBOL:
			case CAST_SYMBOL:
			case ARRAY_SYMBOL:
			case CASE_SYMBOL:
			case END_SYMBOL:
			case CONVERT_SYMBOL:
			case COLLATE_SYMBOL:
			case AVG_SYMBOL:
			case BIT_AND_SYMBOL:
			case BIT_OR_SYMBOL:
			case BIT_XOR_SYMBOL:
			case COUNT_SYMBOL:
			case MIN_SYMBOL:
			case MAX_SYMBOL:
			case STD_SYMBOL:
			case VARIANCE_SYMBOL:
			case STDDEV_SAMP_SYMBOL:
			case VAR_SAMP_SYMBOL:
			case SUM_SYMBOL:
			case GROUP_CONCAT_SYMBOL:
			case SEPARATOR_SYMBOL:
			case GROUPING_SYMBOL:
			case ROW_NUMBER_SYMBOL:
			case RANK_SYMBOL:
			case DENSE_RANK_SYMBOL:
			case CUME_DIST_SYMBOL:
			case PERCENT_RANK_SYMBOL:
			case NTILE_SYMBOL:
			case LEAD_SYMBOL:
			case LAG_SYMBOL:
			case FIRST_VALUE_SYMBOL:
			case LAST_VALUE_SYMBOL:
			case NTH_VALUE_SYMBOL:
			case FIRST_SYMBOL:
			case LAST_SYMBOL:
			case OVER_SYMBOL:
			case RESPECT_SYMBOL:
			case NULLS_SYMBOL:
			case JSON_ARRAYAGG_SYMBOL:
			case JSON_OBJECTAGG_SYMBOL:
			case BOOLEAN_SYMBOL:
			case LANGUAGE_SYMBOL:
			case QUERY_SYMBOL:
			case EXPANSION_SYMBOL:
			case CHAR_SYMBOL:
			case CURRENT_USER_SYMBOL:
			case DATE_SYMBOL:
			case INSERT_SYMBOL:
			case TIME_SYMBOL:
			case TIMESTAMP_SYMBOL:
			case USER_SYMBOL:
			case ADDDATE_SYMBOL:
			case SUBDATE_SYMBOL:
			case CURDATE_SYMBOL:
			case CURTIME_SYMBOL:
			case DATE_ADD_SYMBOL:
			case DATE_SUB_SYMBOL:
			case EXTRACT_SYMBOL:
			case GET_FORMAT_SYMBOL:
			case NOW_SYMBOL:
			case POSITION_SYMBOL:
			case SYSDATE_SYMBOL:
			case TIMESTAMP_ADD_SYMBOL:
			case TIMESTAMP_DIFF_SYMBOL:
			case UTC_DATE_SYMBOL:
			case UTC_TIME_SYMBOL:
			case UTC_TIMESTAMP_SYMBOL:
			case ASCII_SYMBOL:
			case CHARSET_SYMBOL:
			case COALESCE_SYMBOL:
			case COLLATION_SYMBOL:
			case DATABASE_SYMBOL:
			case IF_SYMBOL:
			case FORMAT_SYMBOL:
			case MICROSECOND_SYMBOL:
			case OLD_PASSWORD_SYMBOL:
			case PASSWORD_SYMBOL:
			case REPEAT_SYMBOL:
			case REPLACE_SYMBOL:
			case REVERSE_SYMBOL:
			case ROW_COUNT_SYMBOL:
			case TRUNCATE_SYMBOL:
			case WEIGHT_STRING_SYMBOL:
			case CONTAINS_SYMBOL:
			case GEOMETRYCOLLECTION_SYMBOL:
			case LINESTRING_SYMBOL:
			case MULTILINESTRING_SYMBOL:
			case MULTIPOINT_SYMBOL:
			case MULTIPOLYGON_SYMBOL:
			case POINT_SYMBOL:
			case POLYGON_SYMBOL:
			case LEVEL_SYMBOL:
			case DATETIME_SYMBOL:
			case TRIM_SYMBOL:
			case LEADING_SYMBOL:
			case TRAILING_SYMBOL:
			case BOTH_SYMBOL:
			case SUBSTRING_SYMBOL:
			case WHEN_SYMBOL:
			case THEN_SYMBOL:
			case ELSE_SYMBOL:
			case SIGNED_SYMBOL:
			case UNSIGNED_SYMBOL:
			case DECIMAL_SYMBOL:
			case JSON_SYMBOL:
			case FLOAT_SYMBOL:
			case SET_SYMBOL:
			case SECOND_MICROSECOND_SYMBOL:
			case MINUTE_MICROSECOND_SYMBOL:
			case MINUTE_SECOND_SYMBOL:
			case HOUR_MICROSECOND_SYMBOL:
			case HOUR_SECOND_SYMBOL:
			case HOUR_MINUTE_SYMBOL:
			case DAY_MICROSECOND_SYMBOL:
			case DAY_SECOND_SYMBOL:
			case DAY_MINUTE_SYMBOL:
			case DAY_HOUR_SYMBOL:
			case YEAR_MONTH_SYMBOL:
			case BTREE_SYMBOL:
			case RTREE_SYMBOL:
			case HASH_SYMBOL:
			case REAL_SYMBOL:
			case DOUBLE_SYMBOL:
			case PRECISION_SYMBOL:
			case NUMERIC_SYMBOL:
			case FIXED_SYMBOL:
			case BIT_SYMBOL:
			case BOOL_SYMBOL:
			case VARYING_SYMBOL:
			case VARCHAR_SYMBOL:
			case NATIONAL_SYMBOL:
			case NVARCHAR_SYMBOL:
			case NCHAR_SYMBOL:
			case VARBINARY_SYMBOL:
			case TINYBLOB_SYMBOL:
			case BLOB_SYMBOL:
			case MEDIUMBLOB_SYMBOL:
			case LONGBLOB_SYMBOL:
			case LONG_SYMBOL:
			case TINYTEXT_SYMBOL:
			case TEXT_SYMBOL:
			case MEDIUMTEXT_SYMBOL:
			case LONGTEXT_SYMBOL:
			case ENUM_SYMBOL:
			case SERIAL_SYMBOL:
			case GEOMETRY_SYMBOL:
			case ZEROFILL_SYMBOL:
			case BYTE_SYMBOL:
			case UNICODE_SYMBOL:
			case TERMINATED_SYMBOL:
			case OPTIONALLY_SYMBOL:
			case ENCLOSED_SYMBOL:
			case ESCAPED_SYMBOL:
			case LINES_SYMBOL:
			case STARTING_SYMBOL:
			case GLOBAL_SYMBOL:
			case LOCAL_SYMBOL:
			case SESSION_SYMBOL:
			case IDENTIFIER:
			case BACK_TICK_QUOTED_ID:
			case DOUBLE_QUOTED_TEXT:
			case SINGLE_QUOTED_TEXT:
			case BRACKET_QUOTED_TEXT:
				{
				setState(759);
				tableFactor();
				}
				break;
			case OPEN_CURLY_SYMBOL:
				{
				setState(760);
				match(OPEN_CURLY_SYMBOL);
				setState(763);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(761);
					identifier();
					}
					break;
				case 2:
					{
					setState(762);
					match(OJ_SYMBOL);
					}
					break;
				}
				setState(765);
				escapedTableReference();
				setState(766);
				match(CLOSE_CURLY_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(773);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(770);
					joinedTable();
					}
					} 
				}
				setState(775);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EscapedTableReferenceContext extends ParserRuleContext {
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public List<JoinedTableContext> joinedTable() {
			return getRuleContexts(JoinedTableContext.class);
		}
		public JoinedTableContext joinedTable(int i) {
			return getRuleContext(JoinedTableContext.class,i);
		}
		public EscapedTableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escapedTableReference; }
	}

	public final EscapedTableReferenceContext escapedTableReference() throws RecognitionException {
		EscapedTableReferenceContext _localctx = new EscapedTableReferenceContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_escapedTableReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			tableFactor();
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRAIGHT_JOIN_SYMBOL - 64)) | (1L << (NATURAL_SYMBOL - 64)) | (1L << (INNER_SYMBOL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (JOIN_SYMBOL - 128)) | (1L << (LEFT_SYMBOL - 128)) | (1L << (RIGHT_SYMBOL - 128)) | (1L << (CROSS_SYMBOL - 128)))) != 0)) {
				{
				{
				setState(777);
				joinedTable();
				}
				}
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinedTableContext extends ParserRuleContext {
		public InnerJoinTypeContext innerJoinType() {
			return getRuleContext(InnerJoinTypeContext.class,0);
		}
		public TableReferenceContext tableReference() {
			return getRuleContext(TableReferenceContext.class,0);
		}
		public TerminalNode ON_SYMBOL() { return getToken(SQLSelectParser.ON_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING_SYMBOL() { return getToken(SQLSelectParser.USING_SYMBOL, 0); }
		public IdentifierListWithParenthesesContext identifierListWithParentheses() {
			return getRuleContext(IdentifierListWithParenthesesContext.class,0);
		}
		public OuterJoinTypeContext outerJoinType() {
			return getRuleContext(OuterJoinTypeContext.class,0);
		}
		public NaturalJoinTypeContext naturalJoinType() {
			return getRuleContext(NaturalJoinTypeContext.class,0);
		}
		public TableFactorContext tableFactor() {
			return getRuleContext(TableFactorContext.class,0);
		}
		public JoinedTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinedTable; }
	}

	public final JoinedTableContext joinedTable() throws RecognitionException {
		JoinedTableContext _localctx = new JoinedTableContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_joinedTable);
		try {
			setState(802);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRAIGHT_JOIN_SYMBOL:
			case INNER_SYMBOL:
			case JOIN_SYMBOL:
			case CROSS_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				innerJoinType();
				setState(784);
				tableReference();
				setState(789);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(785);
					match(ON_SYMBOL);
					setState(786);
					expr(0);
					}
					break;
				case 2:
					{
					setState(787);
					match(USING_SYMBOL);
					setState(788);
					identifierListWithParentheses();
					}
					break;
				}
				}
				break;
			case LEFT_SYMBOL:
			case RIGHT_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
				outerJoinType();
				setState(792);
				tableReference();
				setState(797);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ON_SYMBOL:
					{
					setState(793);
					match(ON_SYMBOL);
					setState(794);
					expr(0);
					}
					break;
				case USING_SYMBOL:
					{
					setState(795);
					match(USING_SYMBOL);
					setState(796);
					identifierListWithParentheses();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case NATURAL_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(799);
				naturalJoinType();
				setState(800);
				tableFactor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NaturalJoinTypeContext extends ParserRuleContext {
		public TerminalNode NATURAL_SYMBOL() { return getToken(SQLSelectParser.NATURAL_SYMBOL, 0); }
		public TerminalNode JOIN_SYMBOL() { return getToken(SQLSelectParser.JOIN_SYMBOL, 0); }
		public TerminalNode INNER_SYMBOL() { return getToken(SQLSelectParser.INNER_SYMBOL, 0); }
		public TerminalNode LEFT_SYMBOL() { return getToken(SQLSelectParser.LEFT_SYMBOL, 0); }
		public TerminalNode RIGHT_SYMBOL() { return getToken(SQLSelectParser.RIGHT_SYMBOL, 0); }
		public TerminalNode OUTER_SYMBOL() { return getToken(SQLSelectParser.OUTER_SYMBOL, 0); }
		public NaturalJoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_naturalJoinType; }
	}

	public final NaturalJoinTypeContext naturalJoinType() throws RecognitionException {
		NaturalJoinTypeContext _localctx = new NaturalJoinTypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_naturalJoinType);
		int _la;
		try {
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				match(NATURAL_SYMBOL);
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER_SYMBOL) {
					{
					setState(805);
					match(INNER_SYMBOL);
					}
				}

				setState(808);
				match(JOIN_SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				match(NATURAL_SYMBOL);
				setState(810);
				_la = _input.LA(1);
				if ( !(_la==LEFT_SYMBOL || _la==RIGHT_SYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER_SYMBOL) {
					{
					setState(811);
					match(OUTER_SYMBOL);
					}
				}

				setState(814);
				match(JOIN_SYMBOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerJoinTypeContext extends ParserRuleContext {
		public Token type;
		public TerminalNode JOIN_SYMBOL() { return getToken(SQLSelectParser.JOIN_SYMBOL, 0); }
		public TerminalNode INNER_SYMBOL() { return getToken(SQLSelectParser.INNER_SYMBOL, 0); }
		public TerminalNode CROSS_SYMBOL() { return getToken(SQLSelectParser.CROSS_SYMBOL, 0); }
		public TerminalNode STRAIGHT_JOIN_SYMBOL() { return getToken(SQLSelectParser.STRAIGHT_JOIN_SYMBOL, 0); }
		public InnerJoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerJoinType; }
	}

	public final InnerJoinTypeContext innerJoinType() throws RecognitionException {
		InnerJoinTypeContext _localctx = new InnerJoinTypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_innerJoinType);
		int _la;
		try {
			setState(822);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER_SYMBOL:
			case JOIN_SYMBOL:
			case CROSS_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER_SYMBOL || _la==CROSS_SYMBOL) {
					{
					setState(817);
					((InnerJoinTypeContext)_localctx).type = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==INNER_SYMBOL || _la==CROSS_SYMBOL) ) {
						((InnerJoinTypeContext)_localctx).type = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(820);
				match(JOIN_SYMBOL);
				}
				break;
			case STRAIGHT_JOIN_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(821);
				((InnerJoinTypeContext)_localctx).type = match(STRAIGHT_JOIN_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OuterJoinTypeContext extends ParserRuleContext {
		public Token type;
		public TerminalNode JOIN_SYMBOL() { return getToken(SQLSelectParser.JOIN_SYMBOL, 0); }
		public TerminalNode LEFT_SYMBOL() { return getToken(SQLSelectParser.LEFT_SYMBOL, 0); }
		public TerminalNode RIGHT_SYMBOL() { return getToken(SQLSelectParser.RIGHT_SYMBOL, 0); }
		public TerminalNode OUTER_SYMBOL() { return getToken(SQLSelectParser.OUTER_SYMBOL, 0); }
		public OuterJoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outerJoinType; }
	}

	public final OuterJoinTypeContext outerJoinType() throws RecognitionException {
		OuterJoinTypeContext _localctx = new OuterJoinTypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_outerJoinType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			((OuterJoinTypeContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==LEFT_SYMBOL || _la==RIGHT_SYMBOL) ) {
				((OuterJoinTypeContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTER_SYMBOL) {
				{
				setState(825);
				match(OUTER_SYMBOL);
				}
			}

			setState(828);
			match(JOIN_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableFactorContext extends ParserRuleContext {
		public SingleTableContext singleTable() {
			return getRuleContext(SingleTableContext.class,0);
		}
		public SingleTableParensContext singleTableParens() {
			return getRuleContext(SingleTableParensContext.class,0);
		}
		public DerivedTableContext derivedTable() {
			return getRuleContext(DerivedTableContext.class,0);
		}
		public TableReferenceListParensContext tableReferenceListParens() {
			return getRuleContext(TableReferenceListParensContext.class,0);
		}
		public TableFunctionContext tableFunction() {
			return getRuleContext(TableFunctionContext.class,0);
		}
		public TableFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFactor; }
	}

	public final TableFactorContext tableFactor() throws RecognitionException {
		TableFactorContext _localctx = new TableFactorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_tableFactor);
		try {
			setState(835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				singleTable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(831);
				singleTableParens();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(832);
				derivedTable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(833);
				tableReferenceListParens();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(834);
				tableFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableContext extends ParserRuleContext {
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public UsePartitionContext usePartition() {
			return getRuleContext(UsePartitionContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public IndexHintListContext indexHintList() {
			return getRuleContext(IndexHintListContext.class,0);
		}
		public SingleTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTable; }
	}

	public final SingleTableContext singleTable() throws RecognitionException {
		SingleTableContext _localctx = new SingleTableContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_singleTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			qualifiedIdentifier();
			setState(839);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(838);
				usePartition();
				}
				break;
			}
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(841);
				tableAlias();
				}
				break;
			}
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & ((1L << (USE_SYMBOL - 143)) | (1L << (FORCE_SYMBOL - 143)) | (1L << (IGNORE_SYMBOL - 143)))) != 0)) {
				{
				setState(844);
				indexHintList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableParensContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public SingleTableContext singleTable() {
			return getRuleContext(SingleTableContext.class,0);
		}
		public SingleTableParensContext singleTableParens() {
			return getRuleContext(SingleTableParensContext.class,0);
		}
		public SingleTableParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableParens; }
	}

	public final SingleTableParensContext singleTableParens() throws RecognitionException {
		SingleTableParensContext _localctx = new SingleTableParensContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_singleTableParens);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(OPEN_PAR_SYMBOL);
			setState(850);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TINYINT_SYMBOL:
			case SMALLINT_SYMBOL:
			case MEDIUMINT_SYMBOL:
			case INT_SYMBOL:
			case BIGINT_SYMBOL:
			case SECOND_SYMBOL:
			case MINUTE_SYMBOL:
			case HOUR_SYMBOL:
			case DAY_SYMBOL:
			case WEEK_SYMBOL:
			case MONTH_SYMBOL:
			case QUARTER_SYMBOL:
			case YEAR_SYMBOL:
			case DEFAULT_SYMBOL:
			case UNION_SYMBOL:
			case SELECT_SYMBOL:
			case ALL_SYMBOL:
			case DISTINCT_SYMBOL:
			case STRAIGHT_JOIN_SYMBOL:
			case HIGH_PRIORITY_SYMBOL:
			case SQL_SMALL_RESULT_SYMBOL:
			case SQL_BIG_RESULT_SYMBOL:
			case SQL_BUFFER_RESULT_SYMBOL:
			case SQL_CALC_FOUND_ROWS_SYMBOL:
			case LIMIT_SYMBOL:
			case OFFSET_SYMBOL:
			case INTO_SYMBOL:
			case OUTFILE_SYMBOL:
			case DUMPFILE_SYMBOL:
			case PROCEDURE_SYMBOL:
			case ANALYSE_SYMBOL:
			case HAVING_SYMBOL:
			case WINDOW_SYMBOL:
			case AS_SYMBOL:
			case PARTITION_SYMBOL:
			case BY_SYMBOL:
			case ROWS_SYMBOL:
			case RANGE_SYMBOL:
			case GROUPS_SYMBOL:
			case UNBOUNDED_SYMBOL:
			case PRECEDING_SYMBOL:
			case INTERVAL_SYMBOL:
			case CURRENT_SYMBOL:
			case ROW_SYMBOL:
			case BETWEEN_SYMBOL:
			case AND_SYMBOL:
			case FOLLOWING_SYMBOL:
			case EXCLUDE_SYMBOL:
			case GROUP_SYMBOL:
			case TIES_SYMBOL:
			case NO_SYMBOL:
			case OTHERS_SYMBOL:
			case WITH_SYMBOL:
			case RECURSIVE_SYMBOL:
			case ROLLUP_SYMBOL:
			case CUBE_SYMBOL:
			case ORDER_SYMBOL:
			case ASC_SYMBOL:
			case DESC_SYMBOL:
			case FROM_SYMBOL:
			case DUAL_SYMBOL:
			case VALUES_SYMBOL:
			case TABLE_SYMBOL:
			case SQL_NO_CACHE_SYMBOL:
			case SQL_CACHE_SYMBOL:
			case MAX_STATEMENT_TIME_SYMBOL:
			case FOR_SYMBOL:
			case OF_SYMBOL:
			case LOCK_SYMBOL:
			case IN_SYMBOL:
			case SHARE_SYMBOL:
			case MODE_SYMBOL:
			case UPDATE_SYMBOL:
			case SKIP_SYMBOL:
			case LOCKED_SYMBOL:
			case NOWAIT_SYMBOL:
			case WHERE_SYMBOL:
			case OJ_SYMBOL:
			case ON_SYMBOL:
			case USING_SYMBOL:
			case NATURAL_SYMBOL:
			case INNER_SYMBOL:
			case JOIN_SYMBOL:
			case LEFT_SYMBOL:
			case RIGHT_SYMBOL:
			case OUTER_SYMBOL:
			case CROSS_SYMBOL:
			case LATERAL_SYMBOL:
			case JSON_TABLE_SYMBOL:
			case COLUMNS_SYMBOL:
			case ORDINALITY_SYMBOL:
			case EXISTS_SYMBOL:
			case PATH_SYMBOL:
			case NESTED_SYMBOL:
			case EMPTY_SYMBOL:
			case ERROR_SYMBOL:
			case NULL_SYMBOL:
			case USE_SYMBOL:
			case FORCE_SYMBOL:
			case IGNORE_SYMBOL:
			case KEY_SYMBOL:
			case INDEX_SYMBOL:
			case PRIMARY_SYMBOL:
			case IS_SYMBOL:
			case TRUE_SYMBOL:
			case FALSE_SYMBOL:
			case UNKNOWN_SYMBOL:
			case NOT_SYMBOL:
			case XOR_SYMBOL:
			case OR_SYMBOL:
			case ANY_SYMBOL:
			case MEMBER_SYMBOL:
			case SOUNDS_SYMBOL:
			case LIKE_SYMBOL:
			case ESCAPE_SYMBOL:
			case REGEXP_SYMBOL:
			case DIV_SYMBOL:
			case MOD_SYMBOL:
			case MATCH_SYMBOL:
			case AGAINST_SYMBOL:
			case BINARY_SYMBOL:
			case CAST_SYMBOL:
			case ARRAY_SYMBOL:
			case CASE_SYMBOL:
			case END_SYMBOL:
			case CONVERT_SYMBOL:
			case COLLATE_SYMBOL:
			case AVG_SYMBOL:
			case BIT_AND_SYMBOL:
			case BIT_OR_SYMBOL:
			case BIT_XOR_SYMBOL:
			case COUNT_SYMBOL:
			case MIN_SYMBOL:
			case MAX_SYMBOL:
			case STD_SYMBOL:
			case VARIANCE_SYMBOL:
			case STDDEV_SAMP_SYMBOL:
			case VAR_SAMP_SYMBOL:
			case SUM_SYMBOL:
			case GROUP_CONCAT_SYMBOL:
			case SEPARATOR_SYMBOL:
			case GROUPING_SYMBOL:
			case ROW_NUMBER_SYMBOL:
			case RANK_SYMBOL:
			case DENSE_RANK_SYMBOL:
			case CUME_DIST_SYMBOL:
			case PERCENT_RANK_SYMBOL:
			case NTILE_SYMBOL:
			case LEAD_SYMBOL:
			case LAG_SYMBOL:
			case FIRST_VALUE_SYMBOL:
			case LAST_VALUE_SYMBOL:
			case NTH_VALUE_SYMBOL:
			case FIRST_SYMBOL:
			case LAST_SYMBOL:
			case OVER_SYMBOL:
			case RESPECT_SYMBOL:
			case NULLS_SYMBOL:
			case JSON_ARRAYAGG_SYMBOL:
			case JSON_OBJECTAGG_SYMBOL:
			case BOOLEAN_SYMBOL:
			case LANGUAGE_SYMBOL:
			case QUERY_SYMBOL:
			case EXPANSION_SYMBOL:
			case CHAR_SYMBOL:
			case CURRENT_USER_SYMBOL:
			case DATE_SYMBOL:
			case INSERT_SYMBOL:
			case TIME_SYMBOL:
			case TIMESTAMP_SYMBOL:
			case USER_SYMBOL:
			case ADDDATE_SYMBOL:
			case SUBDATE_SYMBOL:
			case CURDATE_SYMBOL:
			case CURTIME_SYMBOL:
			case DATE_ADD_SYMBOL:
			case DATE_SUB_SYMBOL:
			case EXTRACT_SYMBOL:
			case GET_FORMAT_SYMBOL:
			case NOW_SYMBOL:
			case POSITION_SYMBOL:
			case SYSDATE_SYMBOL:
			case TIMESTAMP_ADD_SYMBOL:
			case TIMESTAMP_DIFF_SYMBOL:
			case UTC_DATE_SYMBOL:
			case UTC_TIME_SYMBOL:
			case UTC_TIMESTAMP_SYMBOL:
			case ASCII_SYMBOL:
			case CHARSET_SYMBOL:
			case COALESCE_SYMBOL:
			case COLLATION_SYMBOL:
			case DATABASE_SYMBOL:
			case IF_SYMBOL:
			case FORMAT_SYMBOL:
			case MICROSECOND_SYMBOL:
			case OLD_PASSWORD_SYMBOL:
			case PASSWORD_SYMBOL:
			case REPEAT_SYMBOL:
			case REPLACE_SYMBOL:
			case REVERSE_SYMBOL:
			case ROW_COUNT_SYMBOL:
			case TRUNCATE_SYMBOL:
			case WEIGHT_STRING_SYMBOL:
			case CONTAINS_SYMBOL:
			case GEOMETRYCOLLECTION_SYMBOL:
			case LINESTRING_SYMBOL:
			case MULTILINESTRING_SYMBOL:
			case MULTIPOINT_SYMBOL:
			case MULTIPOLYGON_SYMBOL:
			case POINT_SYMBOL:
			case POLYGON_SYMBOL:
			case LEVEL_SYMBOL:
			case DATETIME_SYMBOL:
			case TRIM_SYMBOL:
			case LEADING_SYMBOL:
			case TRAILING_SYMBOL:
			case BOTH_SYMBOL:
			case SUBSTRING_SYMBOL:
			case WHEN_SYMBOL:
			case THEN_SYMBOL:
			case ELSE_SYMBOL:
			case SIGNED_SYMBOL:
			case UNSIGNED_SYMBOL:
			case DECIMAL_SYMBOL:
			case JSON_SYMBOL:
			case FLOAT_SYMBOL:
			case SET_SYMBOL:
			case SECOND_MICROSECOND_SYMBOL:
			case MINUTE_MICROSECOND_SYMBOL:
			case MINUTE_SECOND_SYMBOL:
			case HOUR_MICROSECOND_SYMBOL:
			case HOUR_SECOND_SYMBOL:
			case HOUR_MINUTE_SYMBOL:
			case DAY_MICROSECOND_SYMBOL:
			case DAY_SECOND_SYMBOL:
			case DAY_MINUTE_SYMBOL:
			case DAY_HOUR_SYMBOL:
			case YEAR_MONTH_SYMBOL:
			case BTREE_SYMBOL:
			case RTREE_SYMBOL:
			case HASH_SYMBOL:
			case REAL_SYMBOL:
			case DOUBLE_SYMBOL:
			case PRECISION_SYMBOL:
			case NUMERIC_SYMBOL:
			case FIXED_SYMBOL:
			case BIT_SYMBOL:
			case BOOL_SYMBOL:
			case VARYING_SYMBOL:
			case VARCHAR_SYMBOL:
			case NATIONAL_SYMBOL:
			case NVARCHAR_SYMBOL:
			case NCHAR_SYMBOL:
			case VARBINARY_SYMBOL:
			case TINYBLOB_SYMBOL:
			case BLOB_SYMBOL:
			case MEDIUMBLOB_SYMBOL:
			case LONGBLOB_SYMBOL:
			case LONG_SYMBOL:
			case TINYTEXT_SYMBOL:
			case TEXT_SYMBOL:
			case MEDIUMTEXT_SYMBOL:
			case LONGTEXT_SYMBOL:
			case ENUM_SYMBOL:
			case SERIAL_SYMBOL:
			case GEOMETRY_SYMBOL:
			case ZEROFILL_SYMBOL:
			case BYTE_SYMBOL:
			case UNICODE_SYMBOL:
			case TERMINATED_SYMBOL:
			case OPTIONALLY_SYMBOL:
			case ENCLOSED_SYMBOL:
			case ESCAPED_SYMBOL:
			case LINES_SYMBOL:
			case STARTING_SYMBOL:
			case GLOBAL_SYMBOL:
			case LOCAL_SYMBOL:
			case SESSION_SYMBOL:
			case IDENTIFIER:
			case BACK_TICK_QUOTED_ID:
			case DOUBLE_QUOTED_TEXT:
			case SINGLE_QUOTED_TEXT:
			case BRACKET_QUOTED_TEXT:
				{
				setState(848);
				singleTable();
				}
				break;
			case OPEN_PAR_SYMBOL:
				{
				setState(849);
				singleTableParens();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(852);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DerivedTableContext extends ParserRuleContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public ColumnInternalRefListContext columnInternalRefList() {
			return getRuleContext(ColumnInternalRefListContext.class,0);
		}
		public TerminalNode LATERAL_SYMBOL() { return getToken(SQLSelectParser.LATERAL_SYMBOL, 0); }
		public DerivedTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_derivedTable; }
	}

	public final DerivedTableContext derivedTable() throws RecognitionException {
		DerivedTableContext _localctx = new DerivedTableContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_derivedTable);
		int _la;
		try {
			setState(869);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				subquery();
				setState(856);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(855);
					tableAlias();
					}
					break;
				}
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(858);
					columnInternalRefList();
					}
				}

				}
				break;
			case LATERAL_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				match(LATERAL_SYMBOL);
				setState(862);
				subquery();
				setState(864);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(863);
					tableAlias();
					}
					break;
				}
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(866);
					columnInternalRefList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableReferenceListParensContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public TableReferenceListContext tableReferenceList() {
			return getRuleContext(TableReferenceListContext.class,0);
		}
		public TableReferenceListParensContext tableReferenceListParens() {
			return getRuleContext(TableReferenceListParensContext.class,0);
		}
		public TableReferenceListParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReferenceListParens; }
	}

	public final TableReferenceListParensContext tableReferenceListParens() throws RecognitionException {
		TableReferenceListParensContext _localctx = new TableReferenceListParensContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_tableReferenceListParens);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(OPEN_PAR_SYMBOL);
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(872);
				tableReferenceList();
				}
				break;
			case 2:
				{
				setState(873);
				tableReferenceListParens();
				}
				break;
			}
			setState(876);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableFunctionContext extends ParserRuleContext {
		public TerminalNode JSON_TABLE_SYMBOL() { return getToken(SQLSelectParser.JSON_TABLE_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA_SYMBOL() { return getToken(SQLSelectParser.COMMA_SYMBOL, 0); }
		public TextStringLiteralContext textStringLiteral() {
			return getRuleContext(TextStringLiteralContext.class,0);
		}
		public ColumnsClauseContext columnsClause() {
			return getRuleContext(ColumnsClauseContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TableFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableFunction; }
	}

	public final TableFunctionContext tableFunction() throws RecognitionException {
		TableFunctionContext _localctx = new TableFunctionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_tableFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(878);
			match(JSON_TABLE_SYMBOL);
			setState(879);
			match(OPEN_PAR_SYMBOL);
			setState(880);
			expr(0);
			setState(881);
			match(COMMA_SYMBOL);
			setState(882);
			textStringLiteral();
			setState(883);
			columnsClause();
			setState(884);
			match(CLOSE_PAR_SYMBOL);
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(885);
				tableAlias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnsClauseContext extends ParserRuleContext {
		public TerminalNode COLUMNS_SYMBOL() { return getToken(SQLSelectParser.COLUMNS_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public List<JtColumnContext> jtColumn() {
			return getRuleContexts(JtColumnContext.class);
		}
		public JtColumnContext jtColumn(int i) {
			return getRuleContext(JtColumnContext.class,i);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public ColumnsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsClause; }
	}

	public final ColumnsClauseContext columnsClause() throws RecognitionException {
		ColumnsClauseContext _localctx = new ColumnsClauseContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_columnsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(COLUMNS_SYMBOL);
			setState(889);
			match(OPEN_PAR_SYMBOL);
			setState(890);
			jtColumn();
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(891);
				match(COMMA_SYMBOL);
				setState(892);
				jtColumn();
				}
				}
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(898);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JtColumnContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR_SYMBOL() { return getToken(SQLSelectParser.FOR_SYMBOL, 0); }
		public TerminalNode ORDINALITY_SYMBOL() { return getToken(SQLSelectParser.ORDINALITY_SYMBOL, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode PATH_SYMBOL() { return getToken(SQLSelectParser.PATH_SYMBOL, 0); }
		public TextStringLiteralContext textStringLiteral() {
			return getRuleContext(TextStringLiteralContext.class,0);
		}
		public CollateContext collate() {
			return getRuleContext(CollateContext.class,0);
		}
		public TerminalNode EXISTS_SYMBOL() { return getToken(SQLSelectParser.EXISTS_SYMBOL, 0); }
		public OnEmptyOrErrorContext onEmptyOrError() {
			return getRuleContext(OnEmptyOrErrorContext.class,0);
		}
		public TerminalNode NESTED_SYMBOL() { return getToken(SQLSelectParser.NESTED_SYMBOL, 0); }
		public ColumnsClauseContext columnsClause() {
			return getRuleContext(ColumnsClauseContext.class,0);
		}
		public JtColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jtColumn; }
	}

	public final JtColumnContext jtColumn() throws RecognitionException {
		JtColumnContext _localctx = new JtColumnContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_jtColumn);
		int _la;
		try {
			setState(922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				identifier();
				setState(901);
				match(FOR_SYMBOL);
				setState(902);
				match(ORDINALITY_SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(904);
				identifier();
				setState(905);
				dataType();
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLLATE_SYMBOL) {
					{
					setState(906);
					collate();
					}
				}

				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS_SYMBOL) {
					{
					setState(909);
					match(EXISTS_SYMBOL);
					}
				}

				setState(912);
				match(PATH_SYMBOL);
				setState(913);
				textStringLiteral();
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT_SYMBOL || _la==ERROR_SYMBOL || _la==NULL_SYMBOL) {
					{
					setState(914);
					onEmptyOrError();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(917);
				match(NESTED_SYMBOL);
				setState(918);
				match(PATH_SYMBOL);
				setState(919);
				textStringLiteral();
				setState(920);
				columnsClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnEmptyOrErrorContext extends ParserRuleContext {
		public OnEmptyContext onEmpty() {
			return getRuleContext(OnEmptyContext.class,0);
		}
		public OnErrorContext onError() {
			return getRuleContext(OnErrorContext.class,0);
		}
		public OnEmptyOrErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onEmptyOrError; }
	}

	public final OnEmptyOrErrorContext onEmptyOrError() throws RecognitionException {
		OnEmptyOrErrorContext _localctx = new OnEmptyOrErrorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_onEmptyOrError);
		int _la;
		try {
			setState(932);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(924);
				onEmpty();
				setState(926);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT_SYMBOL || _la==ERROR_SYMBOL || _la==NULL_SYMBOL) {
					{
					setState(925);
					onError();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(928);
				onError();
				setState(930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT_SYMBOL || _la==ERROR_SYMBOL || _la==NULL_SYMBOL) {
					{
					setState(929);
					onEmpty();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnEmptyContext extends ParserRuleContext {
		public JtOnResponseContext jtOnResponse() {
			return getRuleContext(JtOnResponseContext.class,0);
		}
		public TerminalNode ON_SYMBOL() { return getToken(SQLSelectParser.ON_SYMBOL, 0); }
		public TerminalNode EMPTY_SYMBOL() { return getToken(SQLSelectParser.EMPTY_SYMBOL, 0); }
		public OnEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onEmpty; }
	}

	public final OnEmptyContext onEmpty() throws RecognitionException {
		OnEmptyContext _localctx = new OnEmptyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_onEmpty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			jtOnResponse();
			setState(935);
			match(ON_SYMBOL);
			setState(936);
			match(EMPTY_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OnErrorContext extends ParserRuleContext {
		public JtOnResponseContext jtOnResponse() {
			return getRuleContext(JtOnResponseContext.class,0);
		}
		public TerminalNode ON_SYMBOL() { return getToken(SQLSelectParser.ON_SYMBOL, 0); }
		public TerminalNode ERROR_SYMBOL() { return getToken(SQLSelectParser.ERROR_SYMBOL, 0); }
		public OnErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onError; }
	}

	public final OnErrorContext onError() throws RecognitionException {
		OnErrorContext _localctx = new OnErrorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_onError);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			jtOnResponse();
			setState(939);
			match(ON_SYMBOL);
			setState(940);
			match(ERROR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JtOnResponseContext extends ParserRuleContext {
		public TerminalNode ERROR_SYMBOL() { return getToken(SQLSelectParser.ERROR_SYMBOL, 0); }
		public TerminalNode NULL_SYMBOL() { return getToken(SQLSelectParser.NULL_SYMBOL, 0); }
		public TerminalNode DEFAULT_SYMBOL() { return getToken(SQLSelectParser.DEFAULT_SYMBOL, 0); }
		public TextStringLiteralContext textStringLiteral() {
			return getRuleContext(TextStringLiteralContext.class,0);
		}
		public JtOnResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jtOnResponse; }
	}

	public final JtOnResponseContext jtOnResponse() throws RecognitionException {
		JtOnResponseContext _localctx = new JtOnResponseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_jtOnResponse);
		try {
			setState(946);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ERROR_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(942);
				match(ERROR_SYMBOL);
				}
				break;
			case NULL_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(943);
				match(NULL_SYMBOL);
				}
				break;
			case DEFAULT_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(944);
				match(DEFAULT_SYMBOL);
				setState(945);
				textStringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionOptionContext extends ParserRuleContext {
		public TerminalNode DISTINCT_SYMBOL() { return getToken(SQLSelectParser.DISTINCT_SYMBOL, 0); }
		public TerminalNode ALL_SYMBOL() { return getToken(SQLSelectParser.ALL_SYMBOL, 0); }
		public UnionOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionOption; }
	}

	public final UnionOptionContext unionOption() throws RecognitionException {
		UnionOptionContext _localctx = new UnionOptionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unionOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			_la = _input.LA(1);
			if ( !(_la==ALL_SYMBOL || _la==DISTINCT_SYMBOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS_SYMBOL() { return getToken(SQLSelectParser.AS_SYMBOL, 0); }
		public TerminalNode EQUAL_OPERATOR() { return getToken(SQLSelectParser.EQUAL_OPERATOR, 0); }
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_tableAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(950);
				_la = _input.LA(1);
				if ( !(_la==EQUAL_OPERATOR || _la==AS_SYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(953);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexHintListContext extends ParserRuleContext {
		public List<IndexHintContext> indexHint() {
			return getRuleContexts(IndexHintContext.class);
		}
		public IndexHintContext indexHint(int i) {
			return getRuleContext(IndexHintContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public IndexHintListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexHintList; }
	}

	public final IndexHintListContext indexHintList() throws RecognitionException {
		IndexHintListContext _localctx = new IndexHintListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_indexHintList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			indexHint();
			setState(960);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(956);
					match(COMMA_SYMBOL);
					setState(957);
					indexHint();
					}
					} 
				}
				setState(962);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexHintContext extends ParserRuleContext {
		public IndexHintTypeContext indexHintType() {
			return getRuleContext(IndexHintTypeContext.class,0);
		}
		public KeyOrIndexContext keyOrIndex() {
			return getRuleContext(KeyOrIndexContext.class,0);
		}
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public IndexListContext indexList() {
			return getRuleContext(IndexListContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public IndexHintClauseContext indexHintClause() {
			return getRuleContext(IndexHintClauseContext.class,0);
		}
		public TerminalNode USE_SYMBOL() { return getToken(SQLSelectParser.USE_SYMBOL, 0); }
		public IndexHintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexHint; }
	}

	public final IndexHintContext indexHint() throws RecognitionException {
		IndexHintContext _localctx = new IndexHintContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_indexHint);
		int _la;
		try {
			setState(983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORCE_SYMBOL:
			case IGNORE_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				indexHintType();
				setState(964);
				keyOrIndex();
				setState(966);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR_SYMBOL) {
					{
					setState(965);
					indexHintClause();
					}
				}

				setState(968);
				match(OPEN_PAR_SYMBOL);
				setState(969);
				indexList();
				setState(970);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case USE_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(972);
				match(USE_SYMBOL);
				setState(973);
				keyOrIndex();
				setState(975);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR_SYMBOL) {
					{
					setState(974);
					indexHintClause();
					}
				}

				setState(977);
				match(OPEN_PAR_SYMBOL);
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (TINYINT_SYMBOL - 46)) | (1L << (SMALLINT_SYMBOL - 46)) | (1L << (MEDIUMINT_SYMBOL - 46)) | (1L << (INT_SYMBOL - 46)) | (1L << (BIGINT_SYMBOL - 46)) | (1L << (SECOND_SYMBOL - 46)) | (1L << (MINUTE_SYMBOL - 46)) | (1L << (HOUR_SYMBOL - 46)) | (1L << (DAY_SYMBOL - 46)) | (1L << (WEEK_SYMBOL - 46)) | (1L << (MONTH_SYMBOL - 46)) | (1L << (QUARTER_SYMBOL - 46)) | (1L << (YEAR_SYMBOL - 46)) | (1L << (DEFAULT_SYMBOL - 46)) | (1L << (UNION_SYMBOL - 46)) | (1L << (SELECT_SYMBOL - 46)) | (1L << (ALL_SYMBOL - 46)) | (1L << (DISTINCT_SYMBOL - 46)) | (1L << (STRAIGHT_JOIN_SYMBOL - 46)) | (1L << (HIGH_PRIORITY_SYMBOL - 46)) | (1L << (SQL_SMALL_RESULT_SYMBOL - 46)) | (1L << (SQL_BIG_RESULT_SYMBOL - 46)) | (1L << (SQL_BUFFER_RESULT_SYMBOL - 46)) | (1L << (SQL_CALC_FOUND_ROWS_SYMBOL - 46)) | (1L << (LIMIT_SYMBOL - 46)) | (1L << (OFFSET_SYMBOL - 46)) | (1L << (INTO_SYMBOL - 46)) | (1L << (OUTFILE_SYMBOL - 46)) | (1L << (DUMPFILE_SYMBOL - 46)) | (1L << (PROCEDURE_SYMBOL - 46)) | (1L << (ANALYSE_SYMBOL - 46)) | (1L << (HAVING_SYMBOL - 46)) | (1L << (WINDOW_SYMBOL - 46)) | (1L << (AS_SYMBOL - 46)) | (1L << (PARTITION_SYMBOL - 46)) | (1L << (BY_SYMBOL - 46)) | (1L << (ROWS_SYMBOL - 46)) | (1L << (RANGE_SYMBOL - 46)) | (1L << (GROUPS_SYMBOL - 46)) | (1L << (UNBOUNDED_SYMBOL - 46)) | (1L << (PRECEDING_SYMBOL - 46)) | (1L << (INTERVAL_SYMBOL - 46)) | (1L << (CURRENT_SYMBOL - 46)) | (1L << (ROW_SYMBOL - 46)) | (1L << (BETWEEN_SYMBOL - 46)) | (1L << (AND_SYMBOL - 46)) | (1L << (FOLLOWING_SYMBOL - 46)) | (1L << (EXCLUDE_SYMBOL - 46)) | (1L << (GROUP_SYMBOL - 46)) | (1L << (TIES_SYMBOL - 46)) | (1L << (NO_SYMBOL - 46)) | (1L << (OTHERS_SYMBOL - 46)) | (1L << (WITH_SYMBOL - 46)) | (1L << (RECURSIVE_SYMBOL - 46)) | (1L << (ROLLUP_SYMBOL - 46)) | (1L << (CUBE_SYMBOL - 46)) | (1L << (ORDER_SYMBOL - 46)) | (1L << (ASC_SYMBOL - 46)) | (1L << (DESC_SYMBOL - 46)) | (1L << (FROM_SYMBOL - 46)) | (1L << (DUAL_SYMBOL - 46)) | (1L << (VALUES_SYMBOL - 46)) | (1L << (TABLE_SYMBOL - 46)) | (1L << (SQL_NO_CACHE_SYMBOL - 46)))) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (SQL_CACHE_SYMBOL - 110)) | (1L << (MAX_STATEMENT_TIME_SYMBOL - 110)) | (1L << (FOR_SYMBOL - 110)) | (1L << (OF_SYMBOL - 110)) | (1L << (LOCK_SYMBOL - 110)) | (1L << (IN_SYMBOL - 110)) | (1L << (SHARE_SYMBOL - 110)) | (1L << (MODE_SYMBOL - 110)) | (1L << (UPDATE_SYMBOL - 110)) | (1L << (SKIP_SYMBOL - 110)) | (1L << (LOCKED_SYMBOL - 110)) | (1L << (NOWAIT_SYMBOL - 110)) | (1L << (WHERE_SYMBOL - 110)) | (1L << (OJ_SYMBOL - 110)) | (1L << (ON_SYMBOL - 110)) | (1L << (USING_SYMBOL - 110)) | (1L << (NATURAL_SYMBOL - 110)) | (1L << (INNER_SYMBOL - 110)) | (1L << (JOIN_SYMBOL - 110)) | (1L << (LEFT_SYMBOL - 110)) | (1L << (RIGHT_SYMBOL - 110)) | (1L << (OUTER_SYMBOL - 110)) | (1L << (CROSS_SYMBOL - 110)) | (1L << (LATERAL_SYMBOL - 110)) | (1L << (JSON_TABLE_SYMBOL - 110)) | (1L << (COLUMNS_SYMBOL - 110)) | (1L << (ORDINALITY_SYMBOL - 110)) | (1L << (EXISTS_SYMBOL - 110)) | (1L << (PATH_SYMBOL - 110)) | (1L << (NESTED_SYMBOL - 110)) | (1L << (EMPTY_SYMBOL - 110)) | (1L << (ERROR_SYMBOL - 110)) | (1L << (NULL_SYMBOL - 110)) | (1L << (USE_SYMBOL - 110)) | (1L << (FORCE_SYMBOL - 110)) | (1L << (IGNORE_SYMBOL - 110)) | (1L << (KEY_SYMBOL - 110)) | (1L << (INDEX_SYMBOL - 110)) | (1L << (PRIMARY_SYMBOL - 110)) | (1L << (IS_SYMBOL - 110)) | (1L << (TRUE_SYMBOL - 110)) | (1L << (FALSE_SYMBOL - 110)) | (1L << (UNKNOWN_SYMBOL - 110)) | (1L << (NOT_SYMBOL - 110)) | (1L << (XOR_SYMBOL - 110)) | (1L << (OR_SYMBOL - 110)) | (1L << (ANY_SYMBOL - 110)) | (1L << (MEMBER_SYMBOL - 110)) | (1L << (SOUNDS_SYMBOL - 110)) | (1L << (LIKE_SYMBOL - 110)) | (1L << (ESCAPE_SYMBOL - 110)) | (1L << (REGEXP_SYMBOL - 110)) | (1L << (DIV_SYMBOL - 110)) | (1L << (MOD_SYMBOL - 110)) | (1L << (MATCH_SYMBOL - 110)) | (1L << (AGAINST_SYMBOL - 110)) | (1L << (BINARY_SYMBOL - 110)) | (1L << (CAST_SYMBOL - 110)) | (1L << (ARRAY_SYMBOL - 110)) | (1L << (CASE_SYMBOL - 110)) | (1L << (END_SYMBOL - 110)) | (1L << (CONVERT_SYMBOL - 110)) | (1L << (COLLATE_SYMBOL - 110)) | (1L << (AVG_SYMBOL - 110)))) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (BIT_AND_SYMBOL - 174)) | (1L << (BIT_OR_SYMBOL - 174)) | (1L << (BIT_XOR_SYMBOL - 174)) | (1L << (COUNT_SYMBOL - 174)) | (1L << (MIN_SYMBOL - 174)) | (1L << (MAX_SYMBOL - 174)) | (1L << (STD_SYMBOL - 174)) | (1L << (VARIANCE_SYMBOL - 174)) | (1L << (STDDEV_SAMP_SYMBOL - 174)) | (1L << (VAR_SAMP_SYMBOL - 174)) | (1L << (SUM_SYMBOL - 174)) | (1L << (GROUP_CONCAT_SYMBOL - 174)) | (1L << (SEPARATOR_SYMBOL - 174)) | (1L << (GROUPING_SYMBOL - 174)) | (1L << (ROW_NUMBER_SYMBOL - 174)) | (1L << (RANK_SYMBOL - 174)) | (1L << (DENSE_RANK_SYMBOL - 174)) | (1L << (CUME_DIST_SYMBOL - 174)) | (1L << (PERCENT_RANK_SYMBOL - 174)) | (1L << (NTILE_SYMBOL - 174)) | (1L << (LEAD_SYMBOL - 174)) | (1L << (LAG_SYMBOL - 174)) | (1L << (FIRST_VALUE_SYMBOL - 174)) | (1L << (LAST_VALUE_SYMBOL - 174)) | (1L << (NTH_VALUE_SYMBOL - 174)) | (1L << (FIRST_SYMBOL - 174)) | (1L << (LAST_SYMBOL - 174)) | (1L << (OVER_SYMBOL - 174)) | (1L << (RESPECT_SYMBOL - 174)) | (1L << (NULLS_SYMBOL - 174)) | (1L << (JSON_ARRAYAGG_SYMBOL - 174)) | (1L << (JSON_OBJECTAGG_SYMBOL - 174)) | (1L << (BOOLEAN_SYMBOL - 174)) | (1L << (LANGUAGE_SYMBOL - 174)) | (1L << (QUERY_SYMBOL - 174)) | (1L << (EXPANSION_SYMBOL - 174)) | (1L << (CHAR_SYMBOL - 174)) | (1L << (CURRENT_USER_SYMBOL - 174)) | (1L << (DATE_SYMBOL - 174)) | (1L << (INSERT_SYMBOL - 174)) | (1L << (TIME_SYMBOL - 174)) | (1L << (TIMESTAMP_SYMBOL - 174)) | (1L << (USER_SYMBOL - 174)) | (1L << (ADDDATE_SYMBOL - 174)) | (1L << (SUBDATE_SYMBOL - 174)) | (1L << (CURDATE_SYMBOL - 174)) | (1L << (CURTIME_SYMBOL - 174)) | (1L << (DATE_ADD_SYMBOL - 174)) | (1L << (DATE_SUB_SYMBOL - 174)) | (1L << (EXTRACT_SYMBOL - 174)) | (1L << (GET_FORMAT_SYMBOL - 174)) | (1L << (NOW_SYMBOL - 174)) | (1L << (POSITION_SYMBOL - 174)) | (1L << (SYSDATE_SYMBOL - 174)) | (1L << (TIMESTAMP_ADD_SYMBOL - 174)) | (1L << (TIMESTAMP_DIFF_SYMBOL - 174)) | (1L << (UTC_DATE_SYMBOL - 174)) | (1L << (UTC_TIME_SYMBOL - 174)) | (1L << (UTC_TIMESTAMP_SYMBOL - 174)) | (1L << (ASCII_SYMBOL - 174)) | (1L << (CHARSET_SYMBOL - 174)) | (1L << (COALESCE_SYMBOL - 174)) | (1L << (COLLATION_SYMBOL - 174)) | (1L << (DATABASE_SYMBOL - 174)))) != 0) || ((((_la - 238)) & ~0x3f) == 0 && ((1L << (_la - 238)) & ((1L << (IF_SYMBOL - 238)) | (1L << (FORMAT_SYMBOL - 238)) | (1L << (MICROSECOND_SYMBOL - 238)) | (1L << (OLD_PASSWORD_SYMBOL - 238)) | (1L << (PASSWORD_SYMBOL - 238)) | (1L << (REPEAT_SYMBOL - 238)) | (1L << (REPLACE_SYMBOL - 238)) | (1L << (REVERSE_SYMBOL - 238)) | (1L << (ROW_COUNT_SYMBOL - 238)) | (1L << (TRUNCATE_SYMBOL - 238)) | (1L << (WEIGHT_STRING_SYMBOL - 238)) | (1L << (CONTAINS_SYMBOL - 238)) | (1L << (GEOMETRYCOLLECTION_SYMBOL - 238)) | (1L << (LINESTRING_SYMBOL - 238)) | (1L << (MULTILINESTRING_SYMBOL - 238)) | (1L << (MULTIPOINT_SYMBOL - 238)) | (1L << (MULTIPOLYGON_SYMBOL - 238)) | (1L << (POINT_SYMBOL - 238)) | (1L << (POLYGON_SYMBOL - 238)) | (1L << (LEVEL_SYMBOL - 238)) | (1L << (DATETIME_SYMBOL - 238)) | (1L << (TRIM_SYMBOL - 238)) | (1L << (LEADING_SYMBOL - 238)) | (1L << (TRAILING_SYMBOL - 238)) | (1L << (BOTH_SYMBOL - 238)) | (1L << (SUBSTRING_SYMBOL - 238)) | (1L << (WHEN_SYMBOL - 238)) | (1L << (THEN_SYMBOL - 238)) | (1L << (ELSE_SYMBOL - 238)) | (1L << (SIGNED_SYMBOL - 238)) | (1L << (UNSIGNED_SYMBOL - 238)) | (1L << (DECIMAL_SYMBOL - 238)) | (1L << (JSON_SYMBOL - 238)) | (1L << (FLOAT_SYMBOL - 238)) | (1L << (SET_SYMBOL - 238)) | (1L << (SECOND_MICROSECOND_SYMBOL - 238)) | (1L << (MINUTE_MICROSECOND_SYMBOL - 238)) | (1L << (MINUTE_SECOND_SYMBOL - 238)) | (1L << (HOUR_MICROSECOND_SYMBOL - 238)) | (1L << (HOUR_SECOND_SYMBOL - 238)) | (1L << (HOUR_MINUTE_SYMBOL - 238)) | (1L << (DAY_MICROSECOND_SYMBOL - 238)) | (1L << (DAY_SECOND_SYMBOL - 238)) | (1L << (DAY_MINUTE_SYMBOL - 238)) | (1L << (DAY_HOUR_SYMBOL - 238)) | (1L << (YEAR_MONTH_SYMBOL - 238)) | (1L << (BTREE_SYMBOL - 238)) | (1L << (RTREE_SYMBOL - 238)) | (1L << (HASH_SYMBOL - 238)) | (1L << (REAL_SYMBOL - 238)) | (1L << (DOUBLE_SYMBOL - 238)) | (1L << (PRECISION_SYMBOL - 238)) | (1L << (NUMERIC_SYMBOL - 238)) | (1L << (FIXED_SYMBOL - 238)) | (1L << (BIT_SYMBOL - 238)) | (1L << (BOOL_SYMBOL - 238)) | (1L << (VARYING_SYMBOL - 238)) | (1L << (VARCHAR_SYMBOL - 238)) | (1L << (NATIONAL_SYMBOL - 238)) | (1L << (NVARCHAR_SYMBOL - 238)) | (1L << (NCHAR_SYMBOL - 238)) | (1L << (VARBINARY_SYMBOL - 238)) | (1L << (TINYBLOB_SYMBOL - 238)) | (1L << (BLOB_SYMBOL - 238)))) != 0) || ((((_la - 302)) & ~0x3f) == 0 && ((1L << (_la - 302)) & ((1L << (MEDIUMBLOB_SYMBOL - 302)) | (1L << (LONGBLOB_SYMBOL - 302)) | (1L << (LONG_SYMBOL - 302)) | (1L << (TINYTEXT_SYMBOL - 302)) | (1L << (TEXT_SYMBOL - 302)) | (1L << (MEDIUMTEXT_SYMBOL - 302)) | (1L << (LONGTEXT_SYMBOL - 302)) | (1L << (ENUM_SYMBOL - 302)) | (1L << (SERIAL_SYMBOL - 302)) | (1L << (GEOMETRY_SYMBOL - 302)) | (1L << (ZEROFILL_SYMBOL - 302)) | (1L << (BYTE_SYMBOL - 302)) | (1L << (UNICODE_SYMBOL - 302)) | (1L << (TERMINATED_SYMBOL - 302)) | (1L << (OPTIONALLY_SYMBOL - 302)) | (1L << (ENCLOSED_SYMBOL - 302)) | (1L << (ESCAPED_SYMBOL - 302)) | (1L << (LINES_SYMBOL - 302)) | (1L << (STARTING_SYMBOL - 302)) | (1L << (GLOBAL_SYMBOL - 302)) | (1L << (LOCAL_SYMBOL - 302)) | (1L << (SESSION_SYMBOL - 302)) | (1L << (IDENTIFIER - 302)) | (1L << (BACK_TICK_QUOTED_ID - 302)) | (1L << (DOUBLE_QUOTED_TEXT - 302)) | (1L << (SINGLE_QUOTED_TEXT - 302)) | (1L << (BRACKET_QUOTED_TEXT - 302)))) != 0)) {
					{
					setState(978);
					indexList();
					}
				}

				setState(981);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexHintTypeContext extends ParserRuleContext {
		public TerminalNode FORCE_SYMBOL() { return getToken(SQLSelectParser.FORCE_SYMBOL, 0); }
		public TerminalNode IGNORE_SYMBOL() { return getToken(SQLSelectParser.IGNORE_SYMBOL, 0); }
		public IndexHintTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexHintType; }
	}

	public final IndexHintTypeContext indexHintType() throws RecognitionException {
		IndexHintTypeContext _localctx = new IndexHintTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_indexHintType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			_la = _input.LA(1);
			if ( !(_la==FORCE_SYMBOL || _la==IGNORE_SYMBOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyOrIndexContext extends ParserRuleContext {
		public TerminalNode KEY_SYMBOL() { return getToken(SQLSelectParser.KEY_SYMBOL, 0); }
		public TerminalNode INDEX_SYMBOL() { return getToken(SQLSelectParser.INDEX_SYMBOL, 0); }
		public KeyOrIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyOrIndex; }
	}

	public final KeyOrIndexContext keyOrIndex() throws RecognitionException {
		KeyOrIndexContext _localctx = new KeyOrIndexContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_keyOrIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			_la = _input.LA(1);
			if ( !(_la==KEY_SYMBOL || _la==INDEX_SYMBOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexHintClauseContext extends ParserRuleContext {
		public TerminalNode FOR_SYMBOL() { return getToken(SQLSelectParser.FOR_SYMBOL, 0); }
		public TerminalNode JOIN_SYMBOL() { return getToken(SQLSelectParser.JOIN_SYMBOL, 0); }
		public TerminalNode ORDER_SYMBOL() { return getToken(SQLSelectParser.ORDER_SYMBOL, 0); }
		public TerminalNode BY_SYMBOL() { return getToken(SQLSelectParser.BY_SYMBOL, 0); }
		public TerminalNode GROUP_SYMBOL() { return getToken(SQLSelectParser.GROUP_SYMBOL, 0); }
		public IndexHintClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexHintClause; }
	}

	public final IndexHintClauseContext indexHintClause() throws RecognitionException {
		IndexHintClauseContext _localctx = new IndexHintClauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_indexHintClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(FOR_SYMBOL);
			setState(995);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN_SYMBOL:
				{
				setState(990);
				match(JOIN_SYMBOL);
				}
				break;
			case ORDER_SYMBOL:
				{
				setState(991);
				match(ORDER_SYMBOL);
				setState(992);
				match(BY_SYMBOL);
				}
				break;
			case GROUP_SYMBOL:
				{
				setState(993);
				match(GROUP_SYMBOL);
				setState(994);
				match(BY_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexListContext extends ParserRuleContext {
		public List<IndexListElementContext> indexListElement() {
			return getRuleContexts(IndexListElementContext.class);
		}
		public IndexListElementContext indexListElement(int i) {
			return getRuleContext(IndexListElementContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public IndexListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexList; }
	}

	public final IndexListContext indexList() throws RecognitionException {
		IndexListContext _localctx = new IndexListContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_indexList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			indexListElement();
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(998);
				match(COMMA_SYMBOL);
				setState(999);
				indexListElement();
				}
				}
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexListElementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PRIMARY_SYMBOL() { return getToken(SQLSelectParser.PRIMARY_SYMBOL, 0); }
		public IndexListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexListElement; }
	}

	public final IndexListElementContext indexListElement() throws RecognitionException {
		IndexListElementContext _localctx = new IndexListElementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_indexListElement);
		try {
			setState(1007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1006);
				match(PRIMARY_SYMBOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprOrContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR_SYMBOL() { return getToken(SQLSelectParser.OR_SYMBOL, 0); }
		public TerminalNode LOGICAL_OR_OPERATOR() { return getToken(SQLSelectParser.LOGICAL_OR_OPERATOR, 0); }
		public ExprOrContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprNotContext extends ExprContext {
		public TerminalNode NOT_SYMBOL() { return getToken(SQLSelectParser.NOT_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNotContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIsContext extends ExprContext {
		public Token type;
		public BoolPriContext boolPri() {
			return getRuleContext(BoolPriContext.class,0);
		}
		public TerminalNode IS_SYMBOL() { return getToken(SQLSelectParser.IS_SYMBOL, 0); }
		public TerminalNode TRUE_SYMBOL() { return getToken(SQLSelectParser.TRUE_SYMBOL, 0); }
		public TerminalNode FALSE_SYMBOL() { return getToken(SQLSelectParser.FALSE_SYMBOL, 0); }
		public TerminalNode UNKNOWN_SYMBOL() { return getToken(SQLSelectParser.UNKNOWN_SYMBOL, 0); }
		public NotRuleContext notRule() {
			return getRuleContext(NotRuleContext.class,0);
		}
		public ExprIsContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAndContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND_SYMBOL() { return getToken(SQLSelectParser.AND_SYMBOL, 0); }
		public TerminalNode LOGICAL_AND_OPERATOR() { return getToken(SQLSelectParser.LOGICAL_AND_OPERATOR, 0); }
		public ExprAndContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprXorContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode XOR_SYMBOL() { return getToken(SQLSelectParser.XOR_SYMBOL, 0); }
		public ExprXorContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 150;
		enterRecursionRule(_localctx, 150, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				_localctx = new ExprIsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1010);
				boolPri(0);
				setState(1016);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1011);
					match(IS_SYMBOL);
					setState(1013);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NOT_SYMBOL) {
						{
						setState(1012);
						notRule();
						}
					}

					setState(1015);
					((ExprIsContext)_localctx).type = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (TRUE_SYMBOL - 150)) | (1L << (FALSE_SYMBOL - 150)) | (1L << (UNKNOWN_SYMBOL - 150)))) != 0)) ) {
						((ExprIsContext)_localctx).type = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1018);
				match(NOT_SYMBOL);
				setState(1019);
				expr(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1033);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1031);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
					case 1:
						{
						_localctx = new ExprAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1022);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1023);
						((ExprAndContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LOGICAL_AND_OPERATOR || _la==AND_SYMBOL) ) {
							((ExprAndContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1024);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprXorContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1025);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1026);
						match(XOR_SYMBOL);
						setState(1027);
						expr(3);
						}
						break;
					case 3:
						{
						_localctx = new ExprOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1028);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1029);
						((ExprOrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LOGICAL_OR_OPERATOR || _la==OR_SYMBOL) ) {
							((ExprOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1030);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(1035);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,122,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolPriContext extends ParserRuleContext {
		public BoolPriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolPri; }
	 
		public BoolPriContext() { }
		public void copyFrom(BoolPriContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryExprPredicateContext extends BoolPriContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PrimaryExprPredicateContext(BoolPriContext ctx) { copyFrom(ctx); }
	}
	public static class PrimaryExprCompareContext extends BoolPriContext {
		public BoolPriContext boolPri() {
			return getRuleContext(BoolPriContext.class,0);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PrimaryExprCompareContext(BoolPriContext ctx) { copyFrom(ctx); }
	}
	public static class PrimaryExprAllAnyContext extends BoolPriContext {
		public BoolPriContext boolPri() {
			return getRuleContext(BoolPriContext.class,0);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL_SYMBOL() { return getToken(SQLSelectParser.ALL_SYMBOL, 0); }
		public TerminalNode ANY_SYMBOL() { return getToken(SQLSelectParser.ANY_SYMBOL, 0); }
		public PrimaryExprAllAnyContext(BoolPriContext ctx) { copyFrom(ctx); }
	}
	public static class PrimaryExprIsNullContext extends BoolPriContext {
		public BoolPriContext boolPri() {
			return getRuleContext(BoolPriContext.class,0);
		}
		public TerminalNode IS_SYMBOL() { return getToken(SQLSelectParser.IS_SYMBOL, 0); }
		public TerminalNode NULL_SYMBOL() { return getToken(SQLSelectParser.NULL_SYMBOL, 0); }
		public NotRuleContext notRule() {
			return getRuleContext(NotRuleContext.class,0);
		}
		public PrimaryExprIsNullContext(BoolPriContext ctx) { copyFrom(ctx); }
	}

	public final BoolPriContext boolPri() throws RecognitionException {
		return boolPri(0);
	}

	private BoolPriContext boolPri(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolPriContext _localctx = new BoolPriContext(_ctx, _parentState);
		BoolPriContext _prevctx = _localctx;
		int _startState = 152;
		enterRecursionRule(_localctx, 152, RULE_boolPri, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryExprPredicateContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1037);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(1056);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1054);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryExprIsNullContext(new BoolPriContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolPri);
						setState(1039);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1040);
						match(IS_SYMBOL);
						setState(1042);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_SYMBOL) {
							{
							setState(1041);
							notRule();
							}
						}

						setState(1044);
						match(NULL_SYMBOL);
						}
						break;
					case 2:
						{
						_localctx = new PrimaryExprCompareContext(new BoolPriContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolPri);
						setState(1045);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1046);
						compOp();
						setState(1047);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new PrimaryExprAllAnyContext(new BoolPriContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolPri);
						setState(1049);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1050);
						compOp();
						setState(1051);
						_la = _input.LA(1);
						if ( !(_la==ALL_SYMBOL || _la==ANY_SYMBOL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1052);
						subquery();
						}
						break;
					}
					} 
				}
				setState(1058);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompOpContext extends ParserRuleContext {
		public TerminalNode EQUAL_OPERATOR() { return getToken(SQLSelectParser.EQUAL_OPERATOR, 0); }
		public TerminalNode NULL_SAFE_EQUAL_OPERATOR() { return getToken(SQLSelectParser.NULL_SAFE_EQUAL_OPERATOR, 0); }
		public TerminalNode GREATER_OR_EQUAL_OPERATOR() { return getToken(SQLSelectParser.GREATER_OR_EQUAL_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_OPERATOR() { return getToken(SQLSelectParser.GREATER_THAN_OPERATOR, 0); }
		public TerminalNode LESS_OR_EQUAL_OPERATOR() { return getToken(SQLSelectParser.LESS_OR_EQUAL_OPERATOR, 0); }
		public TerminalNode LESS_THAN_OPERATOR() { return getToken(SQLSelectParser.LESS_THAN_OPERATOR, 0); }
		public TerminalNode NOT_EQUAL_OPERATOR() { return getToken(SQLSelectParser.NOT_EQUAL_OPERATOR, 0); }
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL_OPERATOR) | (1L << NULL_SAFE_EQUAL_OPERATOR) | (1L << GREATER_OR_EQUAL_OPERATOR) | (1L << GREATER_THAN_OPERATOR) | (1L << LESS_OR_EQUAL_OPERATOR) | (1L << LESS_THAN_OPERATOR) | (1L << NOT_EQUAL_OPERATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public PredicateOperationsContext predicateOperations() {
			return getRuleContext(PredicateOperationsContext.class,0);
		}
		public TerminalNode MEMBER_SYMBOL() { return getToken(SQLSelectParser.MEMBER_SYMBOL, 0); }
		public SimpleExprWithParenthesesContext simpleExprWithParentheses() {
			return getRuleContext(SimpleExprWithParenthesesContext.class,0);
		}
		public TerminalNode SOUNDS_SYMBOL() { return getToken(SQLSelectParser.SOUNDS_SYMBOL, 0); }
		public TerminalNode LIKE_SYMBOL() { return getToken(SQLSelectParser.LIKE_SYMBOL, 0); }
		public NotRuleContext notRule() {
			return getRuleContext(NotRuleContext.class,0);
		}
		public TerminalNode OF_SYMBOL() { return getToken(SQLSelectParser.OF_SYMBOL, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			bitExpr(0);
			setState(1074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1063);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT_SYMBOL) {
					{
					setState(1062);
					notRule();
					}
				}

				setState(1065);
				predicateOperations();
				}
				break;
			case 2:
				{
				setState(1066);
				match(MEMBER_SYMBOL);
				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OF_SYMBOL) {
					{
					setState(1067);
					match(OF_SYMBOL);
					}
				}

				setState(1070);
				simpleExprWithParentheses();
				}
				break;
			case 3:
				{
				setState(1071);
				match(SOUNDS_SYMBOL);
				setState(1072);
				match(LIKE_SYMBOL);
				setState(1073);
				bitExpr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateOperationsContext extends ParserRuleContext {
		public PredicateOperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperations; }
	 
		public PredicateOperationsContext() { }
		public void copyFrom(PredicateOperationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PredicateExprRegexContext extends PredicateOperationsContext {
		public TerminalNode REGEXP_SYMBOL() { return getToken(SQLSelectParser.REGEXP_SYMBOL, 0); }
		public BitExprContext bitExpr() {
			return getRuleContext(BitExprContext.class,0);
		}
		public PredicateExprRegexContext(PredicateOperationsContext ctx) { copyFrom(ctx); }
	}
	public static class PredicateExprBetweenContext extends PredicateOperationsContext {
		public TerminalNode BETWEEN_SYMBOL() { return getToken(SQLSelectParser.BETWEEN_SYMBOL, 0); }
		public BitExprContext bitExpr() {
			return getRuleContext(BitExprContext.class,0);
		}
		public TerminalNode AND_SYMBOL() { return getToken(SQLSelectParser.AND_SYMBOL, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicateExprBetweenContext(PredicateOperationsContext ctx) { copyFrom(ctx); }
	}
	public static class PredicateExprInContext extends PredicateOperationsContext {
		public TerminalNode IN_SYMBOL() { return getToken(SQLSelectParser.IN_SYMBOL, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public PredicateExprInContext(PredicateOperationsContext ctx) { copyFrom(ctx); }
	}
	public static class PredicateExprLikeContext extends PredicateOperationsContext {
		public TerminalNode LIKE_SYMBOL() { return getToken(SQLSelectParser.LIKE_SYMBOL, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ESCAPE_SYMBOL() { return getToken(SQLSelectParser.ESCAPE_SYMBOL, 0); }
		public PredicateExprLikeContext(PredicateOperationsContext ctx) { copyFrom(ctx); }
	}

	public final PredicateOperationsContext predicateOperations() throws RecognitionException {
		PredicateOperationsContext _localctx = new PredicateOperationsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_predicateOperations);
		try {
			setState(1097);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IN_SYMBOL:
				_localctx = new PredicateExprInContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1076);
				match(IN_SYMBOL);
				setState(1082);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1077);
					subquery();
					}
					break;
				case 2:
					{
					setState(1078);
					match(OPEN_PAR_SYMBOL);
					setState(1079);
					exprList();
					setState(1080);
					match(CLOSE_PAR_SYMBOL);
					}
					break;
				}
				}
				break;
			case BETWEEN_SYMBOL:
				_localctx = new PredicateExprBetweenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				match(BETWEEN_SYMBOL);
				setState(1085);
				bitExpr(0);
				setState(1086);
				match(AND_SYMBOL);
				setState(1087);
				predicate();
				}
				break;
			case LIKE_SYMBOL:
				_localctx = new PredicateExprLikeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1089);
				match(LIKE_SYMBOL);
				setState(1090);
				simpleExpr(0);
				setState(1093);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1091);
					match(ESCAPE_SYMBOL);
					setState(1092);
					simpleExpr(0);
					}
					break;
				}
				}
				break;
			case REGEXP_SYMBOL:
				_localctx = new PredicateExprRegexContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1095);
				match(REGEXP_SYMBOL);
				setState(1096);
				bitExpr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BitExprContext extends ParserRuleContext {
		public Token op;
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode BITWISE_XOR_OPERATOR() { return getToken(SQLSelectParser.BITWISE_XOR_OPERATOR, 0); }
		public TerminalNode MULT_OPERATOR() { return getToken(SQLSelectParser.MULT_OPERATOR, 0); }
		public TerminalNode DIV_OPERATOR() { return getToken(SQLSelectParser.DIV_OPERATOR, 0); }
		public TerminalNode MOD_OPERATOR() { return getToken(SQLSelectParser.MOD_OPERATOR, 0); }
		public TerminalNode DIV_SYMBOL() { return getToken(SQLSelectParser.DIV_SYMBOL, 0); }
		public TerminalNode MOD_SYMBOL() { return getToken(SQLSelectParser.MOD_SYMBOL, 0); }
		public TerminalNode PLUS_OPERATOR() { return getToken(SQLSelectParser.PLUS_OPERATOR, 0); }
		public TerminalNode MINUS_OPERATOR() { return getToken(SQLSelectParser.MINUS_OPERATOR, 0); }
		public TerminalNode SHIFT_LEFT_OPERATOR() { return getToken(SQLSelectParser.SHIFT_LEFT_OPERATOR, 0); }
		public TerminalNode SHIFT_RIGHT_OPERATOR() { return getToken(SQLSelectParser.SHIFT_RIGHT_OPERATOR, 0); }
		public TerminalNode BITWISE_AND_OPERATOR() { return getToken(SQLSelectParser.BITWISE_AND_OPERATOR, 0); }
		public TerminalNode BITWISE_OR_OPERATOR() { return getToken(SQLSelectParser.BITWISE_OR_OPERATOR, 0); }
		public TerminalNode INTERVAL_SYMBOL() { return getToken(SQLSelectParser.INTERVAL_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		return bitExpr(0);
	}

	private BitExprContext bitExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitExprContext _localctx = new BitExprContext(_ctx, _parentState);
		BitExprContext _prevctx = _localctx;
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_bitExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1100);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1102);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1103);
						((BitExprContext)_localctx).op = match(BITWISE_XOR_OPERATOR);
						setState(1104);
						bitExpr(8);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1105);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1106);
						((BitExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT_OPERATOR) | (1L << DIV_OPERATOR) | (1L << MOD_OPERATOR))) != 0) || _la==DIV_SYMBOL || _la==MOD_SYMBOL) ) {
							((BitExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1107);
						bitExpr(7);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1108);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1109);
						((BitExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS_OPERATOR || _la==MINUS_OPERATOR) ) {
							((BitExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1110);
						bitExpr(6);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1111);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1112);
						((BitExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SHIFT_LEFT_OPERATOR || _la==SHIFT_RIGHT_OPERATOR) ) {
							((BitExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1113);
						bitExpr(4);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1114);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1115);
						((BitExprContext)_localctx).op = match(BITWISE_AND_OPERATOR);
						setState(1116);
						bitExpr(3);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1117);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1118);
						((BitExprContext)_localctx).op = match(BITWISE_OR_OPERATOR);
						setState(1119);
						bitExpr(2);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(1120);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1121);
						((BitExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS_OPERATOR || _la==MINUS_OPERATOR) ) {
							((BitExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1122);
						match(INTERVAL_SYMBOL);
						setState(1123);
						expr(0);
						setState(1124);
						interval();
						}
						break;
					}
					} 
				}
				setState(1130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,133,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SimpleExprContext extends ParserRuleContext {
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
	 
		public SimpleExprContext() { }
		public void copyFrom(SimpleExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleExprConvertContext extends SimpleExprContext {
		public TerminalNode CONVERT_SYMBOL() { return getToken(SQLSelectParser.CONVERT_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA_SYMBOL() { return getToken(SQLSelectParser.COMMA_SYMBOL, 0); }
		public CastTypeContext castType() {
			return getRuleContext(CastTypeContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public SimpleExprConvertContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprVariableContext extends SimpleExprContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SimpleExprVariableContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprCastContext extends SimpleExprContext {
		public TerminalNode CAST_SYMBOL() { return getToken(SQLSelectParser.CAST_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode AS_SYMBOL() { return getToken(SQLSelectParser.AS_SYMBOL, 0); }
		public CastTypeContext castType() {
			return getRuleContext(CastTypeContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public TerminalNode ARRAY_SYMBOL() { return getToken(SQLSelectParser.ARRAY_SYMBOL, 0); }
		public SimpleExprCastContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprUnaryContext extends SimpleExprContext {
		public Token op;
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode PLUS_OPERATOR() { return getToken(SQLSelectParser.PLUS_OPERATOR, 0); }
		public TerminalNode MINUS_OPERATOR() { return getToken(SQLSelectParser.MINUS_OPERATOR, 0); }
		public TerminalNode BITWISE_NOT_OPERATOR() { return getToken(SQLSelectParser.BITWISE_NOT_OPERATOR, 0); }
		public SimpleExprUnaryContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprOdbcContext extends SimpleExprContext {
		public TerminalNode OPEN_CURLY_SYMBOL() { return getToken(SQLSelectParser.OPEN_CURLY_SYMBOL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_CURLY_SYMBOL() { return getToken(SQLSelectParser.CLOSE_CURLY_SYMBOL, 0); }
		public SimpleExprOdbcContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprRuntimeFunctionContext extends SimpleExprContext {
		public RuntimeFunctionCallContext runtimeFunctionCall() {
			return getRuleContext(RuntimeFunctionCallContext.class,0);
		}
		public SimpleExprRuntimeFunctionContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprFunctionContext extends SimpleExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public SimpleExprFunctionContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprCollateContext extends SimpleExprContext {
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode COLLATE_SYMBOL() { return getToken(SQLSelectParser.COLLATE_SYMBOL, 0); }
		public TextOrIdentifierContext textOrIdentifier() {
			return getRuleContext(TextOrIdentifierContext.class,0);
		}
		public SimpleExprCollateContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprMatchContext extends SimpleExprContext {
		public TerminalNode MATCH_SYMBOL() { return getToken(SQLSelectParser.MATCH_SYMBOL, 0); }
		public IdentListArgContext identListArg() {
			return getRuleContext(IdentListArgContext.class,0);
		}
		public TerminalNode AGAINST_SYMBOL() { return getToken(SQLSelectParser.AGAINST_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public BitExprContext bitExpr() {
			return getRuleContext(BitExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public FulltextOptionsContext fulltextOptions() {
			return getRuleContext(FulltextOptionsContext.class,0);
		}
		public SimpleExprMatchContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprWindowingFunctionContext extends SimpleExprContext {
		public WindowFunctionCallContext windowFunctionCall() {
			return getRuleContext(WindowFunctionCallContext.class,0);
		}
		public SimpleExprWindowingFunctionContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprBinaryContext extends SimpleExprContext {
		public TerminalNode BINARY_SYMBOL() { return getToken(SQLSelectParser.BINARY_SYMBOL, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public SimpleExprBinaryContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprColumnRefContext extends SimpleExprContext {
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public JsonOperatorContext jsonOperator() {
			return getRuleContext(JsonOperatorContext.class,0);
		}
		public SimpleExprColumnRefContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprParamMarkerContext extends SimpleExprContext {
		public TerminalNode PARAM_MARKER() { return getToken(SQLSelectParser.PARAM_MARKER, 0); }
		public SimpleExprParamMarkerContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprSumContext extends SimpleExprContext {
		public SumExprContext sumExpr() {
			return getRuleContext(SumExprContext.class,0);
		}
		public SimpleExprSumContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprConvertUsingContext extends SimpleExprContext {
		public TerminalNode CONVERT_SYMBOL() { return getToken(SQLSelectParser.CONVERT_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode USING_SYMBOL() { return getToken(SQLSelectParser.USING_SYMBOL, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public SimpleExprConvertUsingContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprSubQueryContext extends SimpleExprContext {
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS_SYMBOL() { return getToken(SQLSelectParser.EXISTS_SYMBOL, 0); }
		public SimpleExprSubQueryContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprGroupingOperationContext extends SimpleExprContext {
		public GroupingOperationContext groupingOperation() {
			return getRuleContext(GroupingOperationContext.class,0);
		}
		public SimpleExprGroupingOperationContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprNotContext extends SimpleExprContext {
		public Not2RuleContext not2Rule() {
			return getRuleContext(Not2RuleContext.class,0);
		}
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public SimpleExprNotContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprValuesContext extends SimpleExprContext {
		public TerminalNode VALUES_SYMBOL() { return getToken(SQLSelectParser.VALUES_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public SimpleExprValuesContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprDefaultContext extends SimpleExprContext {
		public TerminalNode DEFAULT_SYMBOL() { return getToken(SQLSelectParser.DEFAULT_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public SimpleExprDefaultContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprListContext extends SimpleExprContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public TerminalNode ROW_SYMBOL() { return getToken(SQLSelectParser.ROW_SYMBOL, 0); }
		public SimpleExprListContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprIntervalContext extends SimpleExprContext {
		public TerminalNode INTERVAL_SYMBOL() { return getToken(SQLSelectParser.INTERVAL_SYMBOL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode PLUS_OPERATOR() { return getToken(SQLSelectParser.PLUS_OPERATOR, 0); }
		public SimpleExprIntervalContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprCaseContext extends SimpleExprContext {
		public TerminalNode CASE_SYMBOL() { return getToken(SQLSelectParser.CASE_SYMBOL, 0); }
		public TerminalNode END_SYMBOL() { return getToken(SQLSelectParser.END_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<WhenExpressionContext> whenExpression() {
			return getRuleContexts(WhenExpressionContext.class);
		}
		public WhenExpressionContext whenExpression(int i) {
			return getRuleContext(WhenExpressionContext.class,i);
		}
		public List<ThenExpressionContext> thenExpression() {
			return getRuleContexts(ThenExpressionContext.class);
		}
		public ThenExpressionContext thenExpression(int i) {
			return getRuleContext(ThenExpressionContext.class,i);
		}
		public ElseExpressionContext elseExpression() {
			return getRuleContext(ElseExpressionContext.class,0);
		}
		public SimpleExprCaseContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprConcatContext extends SimpleExprContext {
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode LOGICAL_OR_OPERATOR() { return getToken(SQLSelectParser.LOGICAL_OR_OPERATOR, 0); }
		public SimpleExprConcatContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleExprLiteralContext extends SimpleExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SimpleExprLiteralContext(SimpleExprContext ctx) { copyFrom(ctx); }
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		return simpleExpr(0);
	}

	private SimpleExprContext simpleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, _parentState);
		SimpleExprContext _prevctx = _localctx;
		int _startState = 162;
		enterRecursionRule(_localctx, 162, RULE_simpleExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				_localctx = new SimpleExprVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1132);
				variable();
				setState(1136);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1133);
					equal();
					setState(1134);
					expr(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new SimpleExprColumnRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1138);
				qualifiedIdentifier();
				setState(1140);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1139);
					jsonOperator();
					}
					break;
				}
				}
				break;
			case 3:
				{
				_localctx = new SimpleExprRuntimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1142);
				runtimeFunctionCall();
				}
				break;
			case 4:
				{
				_localctx = new SimpleExprFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1143);
				functionCall();
				}
				break;
			case 5:
				{
				_localctx = new SimpleExprLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1144);
				literal();
				}
				break;
			case 6:
				{
				_localctx = new SimpleExprParamMarkerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1145);
				match(PARAM_MARKER);
				}
				break;
			case 7:
				{
				_localctx = new SimpleExprSumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1146);
				sumExpr();
				}
				break;
			case 8:
				{
				_localctx = new SimpleExprGroupingOperationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1147);
				groupingOperation();
				}
				break;
			case 9:
				{
				_localctx = new SimpleExprWindowingFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1148);
				windowFunctionCall();
				}
				break;
			case 10:
				{
				_localctx = new SimpleExprUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1149);
				((SimpleExprUnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_OPERATOR) | (1L << MINUS_OPERATOR) | (1L << BITWISE_NOT_OPERATOR))) != 0)) ) {
					((SimpleExprUnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1150);
				simpleExpr(14);
				}
				break;
			case 11:
				{
				_localctx = new SimpleExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1151);
				not2Rule();
				setState(1152);
				simpleExpr(13);
				}
				break;
			case 12:
				{
				_localctx = new SimpleExprListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW_SYMBOL) {
					{
					setState(1154);
					match(ROW_SYMBOL);
					}
				}

				setState(1157);
				match(OPEN_PAR_SYMBOL);
				setState(1158);
				exprList();
				setState(1159);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case 13:
				{
				_localctx = new SimpleExprSubQueryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS_SYMBOL) {
					{
					setState(1161);
					match(EXISTS_SYMBOL);
					}
				}

				setState(1164);
				subquery();
				}
				break;
			case 14:
				{
				_localctx = new SimpleExprOdbcContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1165);
				match(OPEN_CURLY_SYMBOL);
				setState(1166);
				identifier();
				setState(1167);
				expr(0);
				setState(1168);
				match(CLOSE_CURLY_SYMBOL);
				}
				break;
			case 15:
				{
				_localctx = new SimpleExprMatchContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1170);
				match(MATCH_SYMBOL);
				setState(1171);
				identListArg();
				setState(1172);
				match(AGAINST_SYMBOL);
				setState(1173);
				match(OPEN_PAR_SYMBOL);
				setState(1174);
				bitExpr(0);
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH_SYMBOL || _la==IN_SYMBOL) {
					{
					setState(1175);
					fulltextOptions();
					}
				}

				setState(1178);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case 16:
				{
				_localctx = new SimpleExprBinaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1180);
				match(BINARY_SYMBOL);
				setState(1181);
				simpleExpr(8);
				}
				break;
			case 17:
				{
				_localctx = new SimpleExprCastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1182);
				match(CAST_SYMBOL);
				setState(1183);
				match(OPEN_PAR_SYMBOL);
				setState(1184);
				expr(0);
				setState(1185);
				match(AS_SYMBOL);
				setState(1186);
				castType();
				setState(1188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY_SYMBOL) {
					{
					setState(1187);
					match(ARRAY_SYMBOL);
					}
				}

				setState(1190);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case 18:
				{
				_localctx = new SimpleExprCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1192);
				match(CASE_SYMBOL);
				setState(1194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1193);
					expr(0);
					}
					break;
				}
				setState(1199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1196);
					whenExpression();
					setState(1197);
					thenExpression();
					}
					}
					setState(1201); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN_SYMBOL );
				setState(1204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE_SYMBOL) {
					{
					setState(1203);
					elseExpression();
					}
				}

				setState(1206);
				match(END_SYMBOL);
				}
				break;
			case 19:
				{
				_localctx = new SimpleExprConvertContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1208);
				match(CONVERT_SYMBOL);
				setState(1209);
				match(OPEN_PAR_SYMBOL);
				setState(1210);
				expr(0);
				setState(1211);
				match(COMMA_SYMBOL);
				setState(1212);
				castType();
				setState(1213);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case 20:
				{
				_localctx = new SimpleExprConvertUsingContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1215);
				match(CONVERT_SYMBOL);
				setState(1216);
				match(OPEN_PAR_SYMBOL);
				setState(1217);
				expr(0);
				setState(1218);
				match(USING_SYMBOL);
				setState(1219);
				charsetName();
				setState(1220);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case 21:
				{
				_localctx = new SimpleExprDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1222);
				match(DEFAULT_SYMBOL);
				setState(1223);
				match(OPEN_PAR_SYMBOL);
				setState(1224);
				qualifiedIdentifier();
				setState(1225);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case 22:
				{
				_localctx = new SimpleExprValuesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1227);
				match(VALUES_SYMBOL);
				setState(1228);
				match(OPEN_PAR_SYMBOL);
				setState(1229);
				qualifiedIdentifier();
				setState(1230);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case 23:
				{
				_localctx = new SimpleExprIntervalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1232);
				match(INTERVAL_SYMBOL);
				setState(1233);
				expr(0);
				setState(1234);
				interval();
				setState(1235);
				match(PLUS_OPERATOR);
				setState(1236);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1246);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprConcatContext(new SimpleExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1240);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1241);
						match(LOGICAL_OR_OPERATOR);
						setState(1242);
						simpleExpr(16);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprCollateContext(new SimpleExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(1243);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1244);
						match(COLLATE_SYMBOL);
						setState(1245);
						textOrIdentifier();
						}
						break;
					}
					} 
				}
				setState(1250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JsonOperatorContext extends ParserRuleContext {
		public TerminalNode JSON_SEPARATOR_SYMBOL() { return getToken(SQLSelectParser.JSON_SEPARATOR_SYMBOL, 0); }
		public TextStringLiteralContext textStringLiteral() {
			return getRuleContext(TextStringLiteralContext.class,0);
		}
		public TerminalNode JSON_UNQUOTED_SEPARATOR_SYMBOL() { return getToken(SQLSelectParser.JSON_UNQUOTED_SEPARATOR_SYMBOL, 0); }
		public JsonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonOperator; }
	}

	public final JsonOperatorContext jsonOperator() throws RecognitionException {
		JsonOperatorContext _localctx = new JsonOperatorContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_jsonOperator);
		try {
			setState(1255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JSON_SEPARATOR_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1251);
				match(JSON_SEPARATOR_SYMBOL);
				setState(1252);
				textStringLiteral();
				}
				break;
			case JSON_UNQUOTED_SEPARATOR_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1253);
				match(JSON_UNQUOTED_SEPARATOR_SYMBOL);
				setState(1254);
				textStringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumExprContext extends ParserRuleContext {
		public Token name;
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public InSumExprContext inSumExpr() {
			return getRuleContext(InSumExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public TerminalNode AVG_SYMBOL() { return getToken(SQLSelectParser.AVG_SYMBOL, 0); }
		public TerminalNode DISTINCT_SYMBOL() { return getToken(SQLSelectParser.DISTINCT_SYMBOL, 0); }
		public WindowingClauseContext windowingClause() {
			return getRuleContext(WindowingClauseContext.class,0);
		}
		public TerminalNode BIT_AND_SYMBOL() { return getToken(SQLSelectParser.BIT_AND_SYMBOL, 0); }
		public TerminalNode BIT_OR_SYMBOL() { return getToken(SQLSelectParser.BIT_OR_SYMBOL, 0); }
		public TerminalNode BIT_XOR_SYMBOL() { return getToken(SQLSelectParser.BIT_XOR_SYMBOL, 0); }
		public JsonFunctionContext jsonFunction() {
			return getRuleContext(JsonFunctionContext.class,0);
		}
		public TerminalNode MULT_OPERATOR() { return getToken(SQLSelectParser.MULT_OPERATOR, 0); }
		public TerminalNode COUNT_SYMBOL() { return getToken(SQLSelectParser.COUNT_SYMBOL, 0); }
		public TerminalNode ALL_SYMBOL() { return getToken(SQLSelectParser.ALL_SYMBOL, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode MIN_SYMBOL() { return getToken(SQLSelectParser.MIN_SYMBOL, 0); }
		public TerminalNode MAX_SYMBOL() { return getToken(SQLSelectParser.MAX_SYMBOL, 0); }
		public TerminalNode STD_SYMBOL() { return getToken(SQLSelectParser.STD_SYMBOL, 0); }
		public TerminalNode VARIANCE_SYMBOL() { return getToken(SQLSelectParser.VARIANCE_SYMBOL, 0); }
		public TerminalNode STDDEV_SAMP_SYMBOL() { return getToken(SQLSelectParser.STDDEV_SAMP_SYMBOL, 0); }
		public TerminalNode VAR_SAMP_SYMBOL() { return getToken(SQLSelectParser.VAR_SAMP_SYMBOL, 0); }
		public TerminalNode SUM_SYMBOL() { return getToken(SQLSelectParser.SUM_SYMBOL, 0); }
		public TerminalNode GROUP_CONCAT_SYMBOL() { return getToken(SQLSelectParser.GROUP_CONCAT_SYMBOL, 0); }
		public OrderClauseContext orderClause() {
			return getRuleContext(OrderClauseContext.class,0);
		}
		public TerminalNode SEPARATOR_SYMBOL() { return getToken(SQLSelectParser.SEPARATOR_SYMBOL, 0); }
		public TextStringContext textString() {
			return getRuleContext(TextStringContext.class,0);
		}
		public SumExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumExpr; }
	}

	public final SumExprContext sumExpr() throws RecognitionException {
		SumExprContext _localctx = new SumExprContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_sumExpr);
		int _la;
		try {
			setState(1375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1257);
				((SumExprContext)_localctx).name = match(AVG_SYMBOL);
				setState(1258);
				match(OPEN_PAR_SYMBOL);
				setState(1260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1259);
					match(DISTINCT_SYMBOL);
					}
					break;
				}
				setState(1262);
				inSumExpr();
				setState(1263);
				match(CLOSE_PAR_SYMBOL);
				setState(1265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1264);
					windowingClause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1267);
				((SumExprContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (BIT_AND_SYMBOL - 174)) | (1L << (BIT_OR_SYMBOL - 174)) | (1L << (BIT_XOR_SYMBOL - 174)))) != 0)) ) {
					((SumExprContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1268);
				match(OPEN_PAR_SYMBOL);
				setState(1269);
				inSumExpr();
				setState(1270);
				match(CLOSE_PAR_SYMBOL);
				setState(1272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
				case 1:
					{
					setState(1271);
					windowingClause();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1274);
				jsonFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1275);
				((SumExprContext)_localctx).name = match(COUNT_SYMBOL);
				setState(1276);
				match(OPEN_PAR_SYMBOL);
				setState(1278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL_SYMBOL) {
					{
					setState(1277);
					match(ALL_SYMBOL);
					}
				}

				setState(1280);
				match(MULT_OPERATOR);
				setState(1281);
				match(CLOSE_PAR_SYMBOL);
				setState(1283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1282);
					windowingClause();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1285);
				((SumExprContext)_localctx).name = match(COUNT_SYMBOL);
				setState(1286);
				match(OPEN_PAR_SYMBOL);
				setState(1294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1288);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALL_SYMBOL) {
						{
						setState(1287);
						match(ALL_SYMBOL);
						}
					}

					setState(1290);
					match(MULT_OPERATOR);
					}
					break;
				case 2:
					{
					setState(1291);
					inSumExpr();
					}
					break;
				case 3:
					{
					setState(1292);
					match(DISTINCT_SYMBOL);
					setState(1293);
					exprList();
					}
					break;
				}
				setState(1296);
				match(CLOSE_PAR_SYMBOL);
				setState(1298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1297);
					windowingClause();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1300);
				((SumExprContext)_localctx).name = match(MIN_SYMBOL);
				setState(1301);
				match(OPEN_PAR_SYMBOL);
				setState(1303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(1302);
					match(DISTINCT_SYMBOL);
					}
					break;
				}
				setState(1305);
				inSumExpr();
				setState(1306);
				match(CLOSE_PAR_SYMBOL);
				setState(1308);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1307);
					windowingClause();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1310);
				((SumExprContext)_localctx).name = match(MAX_SYMBOL);
				setState(1311);
				match(OPEN_PAR_SYMBOL);
				setState(1313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1312);
					match(DISTINCT_SYMBOL);
					}
					break;
				}
				setState(1315);
				inSumExpr();
				setState(1316);
				match(CLOSE_PAR_SYMBOL);
				setState(1318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1317);
					windowingClause();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1320);
				((SumExprContext)_localctx).name = match(STD_SYMBOL);
				setState(1321);
				match(OPEN_PAR_SYMBOL);
				setState(1322);
				inSumExpr();
				setState(1323);
				match(CLOSE_PAR_SYMBOL);
				setState(1325);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1324);
					windowingClause();
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1327);
				((SumExprContext)_localctx).name = match(VARIANCE_SYMBOL);
				setState(1328);
				match(OPEN_PAR_SYMBOL);
				setState(1329);
				inSumExpr();
				setState(1330);
				match(CLOSE_PAR_SYMBOL);
				setState(1332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1331);
					windowingClause();
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1334);
				((SumExprContext)_localctx).name = match(STDDEV_SAMP_SYMBOL);
				setState(1335);
				match(OPEN_PAR_SYMBOL);
				setState(1336);
				inSumExpr();
				setState(1337);
				match(CLOSE_PAR_SYMBOL);
				setState(1339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1338);
					windowingClause();
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1341);
				((SumExprContext)_localctx).name = match(VAR_SAMP_SYMBOL);
				setState(1342);
				match(OPEN_PAR_SYMBOL);
				setState(1343);
				inSumExpr();
				setState(1344);
				match(CLOSE_PAR_SYMBOL);
				setState(1346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1345);
					windowingClause();
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1348);
				((SumExprContext)_localctx).name = match(SUM_SYMBOL);
				setState(1349);
				match(OPEN_PAR_SYMBOL);
				setState(1351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1350);
					match(DISTINCT_SYMBOL);
					}
					break;
				}
				setState(1353);
				inSumExpr();
				setState(1354);
				match(CLOSE_PAR_SYMBOL);
				setState(1356);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1355);
					windowingClause();
					}
					break;
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1358);
				((SumExprContext)_localctx).name = match(GROUP_CONCAT_SYMBOL);
				setState(1359);
				match(OPEN_PAR_SYMBOL);
				setState(1361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1360);
					match(DISTINCT_SYMBOL);
					}
					break;
				}
				setState(1363);
				exprList();
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER_SYMBOL) {
					{
					setState(1364);
					orderClause();
					}
				}

				setState(1369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARATOR_SYMBOL) {
					{
					setState(1367);
					match(SEPARATOR_SYMBOL);
					setState(1368);
					textString();
					}
				}

				setState(1371);
				match(CLOSE_PAR_SYMBOL);
				setState(1373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1372);
					windowingClause();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingOperationContext extends ParserRuleContext {
		public TerminalNode GROUPING_SYMBOL() { return getToken(SQLSelectParser.GROUPING_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public GroupingOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingOperation; }
	}

	public final GroupingOperationContext groupingOperation() throws RecognitionException {
		GroupingOperationContext _localctx = new GroupingOperationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_groupingOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			match(GROUPING_SYMBOL);
			setState(1378);
			match(OPEN_PAR_SYMBOL);
			setState(1379);
			exprList();
			setState(1380);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFunctionCallContext extends ParserRuleContext {
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public WindowingClauseContext windowingClause() {
			return getRuleContext(WindowingClauseContext.class,0);
		}
		public TerminalNode ROW_NUMBER_SYMBOL() { return getToken(SQLSelectParser.ROW_NUMBER_SYMBOL, 0); }
		public TerminalNode RANK_SYMBOL() { return getToken(SQLSelectParser.RANK_SYMBOL, 0); }
		public TerminalNode DENSE_RANK_SYMBOL() { return getToken(SQLSelectParser.DENSE_RANK_SYMBOL, 0); }
		public TerminalNode CUME_DIST_SYMBOL() { return getToken(SQLSelectParser.CUME_DIST_SYMBOL, 0); }
		public TerminalNode PERCENT_RANK_SYMBOL() { return getToken(SQLSelectParser.PERCENT_RANK_SYMBOL, 0); }
		public TerminalNode NTILE_SYMBOL() { return getToken(SQLSelectParser.NTILE_SYMBOL, 0); }
		public SimpleExprWithParenthesesContext simpleExprWithParentheses() {
			return getRuleContext(SimpleExprWithParenthesesContext.class,0);
		}
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public TerminalNode LEAD_SYMBOL() { return getToken(SQLSelectParser.LEAD_SYMBOL, 0); }
		public TerminalNode LAG_SYMBOL() { return getToken(SQLSelectParser.LAG_SYMBOL, 0); }
		public LeadLagInfoContext leadLagInfo() {
			return getRuleContext(LeadLagInfoContext.class,0);
		}
		public NullTreatmentContext nullTreatment() {
			return getRuleContext(NullTreatmentContext.class,0);
		}
		public ExprWithParenthesesContext exprWithParentheses() {
			return getRuleContext(ExprWithParenthesesContext.class,0);
		}
		public TerminalNode FIRST_VALUE_SYMBOL() { return getToken(SQLSelectParser.FIRST_VALUE_SYMBOL, 0); }
		public TerminalNode LAST_VALUE_SYMBOL() { return getToken(SQLSelectParser.LAST_VALUE_SYMBOL, 0); }
		public TerminalNode NTH_VALUE_SYMBOL() { return getToken(SQLSelectParser.NTH_VALUE_SYMBOL, 0); }
		public TerminalNode COMMA_SYMBOL() { return getToken(SQLSelectParser.COMMA_SYMBOL, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode FROM_SYMBOL() { return getToken(SQLSelectParser.FROM_SYMBOL, 0); }
		public TerminalNode FIRST_SYMBOL() { return getToken(SQLSelectParser.FIRST_SYMBOL, 0); }
		public TerminalNode LAST_SYMBOL() { return getToken(SQLSelectParser.LAST_SYMBOL, 0); }
		public WindowFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunctionCall; }
	}

	public final WindowFunctionCallContext windowFunctionCall() throws RecognitionException {
		WindowFunctionCallContext _localctx = new WindowFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_windowFunctionCall);
		int _la;
		try {
			setState(1424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROW_NUMBER_SYMBOL:
			case RANK_SYMBOL:
			case DENSE_RANK_SYMBOL:
			case CUME_DIST_SYMBOL:
			case PERCENT_RANK_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1382);
				_la = _input.LA(1);
				if ( !(((((_la - 188)) & ~0x3f) == 0 && ((1L << (_la - 188)) & ((1L << (ROW_NUMBER_SYMBOL - 188)) | (1L << (RANK_SYMBOL - 188)) | (1L << (DENSE_RANK_SYMBOL - 188)) | (1L << (CUME_DIST_SYMBOL - 188)) | (1L << (PERCENT_RANK_SYMBOL - 188)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1383);
				parentheses();
				setState(1384);
				windowingClause();
				}
				break;
			case NTILE_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1386);
				match(NTILE_SYMBOL);
				setState(1387);
				simpleExprWithParentheses();
				setState(1388);
				windowingClause();
				}
				break;
			case LEAD_SYMBOL:
			case LAG_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1390);
				_la = _input.LA(1);
				if ( !(_la==LEAD_SYMBOL || _la==LAG_SYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1391);
				match(OPEN_PAR_SYMBOL);
				setState(1392);
				expr(0);
				setState(1394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_SYMBOL) {
					{
					setState(1393);
					leadLagInfo();
					}
				}

				setState(1396);
				match(CLOSE_PAR_SYMBOL);
				setState(1398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE_SYMBOL || _la==RESPECT_SYMBOL) {
					{
					setState(1397);
					nullTreatment();
					}
				}

				setState(1400);
				windowingClause();
				}
				break;
			case FIRST_VALUE_SYMBOL:
			case LAST_VALUE_SYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1402);
				_la = _input.LA(1);
				if ( !(_la==FIRST_VALUE_SYMBOL || _la==LAST_VALUE_SYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1403);
				exprWithParentheses();
				setState(1405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE_SYMBOL || _la==RESPECT_SYMBOL) {
					{
					setState(1404);
					nullTreatment();
					}
				}

				setState(1407);
				windowingClause();
				}
				break;
			case NTH_VALUE_SYMBOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1409);
				match(NTH_VALUE_SYMBOL);
				setState(1410);
				match(OPEN_PAR_SYMBOL);
				setState(1411);
				expr(0);
				setState(1412);
				match(COMMA_SYMBOL);
				setState(1413);
				simpleExpr(0);
				setState(1414);
				match(CLOSE_PAR_SYMBOL);
				setState(1417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM_SYMBOL) {
					{
					setState(1415);
					match(FROM_SYMBOL);
					setState(1416);
					_la = _input.LA(1);
					if ( !(_la==FIRST_SYMBOL || _la==LAST_SYMBOL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE_SYMBOL || _la==RESPECT_SYMBOL) {
					{
					setState(1419);
					nullTreatment();
					}
				}

				setState(1422);
				windowingClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowingClauseContext extends ParserRuleContext {
		public TerminalNode OVER_SYMBOL() { return getToken(SQLSelectParser.OVER_SYMBOL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public WindowingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowingClause; }
	}

	public final WindowingClauseContext windowingClause() throws RecognitionException {
		WindowingClauseContext _localctx = new WindowingClauseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_windowingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			match(OVER_SYMBOL);
			setState(1429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TINYINT_SYMBOL:
			case SMALLINT_SYMBOL:
			case MEDIUMINT_SYMBOL:
			case INT_SYMBOL:
			case BIGINT_SYMBOL:
			case SECOND_SYMBOL:
			case MINUTE_SYMBOL:
			case HOUR_SYMBOL:
			case DAY_SYMBOL:
			case WEEK_SYMBOL:
			case MONTH_SYMBOL:
			case QUARTER_SYMBOL:
			case YEAR_SYMBOL:
			case DEFAULT_SYMBOL:
			case UNION_SYMBOL:
			case SELECT_SYMBOL:
			case ALL_SYMBOL:
			case DISTINCT_SYMBOL:
			case STRAIGHT_JOIN_SYMBOL:
			case HIGH_PRIORITY_SYMBOL:
			case SQL_SMALL_RESULT_SYMBOL:
			case SQL_BIG_RESULT_SYMBOL:
			case SQL_BUFFER_RESULT_SYMBOL:
			case SQL_CALC_FOUND_ROWS_SYMBOL:
			case LIMIT_SYMBOL:
			case OFFSET_SYMBOL:
			case INTO_SYMBOL:
			case OUTFILE_SYMBOL:
			case DUMPFILE_SYMBOL:
			case PROCEDURE_SYMBOL:
			case ANALYSE_SYMBOL:
			case HAVING_SYMBOL:
			case WINDOW_SYMBOL:
			case AS_SYMBOL:
			case PARTITION_SYMBOL:
			case BY_SYMBOL:
			case ROWS_SYMBOL:
			case RANGE_SYMBOL:
			case GROUPS_SYMBOL:
			case UNBOUNDED_SYMBOL:
			case PRECEDING_SYMBOL:
			case INTERVAL_SYMBOL:
			case CURRENT_SYMBOL:
			case ROW_SYMBOL:
			case BETWEEN_SYMBOL:
			case AND_SYMBOL:
			case FOLLOWING_SYMBOL:
			case EXCLUDE_SYMBOL:
			case GROUP_SYMBOL:
			case TIES_SYMBOL:
			case NO_SYMBOL:
			case OTHERS_SYMBOL:
			case WITH_SYMBOL:
			case RECURSIVE_SYMBOL:
			case ROLLUP_SYMBOL:
			case CUBE_SYMBOL:
			case ORDER_SYMBOL:
			case ASC_SYMBOL:
			case DESC_SYMBOL:
			case FROM_SYMBOL:
			case DUAL_SYMBOL:
			case VALUES_SYMBOL:
			case TABLE_SYMBOL:
			case SQL_NO_CACHE_SYMBOL:
			case SQL_CACHE_SYMBOL:
			case MAX_STATEMENT_TIME_SYMBOL:
			case FOR_SYMBOL:
			case OF_SYMBOL:
			case LOCK_SYMBOL:
			case IN_SYMBOL:
			case SHARE_SYMBOL:
			case MODE_SYMBOL:
			case UPDATE_SYMBOL:
			case SKIP_SYMBOL:
			case LOCKED_SYMBOL:
			case NOWAIT_SYMBOL:
			case WHERE_SYMBOL:
			case OJ_SYMBOL:
			case ON_SYMBOL:
			case USING_SYMBOL:
			case NATURAL_SYMBOL:
			case INNER_SYMBOL:
			case JOIN_SYMBOL:
			case LEFT_SYMBOL:
			case RIGHT_SYMBOL:
			case OUTER_SYMBOL:
			case CROSS_SYMBOL:
			case LATERAL_SYMBOL:
			case JSON_TABLE_SYMBOL:
			case COLUMNS_SYMBOL:
			case ORDINALITY_SYMBOL:
			case EXISTS_SYMBOL:
			case PATH_SYMBOL:
			case NESTED_SYMBOL:
			case EMPTY_SYMBOL:
			case ERROR_SYMBOL:
			case NULL_SYMBOL:
			case USE_SYMBOL:
			case FORCE_SYMBOL:
			case IGNORE_SYMBOL:
			case KEY_SYMBOL:
			case INDEX_SYMBOL:
			case PRIMARY_SYMBOL:
			case IS_SYMBOL:
			case TRUE_SYMBOL:
			case FALSE_SYMBOL:
			case UNKNOWN_SYMBOL:
			case NOT_SYMBOL:
			case XOR_SYMBOL:
			case OR_SYMBOL:
			case ANY_SYMBOL:
			case MEMBER_SYMBOL:
			case SOUNDS_SYMBOL:
			case LIKE_SYMBOL:
			case ESCAPE_SYMBOL:
			case REGEXP_SYMBOL:
			case DIV_SYMBOL:
			case MOD_SYMBOL:
			case MATCH_SYMBOL:
			case AGAINST_SYMBOL:
			case BINARY_SYMBOL:
			case CAST_SYMBOL:
			case ARRAY_SYMBOL:
			case CASE_SYMBOL:
			case END_SYMBOL:
			case CONVERT_SYMBOL:
			case COLLATE_SYMBOL:
			case AVG_SYMBOL:
			case BIT_AND_SYMBOL:
			case BIT_OR_SYMBOL:
			case BIT_XOR_SYMBOL:
			case COUNT_SYMBOL:
			case MIN_SYMBOL:
			case MAX_SYMBOL:
			case STD_SYMBOL:
			case VARIANCE_SYMBOL:
			case STDDEV_SAMP_SYMBOL:
			case VAR_SAMP_SYMBOL:
			case SUM_SYMBOL:
			case GROUP_CONCAT_SYMBOL:
			case SEPARATOR_SYMBOL:
			case GROUPING_SYMBOL:
			case ROW_NUMBER_SYMBOL:
			case RANK_SYMBOL:
			case DENSE_RANK_SYMBOL:
			case CUME_DIST_SYMBOL:
			case PERCENT_RANK_SYMBOL:
			case NTILE_SYMBOL:
			case LEAD_SYMBOL:
			case LAG_SYMBOL:
			case FIRST_VALUE_SYMBOL:
			case LAST_VALUE_SYMBOL:
			case NTH_VALUE_SYMBOL:
			case FIRST_SYMBOL:
			case LAST_SYMBOL:
			case OVER_SYMBOL:
			case RESPECT_SYMBOL:
			case NULLS_SYMBOL:
			case JSON_ARRAYAGG_SYMBOL:
			case JSON_OBJECTAGG_SYMBOL:
			case BOOLEAN_SYMBOL:
			case LANGUAGE_SYMBOL:
			case QUERY_SYMBOL:
			case EXPANSION_SYMBOL:
			case CHAR_SYMBOL:
			case CURRENT_USER_SYMBOL:
			case DATE_SYMBOL:
			case INSERT_SYMBOL:
			case TIME_SYMBOL:
			case TIMESTAMP_SYMBOL:
			case USER_SYMBOL:
			case ADDDATE_SYMBOL:
			case SUBDATE_SYMBOL:
			case CURDATE_SYMBOL:
			case CURTIME_SYMBOL:
			case DATE_ADD_SYMBOL:
			case DATE_SUB_SYMBOL:
			case EXTRACT_SYMBOL:
			case GET_FORMAT_SYMBOL:
			case NOW_SYMBOL:
			case POSITION_SYMBOL:
			case SYSDATE_SYMBOL:
			case TIMESTAMP_ADD_SYMBOL:
			case TIMESTAMP_DIFF_SYMBOL:
			case UTC_DATE_SYMBOL:
			case UTC_TIME_SYMBOL:
			case UTC_TIMESTAMP_SYMBOL:
			case ASCII_SYMBOL:
			case CHARSET_SYMBOL:
			case COALESCE_SYMBOL:
			case COLLATION_SYMBOL:
			case DATABASE_SYMBOL:
			case IF_SYMBOL:
			case FORMAT_SYMBOL:
			case MICROSECOND_SYMBOL:
			case OLD_PASSWORD_SYMBOL:
			case PASSWORD_SYMBOL:
			case REPEAT_SYMBOL:
			case REPLACE_SYMBOL:
			case REVERSE_SYMBOL:
			case ROW_COUNT_SYMBOL:
			case TRUNCATE_SYMBOL:
			case WEIGHT_STRING_SYMBOL:
			case CONTAINS_SYMBOL:
			case GEOMETRYCOLLECTION_SYMBOL:
			case LINESTRING_SYMBOL:
			case MULTILINESTRING_SYMBOL:
			case MULTIPOINT_SYMBOL:
			case MULTIPOLYGON_SYMBOL:
			case POINT_SYMBOL:
			case POLYGON_SYMBOL:
			case LEVEL_SYMBOL:
			case DATETIME_SYMBOL:
			case TRIM_SYMBOL:
			case LEADING_SYMBOL:
			case TRAILING_SYMBOL:
			case BOTH_SYMBOL:
			case SUBSTRING_SYMBOL:
			case WHEN_SYMBOL:
			case THEN_SYMBOL:
			case ELSE_SYMBOL:
			case SIGNED_SYMBOL:
			case UNSIGNED_SYMBOL:
			case DECIMAL_SYMBOL:
			case JSON_SYMBOL:
			case FLOAT_SYMBOL:
			case SET_SYMBOL:
			case SECOND_MICROSECOND_SYMBOL:
			case MINUTE_MICROSECOND_SYMBOL:
			case MINUTE_SECOND_SYMBOL:
			case HOUR_MICROSECOND_SYMBOL:
			case HOUR_SECOND_SYMBOL:
			case HOUR_MINUTE_SYMBOL:
			case DAY_MICROSECOND_SYMBOL:
			case DAY_SECOND_SYMBOL:
			case DAY_MINUTE_SYMBOL:
			case DAY_HOUR_SYMBOL:
			case YEAR_MONTH_SYMBOL:
			case BTREE_SYMBOL:
			case RTREE_SYMBOL:
			case HASH_SYMBOL:
			case REAL_SYMBOL:
			case DOUBLE_SYMBOL:
			case PRECISION_SYMBOL:
			case NUMERIC_SYMBOL:
			case FIXED_SYMBOL:
			case BIT_SYMBOL:
			case BOOL_SYMBOL:
			case VARYING_SYMBOL:
			case VARCHAR_SYMBOL:
			case NATIONAL_SYMBOL:
			case NVARCHAR_SYMBOL:
			case NCHAR_SYMBOL:
			case VARBINARY_SYMBOL:
			case TINYBLOB_SYMBOL:
			case BLOB_SYMBOL:
			case MEDIUMBLOB_SYMBOL:
			case LONGBLOB_SYMBOL:
			case LONG_SYMBOL:
			case TINYTEXT_SYMBOL:
			case TEXT_SYMBOL:
			case MEDIUMTEXT_SYMBOL:
			case LONGTEXT_SYMBOL:
			case ENUM_SYMBOL:
			case SERIAL_SYMBOL:
			case GEOMETRY_SYMBOL:
			case ZEROFILL_SYMBOL:
			case BYTE_SYMBOL:
			case UNICODE_SYMBOL:
			case TERMINATED_SYMBOL:
			case OPTIONALLY_SYMBOL:
			case ENCLOSED_SYMBOL:
			case ESCAPED_SYMBOL:
			case LINES_SYMBOL:
			case STARTING_SYMBOL:
			case GLOBAL_SYMBOL:
			case LOCAL_SYMBOL:
			case SESSION_SYMBOL:
			case IDENTIFIER:
			case BACK_TICK_QUOTED_ID:
			case DOUBLE_QUOTED_TEXT:
			case SINGLE_QUOTED_TEXT:
			case BRACKET_QUOTED_TEXT:
				{
				setState(1427);
				identifier();
				}
				break;
			case OPEN_PAR_SYMBOL:
				{
				setState(1428);
				windowSpec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeadLagInfoContext extends ParserRuleContext {
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public Ulonglong_numberContext ulonglong_number() {
			return getRuleContext(Ulonglong_numberContext.class,0);
		}
		public TerminalNode PARAM_MARKER() { return getToken(SQLSelectParser.PARAM_MARKER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LeadLagInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leadLagInfo; }
	}

	public final LeadLagInfoContext leadLagInfo() throws RecognitionException {
		LeadLagInfoContext _localctx = new LeadLagInfoContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_leadLagInfo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			match(COMMA_SYMBOL);
			setState(1434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_NUMBER:
			case DECIMAL_NUMBER:
			case FLOAT_NUMBER:
				{
				setState(1432);
				ulonglong_number();
				}
				break;
			case PARAM_MARKER:
				{
				setState(1433);
				match(PARAM_MARKER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_SYMBOL) {
				{
				setState(1436);
				match(COMMA_SYMBOL);
				setState(1437);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullTreatmentContext extends ParserRuleContext {
		public TerminalNode NULLS_SYMBOL() { return getToken(SQLSelectParser.NULLS_SYMBOL, 0); }
		public TerminalNode RESPECT_SYMBOL() { return getToken(SQLSelectParser.RESPECT_SYMBOL, 0); }
		public TerminalNode IGNORE_SYMBOL() { return getToken(SQLSelectParser.IGNORE_SYMBOL, 0); }
		public NullTreatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullTreatment; }
	}

	public final NullTreatmentContext nullTreatment() throws RecognitionException {
		NullTreatmentContext _localctx = new NullTreatmentContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_nullTreatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1440);
			_la = _input.LA(1);
			if ( !(_la==IGNORE_SYMBOL || _la==RESPECT_SYMBOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1441);
			match(NULLS_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsonFunctionContext extends ParserRuleContext {
		public TerminalNode JSON_ARRAYAGG_SYMBOL() { return getToken(SQLSelectParser.JSON_ARRAYAGG_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public List<InSumExprContext> inSumExpr() {
			return getRuleContexts(InSumExprContext.class);
		}
		public InSumExprContext inSumExpr(int i) {
			return getRuleContext(InSumExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public WindowingClauseContext windowingClause() {
			return getRuleContext(WindowingClauseContext.class,0);
		}
		public TerminalNode JSON_OBJECTAGG_SYMBOL() { return getToken(SQLSelectParser.JSON_OBJECTAGG_SYMBOL, 0); }
		public TerminalNode COMMA_SYMBOL() { return getToken(SQLSelectParser.COMMA_SYMBOL, 0); }
		public JsonFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonFunction; }
	}

	public final JsonFunctionContext jsonFunction() throws RecognitionException {
		JsonFunctionContext _localctx = new JsonFunctionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_jsonFunction);
		try {
			setState(1459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JSON_ARRAYAGG_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1443);
				match(JSON_ARRAYAGG_SYMBOL);
				setState(1444);
				match(OPEN_PAR_SYMBOL);
				setState(1445);
				inSumExpr();
				setState(1446);
				match(CLOSE_PAR_SYMBOL);
				setState(1448);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1447);
					windowingClause();
					}
					break;
				}
				}
				break;
			case JSON_OBJECTAGG_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1450);
				match(JSON_OBJECTAGG_SYMBOL);
				setState(1451);
				match(OPEN_PAR_SYMBOL);
				setState(1452);
				inSumExpr();
				setState(1453);
				match(COMMA_SYMBOL);
				setState(1454);
				inSumExpr();
				setState(1455);
				match(CLOSE_PAR_SYMBOL);
				setState(1457);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1456);
					windowingClause();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InSumExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ALL_SYMBOL() { return getToken(SQLSelectParser.ALL_SYMBOL, 0); }
		public InSumExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inSumExpr; }
	}

	public final InSumExprContext inSumExpr() throws RecognitionException {
		InSumExprContext _localctx = new InSumExprContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_inSumExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1461);
				match(ALL_SYMBOL);
				}
				break;
			}
			setState(1464);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentListArgContext extends ParserRuleContext {
		public IdentListContext identList() {
			return getRuleContext(IdentListContext.class,0);
		}
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public IdentListArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identListArg; }
	}

	public final IdentListArgContext identListArg() throws RecognitionException {
		IdentListArgContext _localctx = new IdentListArgContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_identListArg);
		try {
			setState(1471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TINYINT_SYMBOL:
			case SMALLINT_SYMBOL:
			case MEDIUMINT_SYMBOL:
			case INT_SYMBOL:
			case BIGINT_SYMBOL:
			case SECOND_SYMBOL:
			case MINUTE_SYMBOL:
			case HOUR_SYMBOL:
			case DAY_SYMBOL:
			case WEEK_SYMBOL:
			case MONTH_SYMBOL:
			case QUARTER_SYMBOL:
			case YEAR_SYMBOL:
			case DEFAULT_SYMBOL:
			case UNION_SYMBOL:
			case SELECT_SYMBOL:
			case ALL_SYMBOL:
			case DISTINCT_SYMBOL:
			case STRAIGHT_JOIN_SYMBOL:
			case HIGH_PRIORITY_SYMBOL:
			case SQL_SMALL_RESULT_SYMBOL:
			case SQL_BIG_RESULT_SYMBOL:
			case SQL_BUFFER_RESULT_SYMBOL:
			case SQL_CALC_FOUND_ROWS_SYMBOL:
			case LIMIT_SYMBOL:
			case OFFSET_SYMBOL:
			case INTO_SYMBOL:
			case OUTFILE_SYMBOL:
			case DUMPFILE_SYMBOL:
			case PROCEDURE_SYMBOL:
			case ANALYSE_SYMBOL:
			case HAVING_SYMBOL:
			case WINDOW_SYMBOL:
			case AS_SYMBOL:
			case PARTITION_SYMBOL:
			case BY_SYMBOL:
			case ROWS_SYMBOL:
			case RANGE_SYMBOL:
			case GROUPS_SYMBOL:
			case UNBOUNDED_SYMBOL:
			case PRECEDING_SYMBOL:
			case INTERVAL_SYMBOL:
			case CURRENT_SYMBOL:
			case ROW_SYMBOL:
			case BETWEEN_SYMBOL:
			case AND_SYMBOL:
			case FOLLOWING_SYMBOL:
			case EXCLUDE_SYMBOL:
			case GROUP_SYMBOL:
			case TIES_SYMBOL:
			case NO_SYMBOL:
			case OTHERS_SYMBOL:
			case WITH_SYMBOL:
			case RECURSIVE_SYMBOL:
			case ROLLUP_SYMBOL:
			case CUBE_SYMBOL:
			case ORDER_SYMBOL:
			case ASC_SYMBOL:
			case DESC_SYMBOL:
			case FROM_SYMBOL:
			case DUAL_SYMBOL:
			case VALUES_SYMBOL:
			case TABLE_SYMBOL:
			case SQL_NO_CACHE_SYMBOL:
			case SQL_CACHE_SYMBOL:
			case MAX_STATEMENT_TIME_SYMBOL:
			case FOR_SYMBOL:
			case OF_SYMBOL:
			case LOCK_SYMBOL:
			case IN_SYMBOL:
			case SHARE_SYMBOL:
			case MODE_SYMBOL:
			case UPDATE_SYMBOL:
			case SKIP_SYMBOL:
			case LOCKED_SYMBOL:
			case NOWAIT_SYMBOL:
			case WHERE_SYMBOL:
			case OJ_SYMBOL:
			case ON_SYMBOL:
			case USING_SYMBOL:
			case NATURAL_SYMBOL:
			case INNER_SYMBOL:
			case JOIN_SYMBOL:
			case LEFT_SYMBOL:
			case RIGHT_SYMBOL:
			case OUTER_SYMBOL:
			case CROSS_SYMBOL:
			case LATERAL_SYMBOL:
			case JSON_TABLE_SYMBOL:
			case COLUMNS_SYMBOL:
			case ORDINALITY_SYMBOL:
			case EXISTS_SYMBOL:
			case PATH_SYMBOL:
			case NESTED_SYMBOL:
			case EMPTY_SYMBOL:
			case ERROR_SYMBOL:
			case NULL_SYMBOL:
			case USE_SYMBOL:
			case FORCE_SYMBOL:
			case IGNORE_SYMBOL:
			case KEY_SYMBOL:
			case INDEX_SYMBOL:
			case PRIMARY_SYMBOL:
			case IS_SYMBOL:
			case TRUE_SYMBOL:
			case FALSE_SYMBOL:
			case UNKNOWN_SYMBOL:
			case NOT_SYMBOL:
			case XOR_SYMBOL:
			case OR_SYMBOL:
			case ANY_SYMBOL:
			case MEMBER_SYMBOL:
			case SOUNDS_SYMBOL:
			case LIKE_SYMBOL:
			case ESCAPE_SYMBOL:
			case REGEXP_SYMBOL:
			case DIV_SYMBOL:
			case MOD_SYMBOL:
			case MATCH_SYMBOL:
			case AGAINST_SYMBOL:
			case BINARY_SYMBOL:
			case CAST_SYMBOL:
			case ARRAY_SYMBOL:
			case CASE_SYMBOL:
			case END_SYMBOL:
			case CONVERT_SYMBOL:
			case COLLATE_SYMBOL:
			case AVG_SYMBOL:
			case BIT_AND_SYMBOL:
			case BIT_OR_SYMBOL:
			case BIT_XOR_SYMBOL:
			case COUNT_SYMBOL:
			case MIN_SYMBOL:
			case MAX_SYMBOL:
			case STD_SYMBOL:
			case VARIANCE_SYMBOL:
			case STDDEV_SAMP_SYMBOL:
			case VAR_SAMP_SYMBOL:
			case SUM_SYMBOL:
			case GROUP_CONCAT_SYMBOL:
			case SEPARATOR_SYMBOL:
			case GROUPING_SYMBOL:
			case ROW_NUMBER_SYMBOL:
			case RANK_SYMBOL:
			case DENSE_RANK_SYMBOL:
			case CUME_DIST_SYMBOL:
			case PERCENT_RANK_SYMBOL:
			case NTILE_SYMBOL:
			case LEAD_SYMBOL:
			case LAG_SYMBOL:
			case FIRST_VALUE_SYMBOL:
			case LAST_VALUE_SYMBOL:
			case NTH_VALUE_SYMBOL:
			case FIRST_SYMBOL:
			case LAST_SYMBOL:
			case OVER_SYMBOL:
			case RESPECT_SYMBOL:
			case NULLS_SYMBOL:
			case JSON_ARRAYAGG_SYMBOL:
			case JSON_OBJECTAGG_SYMBOL:
			case BOOLEAN_SYMBOL:
			case LANGUAGE_SYMBOL:
			case QUERY_SYMBOL:
			case EXPANSION_SYMBOL:
			case CHAR_SYMBOL:
			case CURRENT_USER_SYMBOL:
			case DATE_SYMBOL:
			case INSERT_SYMBOL:
			case TIME_SYMBOL:
			case TIMESTAMP_SYMBOL:
			case USER_SYMBOL:
			case ADDDATE_SYMBOL:
			case SUBDATE_SYMBOL:
			case CURDATE_SYMBOL:
			case CURTIME_SYMBOL:
			case DATE_ADD_SYMBOL:
			case DATE_SUB_SYMBOL:
			case EXTRACT_SYMBOL:
			case GET_FORMAT_SYMBOL:
			case NOW_SYMBOL:
			case POSITION_SYMBOL:
			case SYSDATE_SYMBOL:
			case TIMESTAMP_ADD_SYMBOL:
			case TIMESTAMP_DIFF_SYMBOL:
			case UTC_DATE_SYMBOL:
			case UTC_TIME_SYMBOL:
			case UTC_TIMESTAMP_SYMBOL:
			case ASCII_SYMBOL:
			case CHARSET_SYMBOL:
			case COALESCE_SYMBOL:
			case COLLATION_SYMBOL:
			case DATABASE_SYMBOL:
			case IF_SYMBOL:
			case FORMAT_SYMBOL:
			case MICROSECOND_SYMBOL:
			case OLD_PASSWORD_SYMBOL:
			case PASSWORD_SYMBOL:
			case REPEAT_SYMBOL:
			case REPLACE_SYMBOL:
			case REVERSE_SYMBOL:
			case ROW_COUNT_SYMBOL:
			case TRUNCATE_SYMBOL:
			case WEIGHT_STRING_SYMBOL:
			case CONTAINS_SYMBOL:
			case GEOMETRYCOLLECTION_SYMBOL:
			case LINESTRING_SYMBOL:
			case MULTILINESTRING_SYMBOL:
			case MULTIPOINT_SYMBOL:
			case MULTIPOLYGON_SYMBOL:
			case POINT_SYMBOL:
			case POLYGON_SYMBOL:
			case LEVEL_SYMBOL:
			case DATETIME_SYMBOL:
			case TRIM_SYMBOL:
			case LEADING_SYMBOL:
			case TRAILING_SYMBOL:
			case BOTH_SYMBOL:
			case SUBSTRING_SYMBOL:
			case WHEN_SYMBOL:
			case THEN_SYMBOL:
			case ELSE_SYMBOL:
			case SIGNED_SYMBOL:
			case UNSIGNED_SYMBOL:
			case DECIMAL_SYMBOL:
			case JSON_SYMBOL:
			case FLOAT_SYMBOL:
			case SET_SYMBOL:
			case SECOND_MICROSECOND_SYMBOL:
			case MINUTE_MICROSECOND_SYMBOL:
			case MINUTE_SECOND_SYMBOL:
			case HOUR_MICROSECOND_SYMBOL:
			case HOUR_SECOND_SYMBOL:
			case HOUR_MINUTE_SYMBOL:
			case DAY_MICROSECOND_SYMBOL:
			case DAY_SECOND_SYMBOL:
			case DAY_MINUTE_SYMBOL:
			case DAY_HOUR_SYMBOL:
			case YEAR_MONTH_SYMBOL:
			case BTREE_SYMBOL:
			case RTREE_SYMBOL:
			case HASH_SYMBOL:
			case REAL_SYMBOL:
			case DOUBLE_SYMBOL:
			case PRECISION_SYMBOL:
			case NUMERIC_SYMBOL:
			case FIXED_SYMBOL:
			case BIT_SYMBOL:
			case BOOL_SYMBOL:
			case VARYING_SYMBOL:
			case VARCHAR_SYMBOL:
			case NATIONAL_SYMBOL:
			case NVARCHAR_SYMBOL:
			case NCHAR_SYMBOL:
			case VARBINARY_SYMBOL:
			case TINYBLOB_SYMBOL:
			case BLOB_SYMBOL:
			case MEDIUMBLOB_SYMBOL:
			case LONGBLOB_SYMBOL:
			case LONG_SYMBOL:
			case TINYTEXT_SYMBOL:
			case TEXT_SYMBOL:
			case MEDIUMTEXT_SYMBOL:
			case LONGTEXT_SYMBOL:
			case ENUM_SYMBOL:
			case SERIAL_SYMBOL:
			case GEOMETRY_SYMBOL:
			case ZEROFILL_SYMBOL:
			case BYTE_SYMBOL:
			case UNICODE_SYMBOL:
			case TERMINATED_SYMBOL:
			case OPTIONALLY_SYMBOL:
			case ENCLOSED_SYMBOL:
			case ESCAPED_SYMBOL:
			case LINES_SYMBOL:
			case STARTING_SYMBOL:
			case GLOBAL_SYMBOL:
			case LOCAL_SYMBOL:
			case SESSION_SYMBOL:
			case IDENTIFIER:
			case BACK_TICK_QUOTED_ID:
			case DOUBLE_QUOTED_TEXT:
			case SINGLE_QUOTED_TEXT:
			case BRACKET_QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1466);
				identList();
				}
				break;
			case OPEN_PAR_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1467);
				match(OPEN_PAR_SYMBOL);
				setState(1468);
				identList();
				setState(1469);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentListContext extends ParserRuleContext {
		public List<QualifiedIdentifierContext> qualifiedIdentifier() {
			return getRuleContexts(QualifiedIdentifierContext.class);
		}
		public QualifiedIdentifierContext qualifiedIdentifier(int i) {
			return getRuleContext(QualifiedIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public IdentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identList; }
	}

	public final IdentListContext identList() throws RecognitionException {
		IdentListContext _localctx = new IdentListContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_identList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1473);
			qualifiedIdentifier();
			setState(1478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(1474);
				match(COMMA_SYMBOL);
				setState(1475);
				qualifiedIdentifier();
				}
				}
				setState(1480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FulltextOptionsContext extends ParserRuleContext {
		public TerminalNode IN_SYMBOL() { return getToken(SQLSelectParser.IN_SYMBOL, 0); }
		public TerminalNode BOOLEAN_SYMBOL() { return getToken(SQLSelectParser.BOOLEAN_SYMBOL, 0); }
		public TerminalNode MODE_SYMBOL() { return getToken(SQLSelectParser.MODE_SYMBOL, 0); }
		public TerminalNode NATURAL_SYMBOL() { return getToken(SQLSelectParser.NATURAL_SYMBOL, 0); }
		public TerminalNode LANGUAGE_SYMBOL() { return getToken(SQLSelectParser.LANGUAGE_SYMBOL, 0); }
		public TerminalNode WITH_SYMBOL() { return getToken(SQLSelectParser.WITH_SYMBOL, 0); }
		public TerminalNode QUERY_SYMBOL() { return getToken(SQLSelectParser.QUERY_SYMBOL, 0); }
		public TerminalNode EXPANSION_SYMBOL() { return getToken(SQLSelectParser.EXPANSION_SYMBOL, 0); }
		public FulltextOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fulltextOptions; }
	}

	public final FulltextOptionsContext fulltextOptions() throws RecognitionException {
		FulltextOptionsContext _localctx = new FulltextOptionsContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_fulltextOptions);
		int _la;
		try {
			setState(1496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1481);
				match(IN_SYMBOL);
				setState(1482);
				match(BOOLEAN_SYMBOL);
				setState(1483);
				match(MODE_SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1484);
				match(IN_SYMBOL);
				setState(1485);
				match(NATURAL_SYMBOL);
				setState(1486);
				match(LANGUAGE_SYMBOL);
				setState(1487);
				match(MODE_SYMBOL);
				setState(1491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH_SYMBOL) {
					{
					setState(1488);
					match(WITH_SYMBOL);
					setState(1489);
					match(QUERY_SYMBOL);
					setState(1490);
					match(EXPANSION_SYMBOL);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1493);
				match(WITH_SYMBOL);
				setState(1494);
				match(QUERY_SYMBOL);
				setState(1495);
				match(EXPANSION_SYMBOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuntimeFunctionCallContext extends ParserRuleContext {
		public Token name;
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public TerminalNode CHAR_SYMBOL() { return getToken(SQLSelectParser.CHAR_SYMBOL, 0); }
		public TerminalNode USING_SYMBOL() { return getToken(SQLSelectParser.USING_SYMBOL, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public TerminalNode CURRENT_USER_SYMBOL() { return getToken(SQLSelectParser.CURRENT_USER_SYMBOL, 0); }
		public ParenthesesContext parentheses() {
			return getRuleContext(ParenthesesContext.class,0);
		}
		public ExprWithParenthesesContext exprWithParentheses() {
			return getRuleContext(ExprWithParenthesesContext.class,0);
		}
		public TerminalNode DATE_SYMBOL() { return getToken(SQLSelectParser.DATE_SYMBOL, 0); }
		public TerminalNode DAY_SYMBOL() { return getToken(SQLSelectParser.DAY_SYMBOL, 0); }
		public TerminalNode HOUR_SYMBOL() { return getToken(SQLSelectParser.HOUR_SYMBOL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public TerminalNode INSERT_SYMBOL() { return getToken(SQLSelectParser.INSERT_SYMBOL, 0); }
		public TerminalNode INTERVAL_SYMBOL() { return getToken(SQLSelectParser.INTERVAL_SYMBOL, 0); }
		public TerminalNode LEFT_SYMBOL() { return getToken(SQLSelectParser.LEFT_SYMBOL, 0); }
		public TerminalNode MINUTE_SYMBOL() { return getToken(SQLSelectParser.MINUTE_SYMBOL, 0); }
		public TerminalNode MONTH_SYMBOL() { return getToken(SQLSelectParser.MONTH_SYMBOL, 0); }
		public TerminalNode RIGHT_SYMBOL() { return getToken(SQLSelectParser.RIGHT_SYMBOL, 0); }
		public TerminalNode SECOND_SYMBOL() { return getToken(SQLSelectParser.SECOND_SYMBOL, 0); }
		public TerminalNode TIME_SYMBOL() { return getToken(SQLSelectParser.TIME_SYMBOL, 0); }
		public TerminalNode TIMESTAMP_SYMBOL() { return getToken(SQLSelectParser.TIMESTAMP_SYMBOL, 0); }
		public TrimFunctionContext trimFunction() {
			return getRuleContext(TrimFunctionContext.class,0);
		}
		public TerminalNode USER_SYMBOL() { return getToken(SQLSelectParser.USER_SYMBOL, 0); }
		public TerminalNode VALUES_SYMBOL() { return getToken(SQLSelectParser.VALUES_SYMBOL, 0); }
		public TerminalNode YEAR_SYMBOL() { return getToken(SQLSelectParser.YEAR_SYMBOL, 0); }
		public TerminalNode ADDDATE_SYMBOL() { return getToken(SQLSelectParser.ADDDATE_SYMBOL, 0); }
		public TerminalNode SUBDATE_SYMBOL() { return getToken(SQLSelectParser.SUBDATE_SYMBOL, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode CURDATE_SYMBOL() { return getToken(SQLSelectParser.CURDATE_SYMBOL, 0); }
		public TerminalNode CURTIME_SYMBOL() { return getToken(SQLSelectParser.CURTIME_SYMBOL, 0); }
		public TimeFunctionParametersContext timeFunctionParameters() {
			return getRuleContext(TimeFunctionParametersContext.class,0);
		}
		public TerminalNode DATE_ADD_SYMBOL() { return getToken(SQLSelectParser.DATE_ADD_SYMBOL, 0); }
		public TerminalNode DATE_SUB_SYMBOL() { return getToken(SQLSelectParser.DATE_SUB_SYMBOL, 0); }
		public TerminalNode FROM_SYMBOL() { return getToken(SQLSelectParser.FROM_SYMBOL, 0); }
		public TerminalNode EXTRACT_SYMBOL() { return getToken(SQLSelectParser.EXTRACT_SYMBOL, 0); }
		public DateTimeTtypeContext dateTimeTtype() {
			return getRuleContext(DateTimeTtypeContext.class,0);
		}
		public TerminalNode GET_FORMAT_SYMBOL() { return getToken(SQLSelectParser.GET_FORMAT_SYMBOL, 0); }
		public TerminalNode NOW_SYMBOL() { return getToken(SQLSelectParser.NOW_SYMBOL, 0); }
		public BitExprContext bitExpr() {
			return getRuleContext(BitExprContext.class,0);
		}
		public TerminalNode IN_SYMBOL() { return getToken(SQLSelectParser.IN_SYMBOL, 0); }
		public TerminalNode POSITION_SYMBOL() { return getToken(SQLSelectParser.POSITION_SYMBOL, 0); }
		public SubstringFunctionContext substringFunction() {
			return getRuleContext(SubstringFunctionContext.class,0);
		}
		public TerminalNode SYSDATE_SYMBOL() { return getToken(SQLSelectParser.SYSDATE_SYMBOL, 0); }
		public IntervalTimeStampContext intervalTimeStamp() {
			return getRuleContext(IntervalTimeStampContext.class,0);
		}
		public TerminalNode TIMESTAMP_ADD_SYMBOL() { return getToken(SQLSelectParser.TIMESTAMP_ADD_SYMBOL, 0); }
		public TerminalNode TIMESTAMP_DIFF_SYMBOL() { return getToken(SQLSelectParser.TIMESTAMP_DIFF_SYMBOL, 0); }
		public TerminalNode UTC_DATE_SYMBOL() { return getToken(SQLSelectParser.UTC_DATE_SYMBOL, 0); }
		public TerminalNode UTC_TIME_SYMBOL() { return getToken(SQLSelectParser.UTC_TIME_SYMBOL, 0); }
		public TerminalNode UTC_TIMESTAMP_SYMBOL() { return getToken(SQLSelectParser.UTC_TIMESTAMP_SYMBOL, 0); }
		public TerminalNode ASCII_SYMBOL() { return getToken(SQLSelectParser.ASCII_SYMBOL, 0); }
		public TerminalNode CHARSET_SYMBOL() { return getToken(SQLSelectParser.CHARSET_SYMBOL, 0); }
		public ExprListWithParenthesesContext exprListWithParentheses() {
			return getRuleContext(ExprListWithParenthesesContext.class,0);
		}
		public TerminalNode COALESCE_SYMBOL() { return getToken(SQLSelectParser.COALESCE_SYMBOL, 0); }
		public TerminalNode COLLATION_SYMBOL() { return getToken(SQLSelectParser.COLLATION_SYMBOL, 0); }
		public TerminalNode DATABASE_SYMBOL() { return getToken(SQLSelectParser.DATABASE_SYMBOL, 0); }
		public TerminalNode IF_SYMBOL() { return getToken(SQLSelectParser.IF_SYMBOL, 0); }
		public TerminalNode FORMAT_SYMBOL() { return getToken(SQLSelectParser.FORMAT_SYMBOL, 0); }
		public TerminalNode MICROSECOND_SYMBOL() { return getToken(SQLSelectParser.MICROSECOND_SYMBOL, 0); }
		public TerminalNode MOD_SYMBOL() { return getToken(SQLSelectParser.MOD_SYMBOL, 0); }
		public TextLiteralContext textLiteral() {
			return getRuleContext(TextLiteralContext.class,0);
		}
		public TerminalNode OLD_PASSWORD_SYMBOL() { return getToken(SQLSelectParser.OLD_PASSWORD_SYMBOL, 0); }
		public TerminalNode PASSWORD_SYMBOL() { return getToken(SQLSelectParser.PASSWORD_SYMBOL, 0); }
		public TerminalNode QUARTER_SYMBOL() { return getToken(SQLSelectParser.QUARTER_SYMBOL, 0); }
		public TerminalNode REPEAT_SYMBOL() { return getToken(SQLSelectParser.REPEAT_SYMBOL, 0); }
		public TerminalNode REPLACE_SYMBOL() { return getToken(SQLSelectParser.REPLACE_SYMBOL, 0); }
		public TerminalNode REVERSE_SYMBOL() { return getToken(SQLSelectParser.REVERSE_SYMBOL, 0); }
		public TerminalNode ROW_COUNT_SYMBOL() { return getToken(SQLSelectParser.ROW_COUNT_SYMBOL, 0); }
		public TerminalNode TRUNCATE_SYMBOL() { return getToken(SQLSelectParser.TRUNCATE_SYMBOL, 0); }
		public TerminalNode WEEK_SYMBOL() { return getToken(SQLSelectParser.WEEK_SYMBOL, 0); }
		public TerminalNode WEIGHT_STRING_SYMBOL() { return getToken(SQLSelectParser.WEIGHT_STRING_SYMBOL, 0); }
		public TerminalNode AS_SYMBOL() { return getToken(SQLSelectParser.AS_SYMBOL, 0); }
		public TerminalNode BINARY_SYMBOL() { return getToken(SQLSelectParser.BINARY_SYMBOL, 0); }
		public WsNumCodepointsContext wsNumCodepoints() {
			return getRuleContext(WsNumCodepointsContext.class,0);
		}
		public List<Ulong_numberContext> ulong_number() {
			return getRuleContexts(Ulong_numberContext.class);
		}
		public Ulong_numberContext ulong_number(int i) {
			return getRuleContext(Ulong_numberContext.class,i);
		}
		public WeightStringLevelsContext weightStringLevels() {
			return getRuleContext(WeightStringLevelsContext.class,0);
		}
		public GeometryFunctionContext geometryFunction() {
			return getRuleContext(GeometryFunctionContext.class,0);
		}
		public RuntimeFunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runtimeFunctionCall; }
	}

	public final RuntimeFunctionCallContext runtimeFunctionCall() throws RecognitionException {
		RuntimeFunctionCallContext _localctx = new RuntimeFunctionCallContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_runtimeFunctionCall);
		int _la;
		try {
			setState(1768);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1498);
				((RuntimeFunctionCallContext)_localctx).name = match(CHAR_SYMBOL);
				setState(1499);
				match(OPEN_PAR_SYMBOL);
				setState(1500);
				exprList();
				setState(1503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING_SYMBOL) {
					{
					setState(1501);
					match(USING_SYMBOL);
					setState(1502);
					charsetName();
					}
				}

				setState(1505);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case CURRENT_USER_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1507);
				((RuntimeFunctionCallContext)_localctx).name = match(CURRENT_USER_SYMBOL);
				setState(1509);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1508);
					parentheses();
					}
					break;
				}
				}
				break;
			case DATE_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1511);
				((RuntimeFunctionCallContext)_localctx).name = match(DATE_SYMBOL);
				setState(1512);
				exprWithParentheses();
				}
				break;
			case DAY_SYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1513);
				((RuntimeFunctionCallContext)_localctx).name = match(DAY_SYMBOL);
				setState(1514);
				exprWithParentheses();
				}
				break;
			case HOUR_SYMBOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1515);
				((RuntimeFunctionCallContext)_localctx).name = match(HOUR_SYMBOL);
				setState(1516);
				exprWithParentheses();
				}
				break;
			case INSERT_SYMBOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1517);
				((RuntimeFunctionCallContext)_localctx).name = match(INSERT_SYMBOL);
				setState(1518);
				match(OPEN_PAR_SYMBOL);
				setState(1519);
				expr(0);
				setState(1520);
				match(COMMA_SYMBOL);
				setState(1521);
				expr(0);
				setState(1522);
				match(COMMA_SYMBOL);
				setState(1523);
				expr(0);
				setState(1524);
				match(COMMA_SYMBOL);
				setState(1525);
				expr(0);
				setState(1526);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case INTERVAL_SYMBOL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1528);
				((RuntimeFunctionCallContext)_localctx).name = match(INTERVAL_SYMBOL);
				setState(1529);
				match(OPEN_PAR_SYMBOL);
				setState(1530);
				expr(0);
				setState(1533); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1531);
					match(COMMA_SYMBOL);
					setState(1532);
					expr(0);
					}
					}
					setState(1535); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA_SYMBOL );
				setState(1537);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case LEFT_SYMBOL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1539);
				((RuntimeFunctionCallContext)_localctx).name = match(LEFT_SYMBOL);
				setState(1540);
				match(OPEN_PAR_SYMBOL);
				setState(1541);
				expr(0);
				setState(1542);
				match(COMMA_SYMBOL);
				setState(1543);
				expr(0);
				setState(1544);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case MINUTE_SYMBOL:
				enterOuterAlt(_localctx, 9);
				{
				setState(1546);
				((RuntimeFunctionCallContext)_localctx).name = match(MINUTE_SYMBOL);
				setState(1547);
				exprWithParentheses();
				}
				break;
			case MONTH_SYMBOL:
				enterOuterAlt(_localctx, 10);
				{
				setState(1548);
				((RuntimeFunctionCallContext)_localctx).name = match(MONTH_SYMBOL);
				setState(1549);
				exprWithParentheses();
				}
				break;
			case RIGHT_SYMBOL:
				enterOuterAlt(_localctx, 11);
				{
				setState(1550);
				((RuntimeFunctionCallContext)_localctx).name = match(RIGHT_SYMBOL);
				setState(1551);
				match(OPEN_PAR_SYMBOL);
				setState(1552);
				expr(0);
				setState(1553);
				match(COMMA_SYMBOL);
				setState(1554);
				expr(0);
				setState(1555);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case SECOND_SYMBOL:
				enterOuterAlt(_localctx, 12);
				{
				setState(1557);
				((RuntimeFunctionCallContext)_localctx).name = match(SECOND_SYMBOL);
				setState(1558);
				exprWithParentheses();
				}
				break;
			case TIME_SYMBOL:
				enterOuterAlt(_localctx, 13);
				{
				setState(1559);
				((RuntimeFunctionCallContext)_localctx).name = match(TIME_SYMBOL);
				setState(1560);
				exprWithParentheses();
				}
				break;
			case TIMESTAMP_SYMBOL:
				enterOuterAlt(_localctx, 14);
				{
				setState(1561);
				((RuntimeFunctionCallContext)_localctx).name = match(TIMESTAMP_SYMBOL);
				setState(1562);
				match(OPEN_PAR_SYMBOL);
				setState(1563);
				expr(0);
				setState(1566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_SYMBOL) {
					{
					setState(1564);
					match(COMMA_SYMBOL);
					setState(1565);
					expr(0);
					}
				}

				setState(1568);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case TRIM_SYMBOL:
				enterOuterAlt(_localctx, 15);
				{
				setState(1570);
				trimFunction();
				}
				break;
			case USER_SYMBOL:
				enterOuterAlt(_localctx, 16);
				{
				setState(1571);
				((RuntimeFunctionCallContext)_localctx).name = match(USER_SYMBOL);
				setState(1572);
				parentheses();
				}
				break;
			case VALUES_SYMBOL:
				enterOuterAlt(_localctx, 17);
				{
				setState(1573);
				((RuntimeFunctionCallContext)_localctx).name = match(VALUES_SYMBOL);
				setState(1574);
				exprWithParentheses();
				}
				break;
			case YEAR_SYMBOL:
				enterOuterAlt(_localctx, 18);
				{
				setState(1575);
				((RuntimeFunctionCallContext)_localctx).name = match(YEAR_SYMBOL);
				setState(1576);
				exprWithParentheses();
				}
				break;
			case ADDDATE_SYMBOL:
			case SUBDATE_SYMBOL:
				enterOuterAlt(_localctx, 19);
				{
				setState(1577);
				((RuntimeFunctionCallContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADDDATE_SYMBOL || _la==SUBDATE_SYMBOL) ) {
					((RuntimeFunctionCallContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1578);
				match(OPEN_PAR_SYMBOL);
				setState(1579);
				expr(0);
				setState(1580);
				match(COMMA_SYMBOL);
				setState(1586);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1581);
					expr(0);
					}
					break;
				case 2:
					{
					setState(1582);
					match(INTERVAL_SYMBOL);
					setState(1583);
					expr(0);
					setState(1584);
					interval();
					}
					break;
				}
				setState(1588);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case CURDATE_SYMBOL:
				enterOuterAlt(_localctx, 20);
				{
				setState(1590);
				((RuntimeFunctionCallContext)_localctx).name = match(CURDATE_SYMBOL);
				setState(1592);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1591);
					parentheses();
					}
					break;
				}
				}
				break;
			case CURTIME_SYMBOL:
				enterOuterAlt(_localctx, 21);
				{
				setState(1594);
				((RuntimeFunctionCallContext)_localctx).name = match(CURTIME_SYMBOL);
				setState(1596);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1595);
					timeFunctionParameters();
					}
					break;
				}
				}
				break;
			case DATE_ADD_SYMBOL:
			case DATE_SUB_SYMBOL:
				enterOuterAlt(_localctx, 22);
				{
				setState(1598);
				((RuntimeFunctionCallContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DATE_ADD_SYMBOL || _la==DATE_SUB_SYMBOL) ) {
					((RuntimeFunctionCallContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1599);
				match(OPEN_PAR_SYMBOL);
				setState(1600);
				expr(0);
				setState(1601);
				match(COMMA_SYMBOL);
				setState(1602);
				match(INTERVAL_SYMBOL);
				setState(1603);
				expr(0);
				setState(1604);
				interval();
				setState(1605);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case EXTRACT_SYMBOL:
				enterOuterAlt(_localctx, 23);
				{
				setState(1607);
				((RuntimeFunctionCallContext)_localctx).name = match(EXTRACT_SYMBOL);
				setState(1608);
				match(OPEN_PAR_SYMBOL);
				setState(1609);
				interval();
				setState(1610);
				match(FROM_SYMBOL);
				setState(1611);
				expr(0);
				setState(1612);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case GET_FORMAT_SYMBOL:
				enterOuterAlt(_localctx, 24);
				{
				setState(1614);
				((RuntimeFunctionCallContext)_localctx).name = match(GET_FORMAT_SYMBOL);
				setState(1615);
				match(OPEN_PAR_SYMBOL);
				setState(1616);
				dateTimeTtype();
				setState(1617);
				match(COMMA_SYMBOL);
				setState(1618);
				expr(0);
				setState(1619);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case NOW_SYMBOL:
				enterOuterAlt(_localctx, 25);
				{
				setState(1621);
				((RuntimeFunctionCallContext)_localctx).name = match(NOW_SYMBOL);
				setState(1623);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1622);
					timeFunctionParameters();
					}
					break;
				}
				}
				break;
			case POSITION_SYMBOL:
				enterOuterAlt(_localctx, 26);
				{
				setState(1625);
				((RuntimeFunctionCallContext)_localctx).name = match(POSITION_SYMBOL);
				setState(1626);
				match(OPEN_PAR_SYMBOL);
				setState(1627);
				bitExpr(0);
				setState(1628);
				match(IN_SYMBOL);
				setState(1629);
				expr(0);
				setState(1630);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case SUBSTRING_SYMBOL:
				enterOuterAlt(_localctx, 27);
				{
				setState(1632);
				substringFunction();
				}
				break;
			case SYSDATE_SYMBOL:
				enterOuterAlt(_localctx, 28);
				{
				setState(1633);
				((RuntimeFunctionCallContext)_localctx).name = match(SYSDATE_SYMBOL);
				setState(1635);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1634);
					timeFunctionParameters();
					}
					break;
				}
				}
				break;
			case TIMESTAMP_ADD_SYMBOL:
			case TIMESTAMP_DIFF_SYMBOL:
				enterOuterAlt(_localctx, 29);
				{
				setState(1637);
				((RuntimeFunctionCallContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TIMESTAMP_ADD_SYMBOL || _la==TIMESTAMP_DIFF_SYMBOL) ) {
					((RuntimeFunctionCallContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1638);
				match(OPEN_PAR_SYMBOL);
				setState(1639);
				intervalTimeStamp();
				setState(1640);
				match(COMMA_SYMBOL);
				setState(1641);
				expr(0);
				setState(1642);
				match(COMMA_SYMBOL);
				setState(1643);
				expr(0);
				setState(1644);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case UTC_DATE_SYMBOL:
				enterOuterAlt(_localctx, 30);
				{
				setState(1646);
				((RuntimeFunctionCallContext)_localctx).name = match(UTC_DATE_SYMBOL);
				setState(1648);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1647);
					parentheses();
					}
					break;
				}
				}
				break;
			case UTC_TIME_SYMBOL:
				enterOuterAlt(_localctx, 31);
				{
				setState(1650);
				((RuntimeFunctionCallContext)_localctx).name = match(UTC_TIME_SYMBOL);
				setState(1652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1651);
					timeFunctionParameters();
					}
					break;
				}
				}
				break;
			case UTC_TIMESTAMP_SYMBOL:
				enterOuterAlt(_localctx, 32);
				{
				setState(1654);
				((RuntimeFunctionCallContext)_localctx).name = match(UTC_TIMESTAMP_SYMBOL);
				setState(1656);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1655);
					timeFunctionParameters();
					}
					break;
				}
				}
				break;
			case ASCII_SYMBOL:
				enterOuterAlt(_localctx, 33);
				{
				setState(1658);
				((RuntimeFunctionCallContext)_localctx).name = match(ASCII_SYMBOL);
				setState(1659);
				exprWithParentheses();
				}
				break;
			case CHARSET_SYMBOL:
				enterOuterAlt(_localctx, 34);
				{
				setState(1660);
				((RuntimeFunctionCallContext)_localctx).name = match(CHARSET_SYMBOL);
				setState(1661);
				exprWithParentheses();
				}
				break;
			case COALESCE_SYMBOL:
				enterOuterAlt(_localctx, 35);
				{
				setState(1662);
				((RuntimeFunctionCallContext)_localctx).name = match(COALESCE_SYMBOL);
				setState(1663);
				exprListWithParentheses();
				}
				break;
			case COLLATION_SYMBOL:
				enterOuterAlt(_localctx, 36);
				{
				setState(1664);
				((RuntimeFunctionCallContext)_localctx).name = match(COLLATION_SYMBOL);
				setState(1665);
				exprWithParentheses();
				}
				break;
			case DATABASE_SYMBOL:
				enterOuterAlt(_localctx, 37);
				{
				setState(1666);
				((RuntimeFunctionCallContext)_localctx).name = match(DATABASE_SYMBOL);
				setState(1667);
				parentheses();
				}
				break;
			case IF_SYMBOL:
				enterOuterAlt(_localctx, 38);
				{
				setState(1668);
				((RuntimeFunctionCallContext)_localctx).name = match(IF_SYMBOL);
				setState(1669);
				match(OPEN_PAR_SYMBOL);
				setState(1670);
				expr(0);
				setState(1671);
				match(COMMA_SYMBOL);
				setState(1672);
				expr(0);
				setState(1673);
				match(COMMA_SYMBOL);
				setState(1674);
				expr(0);
				setState(1675);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case FORMAT_SYMBOL:
				enterOuterAlt(_localctx, 39);
				{
				setState(1677);
				((RuntimeFunctionCallContext)_localctx).name = match(FORMAT_SYMBOL);
				setState(1678);
				match(OPEN_PAR_SYMBOL);
				setState(1679);
				expr(0);
				setState(1680);
				match(COMMA_SYMBOL);
				setState(1681);
				expr(0);
				setState(1684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_SYMBOL) {
					{
					setState(1682);
					match(COMMA_SYMBOL);
					setState(1683);
					expr(0);
					}
				}

				setState(1686);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case MICROSECOND_SYMBOL:
				enterOuterAlt(_localctx, 40);
				{
				setState(1688);
				((RuntimeFunctionCallContext)_localctx).name = match(MICROSECOND_SYMBOL);
				setState(1689);
				exprWithParentheses();
				}
				break;
			case MOD_SYMBOL:
				enterOuterAlt(_localctx, 41);
				{
				setState(1690);
				((RuntimeFunctionCallContext)_localctx).name = match(MOD_SYMBOL);
				setState(1691);
				match(OPEN_PAR_SYMBOL);
				setState(1692);
				expr(0);
				setState(1693);
				match(COMMA_SYMBOL);
				setState(1694);
				expr(0);
				setState(1695);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case OLD_PASSWORD_SYMBOL:
				enterOuterAlt(_localctx, 42);
				{
				setState(1697);
				((RuntimeFunctionCallContext)_localctx).name = match(OLD_PASSWORD_SYMBOL);
				setState(1698);
				match(OPEN_PAR_SYMBOL);
				setState(1699);
				textLiteral();
				setState(1700);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case PASSWORD_SYMBOL:
				enterOuterAlt(_localctx, 43);
				{
				setState(1702);
				((RuntimeFunctionCallContext)_localctx).name = match(PASSWORD_SYMBOL);
				setState(1703);
				exprWithParentheses();
				}
				break;
			case QUARTER_SYMBOL:
				enterOuterAlt(_localctx, 44);
				{
				setState(1704);
				((RuntimeFunctionCallContext)_localctx).name = match(QUARTER_SYMBOL);
				setState(1705);
				exprWithParentheses();
				}
				break;
			case REPEAT_SYMBOL:
				enterOuterAlt(_localctx, 45);
				{
				setState(1706);
				((RuntimeFunctionCallContext)_localctx).name = match(REPEAT_SYMBOL);
				setState(1707);
				match(OPEN_PAR_SYMBOL);
				setState(1708);
				expr(0);
				setState(1709);
				match(COMMA_SYMBOL);
				setState(1710);
				expr(0);
				setState(1711);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case REPLACE_SYMBOL:
				enterOuterAlt(_localctx, 46);
				{
				setState(1713);
				((RuntimeFunctionCallContext)_localctx).name = match(REPLACE_SYMBOL);
				setState(1714);
				match(OPEN_PAR_SYMBOL);
				setState(1715);
				expr(0);
				setState(1716);
				match(COMMA_SYMBOL);
				setState(1717);
				expr(0);
				setState(1718);
				match(COMMA_SYMBOL);
				setState(1719);
				expr(0);
				setState(1720);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case REVERSE_SYMBOL:
				enterOuterAlt(_localctx, 47);
				{
				setState(1722);
				((RuntimeFunctionCallContext)_localctx).name = match(REVERSE_SYMBOL);
				setState(1723);
				exprWithParentheses();
				}
				break;
			case ROW_COUNT_SYMBOL:
				enterOuterAlt(_localctx, 48);
				{
				setState(1724);
				((RuntimeFunctionCallContext)_localctx).name = match(ROW_COUNT_SYMBOL);
				setState(1725);
				parentheses();
				}
				break;
			case TRUNCATE_SYMBOL:
				enterOuterAlt(_localctx, 49);
				{
				setState(1726);
				((RuntimeFunctionCallContext)_localctx).name = match(TRUNCATE_SYMBOL);
				setState(1727);
				match(OPEN_PAR_SYMBOL);
				setState(1728);
				expr(0);
				setState(1729);
				match(COMMA_SYMBOL);
				setState(1730);
				expr(0);
				setState(1731);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case WEEK_SYMBOL:
				enterOuterAlt(_localctx, 50);
				{
				setState(1733);
				((RuntimeFunctionCallContext)_localctx).name = match(WEEK_SYMBOL);
				setState(1734);
				match(OPEN_PAR_SYMBOL);
				setState(1735);
				expr(0);
				setState(1738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_SYMBOL) {
					{
					setState(1736);
					match(COMMA_SYMBOL);
					setState(1737);
					expr(0);
					}
				}

				setState(1740);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case WEIGHT_STRING_SYMBOL:
				enterOuterAlt(_localctx, 51);
				{
				setState(1742);
				((RuntimeFunctionCallContext)_localctx).name = match(WEIGHT_STRING_SYMBOL);
				setState(1743);
				match(OPEN_PAR_SYMBOL);
				setState(1744);
				expr(0);
				setState(1763);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1748);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS_SYMBOL) {
						{
						setState(1745);
						match(AS_SYMBOL);
						setState(1746);
						match(CHAR_SYMBOL);
						setState(1747);
						wsNumCodepoints();
						}
					}

					setState(1751);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LEVEL_SYMBOL) {
						{
						setState(1750);
						weightStringLevels();
						}
					}

					}
					break;
				case 2:
					{
					setState(1753);
					match(AS_SYMBOL);
					setState(1754);
					match(BINARY_SYMBOL);
					setState(1755);
					wsNumCodepoints();
					}
					break;
				case 3:
					{
					setState(1756);
					match(COMMA_SYMBOL);
					setState(1757);
					ulong_number();
					setState(1758);
					match(COMMA_SYMBOL);
					setState(1759);
					ulong_number();
					setState(1760);
					match(COMMA_SYMBOL);
					setState(1761);
					ulong_number();
					}
					break;
				}
				setState(1765);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case CONTAINS_SYMBOL:
			case GEOMETRYCOLLECTION_SYMBOL:
			case LINESTRING_SYMBOL:
			case MULTILINESTRING_SYMBOL:
			case MULTIPOINT_SYMBOL:
			case MULTIPOLYGON_SYMBOL:
			case POINT_SYMBOL:
			case POLYGON_SYMBOL:
				enterOuterAlt(_localctx, 52);
				{
				setState(1767);
				geometryFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GeometryFunctionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMMA_SYMBOL() { return getToken(SQLSelectParser.COMMA_SYMBOL, 0); }
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public TerminalNode CONTAINS_SYMBOL() { return getToken(SQLSelectParser.CONTAINS_SYMBOL, 0); }
		public TerminalNode GEOMETRYCOLLECTION_SYMBOL() { return getToken(SQLSelectParser.GEOMETRYCOLLECTION_SYMBOL, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public ExprListWithParenthesesContext exprListWithParentheses() {
			return getRuleContext(ExprListWithParenthesesContext.class,0);
		}
		public TerminalNode LINESTRING_SYMBOL() { return getToken(SQLSelectParser.LINESTRING_SYMBOL, 0); }
		public TerminalNode MULTILINESTRING_SYMBOL() { return getToken(SQLSelectParser.MULTILINESTRING_SYMBOL, 0); }
		public TerminalNode MULTIPOINT_SYMBOL() { return getToken(SQLSelectParser.MULTIPOINT_SYMBOL, 0); }
		public TerminalNode MULTIPOLYGON_SYMBOL() { return getToken(SQLSelectParser.MULTIPOLYGON_SYMBOL, 0); }
		public TerminalNode POINT_SYMBOL() { return getToken(SQLSelectParser.POINT_SYMBOL, 0); }
		public TerminalNode POLYGON_SYMBOL() { return getToken(SQLSelectParser.POLYGON_SYMBOL, 0); }
		public GeometryFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geometryFunction; }
	}

	public final GeometryFunctionContext geometryFunction() throws RecognitionException {
		GeometryFunctionContext _localctx = new GeometryFunctionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_geometryFunction);
		int _la;
		try {
			setState(1800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTAINS_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1770);
				((GeometryFunctionContext)_localctx).name = match(CONTAINS_SYMBOL);
				setState(1771);
				match(OPEN_PAR_SYMBOL);
				setState(1772);
				expr(0);
				setState(1773);
				match(COMMA_SYMBOL);
				setState(1774);
				expr(0);
				setState(1775);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case GEOMETRYCOLLECTION_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1777);
				((GeometryFunctionContext)_localctx).name = match(GEOMETRYCOLLECTION_SYMBOL);
				setState(1778);
				match(OPEN_PAR_SYMBOL);
				setState(1780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_OPERATOR) | (1L << MINUS_OPERATOR) | (1L << LOGICAL_NOT_OPERATOR) | (1L << BITWISE_NOT_OPERATOR) | (1L << OPEN_PAR_SYMBOL) | (1L << OPEN_CURLY_SYMBOL) | (1L << AT_SIGN_SYMBOL) | (1L << AT_TEXT_SUFFIX) | (1L << AT_AT_SIGN_SYMBOL) | (1L << NULL2_SYMBOL) | (1L << PARAM_MARKER) | (1L << HEX_NUMBER) | (1L << BIN_NUMBER) | (1L << INT_NUMBER) | (1L << DECIMAL_NUMBER) | (1L << FLOAT_NUMBER) | (1L << TINYINT_SYMBOL) | (1L << SMALLINT_SYMBOL) | (1L << MEDIUMINT_SYMBOL) | (1L << INT_SYMBOL) | (1L << BIGINT_SYMBOL) | (1L << SECOND_SYMBOL) | (1L << MINUTE_SYMBOL) | (1L << HOUR_SYMBOL) | (1L << DAY_SYMBOL) | (1L << WEEK_SYMBOL) | (1L << MONTH_SYMBOL) | (1L << QUARTER_SYMBOL) | (1L << YEAR_SYMBOL) | (1L << DEFAULT_SYMBOL) | (1L << UNION_SYMBOL) | (1L << SELECT_SYMBOL) | (1L << ALL_SYMBOL) | (1L << DISTINCT_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRAIGHT_JOIN_SYMBOL - 64)) | (1L << (HIGH_PRIORITY_SYMBOL - 64)) | (1L << (SQL_SMALL_RESULT_SYMBOL - 64)) | (1L << (SQL_BIG_RESULT_SYMBOL - 64)) | (1L << (SQL_BUFFER_RESULT_SYMBOL - 64)) | (1L << (SQL_CALC_FOUND_ROWS_SYMBOL - 64)) | (1L << (LIMIT_SYMBOL - 64)) | (1L << (OFFSET_SYMBOL - 64)) | (1L << (INTO_SYMBOL - 64)) | (1L << (OUTFILE_SYMBOL - 64)) | (1L << (DUMPFILE_SYMBOL - 64)) | (1L << (PROCEDURE_SYMBOL - 64)) | (1L << (ANALYSE_SYMBOL - 64)) | (1L << (HAVING_SYMBOL - 64)) | (1L << (WINDOW_SYMBOL - 64)) | (1L << (AS_SYMBOL - 64)) | (1L << (PARTITION_SYMBOL - 64)) | (1L << (BY_SYMBOL - 64)) | (1L << (ROWS_SYMBOL - 64)) | (1L << (RANGE_SYMBOL - 64)) | (1L << (GROUPS_SYMBOL - 64)) | (1L << (UNBOUNDED_SYMBOL - 64)) | (1L << (PRECEDING_SYMBOL - 64)) | (1L << (INTERVAL_SYMBOL - 64)) | (1L << (CURRENT_SYMBOL - 64)) | (1L << (ROW_SYMBOL - 64)) | (1L << (BETWEEN_SYMBOL - 64)) | (1L << (AND_SYMBOL - 64)) | (1L << (FOLLOWING_SYMBOL - 64)) | (1L << (EXCLUDE_SYMBOL - 64)) | (1L << (GROUP_SYMBOL - 64)) | (1L << (TIES_SYMBOL - 64)) | (1L << (NO_SYMBOL - 64)) | (1L << (OTHERS_SYMBOL - 64)) | (1L << (WITH_SYMBOL - 64)) | (1L << (RECURSIVE_SYMBOL - 64)) | (1L << (ROLLUP_SYMBOL - 64)) | (1L << (CUBE_SYMBOL - 64)) | (1L << (ORDER_SYMBOL - 64)) | (1L << (ASC_SYMBOL - 64)) | (1L << (DESC_SYMBOL - 64)) | (1L << (FROM_SYMBOL - 64)) | (1L << (DUAL_SYMBOL - 64)) | (1L << (VALUES_SYMBOL - 64)) | (1L << (TABLE_SYMBOL - 64)) | (1L << (SQL_NO_CACHE_SYMBOL - 64)) | (1L << (SQL_CACHE_SYMBOL - 64)) | (1L << (MAX_STATEMENT_TIME_SYMBOL - 64)) | (1L << (FOR_SYMBOL - 64)) | (1L << (OF_SYMBOL - 64)) | (1L << (LOCK_SYMBOL - 64)) | (1L << (IN_SYMBOL - 64)) | (1L << (SHARE_SYMBOL - 64)) | (1L << (MODE_SYMBOL - 64)) | (1L << (UPDATE_SYMBOL - 64)) | (1L << (SKIP_SYMBOL - 64)) | (1L << (LOCKED_SYMBOL - 64)) | (1L << (NOWAIT_SYMBOL - 64)) | (1L << (WHERE_SYMBOL - 64)) | (1L << (OJ_SYMBOL - 64)) | (1L << (ON_SYMBOL - 64)) | (1L << (USING_SYMBOL - 64)) | (1L << (NATURAL_SYMBOL - 64)) | (1L << (INNER_SYMBOL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (JOIN_SYMBOL - 128)) | (1L << (LEFT_SYMBOL - 128)) | (1L << (RIGHT_SYMBOL - 128)) | (1L << (OUTER_SYMBOL - 128)) | (1L << (CROSS_SYMBOL - 128)) | (1L << (LATERAL_SYMBOL - 128)) | (1L << (JSON_TABLE_SYMBOL - 128)) | (1L << (COLUMNS_SYMBOL - 128)) | (1L << (ORDINALITY_SYMBOL - 128)) | (1L << (EXISTS_SYMBOL - 128)) | (1L << (PATH_SYMBOL - 128)) | (1L << (NESTED_SYMBOL - 128)) | (1L << (EMPTY_SYMBOL - 128)) | (1L << (ERROR_SYMBOL - 128)) | (1L << (NULL_SYMBOL - 128)) | (1L << (USE_SYMBOL - 128)) | (1L << (FORCE_SYMBOL - 128)) | (1L << (IGNORE_SYMBOL - 128)) | (1L << (KEY_SYMBOL - 128)) | (1L << (INDEX_SYMBOL - 128)) | (1L << (PRIMARY_SYMBOL - 128)) | (1L << (IS_SYMBOL - 128)) | (1L << (TRUE_SYMBOL - 128)) | (1L << (FALSE_SYMBOL - 128)) | (1L << (UNKNOWN_SYMBOL - 128)) | (1L << (NOT_SYMBOL - 128)) | (1L << (XOR_SYMBOL - 128)) | (1L << (OR_SYMBOL - 128)) | (1L << (ANY_SYMBOL - 128)) | (1L << (MEMBER_SYMBOL - 128)) | (1L << (SOUNDS_SYMBOL - 128)) | (1L << (LIKE_SYMBOL - 128)) | (1L << (ESCAPE_SYMBOL - 128)) | (1L << (REGEXP_SYMBOL - 128)) | (1L << (DIV_SYMBOL - 128)) | (1L << (MOD_SYMBOL - 128)) | (1L << (MATCH_SYMBOL - 128)) | (1L << (AGAINST_SYMBOL - 128)) | (1L << (BINARY_SYMBOL - 128)) | (1L << (CAST_SYMBOL - 128)) | (1L << (ARRAY_SYMBOL - 128)) | (1L << (CASE_SYMBOL - 128)) | (1L << (END_SYMBOL - 128)) | (1L << (CONVERT_SYMBOL - 128)) | (1L << (COLLATE_SYMBOL - 128)) | (1L << (AVG_SYMBOL - 128)) | (1L << (BIT_AND_SYMBOL - 128)) | (1L << (BIT_OR_SYMBOL - 128)) | (1L << (BIT_XOR_SYMBOL - 128)) | (1L << (COUNT_SYMBOL - 128)) | (1L << (MIN_SYMBOL - 128)) | (1L << (MAX_SYMBOL - 128)) | (1L << (STD_SYMBOL - 128)) | (1L << (VARIANCE_SYMBOL - 128)) | (1L << (STDDEV_SAMP_SYMBOL - 128)) | (1L << (VAR_SAMP_SYMBOL - 128)) | (1L << (SUM_SYMBOL - 128)) | (1L << (GROUP_CONCAT_SYMBOL - 128)) | (1L << (SEPARATOR_SYMBOL - 128)) | (1L << (GROUPING_SYMBOL - 128)) | (1L << (ROW_NUMBER_SYMBOL - 128)) | (1L << (RANK_SYMBOL - 128)) | (1L << (DENSE_RANK_SYMBOL - 128)) | (1L << (CUME_DIST_SYMBOL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (PERCENT_RANK_SYMBOL - 192)) | (1L << (NTILE_SYMBOL - 192)) | (1L << (LEAD_SYMBOL - 192)) | (1L << (LAG_SYMBOL - 192)) | (1L << (FIRST_VALUE_SYMBOL - 192)) | (1L << (LAST_VALUE_SYMBOL - 192)) | (1L << (NTH_VALUE_SYMBOL - 192)) | (1L << (FIRST_SYMBOL - 192)) | (1L << (LAST_SYMBOL - 192)) | (1L << (OVER_SYMBOL - 192)) | (1L << (RESPECT_SYMBOL - 192)) | (1L << (NULLS_SYMBOL - 192)) | (1L << (JSON_ARRAYAGG_SYMBOL - 192)) | (1L << (JSON_OBJECTAGG_SYMBOL - 192)) | (1L << (BOOLEAN_SYMBOL - 192)) | (1L << (LANGUAGE_SYMBOL - 192)) | (1L << (QUERY_SYMBOL - 192)) | (1L << (EXPANSION_SYMBOL - 192)) | (1L << (CHAR_SYMBOL - 192)) | (1L << (CURRENT_USER_SYMBOL - 192)) | (1L << (DATE_SYMBOL - 192)) | (1L << (INSERT_SYMBOL - 192)) | (1L << (TIME_SYMBOL - 192)) | (1L << (TIMESTAMP_SYMBOL - 192)) | (1L << (USER_SYMBOL - 192)) | (1L << (ADDDATE_SYMBOL - 192)) | (1L << (SUBDATE_SYMBOL - 192)) | (1L << (CURDATE_SYMBOL - 192)) | (1L << (CURTIME_SYMBOL - 192)) | (1L << (DATE_ADD_SYMBOL - 192)) | (1L << (DATE_SUB_SYMBOL - 192)) | (1L << (EXTRACT_SYMBOL - 192)) | (1L << (GET_FORMAT_SYMBOL - 192)) | (1L << (NOW_SYMBOL - 192)) | (1L << (POSITION_SYMBOL - 192)) | (1L << (SYSDATE_SYMBOL - 192)) | (1L << (TIMESTAMP_ADD_SYMBOL - 192)) | (1L << (TIMESTAMP_DIFF_SYMBOL - 192)) | (1L << (UTC_DATE_SYMBOL - 192)) | (1L << (UTC_TIME_SYMBOL - 192)) | (1L << (UTC_TIMESTAMP_SYMBOL - 192)) | (1L << (ASCII_SYMBOL - 192)) | (1L << (CHARSET_SYMBOL - 192)) | (1L << (COALESCE_SYMBOL - 192)) | (1L << (COLLATION_SYMBOL - 192)) | (1L << (DATABASE_SYMBOL - 192)) | (1L << (IF_SYMBOL - 192)) | (1L << (FORMAT_SYMBOL - 192)) | (1L << (MICROSECOND_SYMBOL - 192)) | (1L << (OLD_PASSWORD_SYMBOL - 192)) | (1L << (PASSWORD_SYMBOL - 192)) | (1L << (REPEAT_SYMBOL - 192)) | (1L << (REPLACE_SYMBOL - 192)) | (1L << (REVERSE_SYMBOL - 192)) | (1L << (ROW_COUNT_SYMBOL - 192)) | (1L << (TRUNCATE_SYMBOL - 192)) | (1L << (WEIGHT_STRING_SYMBOL - 192)) | (1L << (CONTAINS_SYMBOL - 192)) | (1L << (GEOMETRYCOLLECTION_SYMBOL - 192)) | (1L << (LINESTRING_SYMBOL - 192)) | (1L << (MULTILINESTRING_SYMBOL - 192)) | (1L << (MULTIPOINT_SYMBOL - 192)) | (1L << (MULTIPOLYGON_SYMBOL - 192)) | (1L << (POINT_SYMBOL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (POLYGON_SYMBOL - 256)) | (1L << (LEVEL_SYMBOL - 256)) | (1L << (DATETIME_SYMBOL - 256)) | (1L << (TRIM_SYMBOL - 256)) | (1L << (LEADING_SYMBOL - 256)) | (1L << (TRAILING_SYMBOL - 256)) | (1L << (BOTH_SYMBOL - 256)) | (1L << (SUBSTRING_SYMBOL - 256)) | (1L << (WHEN_SYMBOL - 256)) | (1L << (THEN_SYMBOL - 256)) | (1L << (ELSE_SYMBOL - 256)) | (1L << (SIGNED_SYMBOL - 256)) | (1L << (UNSIGNED_SYMBOL - 256)) | (1L << (DECIMAL_SYMBOL - 256)) | (1L << (JSON_SYMBOL - 256)) | (1L << (FLOAT_SYMBOL - 256)) | (1L << (SET_SYMBOL - 256)) | (1L << (SECOND_MICROSECOND_SYMBOL - 256)) | (1L << (MINUTE_MICROSECOND_SYMBOL - 256)) | (1L << (MINUTE_SECOND_SYMBOL - 256)) | (1L << (HOUR_MICROSECOND_SYMBOL - 256)) | (1L << (HOUR_SECOND_SYMBOL - 256)) | (1L << (HOUR_MINUTE_SYMBOL - 256)) | (1L << (DAY_MICROSECOND_SYMBOL - 256)) | (1L << (DAY_SECOND_SYMBOL - 256)) | (1L << (DAY_MINUTE_SYMBOL - 256)) | (1L << (DAY_HOUR_SYMBOL - 256)) | (1L << (YEAR_MONTH_SYMBOL - 256)) | (1L << (BTREE_SYMBOL - 256)) | (1L << (RTREE_SYMBOL - 256)) | (1L << (HASH_SYMBOL - 256)) | (1L << (REAL_SYMBOL - 256)) | (1L << (DOUBLE_SYMBOL - 256)) | (1L << (PRECISION_SYMBOL - 256)) | (1L << (NUMERIC_SYMBOL - 256)) | (1L << (FIXED_SYMBOL - 256)) | (1L << (BIT_SYMBOL - 256)) | (1L << (BOOL_SYMBOL - 256)) | (1L << (VARYING_SYMBOL - 256)) | (1L << (VARCHAR_SYMBOL - 256)) | (1L << (NATIONAL_SYMBOL - 256)) | (1L << (NVARCHAR_SYMBOL - 256)) | (1L << (NCHAR_SYMBOL - 256)) | (1L << (VARBINARY_SYMBOL - 256)) | (1L << (TINYBLOB_SYMBOL - 256)) | (1L << (BLOB_SYMBOL - 256)) | (1L << (MEDIUMBLOB_SYMBOL - 256)) | (1L << (LONGBLOB_SYMBOL - 256)) | (1L << (LONG_SYMBOL - 256)) | (1L << (TINYTEXT_SYMBOL - 256)) | (1L << (TEXT_SYMBOL - 256)) | (1L << (MEDIUMTEXT_SYMBOL - 256)) | (1L << (LONGTEXT_SYMBOL - 256)) | (1L << (ENUM_SYMBOL - 256)) | (1L << (SERIAL_SYMBOL - 256)) | (1L << (GEOMETRY_SYMBOL - 256)) | (1L << (ZEROFILL_SYMBOL - 256)) | (1L << (BYTE_SYMBOL - 256)) | (1L << (UNICODE_SYMBOL - 256)) | (1L << (TERMINATED_SYMBOL - 256)) | (1L << (OPTIONALLY_SYMBOL - 256)) | (1L << (ENCLOSED_SYMBOL - 256)) | (1L << (ESCAPED_SYMBOL - 256)) | (1L << (LINES_SYMBOL - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (STARTING_SYMBOL - 320)) | (1L << (GLOBAL_SYMBOL - 320)) | (1L << (LOCAL_SYMBOL - 320)) | (1L << (SESSION_SYMBOL - 320)) | (1L << (UNDERSCORE_CHARSET - 320)) | (1L << (IDENTIFIER - 320)) | (1L << (NCHAR_TEXT - 320)) | (1L << (BACK_TICK_QUOTED_ID - 320)) | (1L << (DOUBLE_QUOTED_TEXT - 320)) | (1L << (SINGLE_QUOTED_TEXT - 320)) | (1L << (BRACKET_QUOTED_TEXT - 320)))) != 0)) {
					{
					setState(1779);
					exprList();
					}
				}

				setState(1782);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case LINESTRING_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1783);
				((GeometryFunctionContext)_localctx).name = match(LINESTRING_SYMBOL);
				setState(1784);
				exprListWithParentheses();
				}
				break;
			case MULTILINESTRING_SYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1785);
				((GeometryFunctionContext)_localctx).name = match(MULTILINESTRING_SYMBOL);
				setState(1786);
				exprListWithParentheses();
				}
				break;
			case MULTIPOINT_SYMBOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1787);
				((GeometryFunctionContext)_localctx).name = match(MULTIPOINT_SYMBOL);
				setState(1788);
				exprListWithParentheses();
				}
				break;
			case MULTIPOLYGON_SYMBOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1789);
				((GeometryFunctionContext)_localctx).name = match(MULTIPOLYGON_SYMBOL);
				setState(1790);
				exprListWithParentheses();
				}
				break;
			case POINT_SYMBOL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1791);
				((GeometryFunctionContext)_localctx).name = match(POINT_SYMBOL);
				setState(1792);
				match(OPEN_PAR_SYMBOL);
				setState(1793);
				expr(0);
				setState(1794);
				match(COMMA_SYMBOL);
				setState(1795);
				expr(0);
				setState(1796);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case POLYGON_SYMBOL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1798);
				((GeometryFunctionContext)_localctx).name = match(POLYGON_SYMBOL);
				setState(1799);
				exprListWithParentheses();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeFunctionParametersContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public FractionalPrecisionContext fractionalPrecision() {
			return getRuleContext(FractionalPrecisionContext.class,0);
		}
		public TimeFunctionParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeFunctionParameters; }
	}

	public final TimeFunctionParametersContext timeFunctionParameters() throws RecognitionException {
		TimeFunctionParametersContext _localctx = new TimeFunctionParametersContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_timeFunctionParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			match(OPEN_PAR_SYMBOL);
			setState(1804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_NUMBER) {
				{
				setState(1803);
				fractionalPrecision();
				}
			}

			setState(1806);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FractionalPrecisionContext extends ParserRuleContext {
		public TerminalNode INT_NUMBER() { return getToken(SQLSelectParser.INT_NUMBER, 0); }
		public FractionalPrecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fractionalPrecision; }
	}

	public final FractionalPrecisionContext fractionalPrecision() throws RecognitionException {
		FractionalPrecisionContext _localctx = new FractionalPrecisionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_fractionalPrecision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1808);
			match(INT_NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WeightStringLevelsContext extends ParserRuleContext {
		public TerminalNode LEVEL_SYMBOL() { return getToken(SQLSelectParser.LEVEL_SYMBOL, 0); }
		public List<Real_ulong_numberContext> real_ulong_number() {
			return getRuleContexts(Real_ulong_numberContext.class);
		}
		public Real_ulong_numberContext real_ulong_number(int i) {
			return getRuleContext(Real_ulong_numberContext.class,i);
		}
		public TerminalNode MINUS_OPERATOR() { return getToken(SQLSelectParser.MINUS_OPERATOR, 0); }
		public List<WeightStringLevelListItemContext> weightStringLevelListItem() {
			return getRuleContexts(WeightStringLevelListItemContext.class);
		}
		public WeightStringLevelListItemContext weightStringLevelListItem(int i) {
			return getRuleContext(WeightStringLevelListItemContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public WeightStringLevelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weightStringLevels; }
	}

	public final WeightStringLevelsContext weightStringLevels() throws RecognitionException {
		WeightStringLevelsContext _localctx = new WeightStringLevelsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_weightStringLevels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
			match(LEVEL_SYMBOL);
			setState(1823);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1811);
				real_ulong_number();
				setState(1812);
				match(MINUS_OPERATOR);
				setState(1813);
				real_ulong_number();
				}
				break;
			case 2:
				{
				setState(1815);
				weightStringLevelListItem();
				setState(1820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_SYMBOL) {
					{
					{
					setState(1816);
					match(COMMA_SYMBOL);
					setState(1817);
					weightStringLevelListItem();
					}
					}
					setState(1822);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WeightStringLevelListItemContext extends ParserRuleContext {
		public Real_ulong_numberContext real_ulong_number() {
			return getRuleContext(Real_ulong_numberContext.class,0);
		}
		public TerminalNode REVERSE_SYMBOL() { return getToken(SQLSelectParser.REVERSE_SYMBOL, 0); }
		public TerminalNode ASC_SYMBOL() { return getToken(SQLSelectParser.ASC_SYMBOL, 0); }
		public TerminalNode DESC_SYMBOL() { return getToken(SQLSelectParser.DESC_SYMBOL, 0); }
		public WeightStringLevelListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weightStringLevelListItem; }
	}

	public final WeightStringLevelListItemContext weightStringLevelListItem() throws RecognitionException {
		WeightStringLevelListItemContext _localctx = new WeightStringLevelListItemContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_weightStringLevelListItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			real_ulong_number();
			setState(1831);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASC_SYMBOL:
			case DESC_SYMBOL:
				{
				setState(1826);
				_la = _input.LA(1);
				if ( !(_la==ASC_SYMBOL || _la==DESC_SYMBOL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1828);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==REVERSE_SYMBOL) {
					{
					setState(1827);
					match(REVERSE_SYMBOL);
					}
				}

				}
				break;
			case REVERSE_SYMBOL:
				{
				setState(1830);
				match(REVERSE_SYMBOL);
				}
				break;
			case COMMA_SYMBOL:
			case CLOSE_PAR_SYMBOL:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateTimeTtypeContext extends ParserRuleContext {
		public TerminalNode DATE_SYMBOL() { return getToken(SQLSelectParser.DATE_SYMBOL, 0); }
		public TerminalNode TIME_SYMBOL() { return getToken(SQLSelectParser.TIME_SYMBOL, 0); }
		public TerminalNode DATETIME_SYMBOL() { return getToken(SQLSelectParser.DATETIME_SYMBOL, 0); }
		public TerminalNode TIMESTAMP_SYMBOL() { return getToken(SQLSelectParser.TIMESTAMP_SYMBOL, 0); }
		public DateTimeTtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateTimeTtype; }
	}

	public final DateTimeTtypeContext dateTimeTtype() throws RecognitionException {
		DateTimeTtypeContext _localctx = new DateTimeTtypeContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_dateTimeTtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833);
			_la = _input.LA(1);
			if ( !(((((_la - 212)) & ~0x3f) == 0 && ((1L << (_la - 212)) & ((1L << (DATE_SYMBOL - 212)) | (1L << (TIME_SYMBOL - 212)) | (1L << (TIMESTAMP_SYMBOL - 212)) | (1L << (DATETIME_SYMBOL - 212)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrimFunctionContext extends ParserRuleContext {
		public TerminalNode TRIM_SYMBOL() { return getToken(SQLSelectParser.TRIM_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LEADING_SYMBOL() { return getToken(SQLSelectParser.LEADING_SYMBOL, 0); }
		public TerminalNode FROM_SYMBOL() { return getToken(SQLSelectParser.FROM_SYMBOL, 0); }
		public TerminalNode TRAILING_SYMBOL() { return getToken(SQLSelectParser.TRAILING_SYMBOL, 0); }
		public TerminalNode BOTH_SYMBOL() { return getToken(SQLSelectParser.BOTH_SYMBOL, 0); }
		public TrimFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trimFunction; }
	}

	public final TrimFunctionContext trimFunction() throws RecognitionException {
		TrimFunctionContext _localctx = new TrimFunctionContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_trimFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1835);
			match(TRIM_SYMBOL);
			setState(1836);
			match(OPEN_PAR_SYMBOL);
			setState(1860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1837);
				expr(0);
				setState(1840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM_SYMBOL) {
					{
					setState(1838);
					match(FROM_SYMBOL);
					setState(1839);
					expr(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(1842);
				match(LEADING_SYMBOL);
				setState(1844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1843);
					expr(0);
					}
					break;
				}
				setState(1846);
				match(FROM_SYMBOL);
				setState(1847);
				expr(0);
				}
				break;
			case 3:
				{
				setState(1848);
				match(TRAILING_SYMBOL);
				setState(1850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1849);
					expr(0);
					}
					break;
				}
				setState(1852);
				match(FROM_SYMBOL);
				setState(1853);
				expr(0);
				}
				break;
			case 4:
				{
				setState(1854);
				match(BOTH_SYMBOL);
				setState(1856);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1855);
					expr(0);
					}
					break;
				}
				setState(1858);
				match(FROM_SYMBOL);
				setState(1859);
				expr(0);
				}
				break;
			}
			setState(1862);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubstringFunctionContext extends ParserRuleContext {
		public TerminalNode SUBSTRING_SYMBOL() { return getToken(SQLSelectParser.SUBSTRING_SYMBOL, 0); }
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public TerminalNode FROM_SYMBOL() { return getToken(SQLSelectParser.FROM_SYMBOL, 0); }
		public TerminalNode FOR_SYMBOL() { return getToken(SQLSelectParser.FOR_SYMBOL, 0); }
		public SubstringFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substringFunction; }
	}

	public final SubstringFunctionContext substringFunction() throws RecognitionException {
		SubstringFunctionContext _localctx = new SubstringFunctionContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_substringFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1864);
			match(SUBSTRING_SYMBOL);
			setState(1865);
			match(OPEN_PAR_SYMBOL);
			setState(1866);
			expr(0);
			setState(1879);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA_SYMBOL:
				{
				setState(1867);
				match(COMMA_SYMBOL);
				setState(1868);
				expr(0);
				setState(1871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_SYMBOL) {
					{
					setState(1869);
					match(COMMA_SYMBOL);
					setState(1870);
					expr(0);
					}
				}

				}
				break;
			case FROM_SYMBOL:
				{
				setState(1873);
				match(FROM_SYMBOL);
				setState(1874);
				expr(0);
				setState(1877);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR_SYMBOL) {
					{
					setState(1875);
					match(FOR_SYMBOL);
					setState(1876);
					expr(0);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1881);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public PureIdentifierContext pureIdentifier() {
			return getRuleContext(PureIdentifierContext.class,0);
		}
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public UdfExprListContext udfExprList() {
			return getRuleContext(UdfExprListContext.class,0);
		}
		public QualifiedIdentifierContext qualifiedIdentifier() {
			return getRuleContext(QualifiedIdentifierContext.class,0);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_functionCall);
		int _la;
		try {
			setState(1897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1883);
				pureIdentifier();
				setState(1884);
				match(OPEN_PAR_SYMBOL);
				setState(1886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_OPERATOR) | (1L << MINUS_OPERATOR) | (1L << LOGICAL_NOT_OPERATOR) | (1L << BITWISE_NOT_OPERATOR) | (1L << OPEN_PAR_SYMBOL) | (1L << OPEN_CURLY_SYMBOL) | (1L << AT_SIGN_SYMBOL) | (1L << AT_TEXT_SUFFIX) | (1L << AT_AT_SIGN_SYMBOL) | (1L << NULL2_SYMBOL) | (1L << PARAM_MARKER) | (1L << HEX_NUMBER) | (1L << BIN_NUMBER) | (1L << INT_NUMBER) | (1L << DECIMAL_NUMBER) | (1L << FLOAT_NUMBER) | (1L << TINYINT_SYMBOL) | (1L << SMALLINT_SYMBOL) | (1L << MEDIUMINT_SYMBOL) | (1L << INT_SYMBOL) | (1L << BIGINT_SYMBOL) | (1L << SECOND_SYMBOL) | (1L << MINUTE_SYMBOL) | (1L << HOUR_SYMBOL) | (1L << DAY_SYMBOL) | (1L << WEEK_SYMBOL) | (1L << MONTH_SYMBOL) | (1L << QUARTER_SYMBOL) | (1L << YEAR_SYMBOL) | (1L << DEFAULT_SYMBOL) | (1L << UNION_SYMBOL) | (1L << SELECT_SYMBOL) | (1L << ALL_SYMBOL) | (1L << DISTINCT_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRAIGHT_JOIN_SYMBOL - 64)) | (1L << (HIGH_PRIORITY_SYMBOL - 64)) | (1L << (SQL_SMALL_RESULT_SYMBOL - 64)) | (1L << (SQL_BIG_RESULT_SYMBOL - 64)) | (1L << (SQL_BUFFER_RESULT_SYMBOL - 64)) | (1L << (SQL_CALC_FOUND_ROWS_SYMBOL - 64)) | (1L << (LIMIT_SYMBOL - 64)) | (1L << (OFFSET_SYMBOL - 64)) | (1L << (INTO_SYMBOL - 64)) | (1L << (OUTFILE_SYMBOL - 64)) | (1L << (DUMPFILE_SYMBOL - 64)) | (1L << (PROCEDURE_SYMBOL - 64)) | (1L << (ANALYSE_SYMBOL - 64)) | (1L << (HAVING_SYMBOL - 64)) | (1L << (WINDOW_SYMBOL - 64)) | (1L << (AS_SYMBOL - 64)) | (1L << (PARTITION_SYMBOL - 64)) | (1L << (BY_SYMBOL - 64)) | (1L << (ROWS_SYMBOL - 64)) | (1L << (RANGE_SYMBOL - 64)) | (1L << (GROUPS_SYMBOL - 64)) | (1L << (UNBOUNDED_SYMBOL - 64)) | (1L << (PRECEDING_SYMBOL - 64)) | (1L << (INTERVAL_SYMBOL - 64)) | (1L << (CURRENT_SYMBOL - 64)) | (1L << (ROW_SYMBOL - 64)) | (1L << (BETWEEN_SYMBOL - 64)) | (1L << (AND_SYMBOL - 64)) | (1L << (FOLLOWING_SYMBOL - 64)) | (1L << (EXCLUDE_SYMBOL - 64)) | (1L << (GROUP_SYMBOL - 64)) | (1L << (TIES_SYMBOL - 64)) | (1L << (NO_SYMBOL - 64)) | (1L << (OTHERS_SYMBOL - 64)) | (1L << (WITH_SYMBOL - 64)) | (1L << (RECURSIVE_SYMBOL - 64)) | (1L << (ROLLUP_SYMBOL - 64)) | (1L << (CUBE_SYMBOL - 64)) | (1L << (ORDER_SYMBOL - 64)) | (1L << (ASC_SYMBOL - 64)) | (1L << (DESC_SYMBOL - 64)) | (1L << (FROM_SYMBOL - 64)) | (1L << (DUAL_SYMBOL - 64)) | (1L << (VALUES_SYMBOL - 64)) | (1L << (TABLE_SYMBOL - 64)) | (1L << (SQL_NO_CACHE_SYMBOL - 64)) | (1L << (SQL_CACHE_SYMBOL - 64)) | (1L << (MAX_STATEMENT_TIME_SYMBOL - 64)) | (1L << (FOR_SYMBOL - 64)) | (1L << (OF_SYMBOL - 64)) | (1L << (LOCK_SYMBOL - 64)) | (1L << (IN_SYMBOL - 64)) | (1L << (SHARE_SYMBOL - 64)) | (1L << (MODE_SYMBOL - 64)) | (1L << (UPDATE_SYMBOL - 64)) | (1L << (SKIP_SYMBOL - 64)) | (1L << (LOCKED_SYMBOL - 64)) | (1L << (NOWAIT_SYMBOL - 64)) | (1L << (WHERE_SYMBOL - 64)) | (1L << (OJ_SYMBOL - 64)) | (1L << (ON_SYMBOL - 64)) | (1L << (USING_SYMBOL - 64)) | (1L << (NATURAL_SYMBOL - 64)) | (1L << (INNER_SYMBOL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (JOIN_SYMBOL - 128)) | (1L << (LEFT_SYMBOL - 128)) | (1L << (RIGHT_SYMBOL - 128)) | (1L << (OUTER_SYMBOL - 128)) | (1L << (CROSS_SYMBOL - 128)) | (1L << (LATERAL_SYMBOL - 128)) | (1L << (JSON_TABLE_SYMBOL - 128)) | (1L << (COLUMNS_SYMBOL - 128)) | (1L << (ORDINALITY_SYMBOL - 128)) | (1L << (EXISTS_SYMBOL - 128)) | (1L << (PATH_SYMBOL - 128)) | (1L << (NESTED_SYMBOL - 128)) | (1L << (EMPTY_SYMBOL - 128)) | (1L << (ERROR_SYMBOL - 128)) | (1L << (NULL_SYMBOL - 128)) | (1L << (USE_SYMBOL - 128)) | (1L << (FORCE_SYMBOL - 128)) | (1L << (IGNORE_SYMBOL - 128)) | (1L << (KEY_SYMBOL - 128)) | (1L << (INDEX_SYMBOL - 128)) | (1L << (PRIMARY_SYMBOL - 128)) | (1L << (IS_SYMBOL - 128)) | (1L << (TRUE_SYMBOL - 128)) | (1L << (FALSE_SYMBOL - 128)) | (1L << (UNKNOWN_SYMBOL - 128)) | (1L << (NOT_SYMBOL - 128)) | (1L << (XOR_SYMBOL - 128)) | (1L << (OR_SYMBOL - 128)) | (1L << (ANY_SYMBOL - 128)) | (1L << (MEMBER_SYMBOL - 128)) | (1L << (SOUNDS_SYMBOL - 128)) | (1L << (LIKE_SYMBOL - 128)) | (1L << (ESCAPE_SYMBOL - 128)) | (1L << (REGEXP_SYMBOL - 128)) | (1L << (DIV_SYMBOL - 128)) | (1L << (MOD_SYMBOL - 128)) | (1L << (MATCH_SYMBOL - 128)) | (1L << (AGAINST_SYMBOL - 128)) | (1L << (BINARY_SYMBOL - 128)) | (1L << (CAST_SYMBOL - 128)) | (1L << (ARRAY_SYMBOL - 128)) | (1L << (CASE_SYMBOL - 128)) | (1L << (END_SYMBOL - 128)) | (1L << (CONVERT_SYMBOL - 128)) | (1L << (COLLATE_SYMBOL - 128)) | (1L << (AVG_SYMBOL - 128)) | (1L << (BIT_AND_SYMBOL - 128)) | (1L << (BIT_OR_SYMBOL - 128)) | (1L << (BIT_XOR_SYMBOL - 128)) | (1L << (COUNT_SYMBOL - 128)) | (1L << (MIN_SYMBOL - 128)) | (1L << (MAX_SYMBOL - 128)) | (1L << (STD_SYMBOL - 128)) | (1L << (VARIANCE_SYMBOL - 128)) | (1L << (STDDEV_SAMP_SYMBOL - 128)) | (1L << (VAR_SAMP_SYMBOL - 128)) | (1L << (SUM_SYMBOL - 128)) | (1L << (GROUP_CONCAT_SYMBOL - 128)) | (1L << (SEPARATOR_SYMBOL - 128)) | (1L << (GROUPING_SYMBOL - 128)) | (1L << (ROW_NUMBER_SYMBOL - 128)) | (1L << (RANK_SYMBOL - 128)) | (1L << (DENSE_RANK_SYMBOL - 128)) | (1L << (CUME_DIST_SYMBOL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (PERCENT_RANK_SYMBOL - 192)) | (1L << (NTILE_SYMBOL - 192)) | (1L << (LEAD_SYMBOL - 192)) | (1L << (LAG_SYMBOL - 192)) | (1L << (FIRST_VALUE_SYMBOL - 192)) | (1L << (LAST_VALUE_SYMBOL - 192)) | (1L << (NTH_VALUE_SYMBOL - 192)) | (1L << (FIRST_SYMBOL - 192)) | (1L << (LAST_SYMBOL - 192)) | (1L << (OVER_SYMBOL - 192)) | (1L << (RESPECT_SYMBOL - 192)) | (1L << (NULLS_SYMBOL - 192)) | (1L << (JSON_ARRAYAGG_SYMBOL - 192)) | (1L << (JSON_OBJECTAGG_SYMBOL - 192)) | (1L << (BOOLEAN_SYMBOL - 192)) | (1L << (LANGUAGE_SYMBOL - 192)) | (1L << (QUERY_SYMBOL - 192)) | (1L << (EXPANSION_SYMBOL - 192)) | (1L << (CHAR_SYMBOL - 192)) | (1L << (CURRENT_USER_SYMBOL - 192)) | (1L << (DATE_SYMBOL - 192)) | (1L << (INSERT_SYMBOL - 192)) | (1L << (TIME_SYMBOL - 192)) | (1L << (TIMESTAMP_SYMBOL - 192)) | (1L << (USER_SYMBOL - 192)) | (1L << (ADDDATE_SYMBOL - 192)) | (1L << (SUBDATE_SYMBOL - 192)) | (1L << (CURDATE_SYMBOL - 192)) | (1L << (CURTIME_SYMBOL - 192)) | (1L << (DATE_ADD_SYMBOL - 192)) | (1L << (DATE_SUB_SYMBOL - 192)) | (1L << (EXTRACT_SYMBOL - 192)) | (1L << (GET_FORMAT_SYMBOL - 192)) | (1L << (NOW_SYMBOL - 192)) | (1L << (POSITION_SYMBOL - 192)) | (1L << (SYSDATE_SYMBOL - 192)) | (1L << (TIMESTAMP_ADD_SYMBOL - 192)) | (1L << (TIMESTAMP_DIFF_SYMBOL - 192)) | (1L << (UTC_DATE_SYMBOL - 192)) | (1L << (UTC_TIME_SYMBOL - 192)) | (1L << (UTC_TIMESTAMP_SYMBOL - 192)) | (1L << (ASCII_SYMBOL - 192)) | (1L << (CHARSET_SYMBOL - 192)) | (1L << (COALESCE_SYMBOL - 192)) | (1L << (COLLATION_SYMBOL - 192)) | (1L << (DATABASE_SYMBOL - 192)) | (1L << (IF_SYMBOL - 192)) | (1L << (FORMAT_SYMBOL - 192)) | (1L << (MICROSECOND_SYMBOL - 192)) | (1L << (OLD_PASSWORD_SYMBOL - 192)) | (1L << (PASSWORD_SYMBOL - 192)) | (1L << (REPEAT_SYMBOL - 192)) | (1L << (REPLACE_SYMBOL - 192)) | (1L << (REVERSE_SYMBOL - 192)) | (1L << (ROW_COUNT_SYMBOL - 192)) | (1L << (TRUNCATE_SYMBOL - 192)) | (1L << (WEIGHT_STRING_SYMBOL - 192)) | (1L << (CONTAINS_SYMBOL - 192)) | (1L << (GEOMETRYCOLLECTION_SYMBOL - 192)) | (1L << (LINESTRING_SYMBOL - 192)) | (1L << (MULTILINESTRING_SYMBOL - 192)) | (1L << (MULTIPOINT_SYMBOL - 192)) | (1L << (MULTIPOLYGON_SYMBOL - 192)) | (1L << (POINT_SYMBOL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (POLYGON_SYMBOL - 256)) | (1L << (LEVEL_SYMBOL - 256)) | (1L << (DATETIME_SYMBOL - 256)) | (1L << (TRIM_SYMBOL - 256)) | (1L << (LEADING_SYMBOL - 256)) | (1L << (TRAILING_SYMBOL - 256)) | (1L << (BOTH_SYMBOL - 256)) | (1L << (SUBSTRING_SYMBOL - 256)) | (1L << (WHEN_SYMBOL - 256)) | (1L << (THEN_SYMBOL - 256)) | (1L << (ELSE_SYMBOL - 256)) | (1L << (SIGNED_SYMBOL - 256)) | (1L << (UNSIGNED_SYMBOL - 256)) | (1L << (DECIMAL_SYMBOL - 256)) | (1L << (JSON_SYMBOL - 256)) | (1L << (FLOAT_SYMBOL - 256)) | (1L << (SET_SYMBOL - 256)) | (1L << (SECOND_MICROSECOND_SYMBOL - 256)) | (1L << (MINUTE_MICROSECOND_SYMBOL - 256)) | (1L << (MINUTE_SECOND_SYMBOL - 256)) | (1L << (HOUR_MICROSECOND_SYMBOL - 256)) | (1L << (HOUR_SECOND_SYMBOL - 256)) | (1L << (HOUR_MINUTE_SYMBOL - 256)) | (1L << (DAY_MICROSECOND_SYMBOL - 256)) | (1L << (DAY_SECOND_SYMBOL - 256)) | (1L << (DAY_MINUTE_SYMBOL - 256)) | (1L << (DAY_HOUR_SYMBOL - 256)) | (1L << (YEAR_MONTH_SYMBOL - 256)) | (1L << (BTREE_SYMBOL - 256)) | (1L << (RTREE_SYMBOL - 256)) | (1L << (HASH_SYMBOL - 256)) | (1L << (REAL_SYMBOL - 256)) | (1L << (DOUBLE_SYMBOL - 256)) | (1L << (PRECISION_SYMBOL - 256)) | (1L << (NUMERIC_SYMBOL - 256)) | (1L << (FIXED_SYMBOL - 256)) | (1L << (BIT_SYMBOL - 256)) | (1L << (BOOL_SYMBOL - 256)) | (1L << (VARYING_SYMBOL - 256)) | (1L << (VARCHAR_SYMBOL - 256)) | (1L << (NATIONAL_SYMBOL - 256)) | (1L << (NVARCHAR_SYMBOL - 256)) | (1L << (NCHAR_SYMBOL - 256)) | (1L << (VARBINARY_SYMBOL - 256)) | (1L << (TINYBLOB_SYMBOL - 256)) | (1L << (BLOB_SYMBOL - 256)) | (1L << (MEDIUMBLOB_SYMBOL - 256)) | (1L << (LONGBLOB_SYMBOL - 256)) | (1L << (LONG_SYMBOL - 256)) | (1L << (TINYTEXT_SYMBOL - 256)) | (1L << (TEXT_SYMBOL - 256)) | (1L << (MEDIUMTEXT_SYMBOL - 256)) | (1L << (LONGTEXT_SYMBOL - 256)) | (1L << (ENUM_SYMBOL - 256)) | (1L << (SERIAL_SYMBOL - 256)) | (1L << (GEOMETRY_SYMBOL - 256)) | (1L << (ZEROFILL_SYMBOL - 256)) | (1L << (BYTE_SYMBOL - 256)) | (1L << (UNICODE_SYMBOL - 256)) | (1L << (TERMINATED_SYMBOL - 256)) | (1L << (OPTIONALLY_SYMBOL - 256)) | (1L << (ENCLOSED_SYMBOL - 256)) | (1L << (ESCAPED_SYMBOL - 256)) | (1L << (LINES_SYMBOL - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (STARTING_SYMBOL - 320)) | (1L << (GLOBAL_SYMBOL - 320)) | (1L << (LOCAL_SYMBOL - 320)) | (1L << (SESSION_SYMBOL - 320)) | (1L << (UNDERSCORE_CHARSET - 320)) | (1L << (IDENTIFIER - 320)) | (1L << (NCHAR_TEXT - 320)) | (1L << (BACK_TICK_QUOTED_ID - 320)) | (1L << (DOUBLE_QUOTED_TEXT - 320)) | (1L << (SINGLE_QUOTED_TEXT - 320)) | (1L << (BRACKET_QUOTED_TEXT - 320)))) != 0)) {
					{
					setState(1885);
					udfExprList();
					}
				}

				setState(1888);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1890);
				qualifiedIdentifier();
				setState(1891);
				match(OPEN_PAR_SYMBOL);
				setState(1893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_OPERATOR) | (1L << MINUS_OPERATOR) | (1L << LOGICAL_NOT_OPERATOR) | (1L << BITWISE_NOT_OPERATOR) | (1L << OPEN_PAR_SYMBOL) | (1L << OPEN_CURLY_SYMBOL) | (1L << AT_SIGN_SYMBOL) | (1L << AT_TEXT_SUFFIX) | (1L << AT_AT_SIGN_SYMBOL) | (1L << NULL2_SYMBOL) | (1L << PARAM_MARKER) | (1L << HEX_NUMBER) | (1L << BIN_NUMBER) | (1L << INT_NUMBER) | (1L << DECIMAL_NUMBER) | (1L << FLOAT_NUMBER) | (1L << TINYINT_SYMBOL) | (1L << SMALLINT_SYMBOL) | (1L << MEDIUMINT_SYMBOL) | (1L << INT_SYMBOL) | (1L << BIGINT_SYMBOL) | (1L << SECOND_SYMBOL) | (1L << MINUTE_SYMBOL) | (1L << HOUR_SYMBOL) | (1L << DAY_SYMBOL) | (1L << WEEK_SYMBOL) | (1L << MONTH_SYMBOL) | (1L << QUARTER_SYMBOL) | (1L << YEAR_SYMBOL) | (1L << DEFAULT_SYMBOL) | (1L << UNION_SYMBOL) | (1L << SELECT_SYMBOL) | (1L << ALL_SYMBOL) | (1L << DISTINCT_SYMBOL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STRAIGHT_JOIN_SYMBOL - 64)) | (1L << (HIGH_PRIORITY_SYMBOL - 64)) | (1L << (SQL_SMALL_RESULT_SYMBOL - 64)) | (1L << (SQL_BIG_RESULT_SYMBOL - 64)) | (1L << (SQL_BUFFER_RESULT_SYMBOL - 64)) | (1L << (SQL_CALC_FOUND_ROWS_SYMBOL - 64)) | (1L << (LIMIT_SYMBOL - 64)) | (1L << (OFFSET_SYMBOL - 64)) | (1L << (INTO_SYMBOL - 64)) | (1L << (OUTFILE_SYMBOL - 64)) | (1L << (DUMPFILE_SYMBOL - 64)) | (1L << (PROCEDURE_SYMBOL - 64)) | (1L << (ANALYSE_SYMBOL - 64)) | (1L << (HAVING_SYMBOL - 64)) | (1L << (WINDOW_SYMBOL - 64)) | (1L << (AS_SYMBOL - 64)) | (1L << (PARTITION_SYMBOL - 64)) | (1L << (BY_SYMBOL - 64)) | (1L << (ROWS_SYMBOL - 64)) | (1L << (RANGE_SYMBOL - 64)) | (1L << (GROUPS_SYMBOL - 64)) | (1L << (UNBOUNDED_SYMBOL - 64)) | (1L << (PRECEDING_SYMBOL - 64)) | (1L << (INTERVAL_SYMBOL - 64)) | (1L << (CURRENT_SYMBOL - 64)) | (1L << (ROW_SYMBOL - 64)) | (1L << (BETWEEN_SYMBOL - 64)) | (1L << (AND_SYMBOL - 64)) | (1L << (FOLLOWING_SYMBOL - 64)) | (1L << (EXCLUDE_SYMBOL - 64)) | (1L << (GROUP_SYMBOL - 64)) | (1L << (TIES_SYMBOL - 64)) | (1L << (NO_SYMBOL - 64)) | (1L << (OTHERS_SYMBOL - 64)) | (1L << (WITH_SYMBOL - 64)) | (1L << (RECURSIVE_SYMBOL - 64)) | (1L << (ROLLUP_SYMBOL - 64)) | (1L << (CUBE_SYMBOL - 64)) | (1L << (ORDER_SYMBOL - 64)) | (1L << (ASC_SYMBOL - 64)) | (1L << (DESC_SYMBOL - 64)) | (1L << (FROM_SYMBOL - 64)) | (1L << (DUAL_SYMBOL - 64)) | (1L << (VALUES_SYMBOL - 64)) | (1L << (TABLE_SYMBOL - 64)) | (1L << (SQL_NO_CACHE_SYMBOL - 64)) | (1L << (SQL_CACHE_SYMBOL - 64)) | (1L << (MAX_STATEMENT_TIME_SYMBOL - 64)) | (1L << (FOR_SYMBOL - 64)) | (1L << (OF_SYMBOL - 64)) | (1L << (LOCK_SYMBOL - 64)) | (1L << (IN_SYMBOL - 64)) | (1L << (SHARE_SYMBOL - 64)) | (1L << (MODE_SYMBOL - 64)) | (1L << (UPDATE_SYMBOL - 64)) | (1L << (SKIP_SYMBOL - 64)) | (1L << (LOCKED_SYMBOL - 64)) | (1L << (NOWAIT_SYMBOL - 64)) | (1L << (WHERE_SYMBOL - 64)) | (1L << (OJ_SYMBOL - 64)) | (1L << (ON_SYMBOL - 64)) | (1L << (USING_SYMBOL - 64)) | (1L << (NATURAL_SYMBOL - 64)) | (1L << (INNER_SYMBOL - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (JOIN_SYMBOL - 128)) | (1L << (LEFT_SYMBOL - 128)) | (1L << (RIGHT_SYMBOL - 128)) | (1L << (OUTER_SYMBOL - 128)) | (1L << (CROSS_SYMBOL - 128)) | (1L << (LATERAL_SYMBOL - 128)) | (1L << (JSON_TABLE_SYMBOL - 128)) | (1L << (COLUMNS_SYMBOL - 128)) | (1L << (ORDINALITY_SYMBOL - 128)) | (1L << (EXISTS_SYMBOL - 128)) | (1L << (PATH_SYMBOL - 128)) | (1L << (NESTED_SYMBOL - 128)) | (1L << (EMPTY_SYMBOL - 128)) | (1L << (ERROR_SYMBOL - 128)) | (1L << (NULL_SYMBOL - 128)) | (1L << (USE_SYMBOL - 128)) | (1L << (FORCE_SYMBOL - 128)) | (1L << (IGNORE_SYMBOL - 128)) | (1L << (KEY_SYMBOL - 128)) | (1L << (INDEX_SYMBOL - 128)) | (1L << (PRIMARY_SYMBOL - 128)) | (1L << (IS_SYMBOL - 128)) | (1L << (TRUE_SYMBOL - 128)) | (1L << (FALSE_SYMBOL - 128)) | (1L << (UNKNOWN_SYMBOL - 128)) | (1L << (NOT_SYMBOL - 128)) | (1L << (XOR_SYMBOL - 128)) | (1L << (OR_SYMBOL - 128)) | (1L << (ANY_SYMBOL - 128)) | (1L << (MEMBER_SYMBOL - 128)) | (1L << (SOUNDS_SYMBOL - 128)) | (1L << (LIKE_SYMBOL - 128)) | (1L << (ESCAPE_SYMBOL - 128)) | (1L << (REGEXP_SYMBOL - 128)) | (1L << (DIV_SYMBOL - 128)) | (1L << (MOD_SYMBOL - 128)) | (1L << (MATCH_SYMBOL - 128)) | (1L << (AGAINST_SYMBOL - 128)) | (1L << (BINARY_SYMBOL - 128)) | (1L << (CAST_SYMBOL - 128)) | (1L << (ARRAY_SYMBOL - 128)) | (1L << (CASE_SYMBOL - 128)) | (1L << (END_SYMBOL - 128)) | (1L << (CONVERT_SYMBOL - 128)) | (1L << (COLLATE_SYMBOL - 128)) | (1L << (AVG_SYMBOL - 128)) | (1L << (BIT_AND_SYMBOL - 128)) | (1L << (BIT_OR_SYMBOL - 128)) | (1L << (BIT_XOR_SYMBOL - 128)) | (1L << (COUNT_SYMBOL - 128)) | (1L << (MIN_SYMBOL - 128)) | (1L << (MAX_SYMBOL - 128)) | (1L << (STD_SYMBOL - 128)) | (1L << (VARIANCE_SYMBOL - 128)) | (1L << (STDDEV_SAMP_SYMBOL - 128)) | (1L << (VAR_SAMP_SYMBOL - 128)) | (1L << (SUM_SYMBOL - 128)) | (1L << (GROUP_CONCAT_SYMBOL - 128)) | (1L << (SEPARATOR_SYMBOL - 128)) | (1L << (GROUPING_SYMBOL - 128)) | (1L << (ROW_NUMBER_SYMBOL - 128)) | (1L << (RANK_SYMBOL - 128)) | (1L << (DENSE_RANK_SYMBOL - 128)) | (1L << (CUME_DIST_SYMBOL - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (PERCENT_RANK_SYMBOL - 192)) | (1L << (NTILE_SYMBOL - 192)) | (1L << (LEAD_SYMBOL - 192)) | (1L << (LAG_SYMBOL - 192)) | (1L << (FIRST_VALUE_SYMBOL - 192)) | (1L << (LAST_VALUE_SYMBOL - 192)) | (1L << (NTH_VALUE_SYMBOL - 192)) | (1L << (FIRST_SYMBOL - 192)) | (1L << (LAST_SYMBOL - 192)) | (1L << (OVER_SYMBOL - 192)) | (1L << (RESPECT_SYMBOL - 192)) | (1L << (NULLS_SYMBOL - 192)) | (1L << (JSON_ARRAYAGG_SYMBOL - 192)) | (1L << (JSON_OBJECTAGG_SYMBOL - 192)) | (1L << (BOOLEAN_SYMBOL - 192)) | (1L << (LANGUAGE_SYMBOL - 192)) | (1L << (QUERY_SYMBOL - 192)) | (1L << (EXPANSION_SYMBOL - 192)) | (1L << (CHAR_SYMBOL - 192)) | (1L << (CURRENT_USER_SYMBOL - 192)) | (1L << (DATE_SYMBOL - 192)) | (1L << (INSERT_SYMBOL - 192)) | (1L << (TIME_SYMBOL - 192)) | (1L << (TIMESTAMP_SYMBOL - 192)) | (1L << (USER_SYMBOL - 192)) | (1L << (ADDDATE_SYMBOL - 192)) | (1L << (SUBDATE_SYMBOL - 192)) | (1L << (CURDATE_SYMBOL - 192)) | (1L << (CURTIME_SYMBOL - 192)) | (1L << (DATE_ADD_SYMBOL - 192)) | (1L << (DATE_SUB_SYMBOL - 192)) | (1L << (EXTRACT_SYMBOL - 192)) | (1L << (GET_FORMAT_SYMBOL - 192)) | (1L << (NOW_SYMBOL - 192)) | (1L << (POSITION_SYMBOL - 192)) | (1L << (SYSDATE_SYMBOL - 192)) | (1L << (TIMESTAMP_ADD_SYMBOL - 192)) | (1L << (TIMESTAMP_DIFF_SYMBOL - 192)) | (1L << (UTC_DATE_SYMBOL - 192)) | (1L << (UTC_TIME_SYMBOL - 192)) | (1L << (UTC_TIMESTAMP_SYMBOL - 192)) | (1L << (ASCII_SYMBOL - 192)) | (1L << (CHARSET_SYMBOL - 192)) | (1L << (COALESCE_SYMBOL - 192)) | (1L << (COLLATION_SYMBOL - 192)) | (1L << (DATABASE_SYMBOL - 192)) | (1L << (IF_SYMBOL - 192)) | (1L << (FORMAT_SYMBOL - 192)) | (1L << (MICROSECOND_SYMBOL - 192)) | (1L << (OLD_PASSWORD_SYMBOL - 192)) | (1L << (PASSWORD_SYMBOL - 192)) | (1L << (REPEAT_SYMBOL - 192)) | (1L << (REPLACE_SYMBOL - 192)) | (1L << (REVERSE_SYMBOL - 192)) | (1L << (ROW_COUNT_SYMBOL - 192)) | (1L << (TRUNCATE_SYMBOL - 192)) | (1L << (WEIGHT_STRING_SYMBOL - 192)) | (1L << (CONTAINS_SYMBOL - 192)) | (1L << (GEOMETRYCOLLECTION_SYMBOL - 192)) | (1L << (LINESTRING_SYMBOL - 192)) | (1L << (MULTILINESTRING_SYMBOL - 192)) | (1L << (MULTIPOINT_SYMBOL - 192)) | (1L << (MULTIPOLYGON_SYMBOL - 192)) | (1L << (POINT_SYMBOL - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (POLYGON_SYMBOL - 256)) | (1L << (LEVEL_SYMBOL - 256)) | (1L << (DATETIME_SYMBOL - 256)) | (1L << (TRIM_SYMBOL - 256)) | (1L << (LEADING_SYMBOL - 256)) | (1L << (TRAILING_SYMBOL - 256)) | (1L << (BOTH_SYMBOL - 256)) | (1L << (SUBSTRING_SYMBOL - 256)) | (1L << (WHEN_SYMBOL - 256)) | (1L << (THEN_SYMBOL - 256)) | (1L << (ELSE_SYMBOL - 256)) | (1L << (SIGNED_SYMBOL - 256)) | (1L << (UNSIGNED_SYMBOL - 256)) | (1L << (DECIMAL_SYMBOL - 256)) | (1L << (JSON_SYMBOL - 256)) | (1L << (FLOAT_SYMBOL - 256)) | (1L << (SET_SYMBOL - 256)) | (1L << (SECOND_MICROSECOND_SYMBOL - 256)) | (1L << (MINUTE_MICROSECOND_SYMBOL - 256)) | (1L << (MINUTE_SECOND_SYMBOL - 256)) | (1L << (HOUR_MICROSECOND_SYMBOL - 256)) | (1L << (HOUR_SECOND_SYMBOL - 256)) | (1L << (HOUR_MINUTE_SYMBOL - 256)) | (1L << (DAY_MICROSECOND_SYMBOL - 256)) | (1L << (DAY_SECOND_SYMBOL - 256)) | (1L << (DAY_MINUTE_SYMBOL - 256)) | (1L << (DAY_HOUR_SYMBOL - 256)) | (1L << (YEAR_MONTH_SYMBOL - 256)) | (1L << (BTREE_SYMBOL - 256)) | (1L << (RTREE_SYMBOL - 256)) | (1L << (HASH_SYMBOL - 256)) | (1L << (REAL_SYMBOL - 256)) | (1L << (DOUBLE_SYMBOL - 256)) | (1L << (PRECISION_SYMBOL - 256)) | (1L << (NUMERIC_SYMBOL - 256)) | (1L << (FIXED_SYMBOL - 256)) | (1L << (BIT_SYMBOL - 256)) | (1L << (BOOL_SYMBOL - 256)) | (1L << (VARYING_SYMBOL - 256)) | (1L << (VARCHAR_SYMBOL - 256)) | (1L << (NATIONAL_SYMBOL - 256)) | (1L << (NVARCHAR_SYMBOL - 256)) | (1L << (NCHAR_SYMBOL - 256)) | (1L << (VARBINARY_SYMBOL - 256)) | (1L << (TINYBLOB_SYMBOL - 256)) | (1L << (BLOB_SYMBOL - 256)) | (1L << (MEDIUMBLOB_SYMBOL - 256)) | (1L << (LONGBLOB_SYMBOL - 256)) | (1L << (LONG_SYMBOL - 256)) | (1L << (TINYTEXT_SYMBOL - 256)) | (1L << (TEXT_SYMBOL - 256)) | (1L << (MEDIUMTEXT_SYMBOL - 256)) | (1L << (LONGTEXT_SYMBOL - 256)) | (1L << (ENUM_SYMBOL - 256)) | (1L << (SERIAL_SYMBOL - 256)) | (1L << (GEOMETRY_SYMBOL - 256)) | (1L << (ZEROFILL_SYMBOL - 256)) | (1L << (BYTE_SYMBOL - 256)) | (1L << (UNICODE_SYMBOL - 256)) | (1L << (TERMINATED_SYMBOL - 256)) | (1L << (OPTIONALLY_SYMBOL - 256)) | (1L << (ENCLOSED_SYMBOL - 256)) | (1L << (ESCAPED_SYMBOL - 256)) | (1L << (LINES_SYMBOL - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (STARTING_SYMBOL - 320)) | (1L << (GLOBAL_SYMBOL - 320)) | (1L << (LOCAL_SYMBOL - 320)) | (1L << (SESSION_SYMBOL - 320)) | (1L << (UNDERSCORE_CHARSET - 320)) | (1L << (IDENTIFIER - 320)) | (1L << (NCHAR_TEXT - 320)) | (1L << (BACK_TICK_QUOTED_ID - 320)) | (1L << (DOUBLE_QUOTED_TEXT - 320)) | (1L << (SINGLE_QUOTED_TEXT - 320)) | (1L << (BRACKET_QUOTED_TEXT - 320)))) != 0)) {
					{
					setState(1892);
					exprList();
					}
				}

				setState(1895);
				match(CLOSE_PAR_SYMBOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UdfExprListContext extends ParserRuleContext {
		public List<UdfExprContext> udfExpr() {
			return getRuleContexts(UdfExprContext.class);
		}
		public UdfExprContext udfExpr(int i) {
			return getRuleContext(UdfExprContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public UdfExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_udfExprList; }
	}

	public final UdfExprListContext udfExprList() throws RecognitionException {
		UdfExprListContext _localctx = new UdfExprListContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_udfExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1899);
			udfExpr();
			setState(1904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(1900);
				match(COMMA_SYMBOL);
				setState(1901);
				udfExpr();
				}
				}
				setState(1906);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UdfExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SelectAliasContext selectAlias() {
			return getRuleContext(SelectAliasContext.class,0);
		}
		public UdfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_udfExpr; }
	}

	public final UdfExprContext udfExpr() throws RecognitionException {
		UdfExprContext _localctx = new UdfExprContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_udfExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
			expr(0);
			setState(1909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (TINYINT_SYMBOL - 46)) | (1L << (SMALLINT_SYMBOL - 46)) | (1L << (MEDIUMINT_SYMBOL - 46)) | (1L << (INT_SYMBOL - 46)) | (1L << (BIGINT_SYMBOL - 46)) | (1L << (SECOND_SYMBOL - 46)) | (1L << (MINUTE_SYMBOL - 46)) | (1L << (HOUR_SYMBOL - 46)) | (1L << (DAY_SYMBOL - 46)) | (1L << (WEEK_SYMBOL - 46)) | (1L << (MONTH_SYMBOL - 46)) | (1L << (QUARTER_SYMBOL - 46)) | (1L << (YEAR_SYMBOL - 46)) | (1L << (DEFAULT_SYMBOL - 46)) | (1L << (UNION_SYMBOL - 46)) | (1L << (SELECT_SYMBOL - 46)) | (1L << (ALL_SYMBOL - 46)) | (1L << (DISTINCT_SYMBOL - 46)) | (1L << (STRAIGHT_JOIN_SYMBOL - 46)) | (1L << (HIGH_PRIORITY_SYMBOL - 46)) | (1L << (SQL_SMALL_RESULT_SYMBOL - 46)) | (1L << (SQL_BIG_RESULT_SYMBOL - 46)) | (1L << (SQL_BUFFER_RESULT_SYMBOL - 46)) | (1L << (SQL_CALC_FOUND_ROWS_SYMBOL - 46)) | (1L << (LIMIT_SYMBOL - 46)) | (1L << (OFFSET_SYMBOL - 46)) | (1L << (INTO_SYMBOL - 46)) | (1L << (OUTFILE_SYMBOL - 46)) | (1L << (DUMPFILE_SYMBOL - 46)) | (1L << (PROCEDURE_SYMBOL - 46)) | (1L << (ANALYSE_SYMBOL - 46)) | (1L << (HAVING_SYMBOL - 46)) | (1L << (WINDOW_SYMBOL - 46)) | (1L << (AS_SYMBOL - 46)) | (1L << (PARTITION_SYMBOL - 46)) | (1L << (BY_SYMBOL - 46)) | (1L << (ROWS_SYMBOL - 46)) | (1L << (RANGE_SYMBOL - 46)) | (1L << (GROUPS_SYMBOL - 46)) | (1L << (UNBOUNDED_SYMBOL - 46)) | (1L << (PRECEDING_SYMBOL - 46)) | (1L << (INTERVAL_SYMBOL - 46)) | (1L << (CURRENT_SYMBOL - 46)) | (1L << (ROW_SYMBOL - 46)) | (1L << (BETWEEN_SYMBOL - 46)) | (1L << (AND_SYMBOL - 46)) | (1L << (FOLLOWING_SYMBOL - 46)) | (1L << (EXCLUDE_SYMBOL - 46)) | (1L << (GROUP_SYMBOL - 46)) | (1L << (TIES_SYMBOL - 46)) | (1L << (NO_SYMBOL - 46)) | (1L << (OTHERS_SYMBOL - 46)) | (1L << (WITH_SYMBOL - 46)) | (1L << (RECURSIVE_SYMBOL - 46)) | (1L << (ROLLUP_SYMBOL - 46)) | (1L << (CUBE_SYMBOL - 46)) | (1L << (ORDER_SYMBOL - 46)) | (1L << (ASC_SYMBOL - 46)) | (1L << (DESC_SYMBOL - 46)) | (1L << (FROM_SYMBOL - 46)) | (1L << (DUAL_SYMBOL - 46)) | (1L << (VALUES_SYMBOL - 46)) | (1L << (TABLE_SYMBOL - 46)) | (1L << (SQL_NO_CACHE_SYMBOL - 46)))) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (SQL_CACHE_SYMBOL - 110)) | (1L << (MAX_STATEMENT_TIME_SYMBOL - 110)) | (1L << (FOR_SYMBOL - 110)) | (1L << (OF_SYMBOL - 110)) | (1L << (LOCK_SYMBOL - 110)) | (1L << (IN_SYMBOL - 110)) | (1L << (SHARE_SYMBOL - 110)) | (1L << (MODE_SYMBOL - 110)) | (1L << (UPDATE_SYMBOL - 110)) | (1L << (SKIP_SYMBOL - 110)) | (1L << (LOCKED_SYMBOL - 110)) | (1L << (NOWAIT_SYMBOL - 110)) | (1L << (WHERE_SYMBOL - 110)) | (1L << (OJ_SYMBOL - 110)) | (1L << (ON_SYMBOL - 110)) | (1L << (USING_SYMBOL - 110)) | (1L << (NATURAL_SYMBOL - 110)) | (1L << (INNER_SYMBOL - 110)) | (1L << (JOIN_SYMBOL - 110)) | (1L << (LEFT_SYMBOL - 110)) | (1L << (RIGHT_SYMBOL - 110)) | (1L << (OUTER_SYMBOL - 110)) | (1L << (CROSS_SYMBOL - 110)) | (1L << (LATERAL_SYMBOL - 110)) | (1L << (JSON_TABLE_SYMBOL - 110)) | (1L << (COLUMNS_SYMBOL - 110)) | (1L << (ORDINALITY_SYMBOL - 110)) | (1L << (EXISTS_SYMBOL - 110)) | (1L << (PATH_SYMBOL - 110)) | (1L << (NESTED_SYMBOL - 110)) | (1L << (EMPTY_SYMBOL - 110)) | (1L << (ERROR_SYMBOL - 110)) | (1L << (NULL_SYMBOL - 110)) | (1L << (USE_SYMBOL - 110)) | (1L << (FORCE_SYMBOL - 110)) | (1L << (IGNORE_SYMBOL - 110)) | (1L << (KEY_SYMBOL - 110)) | (1L << (INDEX_SYMBOL - 110)) | (1L << (PRIMARY_SYMBOL - 110)) | (1L << (IS_SYMBOL - 110)) | (1L << (TRUE_SYMBOL - 110)) | (1L << (FALSE_SYMBOL - 110)) | (1L << (UNKNOWN_SYMBOL - 110)) | (1L << (NOT_SYMBOL - 110)) | (1L << (XOR_SYMBOL - 110)) | (1L << (OR_SYMBOL - 110)) | (1L << (ANY_SYMBOL - 110)) | (1L << (MEMBER_SYMBOL - 110)) | (1L << (SOUNDS_SYMBOL - 110)) | (1L << (LIKE_SYMBOL - 110)) | (1L << (ESCAPE_SYMBOL - 110)) | (1L << (REGEXP_SYMBOL - 110)) | (1L << (DIV_SYMBOL - 110)) | (1L << (MOD_SYMBOL - 110)) | (1L << (MATCH_SYMBOL - 110)) | (1L << (AGAINST_SYMBOL - 110)) | (1L << (BINARY_SYMBOL - 110)) | (1L << (CAST_SYMBOL - 110)) | (1L << (ARRAY_SYMBOL - 110)) | (1L << (CASE_SYMBOL - 110)) | (1L << (END_SYMBOL - 110)) | (1L << (CONVERT_SYMBOL - 110)) | (1L << (COLLATE_SYMBOL - 110)) | (1L << (AVG_SYMBOL - 110)))) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (BIT_AND_SYMBOL - 174)) | (1L << (BIT_OR_SYMBOL - 174)) | (1L << (BIT_XOR_SYMBOL - 174)) | (1L << (COUNT_SYMBOL - 174)) | (1L << (MIN_SYMBOL - 174)) | (1L << (MAX_SYMBOL - 174)) | (1L << (STD_SYMBOL - 174)) | (1L << (VARIANCE_SYMBOL - 174)) | (1L << (STDDEV_SAMP_SYMBOL - 174)) | (1L << (VAR_SAMP_SYMBOL - 174)) | (1L << (SUM_SYMBOL - 174)) | (1L << (GROUP_CONCAT_SYMBOL - 174)) | (1L << (SEPARATOR_SYMBOL - 174)) | (1L << (GROUPING_SYMBOL - 174)) | (1L << (ROW_NUMBER_SYMBOL - 174)) | (1L << (RANK_SYMBOL - 174)) | (1L << (DENSE_RANK_SYMBOL - 174)) | (1L << (CUME_DIST_SYMBOL - 174)) | (1L << (PERCENT_RANK_SYMBOL - 174)) | (1L << (NTILE_SYMBOL - 174)) | (1L << (LEAD_SYMBOL - 174)) | (1L << (LAG_SYMBOL - 174)) | (1L << (FIRST_VALUE_SYMBOL - 174)) | (1L << (LAST_VALUE_SYMBOL - 174)) | (1L << (NTH_VALUE_SYMBOL - 174)) | (1L << (FIRST_SYMBOL - 174)) | (1L << (LAST_SYMBOL - 174)) | (1L << (OVER_SYMBOL - 174)) | (1L << (RESPECT_SYMBOL - 174)) | (1L << (NULLS_SYMBOL - 174)) | (1L << (JSON_ARRAYAGG_SYMBOL - 174)) | (1L << (JSON_OBJECTAGG_SYMBOL - 174)) | (1L << (BOOLEAN_SYMBOL - 174)) | (1L << (LANGUAGE_SYMBOL - 174)) | (1L << (QUERY_SYMBOL - 174)) | (1L << (EXPANSION_SYMBOL - 174)) | (1L << (CHAR_SYMBOL - 174)) | (1L << (CURRENT_USER_SYMBOL - 174)) | (1L << (DATE_SYMBOL - 174)) | (1L << (INSERT_SYMBOL - 174)) | (1L << (TIME_SYMBOL - 174)) | (1L << (TIMESTAMP_SYMBOL - 174)) | (1L << (USER_SYMBOL - 174)) | (1L << (ADDDATE_SYMBOL - 174)) | (1L << (SUBDATE_SYMBOL - 174)) | (1L << (CURDATE_SYMBOL - 174)) | (1L << (CURTIME_SYMBOL - 174)) | (1L << (DATE_ADD_SYMBOL - 174)) | (1L << (DATE_SUB_SYMBOL - 174)) | (1L << (EXTRACT_SYMBOL - 174)) | (1L << (GET_FORMAT_SYMBOL - 174)) | (1L << (NOW_SYMBOL - 174)) | (1L << (POSITION_SYMBOL - 174)) | (1L << (SYSDATE_SYMBOL - 174)) | (1L << (TIMESTAMP_ADD_SYMBOL - 174)) | (1L << (TIMESTAMP_DIFF_SYMBOL - 174)) | (1L << (UTC_DATE_SYMBOL - 174)) | (1L << (UTC_TIME_SYMBOL - 174)) | (1L << (UTC_TIMESTAMP_SYMBOL - 174)) | (1L << (ASCII_SYMBOL - 174)) | (1L << (CHARSET_SYMBOL - 174)) | (1L << (COALESCE_SYMBOL - 174)) | (1L << (COLLATION_SYMBOL - 174)) | (1L << (DATABASE_SYMBOL - 174)))) != 0) || ((((_la - 238)) & ~0x3f) == 0 && ((1L << (_la - 238)) & ((1L << (IF_SYMBOL - 238)) | (1L << (FORMAT_SYMBOL - 238)) | (1L << (MICROSECOND_SYMBOL - 238)) | (1L << (OLD_PASSWORD_SYMBOL - 238)) | (1L << (PASSWORD_SYMBOL - 238)) | (1L << (REPEAT_SYMBOL - 238)) | (1L << (REPLACE_SYMBOL - 238)) | (1L << (REVERSE_SYMBOL - 238)) | (1L << (ROW_COUNT_SYMBOL - 238)) | (1L << (TRUNCATE_SYMBOL - 238)) | (1L << (WEIGHT_STRING_SYMBOL - 238)) | (1L << (CONTAINS_SYMBOL - 238)) | (1L << (GEOMETRYCOLLECTION_SYMBOL - 238)) | (1L << (LINESTRING_SYMBOL - 238)) | (1L << (MULTILINESTRING_SYMBOL - 238)) | (1L << (MULTIPOINT_SYMBOL - 238)) | (1L << (MULTIPOLYGON_SYMBOL - 238)) | (1L << (POINT_SYMBOL - 238)) | (1L << (POLYGON_SYMBOL - 238)) | (1L << (LEVEL_SYMBOL - 238)) | (1L << (DATETIME_SYMBOL - 238)) | (1L << (TRIM_SYMBOL - 238)) | (1L << (LEADING_SYMBOL - 238)) | (1L << (TRAILING_SYMBOL - 238)) | (1L << (BOTH_SYMBOL - 238)) | (1L << (SUBSTRING_SYMBOL - 238)) | (1L << (WHEN_SYMBOL - 238)) | (1L << (THEN_SYMBOL - 238)) | (1L << (ELSE_SYMBOL - 238)) | (1L << (SIGNED_SYMBOL - 238)) | (1L << (UNSIGNED_SYMBOL - 238)) | (1L << (DECIMAL_SYMBOL - 238)) | (1L << (JSON_SYMBOL - 238)) | (1L << (FLOAT_SYMBOL - 238)) | (1L << (SET_SYMBOL - 238)) | (1L << (SECOND_MICROSECOND_SYMBOL - 238)) | (1L << (MINUTE_MICROSECOND_SYMBOL - 238)) | (1L << (MINUTE_SECOND_SYMBOL - 238)) | (1L << (HOUR_MICROSECOND_SYMBOL - 238)) | (1L << (HOUR_SECOND_SYMBOL - 238)) | (1L << (HOUR_MINUTE_SYMBOL - 238)) | (1L << (DAY_MICROSECOND_SYMBOL - 238)) | (1L << (DAY_SECOND_SYMBOL - 238)) | (1L << (DAY_MINUTE_SYMBOL - 238)) | (1L << (DAY_HOUR_SYMBOL - 238)) | (1L << (YEAR_MONTH_SYMBOL - 238)) | (1L << (BTREE_SYMBOL - 238)) | (1L << (RTREE_SYMBOL - 238)) | (1L << (HASH_SYMBOL - 238)) | (1L << (REAL_SYMBOL - 238)) | (1L << (DOUBLE_SYMBOL - 238)) | (1L << (PRECISION_SYMBOL - 238)) | (1L << (NUMERIC_SYMBOL - 238)) | (1L << (FIXED_SYMBOL - 238)) | (1L << (BIT_SYMBOL - 238)) | (1L << (BOOL_SYMBOL - 238)) | (1L << (VARYING_SYMBOL - 238)) | (1L << (VARCHAR_SYMBOL - 238)) | (1L << (NATIONAL_SYMBOL - 238)) | (1L << (NVARCHAR_SYMBOL - 238)) | (1L << (NCHAR_SYMBOL - 238)) | (1L << (VARBINARY_SYMBOL - 238)) | (1L << (TINYBLOB_SYMBOL - 238)) | (1L << (BLOB_SYMBOL - 238)))) != 0) || ((((_la - 302)) & ~0x3f) == 0 && ((1L << (_la - 302)) & ((1L << (MEDIUMBLOB_SYMBOL - 302)) | (1L << (LONGBLOB_SYMBOL - 302)) | (1L << (LONG_SYMBOL - 302)) | (1L << (TINYTEXT_SYMBOL - 302)) | (1L << (TEXT_SYMBOL - 302)) | (1L << (MEDIUMTEXT_SYMBOL - 302)) | (1L << (LONGTEXT_SYMBOL - 302)) | (1L << (ENUM_SYMBOL - 302)) | (1L << (SERIAL_SYMBOL - 302)) | (1L << (GEOMETRY_SYMBOL - 302)) | (1L << (ZEROFILL_SYMBOL - 302)) | (1L << (BYTE_SYMBOL - 302)) | (1L << (UNICODE_SYMBOL - 302)) | (1L << (TERMINATED_SYMBOL - 302)) | (1L << (OPTIONALLY_SYMBOL - 302)) | (1L << (ENCLOSED_SYMBOL - 302)) | (1L << (ESCAPED_SYMBOL - 302)) | (1L << (LINES_SYMBOL - 302)) | (1L << (STARTING_SYMBOL - 302)) | (1L << (GLOBAL_SYMBOL - 302)) | (1L << (LOCAL_SYMBOL - 302)) | (1L << (SESSION_SYMBOL - 302)) | (1L << (IDENTIFIER - 302)) | (1L << (BACK_TICK_QUOTED_ID - 302)) | (1L << (DOUBLE_QUOTED_TEXT - 302)) | (1L << (SINGLE_QUOTED_TEXT - 302)) | (1L << (BRACKET_QUOTED_TEXT - 302)))) != 0)) {
				{
				setState(1908);
				selectAlias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public UserVariableContext userVariable() {
			return getRuleContext(UserVariableContext.class,0);
		}
		public SystemVariableContext systemVariable() {
			return getRuleContext(SystemVariableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_variable);
		try {
			setState(1913);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_SIGN_SYMBOL:
			case AT_TEXT_SUFFIX:
				enterOuterAlt(_localctx, 1);
				{
				setState(1911);
				userVariable();
				}
				break;
			case AT_AT_SIGN_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1912);
				systemVariable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserVariableContext extends ParserRuleContext {
		public TerminalNode AT_SIGN_SYMBOL() { return getToken(SQLSelectParser.AT_SIGN_SYMBOL, 0); }
		public TextOrIdentifierContext textOrIdentifier() {
			return getRuleContext(TextOrIdentifierContext.class,0);
		}
		public TerminalNode AT_TEXT_SUFFIX() { return getToken(SQLSelectParser.AT_TEXT_SUFFIX, 0); }
		public UserVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userVariable; }
	}

	public final UserVariableContext userVariable() throws RecognitionException {
		UserVariableContext _localctx = new UserVariableContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_userVariable);
		try {
			setState(1918);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_SIGN_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1915);
				match(AT_SIGN_SYMBOL);
				setState(1916);
				textOrIdentifier();
				}
				break;
			case AT_TEXT_SUFFIX:
				enterOuterAlt(_localctx, 2);
				{
				setState(1917);
				match(AT_TEXT_SUFFIX);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SystemVariableContext extends ParserRuleContext {
		public TerminalNode AT_AT_SIGN_SYMBOL() { return getToken(SQLSelectParser.AT_AT_SIGN_SYMBOL, 0); }
		public TextOrIdentifierContext textOrIdentifier() {
			return getRuleContext(TextOrIdentifierContext.class,0);
		}
		public VarIdentTypeContext varIdentType() {
			return getRuleContext(VarIdentTypeContext.class,0);
		}
		public DotIdentifierContext dotIdentifier() {
			return getRuleContext(DotIdentifierContext.class,0);
		}
		public SystemVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemVariable; }
	}

	public final SystemVariableContext systemVariable() throws RecognitionException {
		SystemVariableContext _localctx = new SystemVariableContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_systemVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1920);
			match(AT_AT_SIGN_SYMBOL);
			setState(1922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1921);
				varIdentType();
				}
				break;
			}
			setState(1924);
			textOrIdentifier();
			setState(1926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1925);
				dotIdentifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenExpressionContext extends ParserRuleContext {
		public TerminalNode WHEN_SYMBOL() { return getToken(SQLSelectParser.WHEN_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhenExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenExpression; }
	}

	public final WhenExpressionContext whenExpression() throws RecognitionException {
		WhenExpressionContext _localctx = new WhenExpressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_whenExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1928);
			match(WHEN_SYMBOL);
			setState(1929);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThenExpressionContext extends ParserRuleContext {
		public TerminalNode THEN_SYMBOL() { return getToken(SQLSelectParser.THEN_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ThenExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenExpression; }
	}

	public final ThenExpressionContext thenExpression() throws RecognitionException {
		ThenExpressionContext _localctx = new ThenExpressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_thenExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1931);
			match(THEN_SYMBOL);
			setState(1932);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseExpressionContext extends ParserRuleContext {
		public TerminalNode ELSE_SYMBOL() { return getToken(SQLSelectParser.ELSE_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseExpression; }
	}

	public final ElseExpressionContext elseExpression() throws RecognitionException {
		ElseExpressionContext _localctx = new ElseExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_elseExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1934);
			match(ELSE_SYMBOL);
			setState(1935);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastTypeContext extends ParserRuleContext {
		public TerminalNode BINARY_SYMBOL() { return getToken(SQLSelectParser.BINARY_SYMBOL, 0); }
		public FieldLengthContext fieldLength() {
			return getRuleContext(FieldLengthContext.class,0);
		}
		public TerminalNode CHAR_SYMBOL() { return getToken(SQLSelectParser.CHAR_SYMBOL, 0); }
		public CharsetWithOptBinaryContext charsetWithOptBinary() {
			return getRuleContext(CharsetWithOptBinaryContext.class,0);
		}
		public NcharContext nchar() {
			return getRuleContext(NcharContext.class,0);
		}
		public TerminalNode SIGNED_SYMBOL() { return getToken(SQLSelectParser.SIGNED_SYMBOL, 0); }
		public TerminalNode INT_SYMBOL() { return getToken(SQLSelectParser.INT_SYMBOL, 0); }
		public TerminalNode UNSIGNED_SYMBOL() { return getToken(SQLSelectParser.UNSIGNED_SYMBOL, 0); }
		public TerminalNode DATE_SYMBOL() { return getToken(SQLSelectParser.DATE_SYMBOL, 0); }
		public TerminalNode TIME_SYMBOL() { return getToken(SQLSelectParser.TIME_SYMBOL, 0); }
		public TypeDatetimePrecisionContext typeDatetimePrecision() {
			return getRuleContext(TypeDatetimePrecisionContext.class,0);
		}
		public TerminalNode DATETIME_SYMBOL() { return getToken(SQLSelectParser.DATETIME_SYMBOL, 0); }
		public TerminalNode DECIMAL_SYMBOL() { return getToken(SQLSelectParser.DECIMAL_SYMBOL, 0); }
		public FloatOptionsContext floatOptions() {
			return getRuleContext(FloatOptionsContext.class,0);
		}
		public TerminalNode JSON_SYMBOL() { return getToken(SQLSelectParser.JSON_SYMBOL, 0); }
		public RealTypeContext realType() {
			return getRuleContext(RealTypeContext.class,0);
		}
		public TerminalNode FLOAT_SYMBOL() { return getToken(SQLSelectParser.FLOAT_SYMBOL, 0); }
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public CastTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castType; }
	}

	public final CastTypeContext castType() throws RecognitionException {
		CastTypeContext _localctx = new CastTypeContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_castType);
		int _la;
		try {
			setState(1979);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1937);
				match(BINARY_SYMBOL);
				setState(1939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(1938);
					fieldLength();
					}
				}

				}
				break;
			case CHAR_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1941);
				match(CHAR_SYMBOL);
				setState(1943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(1942);
					fieldLength();
					}
				}

				setState(1946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY_SYMBOL || _la==CHAR_SYMBOL || _la==ASCII_SYMBOL || _la==CHARSET_SYMBOL || _la==BYTE_SYMBOL || _la==UNICODE_SYMBOL) {
					{
					setState(1945);
					charsetWithOptBinary();
					}
				}

				}
				break;
			case NATIONAL_SYMBOL:
			case NCHAR_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1948);
				nchar();
				setState(1950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(1949);
					fieldLength();
					}
				}

				}
				break;
			case SIGNED_SYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1952);
				match(SIGNED_SYMBOL);
				setState(1954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT_SYMBOL) {
					{
					setState(1953);
					match(INT_SYMBOL);
					}
				}

				}
				break;
			case UNSIGNED_SYMBOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1956);
				match(UNSIGNED_SYMBOL);
				setState(1958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT_SYMBOL) {
					{
					setState(1957);
					match(INT_SYMBOL);
					}
				}

				}
				break;
			case DATE_SYMBOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1960);
				match(DATE_SYMBOL);
				}
				break;
			case TIME_SYMBOL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1961);
				match(TIME_SYMBOL);
				setState(1963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(1962);
					typeDatetimePrecision();
					}
				}

				}
				break;
			case DATETIME_SYMBOL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1965);
				match(DATETIME_SYMBOL);
				setState(1967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(1966);
					typeDatetimePrecision();
					}
				}

				}
				break;
			case DECIMAL_SYMBOL:
				enterOuterAlt(_localctx, 9);
				{
				setState(1969);
				match(DECIMAL_SYMBOL);
				setState(1971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(1970);
					floatOptions();
					}
				}

				}
				break;
			case JSON_SYMBOL:
				enterOuterAlt(_localctx, 10);
				{
				setState(1973);
				match(JSON_SYMBOL);
				}
				break;
			case REAL_SYMBOL:
			case DOUBLE_SYMBOL:
				enterOuterAlt(_localctx, 11);
				{
				setState(1974);
				realType();
				}
				break;
			case FLOAT_SYMBOL:
				enterOuterAlt(_localctx, 12);
				{
				setState(1975);
				match(FLOAT_SYMBOL);
				setState(1977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(1976);
					precision();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1981);
			expr(0);
			setState(1986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(1982);
				match(COMMA_SYMBOL);
				setState(1983);
				expr(0);
				}
				}
				setState(1988);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharsetContext extends ParserRuleContext {
		public TerminalNode CHAR_SYMBOL() { return getToken(SQLSelectParser.CHAR_SYMBOL, 0); }
		public TerminalNode SET_SYMBOL() { return getToken(SQLSelectParser.SET_SYMBOL, 0); }
		public TerminalNode CHARSET_SYMBOL() { return getToken(SQLSelectParser.CHARSET_SYMBOL, 0); }
		public CharsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charset; }
	}

	public final CharsetContext charset() throws RecognitionException {
		CharsetContext _localctx = new CharsetContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_charset);
		try {
			setState(1992);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1989);
				match(CHAR_SYMBOL);
				setState(1990);
				match(SET_SYMBOL);
				}
				break;
			case CHARSET_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1991);
				match(CHARSET_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotRuleContext extends ParserRuleContext {
		public TerminalNode NOT_SYMBOL() { return getToken(SQLSelectParser.NOT_SYMBOL, 0); }
		public NotRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notRule; }
	}

	public final NotRuleContext notRule() throws RecognitionException {
		NotRuleContext _localctx = new NotRuleContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_notRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1994);
			match(NOT_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not2RuleContext extends ParserRuleContext {
		public TerminalNode LOGICAL_NOT_OPERATOR() { return getToken(SQLSelectParser.LOGICAL_NOT_OPERATOR, 0); }
		public Not2RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not2Rule; }
	}

	public final Not2RuleContext not2Rule() throws RecognitionException {
		Not2RuleContext _localctx = new Not2RuleContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_not2Rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1996);
			match(LOGICAL_NOT_OPERATOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public IntervalTimeStampContext intervalTimeStamp() {
			return getRuleContext(IntervalTimeStampContext.class,0);
		}
		public TerminalNode SECOND_MICROSECOND_SYMBOL() { return getToken(SQLSelectParser.SECOND_MICROSECOND_SYMBOL, 0); }
		public TerminalNode MINUTE_MICROSECOND_SYMBOL() { return getToken(SQLSelectParser.MINUTE_MICROSECOND_SYMBOL, 0); }
		public TerminalNode MINUTE_SECOND_SYMBOL() { return getToken(SQLSelectParser.MINUTE_SECOND_SYMBOL, 0); }
		public TerminalNode HOUR_MICROSECOND_SYMBOL() { return getToken(SQLSelectParser.HOUR_MICROSECOND_SYMBOL, 0); }
		public TerminalNode HOUR_SECOND_SYMBOL() { return getToken(SQLSelectParser.HOUR_SECOND_SYMBOL, 0); }
		public TerminalNode HOUR_MINUTE_SYMBOL() { return getToken(SQLSelectParser.HOUR_MINUTE_SYMBOL, 0); }
		public TerminalNode DAY_MICROSECOND_SYMBOL() { return getToken(SQLSelectParser.DAY_MICROSECOND_SYMBOL, 0); }
		public TerminalNode DAY_SECOND_SYMBOL() { return getToken(SQLSelectParser.DAY_SECOND_SYMBOL, 0); }
		public TerminalNode DAY_MINUTE_SYMBOL() { return getToken(SQLSelectParser.DAY_MINUTE_SYMBOL, 0); }
		public TerminalNode DAY_HOUR_SYMBOL() { return getToken(SQLSelectParser.DAY_HOUR_SYMBOL, 0); }
		public TerminalNode YEAR_MONTH_SYMBOL() { return getToken(SQLSelectParser.YEAR_MONTH_SYMBOL, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_interval);
		int _la;
		try {
			setState(2000);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECOND_SYMBOL:
			case MINUTE_SYMBOL:
			case HOUR_SYMBOL:
			case DAY_SYMBOL:
			case WEEK_SYMBOL:
			case MONTH_SYMBOL:
			case QUARTER_SYMBOL:
			case YEAR_SYMBOL:
			case MICROSECOND_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1998);
				intervalTimeStamp();
				}
				break;
			case SECOND_MICROSECOND_SYMBOL:
			case MINUTE_MICROSECOND_SYMBOL:
			case MINUTE_SECOND_SYMBOL:
			case HOUR_MICROSECOND_SYMBOL:
			case HOUR_SECOND_SYMBOL:
			case HOUR_MINUTE_SYMBOL:
			case DAY_MICROSECOND_SYMBOL:
			case DAY_SECOND_SYMBOL:
			case DAY_MINUTE_SYMBOL:
			case DAY_HOUR_SYMBOL:
			case YEAR_MONTH_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1999);
				_la = _input.LA(1);
				if ( !(((((_la - 273)) & ~0x3f) == 0 && ((1L << (_la - 273)) & ((1L << (SECOND_MICROSECOND_SYMBOL - 273)) | (1L << (MINUTE_MICROSECOND_SYMBOL - 273)) | (1L << (MINUTE_SECOND_SYMBOL - 273)) | (1L << (HOUR_MICROSECOND_SYMBOL - 273)) | (1L << (HOUR_SECOND_SYMBOL - 273)) | (1L << (HOUR_MINUTE_SYMBOL - 273)) | (1L << (DAY_MICROSECOND_SYMBOL - 273)) | (1L << (DAY_SECOND_SYMBOL - 273)) | (1L << (DAY_MINUTE_SYMBOL - 273)) | (1L << (DAY_HOUR_SYMBOL - 273)) | (1L << (YEAR_MONTH_SYMBOL - 273)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalTimeStampContext extends ParserRuleContext {
		public TerminalNode MICROSECOND_SYMBOL() { return getToken(SQLSelectParser.MICROSECOND_SYMBOL, 0); }
		public TerminalNode SECOND_SYMBOL() { return getToken(SQLSelectParser.SECOND_SYMBOL, 0); }
		public TerminalNode MINUTE_SYMBOL() { return getToken(SQLSelectParser.MINUTE_SYMBOL, 0); }
		public TerminalNode HOUR_SYMBOL() { return getToken(SQLSelectParser.HOUR_SYMBOL, 0); }
		public TerminalNode DAY_SYMBOL() { return getToken(SQLSelectParser.DAY_SYMBOL, 0); }
		public TerminalNode WEEK_SYMBOL() { return getToken(SQLSelectParser.WEEK_SYMBOL, 0); }
		public TerminalNode MONTH_SYMBOL() { return getToken(SQLSelectParser.MONTH_SYMBOL, 0); }
		public TerminalNode QUARTER_SYMBOL() { return getToken(SQLSelectParser.QUARTER_SYMBOL, 0); }
		public TerminalNode YEAR_SYMBOL() { return getToken(SQLSelectParser.YEAR_SYMBOL, 0); }
		public IntervalTimeStampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalTimeStamp; }
	}

	public final IntervalTimeStampContext intervalTimeStamp() throws RecognitionException {
		IntervalTimeStampContext _localctx = new IntervalTimeStampContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_intervalTimeStamp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2002);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SECOND_SYMBOL) | (1L << MINUTE_SYMBOL) | (1L << HOUR_SYMBOL) | (1L << DAY_SYMBOL) | (1L << WEEK_SYMBOL) | (1L << MONTH_SYMBOL) | (1L << QUARTER_SYMBOL) | (1L << YEAR_SYMBOL))) != 0) || _la==MICROSECOND_SYMBOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListWithParenthesesContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public ExprListWithParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprListWithParentheses; }
	}

	public final ExprListWithParenthesesContext exprListWithParentheses() throws RecognitionException {
		ExprListWithParenthesesContext _localctx = new ExprListWithParenthesesContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_exprListWithParentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2004);
			match(OPEN_PAR_SYMBOL);
			setState(2005);
			exprList();
			setState(2006);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprWithParenthesesContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public ExprWithParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprWithParentheses; }
	}

	public final ExprWithParenthesesContext exprWithParentheses() throws RecognitionException {
		ExprWithParenthesesContext _localctx = new ExprWithParenthesesContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_exprWithParentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2008);
			match(OPEN_PAR_SYMBOL);
			setState(2009);
			expr(0);
			setState(2010);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExprWithParenthesesContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public SimpleExprWithParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExprWithParentheses; }
	}

	public final SimpleExprWithParenthesesContext simpleExprWithParentheses() throws RecognitionException {
		SimpleExprWithParenthesesContext _localctx = new SimpleExprWithParenthesesContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_simpleExprWithParentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2012);
			match(OPEN_PAR_SYMBOL);
			setState(2013);
			simpleExpr(0);
			setState(2014);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderListContext extends ParserRuleContext {
		public List<OrderExpressionContext> orderExpression() {
			return getRuleContexts(OrderExpressionContext.class);
		}
		public OrderExpressionContext orderExpression(int i) {
			return getRuleContext(OrderExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public OrderListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderList; }
	}

	public final OrderListContext orderList() throws RecognitionException {
		OrderListContext _localctx = new OrderListContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_orderList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2016);
			orderExpression();
			setState(2021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(2017);
				match(COMMA_SYMBOL);
				setState(2018);
				orderExpression();
				}
				}
				setState(2023);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderExpressionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public OrderExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderExpression; }
	}

	public final OrderExpressionContext orderExpression() throws RecognitionException {
		OrderExpressionContext _localctx = new OrderExpressionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_orderExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2024);
			expr(0);
			setState(2026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC_SYMBOL || _la==DESC_SYMBOL) {
				{
				setState(2025);
				direction();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexTypeContext extends ParserRuleContext {
		public Token algorithm;
		public TerminalNode BTREE_SYMBOL() { return getToken(SQLSelectParser.BTREE_SYMBOL, 0); }
		public TerminalNode RTREE_SYMBOL() { return getToken(SQLSelectParser.RTREE_SYMBOL, 0); }
		public TerminalNode HASH_SYMBOL() { return getToken(SQLSelectParser.HASH_SYMBOL, 0); }
		public IndexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexType; }
	}

	public final IndexTypeContext indexType() throws RecognitionException {
		IndexTypeContext _localctx = new IndexTypeContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_indexType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2028);
			((IndexTypeContext)_localctx).algorithm = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 284)) & ~0x3f) == 0 && ((1L << (_la - 284)) & ((1L << (BTREE_SYMBOL - 284)) | (1L << (RTREE_SYMBOL - 284)) | (1L << (HASH_SYMBOL - 284)))) != 0)) ) {
				((IndexTypeContext)_localctx).algorithm = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public Token type;
		public TerminalNode INT_SYMBOL() { return getToken(SQLSelectParser.INT_SYMBOL, 0); }
		public TerminalNode TINYINT_SYMBOL() { return getToken(SQLSelectParser.TINYINT_SYMBOL, 0); }
		public TerminalNode SMALLINT_SYMBOL() { return getToken(SQLSelectParser.SMALLINT_SYMBOL, 0); }
		public TerminalNode MEDIUMINT_SYMBOL() { return getToken(SQLSelectParser.MEDIUMINT_SYMBOL, 0); }
		public TerminalNode BIGINT_SYMBOL() { return getToken(SQLSelectParser.BIGINT_SYMBOL, 0); }
		public FieldLengthContext fieldLength() {
			return getRuleContext(FieldLengthContext.class,0);
		}
		public FieldOptionsContext fieldOptions() {
			return getRuleContext(FieldOptionsContext.class,0);
		}
		public TerminalNode REAL_SYMBOL() { return getToken(SQLSelectParser.REAL_SYMBOL, 0); }
		public TerminalNode DOUBLE_SYMBOL() { return getToken(SQLSelectParser.DOUBLE_SYMBOL, 0); }
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public TerminalNode PRECISION_SYMBOL() { return getToken(SQLSelectParser.PRECISION_SYMBOL, 0); }
		public TerminalNode FLOAT_SYMBOL() { return getToken(SQLSelectParser.FLOAT_SYMBOL, 0); }
		public TerminalNode DECIMAL_SYMBOL() { return getToken(SQLSelectParser.DECIMAL_SYMBOL, 0); }
		public TerminalNode NUMERIC_SYMBOL() { return getToken(SQLSelectParser.NUMERIC_SYMBOL, 0); }
		public TerminalNode FIXED_SYMBOL() { return getToken(SQLSelectParser.FIXED_SYMBOL, 0); }
		public FloatOptionsContext floatOptions() {
			return getRuleContext(FloatOptionsContext.class,0);
		}
		public TerminalNode BIT_SYMBOL() { return getToken(SQLSelectParser.BIT_SYMBOL, 0); }
		public TerminalNode BOOL_SYMBOL() { return getToken(SQLSelectParser.BOOL_SYMBOL, 0); }
		public TerminalNode BOOLEAN_SYMBOL() { return getToken(SQLSelectParser.BOOLEAN_SYMBOL, 0); }
		public TerminalNode CHAR_SYMBOL() { return getToken(SQLSelectParser.CHAR_SYMBOL, 0); }
		public CharsetWithOptBinaryContext charsetWithOptBinary() {
			return getRuleContext(CharsetWithOptBinaryContext.class,0);
		}
		public NcharContext nchar() {
			return getRuleContext(NcharContext.class,0);
		}
		public TerminalNode BINARY_SYMBOL() { return getToken(SQLSelectParser.BINARY_SYMBOL, 0); }
		public TerminalNode VARYING_SYMBOL() { return getToken(SQLSelectParser.VARYING_SYMBOL, 0); }
		public TerminalNode VARCHAR_SYMBOL() { return getToken(SQLSelectParser.VARCHAR_SYMBOL, 0); }
		public TerminalNode NATIONAL_SYMBOL() { return getToken(SQLSelectParser.NATIONAL_SYMBOL, 0); }
		public TerminalNode NVARCHAR_SYMBOL() { return getToken(SQLSelectParser.NVARCHAR_SYMBOL, 0); }
		public TerminalNode NCHAR_SYMBOL() { return getToken(SQLSelectParser.NCHAR_SYMBOL, 0); }
		public TerminalNode VARBINARY_SYMBOL() { return getToken(SQLSelectParser.VARBINARY_SYMBOL, 0); }
		public TerminalNode YEAR_SYMBOL() { return getToken(SQLSelectParser.YEAR_SYMBOL, 0); }
		public TerminalNode DATE_SYMBOL() { return getToken(SQLSelectParser.DATE_SYMBOL, 0); }
		public TerminalNode TIME_SYMBOL() { return getToken(SQLSelectParser.TIME_SYMBOL, 0); }
		public TypeDatetimePrecisionContext typeDatetimePrecision() {
			return getRuleContext(TypeDatetimePrecisionContext.class,0);
		}
		public TerminalNode TIMESTAMP_SYMBOL() { return getToken(SQLSelectParser.TIMESTAMP_SYMBOL, 0); }
		public TerminalNode DATETIME_SYMBOL() { return getToken(SQLSelectParser.DATETIME_SYMBOL, 0); }
		public TerminalNode TINYBLOB_SYMBOL() { return getToken(SQLSelectParser.TINYBLOB_SYMBOL, 0); }
		public TerminalNode BLOB_SYMBOL() { return getToken(SQLSelectParser.BLOB_SYMBOL, 0); }
		public TerminalNode MEDIUMBLOB_SYMBOL() { return getToken(SQLSelectParser.MEDIUMBLOB_SYMBOL, 0); }
		public TerminalNode LONGBLOB_SYMBOL() { return getToken(SQLSelectParser.LONGBLOB_SYMBOL, 0); }
		public TerminalNode LONG_SYMBOL() { return getToken(SQLSelectParser.LONG_SYMBOL, 0); }
		public TerminalNode TINYTEXT_SYMBOL() { return getToken(SQLSelectParser.TINYTEXT_SYMBOL, 0); }
		public TerminalNode TEXT_SYMBOL() { return getToken(SQLSelectParser.TEXT_SYMBOL, 0); }
		public TerminalNode MEDIUMTEXT_SYMBOL() { return getToken(SQLSelectParser.MEDIUMTEXT_SYMBOL, 0); }
		public TerminalNode LONGTEXT_SYMBOL() { return getToken(SQLSelectParser.LONGTEXT_SYMBOL, 0); }
		public StringListContext stringList() {
			return getRuleContext(StringListContext.class,0);
		}
		public TerminalNode ENUM_SYMBOL() { return getToken(SQLSelectParser.ENUM_SYMBOL, 0); }
		public TerminalNode SET_SYMBOL() { return getToken(SQLSelectParser.SET_SYMBOL, 0); }
		public TerminalNode SERIAL_SYMBOL() { return getToken(SQLSelectParser.SERIAL_SYMBOL, 0); }
		public TerminalNode JSON_SYMBOL() { return getToken(SQLSelectParser.JSON_SYMBOL, 0); }
		public TerminalNode GEOMETRY_SYMBOL() { return getToken(SQLSelectParser.GEOMETRY_SYMBOL, 0); }
		public TerminalNode GEOMETRYCOLLECTION_SYMBOL() { return getToken(SQLSelectParser.GEOMETRYCOLLECTION_SYMBOL, 0); }
		public TerminalNode POINT_SYMBOL() { return getToken(SQLSelectParser.POINT_SYMBOL, 0); }
		public TerminalNode MULTIPOINT_SYMBOL() { return getToken(SQLSelectParser.MULTIPOINT_SYMBOL, 0); }
		public TerminalNode LINESTRING_SYMBOL() { return getToken(SQLSelectParser.LINESTRING_SYMBOL, 0); }
		public TerminalNode MULTILINESTRING_SYMBOL() { return getToken(SQLSelectParser.MULTILINESTRING_SYMBOL, 0); }
		public TerminalNode POLYGON_SYMBOL() { return getToken(SQLSelectParser.POLYGON_SYMBOL, 0); }
		public TerminalNode MULTIPOLYGON_SYMBOL() { return getToken(SQLSelectParser.MULTIPOLYGON_SYMBOL, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_dataType);
		int _la;
		try {
			setState(2176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2030);
				((DataTypeContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TINYINT_SYMBOL) | (1L << SMALLINT_SYMBOL) | (1L << MEDIUMINT_SYMBOL) | (1L << INT_SYMBOL) | (1L << BIGINT_SYMBOL))) != 0)) ) {
					((DataTypeContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(2031);
					fieldLength();
					}
				}

				setState(2035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 267)) & ~0x3f) == 0 && ((1L << (_la - 267)) & ((1L << (SIGNED_SYMBOL - 267)) | (1L << (UNSIGNED_SYMBOL - 267)) | (1L << (ZEROFILL_SYMBOL - 267)))) != 0)) {
					{
					setState(2034);
					fieldOptions();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2042);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REAL_SYMBOL:
					{
					setState(2037);
					((DataTypeContext)_localctx).type = match(REAL_SYMBOL);
					}
					break;
				case DOUBLE_SYMBOL:
					{
					setState(2038);
					((DataTypeContext)_localctx).type = match(DOUBLE_SYMBOL);
					setState(2040);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PRECISION_SYMBOL) {
						{
						setState(2039);
						match(PRECISION_SYMBOL);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2045);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(2044);
					precision();
					}
				}

				setState(2048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 267)) & ~0x3f) == 0 && ((1L << (_la - 267)) & ((1L << (SIGNED_SYMBOL - 267)) | (1L << (UNSIGNED_SYMBOL - 267)) | (1L << (ZEROFILL_SYMBOL - 267)))) != 0)) {
					{
					setState(2047);
					fieldOptions();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2050);
				((DataTypeContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (DECIMAL_SYMBOL - 269)) | (1L << (FLOAT_SYMBOL - 269)) | (1L << (NUMERIC_SYMBOL - 269)) | (1L << (FIXED_SYMBOL - 269)))) != 0)) ) {
					((DataTypeContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(2051);
					floatOptions();
					}
				}

				setState(2055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 267)) & ~0x3f) == 0 && ((1L << (_la - 267)) & ((1L << (SIGNED_SYMBOL - 267)) | (1L << (UNSIGNED_SYMBOL - 267)) | (1L << (ZEROFILL_SYMBOL - 267)))) != 0)) {
					{
					setState(2054);
					fieldOptions();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2057);
				((DataTypeContext)_localctx).type = match(BIT_SYMBOL);
				setState(2059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(2058);
					fieldLength();
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2061);
				((DataTypeContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BOOLEAN_SYMBOL || _la==BOOL_SYMBOL) ) {
					((DataTypeContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2062);
				((DataTypeContext)_localctx).type = match(CHAR_SYMBOL);
				setState(2064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(2063);
					fieldLength();
					}
				}

				setState(2067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY_SYMBOL || _la==CHAR_SYMBOL || _la==ASCII_SYMBOL || _la==CHARSET_SYMBOL || _la==BYTE_SYMBOL || _la==UNICODE_SYMBOL) {
					{
					setState(2066);
					charsetWithOptBinary();
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2069);
				nchar();
				setState(2071);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(2070);
					fieldLength();
					}
				}

				setState(2074);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY_SYMBOL) {
					{
					setState(2073);
					match(BINARY_SYMBOL);
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2076);
				((DataTypeContext)_localctx).type = match(BINARY_SYMBOL);
				setState(2078);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(2077);
					fieldLength();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2083);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR_SYMBOL:
					{
					setState(2080);
					((DataTypeContext)_localctx).type = match(CHAR_SYMBOL);
					setState(2081);
					match(VARYING_SYMBOL);
					}
					break;
				case VARCHAR_SYMBOL:
					{
					setState(2082);
					((DataTypeContext)_localctx).type = match(VARCHAR_SYMBOL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2085);
				fieldLength();
				setState(2087);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY_SYMBOL || _la==CHAR_SYMBOL || _la==ASCII_SYMBOL || _la==CHARSET_SYMBOL || _la==BYTE_SYMBOL || _la==UNICODE_SYMBOL) {
					{
					setState(2086);
					charsetWithOptBinary();
					}
				}

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2099);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(2089);
					((DataTypeContext)_localctx).type = match(NATIONAL_SYMBOL);
					setState(2090);
					match(VARCHAR_SYMBOL);
					}
					break;
				case 2:
					{
					setState(2091);
					((DataTypeContext)_localctx).type = match(NVARCHAR_SYMBOL);
					}
					break;
				case 3:
					{
					setState(2092);
					((DataTypeContext)_localctx).type = match(NCHAR_SYMBOL);
					setState(2093);
					match(VARCHAR_SYMBOL);
					}
					break;
				case 4:
					{
					setState(2094);
					((DataTypeContext)_localctx).type = match(NATIONAL_SYMBOL);
					setState(2095);
					match(CHAR_SYMBOL);
					setState(2096);
					match(VARYING_SYMBOL);
					}
					break;
				case 5:
					{
					setState(2097);
					((DataTypeContext)_localctx).type = match(NCHAR_SYMBOL);
					setState(2098);
					match(VARYING_SYMBOL);
					}
					break;
				}
				setState(2101);
				fieldLength();
				setState(2103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY_SYMBOL) {
					{
					setState(2102);
					match(BINARY_SYMBOL);
					}
				}

				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2105);
				((DataTypeContext)_localctx).type = match(VARBINARY_SYMBOL);
				setState(2106);
				fieldLength();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2107);
				((DataTypeContext)_localctx).type = match(YEAR_SYMBOL);
				setState(2109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(2108);
					fieldLength();
					}
				}

				setState(2112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 267)) & ~0x3f) == 0 && ((1L << (_la - 267)) & ((1L << (SIGNED_SYMBOL - 267)) | (1L << (UNSIGNED_SYMBOL - 267)) | (1L << (ZEROFILL_SYMBOL - 267)))) != 0)) {
					{
					setState(2111);
					fieldOptions();
					}
				}

				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2114);
				((DataTypeContext)_localctx).type = match(DATE_SYMBOL);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2115);
				((DataTypeContext)_localctx).type = match(TIME_SYMBOL);
				setState(2117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(2116);
					typeDatetimePrecision();
					}
				}

				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2119);
				((DataTypeContext)_localctx).type = match(TIMESTAMP_SYMBOL);
				setState(2121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(2120);
					typeDatetimePrecision();
					}
				}

				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2123);
				((DataTypeContext)_localctx).type = match(DATETIME_SYMBOL);
				setState(2125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(2124);
					typeDatetimePrecision();
					}
				}

				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2127);
				((DataTypeContext)_localctx).type = match(TINYBLOB_SYMBOL);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2128);
				((DataTypeContext)_localctx).type = match(BLOB_SYMBOL);
				setState(2130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(2129);
					fieldLength();
					}
				}

				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2132);
				((DataTypeContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MEDIUMBLOB_SYMBOL || _la==LONGBLOB_SYMBOL) ) {
					((DataTypeContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2133);
				((DataTypeContext)_localctx).type = match(LONG_SYMBOL);
				setState(2134);
				match(VARBINARY_SYMBOL);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2135);
				((DataTypeContext)_localctx).type = match(LONG_SYMBOL);
				setState(2139);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
				case 1:
					{
					setState(2136);
					match(CHAR_SYMBOL);
					setState(2137);
					match(VARYING_SYMBOL);
					}
					break;
				case 2:
					{
					setState(2138);
					match(VARCHAR_SYMBOL);
					}
					break;
				}
				setState(2142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY_SYMBOL || _la==CHAR_SYMBOL || _la==ASCII_SYMBOL || _la==CHARSET_SYMBOL || _la==BYTE_SYMBOL || _la==UNICODE_SYMBOL) {
					{
					setState(2141);
					charsetWithOptBinary();
					}
				}

				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2144);
				((DataTypeContext)_localctx).type = match(TINYTEXT_SYMBOL);
				setState(2146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY_SYMBOL || _la==CHAR_SYMBOL || _la==ASCII_SYMBOL || _la==CHARSET_SYMBOL || _la==BYTE_SYMBOL || _la==UNICODE_SYMBOL) {
					{
					setState(2145);
					charsetWithOptBinary();
					}
				}

				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2148);
				((DataTypeContext)_localctx).type = match(TEXT_SYMBOL);
				setState(2150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR_SYMBOL) {
					{
					setState(2149);
					fieldLength();
					}
				}

				setState(2153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY_SYMBOL || _la==CHAR_SYMBOL || _la==ASCII_SYMBOL || _la==CHARSET_SYMBOL || _la==BYTE_SYMBOL || _la==UNICODE_SYMBOL) {
					{
					setState(2152);
					charsetWithOptBinary();
					}
				}

				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2155);
				((DataTypeContext)_localctx).type = match(MEDIUMTEXT_SYMBOL);
				setState(2157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY_SYMBOL || _la==CHAR_SYMBOL || _la==ASCII_SYMBOL || _la==CHARSET_SYMBOL || _la==BYTE_SYMBOL || _la==UNICODE_SYMBOL) {
					{
					setState(2156);
					charsetWithOptBinary();
					}
				}

				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2159);
				((DataTypeContext)_localctx).type = match(LONGTEXT_SYMBOL);
				setState(2161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY_SYMBOL || _la==CHAR_SYMBOL || _la==ASCII_SYMBOL || _la==CHARSET_SYMBOL || _la==BYTE_SYMBOL || _la==UNICODE_SYMBOL) {
					{
					setState(2160);
					charsetWithOptBinary();
					}
				}

				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2163);
				((DataTypeContext)_localctx).type = match(ENUM_SYMBOL);
				setState(2164);
				stringList();
				setState(2166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY_SYMBOL || _la==CHAR_SYMBOL || _la==ASCII_SYMBOL || _la==CHARSET_SYMBOL || _la==BYTE_SYMBOL || _la==UNICODE_SYMBOL) {
					{
					setState(2165);
					charsetWithOptBinary();
					}
				}

				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2168);
				((DataTypeContext)_localctx).type = match(SET_SYMBOL);
				setState(2169);
				stringList();
				setState(2171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY_SYMBOL || _la==CHAR_SYMBOL || _la==ASCII_SYMBOL || _la==CHARSET_SYMBOL || _la==BYTE_SYMBOL || _la==UNICODE_SYMBOL) {
					{
					setState(2170);
					charsetWithOptBinary();
					}
				}

				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2173);
				((DataTypeContext)_localctx).type = match(SERIAL_SYMBOL);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2174);
				((DataTypeContext)_localctx).type = match(JSON_SYMBOL);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2175);
				((DataTypeContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 250)) & ~0x3f) == 0 && ((1L << (_la - 250)) & ((1L << (GEOMETRYCOLLECTION_SYMBOL - 250)) | (1L << (LINESTRING_SYMBOL - 250)) | (1L << (MULTILINESTRING_SYMBOL - 250)) | (1L << (MULTIPOINT_SYMBOL - 250)) | (1L << (MULTIPOLYGON_SYMBOL - 250)) | (1L << (POINT_SYMBOL - 250)) | (1L << (POLYGON_SYMBOL - 250)) | (1L << (GEOMETRY_SYMBOL - 250)))) != 0)) ) {
					((DataTypeContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NcharContext extends ParserRuleContext {
		public Token type;
		public TerminalNode NCHAR_SYMBOL() { return getToken(SQLSelectParser.NCHAR_SYMBOL, 0); }
		public TerminalNode CHAR_SYMBOL() { return getToken(SQLSelectParser.CHAR_SYMBOL, 0); }
		public TerminalNode NATIONAL_SYMBOL() { return getToken(SQLSelectParser.NATIONAL_SYMBOL, 0); }
		public NcharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nchar; }
	}

	public final NcharContext nchar() throws RecognitionException {
		NcharContext _localctx = new NcharContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_nchar);
		try {
			setState(2181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NCHAR_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2178);
				((NcharContext)_localctx).type = match(NCHAR_SYMBOL);
				}
				break;
			case NATIONAL_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2179);
				((NcharContext)_localctx).type = match(NATIONAL_SYMBOL);
				setState(2180);
				match(CHAR_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealTypeContext extends ParserRuleContext {
		public Token type;
		public TerminalNode REAL_SYMBOL() { return getToken(SQLSelectParser.REAL_SYMBOL, 0); }
		public TerminalNode DOUBLE_SYMBOL() { return getToken(SQLSelectParser.DOUBLE_SYMBOL, 0); }
		public TerminalNode PRECISION_SYMBOL() { return getToken(SQLSelectParser.PRECISION_SYMBOL, 0); }
		public RealTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realType; }
	}

	public final RealTypeContext realType() throws RecognitionException {
		RealTypeContext _localctx = new RealTypeContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_realType);
		int _la;
		try {
			setState(2188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2183);
				((RealTypeContext)_localctx).type = match(REAL_SYMBOL);
				}
				break;
			case DOUBLE_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2184);
				((RealTypeContext)_localctx).type = match(DOUBLE_SYMBOL);
				setState(2186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRECISION_SYMBOL) {
					{
					setState(2185);
					match(PRECISION_SYMBOL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldLengthContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public Real_ulonglong_numberContext real_ulonglong_number() {
			return getRuleContext(Real_ulonglong_numberContext.class,0);
		}
		public TerminalNode DECIMAL_NUMBER() { return getToken(SQLSelectParser.DECIMAL_NUMBER, 0); }
		public FieldLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldLength; }
	}

	public final FieldLengthContext fieldLength() throws RecognitionException {
		FieldLengthContext _localctx = new FieldLengthContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_fieldLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2190);
			match(OPEN_PAR_SYMBOL);
			setState(2193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEX_NUMBER:
			case INT_NUMBER:
				{
				setState(2191);
				real_ulonglong_number();
				}
				break;
			case DECIMAL_NUMBER:
				{
				setState(2192);
				match(DECIMAL_NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2195);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldOptionsContext extends ParserRuleContext {
		public List<TerminalNode> SIGNED_SYMBOL() { return getTokens(SQLSelectParser.SIGNED_SYMBOL); }
		public TerminalNode SIGNED_SYMBOL(int i) {
			return getToken(SQLSelectParser.SIGNED_SYMBOL, i);
		}
		public List<TerminalNode> UNSIGNED_SYMBOL() { return getTokens(SQLSelectParser.UNSIGNED_SYMBOL); }
		public TerminalNode UNSIGNED_SYMBOL(int i) {
			return getToken(SQLSelectParser.UNSIGNED_SYMBOL, i);
		}
		public List<TerminalNode> ZEROFILL_SYMBOL() { return getTokens(SQLSelectParser.ZEROFILL_SYMBOL); }
		public TerminalNode ZEROFILL_SYMBOL(int i) {
			return getToken(SQLSelectParser.ZEROFILL_SYMBOL, i);
		}
		public FieldOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldOptions; }
	}

	public final FieldOptionsContext fieldOptions() throws RecognitionException {
		FieldOptionsContext _localctx = new FieldOptionsContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_fieldOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2198); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2197);
				_la = _input.LA(1);
				if ( !(((((_la - 267)) & ~0x3f) == 0 && ((1L << (_la - 267)) & ((1L << (SIGNED_SYMBOL - 267)) | (1L << (UNSIGNED_SYMBOL - 267)) | (1L << (ZEROFILL_SYMBOL - 267)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(2200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 267)) & ~0x3f) == 0 && ((1L << (_la - 267)) & ((1L << (SIGNED_SYMBOL - 267)) | (1L << (UNSIGNED_SYMBOL - 267)) | (1L << (ZEROFILL_SYMBOL - 267)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharsetWithOptBinaryContext extends ParserRuleContext {
		public AsciiContext ascii() {
			return getRuleContext(AsciiContext.class,0);
		}
		public UnicodeContext unicode() {
			return getRuleContext(UnicodeContext.class,0);
		}
		public TerminalNode BYTE_SYMBOL() { return getToken(SQLSelectParser.BYTE_SYMBOL, 0); }
		public CharsetContext charset() {
			return getRuleContext(CharsetContext.class,0);
		}
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public TerminalNode BINARY_SYMBOL() { return getToken(SQLSelectParser.BINARY_SYMBOL, 0); }
		public CharsetWithOptBinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charsetWithOptBinary; }
	}

	public final CharsetWithOptBinaryContext charsetWithOptBinary() throws RecognitionException {
		CharsetWithOptBinaryContext _localctx = new CharsetWithOptBinaryContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_charsetWithOptBinary);
		int _la;
		try {
			setState(2216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2202);
				ascii();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2203);
				unicode();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2204);
				match(BYTE_SYMBOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2205);
				charset();
				setState(2206);
				charsetName();
				setState(2208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY_SYMBOL) {
					{
					setState(2207);
					match(BINARY_SYMBOL);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2210);
				match(BINARY_SYMBOL);
				setState(2214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHAR_SYMBOL || _la==CHARSET_SYMBOL) {
					{
					setState(2211);
					charset();
					setState(2212);
					charsetName();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsciiContext extends ParserRuleContext {
		public TerminalNode ASCII_SYMBOL() { return getToken(SQLSelectParser.ASCII_SYMBOL, 0); }
		public TerminalNode BINARY_SYMBOL() { return getToken(SQLSelectParser.BINARY_SYMBOL, 0); }
		public AsciiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ascii; }
	}

	public final AsciiContext ascii() throws RecognitionException {
		AsciiContext _localctx = new AsciiContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_ascii);
		int _la;
		try {
			setState(2224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2218);
				match(ASCII_SYMBOL);
				setState(2220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY_SYMBOL) {
					{
					setState(2219);
					match(BINARY_SYMBOL);
					}
				}

				}
				break;
			case BINARY_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2222);
				match(BINARY_SYMBOL);
				setState(2223);
				match(ASCII_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnicodeContext extends ParserRuleContext {
		public TerminalNode UNICODE_SYMBOL() { return getToken(SQLSelectParser.UNICODE_SYMBOL, 0); }
		public TerminalNode BINARY_SYMBOL() { return getToken(SQLSelectParser.BINARY_SYMBOL, 0); }
		public UnicodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unicode; }
	}

	public final UnicodeContext unicode() throws RecognitionException {
		UnicodeContext _localctx = new UnicodeContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_unicode);
		int _la;
		try {
			setState(2232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNICODE_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2226);
				match(UNICODE_SYMBOL);
				setState(2228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BINARY_SYMBOL) {
					{
					setState(2227);
					match(BINARY_SYMBOL);
					}
				}

				}
				break;
			case BINARY_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2230);
				match(BINARY_SYMBOL);
				setState(2231);
				match(UNICODE_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WsNumCodepointsContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public Real_ulong_numberContext real_ulong_number() {
			return getRuleContext(Real_ulong_numberContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public WsNumCodepointsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wsNumCodepoints; }
	}

	public final WsNumCodepointsContext wsNumCodepoints() throws RecognitionException {
		WsNumCodepointsContext _localctx = new WsNumCodepointsContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_wsNumCodepoints);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2234);
			match(OPEN_PAR_SYMBOL);
			setState(2235);
			real_ulong_number();
			setState(2236);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDatetimePrecisionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public TerminalNode INT_NUMBER() { return getToken(SQLSelectParser.INT_NUMBER, 0); }
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public TypeDatetimePrecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDatetimePrecision; }
	}

	public final TypeDatetimePrecisionContext typeDatetimePrecision() throws RecognitionException {
		TypeDatetimePrecisionContext _localctx = new TypeDatetimePrecisionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_typeDatetimePrecision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2238);
			match(OPEN_PAR_SYMBOL);
			setState(2239);
			match(INT_NUMBER);
			setState(2240);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharsetNameContext extends ParserRuleContext {
		public TextOrIdentifierContext textOrIdentifier() {
			return getRuleContext(TextOrIdentifierContext.class,0);
		}
		public TerminalNode BINARY_SYMBOL() { return getToken(SQLSelectParser.BINARY_SYMBOL, 0); }
		public TerminalNode DEFAULT_SYMBOL() { return getToken(SQLSelectParser.DEFAULT_SYMBOL, 0); }
		public CharsetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charsetName; }
	}

	public final CharsetNameContext charsetName() throws RecognitionException {
		CharsetNameContext _localctx = new CharsetNameContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_charsetName);
		try {
			setState(2245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2242);
				textOrIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2243);
				match(BINARY_SYMBOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2244);
				match(DEFAULT_SYMBOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollationNameContext extends ParserRuleContext {
		public TextOrIdentifierContext textOrIdentifier() {
			return getRuleContext(TextOrIdentifierContext.class,0);
		}
		public TerminalNode DEFAULT_SYMBOL() { return getToken(SQLSelectParser.DEFAULT_SYMBOL, 0); }
		public TerminalNode BINARY_SYMBOL() { return getToken(SQLSelectParser.BINARY_SYMBOL, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_collationName);
		try {
			setState(2250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2247);
				textOrIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2248);
				match(DEFAULT_SYMBOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2249);
				match(BINARY_SYMBOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollateContext extends ParserRuleContext {
		public TerminalNode COLLATE_SYMBOL() { return getToken(SQLSelectParser.COLLATE_SYMBOL, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public CollateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collate; }
	}

	public final CollateContext collate() throws RecognitionException {
		CollateContext _localctx = new CollateContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_collate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2252);
			match(COLLATE_SYMBOL);
			setState(2253);
			collationName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharsetClauseContext extends ParserRuleContext {
		public CharsetContext charset() {
			return getRuleContext(CharsetContext.class,0);
		}
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public CharsetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charsetClause; }
	}

	public final CharsetClauseContext charsetClause() throws RecognitionException {
		CharsetClauseContext _localctx = new CharsetClauseContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_charsetClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2255);
			charset();
			setState(2256);
			charsetName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldsClauseContext extends ParserRuleContext {
		public TerminalNode COLUMNS_SYMBOL() { return getToken(SQLSelectParser.COLUMNS_SYMBOL, 0); }
		public List<FieldTermContext> fieldTerm() {
			return getRuleContexts(FieldTermContext.class);
		}
		public FieldTermContext fieldTerm(int i) {
			return getRuleContext(FieldTermContext.class,i);
		}
		public FieldsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldsClause; }
	}

	public final FieldsClauseContext fieldsClause() throws RecognitionException {
		FieldsClauseContext _localctx = new FieldsClauseContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_fieldsClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2258);
			match(COLUMNS_SYMBOL);
			setState(2260); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2259);
				fieldTerm();
				}
				}
				setState(2262); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 315)) & ~0x3f) == 0 && ((1L << (_la - 315)) & ((1L << (TERMINATED_SYMBOL - 315)) | (1L << (OPTIONALLY_SYMBOL - 315)) | (1L << (ENCLOSED_SYMBOL - 315)) | (1L << (ESCAPED_SYMBOL - 315)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldTermContext extends ParserRuleContext {
		public TerminalNode TERMINATED_SYMBOL() { return getToken(SQLSelectParser.TERMINATED_SYMBOL, 0); }
		public TerminalNode BY_SYMBOL() { return getToken(SQLSelectParser.BY_SYMBOL, 0); }
		public TextStringContext textString() {
			return getRuleContext(TextStringContext.class,0);
		}
		public TerminalNode ENCLOSED_SYMBOL() { return getToken(SQLSelectParser.ENCLOSED_SYMBOL, 0); }
		public TerminalNode OPTIONALLY_SYMBOL() { return getToken(SQLSelectParser.OPTIONALLY_SYMBOL, 0); }
		public TerminalNode ESCAPED_SYMBOL() { return getToken(SQLSelectParser.ESCAPED_SYMBOL, 0); }
		public FieldTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldTerm; }
	}

	public final FieldTermContext fieldTerm() throws RecognitionException {
		FieldTermContext _localctx = new FieldTermContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_fieldTerm);
		int _la;
		try {
			setState(2276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TERMINATED_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2264);
				match(TERMINATED_SYMBOL);
				setState(2265);
				match(BY_SYMBOL);
				setState(2266);
				textString();
				}
				break;
			case OPTIONALLY_SYMBOL:
			case ENCLOSED_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONALLY_SYMBOL) {
					{
					setState(2267);
					match(OPTIONALLY_SYMBOL);
					}
				}

				setState(2270);
				match(ENCLOSED_SYMBOL);
				setState(2271);
				match(BY_SYMBOL);
				setState(2272);
				textString();
				}
				break;
			case ESCAPED_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2273);
				match(ESCAPED_SYMBOL);
				setState(2274);
				match(BY_SYMBOL);
				setState(2275);
				textString();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinesClauseContext extends ParserRuleContext {
		public TerminalNode LINES_SYMBOL() { return getToken(SQLSelectParser.LINES_SYMBOL, 0); }
		public List<LineTermContext> lineTerm() {
			return getRuleContexts(LineTermContext.class);
		}
		public LineTermContext lineTerm(int i) {
			return getRuleContext(LineTermContext.class,i);
		}
		public LinesClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linesClause; }
	}

	public final LinesClauseContext linesClause() throws RecognitionException {
		LinesClauseContext _localctx = new LinesClauseContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_linesClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2278);
			match(LINES_SYMBOL);
			setState(2280); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2279);
				lineTerm();
				}
				}
				setState(2282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TERMINATED_SYMBOL || _la==STARTING_SYMBOL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineTermContext extends ParserRuleContext {
		public TerminalNode BY_SYMBOL() { return getToken(SQLSelectParser.BY_SYMBOL, 0); }
		public TextStringContext textString() {
			return getRuleContext(TextStringContext.class,0);
		}
		public TerminalNode TERMINATED_SYMBOL() { return getToken(SQLSelectParser.TERMINATED_SYMBOL, 0); }
		public TerminalNode STARTING_SYMBOL() { return getToken(SQLSelectParser.STARTING_SYMBOL, 0); }
		public LineTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineTerm; }
	}

	public final LineTermContext lineTerm() throws RecognitionException {
		LineTermContext _localctx = new LineTermContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_lineTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2284);
			_la = _input.LA(1);
			if ( !(_la==TERMINATED_SYMBOL || _la==STARTING_SYMBOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2285);
			match(BY_SYMBOL);
			setState(2286);
			textString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsePartitionContext extends ParserRuleContext {
		public TerminalNode PARTITION_SYMBOL() { return getToken(SQLSelectParser.PARTITION_SYMBOL, 0); }
		public IdentifierListWithParenthesesContext identifierListWithParentheses() {
			return getRuleContext(IdentifierListWithParenthesesContext.class,0);
		}
		public UsePartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usePartition; }
	}

	public final UsePartitionContext usePartition() throws RecognitionException {
		UsePartitionContext _localctx = new UsePartitionContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_usePartition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2288);
			match(PARTITION_SYMBOL);
			setState(2289);
			identifierListWithParentheses();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnInternalRefListContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public ColumnInternalRefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnInternalRefList; }
	}

	public final ColumnInternalRefListContext columnInternalRefList() throws RecognitionException {
		ColumnInternalRefListContext _localctx = new ColumnInternalRefListContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_columnInternalRefList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2291);
			match(OPEN_PAR_SYMBOL);
			setState(2292);
			identifier();
			setState(2297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(2293);
				match(COMMA_SYMBOL);
				setState(2294);
				identifier();
				}
				}
				setState(2299);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2300);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasRefListContext extends ParserRuleContext {
		public List<QualifiedIdentifierContext> qualifiedIdentifier() {
			return getRuleContexts(QualifiedIdentifierContext.class);
		}
		public QualifiedIdentifierContext qualifiedIdentifier(int i) {
			return getRuleContext(QualifiedIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public TableAliasRefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAliasRefList; }
	}

	public final TableAliasRefListContext tableAliasRefList() throws RecognitionException {
		TableAliasRefListContext _localctx = new TableAliasRefListContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_tableAliasRefList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2302);
			qualifiedIdentifier();
			setState(2307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(2303);
				match(COMMA_SYMBOL);
				setState(2304);
				qualifiedIdentifier();
				}
				}
				setState(2309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PureIdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLSelectParser.IDENTIFIER, 0); }
		public TerminalNode BACK_TICK_QUOTED_ID() { return getToken(SQLSelectParser.BACK_TICK_QUOTED_ID, 0); }
		public TerminalNode SINGLE_QUOTED_TEXT() { return getToken(SQLSelectParser.SINGLE_QUOTED_TEXT, 0); }
		public TerminalNode DOUBLE_QUOTED_TEXT() { return getToken(SQLSelectParser.DOUBLE_QUOTED_TEXT, 0); }
		public TerminalNode BRACKET_QUOTED_TEXT() { return getToken(SQLSelectParser.BRACKET_QUOTED_TEXT, 0); }
		public PureIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pureIdentifier; }
	}

	public final PureIdentifierContext pureIdentifier() throws RecognitionException {
		PureIdentifierContext _localctx = new PureIdentifierContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_pureIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2310);
			_la = _input.LA(1);
			if ( !(((((_la - 327)) & ~0x3f) == 0 && ((1L << (_la - 327)) & ((1L << (IDENTIFIER - 327)) | (1L << (BACK_TICK_QUOTED_ID - 327)) | (1L << (DOUBLE_QUOTED_TEXT - 327)) | (1L << (SINGLE_QUOTED_TEXT - 327)) | (1L << (BRACKET_QUOTED_TEXT - 327)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public PureIdentifierContext pureIdentifier() {
			return getRuleContext(PureIdentifierContext.class,0);
		}
		public IdentifierKeywordContext identifierKeyword() {
			return getRuleContext(IdentifierKeywordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_identifier);
		try {
			setState(2314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case BACK_TICK_QUOTED_ID:
			case DOUBLE_QUOTED_TEXT:
			case SINGLE_QUOTED_TEXT:
			case BRACKET_QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2312);
				pureIdentifier();
				}
				break;
			case TINYINT_SYMBOL:
			case SMALLINT_SYMBOL:
			case MEDIUMINT_SYMBOL:
			case INT_SYMBOL:
			case BIGINT_SYMBOL:
			case SECOND_SYMBOL:
			case MINUTE_SYMBOL:
			case HOUR_SYMBOL:
			case DAY_SYMBOL:
			case WEEK_SYMBOL:
			case MONTH_SYMBOL:
			case QUARTER_SYMBOL:
			case YEAR_SYMBOL:
			case DEFAULT_SYMBOL:
			case UNION_SYMBOL:
			case SELECT_SYMBOL:
			case ALL_SYMBOL:
			case DISTINCT_SYMBOL:
			case STRAIGHT_JOIN_SYMBOL:
			case HIGH_PRIORITY_SYMBOL:
			case SQL_SMALL_RESULT_SYMBOL:
			case SQL_BIG_RESULT_SYMBOL:
			case SQL_BUFFER_RESULT_SYMBOL:
			case SQL_CALC_FOUND_ROWS_SYMBOL:
			case LIMIT_SYMBOL:
			case OFFSET_SYMBOL:
			case INTO_SYMBOL:
			case OUTFILE_SYMBOL:
			case DUMPFILE_SYMBOL:
			case PROCEDURE_SYMBOL:
			case ANALYSE_SYMBOL:
			case HAVING_SYMBOL:
			case WINDOW_SYMBOL:
			case AS_SYMBOL:
			case PARTITION_SYMBOL:
			case BY_SYMBOL:
			case ROWS_SYMBOL:
			case RANGE_SYMBOL:
			case GROUPS_SYMBOL:
			case UNBOUNDED_SYMBOL:
			case PRECEDING_SYMBOL:
			case INTERVAL_SYMBOL:
			case CURRENT_SYMBOL:
			case ROW_SYMBOL:
			case BETWEEN_SYMBOL:
			case AND_SYMBOL:
			case FOLLOWING_SYMBOL:
			case EXCLUDE_SYMBOL:
			case GROUP_SYMBOL:
			case TIES_SYMBOL:
			case NO_SYMBOL:
			case OTHERS_SYMBOL:
			case WITH_SYMBOL:
			case RECURSIVE_SYMBOL:
			case ROLLUP_SYMBOL:
			case CUBE_SYMBOL:
			case ORDER_SYMBOL:
			case ASC_SYMBOL:
			case DESC_SYMBOL:
			case FROM_SYMBOL:
			case DUAL_SYMBOL:
			case VALUES_SYMBOL:
			case TABLE_SYMBOL:
			case SQL_NO_CACHE_SYMBOL:
			case SQL_CACHE_SYMBOL:
			case MAX_STATEMENT_TIME_SYMBOL:
			case FOR_SYMBOL:
			case OF_SYMBOL:
			case LOCK_SYMBOL:
			case IN_SYMBOL:
			case SHARE_SYMBOL:
			case MODE_SYMBOL:
			case UPDATE_SYMBOL:
			case SKIP_SYMBOL:
			case LOCKED_SYMBOL:
			case NOWAIT_SYMBOL:
			case WHERE_SYMBOL:
			case OJ_SYMBOL:
			case ON_SYMBOL:
			case USING_SYMBOL:
			case NATURAL_SYMBOL:
			case INNER_SYMBOL:
			case JOIN_SYMBOL:
			case LEFT_SYMBOL:
			case RIGHT_SYMBOL:
			case OUTER_SYMBOL:
			case CROSS_SYMBOL:
			case LATERAL_SYMBOL:
			case JSON_TABLE_SYMBOL:
			case COLUMNS_SYMBOL:
			case ORDINALITY_SYMBOL:
			case EXISTS_SYMBOL:
			case PATH_SYMBOL:
			case NESTED_SYMBOL:
			case EMPTY_SYMBOL:
			case ERROR_SYMBOL:
			case NULL_SYMBOL:
			case USE_SYMBOL:
			case FORCE_SYMBOL:
			case IGNORE_SYMBOL:
			case KEY_SYMBOL:
			case INDEX_SYMBOL:
			case PRIMARY_SYMBOL:
			case IS_SYMBOL:
			case TRUE_SYMBOL:
			case FALSE_SYMBOL:
			case UNKNOWN_SYMBOL:
			case NOT_SYMBOL:
			case XOR_SYMBOL:
			case OR_SYMBOL:
			case ANY_SYMBOL:
			case MEMBER_SYMBOL:
			case SOUNDS_SYMBOL:
			case LIKE_SYMBOL:
			case ESCAPE_SYMBOL:
			case REGEXP_SYMBOL:
			case DIV_SYMBOL:
			case MOD_SYMBOL:
			case MATCH_SYMBOL:
			case AGAINST_SYMBOL:
			case BINARY_SYMBOL:
			case CAST_SYMBOL:
			case ARRAY_SYMBOL:
			case CASE_SYMBOL:
			case END_SYMBOL:
			case CONVERT_SYMBOL:
			case COLLATE_SYMBOL:
			case AVG_SYMBOL:
			case BIT_AND_SYMBOL:
			case BIT_OR_SYMBOL:
			case BIT_XOR_SYMBOL:
			case COUNT_SYMBOL:
			case MIN_SYMBOL:
			case MAX_SYMBOL:
			case STD_SYMBOL:
			case VARIANCE_SYMBOL:
			case STDDEV_SAMP_SYMBOL:
			case VAR_SAMP_SYMBOL:
			case SUM_SYMBOL:
			case GROUP_CONCAT_SYMBOL:
			case SEPARATOR_SYMBOL:
			case GROUPING_SYMBOL:
			case ROW_NUMBER_SYMBOL:
			case RANK_SYMBOL:
			case DENSE_RANK_SYMBOL:
			case CUME_DIST_SYMBOL:
			case PERCENT_RANK_SYMBOL:
			case NTILE_SYMBOL:
			case LEAD_SYMBOL:
			case LAG_SYMBOL:
			case FIRST_VALUE_SYMBOL:
			case LAST_VALUE_SYMBOL:
			case NTH_VALUE_SYMBOL:
			case FIRST_SYMBOL:
			case LAST_SYMBOL:
			case OVER_SYMBOL:
			case RESPECT_SYMBOL:
			case NULLS_SYMBOL:
			case JSON_ARRAYAGG_SYMBOL:
			case JSON_OBJECTAGG_SYMBOL:
			case BOOLEAN_SYMBOL:
			case LANGUAGE_SYMBOL:
			case QUERY_SYMBOL:
			case EXPANSION_SYMBOL:
			case CHAR_SYMBOL:
			case CURRENT_USER_SYMBOL:
			case DATE_SYMBOL:
			case INSERT_SYMBOL:
			case TIME_SYMBOL:
			case TIMESTAMP_SYMBOL:
			case USER_SYMBOL:
			case ADDDATE_SYMBOL:
			case SUBDATE_SYMBOL:
			case CURDATE_SYMBOL:
			case CURTIME_SYMBOL:
			case DATE_ADD_SYMBOL:
			case DATE_SUB_SYMBOL:
			case EXTRACT_SYMBOL:
			case GET_FORMAT_SYMBOL:
			case NOW_SYMBOL:
			case POSITION_SYMBOL:
			case SYSDATE_SYMBOL:
			case TIMESTAMP_ADD_SYMBOL:
			case TIMESTAMP_DIFF_SYMBOL:
			case UTC_DATE_SYMBOL:
			case UTC_TIME_SYMBOL:
			case UTC_TIMESTAMP_SYMBOL:
			case ASCII_SYMBOL:
			case CHARSET_SYMBOL:
			case COALESCE_SYMBOL:
			case COLLATION_SYMBOL:
			case DATABASE_SYMBOL:
			case IF_SYMBOL:
			case FORMAT_SYMBOL:
			case MICROSECOND_SYMBOL:
			case OLD_PASSWORD_SYMBOL:
			case PASSWORD_SYMBOL:
			case REPEAT_SYMBOL:
			case REPLACE_SYMBOL:
			case REVERSE_SYMBOL:
			case ROW_COUNT_SYMBOL:
			case TRUNCATE_SYMBOL:
			case WEIGHT_STRING_SYMBOL:
			case CONTAINS_SYMBOL:
			case GEOMETRYCOLLECTION_SYMBOL:
			case LINESTRING_SYMBOL:
			case MULTILINESTRING_SYMBOL:
			case MULTIPOINT_SYMBOL:
			case MULTIPOLYGON_SYMBOL:
			case POINT_SYMBOL:
			case POLYGON_SYMBOL:
			case LEVEL_SYMBOL:
			case DATETIME_SYMBOL:
			case TRIM_SYMBOL:
			case LEADING_SYMBOL:
			case TRAILING_SYMBOL:
			case BOTH_SYMBOL:
			case SUBSTRING_SYMBOL:
			case WHEN_SYMBOL:
			case THEN_SYMBOL:
			case ELSE_SYMBOL:
			case SIGNED_SYMBOL:
			case UNSIGNED_SYMBOL:
			case DECIMAL_SYMBOL:
			case JSON_SYMBOL:
			case FLOAT_SYMBOL:
			case SET_SYMBOL:
			case SECOND_MICROSECOND_SYMBOL:
			case MINUTE_MICROSECOND_SYMBOL:
			case MINUTE_SECOND_SYMBOL:
			case HOUR_MICROSECOND_SYMBOL:
			case HOUR_SECOND_SYMBOL:
			case HOUR_MINUTE_SYMBOL:
			case DAY_MICROSECOND_SYMBOL:
			case DAY_SECOND_SYMBOL:
			case DAY_MINUTE_SYMBOL:
			case DAY_HOUR_SYMBOL:
			case YEAR_MONTH_SYMBOL:
			case BTREE_SYMBOL:
			case RTREE_SYMBOL:
			case HASH_SYMBOL:
			case REAL_SYMBOL:
			case DOUBLE_SYMBOL:
			case PRECISION_SYMBOL:
			case NUMERIC_SYMBOL:
			case FIXED_SYMBOL:
			case BIT_SYMBOL:
			case BOOL_SYMBOL:
			case VARYING_SYMBOL:
			case VARCHAR_SYMBOL:
			case NATIONAL_SYMBOL:
			case NVARCHAR_SYMBOL:
			case NCHAR_SYMBOL:
			case VARBINARY_SYMBOL:
			case TINYBLOB_SYMBOL:
			case BLOB_SYMBOL:
			case MEDIUMBLOB_SYMBOL:
			case LONGBLOB_SYMBOL:
			case LONG_SYMBOL:
			case TINYTEXT_SYMBOL:
			case TEXT_SYMBOL:
			case MEDIUMTEXT_SYMBOL:
			case LONGTEXT_SYMBOL:
			case ENUM_SYMBOL:
			case SERIAL_SYMBOL:
			case GEOMETRY_SYMBOL:
			case ZEROFILL_SYMBOL:
			case BYTE_SYMBOL:
			case UNICODE_SYMBOL:
			case TERMINATED_SYMBOL:
			case OPTIONALLY_SYMBOL:
			case ENCLOSED_SYMBOL:
			case ESCAPED_SYMBOL:
			case LINES_SYMBOL:
			case STARTING_SYMBOL:
			case GLOBAL_SYMBOL:
			case LOCAL_SYMBOL:
			case SESSION_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2313);
				identifierKeyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2316);
			identifier();
			setState(2321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(2317);
				match(COMMA_SYMBOL);
				setState(2318);
				identifier();
				}
				}
				setState(2323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListWithParenthesesContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public IdentifierListWithParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierListWithParentheses; }
	}

	public final IdentifierListWithParenthesesContext identifierListWithParentheses() throws RecognitionException {
		IdentifierListWithParenthesesContext _localctx = new IdentifierListWithParenthesesContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_identifierListWithParentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2324);
			match(OPEN_PAR_SYMBOL);
			setState(2325);
			identifierList();
			setState(2326);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedIdentifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT_SYMBOL() { return getTokens(SQLSelectParser.DOT_SYMBOL); }
		public TerminalNode DOT_SYMBOL(int i) {
			return getToken(SQLSelectParser.DOT_SYMBOL, i);
		}
		public TerminalNode MULT_OPERATOR() { return getToken(SQLSelectParser.MULT_OPERATOR, 0); }
		public QualifiedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdentifier; }
	}

	public final QualifiedIdentifierContext qualifiedIdentifier() throws RecognitionException {
		QualifiedIdentifierContext _localctx = new QualifiedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_qualifiedIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2328);
			identifier();
			setState(2333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2329);
					match(DOT_SYMBOL);
					setState(2330);
					identifier();
					}
					} 
				}
				setState(2335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			}
			setState(2338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				{
				setState(2336);
				match(DOT_SYMBOL);
				setState(2337);
				match(MULT_OPERATOR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DotIdentifierContext extends ParserRuleContext {
		public TerminalNode DOT_SYMBOL() { return getToken(SQLSelectParser.DOT_SYMBOL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DotIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotIdentifier; }
	}

	public final DotIdentifierContext dotIdentifier() throws RecognitionException {
		DotIdentifierContext _localctx = new DotIdentifierContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_dotIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2340);
			match(DOT_SYMBOL);
			setState(2341);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ulong_numberContext extends ParserRuleContext {
		public TerminalNode INT_NUMBER() { return getToken(SQLSelectParser.INT_NUMBER, 0); }
		public TerminalNode HEX_NUMBER() { return getToken(SQLSelectParser.HEX_NUMBER, 0); }
		public TerminalNode DECIMAL_NUMBER() { return getToken(SQLSelectParser.DECIMAL_NUMBER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(SQLSelectParser.FLOAT_NUMBER, 0); }
		public Ulong_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ulong_number; }
	}

	public final Ulong_numberContext ulong_number() throws RecognitionException {
		Ulong_numberContext _localctx = new Ulong_numberContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_ulong_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2343);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HEX_NUMBER) | (1L << INT_NUMBER) | (1L << DECIMAL_NUMBER) | (1L << FLOAT_NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Real_ulong_numberContext extends ParserRuleContext {
		public TerminalNode INT_NUMBER() { return getToken(SQLSelectParser.INT_NUMBER, 0); }
		public TerminalNode HEX_NUMBER() { return getToken(SQLSelectParser.HEX_NUMBER, 0); }
		public Real_ulong_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_ulong_number; }
	}

	public final Real_ulong_numberContext real_ulong_number() throws RecognitionException {
		Real_ulong_numberContext _localctx = new Real_ulong_numberContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_real_ulong_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2345);
			_la = _input.LA(1);
			if ( !(_la==HEX_NUMBER || _la==INT_NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ulonglong_numberContext extends ParserRuleContext {
		public TerminalNode INT_NUMBER() { return getToken(SQLSelectParser.INT_NUMBER, 0); }
		public TerminalNode DECIMAL_NUMBER() { return getToken(SQLSelectParser.DECIMAL_NUMBER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(SQLSelectParser.FLOAT_NUMBER, 0); }
		public Ulonglong_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ulonglong_number; }
	}

	public final Ulonglong_numberContext ulonglong_number() throws RecognitionException {
		Ulonglong_numberContext _localctx = new Ulonglong_numberContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_ulonglong_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2347);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_NUMBER) | (1L << DECIMAL_NUMBER) | (1L << FLOAT_NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Real_ulonglong_numberContext extends ParserRuleContext {
		public TerminalNode INT_NUMBER() { return getToken(SQLSelectParser.INT_NUMBER, 0); }
		public TerminalNode HEX_NUMBER() { return getToken(SQLSelectParser.HEX_NUMBER, 0); }
		public Real_ulonglong_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_ulonglong_number; }
	}

	public final Real_ulonglong_numberContext real_ulonglong_number() throws RecognitionException {
		Real_ulonglong_numberContext _localctx = new Real_ulonglong_numberContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_real_ulonglong_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2349);
			_la = _input.LA(1);
			if ( !(_la==HEX_NUMBER || _la==INT_NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TextLiteralContext textLiteral() {
			return getRuleContext(TextLiteralContext.class,0);
		}
		public NumLiteralContext numLiteral() {
			return getRuleContext(NumLiteralContext.class,0);
		}
		public TemporalLiteralContext temporalLiteral() {
			return getRuleContext(TemporalLiteralContext.class,0);
		}
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public TerminalNode HEX_NUMBER() { return getToken(SQLSelectParser.HEX_NUMBER, 0); }
		public TerminalNode BIN_NUMBER() { return getToken(SQLSelectParser.BIN_NUMBER, 0); }
		public TerminalNode UNDERSCORE_CHARSET() { return getToken(SQLSelectParser.UNDERSCORE_CHARSET, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_literal);
		int _la;
		try {
			setState(2360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2351);
				textLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2352);
				numLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2353);
				temporalLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2354);
				nullLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2355);
				boolLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNDERSCORE_CHARSET) {
					{
					setState(2356);
					match(UNDERSCORE_CHARSET);
					}
				}

				setState(2359);
				_la = _input.LA(1);
				if ( !(_la==HEX_NUMBER || _la==BIN_NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringListContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public List<TextStringContext> textString() {
			return getRuleContexts(TextStringContext.class);
		}
		public TextStringContext textString(int i) {
			return getRuleContext(TextStringContext.class,i);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(SQLSelectParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(SQLSelectParser.COMMA_SYMBOL, i);
		}
		public StringListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringList; }
	}

	public final StringListContext stringList() throws RecognitionException {
		StringListContext _localctx = new StringListContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_stringList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2362);
			match(OPEN_PAR_SYMBOL);
			setState(2363);
			textString();
			setState(2368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_SYMBOL) {
				{
				{
				setState(2364);
				match(COMMA_SYMBOL);
				setState(2365);
				textString();
				}
				}
				setState(2370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2371);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextStringLiteralContext extends ParserRuleContext {
		public Token value;
		public TerminalNode SINGLE_QUOTED_TEXT() { return getToken(SQLSelectParser.SINGLE_QUOTED_TEXT, 0); }
		public TerminalNode DOUBLE_QUOTED_TEXT() { return getToken(SQLSelectParser.DOUBLE_QUOTED_TEXT, 0); }
		public TextStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textStringLiteral; }
	}

	public final TextStringLiteralContext textStringLiteral() throws RecognitionException {
		TextStringLiteralContext _localctx = new TextStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_textStringLiteral);
		try {
			setState(2375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2373);
				((TextStringLiteralContext)_localctx).value = match(SINGLE_QUOTED_TEXT);
				}
				break;
			case DOUBLE_QUOTED_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2374);
				((TextStringLiteralContext)_localctx).value = match(DOUBLE_QUOTED_TEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextStringContext extends ParserRuleContext {
		public TextStringLiteralContext textStringLiteral() {
			return getRuleContext(TextStringLiteralContext.class,0);
		}
		public TerminalNode HEX_NUMBER() { return getToken(SQLSelectParser.HEX_NUMBER, 0); }
		public TerminalNode BIN_NUMBER() { return getToken(SQLSelectParser.BIN_NUMBER, 0); }
		public TextStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textString; }
	}

	public final TextStringContext textString() throws RecognitionException {
		TextStringContext _localctx = new TextStringContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_textString);
		try {
			setState(2380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTED_TEXT:
			case SINGLE_QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2377);
				textStringLiteral();
				}
				break;
			case HEX_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2378);
				match(HEX_NUMBER);
				}
				break;
			case BIN_NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2379);
				match(BIN_NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextLiteralContext extends ParserRuleContext {
		public List<TextStringLiteralContext> textStringLiteral() {
			return getRuleContexts(TextStringLiteralContext.class);
		}
		public TextStringLiteralContext textStringLiteral(int i) {
			return getRuleContext(TextStringLiteralContext.class,i);
		}
		public TerminalNode NCHAR_TEXT() { return getToken(SQLSelectParser.NCHAR_TEXT, 0); }
		public TerminalNode UNDERSCORE_CHARSET() { return getToken(SQLSelectParser.UNDERSCORE_CHARSET, 0); }
		public TextLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textLiteral; }
	}

	public final TextLiteralContext textLiteral() throws RecognitionException {
		TextLiteralContext _localctx = new TextLiteralContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_textLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNDERSCORE_CHARSET:
			case DOUBLE_QUOTED_TEXT:
			case SINGLE_QUOTED_TEXT:
				{
				setState(2383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNDERSCORE_CHARSET) {
					{
					setState(2382);
					match(UNDERSCORE_CHARSET);
					}
				}

				setState(2385);
				textStringLiteral();
				}
				break;
			case NCHAR_TEXT:
				{
				setState(2386);
				match(NCHAR_TEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2389);
					textStringLiteral();
					}
					} 
				}
				setState(2394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,310,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumLiteralContext extends ParserRuleContext {
		public TerminalNode INT_NUMBER() { return getToken(SQLSelectParser.INT_NUMBER, 0); }
		public TerminalNode DECIMAL_NUMBER() { return getToken(SQLSelectParser.DECIMAL_NUMBER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(SQLSelectParser.FLOAT_NUMBER, 0); }
		public NumLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numLiteral; }
	}

	public final NumLiteralContext numLiteral() throws RecognitionException {
		NumLiteralContext _localctx = new NumLiteralContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_numLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2395);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_NUMBER) | (1L << DECIMAL_NUMBER) | (1L << FLOAT_NUMBER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE_SYMBOL() { return getToken(SQLSelectParser.TRUE_SYMBOL, 0); }
		public TerminalNode FALSE_SYMBOL() { return getToken(SQLSelectParser.FALSE_SYMBOL, 0); }
		public BoolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLiteral; }
	}

	public final BoolLiteralContext boolLiteral() throws RecognitionException {
		BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2397);
			_la = _input.LA(1);
			if ( !(_la==TRUE_SYMBOL || _la==FALSE_SYMBOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NullLiteralContext extends ParserRuleContext {
		public TerminalNode NULL_SYMBOL() { return getToken(SQLSelectParser.NULL_SYMBOL, 0); }
		public TerminalNode NULL2_SYMBOL() { return getToken(SQLSelectParser.NULL2_SYMBOL, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_nullLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2399);
			_la = _input.LA(1);
			if ( !(_la==NULL2_SYMBOL || _la==NULL_SYMBOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemporalLiteralContext extends ParserRuleContext {
		public TerminalNode DATE_SYMBOL() { return getToken(SQLSelectParser.DATE_SYMBOL, 0); }
		public TerminalNode SINGLE_QUOTED_TEXT() { return getToken(SQLSelectParser.SINGLE_QUOTED_TEXT, 0); }
		public TerminalNode TIME_SYMBOL() { return getToken(SQLSelectParser.TIME_SYMBOL, 0); }
		public TerminalNode TIMESTAMP_SYMBOL() { return getToken(SQLSelectParser.TIMESTAMP_SYMBOL, 0); }
		public TemporalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporalLiteral; }
	}

	public final TemporalLiteralContext temporalLiteral() throws RecognitionException {
		TemporalLiteralContext _localctx = new TemporalLiteralContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_temporalLiteral);
		try {
			setState(2407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2401);
				match(DATE_SYMBOL);
				setState(2402);
				match(SINGLE_QUOTED_TEXT);
				}
				break;
			case TIME_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2403);
				match(TIME_SYMBOL);
				setState(2404);
				match(SINGLE_QUOTED_TEXT);
				}
				break;
			case TIMESTAMP_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2405);
				match(TIMESTAMP_SYMBOL);
				setState(2406);
				match(SINGLE_QUOTED_TEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatOptionsContext extends ParserRuleContext {
		public FieldLengthContext fieldLength() {
			return getRuleContext(FieldLengthContext.class,0);
		}
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public FloatOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatOptions; }
	}

	public final FloatOptionsContext floatOptions() throws RecognitionException {
		FloatOptionsContext _localctx = new FloatOptionsContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_floatOptions);
		try {
			setState(2411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2409);
				fieldLength();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2410);
				precision();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecisionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public List<TerminalNode> INT_NUMBER() { return getTokens(SQLSelectParser.INT_NUMBER); }
		public TerminalNode INT_NUMBER(int i) {
			return getToken(SQLSelectParser.INT_NUMBER, i);
		}
		public TerminalNode COMMA_SYMBOL() { return getToken(SQLSelectParser.COMMA_SYMBOL, 0); }
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public PrecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision; }
	}

	public final PrecisionContext precision() throws RecognitionException {
		PrecisionContext _localctx = new PrecisionContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2413);
			match(OPEN_PAR_SYMBOL);
			setState(2414);
			match(INT_NUMBER);
			setState(2415);
			match(COMMA_SYMBOL);
			setState(2416);
			match(INT_NUMBER);
			setState(2417);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextOrIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TextStringLiteralContext textStringLiteral() {
			return getRuleContext(TextStringLiteralContext.class,0);
		}
		public TextOrIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textOrIdentifier; }
	}

	public final TextOrIdentifierContext textOrIdentifier() throws RecognitionException {
		TextOrIdentifierContext _localctx = new TextOrIdentifierContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_textOrIdentifier);
		try {
			setState(2421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2419);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2420);
				textStringLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesesContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(SQLSelectParser.OPEN_PAR_SYMBOL, 0); }
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(SQLSelectParser.CLOSE_PAR_SYMBOL, 0); }
		public ParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentheses; }
	}

	public final ParenthesesContext parentheses() throws RecognitionException {
		ParenthesesContext _localctx = new ParenthesesContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_parentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2423);
			match(OPEN_PAR_SYMBOL);
			setState(2424);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualContext extends ParserRuleContext {
		public TerminalNode EQUAL_OPERATOR() { return getToken(SQLSelectParser.EQUAL_OPERATOR, 0); }
		public TerminalNode ASSIGN_OPERATOR() { return getToken(SQLSelectParser.ASSIGN_OPERATOR, 0); }
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_equal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2426);
			_la = _input.LA(1);
			if ( !(_la==EQUAL_OPERATOR || _la==ASSIGN_OPERATOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarIdentTypeContext extends ParserRuleContext {
		public TerminalNode GLOBAL_SYMBOL() { return getToken(SQLSelectParser.GLOBAL_SYMBOL, 0); }
		public TerminalNode DOT_SYMBOL() { return getToken(SQLSelectParser.DOT_SYMBOL, 0); }
		public TerminalNode LOCAL_SYMBOL() { return getToken(SQLSelectParser.LOCAL_SYMBOL, 0); }
		public TerminalNode SESSION_SYMBOL() { return getToken(SQLSelectParser.SESSION_SYMBOL, 0); }
		public VarIdentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varIdentType; }
	}

	public final VarIdentTypeContext varIdentType() throws RecognitionException {
		VarIdentTypeContext _localctx = new VarIdentTypeContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_varIdentType);
		try {
			setState(2434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GLOBAL_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2428);
				match(GLOBAL_SYMBOL);
				setState(2429);
				match(DOT_SYMBOL);
				}
				break;
			case LOCAL_SYMBOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2430);
				match(LOCAL_SYMBOL);
				setState(2431);
				match(DOT_SYMBOL);
				}
				break;
			case SESSION_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(2432);
				match(SESSION_SYMBOL);
				setState(2433);
				match(DOT_SYMBOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierKeywordContext extends ParserRuleContext {
		public TerminalNode TINYINT_SYMBOL() { return getToken(SQLSelectParser.TINYINT_SYMBOL, 0); }
		public TerminalNode SMALLINT_SYMBOL() { return getToken(SQLSelectParser.SMALLINT_SYMBOL, 0); }
		public TerminalNode MEDIUMINT_SYMBOL() { return getToken(SQLSelectParser.MEDIUMINT_SYMBOL, 0); }
		public TerminalNode INT_SYMBOL() { return getToken(SQLSelectParser.INT_SYMBOL, 0); }
		public TerminalNode BIGINT_SYMBOL() { return getToken(SQLSelectParser.BIGINT_SYMBOL, 0); }
		public TerminalNode SECOND_SYMBOL() { return getToken(SQLSelectParser.SECOND_SYMBOL, 0); }
		public TerminalNode MINUTE_SYMBOL() { return getToken(SQLSelectParser.MINUTE_SYMBOL, 0); }
		public TerminalNode HOUR_SYMBOL() { return getToken(SQLSelectParser.HOUR_SYMBOL, 0); }
		public TerminalNode DAY_SYMBOL() { return getToken(SQLSelectParser.DAY_SYMBOL, 0); }
		public TerminalNode WEEK_SYMBOL() { return getToken(SQLSelectParser.WEEK_SYMBOL, 0); }
		public TerminalNode MONTH_SYMBOL() { return getToken(SQLSelectParser.MONTH_SYMBOL, 0); }
		public TerminalNode QUARTER_SYMBOL() { return getToken(SQLSelectParser.QUARTER_SYMBOL, 0); }
		public TerminalNode YEAR_SYMBOL() { return getToken(SQLSelectParser.YEAR_SYMBOL, 0); }
		public TerminalNode DEFAULT_SYMBOL() { return getToken(SQLSelectParser.DEFAULT_SYMBOL, 0); }
		public TerminalNode UNION_SYMBOL() { return getToken(SQLSelectParser.UNION_SYMBOL, 0); }
		public TerminalNode SELECT_SYMBOL() { return getToken(SQLSelectParser.SELECT_SYMBOL, 0); }
		public TerminalNode ALL_SYMBOL() { return getToken(SQLSelectParser.ALL_SYMBOL, 0); }
		public TerminalNode DISTINCT_SYMBOL() { return getToken(SQLSelectParser.DISTINCT_SYMBOL, 0); }
		public TerminalNode STRAIGHT_JOIN_SYMBOL() { return getToken(SQLSelectParser.STRAIGHT_JOIN_SYMBOL, 0); }
		public TerminalNode HIGH_PRIORITY_SYMBOL() { return getToken(SQLSelectParser.HIGH_PRIORITY_SYMBOL, 0); }
		public TerminalNode SQL_SMALL_RESULT_SYMBOL() { return getToken(SQLSelectParser.SQL_SMALL_RESULT_SYMBOL, 0); }
		public TerminalNode SQL_BIG_RESULT_SYMBOL() { return getToken(SQLSelectParser.SQL_BIG_RESULT_SYMBOL, 0); }
		public TerminalNode SQL_BUFFER_RESULT_SYMBOL() { return getToken(SQLSelectParser.SQL_BUFFER_RESULT_SYMBOL, 0); }
		public TerminalNode SQL_CALC_FOUND_ROWS_SYMBOL() { return getToken(SQLSelectParser.SQL_CALC_FOUND_ROWS_SYMBOL, 0); }
		public TerminalNode LIMIT_SYMBOL() { return getToken(SQLSelectParser.LIMIT_SYMBOL, 0); }
		public TerminalNode OFFSET_SYMBOL() { return getToken(SQLSelectParser.OFFSET_SYMBOL, 0); }
		public TerminalNode INTO_SYMBOL() { return getToken(SQLSelectParser.INTO_SYMBOL, 0); }
		public TerminalNode OUTFILE_SYMBOL() { return getToken(SQLSelectParser.OUTFILE_SYMBOL, 0); }
		public TerminalNode DUMPFILE_SYMBOL() { return getToken(SQLSelectParser.DUMPFILE_SYMBOL, 0); }
		public TerminalNode PROCEDURE_SYMBOL() { return getToken(SQLSelectParser.PROCEDURE_SYMBOL, 0); }
		public TerminalNode ANALYSE_SYMBOL() { return getToken(SQLSelectParser.ANALYSE_SYMBOL, 0); }
		public TerminalNode HAVING_SYMBOL() { return getToken(SQLSelectParser.HAVING_SYMBOL, 0); }
		public TerminalNode WINDOW_SYMBOL() { return getToken(SQLSelectParser.WINDOW_SYMBOL, 0); }
		public TerminalNode AS_SYMBOL() { return getToken(SQLSelectParser.AS_SYMBOL, 0); }
		public TerminalNode PARTITION_SYMBOL() { return getToken(SQLSelectParser.PARTITION_SYMBOL, 0); }
		public TerminalNode BY_SYMBOL() { return getToken(SQLSelectParser.BY_SYMBOL, 0); }
		public TerminalNode ROWS_SYMBOL() { return getToken(SQLSelectParser.ROWS_SYMBOL, 0); }
		public TerminalNode RANGE_SYMBOL() { return getToken(SQLSelectParser.RANGE_SYMBOL, 0); }
		public TerminalNode GROUPS_SYMBOL() { return getToken(SQLSelectParser.GROUPS_SYMBOL, 0); }
		public TerminalNode UNBOUNDED_SYMBOL() { return getToken(SQLSelectParser.UNBOUNDED_SYMBOL, 0); }
		public TerminalNode PRECEDING_SYMBOL() { return getToken(SQLSelectParser.PRECEDING_SYMBOL, 0); }
		public TerminalNode INTERVAL_SYMBOL() { return getToken(SQLSelectParser.INTERVAL_SYMBOL, 0); }
		public TerminalNode CURRENT_SYMBOL() { return getToken(SQLSelectParser.CURRENT_SYMBOL, 0); }
		public TerminalNode ROW_SYMBOL() { return getToken(SQLSelectParser.ROW_SYMBOL, 0); }
		public TerminalNode BETWEEN_SYMBOL() { return getToken(SQLSelectParser.BETWEEN_SYMBOL, 0); }
		public TerminalNode AND_SYMBOL() { return getToken(SQLSelectParser.AND_SYMBOL, 0); }
		public TerminalNode FOLLOWING_SYMBOL() { return getToken(SQLSelectParser.FOLLOWING_SYMBOL, 0); }
		public TerminalNode EXCLUDE_SYMBOL() { return getToken(SQLSelectParser.EXCLUDE_SYMBOL, 0); }
		public TerminalNode GROUP_SYMBOL() { return getToken(SQLSelectParser.GROUP_SYMBOL, 0); }
		public TerminalNode TIES_SYMBOL() { return getToken(SQLSelectParser.TIES_SYMBOL, 0); }
		public TerminalNode NO_SYMBOL() { return getToken(SQLSelectParser.NO_SYMBOL, 0); }
		public TerminalNode OTHERS_SYMBOL() { return getToken(SQLSelectParser.OTHERS_SYMBOL, 0); }
		public TerminalNode WITH_SYMBOL() { return getToken(SQLSelectParser.WITH_SYMBOL, 0); }
		public TerminalNode RECURSIVE_SYMBOL() { return getToken(SQLSelectParser.RECURSIVE_SYMBOL, 0); }
		public TerminalNode ROLLUP_SYMBOL() { return getToken(SQLSelectParser.ROLLUP_SYMBOL, 0); }
		public TerminalNode CUBE_SYMBOL() { return getToken(SQLSelectParser.CUBE_SYMBOL, 0); }
		public TerminalNode ORDER_SYMBOL() { return getToken(SQLSelectParser.ORDER_SYMBOL, 0); }
		public TerminalNode ASC_SYMBOL() { return getToken(SQLSelectParser.ASC_SYMBOL, 0); }
		public TerminalNode DESC_SYMBOL() { return getToken(SQLSelectParser.DESC_SYMBOL, 0); }
		public TerminalNode FROM_SYMBOL() { return getToken(SQLSelectParser.FROM_SYMBOL, 0); }
		public TerminalNode DUAL_SYMBOL() { return getToken(SQLSelectParser.DUAL_SYMBOL, 0); }
		public TerminalNode VALUES_SYMBOL() { return getToken(SQLSelectParser.VALUES_SYMBOL, 0); }
		public TerminalNode TABLE_SYMBOL() { return getToken(SQLSelectParser.TABLE_SYMBOL, 0); }
		public TerminalNode SQL_NO_CACHE_SYMBOL() { return getToken(SQLSelectParser.SQL_NO_CACHE_SYMBOL, 0); }
		public TerminalNode SQL_CACHE_SYMBOL() { return getToken(SQLSelectParser.SQL_CACHE_SYMBOL, 0); }
		public TerminalNode MAX_STATEMENT_TIME_SYMBOL() { return getToken(SQLSelectParser.MAX_STATEMENT_TIME_SYMBOL, 0); }
		public TerminalNode FOR_SYMBOL() { return getToken(SQLSelectParser.FOR_SYMBOL, 0); }
		public TerminalNode OF_SYMBOL() { return getToken(SQLSelectParser.OF_SYMBOL, 0); }
		public TerminalNode LOCK_SYMBOL() { return getToken(SQLSelectParser.LOCK_SYMBOL, 0); }
		public TerminalNode IN_SYMBOL() { return getToken(SQLSelectParser.IN_SYMBOL, 0); }
		public TerminalNode SHARE_SYMBOL() { return getToken(SQLSelectParser.SHARE_SYMBOL, 0); }
		public TerminalNode MODE_SYMBOL() { return getToken(SQLSelectParser.MODE_SYMBOL, 0); }
		public TerminalNode UPDATE_SYMBOL() { return getToken(SQLSelectParser.UPDATE_SYMBOL, 0); }
		public TerminalNode SKIP_SYMBOL() { return getToken(SQLSelectParser.SKIP_SYMBOL, 0); }
		public TerminalNode LOCKED_SYMBOL() { return getToken(SQLSelectParser.LOCKED_SYMBOL, 0); }
		public TerminalNode NOWAIT_SYMBOL() { return getToken(SQLSelectParser.NOWAIT_SYMBOL, 0); }
		public TerminalNode WHERE_SYMBOL() { return getToken(SQLSelectParser.WHERE_SYMBOL, 0); }
		public TerminalNode OJ_SYMBOL() { return getToken(SQLSelectParser.OJ_SYMBOL, 0); }
		public TerminalNode ON_SYMBOL() { return getToken(SQLSelectParser.ON_SYMBOL, 0); }
		public TerminalNode USING_SYMBOL() { return getToken(SQLSelectParser.USING_SYMBOL, 0); }
		public TerminalNode NATURAL_SYMBOL() { return getToken(SQLSelectParser.NATURAL_SYMBOL, 0); }
		public TerminalNode INNER_SYMBOL() { return getToken(SQLSelectParser.INNER_SYMBOL, 0); }
		public TerminalNode JOIN_SYMBOL() { return getToken(SQLSelectParser.JOIN_SYMBOL, 0); }
		public TerminalNode LEFT_SYMBOL() { return getToken(SQLSelectParser.LEFT_SYMBOL, 0); }
		public TerminalNode RIGHT_SYMBOL() { return getToken(SQLSelectParser.RIGHT_SYMBOL, 0); }
		public TerminalNode OUTER_SYMBOL() { return getToken(SQLSelectParser.OUTER_SYMBOL, 0); }
		public TerminalNode CROSS_SYMBOL() { return getToken(SQLSelectParser.CROSS_SYMBOL, 0); }
		public TerminalNode LATERAL_SYMBOL() { return getToken(SQLSelectParser.LATERAL_SYMBOL, 0); }
		public TerminalNode JSON_TABLE_SYMBOL() { return getToken(SQLSelectParser.JSON_TABLE_SYMBOL, 0); }
		public TerminalNode COLUMNS_SYMBOL() { return getToken(SQLSelectParser.COLUMNS_SYMBOL, 0); }
		public TerminalNode ORDINALITY_SYMBOL() { return getToken(SQLSelectParser.ORDINALITY_SYMBOL, 0); }
		public TerminalNode EXISTS_SYMBOL() { return getToken(SQLSelectParser.EXISTS_SYMBOL, 0); }
		public TerminalNode PATH_SYMBOL() { return getToken(SQLSelectParser.PATH_SYMBOL, 0); }
		public TerminalNode NESTED_SYMBOL() { return getToken(SQLSelectParser.NESTED_SYMBOL, 0); }
		public TerminalNode EMPTY_SYMBOL() { return getToken(SQLSelectParser.EMPTY_SYMBOL, 0); }
		public TerminalNode ERROR_SYMBOL() { return getToken(SQLSelectParser.ERROR_SYMBOL, 0); }
		public TerminalNode NULL_SYMBOL() { return getToken(SQLSelectParser.NULL_SYMBOL, 0); }
		public TerminalNode USE_SYMBOL() { return getToken(SQLSelectParser.USE_SYMBOL, 0); }
		public TerminalNode FORCE_SYMBOL() { return getToken(SQLSelectParser.FORCE_SYMBOL, 0); }
		public TerminalNode IGNORE_SYMBOL() { return getToken(SQLSelectParser.IGNORE_SYMBOL, 0); }
		public TerminalNode KEY_SYMBOL() { return getToken(SQLSelectParser.KEY_SYMBOL, 0); }
		public TerminalNode INDEX_SYMBOL() { return getToken(SQLSelectParser.INDEX_SYMBOL, 0); }
		public TerminalNode PRIMARY_SYMBOL() { return getToken(SQLSelectParser.PRIMARY_SYMBOL, 0); }
		public TerminalNode IS_SYMBOL() { return getToken(SQLSelectParser.IS_SYMBOL, 0); }
		public TerminalNode TRUE_SYMBOL() { return getToken(SQLSelectParser.TRUE_SYMBOL, 0); }
		public TerminalNode FALSE_SYMBOL() { return getToken(SQLSelectParser.FALSE_SYMBOL, 0); }
		public TerminalNode UNKNOWN_SYMBOL() { return getToken(SQLSelectParser.UNKNOWN_SYMBOL, 0); }
		public TerminalNode NOT_SYMBOL() { return getToken(SQLSelectParser.NOT_SYMBOL, 0); }
		public TerminalNode XOR_SYMBOL() { return getToken(SQLSelectParser.XOR_SYMBOL, 0); }
		public TerminalNode OR_SYMBOL() { return getToken(SQLSelectParser.OR_SYMBOL, 0); }
		public TerminalNode ANY_SYMBOL() { return getToken(SQLSelectParser.ANY_SYMBOL, 0); }
		public TerminalNode MEMBER_SYMBOL() { return getToken(SQLSelectParser.MEMBER_SYMBOL, 0); }
		public TerminalNode SOUNDS_SYMBOL() { return getToken(SQLSelectParser.SOUNDS_SYMBOL, 0); }
		public TerminalNode LIKE_SYMBOL() { return getToken(SQLSelectParser.LIKE_SYMBOL, 0); }
		public TerminalNode ESCAPE_SYMBOL() { return getToken(SQLSelectParser.ESCAPE_SYMBOL, 0); }
		public TerminalNode REGEXP_SYMBOL() { return getToken(SQLSelectParser.REGEXP_SYMBOL, 0); }
		public TerminalNode DIV_SYMBOL() { return getToken(SQLSelectParser.DIV_SYMBOL, 0); }
		public TerminalNode MOD_SYMBOL() { return getToken(SQLSelectParser.MOD_SYMBOL, 0); }
		public TerminalNode MATCH_SYMBOL() { return getToken(SQLSelectParser.MATCH_SYMBOL, 0); }
		public TerminalNode AGAINST_SYMBOL() { return getToken(SQLSelectParser.AGAINST_SYMBOL, 0); }
		public TerminalNode BINARY_SYMBOL() { return getToken(SQLSelectParser.BINARY_SYMBOL, 0); }
		public TerminalNode CAST_SYMBOL() { return getToken(SQLSelectParser.CAST_SYMBOL, 0); }
		public TerminalNode ARRAY_SYMBOL() { return getToken(SQLSelectParser.ARRAY_SYMBOL, 0); }
		public TerminalNode CASE_SYMBOL() { return getToken(SQLSelectParser.CASE_SYMBOL, 0); }
		public TerminalNode END_SYMBOL() { return getToken(SQLSelectParser.END_SYMBOL, 0); }
		public TerminalNode CONVERT_SYMBOL() { return getToken(SQLSelectParser.CONVERT_SYMBOL, 0); }
		public TerminalNode COLLATE_SYMBOL() { return getToken(SQLSelectParser.COLLATE_SYMBOL, 0); }
		public TerminalNode AVG_SYMBOL() { return getToken(SQLSelectParser.AVG_SYMBOL, 0); }
		public TerminalNode BIT_AND_SYMBOL() { return getToken(SQLSelectParser.BIT_AND_SYMBOL, 0); }
		public TerminalNode BIT_OR_SYMBOL() { return getToken(SQLSelectParser.BIT_OR_SYMBOL, 0); }
		public TerminalNode BIT_XOR_SYMBOL() { return getToken(SQLSelectParser.BIT_XOR_SYMBOL, 0); }
		public TerminalNode COUNT_SYMBOL() { return getToken(SQLSelectParser.COUNT_SYMBOL, 0); }
		public TerminalNode MIN_SYMBOL() { return getToken(SQLSelectParser.MIN_SYMBOL, 0); }
		public TerminalNode MAX_SYMBOL() { return getToken(SQLSelectParser.MAX_SYMBOL, 0); }
		public TerminalNode STD_SYMBOL() { return getToken(SQLSelectParser.STD_SYMBOL, 0); }
		public TerminalNode VARIANCE_SYMBOL() { return getToken(SQLSelectParser.VARIANCE_SYMBOL, 0); }
		public TerminalNode STDDEV_SAMP_SYMBOL() { return getToken(SQLSelectParser.STDDEV_SAMP_SYMBOL, 0); }
		public TerminalNode VAR_SAMP_SYMBOL() { return getToken(SQLSelectParser.VAR_SAMP_SYMBOL, 0); }
		public TerminalNode SUM_SYMBOL() { return getToken(SQLSelectParser.SUM_SYMBOL, 0); }
		public TerminalNode GROUP_CONCAT_SYMBOL() { return getToken(SQLSelectParser.GROUP_CONCAT_SYMBOL, 0); }
		public TerminalNode SEPARATOR_SYMBOL() { return getToken(SQLSelectParser.SEPARATOR_SYMBOL, 0); }
		public TerminalNode GROUPING_SYMBOL() { return getToken(SQLSelectParser.GROUPING_SYMBOL, 0); }
		public TerminalNode ROW_NUMBER_SYMBOL() { return getToken(SQLSelectParser.ROW_NUMBER_SYMBOL, 0); }
		public TerminalNode RANK_SYMBOL() { return getToken(SQLSelectParser.RANK_SYMBOL, 0); }
		public TerminalNode DENSE_RANK_SYMBOL() { return getToken(SQLSelectParser.DENSE_RANK_SYMBOL, 0); }
		public TerminalNode CUME_DIST_SYMBOL() { return getToken(SQLSelectParser.CUME_DIST_SYMBOL, 0); }
		public TerminalNode PERCENT_RANK_SYMBOL() { return getToken(SQLSelectParser.PERCENT_RANK_SYMBOL, 0); }
		public TerminalNode NTILE_SYMBOL() { return getToken(SQLSelectParser.NTILE_SYMBOL, 0); }
		public TerminalNode LEAD_SYMBOL() { return getToken(SQLSelectParser.LEAD_SYMBOL, 0); }
		public TerminalNode LAG_SYMBOL() { return getToken(SQLSelectParser.LAG_SYMBOL, 0); }
		public TerminalNode FIRST_VALUE_SYMBOL() { return getToken(SQLSelectParser.FIRST_VALUE_SYMBOL, 0); }
		public TerminalNode LAST_VALUE_SYMBOL() { return getToken(SQLSelectParser.LAST_VALUE_SYMBOL, 0); }
		public TerminalNode NTH_VALUE_SYMBOL() { return getToken(SQLSelectParser.NTH_VALUE_SYMBOL, 0); }
		public TerminalNode FIRST_SYMBOL() { return getToken(SQLSelectParser.FIRST_SYMBOL, 0); }
		public TerminalNode LAST_SYMBOL() { return getToken(SQLSelectParser.LAST_SYMBOL, 0); }
		public TerminalNode OVER_SYMBOL() { return getToken(SQLSelectParser.OVER_SYMBOL, 0); }
		public TerminalNode RESPECT_SYMBOL() { return getToken(SQLSelectParser.RESPECT_SYMBOL, 0); }
		public TerminalNode NULLS_SYMBOL() { return getToken(SQLSelectParser.NULLS_SYMBOL, 0); }
		public TerminalNode JSON_ARRAYAGG_SYMBOL() { return getToken(SQLSelectParser.JSON_ARRAYAGG_SYMBOL, 0); }
		public TerminalNode JSON_OBJECTAGG_SYMBOL() { return getToken(SQLSelectParser.JSON_OBJECTAGG_SYMBOL, 0); }
		public TerminalNode BOOLEAN_SYMBOL() { return getToken(SQLSelectParser.BOOLEAN_SYMBOL, 0); }
		public TerminalNode LANGUAGE_SYMBOL() { return getToken(SQLSelectParser.LANGUAGE_SYMBOL, 0); }
		public TerminalNode QUERY_SYMBOL() { return getToken(SQLSelectParser.QUERY_SYMBOL, 0); }
		public TerminalNode EXPANSION_SYMBOL() { return getToken(SQLSelectParser.EXPANSION_SYMBOL, 0); }
		public TerminalNode CHAR_SYMBOL() { return getToken(SQLSelectParser.CHAR_SYMBOL, 0); }
		public TerminalNode CURRENT_USER_SYMBOL() { return getToken(SQLSelectParser.CURRENT_USER_SYMBOL, 0); }
		public TerminalNode DATE_SYMBOL() { return getToken(SQLSelectParser.DATE_SYMBOL, 0); }
		public TerminalNode INSERT_SYMBOL() { return getToken(SQLSelectParser.INSERT_SYMBOL, 0); }
		public TerminalNode TIME_SYMBOL() { return getToken(SQLSelectParser.TIME_SYMBOL, 0); }
		public TerminalNode TIMESTAMP_SYMBOL() { return getToken(SQLSelectParser.TIMESTAMP_SYMBOL, 0); }
		public TerminalNode USER_SYMBOL() { return getToken(SQLSelectParser.USER_SYMBOL, 0); }
		public TerminalNode ADDDATE_SYMBOL() { return getToken(SQLSelectParser.ADDDATE_SYMBOL, 0); }
		public TerminalNode SUBDATE_SYMBOL() { return getToken(SQLSelectParser.SUBDATE_SYMBOL, 0); }
		public TerminalNode CURDATE_SYMBOL() { return getToken(SQLSelectParser.CURDATE_SYMBOL, 0); }
		public TerminalNode CURTIME_SYMBOL() { return getToken(SQLSelectParser.CURTIME_SYMBOL, 0); }
		public TerminalNode DATE_ADD_SYMBOL() { return getToken(SQLSelectParser.DATE_ADD_SYMBOL, 0); }
		public TerminalNode DATE_SUB_SYMBOL() { return getToken(SQLSelectParser.DATE_SUB_SYMBOL, 0); }
		public TerminalNode EXTRACT_SYMBOL() { return getToken(SQLSelectParser.EXTRACT_SYMBOL, 0); }
		public TerminalNode GET_FORMAT_SYMBOL() { return getToken(SQLSelectParser.GET_FORMAT_SYMBOL, 0); }
		public TerminalNode NOW_SYMBOL() { return getToken(SQLSelectParser.NOW_SYMBOL, 0); }
		public TerminalNode POSITION_SYMBOL() { return getToken(SQLSelectParser.POSITION_SYMBOL, 0); }
		public TerminalNode SYSDATE_SYMBOL() { return getToken(SQLSelectParser.SYSDATE_SYMBOL, 0); }
		public TerminalNode TIMESTAMP_ADD_SYMBOL() { return getToken(SQLSelectParser.TIMESTAMP_ADD_SYMBOL, 0); }
		public TerminalNode TIMESTAMP_DIFF_SYMBOL() { return getToken(SQLSelectParser.TIMESTAMP_DIFF_SYMBOL, 0); }
		public TerminalNode UTC_DATE_SYMBOL() { return getToken(SQLSelectParser.UTC_DATE_SYMBOL, 0); }
		public TerminalNode UTC_TIME_SYMBOL() { return getToken(SQLSelectParser.UTC_TIME_SYMBOL, 0); }
		public TerminalNode UTC_TIMESTAMP_SYMBOL() { return getToken(SQLSelectParser.UTC_TIMESTAMP_SYMBOL, 0); }
		public TerminalNode ASCII_SYMBOL() { return getToken(SQLSelectParser.ASCII_SYMBOL, 0); }
		public TerminalNode CHARSET_SYMBOL() { return getToken(SQLSelectParser.CHARSET_SYMBOL, 0); }
		public TerminalNode COALESCE_SYMBOL() { return getToken(SQLSelectParser.COALESCE_SYMBOL, 0); }
		public TerminalNode COLLATION_SYMBOL() { return getToken(SQLSelectParser.COLLATION_SYMBOL, 0); }
		public TerminalNode DATABASE_SYMBOL() { return getToken(SQLSelectParser.DATABASE_SYMBOL, 0); }
		public TerminalNode IF_SYMBOL() { return getToken(SQLSelectParser.IF_SYMBOL, 0); }
		public TerminalNode FORMAT_SYMBOL() { return getToken(SQLSelectParser.FORMAT_SYMBOL, 0); }
		public TerminalNode MICROSECOND_SYMBOL() { return getToken(SQLSelectParser.MICROSECOND_SYMBOL, 0); }
		public TerminalNode OLD_PASSWORD_SYMBOL() { return getToken(SQLSelectParser.OLD_PASSWORD_SYMBOL, 0); }
		public TerminalNode PASSWORD_SYMBOL() { return getToken(SQLSelectParser.PASSWORD_SYMBOL, 0); }
		public TerminalNode REPEAT_SYMBOL() { return getToken(SQLSelectParser.REPEAT_SYMBOL, 0); }
		public TerminalNode REPLACE_SYMBOL() { return getToken(SQLSelectParser.REPLACE_SYMBOL, 0); }
		public TerminalNode REVERSE_SYMBOL() { return getToken(SQLSelectParser.REVERSE_SYMBOL, 0); }
		public TerminalNode ROW_COUNT_SYMBOL() { return getToken(SQLSelectParser.ROW_COUNT_SYMBOL, 0); }
		public TerminalNode TRUNCATE_SYMBOL() { return getToken(SQLSelectParser.TRUNCATE_SYMBOL, 0); }
		public TerminalNode WEIGHT_STRING_SYMBOL() { return getToken(SQLSelectParser.WEIGHT_STRING_SYMBOL, 0); }
		public TerminalNode CONTAINS_SYMBOL() { return getToken(SQLSelectParser.CONTAINS_SYMBOL, 0); }
		public TerminalNode GEOMETRYCOLLECTION_SYMBOL() { return getToken(SQLSelectParser.GEOMETRYCOLLECTION_SYMBOL, 0); }
		public TerminalNode LINESTRING_SYMBOL() { return getToken(SQLSelectParser.LINESTRING_SYMBOL, 0); }
		public TerminalNode MULTILINESTRING_SYMBOL() { return getToken(SQLSelectParser.MULTILINESTRING_SYMBOL, 0); }
		public TerminalNode MULTIPOINT_SYMBOL() { return getToken(SQLSelectParser.MULTIPOINT_SYMBOL, 0); }
		public TerminalNode MULTIPOLYGON_SYMBOL() { return getToken(SQLSelectParser.MULTIPOLYGON_SYMBOL, 0); }
		public TerminalNode POINT_SYMBOL() { return getToken(SQLSelectParser.POINT_SYMBOL, 0); }
		public TerminalNode POLYGON_SYMBOL() { return getToken(SQLSelectParser.POLYGON_SYMBOL, 0); }
		public TerminalNode LEVEL_SYMBOL() { return getToken(SQLSelectParser.LEVEL_SYMBOL, 0); }
		public TerminalNode DATETIME_SYMBOL() { return getToken(SQLSelectParser.DATETIME_SYMBOL, 0); }
		public TerminalNode TRIM_SYMBOL() { return getToken(SQLSelectParser.TRIM_SYMBOL, 0); }
		public TerminalNode LEADING_SYMBOL() { return getToken(SQLSelectParser.LEADING_SYMBOL, 0); }
		public TerminalNode TRAILING_SYMBOL() { return getToken(SQLSelectParser.TRAILING_SYMBOL, 0); }
		public TerminalNode BOTH_SYMBOL() { return getToken(SQLSelectParser.BOTH_SYMBOL, 0); }
		public TerminalNode SUBSTRING_SYMBOL() { return getToken(SQLSelectParser.SUBSTRING_SYMBOL, 0); }
		public TerminalNode WHEN_SYMBOL() { return getToken(SQLSelectParser.WHEN_SYMBOL, 0); }
		public TerminalNode THEN_SYMBOL() { return getToken(SQLSelectParser.THEN_SYMBOL, 0); }
		public TerminalNode ELSE_SYMBOL() { return getToken(SQLSelectParser.ELSE_SYMBOL, 0); }
		public TerminalNode SIGNED_SYMBOL() { return getToken(SQLSelectParser.SIGNED_SYMBOL, 0); }
		public TerminalNode UNSIGNED_SYMBOL() { return getToken(SQLSelectParser.UNSIGNED_SYMBOL, 0); }
		public TerminalNode DECIMAL_SYMBOL() { return getToken(SQLSelectParser.DECIMAL_SYMBOL, 0); }
		public TerminalNode JSON_SYMBOL() { return getToken(SQLSelectParser.JSON_SYMBOL, 0); }
		public TerminalNode FLOAT_SYMBOL() { return getToken(SQLSelectParser.FLOAT_SYMBOL, 0); }
		public TerminalNode SET_SYMBOL() { return getToken(SQLSelectParser.SET_SYMBOL, 0); }
		public TerminalNode SECOND_MICROSECOND_SYMBOL() { return getToken(SQLSelectParser.SECOND_MICROSECOND_SYMBOL, 0); }
		public TerminalNode MINUTE_MICROSECOND_SYMBOL() { return getToken(SQLSelectParser.MINUTE_MICROSECOND_SYMBOL, 0); }
		public TerminalNode MINUTE_SECOND_SYMBOL() { return getToken(SQLSelectParser.MINUTE_SECOND_SYMBOL, 0); }
		public TerminalNode HOUR_MICROSECOND_SYMBOL() { return getToken(SQLSelectParser.HOUR_MICROSECOND_SYMBOL, 0); }
		public TerminalNode HOUR_SECOND_SYMBOL() { return getToken(SQLSelectParser.HOUR_SECOND_SYMBOL, 0); }
		public TerminalNode HOUR_MINUTE_SYMBOL() { return getToken(SQLSelectParser.HOUR_MINUTE_SYMBOL, 0); }
		public TerminalNode DAY_MICROSECOND_SYMBOL() { return getToken(SQLSelectParser.DAY_MICROSECOND_SYMBOL, 0); }
		public TerminalNode DAY_SECOND_SYMBOL() { return getToken(SQLSelectParser.DAY_SECOND_SYMBOL, 0); }
		public TerminalNode DAY_MINUTE_SYMBOL() { return getToken(SQLSelectParser.DAY_MINUTE_SYMBOL, 0); }
		public TerminalNode DAY_HOUR_SYMBOL() { return getToken(SQLSelectParser.DAY_HOUR_SYMBOL, 0); }
		public TerminalNode YEAR_MONTH_SYMBOL() { return getToken(SQLSelectParser.YEAR_MONTH_SYMBOL, 0); }
		public TerminalNode BTREE_SYMBOL() { return getToken(SQLSelectParser.BTREE_SYMBOL, 0); }
		public TerminalNode RTREE_SYMBOL() { return getToken(SQLSelectParser.RTREE_SYMBOL, 0); }
		public TerminalNode HASH_SYMBOL() { return getToken(SQLSelectParser.HASH_SYMBOL, 0); }
		public TerminalNode REAL_SYMBOL() { return getToken(SQLSelectParser.REAL_SYMBOL, 0); }
		public TerminalNode DOUBLE_SYMBOL() { return getToken(SQLSelectParser.DOUBLE_SYMBOL, 0); }
		public TerminalNode PRECISION_SYMBOL() { return getToken(SQLSelectParser.PRECISION_SYMBOL, 0); }
		public TerminalNode NUMERIC_SYMBOL() { return getToken(SQLSelectParser.NUMERIC_SYMBOL, 0); }
		public TerminalNode FIXED_SYMBOL() { return getToken(SQLSelectParser.FIXED_SYMBOL, 0); }
		public TerminalNode BIT_SYMBOL() { return getToken(SQLSelectParser.BIT_SYMBOL, 0); }
		public TerminalNode BOOL_SYMBOL() { return getToken(SQLSelectParser.BOOL_SYMBOL, 0); }
		public TerminalNode VARYING_SYMBOL() { return getToken(SQLSelectParser.VARYING_SYMBOL, 0); }
		public TerminalNode VARCHAR_SYMBOL() { return getToken(SQLSelectParser.VARCHAR_SYMBOL, 0); }
		public TerminalNode NATIONAL_SYMBOL() { return getToken(SQLSelectParser.NATIONAL_SYMBOL, 0); }
		public TerminalNode NVARCHAR_SYMBOL() { return getToken(SQLSelectParser.NVARCHAR_SYMBOL, 0); }
		public TerminalNode NCHAR_SYMBOL() { return getToken(SQLSelectParser.NCHAR_SYMBOL, 0); }
		public TerminalNode VARBINARY_SYMBOL() { return getToken(SQLSelectParser.VARBINARY_SYMBOL, 0); }
		public TerminalNode TINYBLOB_SYMBOL() { return getToken(SQLSelectParser.TINYBLOB_SYMBOL, 0); }
		public TerminalNode BLOB_SYMBOL() { return getToken(SQLSelectParser.BLOB_SYMBOL, 0); }
		public TerminalNode MEDIUMBLOB_SYMBOL() { return getToken(SQLSelectParser.MEDIUMBLOB_SYMBOL, 0); }
		public TerminalNode LONGBLOB_SYMBOL() { return getToken(SQLSelectParser.LONGBLOB_SYMBOL, 0); }
		public TerminalNode LONG_SYMBOL() { return getToken(SQLSelectParser.LONG_SYMBOL, 0); }
		public TerminalNode TINYTEXT_SYMBOL() { return getToken(SQLSelectParser.TINYTEXT_SYMBOL, 0); }
		public TerminalNode TEXT_SYMBOL() { return getToken(SQLSelectParser.TEXT_SYMBOL, 0); }
		public TerminalNode MEDIUMTEXT_SYMBOL() { return getToken(SQLSelectParser.MEDIUMTEXT_SYMBOL, 0); }
		public TerminalNode LONGTEXT_SYMBOL() { return getToken(SQLSelectParser.LONGTEXT_SYMBOL, 0); }
		public TerminalNode ENUM_SYMBOL() { return getToken(SQLSelectParser.ENUM_SYMBOL, 0); }
		public TerminalNode SERIAL_SYMBOL() { return getToken(SQLSelectParser.SERIAL_SYMBOL, 0); }
		public TerminalNode GEOMETRY_SYMBOL() { return getToken(SQLSelectParser.GEOMETRY_SYMBOL, 0); }
		public TerminalNode ZEROFILL_SYMBOL() { return getToken(SQLSelectParser.ZEROFILL_SYMBOL, 0); }
		public TerminalNode BYTE_SYMBOL() { return getToken(SQLSelectParser.BYTE_SYMBOL, 0); }
		public TerminalNode UNICODE_SYMBOL() { return getToken(SQLSelectParser.UNICODE_SYMBOL, 0); }
		public TerminalNode TERMINATED_SYMBOL() { return getToken(SQLSelectParser.TERMINATED_SYMBOL, 0); }
		public TerminalNode OPTIONALLY_SYMBOL() { return getToken(SQLSelectParser.OPTIONALLY_SYMBOL, 0); }
		public TerminalNode ENCLOSED_SYMBOL() { return getToken(SQLSelectParser.ENCLOSED_SYMBOL, 0); }
		public TerminalNode ESCAPED_SYMBOL() { return getToken(SQLSelectParser.ESCAPED_SYMBOL, 0); }
		public TerminalNode LINES_SYMBOL() { return getToken(SQLSelectParser.LINES_SYMBOL, 0); }
		public TerminalNode STARTING_SYMBOL() { return getToken(SQLSelectParser.STARTING_SYMBOL, 0); }
		public TerminalNode GLOBAL_SYMBOL() { return getToken(SQLSelectParser.GLOBAL_SYMBOL, 0); }
		public TerminalNode LOCAL_SYMBOL() { return getToken(SQLSelectParser.LOCAL_SYMBOL, 0); }
		public TerminalNode SESSION_SYMBOL() { return getToken(SQLSelectParser.SESSION_SYMBOL, 0); }
		public IdentifierKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierKeyword; }
	}

	public final IdentifierKeywordContext identifierKeyword() throws RecognitionException {
		IdentifierKeywordContext _localctx = new IdentifierKeywordContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_identifierKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2436);
			_la = _input.LA(1);
			if ( !(((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (TINYINT_SYMBOL - 46)) | (1L << (SMALLINT_SYMBOL - 46)) | (1L << (MEDIUMINT_SYMBOL - 46)) | (1L << (INT_SYMBOL - 46)) | (1L << (BIGINT_SYMBOL - 46)) | (1L << (SECOND_SYMBOL - 46)) | (1L << (MINUTE_SYMBOL - 46)) | (1L << (HOUR_SYMBOL - 46)) | (1L << (DAY_SYMBOL - 46)) | (1L << (WEEK_SYMBOL - 46)) | (1L << (MONTH_SYMBOL - 46)) | (1L << (QUARTER_SYMBOL - 46)) | (1L << (YEAR_SYMBOL - 46)) | (1L << (DEFAULT_SYMBOL - 46)) | (1L << (UNION_SYMBOL - 46)) | (1L << (SELECT_SYMBOL - 46)) | (1L << (ALL_SYMBOL - 46)) | (1L << (DISTINCT_SYMBOL - 46)) | (1L << (STRAIGHT_JOIN_SYMBOL - 46)) | (1L << (HIGH_PRIORITY_SYMBOL - 46)) | (1L << (SQL_SMALL_RESULT_SYMBOL - 46)) | (1L << (SQL_BIG_RESULT_SYMBOL - 46)) | (1L << (SQL_BUFFER_RESULT_SYMBOL - 46)) | (1L << (SQL_CALC_FOUND_ROWS_SYMBOL - 46)) | (1L << (LIMIT_SYMBOL - 46)) | (1L << (OFFSET_SYMBOL - 46)) | (1L << (INTO_SYMBOL - 46)) | (1L << (OUTFILE_SYMBOL - 46)) | (1L << (DUMPFILE_SYMBOL - 46)) | (1L << (PROCEDURE_SYMBOL - 46)) | (1L << (ANALYSE_SYMBOL - 46)) | (1L << (HAVING_SYMBOL - 46)) | (1L << (WINDOW_SYMBOL - 46)) | (1L << (AS_SYMBOL - 46)) | (1L << (PARTITION_SYMBOL - 46)) | (1L << (BY_SYMBOL - 46)) | (1L << (ROWS_SYMBOL - 46)) | (1L << (RANGE_SYMBOL - 46)) | (1L << (GROUPS_SYMBOL - 46)) | (1L << (UNBOUNDED_SYMBOL - 46)) | (1L << (PRECEDING_SYMBOL - 46)) | (1L << (INTERVAL_SYMBOL - 46)) | (1L << (CURRENT_SYMBOL - 46)) | (1L << (ROW_SYMBOL - 46)) | (1L << (BETWEEN_SYMBOL - 46)) | (1L << (AND_SYMBOL - 46)) | (1L << (FOLLOWING_SYMBOL - 46)) | (1L << (EXCLUDE_SYMBOL - 46)) | (1L << (GROUP_SYMBOL - 46)) | (1L << (TIES_SYMBOL - 46)) | (1L << (NO_SYMBOL - 46)) | (1L << (OTHERS_SYMBOL - 46)) | (1L << (WITH_SYMBOL - 46)) | (1L << (RECURSIVE_SYMBOL - 46)) | (1L << (ROLLUP_SYMBOL - 46)) | (1L << (CUBE_SYMBOL - 46)) | (1L << (ORDER_SYMBOL - 46)) | (1L << (ASC_SYMBOL - 46)) | (1L << (DESC_SYMBOL - 46)) | (1L << (FROM_SYMBOL - 46)) | (1L << (DUAL_SYMBOL - 46)) | (1L << (VALUES_SYMBOL - 46)) | (1L << (TABLE_SYMBOL - 46)) | (1L << (SQL_NO_CACHE_SYMBOL - 46)))) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (SQL_CACHE_SYMBOL - 110)) | (1L << (MAX_STATEMENT_TIME_SYMBOL - 110)) | (1L << (FOR_SYMBOL - 110)) | (1L << (OF_SYMBOL - 110)) | (1L << (LOCK_SYMBOL - 110)) | (1L << (IN_SYMBOL - 110)) | (1L << (SHARE_SYMBOL - 110)) | (1L << (MODE_SYMBOL - 110)) | (1L << (UPDATE_SYMBOL - 110)) | (1L << (SKIP_SYMBOL - 110)) | (1L << (LOCKED_SYMBOL - 110)) | (1L << (NOWAIT_SYMBOL - 110)) | (1L << (WHERE_SYMBOL - 110)) | (1L << (OJ_SYMBOL - 110)) | (1L << (ON_SYMBOL - 110)) | (1L << (USING_SYMBOL - 110)) | (1L << (NATURAL_SYMBOL - 110)) | (1L << (INNER_SYMBOL - 110)) | (1L << (JOIN_SYMBOL - 110)) | (1L << (LEFT_SYMBOL - 110)) | (1L << (RIGHT_SYMBOL - 110)) | (1L << (OUTER_SYMBOL - 110)) | (1L << (CROSS_SYMBOL - 110)) | (1L << (LATERAL_SYMBOL - 110)) | (1L << (JSON_TABLE_SYMBOL - 110)) | (1L << (COLUMNS_SYMBOL - 110)) | (1L << (ORDINALITY_SYMBOL - 110)) | (1L << (EXISTS_SYMBOL - 110)) | (1L << (PATH_SYMBOL - 110)) | (1L << (NESTED_SYMBOL - 110)) | (1L << (EMPTY_SYMBOL - 110)) | (1L << (ERROR_SYMBOL - 110)) | (1L << (NULL_SYMBOL - 110)) | (1L << (USE_SYMBOL - 110)) | (1L << (FORCE_SYMBOL - 110)) | (1L << (IGNORE_SYMBOL - 110)) | (1L << (KEY_SYMBOL - 110)) | (1L << (INDEX_SYMBOL - 110)) | (1L << (PRIMARY_SYMBOL - 110)) | (1L << (IS_SYMBOL - 110)) | (1L << (TRUE_SYMBOL - 110)) | (1L << (FALSE_SYMBOL - 110)) | (1L << (UNKNOWN_SYMBOL - 110)) | (1L << (NOT_SYMBOL - 110)) | (1L << (XOR_SYMBOL - 110)) | (1L << (OR_SYMBOL - 110)) | (1L << (ANY_SYMBOL - 110)) | (1L << (MEMBER_SYMBOL - 110)) | (1L << (SOUNDS_SYMBOL - 110)) | (1L << (LIKE_SYMBOL - 110)) | (1L << (ESCAPE_SYMBOL - 110)) | (1L << (REGEXP_SYMBOL - 110)) | (1L << (DIV_SYMBOL - 110)) | (1L << (MOD_SYMBOL - 110)) | (1L << (MATCH_SYMBOL - 110)) | (1L << (AGAINST_SYMBOL - 110)) | (1L << (BINARY_SYMBOL - 110)) | (1L << (CAST_SYMBOL - 110)) | (1L << (ARRAY_SYMBOL - 110)) | (1L << (CASE_SYMBOL - 110)) | (1L << (END_SYMBOL - 110)) | (1L << (CONVERT_SYMBOL - 110)) | (1L << (COLLATE_SYMBOL - 110)) | (1L << (AVG_SYMBOL - 110)))) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (BIT_AND_SYMBOL - 174)) | (1L << (BIT_OR_SYMBOL - 174)) | (1L << (BIT_XOR_SYMBOL - 174)) | (1L << (COUNT_SYMBOL - 174)) | (1L << (MIN_SYMBOL - 174)) | (1L << (MAX_SYMBOL - 174)) | (1L << (STD_SYMBOL - 174)) | (1L << (VARIANCE_SYMBOL - 174)) | (1L << (STDDEV_SAMP_SYMBOL - 174)) | (1L << (VAR_SAMP_SYMBOL - 174)) | (1L << (SUM_SYMBOL - 174)) | (1L << (GROUP_CONCAT_SYMBOL - 174)) | (1L << (SEPARATOR_SYMBOL - 174)) | (1L << (GROUPING_SYMBOL - 174)) | (1L << (ROW_NUMBER_SYMBOL - 174)) | (1L << (RANK_SYMBOL - 174)) | (1L << (DENSE_RANK_SYMBOL - 174)) | (1L << (CUME_DIST_SYMBOL - 174)) | (1L << (PERCENT_RANK_SYMBOL - 174)) | (1L << (NTILE_SYMBOL - 174)) | (1L << (LEAD_SYMBOL - 174)) | (1L << (LAG_SYMBOL - 174)) | (1L << (FIRST_VALUE_SYMBOL - 174)) | (1L << (LAST_VALUE_SYMBOL - 174)) | (1L << (NTH_VALUE_SYMBOL - 174)) | (1L << (FIRST_SYMBOL - 174)) | (1L << (LAST_SYMBOL - 174)) | (1L << (OVER_SYMBOL - 174)) | (1L << (RESPECT_SYMBOL - 174)) | (1L << (NULLS_SYMBOL - 174)) | (1L << (JSON_ARRAYAGG_SYMBOL - 174)) | (1L << (JSON_OBJECTAGG_SYMBOL - 174)) | (1L << (BOOLEAN_SYMBOL - 174)) | (1L << (LANGUAGE_SYMBOL - 174)) | (1L << (QUERY_SYMBOL - 174)) | (1L << (EXPANSION_SYMBOL - 174)) | (1L << (CHAR_SYMBOL - 174)) | (1L << (CURRENT_USER_SYMBOL - 174)) | (1L << (DATE_SYMBOL - 174)) | (1L << (INSERT_SYMBOL - 174)) | (1L << (TIME_SYMBOL - 174)) | (1L << (TIMESTAMP_SYMBOL - 174)) | (1L << (USER_SYMBOL - 174)) | (1L << (ADDDATE_SYMBOL - 174)) | (1L << (SUBDATE_SYMBOL - 174)) | (1L << (CURDATE_SYMBOL - 174)) | (1L << (CURTIME_SYMBOL - 174)) | (1L << (DATE_ADD_SYMBOL - 174)) | (1L << (DATE_SUB_SYMBOL - 174)) | (1L << (EXTRACT_SYMBOL - 174)) | (1L << (GET_FORMAT_SYMBOL - 174)) | (1L << (NOW_SYMBOL - 174)) | (1L << (POSITION_SYMBOL - 174)) | (1L << (SYSDATE_SYMBOL - 174)) | (1L << (TIMESTAMP_ADD_SYMBOL - 174)) | (1L << (TIMESTAMP_DIFF_SYMBOL - 174)) | (1L << (UTC_DATE_SYMBOL - 174)) | (1L << (UTC_TIME_SYMBOL - 174)) | (1L << (UTC_TIMESTAMP_SYMBOL - 174)) | (1L << (ASCII_SYMBOL - 174)) | (1L << (CHARSET_SYMBOL - 174)) | (1L << (COALESCE_SYMBOL - 174)) | (1L << (COLLATION_SYMBOL - 174)) | (1L << (DATABASE_SYMBOL - 174)))) != 0) || ((((_la - 238)) & ~0x3f) == 0 && ((1L << (_la - 238)) & ((1L << (IF_SYMBOL - 238)) | (1L << (FORMAT_SYMBOL - 238)) | (1L << (MICROSECOND_SYMBOL - 238)) | (1L << (OLD_PASSWORD_SYMBOL - 238)) | (1L << (PASSWORD_SYMBOL - 238)) | (1L << (REPEAT_SYMBOL - 238)) | (1L << (REPLACE_SYMBOL - 238)) | (1L << (REVERSE_SYMBOL - 238)) | (1L << (ROW_COUNT_SYMBOL - 238)) | (1L << (TRUNCATE_SYMBOL - 238)) | (1L << (WEIGHT_STRING_SYMBOL - 238)) | (1L << (CONTAINS_SYMBOL - 238)) | (1L << (GEOMETRYCOLLECTION_SYMBOL - 238)) | (1L << (LINESTRING_SYMBOL - 238)) | (1L << (MULTILINESTRING_SYMBOL - 238)) | (1L << (MULTIPOINT_SYMBOL - 238)) | (1L << (MULTIPOLYGON_SYMBOL - 238)) | (1L << (POINT_SYMBOL - 238)) | (1L << (POLYGON_SYMBOL - 238)) | (1L << (LEVEL_SYMBOL - 238)) | (1L << (DATETIME_SYMBOL - 238)) | (1L << (TRIM_SYMBOL - 238)) | (1L << (LEADING_SYMBOL - 238)) | (1L << (TRAILING_SYMBOL - 238)) | (1L << (BOTH_SYMBOL - 238)) | (1L << (SUBSTRING_SYMBOL - 238)) | (1L << (WHEN_SYMBOL - 238)) | (1L << (THEN_SYMBOL - 238)) | (1L << (ELSE_SYMBOL - 238)) | (1L << (SIGNED_SYMBOL - 238)) | (1L << (UNSIGNED_SYMBOL - 238)) | (1L << (DECIMAL_SYMBOL - 238)) | (1L << (JSON_SYMBOL - 238)) | (1L << (FLOAT_SYMBOL - 238)) | (1L << (SET_SYMBOL - 238)) | (1L << (SECOND_MICROSECOND_SYMBOL - 238)) | (1L << (MINUTE_MICROSECOND_SYMBOL - 238)) | (1L << (MINUTE_SECOND_SYMBOL - 238)) | (1L << (HOUR_MICROSECOND_SYMBOL - 238)) | (1L << (HOUR_SECOND_SYMBOL - 238)) | (1L << (HOUR_MINUTE_SYMBOL - 238)) | (1L << (DAY_MICROSECOND_SYMBOL - 238)) | (1L << (DAY_SECOND_SYMBOL - 238)) | (1L << (DAY_MINUTE_SYMBOL - 238)) | (1L << (DAY_HOUR_SYMBOL - 238)) | (1L << (YEAR_MONTH_SYMBOL - 238)) | (1L << (BTREE_SYMBOL - 238)) | (1L << (RTREE_SYMBOL - 238)) | (1L << (HASH_SYMBOL - 238)) | (1L << (REAL_SYMBOL - 238)) | (1L << (DOUBLE_SYMBOL - 238)) | (1L << (PRECISION_SYMBOL - 238)) | (1L << (NUMERIC_SYMBOL - 238)) | (1L << (FIXED_SYMBOL - 238)) | (1L << (BIT_SYMBOL - 238)) | (1L << (BOOL_SYMBOL - 238)) | (1L << (VARYING_SYMBOL - 238)) | (1L << (VARCHAR_SYMBOL - 238)) | (1L << (NATIONAL_SYMBOL - 238)) | (1L << (NVARCHAR_SYMBOL - 238)) | (1L << (NCHAR_SYMBOL - 238)) | (1L << (VARBINARY_SYMBOL - 238)) | (1L << (TINYBLOB_SYMBOL - 238)) | (1L << (BLOB_SYMBOL - 238)))) != 0) || ((((_la - 302)) & ~0x3f) == 0 && ((1L << (_la - 302)) & ((1L << (MEDIUMBLOB_SYMBOL - 302)) | (1L << (LONGBLOB_SYMBOL - 302)) | (1L << (LONG_SYMBOL - 302)) | (1L << (TINYTEXT_SYMBOL - 302)) | (1L << (TEXT_SYMBOL - 302)) | (1L << (MEDIUMTEXT_SYMBOL - 302)) | (1L << (LONGTEXT_SYMBOL - 302)) | (1L << (ENUM_SYMBOL - 302)) | (1L << (SERIAL_SYMBOL - 302)) | (1L << (GEOMETRY_SYMBOL - 302)) | (1L << (ZEROFILL_SYMBOL - 302)) | (1L << (BYTE_SYMBOL - 302)) | (1L << (UNICODE_SYMBOL - 302)) | (1L << (TERMINATED_SYMBOL - 302)) | (1L << (OPTIONALLY_SYMBOL - 302)) | (1L << (ENCLOSED_SYMBOL - 302)) | (1L << (ESCAPED_SYMBOL - 302)) | (1L << (LINES_SYMBOL - 302)) | (1L << (STARTING_SYMBOL - 302)) | (1L << (GLOBAL_SYMBOL - 302)) | (1L << (LOCAL_SYMBOL - 302)) | (1L << (SESSION_SYMBOL - 302)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 75:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 76:
			return boolPri_sempred((BoolPriContext)_localctx, predIndex);
		case 80:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 81:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean boolPri_sempred(BoolPriContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bitExpr_sempred(BitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 15);
		case 14:
			return precpred(_ctx, 21);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0154\u0989\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\3\2\3\2\3\2\5\2\u015e\n\2\3\2\5\2\u0161\n\2\3\3\3\3\5\3\u0165\n\3\3\3"+
		"\3\3\3\3\5\3\u016a\n\3\7\3\u016c\n\3\f\3\16\3\u016f\13\3\3\4\3\4\5\4\u0173"+
		"\n\4\3\4\3\4\5\4\u0177\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0180\n\5\3"+
		"\5\3\5\3\5\5\5\u0185\n\5\3\6\5\6\u0188\n\6\3\6\3\6\5\6\u018c\n\6\3\6\5"+
		"\6\u018f\n\6\3\6\3\6\5\6\u0193\n\6\3\6\5\6\u0196\n\6\5\6\u0198\n\6\3\6"+
		"\5\6\u019b\n\6\3\7\3\7\3\7\3\7\5\7\u01a1\n\7\3\7\3\7\5\7\u01a5\n\7\5\7"+
		"\u01a7\n\7\3\7\3\7\5\7\u01ab\n\7\3\7\3\7\5\7\u01af\n\7\7\7\u01b1\n\7\f"+
		"\7\16\7\u01b4\13\7\3\b\3\b\3\b\3\b\5\b\u01ba\n\b\5\b\u01bc\n\b\3\b\3\b"+
		"\3\t\3\t\3\t\5\t\u01c3\n\t\3\n\3\n\7\n\u01c7\n\n\f\n\16\n\u01ca\13\n\3"+
		"\n\3\n\5\n\u01ce\n\n\3\n\5\n\u01d1\n\n\3\n\5\n\u01d4\n\n\3\n\5\n\u01d7"+
		"\n\n\3\n\5\n\u01da\n\n\3\n\5\n\u01dd\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\5\16\u01e9\n\16\3\17\3\17\5\17\u01ed\n\17\3\20\3\20\3"+
		"\20\3\20\5\20\u01f3\n\20\3\20\5\20\u01f6\n\20\3\20\5\20\u01f9\n\20\3\20"+
		"\3\20\3\20\3\20\5\20\u01ff\n\20\3\20\3\20\3\20\5\20\u0204\n\20\7\20\u0206"+
		"\n\20\f\20\16\20\u0209\13\20\5\20\u020b\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u0213\n\21\5\21\u0215\n\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\7\23\u0220\n\23\f\23\16\23\u0223\13\23\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\26\5\26\u022e\n\26\3\26\3\26\3\26\5\26\u0233"+
		"\n\26\3\26\5\26\u0236\n\26\3\26\5\26\u0239\n\26\3\27\3\27\3\27\5\27\u023e"+
		"\n\27\3\30\3\30\3\31\3\31\5\31\u0244\n\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0254\n\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0268\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0271\n"+
		"\35\3\36\3\36\5\36\u0275\n\36\3\36\3\36\3\36\7\36\u027a\n\36\f\36\16\36"+
		"\u027d\13\36\3\37\3\37\5\37\u0281\n\37\3\37\3\37\3\37\3 \3 \3 \3 \5 \u028a"+
		"\n \3!\3!\3!\3!\5!\u0290\n!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\5$\u029b\n"+
		"$\3%\3%\3%\7%\u02a0\n%\f%\16%\u02a3\13%\3&\3&\3&\3&\7&\u02a9\n&\f&\16"+
		"&\u02ac\13&\3\'\3\'\3\'\3(\3(\3(\5(\u02b4\n(\3(\3(\3)\3)\3)\3)\3)\3)\5"+
		")\u02be\n)\3*\6*\u02c1\n*\r*\16*\u02c2\3+\3+\3+\3+\5+\u02c9\n+\3+\5+\u02cc"+
		"\n+\3+\3+\3+\3+\5+\u02d2\n+\3,\3,\3-\3-\3-\5-\u02d9\n-\3.\3.\5.\u02dd"+
		"\n.\3.\3.\7.\u02e1\n.\f.\16.\u02e4\13.\3/\3/\5/\u02e8\n/\3/\3/\5/\u02ec"+
		"\n/\5/\u02ee\n/\3\60\5\60\u02f1\n\60\3\60\3\60\5\60\u02f5\n\60\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\5\62\u02fe\n\62\3\62\3\62\3\62\5\62\u0303"+
		"\n\62\3\62\7\62\u0306\n\62\f\62\16\62\u0309\13\62\3\63\3\63\7\63\u030d"+
		"\n\63\f\63\16\63\u0310\13\63\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0318"+
		"\n\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0320\n\64\3\64\3\64\3\64\5\64"+
		"\u0325\n\64\3\65\3\65\5\65\u0329\n\65\3\65\3\65\3\65\3\65\5\65\u032f\n"+
		"\65\3\65\5\65\u0332\n\65\3\66\5\66\u0335\n\66\3\66\3\66\5\66\u0339\n\66"+
		"\3\67\3\67\5\67\u033d\n\67\3\67\3\67\38\38\38\38\38\58\u0346\n8\39\39"+
		"\59\u034a\n9\39\59\u034d\n9\39\59\u0350\n9\3:\3:\3:\5:\u0355\n:\3:\3:"+
		"\3;\3;\5;\u035b\n;\3;\5;\u035e\n;\3;\3;\3;\5;\u0363\n;\3;\5;\u0366\n;"+
		"\5;\u0368\n;\3<\3<\3<\5<\u036d\n<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0379"+
		"\n=\3>\3>\3>\3>\3>\7>\u0380\n>\f>\16>\u0383\13>\3>\3>\3?\3?\3?\3?\3?\3"+
		"?\3?\5?\u038e\n?\3?\5?\u0391\n?\3?\3?\3?\5?\u0396\n?\3?\3?\3?\3?\3?\5"+
		"?\u039d\n?\3@\3@\5@\u03a1\n@\3@\3@\5@\u03a5\n@\5@\u03a7\n@\3A\3A\3A\3"+
		"A\3B\3B\3B\3B\3C\3C\3C\3C\5C\u03b5\nC\3D\3D\3E\5E\u03ba\nE\3E\3E\3F\3"+
		"F\3F\7F\u03c1\nF\fF\16F\u03c4\13F\3G\3G\3G\5G\u03c9\nG\3G\3G\3G\3G\3G"+
		"\3G\3G\5G\u03d2\nG\3G\3G\5G\u03d6\nG\3G\3G\5G\u03da\nG\3H\3H\3I\3I\3J"+
		"\3J\3J\3J\3J\3J\5J\u03e6\nJ\3K\3K\3K\7K\u03eb\nK\fK\16K\u03ee\13K\3L\3"+
		"L\5L\u03f2\nL\3M\3M\3M\3M\5M\u03f8\nM\3M\5M\u03fb\nM\3M\3M\5M\u03ff\n"+
		"M\3M\3M\3M\3M\3M\3M\3M\3M\3M\7M\u040a\nM\fM\16M\u040d\13M\3N\3N\3N\3N"+
		"\3N\3N\5N\u0415\nN\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\7N\u0421\nN\fN\16N\u0424"+
		"\13N\3O\3O\3P\3P\5P\u042a\nP\3P\3P\3P\5P\u042f\nP\3P\3P\3P\3P\5P\u0435"+
		"\nP\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u043d\nQ\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0448"+
		"\nQ\3Q\3Q\5Q\u044c\nQ\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\7R\u0469\nR\fR\16R\u046c\13R\3S\3S\3"+
		"S\3S\3S\5S\u0473\nS\3S\3S\5S\u0477\nS\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3"+
		"S\3S\3S\5S\u0486\nS\3S\3S\3S\3S\3S\5S\u048d\nS\3S\3S\3S\3S\3S\3S\3S\3"+
		"S\3S\3S\3S\3S\5S\u049b\nS\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u04a7\nS\3"+
		"S\3S\3S\3S\5S\u04ad\nS\3S\3S\3S\6S\u04b2\nS\rS\16S\u04b3\3S\5S\u04b7\n"+
		"S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3"+
		"S\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u04d9\nS\3S\3S\3S\3S\3S\3S\7S\u04e1\n"+
		"S\fS\16S\u04e4\13S\3T\3T\3T\3T\5T\u04ea\nT\3U\3U\3U\5U\u04ef\nU\3U\3U"+
		"\3U\5U\u04f4\nU\3U\3U\3U\3U\3U\5U\u04fb\nU\3U\3U\3U\3U\5U\u0501\nU\3U"+
		"\3U\3U\5U\u0506\nU\3U\3U\3U\5U\u050b\nU\3U\3U\3U\3U\5U\u0511\nU\3U\3U"+
		"\5U\u0515\nU\3U\3U\3U\5U\u051a\nU\3U\3U\3U\5U\u051f\nU\3U\3U\3U\5U\u0524"+
		"\nU\3U\3U\3U\5U\u0529\nU\3U\3U\3U\3U\3U\5U\u0530\nU\3U\3U\3U\3U\3U\5U"+
		"\u0537\nU\3U\3U\3U\3U\3U\5U\u053e\nU\3U\3U\3U\3U\3U\5U\u0545\nU\3U\3U"+
		"\3U\5U\u054a\nU\3U\3U\3U\5U\u054f\nU\3U\3U\3U\5U\u0554\nU\3U\3U\5U\u0558"+
		"\nU\3U\3U\5U\u055c\nU\3U\3U\5U\u0560\nU\5U\u0562\nU\3V\3V\3V\3V\3V\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u0575\nW\3W\3W\5W\u0579\nW\3W\3W"+
		"\3W\3W\3W\5W\u0580\nW\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u058c\nW\3W\5W"+
		"\u058f\nW\3W\3W\5W\u0593\nW\3X\3X\3X\5X\u0598\nX\3Y\3Y\3Y\5Y\u059d\nY"+
		"\3Y\3Y\5Y\u05a1\nY\3Z\3Z\3Z\3[\3[\3[\3[\3[\5[\u05ab\n[\3[\3[\3[\3[\3["+
		"\3[\3[\5[\u05b4\n[\5[\u05b6\n[\3\\\5\\\u05b9\n\\\3\\\3\\\3]\3]\3]\3]\3"+
		"]\5]\u05c2\n]\3^\3^\3^\7^\u05c7\n^\f^\16^\u05ca\13^\3_\3_\3_\3_\3_\3_"+
		"\3_\3_\3_\3_\5_\u05d6\n_\3_\3_\3_\5_\u05db\n_\3`\3`\3`\3`\3`\5`\u05e2"+
		"\n`\3`\3`\3`\3`\5`\u05e8\n`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\3`\6`\u0600\n`\r`\16`\u0601\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5"+
		"`\u0621\n`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u0635"+
		"\n`\3`\3`\3`\3`\5`\u063b\n`\3`\3`\5`\u063f\n`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u065a\n`\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\3`\5`\u0666\n`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\5`\u0673\n`\3`\3`\5`\u0677\n`\3`\3`\5`\u067b\n`\3`\3`\3`\3`\3`\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u0697\n`"+
		"\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`"+
		"\3`\3`\3`\3`\3`\3`\5`\u06cd\n`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u06d7\n`\3`"+
		"\5`\u06da\n`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u06e6\n`\3`\3`\3`\5`\u06eb"+
		"\n`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u06f7\na\3a\3a\3a\3a\3a\3a\3a\3a"+
		"\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u070b\na\3b\3b\5b\u070f\nb\3b\3b\3c"+
		"\3c\3d\3d\3d\3d\3d\3d\3d\3d\7d\u071d\nd\fd\16d\u0720\13d\5d\u0722\nd\3"+
		"e\3e\3e\5e\u0727\ne\3e\5e\u072a\ne\3f\3f\3g\3g\3g\3g\3g\5g\u0733\ng\3"+
		"g\3g\5g\u0737\ng\3g\3g\3g\3g\5g\u073d\ng\3g\3g\3g\3g\5g\u0743\ng\3g\3"+
		"g\5g\u0747\ng\3g\3g\3h\3h\3h\3h\3h\3h\3h\5h\u0752\nh\3h\3h\3h\3h\5h\u0758"+
		"\nh\5h\u075a\nh\3h\3h\3i\3i\3i\5i\u0761\ni\3i\3i\3i\3i\3i\5i\u0768\ni"+
		"\3i\3i\5i\u076c\ni\3j\3j\3j\7j\u0771\nj\fj\16j\u0774\13j\3k\3k\5k\u0778"+
		"\nk\3l\3l\5l\u077c\nl\3m\3m\3m\5m\u0781\nm\3n\3n\5n\u0785\nn\3n\3n\5n"+
		"\u0789\nn\3o\3o\3o\3p\3p\3p\3q\3q\3q\3r\3r\5r\u0796\nr\3r\3r\5r\u079a"+
		"\nr\3r\5r\u079d\nr\3r\3r\5r\u07a1\nr\3r\3r\5r\u07a5\nr\3r\3r\5r\u07a9"+
		"\nr\3r\3r\3r\5r\u07ae\nr\3r\3r\5r\u07b2\nr\3r\3r\5r\u07b6\nr\3r\3r\3r"+
		"\3r\5r\u07bc\nr\5r\u07be\nr\3s\3s\3s\7s\u07c3\ns\fs\16s\u07c6\13s\3t\3"+
		"t\3t\5t\u07cb\nt\3u\3u\3v\3v\3w\3w\5w\u07d3\nw\3x\3x\3y\3y\3y\3y\3z\3"+
		"z\3z\3z\3{\3{\3{\3{\3|\3|\3|\7|\u07e6\n|\f|\16|\u07e9\13|\3}\3}\5}\u07ed"+
		"\n}\3~\3~\3\177\3\177\5\177\u07f3\n\177\3\177\5\177\u07f6\n\177\3\177"+
		"\3\177\3\177\5\177\u07fb\n\177\5\177\u07fd\n\177\3\177\5\177\u0800\n\177"+
		"\3\177\5\177\u0803\n\177\3\177\3\177\5\177\u0807\n\177\3\177\5\177\u080a"+
		"\n\177\3\177\3\177\5\177\u080e\n\177\3\177\3\177\3\177\5\177\u0813\n\177"+
		"\3\177\5\177\u0816\n\177\3\177\3\177\5\177\u081a\n\177\3\177\5\177\u081d"+
		"\n\177\3\177\3\177\5\177\u0821\n\177\3\177\3\177\3\177\5\177\u0826\n\177"+
		"\3\177\3\177\5\177\u082a\n\177\3\177\3\177\3\177\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\3\177\5\177\u0836\n\177\3\177\3\177\5\177\u083a\n\177\3\177"+
		"\3\177\3\177\3\177\5\177\u0840\n\177\3\177\5\177\u0843\n\177\3\177\3\177"+
		"\3\177\5\177\u0848\n\177\3\177\3\177\5\177\u084c\n\177\3\177\3\177\5\177"+
		"\u0850\n\177\3\177\3\177\3\177\5\177\u0855\n\177\3\177\3\177\3\177\3\177"+
		"\3\177\3\177\3\177\5\177\u085e\n\177\3\177\5\177\u0861\n\177\3\177\3\177"+
		"\5\177\u0865\n\177\3\177\3\177\5\177\u0869\n\177\3\177\5\177\u086c\n\177"+
		"\3\177\3\177\5\177\u0870\n\177\3\177\3\177\5\177\u0874\n\177\3\177\3\177"+
		"\3\177\5\177\u0879\n\177\3\177\3\177\3\177\5\177\u087e\n\177\3\177\3\177"+
		"\3\177\5\177\u0883\n\177\3\u0080\3\u0080\3\u0080\5\u0080\u0888\n\u0080"+
		"\3\u0081\3\u0081\3\u0081\5\u0081\u088d\n\u0081\5\u0081\u088f\n\u0081\3"+
		"\u0082\3\u0082\3\u0082\5\u0082\u0894\n\u0082\3\u0082\3\u0082\3\u0083\6"+
		"\u0083\u0899\n\u0083\r\u0083\16\u0083\u089a\3\u0084\3\u0084\3\u0084\3"+
		"\u0084\3\u0084\3\u0084\5\u0084\u08a3\n\u0084\3\u0084\3\u0084\3\u0084\3"+
		"\u0084\5\u0084\u08a9\n\u0084\5\u0084\u08ab\n\u0084\3\u0085\3\u0085\5\u0085"+
		"\u08af\n\u0085\3\u0085\3\u0085\5\u0085\u08b3\n\u0085\3\u0086\3\u0086\5"+
		"\u0086\u08b7\n\u0086\3\u0086\3\u0086\5\u0086\u08bb\n\u0086\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089"+
		"\5\u0089\u08c8\n\u0089\3\u008a\3\u008a\3\u008a\5\u008a\u08cd\n\u008a\3"+
		"\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\6\u008d"+
		"\u08d7\n\u008d\r\u008d\16\u008d\u08d8\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\5\u008e\u08df\n\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\5\u008e\u08e7\n\u008e\3\u008f\3\u008f\6\u008f\u08eb\n\u008f\r\u008f\16"+
		"\u008f\u08ec\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3"+
		"\u0092\3\u0092\3\u0092\3\u0092\7\u0092\u08fa\n\u0092\f\u0092\16\u0092"+
		"\u08fd\13\u0092\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\7\u0093\u0904"+
		"\n\u0093\f\u0093\16\u0093\u0907\13\u0093\3\u0094\3\u0094\3\u0095\3\u0095"+
		"\5\u0095\u090d\n\u0095\3\u0096\3\u0096\3\u0096\7\u0096\u0912\n\u0096\f"+
		"\u0096\16\u0096\u0915\13\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098"+
		"\3\u0098\3\u0098\7\u0098\u091e\n\u0098\f\u0098\16\u0098\u0921\13\u0098"+
		"\3\u0098\3\u0098\5\u0098\u0925\n\u0098\3\u0099\3\u0099\3\u0099\3\u009a"+
		"\3\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009d\3\u009d\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u0938\n\u009e\3\u009e\5\u009e"+
		"\u093b\n\u009e\3\u009f\3\u009f\3\u009f\3\u009f\7\u009f\u0941\n\u009f\f"+
		"\u009f\16\u009f\u0944\13\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\5\u00a0"+
		"\u094a\n\u00a0\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u094f\n\u00a1\3\u00a2\5"+
		"\u00a2\u0952\n\u00a2\3\u00a2\3\u00a2\5\u00a2\u0956\n\u00a2\3\u00a2\7\u00a2"+
		"\u0959\n\u00a2\f\u00a2\16\u00a2\u095c\13\u00a2\3\u00a3\3\u00a3\3\u00a4"+
		"\3\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6\3\u00a6"+
		"\5\u00a6\u096a\n\u00a6\3\u00a7\3\u00a7\5\u00a7\u096e\n\u00a7\3\u00a8\3"+
		"\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a9\3\u00a9\5\u00a9\u0978\n"+
		"\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u0985\n\u00ac\3\u00ad\3\u00ad\3\u00ad"+
		"\2\6\u0098\u009a\u00a2\u00a4\u00ae\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\2\64"+
		"\3\2@G\4\2\32\32II\4\2**--\3\2TV\3\2ij\4\2vvxx\3\2\u0083\u0084\4\2\u0081"+
		"\u0081\u0086\u0086\3\2@A\4\2\3\3QQ\3\2\u0092\u0093\3\2\u0094\u0095\3\2"+
		"\u0098\u009a\4\2\24\24]]\4\2\27\27\u009d\u009d\4\2@@\u009e\u009e\4\2\3"+
		"\3\5\n\4\2\r\17\u00a4\u00a5\3\2\13\f\3\2\22\23\4\2\13\f\21\21\3\2\u00b0"+
		"\u00b2\3\2\u00be\u00c2\3\2\u00c4\u00c5\3\2\u00c6\u00c7\3\2\u00c9\u00ca"+
		"\4\2\u0093\u0093\u00cc\u00cc\3\2\u00db\u00dc\3\2\u00df\u00e0\3\2\u00e6"+
		"\u00e7\5\2\u00d6\u00d6\u00d8\u00d9\u0104\u0104\3\2\u0113\u011d\4\2\65"+
		"<\u00f2\u00f2\3\2\u011e\u0120\3\2\60\64\5\2\u010f\u010f\u0111\u0111\u0124"+
		"\u0125\4\2\u00d0\u00d0\u0127\u0127\3\2\u0130\u0131\4\2\u00fc\u0102\u0139"+
		"\u0139\4\2\u010d\u010e\u013a\u013a\4\2\u013d\u013d\u0142\u0142\4\2\u0149"+
		"\u0149\u014b\u014e\4\2++-/\4\2++--\3\2-/\3\2+,\3\2\u0098\u0099\4\2))\u0090"+
		"\u0090\3\2\3\4\3\2\60\u0145\2\u0ad0\2\u015a\3\2\2\2\4\u0164\3\2\2\2\6"+
		"\u0176\3\2\2\2\b\u0184\3\2\2\2\n\u0187\3\2\2\2\f\u01a6\3\2\2\2\16\u01b5"+
		"\3\2\2\2\20\u01c2\3\2\2\2\22\u01c4\3\2\2\2\24\u01de\3\2\2\2\26\u01e0\3"+
		"\2\2\2\30\u01e2\3\2\2\2\32\u01e5\3\2\2\2\34\u01ec\3\2\2\2\36\u01ee\3\2"+
		"\2\2 \u020c\3\2\2\2\"\u0218\3\2\2\2$\u021b\3\2\2\2&\u0224\3\2\2\2(\u0228"+
		"\3\2\2\2*\u022d\3\2\2\2,\u023a\3\2\2\2.\u023f\3\2\2\2\60\u0243\3\2\2\2"+
		"\62\u0253\3\2\2\2\64\u0255\3\2\2\2\66\u0267\3\2\2\28\u0269\3\2\2\2:\u0272"+
		"\3\2\2\2<\u027e\3\2\2\2>\u0285\3\2\2\2@\u028f\3\2\2\2B\u0291\3\2\2\2D"+
		"\u0295\3\2\2\2F\u0297\3\2\2\2H\u029c\3\2\2\2J\u02a4\3\2\2\2L\u02ad\3\2"+
		"\2\2N\u02b0\3\2\2\2P\u02bd\3\2\2\2R\u02c0\3\2\2\2T\u02d1\3\2\2\2V\u02d3"+
		"\3\2\2\2X\u02d8\3\2\2\2Z\u02dc\3\2\2\2\\\u02ed\3\2\2\2^\u02f0\3\2\2\2"+
		"`\u02f6\3\2\2\2b\u0302\3\2\2\2d\u030a\3\2\2\2f\u0324\3\2\2\2h\u0331\3"+
		"\2\2\2j\u0338\3\2\2\2l\u033a\3\2\2\2n\u0345\3\2\2\2p\u0347\3\2\2\2r\u0351"+
		"\3\2\2\2t\u0367\3\2\2\2v\u0369\3\2\2\2x\u0370\3\2\2\2z\u037a\3\2\2\2|"+
		"\u039c\3\2\2\2~\u03a6\3\2\2\2\u0080\u03a8\3\2\2\2\u0082\u03ac\3\2\2\2"+
		"\u0084\u03b4\3\2\2\2\u0086\u03b6\3\2\2\2\u0088\u03b9\3\2\2\2\u008a\u03bd"+
		"\3\2\2\2\u008c\u03d9\3\2\2\2\u008e\u03db\3\2\2\2\u0090\u03dd\3\2\2\2\u0092"+
		"\u03df\3\2\2\2\u0094\u03e7\3\2\2\2\u0096\u03f1\3\2\2\2\u0098\u03fe\3\2"+
		"\2\2\u009a\u040e\3\2\2\2\u009c\u0425\3\2\2\2\u009e\u0427\3\2\2\2\u00a0"+
		"\u044b\3\2\2\2\u00a2\u044d\3\2\2\2\u00a4\u04d8\3\2\2\2\u00a6\u04e9\3\2"+
		"\2\2\u00a8\u0561\3\2\2\2\u00aa\u0563\3\2\2\2\u00ac\u0592\3\2\2\2\u00ae"+
		"\u0594\3\2\2\2\u00b0\u0599\3\2\2\2\u00b2\u05a2\3\2\2\2\u00b4\u05b5\3\2"+
		"\2\2\u00b6\u05b8\3\2\2\2\u00b8\u05c1\3\2\2\2\u00ba\u05c3\3\2\2\2\u00bc"+
		"\u05da\3\2\2\2\u00be\u06ea\3\2\2\2\u00c0\u070a\3\2\2\2\u00c2\u070c\3\2"+
		"\2\2\u00c4\u0712\3\2\2\2\u00c6\u0714\3\2\2\2\u00c8\u0723\3\2\2\2\u00ca"+
		"\u072b\3\2\2\2\u00cc\u072d\3\2\2\2\u00ce\u074a\3\2\2\2\u00d0\u076b\3\2"+
		"\2\2\u00d2\u076d\3\2\2\2\u00d4\u0775\3\2\2\2\u00d6\u077b\3\2\2\2\u00d8"+
		"\u0780\3\2\2\2\u00da\u0782\3\2\2\2\u00dc\u078a\3\2\2\2\u00de\u078d\3\2"+
		"\2\2\u00e0\u0790\3\2\2\2\u00e2\u07bd\3\2\2\2\u00e4\u07bf\3\2\2\2\u00e6"+
		"\u07ca\3\2\2\2\u00e8\u07cc\3\2\2\2\u00ea\u07ce\3\2\2\2\u00ec\u07d2\3\2"+
		"\2\2\u00ee\u07d4\3\2\2\2\u00f0\u07d6\3\2\2\2\u00f2\u07da\3\2\2\2\u00f4"+
		"\u07de\3\2\2\2\u00f6\u07e2\3\2\2\2\u00f8\u07ea\3\2\2\2\u00fa\u07ee\3\2"+
		"\2\2\u00fc\u0882\3\2\2\2\u00fe\u0887\3\2\2\2\u0100\u088e\3\2\2\2\u0102"+
		"\u0890\3\2\2\2\u0104\u0898\3\2\2\2\u0106\u08aa\3\2\2\2\u0108\u08b2\3\2"+
		"\2\2\u010a\u08ba\3\2\2\2\u010c\u08bc\3\2\2\2\u010e\u08c0\3\2\2\2\u0110"+
		"\u08c7\3\2\2\2\u0112\u08cc\3\2\2\2\u0114\u08ce\3\2\2\2\u0116\u08d1\3\2"+
		"\2\2\u0118\u08d4\3\2\2\2\u011a\u08e6\3\2\2\2\u011c\u08e8\3\2\2\2\u011e"+
		"\u08ee\3\2\2\2\u0120\u08f2\3\2\2\2\u0122\u08f5\3\2\2\2\u0124\u0900\3\2"+
		"\2\2\u0126\u0908\3\2\2\2\u0128\u090c\3\2\2\2\u012a\u090e\3\2\2\2\u012c"+
		"\u0916\3\2\2\2\u012e\u091a\3\2\2\2\u0130\u0926\3\2\2\2\u0132\u0929\3\2"+
		"\2\2\u0134\u092b\3\2\2\2\u0136\u092d\3\2\2\2\u0138\u092f\3\2\2\2\u013a"+
		"\u093a\3\2\2\2\u013c\u093c\3\2\2\2\u013e\u0949\3\2\2\2\u0140\u094e\3\2"+
		"\2\2\u0142\u0955\3\2\2\2\u0144\u095d\3\2\2\2\u0146\u095f\3\2\2\2\u0148"+
		"\u0961\3\2\2\2\u014a\u0969\3\2\2\2\u014c\u096d\3\2\2\2\u014e\u096f\3\2"+
		"\2\2\u0150\u0977\3\2\2\2\u0152\u0979\3\2\2\2\u0154\u097c\3\2\2\2\u0156"+
		"\u0984\3\2\2\2\u0158\u0986\3\2\2\2\u015a\u0160\5\6\4\2\u015b\u015d\7\33"+
		"\2\2\u015c\u015e\7\2\2\3\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u0161\3\2\2\2\u015f\u0161\7\2\2\3\u0160\u015b\3\2\2\2\u0160\u015f\3\2"+
		"\2\2\u0161\3\3\2\2\2\u0162\u0165\5\u0098M\2\u0163\u0165\7=\2\2\u0164\u0162"+
		"\3\2\2\2\u0164\u0163\3\2\2\2\u0165\u016d\3\2\2\2\u0166\u0169\7\32\2\2"+
		"\u0167\u016a\5\u0098M\2\u0168\u016a\7=\2\2\u0169\u0167\3\2\2\2\u0169\u0168"+
		"\3\2\2\2\u016a\u016c\3\2\2\2\u016b\u0166\3\2\2\2\u016c\u016f\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\5\3\2\2\2\u016f\u016d\3\2\2\2"+
		"\u0170\u0172\5\n\6\2\u0171\u0173\5R*\2\u0172\u0171\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0177\3\2\2\2\u0174\u0177\5\16\b\2\u0175\u0177\5\b\5\2"+
		"\u0176\u0170\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177\7\3"+
		"\2\2\2\u0178\u0179\7\35\2\2\u0179\u017a\5\b\5\2\u017a\u017b\7\36\2\2\u017b"+
		"\u0185\3\2\2\2\u017c\u017d\5\n\6\2\u017d\u017f\5\36\20\2\u017e\u0180\5"+
		"R*\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0185\3\2\2\2\u0181"+
		"\u0182\5R*\2\u0182\u0183\5\36\20\2\u0183\u0185\3\2\2\2\u0184\u0178\3\2"+
		"\2\2\u0184\u017c\3\2\2\2\u0184\u0181\3\2\2\2\u0185\t\3\2\2\2\u0186\u0188"+
		"\5:\36\2\u0187\u0186\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0197\3\2\2\2\u0189"+
		"\u018b\5\f\7\2\u018a\u018c\5B\"\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018e\3\2\2\2\u018d\u018f\5\30\r\2\u018e\u018d\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u0198\3\2\2\2\u0190\u0192\5\16\b\2\u0191\u0193\5"+
		"B\"\2\u0192\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194"+
		"\u0196\5\30\r\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3"+
		"\2\2\2\u0197\u0189\3\2\2\2\u0197\u0190\3\2\2\2\u0198\u019a\3\2\2\2\u0199"+
		"\u019b\5 \21\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\13\3\2\2"+
		"\2\u019c\u01a7\5\20\t\2\u019d\u019e\5\16\b\2\u019e\u01a0\7>\2\2\u019f"+
		"\u01a1\5\u0086D\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a4"+
		"\3\2\2\2\u01a2\u01a5\5\20\t\2\u01a3\u01a5\5\16\b\2\u01a4\u01a2\3\2\2\2"+
		"\u01a4\u01a3\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u019c\3\2\2\2\u01a6\u019d"+
		"\3\2\2\2\u01a7\u01b2\3\2\2\2\u01a8\u01aa\7>\2\2\u01a9\u01ab\5\u0086D\2"+
		"\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac\u01af"+
		"\5\20\t\2\u01ad\u01af\5\16\b\2\u01ae\u01ac\3\2\2\2\u01ae\u01ad\3\2\2\2"+
		"\u01af\u01b1\3\2\2\2\u01b0\u01a8\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\r\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5"+
		"\u01bb\7\35\2\2\u01b6\u01bc\5\16\b\2\u01b7\u01b9\5\n\6\2\u01b8\u01ba\5"+
		"R*\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb"+
		"\u01b6\3\2\2\2\u01bb\u01b7\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\7\36"+
		"\2\2\u01be\17\3\2\2\2\u01bf\u01c3\5\22\n\2\u01c0\u01c3\5J&\2\u01c1\u01c3"+
		"\5L\'\2\u01c2\u01bf\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c1\3\2\2\2\u01c3"+
		"\21\3\2\2\2\u01c4\u01c8\7?\2\2\u01c5\u01c7\5P)\2\u01c6\u01c5\3\2\2\2\u01c7"+
		"\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2"+
		"\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cd\5Z.\2\u01cc\u01ce\5\36\20\2\u01cd"+
		"\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01d1\5F"+
		"$\2\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2"+
		"\u01d4\5`\61\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2"+
		"\2\2\u01d5\u01d7\5> \2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9"+
		"\3\2\2\2\u01d8\u01da\5\"\22\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2"+
		"\u01da\u01dc\3\2\2\2\u01db\u01dd\5$\23\2\u01dc\u01db\3\2\2\2\u01dc\u01dd"+
		"\3\2\2\2\u01dd\23\3\2\2\2\u01de\u01df\5\16\b\2\u01df\25\3\2\2\2\u01e0"+
		"\u01e1\t\2\2\2\u01e1\27\3\2\2\2\u01e2\u01e3\7H\2\2\u01e3\u01e4\5\32\16"+
		"\2\u01e4\31\3\2\2\2\u01e5\u01e8\5\34\17\2\u01e6\u01e7\t\3\2\2\u01e7\u01e9"+
		"\5\34\17\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\33\3\2\2\2\u01ea"+
		"\u01ed\5\u0128\u0095\2\u01eb\u01ed\t\4\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01eb"+
		"\3\2\2\2\u01ed\35\3\2\2\2\u01ee\u020a\7J\2\2\u01ef\u01f0\7K\2\2\u01f0"+
		"\u01f2\5\u013e\u00a0\2\u01f1\u01f3\5\u0116\u008c\2\u01f2\u01f1\3\2\2\2"+
		"\u01f2\u01f3\3\2\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f6\5\u0118\u008d\2\u01f5"+
		"\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f9\5\u011c"+
		"\u008f\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u020b\3\2\2\2\u01fa"+
		"\u01fb\7L\2\2\u01fb\u020b\5\u013e\u00a0\2\u01fc\u01ff\5\u0150\u00a9\2"+
		"\u01fd\u01ff\5\u00d8m\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ff"+
		"\u0207\3\2\2\2\u0200\u0203\7\32\2\2\u0201\u0204\5\u0150\u00a9\2\u0202"+
		"\u0204\5\u00d8m\2\u0203\u0201\3\2\2\2\u0203\u0202\3\2\2\2\u0204\u0206"+
		"\3\2\2\2\u0205\u0200\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207"+
		"\u0208\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u01ef\3\2"+
		"\2\2\u020a\u01fa\3\2\2\2\u020a\u01fe\3\2\2\2\u020b\37\3\2\2\2\u020c\u020d"+
		"\7M\2\2\u020d\u020e\7N\2\2\u020e\u0214\7\35\2\2\u020f\u0212\7-\2\2\u0210"+
		"\u0211\7\32\2\2\u0211\u0213\7-\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2"+
		"\2\2\u0213\u0215\3\2\2\2\u0214\u020f\3\2\2\2\u0214\u0215\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u0217\7\36\2\2\u0217!\3\2\2\2\u0218\u0219\7O\2\2"+
		"\u0219\u021a\5\u0098M\2\u021a#\3\2\2\2\u021b\u021c\7P\2\2\u021c\u0221"+
		"\5&\24\2\u021d\u021e\7\32\2\2\u021e\u0220\5&\24\2\u021f\u021d\3\2\2\2"+
		"\u0220\u0223\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222%\3"+
		"\2\2\2\u0223\u0221\3\2\2\2\u0224\u0225\5\u0128\u0095\2\u0225\u0226\7Q"+
		"\2\2\u0226\u0227\5(\25\2\u0227\'\3\2\2\2\u0228\u0229\7\35\2\2\u0229\u022a"+
		"\5*\26\2\u022a\u022b\7\36\2\2\u022b)\3\2\2\2\u022c\u022e\5\u0128\u0095"+
		"\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0232\3\2\2\2\u022f\u0230"+
		"\7R\2\2\u0230\u0231\7S\2\2\u0231\u0233\5\u00f6|\2\u0232\u022f\3\2\2\2"+
		"\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0236\5B\"\2\u0235\u0234"+
		"\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0239\5,\27\2\u0238"+
		"\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239+\3\2\2\2\u023a\u023b\5.\30\2"+
		"\u023b\u023d\5\60\31\2\u023c\u023e\58\35\2\u023d\u023c\3\2\2\2\u023d\u023e"+
		"\3\2\2\2\u023e-\3\2\2\2\u023f\u0240\t\5\2\2\u0240/\3\2\2\2\u0241\u0244"+
		"\5\62\32\2\u0242\u0244\5\64\33\2\u0243\u0241\3\2\2\2\u0243\u0242\3\2\2"+
		"\2\u0244\61\3\2\2\2\u0245\u0246\7W\2\2\u0246\u0254\7X\2\2\u0247\u0248"+
		"\5\u0136\u009c\2\u0248\u0249\7X\2\2\u0249\u0254\3\2\2\2\u024a\u024b\7"+
		"*\2\2\u024b\u0254\7X\2\2\u024c\u024d\7Y\2\2\u024d\u024e\5\u0098M\2\u024e"+
		"\u024f\5\u00ecw\2\u024f\u0250\7X\2\2\u0250\u0254\3\2\2\2\u0251\u0252\7"+
		"Z\2\2\u0252\u0254\7[\2\2\u0253\u0245\3\2\2\2\u0253\u0247\3\2\2\2\u0253"+
		"\u024a\3\2\2\2\u0253\u024c\3\2\2\2\u0253\u0251\3\2\2\2\u0254\63\3\2\2"+
		"\2\u0255\u0256\7\\\2\2\u0256\u0257\5\66\34\2\u0257\u0258\7]\2\2\u0258"+
		"\u0259\5\66\34\2\u0259\65\3\2\2\2\u025a\u0268\5\62\32\2\u025b\u025c\7"+
		"W\2\2\u025c\u0268\7^\2\2\u025d\u025e\5\u0136\u009c\2\u025e\u025f\7^\2"+
		"\2\u025f\u0268\3\2\2\2\u0260\u0261\7*\2\2\u0261\u0268\7^\2\2\u0262\u0263"+
		"\7Y\2\2\u0263\u0264\5\u0098M\2\u0264\u0265\5\u00ecw\2\u0265\u0266\7^\2"+
		"\2\u0266\u0268\3\2\2\2\u0267\u025a\3\2\2\2\u0267\u025b\3\2\2\2\u0267\u025d"+
		"\3\2\2\2\u0267\u0260\3\2\2\2\u0267\u0262\3\2\2\2\u0268\67\3\2\2\2\u0269"+
		"\u0270\7_\2\2\u026a\u026b\7Z\2\2\u026b\u0271\7[\2\2\u026c\u0271\7`\2\2"+
		"\u026d\u0271\7a\2\2\u026e\u026f\7b\2\2\u026f\u0271\7c\2\2\u0270\u026a"+
		"\3\2\2\2\u0270\u026c\3\2\2\2\u0270\u026d\3\2\2\2\u0270\u026e\3\2\2\2\u0271"+
		"9\3\2\2\2\u0272\u0274\7d\2\2\u0273\u0275\7e\2\2\u0274\u0273\3\2\2\2\u0274"+
		"\u0275\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u027b\5<\37\2\u0277\u0278\7\32"+
		"\2\2\u0278\u027a\5<\37\2\u0279\u0277\3\2\2\2\u027a\u027d\3\2\2\2\u027b"+
		"\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c;\3\2\2\2\u027d\u027b\3\2\2\2"+
		"\u027e\u0280\5\u0128\u0095\2\u027f\u0281\5\u0122\u0092\2\u0280\u027f\3"+
		"\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\7Q\2\2\u0283"+
		"\u0284\5\24\13\2\u0284=\3\2\2\2\u0285\u0286\7`\2\2\u0286\u0287\7S\2\2"+
		"\u0287\u0289\5\u00f6|\2\u0288\u028a\5@!\2\u0289\u0288\3\2\2\2\u0289\u028a"+
		"\3\2\2\2\u028a?\3\2\2\2\u028b\u028c\7d\2\2\u028c\u0290\7f\2\2\u028d\u028e"+
		"\7d\2\2\u028e\u0290\7g\2\2\u028f\u028b\3\2\2\2\u028f\u028d\3\2\2\2\u0290"+
		"A\3\2\2\2\u0291\u0292\7h\2\2\u0292\u0293\7S\2\2\u0293\u0294\5\u00f6|\2"+
		"\u0294C\3\2\2\2\u0295\u0296\t\6\2\2\u0296E\3\2\2\2\u0297\u029a\7k\2\2"+
		"\u0298\u029b\7l\2\2\u0299\u029b\5H%\2\u029a\u0298\3\2\2\2\u029a\u0299"+
		"\3\2\2\2\u029bG\3\2\2\2\u029c\u02a1\5b\62\2\u029d\u029e\7\32\2\2\u029e"+
		"\u02a0\5b\62\2\u029f\u029d\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u029f\3\2"+
		"\2\2\u02a1\u02a2\3\2\2\2\u02a2I\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4\u02a5"+
		"\7m\2\2\u02a5\u02aa\5N(\2\u02a6\u02a7\7\32\2\2\u02a7\u02a9\5N(\2\u02a8"+
		"\u02a6\3\2\2\2\u02a9\u02ac\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2"+
		"\2\2\u02abK\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02ae\7n\2\2\u02ae\u02af"+
		"\5\u012e\u0098\2\u02afM\3\2\2\2\u02b0\u02b1\7[\2\2\u02b1\u02b3\7\35\2"+
		"\2\u02b2\u02b4\5\4\3\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5"+
		"\3\2\2\2\u02b5\u02b6\7\36\2\2\u02b6O\3\2\2\2\u02b7\u02be\5\26\f\2\u02b8"+
		"\u02be\7o\2\2\u02b9\u02be\7p\2\2\u02ba\u02bb\7q\2\2\u02bb\u02bc\7\3\2"+
		"\2\u02bc\u02be\5\u0134\u009b\2\u02bd\u02b7\3\2\2\2\u02bd\u02b8\3\2\2\2"+
		"\u02bd\u02b9\3\2\2\2\u02bd\u02ba\3\2\2\2\u02beQ\3\2\2\2\u02bf\u02c1\5"+
		"T+\2\u02c0\u02bf\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3S\3\2\2\2\u02c4\u02c5\7r\2\2\u02c5\u02c8\5V,\2\u02c6"+
		"\u02c7\7s\2\2\u02c7\u02c9\5\u0124\u0093\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9"+
		"\3\2\2\2\u02c9\u02cb\3\2\2\2\u02ca\u02cc\5X-\2\u02cb\u02ca\3\2\2\2\u02cb"+
		"\u02cc\3\2\2\2\u02cc\u02d2\3\2\2\2\u02cd\u02ce\7t\2\2\u02ce\u02cf\7u\2"+
		"\2\u02cf\u02d0\7v\2\2\u02d0\u02d2\7w\2\2\u02d1\u02c4\3\2\2\2\u02d1\u02cd"+
		"\3\2\2\2\u02d2U\3\2\2\2\u02d3\u02d4\t\7\2\2\u02d4W\3\2\2\2\u02d5\u02d6"+
		"\7y\2\2\u02d6\u02d9\7z\2\2\u02d7\u02d9\7{\2\2\u02d8\u02d5\3\2\2\2\u02d8"+
		"\u02d7\3\2\2\2\u02d9Y\3\2\2\2\u02da\u02dd\5\\/\2\u02db\u02dd\7\r\2\2\u02dc"+
		"\u02da\3\2\2\2\u02dc\u02db\3\2\2\2\u02dd\u02e2\3\2\2\2\u02de\u02df\7\32"+
		"\2\2\u02df\u02e1\5\\/\2\u02e0\u02de\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2"+
		"\u02e0\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3[\3\2\2\2\u02e4\u02e2\3\2\2\2"+
		"\u02e5\u02e7\5\u012e\u0098\2\u02e6\u02e8\5^\60\2\u02e7\u02e6\3\2\2\2\u02e7"+
		"\u02e8\3\2\2\2\u02e8\u02ee\3\2\2\2\u02e9\u02eb\5\u0098M\2\u02ea\u02ec"+
		"\5^\60\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed"+
		"\u02e5\3\2\2\2\u02ed\u02e9\3\2\2\2\u02ee]\3\2\2\2\u02ef\u02f1\7Q\2\2\u02f0"+
		"\u02ef\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f5\5\u0128"+
		"\u0095\2\u02f3\u02f5\5\u013e\u00a0\2\u02f4\u02f2\3\2\2\2\u02f4\u02f3\3"+
		"\2\2\2\u02f5_\3\2\2\2\u02f6\u02f7\7|\2\2\u02f7\u02f8\5\u0098M\2\u02f8"+
		"a\3\2\2\2\u02f9\u0303\5n8\2\u02fa\u02fd\7\37\2\2\u02fb\u02fe\5\u0128\u0095"+
		"\2\u02fc\u02fe\7}\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fc\3\2\2\2\u02fe\u02ff"+
		"\3\2\2\2\u02ff\u0300\5d\63\2\u0300\u0301\7 \2\2\u0301\u0303\3\2\2\2\u0302"+
		"\u02f9\3\2\2\2\u0302\u02fa\3\2\2\2\u0303\u0307\3\2\2\2\u0304\u0306\5f"+
		"\64\2\u0305\u0304\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305\3\2\2\2\u0307"+
		"\u0308\3\2\2\2\u0308c\3\2\2\2\u0309\u0307\3\2\2\2\u030a\u030e\5n8\2\u030b"+
		"\u030d\5f\64\2\u030c\u030b\3\2\2\2\u030d\u0310\3\2\2\2\u030e\u030c\3\2"+
		"\2\2\u030e\u030f\3\2\2\2\u030fe\3\2\2\2\u0310\u030e\3\2\2\2\u0311\u0312"+
		"\5j\66\2\u0312\u0317\5b\62\2\u0313\u0314\7~\2\2\u0314\u0318\5\u0098M\2"+
		"\u0315\u0316\7\177\2\2\u0316\u0318\5\u012c\u0097\2\u0317\u0313\3\2\2\2"+
		"\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0325\3\2\2\2\u0319\u031a"+
		"\5l\67\2\u031a\u031f\5b\62\2\u031b\u031c\7~\2\2\u031c\u0320\5\u0098M\2"+
		"\u031d\u031e\7\177\2\2\u031e\u0320\5\u012c\u0097\2\u031f\u031b\3\2\2\2"+
		"\u031f\u031d\3\2\2\2\u0320\u0325\3\2\2\2\u0321\u0322\5h\65\2\u0322\u0323"+
		"\5n8\2\u0323\u0325\3\2\2\2\u0324\u0311\3\2\2\2\u0324\u0319\3\2\2\2\u0324"+
		"\u0321\3\2\2\2\u0325g\3\2\2\2\u0326\u0328\7\u0080\2\2\u0327\u0329\7\u0081"+
		"\2\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032a\3\2\2\2\u032a"+
		"\u0332\7\u0082\2\2\u032b\u032c\7\u0080\2\2\u032c\u032e\t\b\2\2\u032d\u032f"+
		"\7\u0085\2\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330\3\2\2"+
		"\2\u0330\u0332\7\u0082\2\2\u0331\u0326\3\2\2\2\u0331\u032b\3\2\2\2\u0332"+
		"i\3\2\2\2\u0333\u0335\t\t\2\2\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2"+
		"\u0335\u0336\3\2\2\2\u0336\u0339\7\u0082\2\2\u0337\u0339\7B\2\2\u0338"+
		"\u0334\3\2\2\2\u0338\u0337\3\2\2\2\u0339k\3\2\2\2\u033a\u033c\t\b\2\2"+
		"\u033b\u033d\7\u0085\2\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d"+
		"\u033e\3\2\2\2\u033e\u033f\7\u0082\2\2\u033fm\3\2\2\2\u0340\u0346\5p9"+
		"\2\u0341\u0346\5r:\2\u0342\u0346\5t;\2\u0343\u0346\5v<\2\u0344\u0346\5"+
		"x=\2\u0345\u0340\3\2\2\2\u0345\u0341\3\2\2\2\u0345\u0342\3\2\2\2\u0345"+
		"\u0343\3\2\2\2\u0345\u0344\3\2\2\2\u0346o\3\2\2\2\u0347\u0349\5\u012e"+
		"\u0098\2\u0348\u034a\5\u0120\u0091\2\u0349\u0348\3\2\2\2\u0349\u034a\3"+
		"\2\2\2\u034a\u034c\3\2\2\2\u034b\u034d\5\u0088E\2\u034c\u034b\3\2\2\2"+
		"\u034c\u034d\3\2\2\2\u034d\u034f\3\2\2\2\u034e\u0350\5\u008aF\2\u034f"+
		"\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350q\3\2\2\2\u0351\u0354\7\35\2\2"+
		"\u0352\u0355\5p9\2\u0353\u0355\5r:\2\u0354\u0352\3\2\2\2\u0354\u0353\3"+
		"\2\2\2\u0355\u0356\3\2\2\2\u0356\u0357\7\36\2\2\u0357s\3\2\2\2\u0358\u035a"+
		"\5\24\13\2\u0359\u035b\5\u0088E\2\u035a\u0359\3\2\2\2\u035a\u035b\3\2"+
		"\2\2\u035b\u035d\3\2\2\2\u035c\u035e\5\u0122\u0092\2\u035d\u035c\3\2\2"+
		"\2\u035d\u035e\3\2\2\2\u035e\u0368\3\2\2\2\u035f\u0360\7\u0087\2\2\u0360"+
		"\u0362\5\24\13\2\u0361\u0363\5\u0088E\2\u0362\u0361\3\2\2\2\u0362\u0363"+
		"\3\2\2\2\u0363\u0365\3\2\2\2\u0364\u0366\5\u0122\u0092\2\u0365\u0364\3"+
		"\2\2\2\u0365\u0366\3\2\2\2\u0366\u0368\3\2\2\2\u0367\u0358\3\2\2\2\u0367"+
		"\u035f\3\2\2\2\u0368u\3\2\2\2\u0369\u036c\7\35\2\2\u036a\u036d\5H%\2\u036b"+
		"\u036d\5v<\2\u036c\u036a\3\2\2\2\u036c\u036b\3\2\2\2\u036d\u036e\3\2\2"+
		"\2\u036e\u036f\7\36\2\2\u036fw\3\2\2\2\u0370\u0371\7\u0088\2\2\u0371\u0372"+
		"\7\35\2\2\u0372\u0373\5\u0098M\2\u0373\u0374\7\32\2\2\u0374\u0375\5\u013e"+
		"\u00a0\2\u0375\u0376\5z>\2\u0376\u0378\7\36\2\2\u0377\u0379\5\u0088E\2"+
		"\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2\2\u0379y\3\2\2\2\u037a\u037b\7"+
		"\u0089\2\2\u037b\u037c\7\35\2\2\u037c\u0381\5|?\2\u037d\u037e\7\32\2\2"+
		"\u037e\u0380\5|?\2\u037f\u037d\3\2\2\2\u0380\u0383\3\2\2\2\u0381\u037f"+
		"\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0384\3\2\2\2\u0383\u0381\3\2\2\2\u0384"+
		"\u0385\7\36\2\2\u0385{\3\2\2\2\u0386\u0387\5\u0128\u0095\2\u0387\u0388"+
		"\7r\2\2\u0388\u0389\7\u008a\2\2\u0389\u039d\3\2\2\2\u038a\u038b\5\u0128"+
		"\u0095\2\u038b\u038d\5\u00fc\177\2\u038c\u038e\5\u0114\u008b\2\u038d\u038c"+
		"\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u0390\3\2\2\2\u038f\u0391\7\u008b\2"+
		"\2\u0390\u038f\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0393"+
		"\7\u008c\2\2\u0393\u0395\5\u013e\u00a0\2\u0394\u0396\5~@\2\u0395\u0394"+
		"\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u039d\3\2\2\2\u0397\u0398\7\u008d\2"+
		"\2\u0398\u0399\7\u008c\2\2\u0399\u039a\5\u013e\u00a0\2\u039a\u039b\5z"+
		">\2\u039b\u039d\3\2\2\2\u039c\u0386\3\2\2\2\u039c\u038a\3\2\2\2\u039c"+
		"\u0397\3\2\2\2\u039d}\3\2\2\2\u039e\u03a0\5\u0080A\2\u039f\u03a1\5\u0082"+
		"B\2\u03a0\u039f\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a7\3\2\2\2\u03a2"+
		"\u03a4\5\u0082B\2\u03a3\u03a5\5\u0080A\2\u03a4\u03a3\3\2\2\2\u03a4\u03a5"+
		"\3\2\2\2\u03a5\u03a7\3\2\2\2\u03a6\u039e\3\2\2\2\u03a6\u03a2\3\2\2\2\u03a7"+
		"\177\3\2\2\2\u03a8\u03a9\5\u0084C\2\u03a9\u03aa\7~\2\2\u03aa\u03ab\7\u008e"+
		"\2\2\u03ab\u0081\3\2\2\2\u03ac\u03ad\5\u0084C\2\u03ad\u03ae\7~\2\2\u03ae"+
		"\u03af\7\u008f\2\2\u03af\u0083\3\2\2\2\u03b0\u03b5\7\u008f\2\2\u03b1\u03b5"+
		"\7\u0090\2\2\u03b2\u03b3\7=\2\2\u03b3\u03b5\5\u013e\u00a0\2\u03b4\u03b0"+
		"\3\2\2\2\u03b4\u03b1\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5\u0085\3\2\2\2\u03b6"+
		"\u03b7\t\n\2\2\u03b7\u0087\3\2\2\2\u03b8\u03ba\t\13\2\2\u03b9\u03b8\3"+
		"\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\5\u0128\u0095"+
		"\2\u03bc\u0089\3\2\2\2\u03bd\u03c2\5\u008cG\2\u03be\u03bf\7\32\2\2\u03bf"+
		"\u03c1\5\u008cG\2\u03c0\u03be\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c0"+
		"\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u008b\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c5"+
		"\u03c6\5\u008eH\2\u03c6\u03c8\5\u0090I\2\u03c7\u03c9\5\u0092J\2\u03c8"+
		"\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb\7\35"+
		"\2\2\u03cb\u03cc\5\u0094K\2\u03cc\u03cd\7\36\2\2\u03cd\u03da\3\2\2\2\u03ce"+
		"\u03cf\7\u0091\2\2\u03cf\u03d1\5\u0090I\2\u03d0\u03d2\5\u0092J\2\u03d1"+
		"\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d5\7\35"+
		"\2\2\u03d4\u03d6\5\u0094K\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6"+
		"\u03d7\3\2\2\2\u03d7\u03d8\7\36\2\2\u03d8\u03da\3\2\2\2\u03d9\u03c5\3"+
		"\2\2\2\u03d9\u03ce\3\2\2\2\u03da\u008d\3\2\2\2\u03db\u03dc\t\f\2\2\u03dc"+
		"\u008f\3\2\2\2\u03dd\u03de\t\r\2\2\u03de\u0091\3\2\2\2\u03df\u03e5\7r"+
		"\2\2\u03e0\u03e6\7\u0082\2\2\u03e1\u03e2\7h\2\2\u03e2\u03e6\7S\2\2\u03e3"+
		"\u03e4\7`\2\2\u03e4\u03e6\7S\2\2\u03e5\u03e0\3\2\2\2\u03e5\u03e1\3\2\2"+
		"\2\u03e5\u03e3\3\2\2\2\u03e6\u0093\3\2\2\2\u03e7\u03ec\5\u0096L\2\u03e8"+
		"\u03e9\7\32\2\2\u03e9\u03eb\5\u0096L\2\u03ea\u03e8\3\2\2\2\u03eb\u03ee"+
		"\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u0095\3\2\2\2\u03ee"+
		"\u03ec\3\2\2\2\u03ef\u03f2\5\u0128\u0095\2\u03f0\u03f2\7\u0096\2\2\u03f1"+
		"\u03ef\3\2\2\2\u03f1\u03f0\3\2\2\2\u03f2\u0097\3\2\2\2\u03f3\u03f4\bM"+
		"\1\2\u03f4\u03fa\5\u009aN\2\u03f5\u03f7\7\u0097\2\2\u03f6\u03f8\5\u00e8"+
		"u\2\u03f7\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9"+
		"\u03fb\t\16\2\2\u03fa\u03f5\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03ff\3"+
		"\2\2\2\u03fc\u03fd\7\u009b\2\2\u03fd\u03ff\5\u0098M\6\u03fe\u03f3\3\2"+
		"\2\2\u03fe\u03fc\3\2\2\2\u03ff\u040b\3\2\2\2\u0400\u0401\f\5\2\2\u0401"+
		"\u0402\t\17\2\2\u0402\u040a\5\u0098M\6\u0403\u0404\f\4\2\2\u0404\u0405"+
		"\7\u009c\2\2\u0405\u040a\5\u0098M\5\u0406\u0407\f\3\2\2\u0407\u0408\t"+
		"\20\2\2\u0408\u040a\5\u0098M\4\u0409\u0400\3\2\2\2\u0409\u0403\3\2\2\2"+
		"\u0409\u0406\3\2\2\2\u040a\u040d\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c"+
		"\3\2\2\2\u040c\u0099\3\2\2\2\u040d\u040b\3\2\2\2\u040e\u040f\bN\1\2\u040f"+
		"\u0410\5\u009eP\2\u0410\u0422\3\2\2\2\u0411\u0412\f\5\2\2\u0412\u0414"+
		"\7\u0097\2\2\u0413\u0415\5\u00e8u\2\u0414\u0413\3\2\2\2\u0414\u0415\3"+
		"\2\2\2\u0415\u0416\3\2\2\2\u0416\u0421\7\u0090\2\2\u0417\u0418\f\4\2\2"+
		"\u0418\u0419\5\u009cO\2\u0419\u041a\5\u009eP\2\u041a\u0421\3\2\2\2\u041b"+
		"\u041c\f\3\2\2\u041c\u041d\5\u009cO\2\u041d\u041e\t\21\2\2\u041e\u041f"+
		"\5\24\13\2\u041f\u0421\3\2\2\2\u0420\u0411\3\2\2\2\u0420\u0417\3\2\2\2"+
		"\u0420\u041b\3\2\2\2\u0421\u0424\3\2\2\2\u0422\u0420\3\2\2\2\u0422\u0423"+
		"\3\2\2\2\u0423\u009b\3\2\2\2\u0424\u0422\3\2\2\2\u0425\u0426\t\22\2\2"+
		"\u0426\u009d\3\2\2\2\u0427\u0434\5\u00a2R\2\u0428\u042a\5\u00e8u\2\u0429"+
		"\u0428\3\2\2\2\u0429\u042a\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u0435\5\u00a0"+
		"Q\2\u042c\u042e\7\u009f\2\2\u042d\u042f\7s\2\2\u042e\u042d\3\2\2\2\u042e"+
		"\u042f\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0435\5\u00f4{\2\u0431\u0432"+
		"\7\u00a0\2\2\u0432\u0433\7\u00a1\2\2\u0433\u0435\5\u00a2R\2\u0434\u0429"+
		"\3\2\2\2\u0434\u042c\3\2\2\2\u0434\u0431\3\2\2\2\u0434\u0435\3\2\2\2\u0435"+
		"\u009f\3\2\2\2\u0436\u043c\7u\2\2\u0437\u043d\5\24\13\2\u0438\u0439\7"+
		"\35\2\2\u0439\u043a\5\u00e4s\2\u043a\u043b\7\36\2\2\u043b\u043d\3\2\2"+
		"\2\u043c\u0437\3\2\2\2\u043c\u0438\3\2\2\2\u043d\u044c\3\2\2\2\u043e\u043f"+
		"\7\\\2\2\u043f\u0440\5\u00a2R\2\u0440\u0441\7]\2\2\u0441\u0442\5\u009e"+
		"P\2\u0442\u044c\3\2\2\2\u0443\u0444\7\u00a1\2\2\u0444\u0447\5\u00a4S\2"+
		"\u0445\u0446\7\u00a2\2\2\u0446\u0448\5\u00a4S\2\u0447\u0445\3\2\2\2\u0447"+
		"\u0448\3\2\2\2\u0448\u044c\3\2\2\2\u0449\u044a\7\u00a3\2\2\u044a\u044c"+
		"\5\u00a2R\2\u044b\u0436\3\2\2\2\u044b\u043e\3\2\2\2\u044b\u0443\3\2\2"+
		"\2\u044b\u0449\3\2\2\2\u044c\u00a1\3\2\2\2\u044d\u044e\bR\1\2\u044e\u044f"+
		"\5\u00a4S\2\u044f\u046a\3\2\2\2\u0450\u0451\f\t\2\2\u0451\u0452\7\26\2"+
		"\2\u0452\u0469\5\u00a2R\n\u0453\u0454\f\b\2\2\u0454\u0455\t\23\2\2\u0455"+
		"\u0469\5\u00a2R\t\u0456\u0457\f\7\2\2\u0457\u0458\t\24\2\2\u0458\u0469"+
		"\5\u00a2R\b\u0459\u045a\f\5\2\2\u045a\u045b\t\25\2\2\u045b\u0469\5\u00a2"+
		"R\6\u045c\u045d\f\4\2\2\u045d\u045e\7\25\2\2\u045e\u0469\5\u00a2R\5\u045f"+
		"\u0460\f\3\2\2\u0460\u0461\7\30\2\2\u0461\u0469\5\u00a2R\4\u0462\u0463"+
		"\f\6\2\2\u0463\u0464\t\24\2\2\u0464\u0465\7Y\2\2\u0465\u0466\5\u0098M"+
		"\2\u0466\u0467\5\u00ecw\2\u0467\u0469\3\2\2\2\u0468\u0450\3\2\2\2\u0468"+
		"\u0453\3\2\2\2\u0468\u0456\3\2\2\2\u0468\u0459\3\2\2\2\u0468\u045c\3\2"+
		"\2\2\u0468\u045f\3\2\2\2\u0468\u0462\3\2\2\2\u0469\u046c\3\2\2\2\u046a"+
		"\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u00a3\3\2\2\2\u046c\u046a\3\2"+
		"\2\2\u046d\u046e\bS\1\2\u046e\u0472\5\u00d6l\2\u046f\u0470\5\u0154\u00ab"+
		"\2\u0470\u0471\5\u0098M\2\u0471\u0473\3\2\2\2\u0472\u046f\3\2\2\2\u0472"+
		"\u0473\3\2\2\2\u0473\u04d9\3\2\2\2\u0474\u0476\5\u012e\u0098\2\u0475\u0477"+
		"\5\u00a6T\2\u0476\u0475\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u04d9\3\2\2"+
		"\2\u0478\u04d9\5\u00be`\2\u0479\u04d9\5\u00d0i\2\u047a\u04d9\5\u013a\u009e"+
		"\2\u047b\u04d9\7*\2\2\u047c\u04d9\5\u00a8U\2\u047d\u04d9\5\u00aaV\2\u047e"+
		"\u04d9\5\u00acW\2\u047f\u0480\t\26\2\2\u0480\u04d9\5\u00a4S\20\u0481\u0482"+
		"\5\u00eav\2\u0482\u0483\5\u00a4S\17\u0483\u04d9\3\2\2\2\u0484\u0486\7"+
		"[\2\2\u0485\u0484\3\2\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2\2\u0487"+
		"\u0488\7\35\2\2\u0488\u0489\5\u00e4s\2\u0489\u048a\7\36\2\2\u048a\u04d9"+
		"\3\2\2\2\u048b\u048d\7\u008b\2\2\u048c\u048b\3\2\2\2\u048c\u048d\3\2\2"+
		"\2\u048d\u048e\3\2\2\2\u048e\u04d9\5\24\13\2\u048f\u0490\7\37\2\2\u0490"+
		"\u0491\5\u0128\u0095\2\u0491\u0492\5\u0098M\2\u0492\u0493\7 \2\2\u0493"+
		"\u04d9\3\2\2\2\u0494\u0495\7\u00a6\2\2\u0495\u0496\5\u00b8]\2\u0496\u0497"+
		"\7\u00a7\2\2\u0497\u0498\7\35\2\2\u0498\u049a\5\u00a2R\2\u0499\u049b\5"+
		"\u00bc_\2\u049a\u0499\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u049c\3\2\2\2"+
		"\u049c\u049d\7\36\2\2\u049d\u04d9\3\2\2\2\u049e\u049f\7\u00a8\2\2\u049f"+
		"\u04d9\5\u00a4S\n\u04a0\u04a1\7\u00a9\2\2\u04a1\u04a2\7\35\2\2\u04a2\u04a3"+
		"\5\u0098M\2\u04a3\u04a4\7Q\2\2\u04a4\u04a6\5\u00e2r\2\u04a5\u04a7\7\u00aa"+
		"\2\2\u04a6\u04a5\3\2\2\2\u04a6\u04a7\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8"+
		"\u04a9\7\36\2\2\u04a9\u04d9\3\2\2\2\u04aa\u04ac\7\u00ab\2\2\u04ab\u04ad"+
		"\5\u0098M\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04b1\3\2\2"+
		"\2\u04ae\u04af\5\u00dco\2\u04af\u04b0\5\u00dep\2\u04b0\u04b2\3\2\2\2\u04b1"+
		"\u04ae\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b1\3\2\2\2\u04b3\u04b4\3\2"+
		"\2\2\u04b4\u04b6\3\2\2\2\u04b5\u04b7\5\u00e0q\2\u04b6\u04b5\3\2\2\2\u04b6"+
		"\u04b7\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\7\u00ac\2\2\u04b9\u04d9"+
		"\3\2\2\2\u04ba\u04bb\7\u00ad\2\2\u04bb\u04bc\7\35\2\2\u04bc\u04bd\5\u0098"+
		"M\2\u04bd\u04be\7\32\2\2\u04be\u04bf\5\u00e2r\2\u04bf\u04c0\7\36\2\2\u04c0"+
		"\u04d9\3\2\2\2\u04c1\u04c2\7\u00ad\2\2\u04c2\u04c3\7\35\2\2\u04c3\u04c4"+
		"\5\u0098M\2\u04c4\u04c5\7\177\2\2\u04c5\u04c6\5\u0110\u0089\2\u04c6\u04c7"+
		"\7\36\2\2\u04c7\u04d9\3\2\2\2\u04c8\u04c9\7=\2\2\u04c9\u04ca\7\35\2\2"+
		"\u04ca\u04cb\5\u012e\u0098\2\u04cb\u04cc\7\36\2\2\u04cc\u04d9\3\2\2\2"+
		"\u04cd\u04ce\7m\2\2\u04ce\u04cf\7\35\2\2\u04cf\u04d0\5\u012e\u0098\2\u04d0"+
		"\u04d1\7\36\2\2\u04d1\u04d9\3\2\2\2\u04d2\u04d3\7Y\2\2\u04d3\u04d4\5\u0098"+
		"M\2\u04d4\u04d5\5\u00ecw\2\u04d5\u04d6\7\13\2\2\u04d6\u04d7\5\u0098M\2"+
		"\u04d7\u04d9\3\2\2\2\u04d8\u046d\3\2\2\2\u04d8\u0474\3\2\2\2\u04d8\u0478"+
		"\3\2\2\2\u04d8\u0479\3\2\2\2\u04d8\u047a\3\2\2\2\u04d8\u047b\3\2\2\2\u04d8"+
		"\u047c\3\2\2\2\u04d8\u047d\3\2\2\2\u04d8\u047e\3\2\2\2\u04d8\u047f\3\2"+
		"\2\2\u04d8\u0481\3\2\2\2\u04d8\u0485\3\2\2\2\u04d8\u048c\3\2\2\2\u04d8"+
		"\u048f\3\2\2\2\u04d8\u0494\3\2\2\2\u04d8\u049e\3\2\2\2\u04d8\u04a0\3\2"+
		"\2\2\u04d8\u04aa\3\2\2\2\u04d8\u04ba\3\2\2\2\u04d8\u04c1\3\2\2\2\u04d8"+
		"\u04c8\3\2\2\2\u04d8\u04cd\3\2\2\2\u04d8\u04d2\3\2\2\2\u04d9\u04e2\3\2"+
		"\2\2\u04da\u04db\f\21\2\2\u04db\u04dc\7\27\2\2\u04dc\u04e1\5\u00a4S\22"+
		"\u04dd\u04de\f\27\2\2\u04de\u04df\7\u00ae\2\2\u04df\u04e1\5\u0150\u00a9"+
		"\2\u04e0\u04da\3\2\2\2\u04e0\u04dd\3\2\2\2\u04e1\u04e4\3\2\2\2\u04e2\u04e0"+
		"\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u00a5\3\2\2\2\u04e4\u04e2\3\2\2\2\u04e5"+
		"\u04e6\7$\2\2\u04e6\u04ea\5\u013e\u00a0\2\u04e7\u04e8\7%\2\2\u04e8\u04ea"+
		"\5\u013e\u00a0\2\u04e9\u04e5\3\2\2\2\u04e9\u04e7\3\2\2\2\u04ea\u00a7\3"+
		"\2\2\2\u04eb\u04ec\7\u00af\2\2\u04ec\u04ee\7\35\2\2\u04ed\u04ef\7A\2\2"+
		"\u04ee\u04ed\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1"+
		"\5\u00b6\\\2\u04f1\u04f3\7\36\2\2\u04f2\u04f4\5\u00aeX\2\u04f3\u04f2\3"+
		"\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u0562\3\2\2\2\u04f5\u04f6\t\27\2\2\u04f6"+
		"\u04f7\7\35\2\2\u04f7\u04f8\5\u00b6\\\2\u04f8\u04fa\7\36\2\2\u04f9\u04fb"+
		"\5\u00aeX\2\u04fa\u04f9\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u0562\3\2\2"+
		"\2\u04fc\u0562\5\u00b4[\2\u04fd\u04fe\7\u00b3\2\2\u04fe\u0500\7\35\2\2"+
		"\u04ff\u0501\7@\2\2\u0500\u04ff\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502"+
		"\3\2\2\2\u0502\u0503\7\r\2\2\u0503\u0505\7\36\2\2\u0504\u0506\5\u00ae"+
		"X\2\u0505\u0504\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0562\3\2\2\2\u0507"+
		"\u0508\7\u00b3\2\2\u0508\u0510\7\35\2\2\u0509\u050b\7@\2\2\u050a\u0509"+
		"\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u0511\7\r\2\2\u050d"+
		"\u0511\5\u00b6\\\2\u050e\u050f\7A\2\2\u050f\u0511\5\u00e4s\2\u0510\u050a"+
		"\3\2\2\2\u0510\u050d\3\2\2\2\u0510\u050e\3\2\2\2\u0511\u0512\3\2\2\2\u0512"+
		"\u0514\7\36\2\2\u0513\u0515\5\u00aeX\2\u0514\u0513\3\2\2\2\u0514\u0515"+
		"\3\2\2\2\u0515\u0562\3\2\2\2\u0516\u0517\7\u00b4\2\2\u0517\u0519\7\35"+
		"\2\2\u0518\u051a\7A\2\2\u0519\u0518\3\2\2\2\u0519\u051a\3\2\2\2\u051a"+
		"\u051b\3\2\2\2\u051b\u051c\5\u00b6\\\2\u051c\u051e\7\36\2\2\u051d\u051f"+
		"\5\u00aeX\2\u051e\u051d\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0562\3\2\2"+
		"\2\u0520\u0521\7\u00b5\2\2\u0521\u0523\7\35\2\2\u0522\u0524\7A\2\2\u0523"+
		"\u0522\3\2\2\2\u0523\u0524\3\2\2\2\u0524\u0525\3\2\2\2\u0525\u0526\5\u00b6"+
		"\\\2\u0526\u0528\7\36\2\2\u0527\u0529\5\u00aeX\2\u0528\u0527\3\2\2\2\u0528"+
		"\u0529\3\2\2\2\u0529\u0562\3\2\2\2\u052a\u052b\7\u00b6\2\2\u052b\u052c"+
		"\7\35\2\2\u052c\u052d\5\u00b6\\\2\u052d\u052f\7\36\2\2\u052e\u0530\5\u00ae"+
		"X\2\u052f\u052e\3\2\2\2\u052f\u0530\3\2\2\2\u0530\u0562\3\2\2\2\u0531"+
		"\u0532\7\u00b7\2\2\u0532\u0533\7\35\2\2\u0533\u0534\5\u00b6\\\2\u0534"+
		"\u0536\7\36\2\2\u0535\u0537\5\u00aeX\2\u0536\u0535\3\2\2\2\u0536\u0537"+
		"\3\2\2\2\u0537\u0562\3\2\2\2\u0538\u0539\7\u00b8\2\2\u0539\u053a\7\35"+
		"\2\2\u053a\u053b\5\u00b6\\\2\u053b\u053d\7\36\2\2\u053c\u053e\5\u00ae"+
		"X\2\u053d\u053c\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u0562\3\2\2\2\u053f"+
		"\u0540\7\u00b9\2\2\u0540\u0541\7\35\2\2\u0541\u0542\5\u00b6\\\2\u0542"+
		"\u0544\7\36\2\2\u0543\u0545\5\u00aeX\2\u0544\u0543\3\2\2\2\u0544\u0545"+
		"\3\2\2\2\u0545\u0562\3\2\2\2\u0546\u0547\7\u00ba\2\2\u0547\u0549\7\35"+
		"\2\2\u0548\u054a\7A\2\2\u0549\u0548\3\2\2\2\u0549\u054a\3\2\2\2\u054a"+
		"\u054b\3\2\2\2\u054b\u054c\5\u00b6\\\2\u054c\u054e\7\36\2\2\u054d\u054f"+
		"\5\u00aeX\2\u054e\u054d\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0562\3\2\2"+
		"\2\u0550\u0551\7\u00bb\2\2\u0551\u0553\7\35\2\2\u0552\u0554\7A\2\2\u0553"+
		"\u0552\3\2\2\2\u0553\u0554\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0557\5\u00e4"+
		"s\2\u0556\u0558\5B\"\2\u0557\u0556\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u055b"+
		"\3\2\2\2\u0559\u055a\7\u00bc\2\2\u055a\u055c\5\u0140\u00a1\2\u055b\u0559"+
		"\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055f\7\36\2\2"+
		"\u055e\u0560\5\u00aeX\2\u055f\u055e\3\2\2\2\u055f\u0560\3\2\2\2\u0560"+
		"\u0562\3\2\2\2\u0561\u04eb\3\2\2\2\u0561\u04f5\3\2\2\2\u0561\u04fc\3\2"+
		"\2\2\u0561\u04fd\3\2\2\2\u0561\u0507\3\2\2\2\u0561\u0516\3\2\2\2\u0561"+
		"\u0520\3\2\2\2\u0561\u052a\3\2\2\2\u0561\u0531\3\2\2\2\u0561\u0538\3\2"+
		"\2\2\u0561\u053f\3\2\2\2\u0561\u0546\3\2\2\2\u0561\u0550\3\2\2\2\u0562"+
		"\u00a9\3\2\2\2\u0563\u0564\7\u00bd\2\2\u0564\u0565\7\35\2\2\u0565\u0566"+
		"\5\u00e4s\2\u0566\u0567\7\36\2\2\u0567\u00ab\3\2\2\2\u0568\u0569\t\30"+
		"\2\2\u0569\u056a\5\u0152\u00aa\2\u056a\u056b\5\u00aeX\2\u056b\u0593\3"+
		"\2\2\2\u056c\u056d\7\u00c3\2\2\u056d\u056e\5\u00f4{\2\u056e\u056f\5\u00ae"+
		"X\2\u056f\u0593\3\2\2\2\u0570\u0571\t\31\2\2\u0571\u0572\7\35\2\2\u0572"+
		"\u0574\5\u0098M\2\u0573\u0575\5\u00b0Y\2\u0574\u0573\3\2\2\2\u0574\u0575"+
		"\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0578\7\36\2\2\u0577\u0579\5\u00b2"+
		"Z\2\u0578\u0577\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057a\3\2\2\2\u057a"+
		"\u057b\5\u00aeX\2\u057b\u0593\3\2\2\2\u057c\u057d\t\32\2\2\u057d\u057f"+
		"\5\u00f2z\2\u057e\u0580\5\u00b2Z\2\u057f\u057e\3\2\2\2\u057f\u0580\3\2"+
		"\2\2\u0580\u0581\3\2\2\2\u0581\u0582\5\u00aeX\2\u0582\u0593\3\2\2\2\u0583"+
		"\u0584\7\u00c8\2\2\u0584\u0585\7\35\2\2\u0585\u0586\5\u0098M\2\u0586\u0587"+
		"\7\32\2\2\u0587\u0588\5\u00a4S\2\u0588\u058b\7\36\2\2\u0589\u058a\7k\2"+
		"\2\u058a\u058c\t\33\2\2\u058b\u0589\3\2\2\2\u058b\u058c\3\2\2\2\u058c"+
		"\u058e\3\2\2\2\u058d\u058f\5\u00b2Z\2\u058e\u058d\3\2\2\2\u058e\u058f"+
		"\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0591\5\u00aeX\2\u0591\u0593\3\2\2"+
		"\2\u0592\u0568\3\2\2\2\u0592\u056c\3\2\2\2\u0592\u0570\3\2\2\2\u0592\u057c"+
		"\3\2\2\2\u0592\u0583\3\2\2\2\u0593\u00ad\3\2\2\2\u0594\u0597\7\u00cb\2"+
		"\2\u0595\u0598\5\u0128\u0095\2\u0596\u0598\5(\25\2\u0597\u0595\3\2\2\2"+
		"\u0597\u0596\3\2\2\2\u0598\u00af\3\2\2\2\u0599\u059c\7\32\2\2\u059a\u059d"+
		"\5\u0136\u009c\2\u059b\u059d\7*\2\2\u059c\u059a\3\2\2\2\u059c\u059b\3"+
		"\2\2\2\u059d\u05a0\3\2\2\2\u059e\u059f\7\32\2\2\u059f\u05a1\5\u0098M\2"+
		"\u05a0\u059e\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u00b1\3\2\2\2\u05a2\u05a3"+
		"\t\34\2\2\u05a3\u05a4\7\u00cd\2\2\u05a4\u00b3\3\2\2\2\u05a5\u05a6\7\u00ce"+
		"\2\2\u05a6\u05a7\7\35\2\2\u05a7\u05a8\5\u00b6\\\2\u05a8\u05aa\7\36\2\2"+
		"\u05a9\u05ab\5\u00aeX\2\u05aa\u05a9\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab"+
		"\u05b6\3\2\2\2\u05ac\u05ad\7\u00cf\2\2\u05ad\u05ae\7\35\2\2\u05ae\u05af"+
		"\5\u00b6\\\2\u05af\u05b0\7\32\2\2\u05b0\u05b1\5\u00b6\\\2\u05b1\u05b3"+
		"\7\36\2\2\u05b2\u05b4\5\u00aeX\2\u05b3\u05b2\3\2\2\2\u05b3\u05b4\3\2\2"+
		"\2\u05b4\u05b6\3\2\2\2\u05b5\u05a5\3\2\2\2\u05b5\u05ac\3\2\2\2\u05b6\u00b5"+
		"\3\2\2\2\u05b7\u05b9\7@\2\2\u05b8\u05b7\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9"+
		"\u05ba\3\2\2\2\u05ba\u05bb\5\u0098M\2\u05bb\u00b7\3\2\2\2\u05bc\u05c2"+
		"\5\u00ba^\2\u05bd\u05be\7\35\2\2\u05be\u05bf\5\u00ba^\2\u05bf\u05c0\7"+
		"\36\2\2\u05c0\u05c2\3\2\2\2\u05c1\u05bc\3\2\2\2\u05c1\u05bd\3\2\2\2\u05c2"+
		"\u00b9\3\2\2\2\u05c3\u05c8\5\u012e\u0098\2\u05c4\u05c5\7\32\2\2\u05c5"+
		"\u05c7\5\u012e\u0098\2\u05c6\u05c4\3\2\2\2\u05c7\u05ca\3\2\2\2\u05c8\u05c6"+
		"\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u00bb\3\2\2\2\u05ca\u05c8\3\2\2\2\u05cb"+
		"\u05cc\7u\2\2\u05cc\u05cd\7\u00d0\2\2\u05cd\u05db\7w\2\2\u05ce\u05cf\7"+
		"u\2\2\u05cf\u05d0\7\u0080\2\2\u05d0\u05d1\7\u00d1\2\2\u05d1\u05d5\7w\2"+
		"\2\u05d2\u05d3\7d\2\2\u05d3\u05d4\7\u00d2\2\2\u05d4\u05d6\7\u00d3\2\2"+
		"\u05d5\u05d2\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05db\3\2\2\2\u05d7\u05d8"+
		"\7d\2\2\u05d8\u05d9\7\u00d2\2\2\u05d9\u05db\7\u00d3\2\2\u05da\u05cb\3"+
		"\2\2\2\u05da\u05ce\3\2\2\2\u05da\u05d7\3\2\2\2\u05db\u00bd\3\2\2\2\u05dc"+
		"\u05dd\7\u00d4\2\2\u05dd\u05de\7\35\2\2\u05de\u05e1\5\u00e4s\2\u05df\u05e0"+
		"\7\177\2\2\u05e0\u05e2\5\u0110\u0089\2\u05e1\u05df\3\2\2\2\u05e1\u05e2"+
		"\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\7\36\2\2\u05e4\u06eb\3\2\2\2"+
		"\u05e5\u05e7\7\u00d5\2\2\u05e6\u05e8\5\u0152\u00aa\2\u05e7\u05e6\3\2\2"+
		"\2\u05e7\u05e8\3\2\2\2\u05e8\u06eb\3\2\2\2\u05e9\u05ea\7\u00d6\2\2\u05ea"+
		"\u06eb\5\u00f2z\2\u05eb\u05ec\78\2\2\u05ec\u06eb\5\u00f2z\2\u05ed\u05ee"+
		"\7\67\2\2\u05ee\u06eb\5\u00f2z\2\u05ef\u05f0\7\u00d7\2\2\u05f0\u05f1\7"+
		"\35\2\2\u05f1\u05f2\5\u0098M\2\u05f2\u05f3\7\32\2\2\u05f3\u05f4\5\u0098"+
		"M\2\u05f4\u05f5\7\32\2\2\u05f5\u05f6\5\u0098M\2\u05f6\u05f7\7\32\2\2\u05f7"+
		"\u05f8\5\u0098M\2\u05f8\u05f9\7\36\2\2\u05f9\u06eb\3\2\2\2\u05fa\u05fb"+
		"\7Y\2\2\u05fb\u05fc\7\35\2\2\u05fc\u05ff\5\u0098M\2\u05fd\u05fe\7\32\2"+
		"\2\u05fe\u0600\5\u0098M\2\u05ff\u05fd\3\2\2\2\u0600\u0601\3\2\2\2\u0601"+
		"\u05ff\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0604\7\36"+
		"\2\2\u0604\u06eb\3\2\2\2\u0605\u0606\7\u0083\2\2\u0606\u0607\7\35\2\2"+
		"\u0607\u0608\5\u0098M\2\u0608\u0609\7\32\2\2\u0609\u060a\5\u0098M\2\u060a"+
		"\u060b\7\36\2\2\u060b\u06eb\3\2\2\2\u060c\u060d\7\66\2\2\u060d\u06eb\5"+
		"\u00f2z\2\u060e\u060f\7:\2\2\u060f\u06eb\5\u00f2z\2\u0610\u0611\7\u0084"+
		"\2\2\u0611\u0612\7\35\2\2\u0612\u0613\5\u0098M\2\u0613\u0614\7\32\2\2"+
		"\u0614\u0615\5\u0098M\2\u0615\u0616\7\36\2\2\u0616\u06eb\3\2\2\2\u0617"+
		"\u0618\7\65\2\2\u0618\u06eb\5\u00f2z\2\u0619\u061a\7\u00d8\2\2\u061a\u06eb"+
		"\5\u00f2z\2\u061b\u061c\7\u00d9\2\2\u061c\u061d\7\35\2\2\u061d\u0620\5"+
		"\u0098M\2\u061e\u061f\7\32\2\2\u061f\u0621\5\u0098M\2\u0620\u061e\3\2"+
		"\2\2\u0620\u0621\3\2\2\2\u0621\u0622\3\2\2\2\u0622\u0623\7\36\2\2\u0623"+
		"\u06eb\3\2\2\2\u0624\u06eb\5\u00ccg\2\u0625\u0626\7\u00da\2\2\u0626\u06eb"+
		"\5\u0152\u00aa\2\u0627\u0628\7m\2\2\u0628\u06eb\5\u00f2z\2\u0629\u062a"+
		"\7<\2\2\u062a\u06eb\5\u00f2z\2\u062b\u062c\t\35\2\2\u062c\u062d\7\35\2"+
		"\2\u062d\u062e\5\u0098M\2\u062e\u0634\7\32\2\2\u062f\u0635\5\u0098M\2"+
		"\u0630\u0631\7Y\2\2\u0631\u0632\5\u0098M\2\u0632\u0633\5\u00ecw\2\u0633"+
		"\u0635\3\2\2\2\u0634\u062f\3\2\2\2\u0634\u0630\3\2\2\2\u0635\u0636\3\2"+
		"\2\2\u0636\u0637\7\36\2\2\u0637\u06eb\3\2\2\2\u0638\u063a\7\u00dd\2\2"+
		"\u0639\u063b\5\u0152\u00aa\2\u063a\u0639\3\2\2\2\u063a\u063b\3\2\2\2\u063b"+
		"\u06eb\3\2\2\2\u063c\u063e\7\u00de\2\2\u063d\u063f\5\u00c2b\2\u063e\u063d"+
		"\3\2\2\2\u063e\u063f\3\2\2\2\u063f\u06eb\3\2\2\2\u0640\u0641\t\36\2\2"+
		"\u0641\u0642\7\35\2\2\u0642\u0643\5\u0098M\2\u0643\u0644\7\32\2\2\u0644"+
		"\u0645\7Y\2\2\u0645\u0646\5\u0098M\2\u0646\u0647\5\u00ecw\2\u0647\u0648"+
		"\7\36\2\2\u0648\u06eb\3\2\2\2\u0649\u064a\7\u00e1\2\2\u064a\u064b\7\35"+
		"\2\2\u064b\u064c\5\u00ecw\2\u064c\u064d\7k\2\2\u064d\u064e\5\u0098M\2"+
		"\u064e\u064f\7\36\2\2\u064f\u06eb\3\2\2\2\u0650\u0651\7\u00e2\2\2\u0651"+
		"\u0652\7\35\2\2\u0652\u0653\5\u00caf\2\u0653\u0654\7\32\2\2\u0654\u0655"+
		"\5\u0098M\2\u0655\u0656\7\36\2\2\u0656\u06eb\3\2\2\2\u0657\u0659\7\u00e3"+
		"\2\2\u0658\u065a\5\u00c2b\2\u0659\u0658\3\2\2\2\u0659\u065a\3\2\2\2\u065a"+
		"\u06eb\3\2\2\2\u065b\u065c\7\u00e4\2\2\u065c\u065d\7\35\2\2\u065d\u065e"+
		"\5\u00a2R\2\u065e\u065f\7u\2\2\u065f\u0660\5\u0098M\2\u0660\u0661\7\36"+
		"\2\2\u0661\u06eb\3\2\2\2\u0662\u06eb\5\u00ceh\2\u0663\u0665\7\u00e5\2"+
		"\2\u0664\u0666\5\u00c2b\2\u0665\u0664\3\2\2\2\u0665\u0666\3\2\2\2\u0666"+
		"\u06eb\3\2\2\2\u0667\u0668\t\37\2\2\u0668\u0669\7\35\2\2\u0669\u066a\5"+
		"\u00eex\2\u066a\u066b\7\32\2\2\u066b\u066c\5\u0098M\2\u066c\u066d\7\32"+
		"\2\2\u066d\u066e\5\u0098M\2\u066e\u066f\7\36\2\2\u066f\u06eb\3\2\2\2\u0670"+
		"\u0672\7\u00e8\2\2\u0671\u0673\5\u0152\u00aa\2\u0672\u0671\3\2\2\2\u0672"+
		"\u0673\3\2\2\2\u0673\u06eb\3\2\2\2\u0674\u0676\7\u00e9\2\2\u0675\u0677"+
		"\5\u00c2b\2\u0676\u0675\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u06eb\3\2\2"+
		"\2\u0678\u067a\7\u00ea\2\2\u0679\u067b\5\u00c2b\2\u067a\u0679\3\2\2\2"+
		"\u067a\u067b\3\2\2\2\u067b\u06eb\3\2\2\2\u067c\u067d\7\u00eb\2\2\u067d"+
		"\u06eb\5\u00f2z\2\u067e\u067f\7\u00ec\2\2\u067f\u06eb\5\u00f2z\2\u0680"+
		"\u0681\7\u00ed\2\2\u0681\u06eb\5\u00f0y\2\u0682\u0683\7\u00ee\2\2\u0683"+
		"\u06eb\5\u00f2z\2\u0684\u0685\7\u00ef\2\2\u0685\u06eb\5\u0152\u00aa\2"+
		"\u0686\u0687\7\u00f0\2\2\u0687\u0688\7\35\2\2\u0688\u0689\5\u0098M\2\u0689"+
		"\u068a\7\32\2\2\u068a\u068b\5\u0098M\2\u068b\u068c\7\32\2\2\u068c\u068d"+
		"\5\u0098M\2\u068d\u068e\7\36\2\2\u068e\u06eb\3\2\2\2\u068f\u0690\7\u00f1"+
		"\2\2\u0690\u0691\7\35\2\2\u0691\u0692\5\u0098M\2\u0692\u0693\7\32\2\2"+
		"\u0693\u0696\5\u0098M\2\u0694\u0695\7\32\2\2\u0695\u0697\5\u0098M\2\u0696"+
		"\u0694\3\2\2\2\u0696\u0697\3\2\2\2\u0697\u0698\3\2\2\2\u0698\u0699\7\36"+
		"\2\2\u0699\u06eb\3\2\2\2\u069a\u069b\7\u00f2\2\2\u069b\u06eb\5\u00f2z"+
		"\2\u069c\u069d\7\u00a5\2\2\u069d\u069e\7\35\2\2\u069e\u069f\5\u0098M\2"+
		"\u069f\u06a0\7\32\2\2\u06a0\u06a1\5\u0098M\2\u06a1\u06a2\7\36\2\2\u06a2"+
		"\u06eb\3\2\2\2\u06a3\u06a4\7\u00f3\2\2\u06a4\u06a5\7\35\2\2\u06a5\u06a6"+
		"\5\u0142\u00a2\2\u06a6\u06a7\7\36\2\2\u06a7\u06eb\3\2\2\2\u06a8\u06a9"+
		"\7\u00f4\2\2\u06a9\u06eb\5\u00f2z\2\u06aa\u06ab\7;\2\2\u06ab\u06eb\5\u00f2"+
		"z\2\u06ac\u06ad\7\u00f5\2\2\u06ad\u06ae\7\35\2\2\u06ae\u06af\5\u0098M"+
		"\2\u06af\u06b0\7\32\2\2\u06b0\u06b1\5\u0098M\2\u06b1\u06b2\7\36\2\2\u06b2"+
		"\u06eb\3\2\2\2\u06b3\u06b4\7\u00f6\2\2\u06b4\u06b5\7\35\2\2\u06b5\u06b6"+
		"\5\u0098M\2\u06b6\u06b7\7\32\2\2\u06b7\u06b8\5\u0098M\2\u06b8\u06b9\7"+
		"\32\2\2\u06b9\u06ba\5\u0098M\2\u06ba\u06bb\7\36\2\2\u06bb\u06eb\3\2\2"+
		"\2\u06bc\u06bd\7\u00f7\2\2\u06bd\u06eb\5\u00f2z\2\u06be\u06bf\7\u00f8"+
		"\2\2\u06bf\u06eb\5\u0152\u00aa\2\u06c0\u06c1\7\u00f9\2\2\u06c1\u06c2\7"+
		"\35\2\2\u06c2\u06c3\5\u0098M\2\u06c3\u06c4\7\32\2\2\u06c4\u06c5\5\u0098"+
		"M\2\u06c5\u06c6\7\36\2\2\u06c6\u06eb\3\2\2\2\u06c7\u06c8\79\2\2\u06c8"+
		"\u06c9\7\35\2\2\u06c9\u06cc\5\u0098M\2\u06ca\u06cb\7\32\2\2\u06cb\u06cd"+
		"\5\u0098M\2\u06cc\u06ca\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06ce\3\2\2"+
		"\2\u06ce\u06cf\7\36\2\2\u06cf\u06eb\3\2\2\2\u06d0\u06d1\7\u00fa\2\2\u06d1"+
		"\u06d2\7\35\2\2\u06d2\u06e5\5\u0098M\2\u06d3\u06d4\7Q\2\2\u06d4\u06d5"+
		"\7\u00d4\2\2\u06d5\u06d7\5\u010c\u0087\2\u06d6\u06d3\3\2\2\2\u06d6\u06d7"+
		"\3\2\2\2\u06d7\u06d9\3\2\2\2\u06d8\u06da\5\u00c6d\2\u06d9\u06d8\3\2\2"+
		"\2\u06d9\u06da\3\2\2\2\u06da\u06e6\3\2\2\2\u06db\u06dc\7Q\2\2\u06dc\u06dd"+
		"\7\u00a8\2\2\u06dd\u06e6\5\u010c\u0087\2\u06de\u06df\7\32\2\2\u06df\u06e0"+
		"\5\u0132\u009a\2\u06e0\u06e1\7\32\2\2\u06e1\u06e2\5\u0132\u009a\2\u06e2"+
		"\u06e3\7\32\2\2\u06e3\u06e4\5\u0132\u009a\2\u06e4\u06e6\3\2\2\2\u06e5"+
		"\u06d6\3\2\2\2\u06e5\u06db\3\2\2\2\u06e5\u06de\3\2\2\2\u06e6\u06e7\3\2"+
		"\2\2\u06e7\u06e8\7\36\2\2\u06e8\u06eb\3\2\2\2\u06e9\u06eb\5\u00c0a\2\u06ea"+
		"\u05dc\3\2\2\2\u06ea\u05e5\3\2\2\2\u06ea\u05e9\3\2\2\2\u06ea\u05eb\3\2"+
		"\2\2\u06ea\u05ed\3\2\2\2\u06ea\u05ef\3\2\2\2\u06ea\u05fa\3\2\2\2\u06ea"+
		"\u0605\3\2\2\2\u06ea\u060c\3\2\2\2\u06ea\u060e\3\2\2\2\u06ea\u0610\3\2"+
		"\2\2\u06ea\u0617\3\2\2\2\u06ea\u0619\3\2\2\2\u06ea\u061b\3\2\2\2\u06ea"+
		"\u0624\3\2\2\2\u06ea\u0625\3\2\2\2\u06ea\u0627\3\2\2\2\u06ea\u0629\3\2"+
		"\2\2\u06ea\u062b\3\2\2\2\u06ea\u0638\3\2\2\2\u06ea\u063c\3\2\2\2\u06ea"+
		"\u0640\3\2\2\2\u06ea\u0649\3\2\2\2\u06ea\u0650\3\2\2\2\u06ea\u0657\3\2"+
		"\2\2\u06ea\u065b\3\2\2\2\u06ea\u0662\3\2\2\2\u06ea\u0663\3\2\2\2\u06ea"+
		"\u0667\3\2\2\2\u06ea\u0670\3\2\2\2\u06ea\u0674\3\2\2\2\u06ea\u0678\3\2"+
		"\2\2\u06ea\u067c\3\2\2\2\u06ea\u067e\3\2\2\2\u06ea\u0680\3\2\2\2\u06ea"+
		"\u0682\3\2\2\2\u06ea\u0684\3\2\2\2\u06ea\u0686\3\2\2\2\u06ea\u068f\3\2"+
		"\2\2\u06ea\u069a\3\2\2\2\u06ea\u069c\3\2\2\2\u06ea\u06a3\3\2\2\2\u06ea"+
		"\u06a8\3\2\2\2\u06ea\u06aa\3\2\2\2\u06ea\u06ac\3\2\2\2\u06ea\u06b3\3\2"+
		"\2\2\u06ea\u06bc\3\2\2\2\u06ea\u06be\3\2\2\2\u06ea\u06c0\3\2\2\2\u06ea"+
		"\u06c7\3\2\2\2\u06ea\u06d0\3\2\2\2\u06ea\u06e9\3\2\2\2\u06eb\u00bf\3\2"+
		"\2\2\u06ec\u06ed\7\u00fb\2\2\u06ed\u06ee\7\35\2\2\u06ee\u06ef\5\u0098"+
		"M\2\u06ef\u06f0\7\32\2\2\u06f0\u06f1\5\u0098M\2\u06f1\u06f2\7\36\2\2\u06f2"+
		"\u070b\3\2\2\2\u06f3\u06f4\7\u00fc\2\2\u06f4\u06f6\7\35\2\2\u06f5\u06f7"+
		"\5\u00e4s\2\u06f6\u06f5\3\2\2\2\u06f6\u06f7\3\2\2\2\u06f7\u06f8\3\2\2"+
		"\2\u06f8\u070b\7\36\2\2\u06f9\u06fa\7\u00fd\2\2\u06fa\u070b\5\u00f0y\2"+
		"\u06fb\u06fc\7\u00fe\2\2\u06fc\u070b\5\u00f0y\2\u06fd\u06fe\7\u00ff\2"+
		"\2\u06fe\u070b\5\u00f0y\2\u06ff\u0700\7\u0100\2\2\u0700\u070b\5\u00f0"+
		"y\2\u0701\u0702\7\u0101\2\2\u0702\u0703\7\35\2\2\u0703\u0704\5\u0098M"+
		"\2\u0704\u0705\7\32\2\2\u0705\u0706\5\u0098M\2\u0706\u0707\7\36\2\2\u0707"+
		"\u070b\3\2\2\2\u0708\u0709\7\u0102\2\2\u0709\u070b\5\u00f0y\2\u070a\u06ec"+
		"\3\2\2\2\u070a\u06f3\3\2\2\2\u070a\u06f9\3\2\2\2\u070a\u06fb\3\2\2\2\u070a"+
		"\u06fd\3\2\2\2\u070a\u06ff\3\2\2\2\u070a\u0701\3\2\2\2\u070a\u0708\3\2"+
		"\2\2\u070b\u00c1\3\2\2\2\u070c\u070e\7\35\2\2\u070d\u070f\5\u00c4c\2\u070e"+
		"\u070d\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0710\3\2\2\2\u0710\u0711\7\36"+
		"\2\2\u0711\u00c3\3\2\2\2\u0712\u0713\7-\2\2\u0713\u00c5\3\2\2\2\u0714"+
		"\u0721\7\u0103\2\2\u0715\u0716\5\u0134\u009b\2\u0716\u0717\7\f\2\2\u0717"+
		"\u0718\5\u0134\u009b\2\u0718\u0722\3\2\2\2\u0719\u071e\5\u00c8e\2\u071a"+
		"\u071b\7\32\2\2\u071b\u071d\5\u00c8e\2\u071c\u071a\3\2\2\2\u071d\u0720"+
		"\3\2\2\2\u071e\u071c\3\2\2\2\u071e\u071f\3\2\2\2\u071f\u0722\3\2\2\2\u0720"+
		"\u071e\3\2\2\2\u0721\u0715\3\2\2\2\u0721\u0719\3\2\2\2\u0722\u00c7\3\2"+
		"\2\2\u0723\u0729\5\u0134\u009b\2\u0724\u0726\t\6\2\2\u0725\u0727\7\u00f7"+
		"\2\2\u0726\u0725\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u072a\3\2\2\2\u0728"+
		"\u072a\7\u00f7\2\2\u0729\u0724\3\2\2\2\u0729\u0728\3\2\2\2\u0729\u072a"+
		"\3\2\2\2\u072a\u00c9\3\2\2\2\u072b\u072c\t \2\2\u072c\u00cb\3\2\2\2\u072d"+
		"\u072e\7\u0105\2\2\u072e\u0746\7\35\2\2\u072f\u0732\5\u0098M\2\u0730\u0731"+
		"\7k\2\2\u0731\u0733\5\u0098M\2\u0732\u0730\3\2\2\2\u0732\u0733\3\2\2\2"+
		"\u0733\u0747\3\2\2\2\u0734\u0736\7\u0106\2\2\u0735\u0737\5\u0098M\2\u0736"+
		"\u0735\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u0739\7k"+
		"\2\2\u0739\u0747\5\u0098M\2\u073a\u073c\7\u0107\2\2\u073b\u073d\5\u0098"+
		"M\2\u073c\u073b\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u073e\3\2\2\2\u073e"+
		"\u073f\7k\2\2\u073f\u0747\5\u0098M\2\u0740\u0742\7\u0108\2\2\u0741\u0743"+
		"\5\u0098M\2\u0742\u0741\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0744\3\2\2"+
		"\2\u0744\u0745\7k\2\2\u0745\u0747\5\u0098M\2\u0746\u072f\3\2\2\2\u0746"+
		"\u0734\3\2\2\2\u0746\u073a\3\2\2\2\u0746\u0740\3\2\2\2\u0747\u0748\3\2"+
		"\2\2\u0748\u0749\7\36\2\2\u0749\u00cd\3\2\2\2\u074a\u074b\7\u0109\2\2"+
		"\u074b\u074c\7\35\2\2\u074c\u0759\5\u0098M\2\u074d\u074e\7\32\2\2\u074e"+
		"\u0751\5\u0098M\2\u074f\u0750\7\32\2\2\u0750\u0752\5\u0098M\2\u0751\u074f"+
		"\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u075a\3\2\2\2\u0753\u0754\7k\2\2\u0754"+
		"\u0757\5\u0098M\2\u0755\u0756\7r\2\2\u0756\u0758\5\u0098M\2\u0757\u0755"+
		"\3\2\2\2\u0757\u0758\3\2\2\2\u0758\u075a\3\2\2\2\u0759\u074d\3\2\2\2\u0759"+
		"\u0753\3\2\2\2\u075a\u075b\3\2\2\2\u075b\u075c\7\36\2\2\u075c\u00cf\3"+
		"\2\2\2\u075d\u075e\5\u0126\u0094\2\u075e\u0760\7\35\2\2\u075f\u0761\5"+
		"\u00d2j\2\u0760\u075f\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u0762\3\2\2\2"+
		"\u0762\u0763\7\36\2\2\u0763\u076c\3\2\2\2\u0764\u0765\5\u012e\u0098\2"+
		"\u0765\u0767\7\35\2\2\u0766\u0768\5\u00e4s\2\u0767\u0766\3\2\2\2\u0767"+
		"\u0768\3\2\2\2\u0768\u0769\3\2\2\2\u0769\u076a\7\36\2\2\u076a\u076c\3"+
		"\2\2\2\u076b\u075d\3\2\2\2\u076b\u0764\3\2\2\2\u076c\u00d1\3\2\2\2\u076d"+
		"\u0772\5\u00d4k\2\u076e\u076f\7\32\2\2\u076f\u0771\5\u00d4k\2\u0770\u076e"+
		"\3\2\2\2\u0771\u0774\3\2\2\2\u0772\u0770\3\2\2\2\u0772\u0773\3\2\2\2\u0773"+
		"\u00d3\3\2\2\2\u0774\u0772\3\2\2\2\u0775\u0777\5\u0098M\2\u0776\u0778"+
		"\5^\60\2\u0777\u0776\3\2\2\2\u0777\u0778\3\2\2\2\u0778\u00d5\3\2\2\2\u0779"+
		"\u077c\5\u00d8m\2\u077a\u077c\5\u00dan\2\u077b\u0779\3\2\2\2\u077b\u077a"+
		"\3\2\2\2\u077c\u00d7\3\2\2\2\u077d\u077e\7&\2\2\u077e\u0781\5\u0150\u00a9"+
		"\2\u077f\u0781\7\'\2\2\u0780\u077d\3\2\2\2\u0780\u077f\3\2\2\2\u0781\u00d9"+
		"\3\2\2\2\u0782\u0784\7(\2\2\u0783\u0785\5\u0156\u00ac\2\u0784\u0783\3"+
		"\2\2\2\u0784\u0785\3\2\2\2\u0785\u0786\3\2\2\2\u0786\u0788\5\u0150\u00a9"+
		"\2\u0787\u0789\5\u0130\u0099\2\u0788\u0787\3\2\2\2\u0788\u0789\3\2\2\2"+
		"\u0789\u00db\3\2\2\2\u078a\u078b\7\u010a\2\2\u078b\u078c\5\u0098M\2\u078c"+
		"\u00dd\3\2\2\2\u078d\u078e\7\u010b\2\2\u078e\u078f\5\u0098M\2\u078f\u00df"+
		"\3\2\2\2\u0790\u0791\7\u010c\2\2\u0791\u0792\5\u0098M\2\u0792\u00e1\3"+
		"\2\2\2\u0793\u0795\7\u00a8\2\2\u0794\u0796\5\u0102\u0082\2\u0795\u0794"+
		"\3\2\2\2\u0795\u0796\3\2\2\2\u0796\u07be\3\2\2\2\u0797\u0799\7\u00d4\2"+
		"\2\u0798\u079a\5\u0102\u0082\2\u0799\u0798\3\2\2\2\u0799\u079a\3\2\2\2"+
		"\u079a\u079c\3\2\2\2\u079b\u079d\5\u0106\u0084\2\u079c\u079b\3\2\2\2\u079c"+
		"\u079d\3\2\2\2\u079d\u07be\3\2\2\2\u079e\u07a0\5\u00fe\u0080\2\u079f\u07a1"+
		"\5\u0102\u0082\2\u07a0\u079f\3\2\2\2\u07a0\u07a1\3\2\2\2\u07a1\u07be\3"+
		"\2\2\2\u07a2\u07a4\7\u010d\2\2\u07a3\u07a5\7\63\2\2\u07a4\u07a3\3\2\2"+
		"\2\u07a4\u07a5\3\2\2\2\u07a5\u07be\3\2\2\2\u07a6\u07a8\7\u010e\2\2\u07a7"+
		"\u07a9\7\63\2\2\u07a8\u07a7\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07be\3"+
		"\2\2\2\u07aa\u07be\7\u00d6\2\2\u07ab\u07ad\7\u00d8\2\2\u07ac\u07ae\5\u010e"+
		"\u0088\2\u07ad\u07ac\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07be\3\2\2\2\u07af"+
		"\u07b1\7\u0104\2\2\u07b0\u07b2\5\u010e\u0088\2\u07b1\u07b0\3\2\2\2\u07b1"+
		"\u07b2\3\2\2\2\u07b2\u07be\3\2\2\2\u07b3\u07b5\7\u010f\2\2\u07b4\u07b6"+
		"\5\u014c\u00a7\2\u07b5\u07b4\3\2\2\2\u07b5\u07b6\3\2\2\2\u07b6\u07be\3"+
		"\2\2\2\u07b7\u07be\7\u0110\2\2\u07b8\u07be\5\u0100\u0081\2\u07b9\u07bb"+
		"\7\u0111\2\2\u07ba\u07bc\5\u014e\u00a8\2\u07bb\u07ba\3\2\2\2\u07bb\u07bc"+
		"\3\2\2\2\u07bc\u07be\3\2\2\2\u07bd\u0793\3\2\2\2\u07bd\u0797\3\2\2\2\u07bd"+
		"\u079e\3\2\2\2\u07bd\u07a2\3\2\2\2\u07bd\u07a6\3\2\2\2\u07bd\u07aa\3\2"+
		"\2\2\u07bd\u07ab\3\2\2\2\u07bd\u07af\3\2\2\2\u07bd\u07b3\3\2\2\2\u07bd"+
		"\u07b7\3\2\2\2\u07bd\u07b8\3\2\2\2\u07bd\u07b9\3\2\2\2\u07be\u00e3\3\2"+
		"\2\2\u07bf\u07c4\5\u0098M\2\u07c0\u07c1\7\32\2\2\u07c1\u07c3\5\u0098M"+
		"\2\u07c2\u07c0\3\2\2\2\u07c3\u07c6\3\2\2\2\u07c4\u07c2\3\2\2\2\u07c4\u07c5"+
		"\3\2\2\2\u07c5\u00e5\3\2\2\2\u07c6\u07c4\3\2\2\2\u07c7\u07c8\7\u00d4\2"+
		"\2\u07c8\u07cb\7\u0112\2\2\u07c9\u07cb\7\u00ec\2\2\u07ca\u07c7\3\2\2\2"+
		"\u07ca\u07c9\3\2\2\2\u07cb\u00e7\3\2\2\2\u07cc\u07cd\7\u009b\2\2\u07cd"+
		"\u00e9\3\2\2\2\u07ce\u07cf\7\20\2\2\u07cf\u00eb\3\2\2\2\u07d0\u07d3\5"+
		"\u00eex\2\u07d1\u07d3\t!\2\2\u07d2\u07d0\3\2\2\2\u07d2\u07d1\3\2\2\2\u07d3"+
		"\u00ed\3\2\2\2\u07d4\u07d5\t\"\2\2\u07d5\u00ef\3\2\2\2\u07d6\u07d7\7\35"+
		"\2\2\u07d7\u07d8\5\u00e4s\2\u07d8\u07d9\7\36\2\2\u07d9\u00f1\3\2\2\2\u07da"+
		"\u07db\7\35\2\2\u07db\u07dc\5\u0098M\2\u07dc\u07dd\7\36\2\2\u07dd\u00f3"+
		"\3\2\2\2\u07de\u07df\7\35\2\2\u07df\u07e0\5\u00a4S\2\u07e0\u07e1\7\36"+
		"\2\2\u07e1\u00f5\3\2\2\2\u07e2\u07e7\5\u00f8}\2\u07e3\u07e4\7\32\2\2\u07e4"+
		"\u07e6\5\u00f8}\2\u07e5\u07e3\3\2\2\2\u07e6\u07e9\3\2\2\2\u07e7\u07e5"+
		"\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u00f7\3\2\2\2\u07e9\u07e7\3\2\2\2\u07ea"+
		"\u07ec\5\u0098M\2\u07eb\u07ed\5D#\2\u07ec\u07eb\3\2\2\2\u07ec\u07ed\3"+
		"\2\2\2\u07ed\u00f9\3\2\2\2\u07ee\u07ef\t#\2\2\u07ef\u00fb\3\2\2\2\u07f0"+
		"\u07f2\t$\2\2\u07f1\u07f3\5\u0102\u0082\2\u07f2\u07f1\3\2\2\2\u07f2\u07f3"+
		"\3\2\2\2\u07f3\u07f5\3\2\2\2\u07f4\u07f6\5\u0104\u0083\2\u07f5\u07f4\3"+
		"\2\2\2\u07f5\u07f6\3\2\2\2\u07f6\u0883\3\2\2\2\u07f7\u07fd\7\u0121\2\2"+
		"\u07f8\u07fa\7\u0122\2\2\u07f9\u07fb\7\u0123\2\2\u07fa\u07f9\3\2\2\2\u07fa"+
		"\u07fb\3\2\2\2\u07fb\u07fd\3\2\2\2\u07fc\u07f7\3\2\2\2\u07fc\u07f8\3\2"+
		"\2\2\u07fd\u07ff\3\2\2\2\u07fe\u0800\5\u014e\u00a8\2\u07ff\u07fe\3\2\2"+
		"\2\u07ff\u0800\3\2\2\2\u0800\u0802\3\2\2\2\u0801\u0803\5\u0104\u0083\2"+
		"\u0802\u0801\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0883\3\2\2\2\u0804\u0806"+
		"\t%\2\2\u0805\u0807\5\u014c\u00a7\2\u0806\u0805\3\2\2\2\u0806\u0807\3"+
		"\2\2\2\u0807\u0809\3\2\2\2\u0808\u080a\5\u0104\u0083\2\u0809\u0808\3\2"+
		"\2\2\u0809\u080a\3\2\2\2\u080a\u0883\3\2\2\2\u080b\u080d\7\u0126\2\2\u080c"+
		"\u080e\5\u0102\u0082\2\u080d\u080c\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u0883"+
		"\3\2\2\2\u080f\u0883\t&\2\2\u0810\u0812\7\u00d4\2\2\u0811\u0813\5\u0102"+
		"\u0082\2\u0812\u0811\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0815\3\2\2\2\u0814"+
		"\u0816\5\u0106\u0084\2\u0815\u0814\3\2\2\2\u0815\u0816\3\2\2\2\u0816\u0883"+
		"\3\2\2\2\u0817\u0819\5\u00fe\u0080\2\u0818\u081a\5\u0102\u0082\2\u0819"+
		"\u0818\3\2\2\2\u0819\u081a\3\2\2\2\u081a\u081c\3\2\2\2\u081b\u081d\7\u00a8"+
		"\2\2\u081c\u081b\3\2\2\2\u081c\u081d\3\2\2\2\u081d\u0883\3\2\2\2\u081e"+
		"\u0820\7\u00a8\2\2\u081f\u0821\5\u0102\u0082\2\u0820\u081f\3\2\2\2\u0820"+
		"\u0821\3\2\2\2\u0821\u0883\3\2\2\2\u0822\u0823\7\u00d4\2\2\u0823\u0826"+
		"\7\u0128\2\2\u0824\u0826\7\u0129\2\2\u0825\u0822\3\2\2\2\u0825\u0824\3"+
		"\2\2\2\u0826\u0827\3\2\2\2\u0827\u0829\5\u0102\u0082\2\u0828\u082a\5\u0106"+
		"\u0084\2\u0829\u0828\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u0883\3\2\2\2\u082b"+
		"\u082c\7\u012a\2\2\u082c\u0836\7\u0129\2\2\u082d\u0836\7\u012b\2\2\u082e"+
		"\u082f\7\u012c\2\2\u082f\u0836\7\u0129\2\2\u0830\u0831\7\u012a\2\2\u0831"+
		"\u0832\7\u00d4\2\2\u0832\u0836\7\u0128\2\2\u0833\u0834\7\u012c\2\2\u0834"+
		"\u0836\7\u0128\2\2\u0835\u082b\3\2\2\2\u0835\u082d\3\2\2\2\u0835\u082e"+
		"\3\2\2\2\u0835\u0830\3\2\2\2\u0835\u0833\3\2\2\2\u0836\u0837\3\2\2\2\u0837"+
		"\u0839\5\u0102\u0082\2\u0838\u083a\7\u00a8\2\2\u0839\u0838\3\2\2\2\u0839"+
		"\u083a\3\2\2\2\u083a\u0883\3\2\2\2\u083b\u083c\7\u012d\2\2\u083c\u0883"+
		"\5\u0102\u0082\2\u083d\u083f\7<\2\2\u083e\u0840\5\u0102\u0082\2\u083f"+
		"\u083e\3\2\2\2\u083f\u0840\3\2\2\2\u0840\u0842\3\2\2\2\u0841\u0843\5\u0104"+
		"\u0083\2\u0842\u0841\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0883\3\2\2\2\u0844"+
		"\u0883\7\u00d6\2\2\u0845\u0847\7\u00d8\2\2\u0846\u0848\5\u010e\u0088\2"+
		"\u0847\u0846\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u0883\3\2\2\2\u0849\u084b"+
		"\7\u00d9\2\2\u084a\u084c\5\u010e\u0088\2\u084b\u084a\3\2\2\2\u084b\u084c"+
		"\3\2\2\2\u084c\u0883\3\2\2\2\u084d\u084f\7\u0104\2\2\u084e\u0850\5\u010e"+
		"\u0088\2\u084f\u084e\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0883\3\2\2\2\u0851"+
		"\u0883\7\u012e\2\2\u0852\u0854\7\u012f\2\2\u0853\u0855\5\u0102\u0082\2"+
		"\u0854\u0853\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u0883\3\2\2\2\u0856\u0883"+
		"\t\'\2\2\u0857\u0858\7\u0132\2\2\u0858\u0883\7\u012d\2\2\u0859\u085d\7"+
		"\u0132\2\2\u085a\u085b\7\u00d4\2\2\u085b\u085e\7\u0128\2\2\u085c\u085e"+
		"\7\u0129\2\2\u085d\u085a\3\2\2\2\u085d\u085c\3\2\2\2\u085d\u085e\3\2\2"+
		"\2\u085e\u0860\3\2\2\2\u085f\u0861\5\u0106\u0084\2\u0860\u085f\3\2\2\2"+
		"\u0860\u0861\3\2\2\2\u0861\u0883\3\2\2\2\u0862\u0864\7\u0133\2\2\u0863"+
		"\u0865\5\u0106\u0084\2\u0864\u0863\3\2\2\2\u0864\u0865\3\2\2\2\u0865\u0883"+
		"\3\2\2\2\u0866\u0868\7\u0134\2\2\u0867\u0869\5\u0102\u0082\2\u0868\u0867"+
		"\3\2\2\2\u0868\u0869\3\2\2\2\u0869\u086b\3\2\2\2\u086a\u086c\5\u0106\u0084"+
		"\2\u086b\u086a\3\2\2\2\u086b\u086c\3\2\2\2\u086c\u0883\3\2\2\2\u086d\u086f"+
		"\7\u0135\2\2\u086e\u0870\5\u0106\u0084\2\u086f\u086e\3\2\2\2\u086f\u0870"+
		"\3\2\2\2\u0870\u0883\3\2\2\2\u0871\u0873\7\u0136\2\2\u0872\u0874\5\u0106"+
		"\u0084\2\u0873\u0872\3\2\2\2\u0873\u0874\3\2\2\2\u0874\u0883\3\2\2\2\u0875"+
		"\u0876\7\u0137\2\2\u0876\u0878\5\u013c\u009f\2\u0877\u0879\5\u0106\u0084"+
		"\2\u0878\u0877\3\2\2\2\u0878\u0879\3\2\2\2\u0879\u0883\3\2\2\2\u087a\u087b"+
		"\7\u0112\2\2\u087b\u087d\5\u013c\u009f\2\u087c\u087e\5\u0106\u0084\2\u087d"+
		"\u087c\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u0883\3\2\2\2\u087f\u0883\7\u0138"+
		"\2\2\u0880\u0883\7\u0110\2\2\u0881\u0883\t(\2\2\u0882\u07f0\3\2\2\2\u0882"+
		"\u07fc\3\2\2\2\u0882\u0804\3\2\2\2\u0882\u080b\3\2\2\2\u0882\u080f\3\2"+
		"\2\2\u0882\u0810\3\2\2\2\u0882\u0817\3\2\2\2\u0882\u081e\3\2\2\2\u0882"+
		"\u0825\3\2\2\2\u0882\u0835\3\2\2\2\u0882\u083b\3\2\2\2\u0882\u083d\3\2"+
		"\2\2\u0882\u0844\3\2\2\2\u0882\u0845\3\2\2\2\u0882\u0849\3\2\2\2\u0882"+
		"\u084d\3\2\2\2\u0882\u0851\3\2\2\2\u0882\u0852\3\2\2\2\u0882\u0856\3\2"+
		"\2\2\u0882\u0857\3\2\2\2\u0882\u0859\3\2\2\2\u0882\u0862\3\2\2\2\u0882"+
		"\u0866\3\2\2\2\u0882\u086d\3\2\2\2\u0882\u0871\3\2\2\2\u0882\u0875\3\2"+
		"\2\2\u0882\u087a\3\2\2\2\u0882\u087f\3\2\2\2\u0882\u0880\3\2\2\2\u0882"+
		"\u0881\3\2\2\2\u0883\u00fd\3\2\2\2\u0884\u0888\7\u012c\2\2\u0885\u0886"+
		"\7\u012a\2\2\u0886\u0888\7\u00d4\2\2\u0887\u0884\3\2\2\2\u0887\u0885\3"+
		"\2\2\2\u0888\u00ff\3\2\2\2\u0889\u088f\7\u0121\2\2\u088a\u088c\7\u0122"+
		"\2\2\u088b\u088d\7\u0123\2\2\u088c\u088b\3\2\2\2\u088c\u088d\3\2\2\2\u088d"+
		"\u088f\3\2\2\2\u088e\u0889\3\2\2\2\u088e\u088a\3\2\2\2\u088f\u0101\3\2"+
		"\2\2\u0890\u0893\7\35\2\2\u0891\u0894\5\u0138\u009d\2\u0892\u0894\7.\2"+
		"\2\u0893\u0891\3\2\2\2\u0893\u0892\3\2\2\2\u0894\u0895\3\2\2\2\u0895\u0896"+
		"\7\36\2\2\u0896\u0103\3\2\2\2\u0897\u0899\t)\2\2\u0898\u0897\3\2\2\2\u0899"+
		"\u089a\3\2\2\2\u089a\u0898\3\2\2\2\u089a\u089b\3\2\2\2\u089b\u0105\3\2"+
		"\2\2\u089c\u08ab\5\u0108\u0085\2\u089d\u08ab\5\u010a\u0086\2\u089e\u08ab"+
		"\7\u013b\2\2\u089f\u08a0\5\u00e6t\2\u08a0\u08a2\5\u0110\u0089\2\u08a1"+
		"\u08a3\7\u00a8\2\2\u08a2\u08a1\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3\u08ab"+
		"\3\2\2\2\u08a4\u08a8\7\u00a8\2\2\u08a5\u08a6\5\u00e6t\2\u08a6\u08a7\5"+
		"\u0110\u0089\2\u08a7\u08a9\3\2\2\2\u08a8\u08a5\3\2\2\2\u08a8\u08a9\3\2"+
		"\2\2\u08a9\u08ab\3\2\2\2\u08aa\u089c\3\2\2\2\u08aa\u089d\3\2\2\2\u08aa"+
		"\u089e\3\2\2\2\u08aa\u089f\3\2\2\2\u08aa\u08a4\3\2\2\2\u08ab\u0107\3\2"+
		"\2\2\u08ac\u08ae\7\u00eb\2\2\u08ad\u08af\7\u00a8\2\2\u08ae\u08ad\3\2\2"+
		"\2\u08ae\u08af\3\2\2\2\u08af\u08b3\3\2\2\2\u08b0\u08b1\7\u00a8\2\2\u08b1"+
		"\u08b3\7\u00eb\2\2\u08b2\u08ac\3\2\2\2\u08b2\u08b0\3\2\2\2\u08b3\u0109"+
		"\3\2\2\2\u08b4\u08b6\7\u013c\2\2\u08b5\u08b7\7\u00a8\2\2\u08b6\u08b5\3"+
		"\2\2\2\u08b6\u08b7\3\2\2\2\u08b7\u08bb\3\2\2\2\u08b8\u08b9\7\u00a8\2\2"+
		"\u08b9\u08bb\7\u013c\2\2\u08ba\u08b4\3\2\2\2\u08ba\u08b8\3\2\2\2\u08bb"+
		"\u010b\3\2\2\2\u08bc\u08bd\7\35\2\2\u08bd\u08be\5\u0134\u009b\2\u08be"+
		"\u08bf\7\36\2\2\u08bf\u010d\3\2\2\2\u08c0\u08c1\7\35\2\2\u08c1\u08c2\7"+
		"-\2\2\u08c2\u08c3\7\36\2\2\u08c3\u010f\3\2\2\2\u08c4\u08c8\5\u0150\u00a9"+
		"\2\u08c5\u08c8\7\u00a8\2\2\u08c6\u08c8\7=\2\2\u08c7\u08c4\3\2\2\2\u08c7"+
		"\u08c5\3\2\2\2\u08c7\u08c6\3\2\2\2\u08c8\u0111\3\2\2\2\u08c9\u08cd\5\u0150"+
		"\u00a9\2\u08ca\u08cd\7=\2\2\u08cb\u08cd\7\u00a8\2\2\u08cc\u08c9\3\2\2"+
		"\2\u08cc\u08ca\3\2\2\2\u08cc\u08cb\3\2\2\2\u08cd\u0113\3\2\2\2\u08ce\u08cf"+
		"\7\u00ae\2\2\u08cf\u08d0\5\u0112\u008a\2\u08d0\u0115\3\2\2\2\u08d1\u08d2"+
		"\5\u00e6t\2\u08d2\u08d3\5\u0110\u0089\2\u08d3\u0117\3\2\2\2\u08d4\u08d6"+
		"\7\u0089\2\2\u08d5\u08d7\5\u011a\u008e\2\u08d6\u08d5\3\2\2\2\u08d7\u08d8"+
		"\3\2\2\2\u08d8\u08d6\3\2\2\2\u08d8\u08d9\3\2\2\2\u08d9\u0119\3\2\2\2\u08da"+
		"\u08db\7\u013d\2\2\u08db\u08dc\7S\2\2\u08dc\u08e7\5\u0140\u00a1\2\u08dd"+
		"\u08df\7\u013e\2\2\u08de\u08dd\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u08e0"+
		"\3\2\2\2\u08e0\u08e1\7\u013f\2\2\u08e1\u08e2\7S\2\2\u08e2\u08e7\5\u0140"+
		"\u00a1\2\u08e3\u08e4\7\u0140\2\2\u08e4\u08e5\7S\2\2\u08e5\u08e7\5\u0140"+
		"\u00a1\2\u08e6\u08da\3\2\2\2\u08e6\u08de\3\2\2\2\u08e6\u08e3\3\2\2\2\u08e7"+
		"\u011b\3\2\2\2\u08e8\u08ea\7\u0141\2\2\u08e9\u08eb\5\u011e\u0090\2\u08ea"+
		"\u08e9\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u08ea\3\2\2\2\u08ec\u08ed\3\2"+
		"\2\2\u08ed\u011d\3\2\2\2\u08ee\u08ef\t*\2\2\u08ef\u08f0\7S\2\2\u08f0\u08f1"+
		"\5\u0140\u00a1\2\u08f1\u011f\3\2\2\2\u08f2\u08f3\7R\2\2\u08f3\u08f4\5"+
		"\u012c\u0097\2\u08f4\u0121\3\2\2\2\u08f5\u08f6\7\35\2\2\u08f6\u08fb\5"+
		"\u0128\u0095\2\u08f7\u08f8\7\32\2\2\u08f8\u08fa\5\u0128\u0095\2\u08f9"+
		"\u08f7\3\2\2\2\u08fa\u08fd\3\2\2\2\u08fb\u08f9\3\2\2\2\u08fb\u08fc\3\2"+
		"\2\2\u08fc\u08fe\3\2\2\2\u08fd\u08fb\3\2\2\2\u08fe\u08ff\7\36\2\2\u08ff"+
		"\u0123\3\2\2\2\u0900\u0905\5\u012e\u0098\2\u0901\u0902\7\32\2\2\u0902"+
		"\u0904\5\u012e\u0098\2\u0903\u0901\3\2\2\2\u0904\u0907\3\2\2\2\u0905\u0903"+
		"\3\2\2\2\u0905\u0906\3\2\2\2\u0906\u0125\3\2\2\2\u0907\u0905\3\2\2\2\u0908"+
		"\u0909\t+\2\2\u0909\u0127\3\2\2\2\u090a\u090d\5\u0126\u0094\2\u090b\u090d"+
		"\5\u0158\u00ad\2\u090c\u090a\3\2\2\2\u090c\u090b\3\2\2\2\u090d\u0129\3"+
		"\2\2\2\u090e\u0913\5\u0128\u0095\2\u090f\u0910\7\32\2\2\u0910\u0912\5"+
		"\u0128\u0095\2\u0911\u090f\3\2\2\2\u0912\u0915\3\2\2\2\u0913\u0911\3\2"+
		"\2\2\u0913\u0914\3\2\2\2\u0914\u012b\3\2\2\2\u0915\u0913\3\2\2\2\u0916"+
		"\u0917\7\35\2\2\u0917\u0918\5\u012a\u0096\2\u0918\u0919\7\36\2\2\u0919"+
		"\u012d\3\2\2\2\u091a\u091f\5\u0128\u0095\2\u091b\u091c\7\31\2\2\u091c"+
		"\u091e\5\u0128\u0095\2\u091d\u091b\3\2\2\2\u091e\u0921\3\2\2\2\u091f\u091d"+
		"\3\2\2\2\u091f\u0920\3\2\2\2\u0920\u0924\3\2\2\2\u0921\u091f\3\2\2\2\u0922"+
		"\u0923\7\31\2\2\u0923\u0925\7\r\2\2\u0924\u0922\3\2\2\2\u0924\u0925\3"+
		"\2\2\2\u0925\u012f\3\2\2\2\u0926\u0927\7\31\2\2\u0927\u0928\5\u0128\u0095"+
		"\2\u0928\u0131\3\2\2\2\u0929\u092a\t,\2\2\u092a\u0133\3\2\2\2\u092b\u092c"+
		"\t-\2\2\u092c\u0135\3\2\2\2\u092d\u092e\t.\2\2\u092e\u0137\3\2\2\2\u092f"+
		"\u0930\t-\2\2\u0930\u0139\3\2\2\2\u0931\u093b\5\u0142\u00a2\2\u0932\u093b"+
		"\5\u0144\u00a3\2\u0933\u093b\5\u014a\u00a6\2\u0934\u093b\5\u0148\u00a5"+
		"\2\u0935\u093b\5\u0146\u00a4\2\u0936\u0938\7\u0148\2\2\u0937\u0936\3\2"+
		"\2\2\u0937\u0938\3\2\2\2\u0938\u0939\3\2\2\2\u0939\u093b\t/\2\2\u093a"+
		"\u0931\3\2\2\2\u093a\u0932\3\2\2\2\u093a\u0933\3\2\2\2\u093a\u0934\3\2"+
		"\2\2\u093a\u0935\3\2\2\2\u093a\u0937\3\2\2\2\u093b\u013b\3\2\2\2\u093c"+
		"\u093d\7\35\2\2\u093d\u0942\5\u0140\u00a1\2\u093e\u093f\7\32\2\2\u093f"+
		"\u0941\5\u0140\u00a1\2\u0940\u093e\3\2\2\2\u0941\u0944\3\2\2\2\u0942\u0940"+
		"\3\2\2\2\u0942\u0943\3\2\2\2\u0943\u0945\3\2\2\2\u0944\u0942\3\2\2\2\u0945"+
		"\u0946\7\36\2\2\u0946\u013d\3\2\2\2\u0947\u094a\7\u014d\2\2\u0948\u094a"+
		"\7\u014c\2\2\u0949\u0947\3\2\2\2\u0949\u0948\3\2\2\2\u094a\u013f\3\2\2"+
		"\2\u094b\u094f\5\u013e\u00a0\2\u094c\u094f\7+\2\2";
	private static final String _serializedATNSegment1 =
		"\u094d\u094f\7,\2\2\u094e\u094b\3\2\2\2\u094e\u094c\3\2\2\2\u094e\u094d"+
		"\3\2\2\2\u094f\u0141\3\2\2\2\u0950\u0952\7\u0148\2\2\u0951\u0950\3\2\2"+
		"\2\u0951\u0952\3\2\2\2\u0952\u0953\3\2\2\2\u0953\u0956\5\u013e\u00a0\2"+
		"\u0954\u0956\7\u014a\2\2\u0955\u0951\3\2\2\2\u0955\u0954\3\2\2\2\u0956"+
		"\u095a\3\2\2\2\u0957\u0959\5\u013e\u00a0\2\u0958\u0957\3\2\2\2\u0959\u095c"+
		"\3\2\2\2\u095a\u0958\3\2\2\2\u095a\u095b\3\2\2\2\u095b\u0143\3\2\2\2\u095c"+
		"\u095a\3\2\2\2\u095d\u095e\t.\2\2\u095e\u0145\3\2\2\2\u095f\u0960\t\60"+
		"\2\2\u0960\u0147\3\2\2\2\u0961\u0962\t\61\2\2\u0962\u0149\3\2\2\2\u0963"+
		"\u0964\7\u00d6\2\2\u0964\u096a\7\u014d\2\2\u0965\u0966\7\u00d8\2\2\u0966"+
		"\u096a\7\u014d\2\2\u0967\u0968\7\u00d9\2\2\u0968\u096a\7\u014d\2\2\u0969"+
		"\u0963\3\2\2\2\u0969\u0965\3\2\2\2\u0969\u0967\3\2\2\2\u096a\u014b\3\2"+
		"\2\2\u096b\u096e\5\u0102\u0082\2\u096c\u096e\5\u014e\u00a8\2\u096d\u096b"+
		"\3\2\2\2\u096d\u096c\3\2\2\2\u096e\u014d\3\2\2\2\u096f\u0970\7\35\2\2"+
		"\u0970\u0971\7-\2\2\u0971\u0972\7\32\2\2\u0972\u0973\7-\2\2\u0973\u0974"+
		"\7\36\2\2\u0974\u014f\3\2\2\2\u0975\u0978\5\u0128\u0095\2\u0976\u0978"+
		"\5\u013e\u00a0\2\u0977\u0975\3\2\2\2\u0977\u0976\3\2\2\2\u0978\u0151\3"+
		"\2\2\2\u0979\u097a\7\35\2\2\u097a\u097b\7\36\2\2\u097b\u0153\3\2\2\2\u097c"+
		"\u097d\t\62\2\2\u097d\u0155\3\2\2\2\u097e\u097f\7\u0143\2\2\u097f\u0985"+
		"\7\31\2\2\u0980\u0981\7\u0144\2\2\u0981\u0985\7\31\2\2\u0982\u0983\7\u0145"+
		"\2\2\u0983\u0985\7\31\2\2\u0984\u097e\3\2\2\2\u0984\u0980\3\2\2\2\u0984"+
		"\u0982\3\2\2\2\u0985\u0157\3\2\2\2\u0986\u0987\t\63\2\2\u0987\u0159\3"+
		"\2\2\2\u013d\u015d\u0160\u0164\u0169\u016d\u0172\u0176\u017f\u0184\u0187"+
		"\u018b\u018e\u0192\u0195\u0197\u019a\u01a0\u01a4\u01a6\u01aa\u01ae\u01b2"+
		"\u01b9\u01bb\u01c2\u01c8\u01cd\u01d0\u01d3\u01d6\u01d9\u01dc\u01e8\u01ec"+
		"\u01f2\u01f5\u01f8\u01fe\u0203\u0207\u020a\u0212\u0214\u0221\u022d\u0232"+
		"\u0235\u0238\u023d\u0243\u0253\u0267\u0270\u0274\u027b\u0280\u0289\u028f"+
		"\u029a\u02a1\u02aa\u02b3\u02bd\u02c2\u02c8\u02cb\u02d1\u02d8\u02dc\u02e2"+
		"\u02e7\u02eb\u02ed\u02f0\u02f4\u02fd\u0302\u0307\u030e\u0317\u031f\u0324"+
		"\u0328\u032e\u0331\u0334\u0338\u033c\u0345\u0349\u034c\u034f\u0354\u035a"+
		"\u035d\u0362\u0365\u0367\u036c\u0378\u0381\u038d\u0390\u0395\u039c\u03a0"+
		"\u03a4\u03a6\u03b4\u03b9\u03c2\u03c8\u03d1\u03d5\u03d9\u03e5\u03ec\u03f1"+
		"\u03f7\u03fa\u03fe\u0409\u040b\u0414\u0420\u0422\u0429\u042e\u0434\u043c"+
		"\u0447\u044b\u0468\u046a\u0472\u0476\u0485\u048c\u049a\u04a6\u04ac\u04b3"+
		"\u04b6\u04d8\u04e0\u04e2\u04e9\u04ee\u04f3\u04fa\u0500\u0505\u050a\u0510"+
		"\u0514\u0519\u051e\u0523\u0528\u052f\u0536\u053d\u0544\u0549\u054e\u0553"+
		"\u0557\u055b\u055f\u0561\u0574\u0578\u057f\u058b\u058e\u0592\u0597\u059c"+
		"\u05a0\u05aa\u05b3\u05b5\u05b8\u05c1\u05c8\u05d5\u05da\u05e1\u05e7\u0601"+
		"\u0620\u0634\u063a\u063e\u0659\u0665\u0672\u0676\u067a\u0696\u06cc\u06d6"+
		"\u06d9\u06e5\u06ea\u06f6\u070a\u070e\u071e\u0721\u0726\u0729\u0732\u0736"+
		"\u073c\u0742\u0746\u0751\u0757\u0759\u0760\u0767\u076b\u0772\u0777\u077b"+
		"\u0780\u0784\u0788\u0795\u0799\u079c\u07a0\u07a4\u07a8\u07ad\u07b1\u07b5"+
		"\u07bb\u07bd\u07c4\u07ca\u07d2\u07e7\u07ec\u07f2\u07f5\u07fa\u07fc\u07ff"+
		"\u0802\u0806\u0809\u080d\u0812\u0815\u0819\u081c\u0820\u0825\u0829\u0835"+
		"\u0839\u083f\u0842\u0847\u084b\u084f\u0854\u085d\u0860\u0864\u0868\u086b"+
		"\u086f\u0873\u0878\u087d\u0882\u0887\u088c\u088e\u0893\u089a\u08a2\u08a8"+
		"\u08aa\u08ae\u08b2\u08b6\u08ba\u08c7\u08cc\u08d8\u08de\u08e6\u08ec\u08fb"+
		"\u0905\u090c\u0913\u091f\u0924\u0937\u093a\u0942\u0949\u094e\u0951\u0955"+
		"\u095a\u0969\u096d\u0977\u0984";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}