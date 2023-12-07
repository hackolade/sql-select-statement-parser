lexer grammar SQLSelectLexer;

EQUAL_OPERATOR:            '=';
ASSIGN_OPERATOR:           ':=';
NULL_SAFE_EQUAL_OPERATOR:  '<=>';
GREATER_OR_EQUAL_OPERATOR: '>=';
GREATER_THAN_OPERATOR:     '>';
LESS_OR_EQUAL_OPERATOR:    '<=';
LESS_THAN_OPERATOR:        '<';
NOT_EQUAL_OPERATOR:        '!=' | '<>';

PLUS_OPERATOR:  '+';
MINUS_OPERATOR: '-';
MULT_OPERATOR:  '*';
DIV_OPERATOR:   '/';

MOD_OPERATOR: '%';

LOGICAL_NOT_OPERATOR: '!';
BITWISE_NOT_OPERATOR: '~';

SHIFT_LEFT_OPERATOR:  '<<';
SHIFT_RIGHT_OPERATOR: '>>';

LOGICAL_AND_OPERATOR: '&&';
BITWISE_AND_OPERATOR: '&';

BITWISE_XOR_OPERATOR: '^';

LOGICAL_OR_OPERATOR:
    '||' 
;
BITWISE_OR_OPERATOR: '|';

DOT_SYMBOL:         '.';
COMMA_SYMBOL:       ',';
SEMICOLON_SYMBOL:   ';';
COLON_SYMBOL:       ':';
OPEN_PAR_SYMBOL:    '(';
CLOSE_PAR_SYMBOL:   ')';
OPEN_CURLY_SYMBOL:  '{';
CLOSE_CURLY_SYMBOL: '}';
UNDERLINE_SYMBOL:   '_';
OPEN_BRACKET_SYMBOL: '[';
CLOSE_BRACKET_SYMBOL: ']';
OPEN_DOUBLE_CURLY_SYMBOL:  '{{';
CLOSE_DOUBLE_CURLY_SYMBOL: '}}';

JSON_SEPARATOR_SYMBOL:          '->' ;  
JSON_UNQUOTED_SEPARATOR_SYMBOL: '->>' ; 

AT_SIGN_SYMBOL: '@';
AT_TEXT_SUFFIX: '@' SIMPLE_IDENTIFIER;

AT_AT_SIGN_SYMBOL: '@@';

NULL2_SYMBOL: '\\N';
PARAM_MARKER: '?';
CAST_COLON_SYMBOL: '::';

fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];

fragment DIGIT:    [0-9];
fragment DIGITS:   DIGIT+;
fragment HEXDIGIT: [0-9a-fA-F];

HEX_NUMBER: ('0x' HEXDIGIT+) | ('x\'' HEXDIGIT+ '\'');
BIN_NUMBER: ('0b' [01]+) | ('b\'' [01]+ '\'');

INT_NUMBER: DIGITS ;
DECIMAL_NUMBER: DIGITS? DOT_SYMBOL DIGITS;
FLOAT_NUMBER:   (DIGITS? DOT_SYMBOL)? DIGITS [eE] (MINUS_OPERATOR | PLUS_OPERATOR)? DIGITS;

TINYINT_SYMBOL: T I N Y I N T; 
SMALLINT_SYMBOL: S M A L L I N T; 
MEDIUMINT_SYMBOL: M E D I U M I N T;
BYTE_INT_SYMBOL: B Y T E I N T; 
INT_SYMBOL :   I N T E G E R | I N T; 
BIGINT_SYMBOL:  B I G I N T; 
SECOND_SYMBOL:  S E C O N D; 
MINUTE_SYMBOL:  M I N U T E; 
HOUR_SYMBOL :   H O U R; 
DAY_SYMBOL :   D A Y; 
WEEK_SYMBOL :   W E E K; 
MONTH_SYMBOL:   M O N T H; 
QUARTER_SYMBOL: Q U A R T E R; 
YEAR_SYMBOL :   Y E A R; 

