lexer grammar AngularLexer_2;


// **الكلمات المفتاحية (Keywords)**
SELECTOR       : 'Component';
TEMPLATE       : 'template';
STYLES         : 'styles';
STANDALONE     : 'standalone';
NGFOR          : '*ngFor';
NGIF           : '*ngIf';
NGSWITCH       : '*ngSwitch';
NGSWITCHCASE   : '*ngSwitchCase';
NGSWITCHDEFAULT: '*ngSwitchDefault';
TEMPLATEURL    : 'templateUrl';
BOOLEAN        : 'true' | 'false';
ELSE           : 'else';
OF             : 'of';
LET            : 'let';
AS             : 'as';

// **الرموز (Symbols)**
LPAREN         : '(';
RPAREN         : ')';
LBRACE         : '{';
RBRACE         : '}';
LBRACKET       : '[';
RBRACKET       : ']';
ASSIGN         : '=';
COLON          : ':';
SEMICOLON      : ';';
COMMA          : ',';
DOT            : '.';
AT             : '@';
PLUS           : '+';
MINUS          : '-';
MULTIPLY       : '*';
DIVIDE         : '/';
EQUAL          : '==';
NOT_EQUAL      : '!=';
LESS           : '<';
LESS_EQUAL     : '<=';
GREATER        : '>';
GREATER_EQUAL  : '>=';
AND            : '&&';
OR             : '||';
NOT            : '!';
QUESTION       : '?';
PIPE           : '|';

// **النصوص (Strings)**
STRING
    : '"' (ESC | ~["\r\n])* '"'
    | '\'' (ESC | ~['\r\n])* '\''
    ;

fragment ESC : '\\' .; // للتعامل مع أحرف الإفلات

// **المعرفات والأرقام (Identifiers & Numbers)**
//IDENTIFIER     : [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER         : [0-9]+;
WHITESPACE     : [ \t\r\n]+ -> skip;

// **الوضع الأساسي (Default Mode)**
HTML_TEMPLATE
    : '`' -> pushMode(HTML_MODE)
    ;

// **وضع HTML**
mode HTML_MODE;

HTML_TEXT
    : ~[`{]+ // النصوص العادية في HTML
    ;

INTERPOLATION_START
    : '{{' -> pushMode(ANGULAR_EXPRESSION_MODE)
    ;

HTML_TEMPLATE_END
    : '`' -> popMode
    ;

// **وضع Angular Expression**
mode ANGULAR_EXPRESSION_MODE;

IDENTIFIER
    : [a-zA-Z_][a-zA-Z0-9_]* // المعرفات مثل selectedProduct
    ;

PIPE_OPERATOR
    : '|'
    ;

ARITHMETIC_OPERATOR
    : '+' | '-' | '*' | '/'
    ;

RELATIONAL_OPERATOR
    : '<' | '<=' | '>' | '>=' | '==' | '!='
    ;

INTERPOLATION_END
    : '}}' -> popMode
    ;

// **التعليقات HTML و Angular**
HTML_COMMENT
    : '<!--' .*? '-->'
    ;

HTML_CONDITIONAL_COMMENT
    : '<![' .*? ']>'
    ;

CDATA
    : '<![CDATA[' .*? ']]>'
    ;

// **التعامل مع وسوم HTML الخاصة (Tags)**

TAG_OPEN
    : '<' -> pushMode(TAG)
    ;

mode TAG;

TAG_CLOSE
    : '>' -> popMode
    ;

TAG_SLASH_CLOSE
    : '/>' -> popMode
    ;

TAG_NAME
    : [a-zA-Z_:][a-zA-Z0-9_:.-]*
    ;

TAG_EQUALS
    : '=' -> pushMode(ATTVALUE)
    ;

mode ATTVALUE;

ATTRIBUTE
    : DOUBLE_QUOTE_STRING
    | SINGLE_QUOTE_STRING
    | [^\s>]+ -> popMode
    ;

fragment DOUBLE_QUOTE_STRING
    : '"' .*? '"'
    ;

fragment SINGLE_QUOTE_STRING
    : '\'' .*? '\''
    ;

ATTVALUE_END
    : [ \t\r\n]* -> popMode
    ;
