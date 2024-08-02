parser grammar SQLSelectParser;

options {
    tokenVocab = SQLSelectLexer;
}

query:
    withClause? selectStatement (SEMICOLON_SYMBOL EOF? | EOF)
;

values:
    (expr | DEFAULT_SYMBOL) (COMMA_SYMBOL (expr | DEFAULT_SYMBOL))*
;
selectStatement:
    queryExpression lockingClauseList?
    | queryExpressionParens
    | selectStatementWithInto
;

selectStatementWithInto:
    OPEN_PAR_SYMBOL selectStatementWithInto CLOSE_PAR_SYMBOL
    | queryExpression intoClause lockingClauseList?
	| lockingClauseList intoClause
;

queryExpression:
    (withClause)? (
        queryExpressionBody orderClause? limitClause?
        | queryExpressionParens orderClause? limitClause?
    ) (procedureAnalyseClause)?
;

queryExpressionBody:
    (
        queryPrimary
        | queryExpressionParens UNION_SYMBOL unionOption? (
            queryPrimary
            | queryExpressionParens
        )
    ) (UNION_SYMBOL unionOption? ( queryPrimary | queryExpressionParens))*
;

queryExpressionParens:
    OPEN_PAR_SYMBOL (
        queryExpressionParens
        | queryExpression lockingClauseList?
    ) CLOSE_PAR_SYMBOL
;

queryPrimary:
    querySpecification
    | tableValueConstructor
    | explicitTable
;

querySpecification:
    SELECT_SYMBOL selectOption* selectItemList intoClause? fromClause? whereClause? unpivotClause* qualifyClause? groupByClause? havingClause? (
        windowClause
    )?
;

subquery:
    query | queryExpressionParens
;

querySpecOption:
    ALL_SYMBOL
    | DISTINCT_SYMBOL ON_SYMBOL OPEN_PAR_SYMBOL qualifiedIdentifier CLOSE_PAR_SYMBOL
    | DISTINCT_SYMBOL
    | STRAIGHT_JOIN_SYMBOL
    | HIGH_PRIORITY_SYMBOL
    | SQL_SMALL_RESULT_SYMBOL
    | SQL_BIG_RESULT_SYMBOL
    | SQL_BUFFER_RESULT_SYMBOL
    | SQL_CALC_FOUND_ROWS_SYMBOL
;

limitClause:
    LIMIT_SYMBOL limitOptions
;

limitOptions:
    limitOption ((COMMA_SYMBOL | OFFSET_SYMBOL) limitOption)?
;

limitOption:
    identifier
    | (PARAM_MARKER | INT_NUMBER)
;

intoClause:
    INTO_SYMBOL (
        OUTFILE_SYMBOL textStringLiteral charsetClause? fieldsClause? linesClause?
        | DUMPFILE_SYMBOL textStringLiteral
        | (textOrIdentifier | userVariable) (
            COMMA_SYMBOL (textOrIdentifier | userVariable)
        )*
    )
;

procedureAnalyseClause:
    PROCEDURE_SYMBOL ANALYSE_SYMBOL OPEN_PAR_SYMBOL (
        INT_NUMBER (COMMA_SYMBOL INT_NUMBER)?
    )? CLOSE_PAR_SYMBOL
;

havingClause:
    HAVING_SYMBOL expr
;

windowClause:
    WINDOW_SYMBOL windowDefinition (COMMA_SYMBOL windowDefinition)*
;

windowDefinition:
    identifier AS_SYMBOL windowSpec
;

windowSpec:
    OPEN_PAR_SYMBOL windowSpecDetails CLOSE_PAR_SYMBOL
;

windowSpecDetails:
    identifier? (PARTITION_SYMBOL BY_SYMBOL orderList)? orderClause? windowFrameClause?
;

windowFrameClause:
    windowFrameUnits windowFrameExtent windowFrameExclusion?
;

windowFrameUnits:
    ROWS_SYMBOL
    | RANGE_SYMBOL
    | GROUPS_SYMBOL
;

windowFrameExtent:
    windowFrameStart
    | windowFrameBetween
;

windowFrameStart:
    UNBOUNDED_SYMBOL PRECEDING_SYMBOL
    | ulonglong_number PRECEDING_SYMBOL
    | PARAM_MARKER PRECEDING_SYMBOL
    | INTERVAL_SYMBOL expr interval PRECEDING_SYMBOL
    | CURRENT_SYMBOL ROW_SYMBOL
;

windowFrameBetween:
    BETWEEN_SYMBOL windowFrameBound AND_SYMBOL windowFrameBound
;

windowFrameBound:
    windowFrameStart
    | UNBOUNDED_SYMBOL FOLLOWING_SYMBOL
    | ulonglong_number FOLLOWING_SYMBOL
    | PARAM_MARKER FOLLOWING_SYMBOL
    | INTERVAL_SYMBOL expr interval FOLLOWING_SYMBOL
;

windowFrameExclusion:
    EXCLUDE_SYMBOL (
        CURRENT_SYMBOL ROW_SYMBOL
        | GROUP_SYMBOL
        | TIES_SYMBOL
        | NO_SYMBOL OTHERS_SYMBOL
    )
;

withClause:
    WITH_SYMBOL RECURSIVE_SYMBOL? commonTableExpression (
        COMMA_SYMBOL commonTableExpression
    )*
;

commonTableExpression:
    identifier columnInternalRefList? AS_SYMBOL subquery
;

groupByClause:
    GROUP_SYMBOL BY_SYMBOL orderList olapOption?
;

olapOption:
    WITH_SYMBOL ROLLUP_SYMBOL
    | WITH_SYMBOL CUBE_SYMBOL
;

orderClause:
    ORDER_SYMBOL BY_SYMBOL orderList nullsOrder? 
;

direction:
    ASC_SYMBOL
    | DESC_SYMBOL
;

fromClause:
    FROM_SYMBOL (DUAL_SYMBOL | tableReferenceList)
;

tableReferenceList:
    tableReference (COMMA_SYMBOL tableReference)*
;

tableValueConstructor:
    VALUES_SYMBOL rowValueExplicit (COMMA_SYMBOL rowValueExplicit)*
;

explicitTable:
    TABLE_SYMBOL qualifiedIdentifier
;

rowValueExplicit:
    ROW_SYMBOL OPEN_PAR_SYMBOL values? CLOSE_PAR_SYMBOL
;

selectOption:
    querySpecOption
    | SQL_NO_CACHE_SYMBOL
    | SQL_CACHE_SYMBOL
    | MAX_STATEMENT_TIME_SYMBOL EQUAL_OPERATOR real_ulong_number
;

lockingClauseList:
    lockingClause+
;

lockingClause:
    FOR_SYMBOL lockStrengh (OF_SYMBOL tableAliasRefList)? (
        lockedRowAction
    )?
    | LOCK_SYMBOL IN_SYMBOL SHARE_SYMBOL MODE_SYMBOL
;