DEFAULT_SYMBOL: D E F A U L T;
UNION_SYMBOL: U N I O N;
SELECT_SYMBOL: S E L E C T;
ALL_SYMBOL: A L L;
DISTINCT_SYMBOL: D I S T I N C T;
STRAIGHT_JOIN_SYMBOL: S T R A I G H T '_' J O I N;
HIGH_PRIORITY_SYMBOL: H I G H '_' P R I O R I T Y;
SQL_SMALL_RESULT_SYMBOL: S Q L '_' S M A L L '_' R E S U L T;
SQL_BIG_RESULT_SYMBOL: S Q L '_' B I G '_' R E S U L T;
SQL_BUFFER_RESULT_SYMBOL: S Q L '_' B U F F E R '_' R E S U L T;
SQL_CALC_FOUND_ROWS_SYMBOL: S Q L '_' C A L C '_' F O U N D '_' R O W S;
LIMIT_SYMBOL: L I M I T;
OFFSET_SYMBOL: O F F S E T;
INTO_SYMBOL: I N T O;
OUTFILE_SYMBOL: O U T F I L E;
DUMPFILE_SYMBOL: D U M P F I L E;
PROCEDURE_SYMBOL: P R O C E D U R E;
ANALYSE_SYMBOL: A N A L Y S E;
HAVING_SYMBOL: H A V I N G;
WINDOW_SYMBOL: W I N D O W;
AS_SYMBOL: A S;
PARTITION_SYMBOL: P A R T I T I O N;
BY_SYMBOL: B Y;
ROWS_SYMBOL: R O W S;
RANGE_SYMBOL: R A N G E;
GROUPS_SYMBOL: G R O U P S;
UNBOUNDED_SYMBOL: U N B O U N D E D;
PRECEDING_SYMBOL: P R E C E D I N G;
INTERVAL_SYMBOL: I N T E R V A L;
CURRENT_SYMBOL: C U R R E N T;
ROW_SYMBOL: R O W;
BETWEEN_SYMBOL: B E T W E E N;
AND_SYMBOL: A N D;
FOLLOWING_SYMBOL: F O L L O W I N G;
EXCLUDE_SYMBOL: E X C L U D E;
GROUP_SYMBOL: G R O U P;
TIES_SYMBOL: T I E S;
NO_SYMBOL: N O;
OTHERS_SYMBOL: O T H E R S;
WITH_SYMBOL: W I T H;
WITHOUT_SYMBOL: W I T H O U T;
RECURSIVE_SYMBOL: R E C U R S I V E;
ROLLUP_SYMBOL: R O L L U P;
CUBE_SYMBOL: C U B E;
ORDER_SYMBOL: O R D E R;
ASC_SYMBOL: A S C;
DESC_SYMBOL: D E S C;
FROM_SYMBOL: F R O M;
DUAL_SYMBOL: D U A L;
VALUES_SYMBOL: V A L U E S;
TABLE_SYMBOL: T A B L E;
SQL_NO_CACHE_SYMBOL: S Q L '_' N O '_' C A C H E;
SQL_CACHE_SYMBOL: S Q L '_' C A C H E;
MAX_STATEMENT_TIME_SYMBOL: M A X '_' S T A T E M E N T '_' T I M E;
FOR_SYMBOL: F O R;
OF_SYMBOL: O F;
LOCK_SYMBOL: L O C K;
IN_SYMBOL: I N;
SHARE_SYMBOL: S H A R E;
MODE_SYMBOL: M O D E;
UPDATE_SYMBOL: U P D A T E;
SKIP_SYMBOL: S K I P;
LOCKED_SYMBOL: L O C K E D;
NOWAIT_SYMBOL: N O W A I T;
WHERE_SYMBOL: W H E R E;
QUALIFY_SYMBOL: Q U A L I F Y;
OJ_SYMBOL: O J;
ON_SYMBOL: O N;
USING_SYMBOL: U S I N G;
NATURAL_SYMBOL: N A T U R A L;
INNER_SYMBOL: I N N E R;
JOIN_SYMBOL: J O I N;
LEFT_SYMBOL: L E F T;
RIGHT_SYMBOL: R I G H T;
OUTER_SYMBOL: O U T E R;
CROSS_SYMBOL: C R O S S;
LATERAL_SYMBOL: L A T E R A L;
JSON_TABLE_SYMBOL: J S O N '_' T A B L E;
COLUMNS_SYMBOL: C O L U M N S;
ORDINALITY_SYMBOL: O R D I N A L I T Y;
EXISTS_SYMBOL: E X I S T S;
PATH_SYMBOL: P A T H;
NESTED_SYMBOL: N E S T E D;
EMPTY_SYMBOL: E M P T Y;
ERROR_SYMBOL: E R R O R;
NULL_SYMBOL: N U L L;
USE_SYMBOL: U S E;
FORCE_SYMBOL: F O R C E;
IGNORE_SYMBOL: I G N O R E;
KEY_SYMBOL: K E Y;
INDEX_SYMBOL: I N D E X;
PRIMARY_SYMBOL: P R I M A R Y;
IS_SYMBOL: I S;
TRUE_SYMBOL: T R U E;
FALSE_SYMBOL: F A L S E;
UNKNOWN_SYMBOL: U N K N O W N;
NOT_SYMBOL: N O T;
XOR_SYMBOL: X O R;
OR_SYMBOL: O R;
ANY_SYMBOL: A N Y;
MEMBER_SYMBOL: M E M B E R;
SOUNDS_SYMBOL: S O U N D S;
LIKE_SYMBOL: L I K E;
ESCAPE_SYMBOL: E S C A P E;
REGEXP_SYMBOL: R E G E X P;
DIV_SYMBOL: D I V;
MOD_SYMBOL: M O D;
MATCH_SYMBOL: M A T C H;
AGAINST_SYMBOL: A G A I N S T;
BINARY_SYMBOL: B I N A R Y;
CAST_SYMBOL: C A S T;
ARRAY_SYMBOL: A R R A Y;
CASE_SYMBOL: C A S E;
END_SYMBOL: E N D;
CONVERT_SYMBOL: C O N V E R T;
COLLATE_SYMBOL: C O L L A T E;
AVG_SYMBOL: A V G;
BIT_AND_SYMBOL: B I T '_' A N D;
BIT_OR_SYMBOL: B I T '_' O R;
BIT_XOR_SYMBOL: B I T '_' X O R;
COUNT_SYMBOL: C O U N T;
MIN_SYMBOL: M I N;
MAX_SYMBOL: M A X;
STD_SYMBOL: S T D;
VARIANCE_SYMBOL: V A R I A N C E;
STDDEV_SAMP_SYMBOL: S T D D E V '_' S A M P;
VAR_SAMP_SYMBOL: V A R '_' S A M P;
SUM_SYMBOL: S U M;
GROUP_CONCAT_SYMBOL: G R O U P '_' C O N C A T;
SEPARATOR_SYMBOL: S E P A R A T O R;
GROUPING_SYMBOL: G R O U P I N G;
ROW_NUMBER_SYMBOL: R O W '_' N U M B E R;
RANK_SYMBOL: R A N K;
DENSE_RANK_SYMBOL: D E N S E '_' R A N K;
CUME_DIST_SYMBOL: C U M E '_' D I S T;
PERCENT_RANK_SYMBOL: P E R C E N T '_' R A N K;
NTILE_SYMBOL: N T I L E;
LEAD_SYMBOL: L E A D;
LAG_SYMBOL: L A G;
FIRST_VALUE_SYMBOL: F I R S T '_' V A L U E;
LAST_VALUE_SYMBOL: L A S T '_' V A L U E;
NTH_VALUE_SYMBOL: N T H '_' V A L U E;
FIRST_SYMBOL: F I R S T;
LAST_SYMBOL: L A S T;
OVER_SYMBOL: O V E R;
RESPECT_SYMBOL: R E S P E C T;
NULLS_SYMBOL: N U L L S;
JSON_ARRAYAGG_SYMBOL: J S O N '_' A R R A Y A G G;
JSON_OBJECTAGG_SYMBOL: J S O N '_' O B J E C T A G G;
BOOLEAN_SYMBOL: B O O L E A N;
LANGUAGE_SYMBOL: L A N G U A G E;
QUERY_SYMBOL: Q U E R Y;
EXPANSION_SYMBOL: E X P A N S I O N;
CHAR_SYMBOL: C H A R A C T E R | C H A R;
CURRENT_USER_SYMBOL: C U R R E N T '_' U S E R;
DATE_SYMBOL: D A T E;
INSERT_SYMBOL: I N S E R T;
TIME_SYMBOL: T I M E;
TIMESTAMP_SYMBOL: T I M E S T A M P;
TIMESTAMP_LTZ_SYMBOL: T I M E S T A M P L T Z | T I M E S T A M P '_' L T Z;
TIMESTAMP_NTZ_SYMBOL: T I M E S T A M P N T Z | T I M E S T A M P '_' N T Z;
ZONE_SYMBOL: Z O N E;
USER_SYMBOL: U S E R;
ADDDATE_SYMBOL: A D D D A T E;
SUBDATE_SYMBOL: S U B D A T E;
CURDATE_SYMBOL: C U R D A T E;
CURTIME_SYMBOL: C U R T I M E;
DATE_ADD_SYMBOL: D A T E '_' A D D;
DATE_SUB_SYMBOL: D A T E '_' S U B;
EXTRACT_SYMBOL: E X T R A C T;
GET_FORMAT_SYMBOL: G E T '_' F O R M A T;
NOW_SYMBOL: N O W;
POSITION_SYMBOL: P O S I T I O N;
SYSDATE_SYMBOL: S Y S D A T E;
TIMESTAMP_ADD_SYMBOL: T I M E S T A M P '_' A D D;
TIMESTAMP_DIFF_SYMBOL: T I M E S T A M P '_' D I F F;
UTC_DATE_SYMBOL: U T C '_' D A T E;
UTC_TIME_SYMBOL: U T C '_' T I M E;
UTC_TIMESTAMP_SYMBOL: U T C '_' T I M E S T A M P;
ASCII_SYMBOL: A S C I I;
CHARSET_SYMBOL: C H A R S E T;
COALESCE_SYMBOL: C O A L E S C E;
COLLATION_SYMBOL: C O L L A T I O N;
DATABASE_SYMBOL: D A T A B A S E;
IF_SYMBOL: I F;
FORMAT_SYMBOL: F O R M A T;
MICROSECOND_SYMBOL: M I C R O S E C O N D;
OLD_PASSWORD_SYMBOL: O L D '_' P A S S W O R D;
PASSWORD_SYMBOL: P A S S W O R D;
REPEAT_SYMBOL: R E P E A T;
REPLACE_SYMBOL: R E P L A C E;
REVERSE_SYMBOL: R E V E R S E;
ROW_COUNT_SYMBOL: R O W '_' C O U N T;
TRUNCATE_SYMBOL: T R U N C A T E;
WEIGHT_STRING_SYMBOL: W E I G H T '_' S T R I N G;
CONTAINS_SYMBOL: C O N T A I N S;
GEOMETRYCOLLECTION_SYMBOL: G E O M E T R Y C O L L E C T I O N;
LINESTRING_SYMBOL: L I N E S T R I N G;
MULTILINESTRING_SYMBOL: M U L T I L I N E S T R I N G;
MULTIPOINT_SYMBOL: M U L T I P O I N T;
MULTIPOLYGON_SYMBOL: M U L T I P O L Y G O N;
POINT_SYMBOL: P O I N T;
POLYGON_SYMBOL: P O L Y G O N;
LEVEL_SYMBOL: L E V E L;
DATETIME_SYMBOL: D A T E T I M E;
TRIM_SYMBOL: T R I M;
LEADING_SYMBOL: L E A D I N G;
TRAILING_SYMBOL: T R A I L I N G;
BOTH_SYMBOL: B O T H;
STRING_SYMBOL: S T R I N G;
SUBSTRING_SYMBOL: S U B S T R I N G;
WHEN_SYMBOL: W H E N;
THEN_SYMBOL: T H E N;
ELSE_SYMBOL: E L S E;
SIGNED_SYMBOL: S I G N E D;
UNSIGNED_SYMBOL: U N S I G N E D;
DECIMAL_SYMBOL: D E C I M A L | D E C;
JSON_SYMBOL: J S O N;
FLOAT_SYMBOL: F L O A T;
FLOAT_SYMBOL_4: F L O A T '4';
FLOAT_SYMBOL_8: F L O A T '8';
SET_SYMBOL: S E T;
SECOND_MICROSECOND_SYMBOL: S E C O N D '_' M I C R O S E C O N D;
MINUTE_MICROSECOND_SYMBOL: M I N U T E '_' M I C R O S E C O N D;
MINUTE_SECOND_SYMBOL: M I N U T E '_' S E C O N D;
HOUR_MICROSECOND_SYMBOL: H O U R '_' M I C R O S E C O N D;
HOUR_SECOND_SYMBOL: H O U R '_' S E C O N D;
HOUR_MINUTE_SYMBOL: H O U R '_' M I N U T E;
DAY_MICROSECOND_SYMBOL: D A Y '_' M I C R O S E C O N D;
DAY_SECOND_SYMBOL: D A Y '_' S E C O N D;
DAY_MINUTE_SYMBOL: D A Y '_' M I N U T E;
DAY_HOUR_SYMBOL: D A Y '_' H O U R;
YEAR_MONTH_SYMBOL: Y E A R '_' M O N T H;
BTREE_SYMBOL: B T R E E;
RTREE_SYMBOL: R T R E E;
HASH_SYMBOL: H A S H;
REAL_SYMBOL: R E A L;
DOUBLE_SYMBOL: D O U B L E;
PRECISION_SYMBOL: P R E C I S I O N;
NUMERIC_SYMBOL: N U M E R I C;
NUMBER_SYMBOL: N U M B E R;
FIXED_SYMBOL: F I X E D;
BIT_SYMBOL: B I T;
BOOL_SYMBOL: B O O L;
VARYING_SYMBOL: V A R Y I N G;
VARCHAR_SYMBOL: V A R C H A R;
VARCHAR2_SYMBOL: V A R C H A R '2';
NATIONAL_SYMBOL: N A T I O N A L;
NVARCHAR_SYMBOL: N V A R C H A R;
NVARCHAR2_SYMBOL: N V A R C H A R '2';
NCHAR_SYMBOL: N C H A R;
VARBINARY_SYMBOL: V A R B I N A R Y;
TINYBLOB_SYMBOL: T I N Y B L O B;
BLOB_SYMBOL: B L O B;
CLOB_SYMBOL: C L O B;
BFILE_SYMBOL: B F I L E;
RAW_SYMBOL: R A W;
MEDIUMBLOB_SYMBOL: M E D I U M B L O B;
LONGBLOB_SYMBOL: L O N G B L O B;
LONG_SYMBOL: L O N G;
TINYTEXT_SYMBOL: T I N Y T E X T;
TEXT_SYMBOL: T E X T;
MEDIUMTEXT_SYMBOL: M E D I U M T E X T;
LONGTEXT_SYMBOL: L O N G T E X T;
ENUM_SYMBOL: E N U M;
SERIAL_SYMBOL: S E R I A L;
GEOMETRY_SYMBOL: G E O M E T R Y;
ZEROFILL_SYMBOL: Z E R O F I L L;
BYTE_SYMBOL: B Y T E;
UNICODE_SYMBOL: U N I C O D E;
TERMINATED_SYMBOL: T E R M I N A T E D;
OPTIONALLY_SYMBOL: O P T I O N A L L Y;
ENCLOSED_SYMBOL: E N C L O S E D;
ESCAPED_SYMBOL: E S C A P E D;
LINES_SYMBOL: L I N E S;
STARTING_SYMBOL: S T A R T I N G;
GLOBAL_SYMBOL: G L O B A L;
LOCAL_SYMBOL: L O C A L;
SESSION_SYMBOL: S E S S I O N;
VARIANT_SYMBOL: V A R I A N T;
OBJECT_SYMBOL: O B J E C T;
GEOGRAPHY_SYMBOL: G E O G R A P H Y;
UNPIVOT_SYMBOL: U N P I V O T;

