lexer grammar TypeScriptLexer;

// تعريف الكلمات المفتاحية المحجوزة
ELSE: 'else';
IMPORT: 'import';
FROM: 'from';
EXPORT: 'export';
CLASS: 'class';
IF: 'if';
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
IDENTIFIER: LETTER (LETTER | DIGIT | '_')*;
STRING: '"' ( ~["\\] | ESCAPED_CHAR )* '"'
       | '\'' ( ~['\\] | ESCAPED_CHAR )* '\'';
NUMBER: DIGIT+ ('.' DIGIT+)?;

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
OR: '|';
EQ: '=';
DOT: '.';

// تعريف المسافات والتعليقات
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;


// يتم تعريف الأجزاء المتكررة مرة واحدة فقط ثم استدعاؤها أينما لزم
// تعريف الـ fragments لإعادة الاستخدام
fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z\u0621-\u064A]; // يتضمن الحروف الإنجليزية والعربية
fragment ESCAPED_CHAR: '\\' .; // أي رمز مسبوق بعلامة '\'، مثل '\n' أو '\"'
