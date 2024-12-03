
lexer grammar HtmlLexer;

// رموز البداية والنهاية
OPEN_TAG: '<';
CLOSE_TAG: '>';
END_TAG: '</';

// التعريفات الخاصة بـ Angular
ANGULAR_BINDING
    : '[' ATTR_NAME ']'
    ;

ANGULAR_EVENT
    : '(' ATTR_NAME ')'
    ;

ANGULAR_DIRECTIVE
    : '*' ATTR_NAME
    ;

// الرموز الأساسية
TAG_NAME
    : [a-zA-Z_:][a-zA-Z0-9_.:-]*
    ;

ATTR_NAME
    : [a-zA-Z_:][a-zA-Z0-9_.:-]*
    ;

ATTR_VALUE
    : '"' ~["]* '"'
    | '\'' ~[']* '\''
    ;

// تجاوز الفراغات
WS
    : [ \t\r\n]+ -> skip
    ;

EQUAL: '=';