lockStrengh:
    UPDATE_SYMBOL
    | SHARE_SYMBOL
;

lockedRowAction:
    SKIP_SYMBOL LOCKED_SYMBOL
    | NOWAIT_SYMBOL
;

selectItemList: (selectItem | MULT_OPERATOR) (COMMA_SYMBOL selectItem)*
;

selectItem:
    (qualifiedIdentifier | jsonPathIdentifier) selectAlias?
    | expr selectAlias?
;

selectAlias:
    AS_SYMBOL? (identifier | textStringLiteral)
;

whereClause:
    WHERE_SYMBOL expr
;

qualifyClause:
    QUALIFY_SYMBOL expr
;

tableReference: ( 
        tableFactor
        | OPEN_CURLY_SYMBOL (identifier | OJ_SYMBOL) escapedTableReference CLOSE_CURLY_SYMBOL 
    ) joinedTable*
;

escapedTableReference:
    tableFactor joinedTable*
;

joinedTable:
    innerJoinType tableReference (
        ON_SYMBOL expr
        | USING_SYMBOL identifierListWithParentheses
    )?
    | outerJoinType tableReference (
        ON_SYMBOL expr
        | USING_SYMBOL identifierListWithParentheses
    )
    | naturalJoinType tableFactor
;

naturalJoinType:
    NATURAL_SYMBOL INNER_SYMBOL? JOIN_SYMBOL
    | NATURAL_SYMBOL (LEFT_SYMBOL | RIGHT_SYMBOL) OUTER_SYMBOL? JOIN_SYMBOL
;

innerJoinType:
    (INNER_SYMBOL | CROSS_SYMBOL)? JOIN_SYMBOL
    | STRAIGHT_JOIN_SYMBOL
;

outerJoinType:
    (LEFT_SYMBOL | RIGHT_SYMBOL) OUTER_SYMBOL? JOIN_SYMBOL
;

tableFactor:
    singleTable
    | singleTableParens
    | derivedTable
    | tableReferenceListParens
    | tableFunction
;

singleTable:
    qualifiedIdentifier usePartition? tableAlias? indexHintList?
;

singleTableParens:
    OPEN_PAR_SYMBOL (singleTable | singleTableParens) CLOSE_PAR_SYMBOL
;

derivedTable:
    subquery tableAlias? (columnInternalRefList)?
    | LATERAL_SYMBOL subquery tableAlias? columnInternalRefList?
;

tableReferenceListParens:
    OPEN_PAR_SYMBOL (tableReferenceList | tableReferenceListParens) CLOSE_PAR_SYMBOL
;

tableFunction:
    JSON_TABLE_SYMBOL OPEN_PAR_SYMBOL expr COMMA_SYMBOL textStringLiteral columnsClause CLOSE_PAR_SYMBOL tableAlias?
;

columnsClause:
    COLUMNS_SYMBOL OPEN_PAR_SYMBOL jtColumn (COMMA_SYMBOL jtColumn)* CLOSE_PAR_SYMBOL
;

jtColumn:
    identifier FOR_SYMBOL ORDINALITY_SYMBOL
    | identifier dataType (collate)? EXISTS_SYMBOL? PATH_SYMBOL textStringLiteral onEmptyOrError?
    | NESTED_SYMBOL PATH_SYMBOL textStringLiteral columnsClause
;

onEmptyOrError:
    onEmpty onError?
    | onError onEmpty?
;

onEmpty:
    jtOnResponse ON_SYMBOL EMPTY_SYMBOL
;

onError:
    jtOnResponse ON_SYMBOL ERROR_SYMBOL
;

jtOnResponse:
    ERROR_SYMBOL
    | NULL_SYMBOL
    | DEFAULT_SYMBOL textStringLiteral
;

unionOption:
    DISTINCT_SYMBOL
    | ALL_SYMBOL
;

tableAlias:
    (AS_SYMBOL | EQUAL_OPERATOR)? identifier
;

indexHintList:
    indexHint (COMMA_SYMBOL indexHint)*
;

indexHint:
    indexHintType keyOrIndex indexHintClause? OPEN_PAR_SYMBOL indexList CLOSE_PAR_SYMBOL
    | USE_SYMBOL keyOrIndex indexHintClause? OPEN_PAR_SYMBOL indexList? CLOSE_PAR_SYMBOL
;

indexHintType:
    FORCE_SYMBOL
    | IGNORE_SYMBOL
;

keyOrIndex:
    KEY_SYMBOL
    | INDEX_SYMBOL
;

indexHintClause:
    FOR_SYMBOL (JOIN_SYMBOL | ORDER_SYMBOL BY_SYMBOL | GROUP_SYMBOL BY_SYMBOL)
;

indexList:
    indexListElement (COMMA_SYMBOL indexListElement)*
;

indexListElement:
    identifier
    | PRIMARY_SYMBOL
;

//----------------- Expression support ---------------------------------------------------------------------------------

expr:
    boolPri (IS_SYMBOL notRule? (TRUE_SYMBOL | FALSE_SYMBOL | UNKNOWN_SYMBOL))? 
    | NOT_SYMBOL expr
    | expr (AND_SYMBOL | LOGICAL_AND_OPERATOR) expr 
    | expr XOR_SYMBOL expr
    | expr (OR_SYMBOL | LOGICAL_OR_OPERATOR) expr                              
;

boolPri:
    predicate
    | boolPri IS_SYMBOL notRule? NULL_SYMBOL 
    | boolPri compOp predicate
    | boolPri compOp (ALL_SYMBOL | ANY_SYMBOL) subquery
;

compOp:
    EQUAL_OPERATOR
    | NULL_SAFE_EQUAL_OPERATOR
    | GREATER_OR_EQUAL_OPERATOR
    | GREATER_THAN_OPERATOR
    | LESS_OR_EQUAL_OPERATOR
    | LESS_THAN_OPERATOR
    | NOT_EQUAL_OPERATOR
;

predicate:
    bitExpr (
        notRule? predicateOperations
        | MEMBER_SYMBOL OF_SYMBOL? simpleExprWithParentheses
        | SOUNDS_SYMBOL LIKE_SYMBOL bitExpr
        | nullTreatment
    )?
;

predicateOperations:
    IN_SYMBOL (subquery | OPEN_PAR_SYMBOL exprList CLOSE_PAR_SYMBOL)
    | BETWEEN_SYMBOL bitExpr AND_SYMBOL predicate                   
    | LIKE_SYMBOL simpleExpr (ESCAPE_SYMBOL simpleExpr)?            
    | REGEXP_SYMBOL bitExpr                                         
;

