lexer grammar CssLexer;


/* --- الرموز --- */

/* تعريف رموز الـ Comment */
COMMENT: '/*' .*? '*/' -> skip;

/* تعريف الرموز الأساسية */
COLON: ':';
SEMICOLON: ';';
LBRACE: '{';
RBRACE: '}';
DOT: '.';
HASH: '#';
HYPHEN: '-';
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
COMMA: ',';
ARROW: '=>';
BACKTICK: '`';
SDOLER: '$';
QUESTION_MARK: '?';
SPREAD: '...';
OR: '|';
EQ: '=';

/* تعريف الأرقام */
NUMBER: [0-9]+('.'[0-9]+)?;

/* تعريف الأرقام مع الوحدات */
UNIT: NUMBER ( 'px' | 'em' | '%' | 'vh' | 'vw' | 'fr' );

/* تعريف الألوان */
COLOR: '#' [a-zA-Z0-9]+;

/* تعريف النصوص */
STRING: '"' .*? '"';

/* تعريف الكلمات المفتاحية */
KEYWORD: 'solid' | 'dashed' | 'none' | 'auto' | 'ease-in-out' | 'ease' | 'linear';

/* تعريف الدوال البسيطة */
FUNCTION: [a-zA-Z_][a-zA-Z0-9_]* '(' (HYPHEN? NUMBER (UNIT | '%')? | SPACE)* ')';

/* تعريف الدوال المركبة */
FUNCTION1: [a-zA-Z_][a-zA-Z0-9_-]* '(' (HYPHEN* IDENTIFIER | COLOR | NUMBER | UNIT | STRING | SPACE | COMMA | FUNCTION1)* ')';

/* تعريف Fragment: جزء يمكن إعادة استخدامه (fragment) */
fragment IDENTIFIER_PART: [a-zA-Z_][a-zA-Z0-9_-]*;  // جزء معرّف يمكن تكراره داخل القواعد الأخرى

/* تعريف الأسماء المعرفية التي تعتمد على جزء الـ IDENTIFIER_PART */
IDENTIFIER: IDENTIFIER_PART;   // استخدام الجزء المعرّف من الـ fragment

/* تعريف الأصناف (Class Selectors) */
CLASS: DOT IDENTIFIER_PART;   // استخدام fragment في القواعد الأخرى

/* تعريف المعرّفات (ID Selectors) */
ID: HASH IDENTIFIER_PART;     // استخدام fragment في القواعد الأخرى

/* تعريف الـ Pseudo-Classes */
PSEUDO_CLASS: COLON IDENTIFIER_PART;  // استخدام fragment في القواعد الأخرى

/* تجاهل المسافات البيضاء */
WS: [ \t\r\n]+ -> skip;

/* تعريف رمز المسافات */
SPACE: ' ';
