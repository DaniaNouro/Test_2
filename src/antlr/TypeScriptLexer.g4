lexer grammar TypeScriptLexer;


// تعريف الكلمات المفتاحية المحجوزة
ELSE:'else';
IMPORT: 'import';
FROM: 'from';
EXPORT: 'export';
CLASS: 'class';
IF :'if';
ENUM: 'enum';
AS: 'as';
FUNCTION: 'function';
TUPLE: 'tuple';
BOOLEAN: 'true' | 'false';
NULL: 'null';
THIS: 'this';
NOT: '!';
LET: 'let';
RETURN: 'return';


// تعريف الأنواع الأساسية
TYPE: 'string'
    | 'boolean'
    | 'number'
    | 'any'
    | 'object'
    | 'void';


// تعريف أنواع المصفوفات
ARRAY_TYPE: 'Array';
ARRAY_TYPE_BRACKETS: 'Array<' TYPE '>';


// تعريف العمليات الرياضية والمنطقية
OPERATION: '+' | '-' | '*' | '/';
COMPARISON_OPERATOR: '>' | '<' | '>=' | '<=' | '===' | '!==';
LOGICAL_OPERATOR: '&&' | '||';


// تعريف المعرفات والقيم
IDENTIFIER: [a-zA-Z\u0621-\u064A_][a-zA-Z0-9\u0621-\u064A_]*;
STRING: '"' ( ~["\\] | '\\' . )* '"' | '\'' .*? '\'';
NUMBER: [0-9]+ ('.' [0-9]+)?;


// تعريف الرموز المختلفة
LCURLY: '{';
RCURLY: '}';
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
COLON: ':';
SEMICOLON: ';';
COMMA: ',';
ARROW: '=>';
BACKTICK: '`';
SDOLER: '$';
QUESTION_MARK: '?';
SPREAD: '...';
OR:'|';
EQ: '=';
DOT: '.';


// تعريف المسافات والتعليقات
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