bitExpr:
    bitExpr BITWISE_XOR_OPERATOR bitExpr
    | bitExpr (
        MULT_OPERATOR
        | DIV_OPERATOR
        | MOD_OPERATOR
        | DIV_SYMBOL
        | MOD_SYMBOL
        | PLUS_OPERATOR
        | MINUS_OPERATOR
    ) bitExpr
    | bitExpr (PLUS_OPERATOR | MINUS_OPERATOR) INTERVAL_SYMBOL ((expr interval) | SINGLE_QUOTED_TEXT)
    | bitExpr (SHIFT_LEFT_OPERATOR | SHIFT_RIGHT_OPERATOR) bitExpr
    | bitExpr BITWISE_AND_OPERATOR bitExpr
    | bitExpr BITWISE_OR_OPERATOR bitExpr
    | simpleExpr
;

simpleExpr:
    variable (equal expr)?                                                                              
    | qualifiedIdentifier jsonOperator?                                                                 
    | runtimeFunctionCall                                                                               
    | functionCall                                                                                      
    | simpleExpr COLLATE_SYMBOL textOrIdentifier                                                        
    | literal                                                                                           
    | PARAM_MARKER                                                                                      
    | sumExpr                                                                                           
    | groupingOperation                                                                                 
    | windowFunctionCall                                                                                
    | simpleExpr LOGICAL_OR_OPERATOR simpleExpr                                                         
    | (PLUS_OPERATOR | MINUS_OPERATOR | BITWISE_NOT_OPERATOR) simpleExpr                           
    | not2Rule simpleExpr                                                                               
    | ROW_SYMBOL? OPEN_PAR_SYMBOL exprList CLOSE_PAR_SYMBOL                                             
    | EXISTS_SYMBOL? subquery                                                                           
    | OPEN_CURLY_SYMBOL identifier expr CLOSE_CURLY_SYMBOL                                              
    | MATCH_SYMBOL identListArg AGAINST_SYMBOL OPEN_PAR_SYMBOL bitExpr fulltextOptions? CLOSE_PAR_SYMBOL
    | BINARY_SYMBOL simpleExpr                                                                          
    | CAST_SYMBOL OPEN_PAR_SYMBOL expr AS_SYMBOL dataType ARRAY_SYMBOL? CLOSE_PAR_SYMBOL      
    | simpleExpr CAST_COLON_SYMBOL dataType     
    | CASE_SYMBOL expr? (whenExpression thenExpression)+ elseExpression? END_SYMBOL                     
    | CONVERT_SYMBOL OPEN_PAR_SYMBOL expr COMMA_SYMBOL dataType CLOSE_PAR_SYMBOL                        
    | CONVERT_SYMBOL OPEN_PAR_SYMBOL expr USING_SYMBOL charsetName CLOSE_PAR_SYMBOL                     
    | DEFAULT_SYMBOL OPEN_PAR_SYMBOL qualifiedIdentifier CLOSE_PAR_SYMBOL                               
    | VALUES_SYMBOL OPEN_PAR_SYMBOL qualifiedIdentifier CLOSE_PAR_SYMBOL                                
    | INTERVAL_SYMBOL expr interval PLUS_OPERATOR expr
    | jsonPathIdentifier
;

jsonOperator:
    (JSON_SEPARATOR_SYMBOL | JSON_UNQUOTED_SEPARATOR_SYMBOL) (textStringLiteral | expr)
;

sumExpr:
    AVG_SYMBOL OPEN_PAR_SYMBOL DISTINCT_SYMBOL? inSumExpr CLOSE_PAR_SYMBOL (
        windowingClause
    )?
    | (BIT_AND_SYMBOL | BIT_OR_SYMBOL | BIT_XOR_SYMBOL) OPEN_PAR_SYMBOL inSumExpr CLOSE_PAR_SYMBOL (
        windowingClause
    )?
    | jsonFunction
    | COUNT_SYMBOL OPEN_PAR_SYMBOL ALL_SYMBOL? MULT_OPERATOR CLOSE_PAR_SYMBOL (
        windowingClause
    )?
    | COUNT_SYMBOL OPEN_PAR_SYMBOL (
        ALL_SYMBOL? MULT_OPERATOR
        | inSumExpr
        | DISTINCT_SYMBOL exprList
    ) CLOSE_PAR_SYMBOL (windowingClause)?
    | MIN_SYMBOL OPEN_PAR_SYMBOL DISTINCT_SYMBOL? inSumExpr CLOSE_PAR_SYMBOL (
        windowingClause
    )?
    | MAX_SYMBOL OPEN_PAR_SYMBOL DISTINCT_SYMBOL? inSumExpr CLOSE_PAR_SYMBOL (
        windowingClause
    )?
    | STD_SYMBOL OPEN_PAR_SYMBOL inSumExpr CLOSE_PAR_SYMBOL (
        windowingClause
    )?
    | VARIANCE_SYMBOL OPEN_PAR_SYMBOL inSumExpr CLOSE_PAR_SYMBOL (
        windowingClause
    )?
    | STDDEV_SAMP_SYMBOL OPEN_PAR_SYMBOL inSumExpr CLOSE_PAR_SYMBOL (
        windowingClause
    )?
    | VAR_SAMP_SYMBOL OPEN_PAR_SYMBOL inSumExpr CLOSE_PAR_SYMBOL (
        windowingClause
    )?
    | SUM_SYMBOL OPEN_PAR_SYMBOL DISTINCT_SYMBOL? inSumExpr CLOSE_PAR_SYMBOL (
        windowingClause
    )?
    | GROUP_CONCAT_SYMBOL OPEN_PAR_SYMBOL DISTINCT_SYMBOL? exprList orderClause? (
        SEPARATOR_SYMBOL textString
    )? CLOSE_PAR_SYMBOL (windowingClause)?
;

groupingOperation:
    GROUPING_SYMBOL OPEN_PAR_SYMBOL exprList CLOSE_PAR_SYMBOL
;

windowFunctionCall:
    (
        ROW_NUMBER_SYMBOL
        | RANK_SYMBOL
        | DENSE_RANK_SYMBOL
        | CUME_DIST_SYMBOL
        | PERCENT_RANK_SYMBOL
    ) parentheses windowingClause
    | NTILE_SYMBOL simpleExprWithParentheses windowingClause
    | (LEAD_SYMBOL | LAG_SYMBOL) OPEN_PAR_SYMBOL expr leadLagInfo? CLOSE_PAR_SYMBOL nullTreatment? windowingClause
    | (FIRST_VALUE_SYMBOL | LAST_VALUE_SYMBOL) exprWithParentheses nullTreatment? windowingClause
    | NTH_VALUE_SYMBOL OPEN_PAR_SYMBOL expr COMMA_SYMBOL simpleExpr CLOSE_PAR_SYMBOL (
        FROM_SYMBOL (FIRST_SYMBOL | LAST_SYMBOL)
    )? nullTreatment? windowingClause
;

windowingClause:
    OVER_SYMBOL (identifier | windowSpec)
;

leadLagInfo:
    COMMA_SYMBOL (ulonglong_number | PARAM_MARKER) (COMMA_SYMBOL expr)?
;

nullTreatment:
    (RESPECT_SYMBOL | IGNORE_SYMBOL) NULLS_SYMBOL
;