INT1_SYMBOL: I N T '1' -> type(TINYINT_SYMBOL);   // Synonym
INT2_SYMBOL: I N T '2' -> type(SMALLINT_SYMBOL);  // Synonym
INT3_SYMBOL: I N T '3' -> type(MEDIUMINT_SYMBOL); // Synonym
INT4_SYMBOL: I N T '4' -> type(INT_SYMBOL);       // Synonym
INT8_SYMBOL: I N T '8' -> type(BIGINT_SYMBOL);    // Synonym

SQL_TSI_SECOND_SYMBOL:  S Q L '_' T S I '_' S E C O N D   -> type(SECOND_SYMBOL);  // Synonym
SQL_TSI_MINUTE_SYMBOL:  S Q L '_' T S I '_' M I N U T E   -> type(MINUTE_SYMBOL);  // Synonym
SQL_TSI_HOUR_SYMBOL:    S Q L '_' T S I '_' H O U R       -> type(HOUR_SYMBOL);    // Synonym
SQL_TSI_DAY_SYMBOL:     S Q L '_' T S I '_' D A Y         -> type(DAY_SYMBOL);     // Synonym
SQL_TSI_WEEK_SYMBOL:    S Q L '_' T S I '_' W E E K       -> type(WEEK_SYMBOL);    // Synonym
SQL_TSI_MONTH_SYMBOL:   S Q L '_' T S I '_' M O N T H     -> type(MONTH_SYMBOL);   // Synonym
SQL_TSI_QUARTER_SYMBOL: S Q L '_' T S I '_' Q U A R T E R -> type(QUARTER_SYMBOL); // Synonym
SQL_TSI_YEAR_SYMBOL:    S Q L '_' T S I '_' Y E A R       -> type(YEAR_SYMBOL);    // Synonym

