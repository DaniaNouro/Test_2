lexer grammar IntegrationLexer;

import HtmlLexer;

// **تعريفات Angular مخصصة**
NG_DIRECTIVES
    : NGFOR
    | NGIF
    | '*ngSwitch'
    | '*ngSwitchCase'
    | '*ngSwitchDefault'
    | 'let'
    | 'of'
    | 'as'
    | 'else'
    ;

fragment NGFOR: '*ngfor';
fragment NGIF: '*ngIf';



// الربط بين الخصائص
PROPERTY_BINDING
    : '[' IDENTIFIER ']'
    ;

// الربط الثنائي
TWO_WAY_BINDING
    : '[(' IDENTIFIER ')]'
    ;

// القوسين والمحددات
ANGULAR_SYMBOLS
    : '{' | '}' | '[' | ']' | '=' | ':' | ';' | ',' | '.' | '@'
    ;

// تعبيرات Angular (Interpolation)
INTERPOLATION_START
    : '{{' -> pushMode(ANGULAR_EXPRESSION_MODE)
    ;

// الربط الحدثي
EVENT_BINDING
    : EVENT_BINDING_START IDENTIFIER  EVENT_BINDING_START
    ;
fragment EVENT_BINDING_START
   : '('
   ;
fragment EVENT_BINDING_END
   : ')'
   ;

// أوضاع تعبيرات Angular
mode ANGULAR_EXPRESSION_MODE;

ANGULAR_OPERATOR
    : '+' | '-' | '*' | '/' // العمليات الحسابية
    ;

ANGULAR_LITERAL
    : '"' .*? '"' | '\'' .*? '\'' // النصوص
    ;

INTERPOLATION_END
    : '}}' -> popMode
    ;

// المكونات المشتركة بين HTML و Angular
IDENTIFIER
    : [a-zA-Z_][a-zA-Z0-9_]*    // معرف عام
    ;

STRING
    : '"' .*? '"'               // نصوص بين علامات اقتباس مزدوجة
    | '\'' .*? '\''             // نصوص بين علامات اقتباس مفردة
    ;

NUMBER
    : [0-9]+                    // الأرقام
    ;