jsonFunction:
    JSON_ARRAYAGG_SYMBOL OPEN_PAR_SYMBOL inSumExpr CLOSE_PAR_SYMBOL windowingClause?
    | JSON_OBJECTAGG_SYMBOL OPEN_PAR_SYMBOL inSumExpr COMMA_SYMBOL inSumExpr CLOSE_PAR_SYMBOL windowingClause?
;

inSumExpr:
    ALL_SYMBOL? expr
;

identListArg:
    identList
    | OPEN_PAR_SYMBOL identList CLOSE_PAR_SYMBOL
;

identList:
    qualifiedIdentifier (COMMA_SYMBOL qualifiedIdentifier)*
;

fulltextOptions:
    IN_SYMBOL BOOLEAN_SYMBOL MODE_SYMBOL
    | IN_SYMBOL NATURAL_SYMBOL LANGUAGE_SYMBOL MODE_SYMBOL (
        WITH_SYMBOL QUERY_SYMBOL EXPANSION_SYMBOL
    )?
    | WITH_SYMBOL QUERY_SYMBOL EXPANSION_SYMBOL
;

runtimeFunctionCall:
    // Function names that are keywords.
    CHAR_SYMBOL OPEN_PAR_SYMBOL exprList (USING_SYMBOL charsetName)? CLOSE_PAR_SYMBOL
    | CURRENT_USER_SYMBOL parentheses?
    | DATE_SYMBOL exprWithParentheses
    | DAY_SYMBOL exprWithParentheses
    | HOUR_SYMBOL exprWithParentheses
    | INSERT_SYMBOL OPEN_PAR_SYMBOL expr COMMA_SYMBOL expr COMMA_SYMBOL expr COMMA_SYMBOL expr CLOSE_PAR_SYMBOL
    | INTERVAL_SYMBOL OPEN_PAR_SYMBOL expr (COMMA_SYMBOL expr)+ CLOSE_PAR_SYMBOL
    | LEFT_SYMBOL OPEN_PAR_SYMBOL expr COMMA_SYMBOL expr CLOSE_PAR_SYMBOL
    | MINUTE_SYMBOL exprWithParentheses
    | MONTH_SYMBOL exprWithParentheses
    | RIGHT_SYMBOL OPEN_PAR_SYMBOL expr COMMA_SYMBOL expr CLOSE_PAR_SYMBOL
    | SECOND_SYMBOL exprWithParentheses
    | TIME_SYMBOL exprWithParentheses
    | TIMESTAMP_SYMBOL OPEN_PAR_SYMBOL expr (COMMA_SYMBOL expr)? CLOSE_PAR_SYMBOL
    | trimFunction
    | USER_SYMBOL parentheses
    | VALUES_SYMBOL exprWithParentheses
    | YEAR_SYMBOL exprWithParentheses

    // Function names that are not keywords.
    | (ADDDATE_SYMBOL | SUBDATE_SYMBOL) OPEN_PAR_SYMBOL expr COMMA_SYMBOL (
        expr
        | INTERVAL_SYMBOL expr interval
    ) CLOSE_PAR_SYMBOL
    | CURDATE_SYMBOL parentheses?
    | CURTIME_SYMBOL timeFunctionParameters?
    | (DATE_ADD_SYMBOL | DATE_SUB_SYMBOL) OPEN_PAR_SYMBOL expr COMMA_SYMBOL INTERVAL_SYMBOL expr interval CLOSE_PAR_SYMBOL
    | EXTRACT_SYMBOL OPEN_PAR_SYMBOL interval FROM_SYMBOL expr CLOSE_PAR_SYMBOL
    | GET_FORMAT_SYMBOL OPEN_PAR_SYMBOL dateTimeTtype COMMA_SYMBOL expr CLOSE_PAR_SYMBOL
    | NOW_SYMBOL timeFunctionParameters?
    | POSITION_SYMBOL OPEN_PAR_SYMBOL bitExpr IN_SYMBOL expr CLOSE_PAR_SYMBOL
    | substringFunction
    | SYSDATE_SYMBOL timeFunctionParameters?
    | (TIMESTAMP_ADD_SYMBOL | TIMESTAMP_DIFF_SYMBOL) OPEN_PAR_SYMBOL intervalTimeStamp COMMA_SYMBOL expr COMMA_SYMBOL expr
        CLOSE_PAR_SYMBOL
    | UTC_DATE_SYMBOL parentheses?
    | UTC_TIME_SYMBOL timeFunctionParameters?
    | UTC_TIMESTAMP_SYMBOL timeFunctionParameters?

    // Function calls with other conflicts.
    | ASCII_SYMBOL exprWithParentheses
    | CHARSET_SYMBOL exprWithParentheses
    | COALESCE_SYMBOL exprListWithParentheses
    | COLLATION_SYMBOL exprWithParentheses
    | DATABASE_SYMBOL parentheses
    | IF_SYMBOL OPEN_PAR_SYMBOL expr COMMA_SYMBOL expr COMMA_SYMBOL expr CLOSE_PAR_SYMBOL
    | FORMAT_SYMBOL OPEN_PAR_SYMBOL expr COMMA_SYMBOL expr (COMMA_SYMBOL expr)? CLOSE_PAR_SYMBOL
    | MICROSECOND_SYMBOL exprWithParentheses
    | MOD_SYMBOL OPEN_PAR_SYMBOL expr COMMA_SYMBOL expr CLOSE_PAR_SYMBOL
    | OLD_PASSWORD_SYMBOL OPEN_PAR_SYMBOL textLiteral CLOSE_PAR_SYMBOL
    | PASSWORD_SYMBOL exprWithParentheses
    | QUARTER_SYMBOL exprWithParentheses
    | REPEAT_SYMBOL OPEN_PAR_SYMBOL expr COMMA_SYMBOL expr CLOSE_PAR_SYMBOL
    | REPLACE_SYMBOL OPEN_PAR_SYMBOL expr COMMA_SYMBOL expr COMMA_SYMBOL expr CLOSE_PAR_SYMBOL
    | REVERSE_SYMBOL exprWithParentheses
    | ROW_COUNT_SYMBOL parentheses
    | TRUNCATE_SYMBOL OPEN_PAR_SYMBOL expr COMMA_SYMBOL expr CLOSE_PAR_SYMBOL
    | WEEK_SYMBOL OPEN_PAR_SYMBOL expr (COMMA_SYMBOL expr)? CLOSE_PAR_SYMBOL
    | WEIGHT_STRING_SYMBOL OPEN_PAR_SYMBOL expr (
        (AS_SYMBOL CHAR_SYMBOL wsNumCodepoints)? (
            weightStringLevels
        )?
        | AS_SYMBOL BINARY_SYMBOL wsNumCodepoints
        | COMMA_SYMBOL ulong_number COMMA_SYMBOL ulong_number COMMA_SYMBOL ulong_number
    ) CLOSE_PAR_SYMBOL
    | geometryFunction
;