// White space handling
WHITESPACE: [ \t\f\r\n] -> channel(HIDDEN); // Ignore whitespaces.

// Input not covered elsewhere (unless quoted).
INVALID_INPUT:
    [\u0001-\u0008]   // Control codes.
    | '\u000B'        // Line tabulation.
    | '\u000C'        // Form feed.
    | [\u000E-\u001F] // More control codes.
;

// String and text types.

// The underscore charset token is used to defined the repertoire of a string, though it conflicts
// with normal identifiers, which also can start with an underscore.
UNDERSCORE_CHARSET: UNDERLINE_SYMBOL [a-z0-9]+ ;

// Identifiers might start with a digit, even though it is discouraged, and may not consist entirely of digits only.
// All keywords above are automatically excluded.
IDENTIFIER:
    DIGITS+ [eE] (LETTER_WHEN_UNQUOTED_NO_DIGIT LETTER_WHEN_UNQUOTED*)? // Have to exclude float pattern, as this rule matches more.
    | DIGITS+ LETTER_WITHOUT_FLOAT_PART LETTER_WHEN_UNQUOTED*
    | LETTER_WHEN_UNQUOTED_NO_DIGIT LETTER_WHEN_UNQUOTED* // INT_NUMBER matches first if there are only digits.
;

NCHAR_TEXT: [nN] SINGLE_QUOTED_TEXT;

// MySQL supports automatic concatenation of multiple single and double quoted strings if they follow each other as separate
// tokens. This is reflected in the `textLiteral` parser rule.
// Here we handle duplication of quotation chars only (which must be replaced by a single char in the target code).

fragment BACK_TICK:    '`';
fragment SINGLE_QUOTE: '\'';
fragment DOUBLE_QUOTE: '"';

BACK_TICK_QUOTED_ID: BACK_TICK .*? BACK_TICK;

DOUBLE_QUOTED_TEXT: (
        DOUBLE_QUOTE .*? DOUBLE_QUOTE
    )+
;

SINGLE_QUOTED_TEXT: (
        SINGLE_QUOTE .*? SINGLE_QUOTE
    )+
;

BRACKET_QUOTED_TEXT: (
        OPEN_BRACKET_SYMBOL .*? CLOSE_BRACKET_SYMBOL
    )+
;

BRACKET_QUOTED_NUMBER: (
        OPEN_BRACKET_SYMBOL INT_NUMBER CLOSE_BRACKET_SYMBOL
    )+
;

CURLY_BRACES_QUOTED_TEXT: (
        OPEN_DOUBLE_CURLY_SYMBOL .*? CLOSE_DOUBLE_CURLY_SYMBOL
    )+
;

// There are 3 types of block comments:
// /* ... */ - The standard multi line comment.
// /*! ... */ - A comment used to mask code for other clients. In MySQL the content is handled as normal code.
// /*!12345 ... */ - Same as the previous one except code is only used when the given number is lower
//                   than the current server version (specifying so the minimum server version the code can run with).
VERSION_COMMENT_START: ('/*!' DIGITS) (
         .*? '*/'
    ) -> channel(HIDDEN)