geometryFunction:
    CONTAINS_SYMBOL OPEN_PAR_SYMBOL expr COMMA_SYMBOL expr CLOSE_PAR_SYMBOL
    | GEOMETRYCOLLECTION_SYMBOL OPEN_PAR_SYMBOL exprList? CLOSE_PAR_SYMBOL
    | LINESTRING_SYMBOL exprListWithParentheses
    | MULTILINESTRING_SYMBOL exprListWithParentheses
    | MULTIPOINT_SYMBOL exprListWithParentheses
    | MULTIPOLYGON_SYMBOL exprListWithParentheses
    | POINT_SYMBOL OPEN_PAR_SYMBOL expr COMMA_SYMBOL expr CLOSE_PAR_SYMBOL
    | POLYGON_SYMBOL exprListWithParentheses
;

timeFunctionParameters:
    OPEN_PAR_SYMBOL fractionalPrecision? CLOSE_PAR_SYMBOL
;

fractionalPrecision:
    INT_NUMBER
;

weightStringLevels:
    LEVEL_SYMBOL (
        real_ulong_number MINUS_OPERATOR real_ulong_number
        | weightStringLevelListItem (COMMA_SYMBOL weightStringLevelListItem)*
    )
;

weightStringLevelListItem:
    real_ulong_number ((ASC_SYMBOL | DESC_SYMBOL) REVERSE_SYMBOL? | REVERSE_SYMBOL)?
;

dateTimeTtype:
    DATE_SYMBOL
    | TIME_SYMBOL
    | DATETIME_SYMBOL
    | TIMESTAMP_SYMBOL
;

trimFunction:
    TRIM_SYMBOL OPEN_PAR_SYMBOL (
        expr (FROM_SYMBOL expr)?
        | LEADING_SYMBOL expr? FROM_SYMBOL expr
        | TRAILING_SYMBOL expr? FROM_SYMBOL expr
        | BOTH_SYMBOL expr? FROM_SYMBOL expr
    ) CLOSE_PAR_SYMBOL
;

substringFunction:
    SUBSTRING_SYMBOL OPEN_PAR_SYMBOL expr (
        COMMA_SYMBOL expr (COMMA_SYMBOL expr)?
        | FROM_SYMBOL expr (FOR_SYMBOL expr)?
    ) CLOSE_PAR_SYMBOL
;

functionCall:
    pureIdentifier OPEN_PAR_SYMBOL udfExprList? CLOSE_PAR_SYMBOL // For both UDF + other functions.
    | qualifiedIdentifier OPEN_PAR_SYMBOL (exprList? | selectItem?) CLOSE_PAR_SYMBOL // Other functions only.
;

udfExprList:
    udfExpr (COMMA_SYMBOL udfExpr)*
;

udfExpr:
    expr qualifiedIdentifier? selectAlias?
;

unpivotClause:
    UNPIVOT_SYMBOL OPEN_PAR_SYMBOL identifier (FOR_SYMBOL identifier)? IN_SYMBOL identifierListWithParentheses CLOSE_PAR_SYMBOL whereClause*
;

variable:
    userVariable
    | systemVariable
;

userVariable:
    AT_SIGN_SYMBOL textOrIdentifier
    | AT_TEXT_SUFFIX
;

systemVariable:
    AT_AT_SIGN_SYMBOL varIdentType? textOrIdentifier dotIdentifier?
;

whenExpression:
    WHEN_SYMBOL expr
;

thenExpression:
    THEN_SYMBOL expr
;

elseExpression:
    ELSE_SYMBOL expr
;

exprList:
    expr (COMMA_SYMBOL expr)*
;

charset:
    CHAR_SYMBOL SET_SYMBOL
    | CHARSET_SYMBOL
;

notRule:
    NOT_SYMBOL
;

not2Rule:
    LOGICAL_NOT_OPERATOR
;

interval:
    intervalTimeStamp
    | (
        SECOND_MICROSECOND_SYMBOL
        | MINUTE_MICROSECOND_SYMBOL
        | MINUTE_SECOND_SYMBOL
        | HOUR_MICROSECOND_SYMBOL
        | HOUR_SECOND_SYMBOL
        | HOUR_MINUTE_SYMBOL
        | DAY_MICROSECOND_SYMBOL
        | DAY_SECOND_SYMBOL
        | DAY_MINUTE_SYMBOL
        | DAY_HOUR_SYMBOL
        | YEAR_MONTH_SYMBOL
    )
;

intervalTimeStamp:
    MICROSECOND_SYMBOL
    | SECOND_SYMBOL
    | MINUTE_SYMBOL
    | HOUR_SYMBOL
    | DAY_SYMBOL
    | WEEK_SYMBOL
    | MONTH_SYMBOL
    | QUARTER_SYMBOL
    | YEAR_SYMBOL
;

exprListWithParentheses:
    OPEN_PAR_SYMBOL exprList CLOSE_PAR_SYMBOL
;

exprWithParentheses:
    OPEN_PAR_SYMBOL expr CLOSE_PAR_SYMBOL
;

simpleExprWithParentheses:
    OPEN_PAR_SYMBOL simpleExpr CLOSE_PAR_SYMBOL
;

orderList:
    orderExpression (COMMA_SYMBOL orderExpression)*
;

nullsOrder:
    NULLS_SYMBOL (FIRST_SYMBOL | LAST_SYMBOL)
;

orderExpression:
    expr direction?
;

indexType:
    (BTREE_SYMBOL | RTREE_SYMBOL | HASH_SYMBOL)
;

dataType:
    (
        INT_SYMBOL
        | BYTE_INT_SYMBOL
        | TINYINT_SYMBOL
        | SMALLINT_SYMBOL
        | MEDIUMINT_SYMBOL
        | BIGINT_SYMBOL
        | DECIMAL_SYMBOL
        | NUMERIC_SYMBOL
        | NUMBER_SYMBOL
    ) fieldLength? fieldOptions?
    | (REAL_SYMBOL | DOUBLE_SYMBOL PRECISION_SYMBOL?) precision? fieldOptions?
    | (FLOAT_SYMBOL_4 | FLOAT_SYMBOL_8 | FLOAT_SYMBOL | DECIMAL_SYMBOL | NUMERIC_SYMBOL | FIXED_SYMBOL) floatOptions? fieldOptions?
    | BIT_SYMBOL fieldLength?
    | (BOOL_SYMBOL | BOOLEAN_SYMBOL)
    | nchar fieldLength? BINARY_SYMBOL?
    | BINARY_SYMBOL fieldLength?
    | CHAR_SYMBOL VARYING_SYMBOL
    | (VARCHAR_SYMBOL | VARCHAR2_SYMBOL | CHAR_SYMBOL | STRING_SYMBOL | TEXT_SYMBOL) fieldLength charsetWithOptBinary?
    | (
        NATIONAL_SYMBOL VARCHAR_SYMBOL
        | NVARCHAR2_SYMBOL
        | NVARCHAR_SYMBOL
        | NCHAR_SYMBOL VARCHAR2_SYMBOL 
        | NCHAR_SYMBOL VARCHAR_SYMBOL
        | NATIONAL_SYMBOL CHAR_SYMBOL VARYING_SYMBOL
        | NCHAR_SYMBOL VARYING_SYMBOL
    ) fieldLength BINARY_SYMBOL?
    | VARBINARY_SYMBOL fieldLength
    | YEAR_SYMBOL fieldLength? fieldOptions?
    | DATE_SYMBOL
    | TIME_SYMBOL typeDatetimePrecision?
    | TIMESTAMP_SYMBOL typeDatetimePrecision?
    | TIMESTAMP_NTZ_SYMBOL typeDatetimePrecision?
    | TIMESTAMP_LTZ_SYMBOL typeDatetimePrecision?
    | TIMESTAMP_SYMBOL WITH_SYMBOL LOCAL_SYMBOL TIME_SYMBOL ZONE_SYMBOL typeDatetimePrecision?
    | TIMESTAMP_SYMBOL WITHOUT_SYMBOL LOCAL_SYMBOL TIME_SYMBOL ZONE_SYMBOL typeDatetimePrecision?
    | TIMESTAMP_SYMBOL WITH_SYMBOL TIME_SYMBOL ZONE_SYMBOL typeDatetimePrecision?
    | DATETIME_SYMBOL typeDatetimePrecision?
    | TINYBLOB_SYMBOL
    | (BLOB_SYMBOL | CLOB_SYMBOL | BFILE_SYMBOL | LONG_SYMBOL RAW_SYMBOL | RAW_SYMBOL) fieldLength?
    | (MEDIUMBLOB_SYMBOL | LONGBLOB_SYMBOL)
    | LONG_SYMBOL VARBINARY_SYMBOL
    | LONG_SYMBOL (CHAR_SYMBOL VARYING_SYMBOL | VARCHAR_SYMBOL | VARCHAR2_SYMBOL)? charsetWithOptBinary?
    | TINYTEXT_SYMBOL charsetWithOptBinary?
    | TEXT_SYMBOL fieldLength? charsetWithOptBinary?
    | MEDIUMTEXT_SYMBOL charsetWithOptBinary?
    | LONGTEXT_SYMBOL charsetWithOptBinary?
    | ENUM_SYMBOL stringList charsetWithOptBinary?
    | SET_SYMBOL stringList charsetWithOptBinary?
    | SERIAL_SYMBOL
    | JSON_SYMBOL
    | (
        GEOMETRY_SYMBOL
        | GEOMETRYCOLLECTION_SYMBOL
        | POINT_SYMBOL
        | MULTIPOINT_SYMBOL
        | LINESTRING_SYMBOL
        | MULTILINESTRING_SYMBOL
        | POLYGON_SYMBOL
        | MULTIPOLYGON_SYMBOL
    )
    | GEOGRAPHY_SYMBOL
    | VARIANT_SYMBOL
    | OBJECT_SYMBOL
    | ARRAY_SYMBOL
    | ENUM_SYMBOL (expr (COMMA_SYMBOL expr)*)?
    | SET_SYMBOL (expr (COMMA_SYMBOL expr)*)?
    | identifier precision?
;

nchar:
    NCHAR_SYMBOL
    | NATIONAL_SYMBOL CHAR_SYMBOL
;

fieldLength:
    OPEN_PAR_SYMBOL (real_ulonglong_number | DECIMAL_NUMBER) CHAR_SYMBOL? CLOSE_PAR_SYMBOL
;

fieldOptions: (SIGNED_SYMBOL | UNSIGNED_SYMBOL | ZEROFILL_SYMBOL)+
;

charsetWithOptBinary:
    ascii
    | unicode
    | BYTE_SYMBOL
    | charset charsetName BINARY_SYMBOL?
    | BINARY_SYMBOL (charset charsetName)?
;

ascii:
    ASCII_SYMBOL BINARY_SYMBOL?
    | BINARY_SYMBOL ASCII_SYMBOL
;

unicode:
    UNICODE_SYMBOL BINARY_SYMBOL?
    | BINARY_SYMBOL UNICODE_SYMBOL
;

wsNumCodepoints:
    OPEN_PAR_SYMBOL real_ulong_number CLOSE_PAR_SYMBOL
;

typeDatetimePrecision:
    OPEN_PAR_SYMBOL INT_NUMBER CLOSE_PAR_SYMBOL
;

charsetName:
    textOrIdentifier
    | BINARY_SYMBOL
    | DEFAULT_SYMBOL
;

collationName:
    textOrIdentifier
    | DEFAULT_SYMBOL
    | BINARY_SYMBOL
;

collate:
    COLLATE_SYMBOL collationName
;

charsetClause:
    charset charsetName
;

fieldsClause:
    COLUMNS_SYMBOL fieldTerm+
;

fieldTerm:
    TERMINATED_SYMBOL BY_SYMBOL textString
    | OPTIONALLY_SYMBOL? ENCLOSED_SYMBOL BY_SYMBOL textString
    | ESCAPED_SYMBOL BY_SYMBOL textString
;

linesClause:
    LINES_SYMBOL lineTerm+
;

lineTerm: (TERMINATED_SYMBOL | STARTING_SYMBOL) BY_SYMBOL textString
;

usePartition:
    PARTITION_SYMBOL identifierListWithParentheses
;

columnInternalRefList: 
    OPEN_PAR_SYMBOL identifier (COMMA_SYMBOL identifier)* CLOSE_PAR_SYMBOL
;

tableAliasRefList:
    qualifiedIdentifier (COMMA_SYMBOL qualifiedIdentifier)*
;

pureIdentifier:
    IDENTIFIER
    | BACK_TICK_QUOTED_ID
    | SINGLE_QUOTED_TEXT
    | DOUBLE_QUOTED_TEXT
    | BRACKET_QUOTED_TEXT
    | CURLY_BRACES_QUOTED_TEXT
    | UNDERSCORE_CHARSET
;

identifier:
    pureIdentifier
    | identifierKeyword
;

identifierList:
    identifier (COMMA_SYMBOL identifier)*
;

identifierListWithParentheses:
    OPEN_PAR_SYMBOL identifierList CLOSE_PAR_SYMBOL
;

qualifiedIdentifier:
   identifier (DOT_SYMBOL identifier)* (DOT_SYMBOL MULT_OPERATOR)?
;

jsonPathIdentifier:
    qualifiedIdentifier COLON_SYMBOL identifier  (((DOT_SYMBOL | COLON_SYMBOL) identifier) | BRACKET_QUOTED_TEXT)* (CAST_COLON_SYMBOL dataType)? (COLLATE_SYMBOL identifier?)?
;

dotIdentifier:
    DOT_SYMBOL identifier
;

ulong_number:
    INT_NUMBER
    | HEX_NUMBER
    | DECIMAL_NUMBER
    | FLOAT_NUMBER
;