;

// inVersionComment is a variable in the base lexer.
MYSQL_COMMENT_START: '/*!'                      -> channel(HIDDEN);
SNOWFLAKE_COMMENT: '//' ~[\r\n]*                -> channel(HIDDEN);
VERSION_COMMENT_END: '*/'  -> channel(HIDDEN);
BLOCK_COMMENT:       ( '/**/' | '/*' ~[!] .*? '*/')                         -> channel(HIDDEN);

POUND_COMMENT:    '#' ~([\n\r])*                                   -> channel(HIDDEN);
DASHDASH_COMMENT: DOUBLE_DASH ((~[\n\r])* | LINEBREAK | EOF) -> channel(HIDDEN);

fragment DOUBLE_DASH: '--';
fragment LINEBREAK:   [\n\r];

fragment SIMPLE_IDENTIFIER: (DIGIT | [a-zA-Z_$] | DOT_SYMBOL)+;

fragment ML_COMMENT_HEAD: '/*';
fragment ML_COMMENT_END:  '*/';

// As defined in https://dev.mysql.com/doc/refman/8.0/en/identifiers.html.
fragment LETTER_WHEN_UNQUOTED: DIGIT | LETTER_WHEN_UNQUOTED_NO_DIGIT;

fragment LETTER_WHEN_UNQUOTED_NO_DIGIT: [a-zA-Z_$\u0080-\uffff];

// Any letter but without e/E and digits (which are used to match a decimal number).
fragment LETTER_WITHOUT_FLOAT_PART: [a-df-zA-DF-Z_$\u0080-\uffff];