real_ulong_number:
    INT_NUMBER
    | HEX_NUMBER
;

ulonglong_number:
    INT_NUMBER
    | DECIMAL_NUMBER
    | FLOAT_NUMBER
;

real_ulonglong_number:
    INT_NUMBER
    | HEX_NUMBER
;

literal:
    textLiteral
    | numLiteral
    | temporalLiteral
    | nullLiteral
    | boolLiteral
    | UNDERSCORE_CHARSET? (HEX_NUMBER | BIN_NUMBER)
;

stringList:
    OPEN_PAR_SYMBOL textString (COMMA_SYMBOL textString)* CLOSE_PAR_SYMBOL
;

textStringLiteral:
    SINGLE_QUOTED_TEXT
    | DOUBLE_QUOTED_TEXT
;

textString:
    textStringLiteral
    | HEX_NUMBER
    | BIN_NUMBER
;

textLiteral:
    (UNDERSCORE_CHARSET? textStringLiteral | NCHAR_TEXT) textStringLiteral*
;

numLiteral:
    INT_NUMBER
    | DECIMAL_NUMBER
    | FLOAT_NUMBER
;

boolLiteral:
    TRUE_SYMBOL
    | FALSE_SYMBOL
;

nullLiteral: 
    NULL_SYMBOL
    | NULL2_SYMBOL
;

temporalLiteral:
    DATE_SYMBOL SINGLE_QUOTED_TEXT
    | TIME_SYMBOL SINGLE_QUOTED_TEXT
    | TIMESTAMP_SYMBOL SINGLE_QUOTED_TEXT
;

floatOptions:
    fieldLength
    | precision
;

precision:
    OPEN_PAR_SYMBOL INT_NUMBER COMMA_SYMBOL INT_NUMBER CLOSE_PAR_SYMBOL
;

textOrIdentifier:
    identifier
    | textStringLiteral
;

parentheses:
    OPEN_PAR_SYMBOL CLOSE_PAR_SYMBOL
;

equal:
    EQUAL_OPERATOR
    | ASSIGN_OPERATOR
;

varIdentType:
    GLOBAL_SYMBOL DOT_SYMBOL
    | LOCAL_SYMBOL DOT_SYMBOL
    | SESSION_SYMBOL DOT_SYMBOL
;

identifierKeyword:
    TINYINT_SYMBOL |
    SMALLINT_SYMBOL |
    MEDIUMINT_SYMBOL |
    INT_SYMBOL |
    BIGINT_SYMBOL |
    SECOND_SYMBOL |
    MINUTE_SYMBOL |
    HOUR_SYMBOL |
    DAY_SYMBOL |
    WEEK_SYMBOL |
    MONTH_SYMBOL |
    QUARTER_SYMBOL |
    YEAR_SYMBOL |
    DEFAULT_SYMBOL |
    UNION_SYMBOL |
    SELECT_SYMBOL |
    ALL_SYMBOL |
    DISTINCT_SYMBOL |
    STRAIGHT_JOIN_SYMBOL |
    HIGH_PRIORITY_SYMBOL |
    SQL_SMALL_RESULT_SYMBOL |
    SQL_BIG_RESULT_SYMBOL |
    SQL_BUFFER_RESULT_SYMBOL |
    SQL_CALC_FOUND_ROWS_SYMBOL |
    LIMIT_SYMBOL |
    OFFSET_SYMBOL |
    INTO_SYMBOL |
    OUTFILE_SYMBOL |
    DUMPFILE_SYMBOL |
    PROCEDURE_SYMBOL |
    ANALYSE_SYMBOL |
    HAVING_SYMBOL |
    WINDOW_SYMBOL |
    AS_SYMBOL |
    PARTITION_SYMBOL |
    BY_SYMBOL |
    ROWS_SYMBOL |
    RANGE_SYMBOL |
    GROUPS_SYMBOL |
    UNBOUNDED_SYMBOL |
    PRECEDING_SYMBOL |
    INTERVAL_SYMBOL |
    CURRENT_SYMBOL |
    ROW_SYMBOL |
    BETWEEN_SYMBOL |
    AND_SYMBOL |
    FOLLOWING_SYMBOL |
    EXCLUDE_SYMBOL |
    GROUP_SYMBOL |
    TIES_SYMBOL |
    NO_SYMBOL |
    OTHERS_SYMBOL |
    WITH_SYMBOL |
    RECURSIVE_SYMBOL |
    ROLLUP_SYMBOL |
    CUBE_SYMBOL |
    ORDER_SYMBOL |
    ASC_SYMBOL |
    DESC_SYMBOL |
    FROM_SYMBOL |
    DUAL_SYMBOL |
    VALUES_SYMBOL |
    TABLE_SYMBOL |
    SQL_NO_CACHE_SYMBOL |
    SQL_CACHE_SYMBOL |
    MAX_STATEMENT_TIME_SYMBOL |
    FOR_SYMBOL |
    OF_SYMBOL |
    LOCK_SYMBOL |
    IN_SYMBOL |
    SHARE_SYMBOL |
    MODE_SYMBOL |
    UPDATE_SYMBOL |
    SKIP_SYMBOL |
    LOCKED_SYMBOL |
    NOWAIT_SYMBOL |
    WHERE_SYMBOL |
    OJ_SYMBOL |
    ON_SYMBOL |
    USING_SYMBOL |
    NATURAL_SYMBOL |
    INNER_SYMBOL |
    JOIN_SYMBOL |
    LEFT_SYMBOL |
    RIGHT_SYMBOL |
    OUTER_SYMBOL |
    CROSS_SYMBOL |
    LATERAL_SYMBOL |
    JSON_TABLE_SYMBOL |
    COLUMNS_SYMBOL |
    ORDINALITY_SYMBOL |
    EXISTS_SYMBOL |
    PATH_SYMBOL |
    NESTED_SYMBOL |
    EMPTY_SYMBOL |
    ERROR_SYMBOL |
    NULL_SYMBOL |
    USE_SYMBOL |
    FORCE_SYMBOL |
    IGNORE_SYMBOL |
    KEY_SYMBOL |
    INDEX_SYMBOL |
    PRIMARY_SYMBOL |
    IS_SYMBOL |
    TRUE_SYMBOL |
    FALSE_SYMBOL |
    UNKNOWN_SYMBOL |
    NOT_SYMBOL |
    XOR_SYMBOL |
    OR_SYMBOL |
    ANY_SYMBOL |
    MEMBER_SYMBOL |
    SOUNDS_SYMBOL |
    LIKE_SYMBOL |
    ESCAPE_SYMBOL |
    REGEXP_SYMBOL |
    DIV_SYMBOL |
    MOD_SYMBOL |
    MATCH_SYMBOL |
    AGAINST_SYMBOL |
    BINARY_SYMBOL |
    CAST_SYMBOL |
    ARRAY_SYMBOL |
    CASE_SYMBOL |
    END_SYMBOL |
    CONVERT_SYMBOL |
    COLLATE_SYMBOL |
    AVG_SYMBOL |
    BIT_AND_SYMBOL |
    BIT_OR_SYMBOL |
    BIT_XOR_SYMBOL |
    COUNT_SYMBOL |
    MIN_SYMBOL |
    MAX_SYMBOL |
    STD_SYMBOL |
    VARIANCE_SYMBOL |
    STDDEV_SAMP_SYMBOL |
    VAR_SAMP_SYMBOL |
    SUM_SYMBOL |
    GROUP_CONCAT_SYMBOL |
    SEPARATOR_SYMBOL |
    GROUPING_SYMBOL |
    ROW_NUMBER_SYMBOL |
    RANK_SYMBOL |
    DENSE_RANK_SYMBOL |
    CUME_DIST_SYMBOL |
    PERCENT_RANK_SYMBOL |
    NTILE_SYMBOL |
    LEAD_SYMBOL |
    LAG_SYMBOL |
    FIRST_VALUE_SYMBOL |
    LAST_VALUE_SYMBOL |
    NTH_VALUE_SYMBOL |
    FIRST_SYMBOL |
    LAST_SYMBOL |
    OVER_SYMBOL |
    RESPECT_SYMBOL |
    NULLS_SYMBOL |
    JSON_ARRAYAGG_SYMBOL |
    JSON_OBJECTAGG_SYMBOL |
    BOOLEAN_SYMBOL |
    LANGUAGE_SYMBOL |
    QUERY_SYMBOL |
    EXPANSION_SYMBOL |
    CHAR_SYMBOL |
    CURRENT_USER_SYMBOL |
    DATE_SYMBOL |
    INSERT_SYMBOL |
    TIME_SYMBOL |
    TIMESTAMP_SYMBOL |
    USER_SYMBOL |
    ADDDATE_SYMBOL |
    SUBDATE_SYMBOL |
    CURDATE_SYMBOL |
    CURTIME_SYMBOL |
    DATE_ADD_SYMBOL |
    DATE_SUB_SYMBOL |
    EXTRACT_SYMBOL |
    GET_FORMAT_SYMBOL |
    NOW_SYMBOL |
    POSITION_SYMBOL |
    SYSDATE_SYMBOL |
    TIMESTAMP_ADD_SYMBOL |
    TIMESTAMP_DIFF_SYMBOL |
    UTC_DATE_SYMBOL |
    UTC_TIME_SYMBOL |
    UTC_TIMESTAMP_SYMBOL |
    ASCII_SYMBOL |
    CHARSET_SYMBOL |
    COALESCE_SYMBOL |
    COLLATION_SYMBOL |
    DATABASE_SYMBOL |
    IF_SYMBOL |
    FORMAT_SYMBOL |
    MICROSECOND_SYMBOL |
    OLD_PASSWORD_SYMBOL |
    PASSWORD_SYMBOL |
    REPEAT_SYMBOL |
    REPLACE_SYMBOL |
    REVERSE_SYMBOL |
    ROW_COUNT_SYMBOL |
    TRUNCATE_SYMBOL |
    WEIGHT_STRING_SYMBOL |
    CONTAINS_SYMBOL |
    GEOMETRYCOLLECTION_SYMBOL |
    LINESTRING_SYMBOL |
    MULTILINESTRING_SYMBOL |
    MULTIPOINT_SYMBOL |
    MULTIPOLYGON_SYMBOL |
    POINT_SYMBOL |
    POLYGON_SYMBOL |
    LEVEL_SYMBOL |
    DATETIME_SYMBOL |
    TRIM_SYMBOL |
    LEADING_SYMBOL |
    TRAILING_SYMBOL |
    BOTH_SYMBOL |
    SUBSTRING_SYMBOL |
    WHEN_SYMBOL |
    THEN_SYMBOL |
    ELSE_SYMBOL |
    SIGNED_SYMBOL |
    UNSIGNED_SYMBOL |
    DECIMAL_SYMBOL |
    JSON_SYMBOL |
    FLOAT_SYMBOL |
    SET_SYMBOL |
    SECOND_MICROSECOND_SYMBOL |
    MINUTE_MICROSECOND_SYMBOL |
    MINUTE_SECOND_SYMBOL |
    HOUR_MICROSECOND_SYMBOL |
    HOUR_SECOND_SYMBOL |
    HOUR_MINUTE_SYMBOL |
    DAY_MICROSECOND_SYMBOL |
    DAY_SECOND_SYMBOL |
    DAY_MINUTE_SYMBOL |
    DAY_HOUR_SYMBOL |
    YEAR_MONTH_SYMBOL |
    BTREE_SYMBOL |
    RTREE_SYMBOL |
    HASH_SYMBOL |
    REAL_SYMBOL |
    DOUBLE_SYMBOL |
    PRECISION_SYMBOL |
    NUMERIC_SYMBOL |
    FIXED_SYMBOL |
    BIT_SYMBOL |
    BOOL_SYMBOL |
    VARYING_SYMBOL |
    VARCHAR_SYMBOL |
    VARCHAR2_SYMBOL |
    NATIONAL_SYMBOL |
    NVARCHAR_SYMBOL |
    NVARCHAR2_SYMBOL |
    NCHAR_SYMBOL |
    VARBINARY_SYMBOL |
    TINYBLOB_SYMBOL |
    BLOB_SYMBOL |
    CLOB_SYMBOL |
    BFILE_SYMBOL |
    RAW_SYMBOL |
    MEDIUMBLOB_SYMBOL |
    LONGBLOB_SYMBOL |
    LONG_SYMBOL |
    TINYTEXT_SYMBOL |
    TEXT_SYMBOL |
    MEDIUMTEXT_SYMBOL |
    LONGTEXT_SYMBOL |
    ENUM_SYMBOL |
    SERIAL_SYMBOL |
    GEOMETRY_SYMBOL |
    ZEROFILL_SYMBOL |
    BYTE_SYMBOL |
    UNICODE_SYMBOL |
    TERMINATED_SYMBOL |
    OPTIONALLY_SYMBOL |
    ENCLOSED_SYMBOL |
    ESCAPED_SYMBOL |
    LINES_SYMBOL |
    STARTING_SYMBOL |
    GLOBAL_SYMBOL |
    LOCAL_SYMBOL |
    SESSION_SYMBOL |
    MEDIUMINT_SYMBOL |
    BYTE_INT_SYMBOL |
    INT_SYMBOL |
    WITHOUT_SYMBOL |
    CHAR_SYMBOL |
    TIMESTAMP_LTZ_SYMBOL |
    TIMESTAMP_NTZ_SYMBOL |
    ZONE_SYMBOL |
    STRING_SYMBOL |
    FLOAT_SYMBOL_4 |
    FLOAT_SYMBOL_8 |
    NUMBER_SYMBOL |
    VARIANT_SYMBOL |
    OBJECT_SYMBOL |
    GEOGRAPHY_SYMBOL
;