//lexer grammar AngularLexer;
//
//
//// الكلمات المفتاحية (Keywords)
//SELECTOR       : 'Component' ;         // لتعريف المكون
//TEMPLATE       : 'template' ;           // لتحديد القالب
//STYLES         : 'styles' ;             // لتحديد الأنماط
//STANDALONE     : 'standalone' ;         // خيار مكون مستقل
//NGFOR          : '*ngFor' ;
//NGIF           : '*ngIf' ;
//NGSWITCH       : '*ngSwitch' ;
//NGSWITCHCASE   : '*ngSwitchCase' ;
//NGSWITCHDEFAULT: '*ngSwitchDefault' ;
//
//TEMPLATEURL    : 'templateUrl';
//BOOLEAN        : 'true'  | 'false' ;
//ELSE           : 'else' ;
//OF             : 'of';
//LET            : 'let';
//AS             : 'as';
//
//
//// Data Binding Symbols

//PROPERTY_BINDING    : '[' IDENTIFIER ']'; // [property]
//EVENT_BINDING       : '(' IDENTIFIER ')'; // (event)
//TWO_WAY_BINDING     : '[(' IDENTIFIER ')]'; // [(ngModel)]
////TEXT                : ~[\{\}\[\]\(\)]*;
////OPERATOR : PLUS | MINUS | MULTIPLY | DIVIDE | EQUAL | NOT_EQUAL | AND | OR | LESS | LESS_EQUAL | GREATER | GREATER_EQUAL ;
//
//
//
//
//// الرموز (Symbols)
//LPAREN         : '(' ;                  // قوس مفتوح
//RPAREN         : ')' ;                  // قوس مغلق
//LBRACE         : '{' ;                  // قوس معقوف مفتوح
//RBRACE         : '}' ;                  // قوس معقوف مغلق
//LBRACKET       : '[' ;                  // قوس مربع مفتوح
//RBRACKET       : ']' ;                  // قوس مربع مغلق
//ASSIGN         : '=' ;                  // رمز التخصيص
//COLON          : ':' ;                  // النقطتين
//SEMICOLON      : ';' ;                  // فاصلة منقوطة
//COMMA          : ',' ;                  // فاصلة
//DOT            : '.' ;                  // نقطة
//AT             : '@' ;                   //تاغ
//DOUBLE_QUOTE_STRING : '"' ;
//
//
//PLUS        : '+' ;
//MINUS       : '-' ;
//MULTIPLY    : '*' ;
//DIVIDE      : '/' ;
//EQUAL       : '==' ;
//NOT_EQUAL   : '!=' ;
//LESS        : '<' ;
//LESS_EQUAL  : '<=' ;
//GREATER     : '>' ;
//GREATER_EQUAL : '>=' ;
//AND         : '&&' ;
//OR          : '||' ;
//NOT         : '!' ;
//QUESTION     : '?' ;   // تعريف رمز علامة الاستفهام
//PIPE         : '|' ;   // تعريف رمز الـ Pipe
//
//// أنواع البيانات (Data Types)
//// النصوص (Strings)
///*
//STRING
//    : '"' .*? '"'
//    | '\'' .*? '\''
//    | '`' .*? '`'  // لدعم النصوص المحاطة بـ backticks
//    ;
//
//NO_NEWLINE_STRING
//    : '\'' ~[\r\n]* '\''
//    | '"' ~[\r\n]* '"'
//    ;
//*/
//STRING
//    : '"' (ESC|~["\r\n])* '"'//'"' (~["])* '"'  // سلسلة نصية بعلامات اقتباس مزدوجة، متعددة الأسطر
//    | '\'' (ESC|~['\r\n])* '\'' // سلسلة نصية بعلامات اقتباس مفردة، متعددة الأسطر
//    | '`' (ESC|~[`])* '`'       // سلسلة نصية بـ backticks، متعددة الأسطر
//    ;
//
//
//SINGLE_LINE_STRING
//    : '"' ~[\r\n]* '"'          // سلسلة نصية بعلامات اقتباس مزدوجة، سطر واحد فقط
//    | '\'' ~[\r\n]* '\''         // سلسلة نصية بعلامات اقتباس مفردة، سطر واحد فقط
//    ;
//
//
//ESC : '\\' . ; // هذا يتعامل مع أحرف الإفلات
//
//
//IDENTIFIER     : [a-zA-Z_][a-zA-Z0-9_]* ; // معرف (متغير أو دالة)
//NUMBER         : [0-9]+ ;               // رقم
//WHITESPACE     : [ \t\r\n]+ -> skip ;   // تجاهل المسافات
//// For capturing content inside bindings
////TEXT                : ~[\{\}\[\]\(\)]*;


///////////////////////////////////22

lexer grammar AngularLexer;

// **الكلمات المفتاحية (Keywords)**
SELECTOR       : 'Component';       // لتعريف المكون
TEMPLATE       : 'template';        // لتحديد القالب
STYLES         : 'styles';          // لتحديد الأنماط
STANDALONE     : 'standalone';      // خيار مكون مستقل
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


// **البيانات والتجليد (Data Binding)**

PROPERTY_BINDING    : '[' IDENTIFIER ']';                      // [property]
EVENT_BINDING       : '(' IDENTIFIER ')';                      // (event)
TWO_WAY_BINDING     : '[(' IDENTIFIER ')]';                    // [(ngModel)]

// **الرموز (Symbols)**
  LPAREN        : '(';                   // قوس مفتوح
  RPAREN        : ')';                   // قوس مغلق
  LBRACE        : '{';                   // قوس معقوف مفتوح
  RBRACE        : '}';                   // قوس معقوف مغلق
  LBRACKET      : '[';                   // قوس مربع مفتوح
  RBRACKET      : ']';                   // قوس مربع مغلق
  ASSIGN        : '=';                   // رمز التخصيص
  COLON         : ':';                   // النقطتين
  SEMICOLON     : ';';                   // فاصلة منقوطة
 COMMA         : ',';                   // فاصلة
 DOT           : '.';                   // نقطة
 AT            : '@';                   //تاغ

 PLUS          : '+';
 MINUS         : '-';
 MULTIPLY      : '*';
 DIVIDE        : '/';
 EQUAL         : '==';
 NOT_EQUAL     : '!=';
 LESS          : '<';
 LESS_EQUAL    : '<=';
 GREATER       : '>';
 GREATER_EQUAL : '>=';
 AND           : '&&';
 OR            : '||';
 NOT           : '!';
 QUESTION      : '?';   // تعريف رمز علامة الاستفهام
 PIPE          : '|';   // تعريف رمز الـ Pipe




HTML_TEMPLATE
    : '`' -> pushMode(HTML_MODE)
    ;


// **النصوص (Strings)**
STRING
    : '"' (ESC | ~["\r\n] )* '"'
    | '\'' (ESC | ~['\r\n])* '\''
    //| '`' (ESC | ~[`{([])* '`'
    ;

fragment ESC : '\\' .; // للتعامل مع أحرف الإفلات

// **المعرفات والأرقام (Identifiers & Numbers)**

mode ANGULAR_EXPRESSION_MODE;
IDENTIFIER
    : [a-zA-Z_][a-zA-Z0-9_]* // معرفات مثل: selectedProduct
    ;
PIPE_OPERATOR
    : '|'
    ;

BOOLEAN_OPERATOR
    : '&&' | '||'
    ;

ARITHMETIC_OPERATOR
    : '+' | '-' | '*' | '/'
    ;

RELATIONAL_OPERATOR
    : '<' | '<=' | '>' | '>=' | '==' | '!='
    ;

PUNCTUATION
    : '.' | ',' | ':' | '?'
    ;

LITERAL
    : STRING | NUMBER | BOOLEAN
    ;

WHITESPACE
    : [ \t\r\n]+ -> skip
    ;
//IDENTIFIER    : [a-zA-Z_][a-zA-Z0-9_]*; // معرف
NUMBER        : [0-9]+;                // رقم
//WHITESPACE    : [ \t\r\n]+ -> skip;    // تجاهل المسافات
INTERPOLATION_END   : '}}' -> popMode;

//Htmllll
HTML_COMMENT
    : '<!--' .*? '-->'
    ;
  HTML_TEXT
          : ~[<*]+
          ;

HTML_CONDITIONAL_COMMENT
    : '<![' .*? ']>'
    ;

XML
    : '<?xml' .*? '>'
    ;

CDATA
    : '<![CDATA[' .*? ']]>'
    ;


DTD
    : '<!' .*? '>'
    ;


SCRIPTLET
    : '<?' .*? '?>'
    | '<%' .*? '%>'
    ;

SEA_WS
    :  (' '|'\t'|'\r'? '\n')+
    ;

SCRIPT_OPEN
    : '<script' .*? '>' ->pushMode(SCRIPT)
    ;

STYLE_OPEN
    : '<style' .*? '>'  ->pushMode(STYLE)
    ;


 mode HTML_MODE;

// HTML_CONTENT
//     : ~[`<]+ // نص HTML عادي
//     ;

INTERPOLATION_START : '{{'->pushMode(ANGULAR_EXPRESSION_MODE);

 HTML_TEMPLATE_END
      : '`' -> popMode
      ;


TAG_OPEN
   : LESS -> pushMode(TAG)
    ;



// tag declarations




mode TAG;

NG_ATTRBIUTE: '!';
SINGLE_QOUTE: '\'';
//NGFOR: '*ngfor';
ID: 'x';
IN: 'in';

TAG_CLOSE
    : '>' -> popMode
    ;

TAG_SLASH_CLOSE
    : '/>' -> popMode
    ;

TAG_SLASH
    : '/'
    ;


// lexing mode for attribute values

TAG_EQUALS
    : '=' -> pushMode(ATTVALUE)
    ;

TAG_NAME
    : TAG_NameStartChar TAG_NameChar*
    ;

TAG_WHITESPACE
    : [ \t\r\n] -> channel(HIDDEN)
    ;

fragment
HEXDIGIT
    : [a-fA-F0-9]
    ;

fragment
DIGIT
    : [0-9]
    ;

fragment
TAG_NameChar
    : TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
    | '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
    ;

fragment
TAG_NameStartChar
    : [:a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;


// <scripts>

mode SCRIPT;

SCRIPT_BODY
    : .*? '</script>' -> popMode
    ;

SCRIPT_SHORT_BODY
    : .*? '</>' -> popMode
    ;


// <styles>

mode STYLE;

STYLE_BODY
    : .*? '</style>' -> popMode
    ;

STYLE_SHORT_BODY
    : .*? '</>' -> popMode
    ;


// attribute values

mode ATTVALUE;

// an attribute value may have spaces b/t the '=' and the value
ATTVALUE_VALUE
    : ' '* ATTRIBUTE -> popMode
    ;


ATTRIBUTE
    : DOUBLE_QUOTE_STRING
    | SINGLE_QUOTE_STRING
    | ATTCHARS
    | HEXCHARS
    | DECCHARS
    ;


fragment ATTCHARS
    : ATTCHAR+ ' '?
    ;

fragment ATTCHAR
    : '-'
    | '_'
    | '.'
    | '/'
    | '+'
    | ','
    | '?'
    | '='
    | ':'
    | ';'
    | '#'
    | [0-9a-zA-Z]
    ;

fragment HEXCHARS
    : '#' [0-9a-fA-F]+
    ;

fragment DECCHARS
    : [0-9]+ '%'?
    ;

fragment DOUBLE_QUOTE_STRING
    : '"' ~[<"]* '"'
    ;
fragment SINGLE_QUOTE_STRING
    : '\'' ~[<']* '\''
    ;





































// **وضع تحليل تعبيرات Angular (ANGULAR_EXPRESSION_MODE)**
//mode ANGULAR_EXPRESSION_MODE;
//
////ANGULAR_EXPRESSION_CONTENT
////    : ~[\{\}]+;                      // النصوص داخل التعبير
//ANGULAR_EXPRESSION_END
//    : '}}' -> popMode;               // العودة إلى الوضع السابق

//fragment DOUBLE_QUOTE_STRING
//    : '"'
//    ;
//fragment SINGLE_QUOTE_STRING
//    : '\'' ~[<']* '\''
//    ;

/*
lexer grammar AngularLexer;

// **الكلمات المفتاحية (Keywords)**
SELECTOR       : 'Component';       // لتعريف المكون
TEMPLATE       : 'template';        // لتحديد القالب
STYLES         : 'styles';          // لتحديد الأنماط
STANDALONE     : 'standalone';      // خيار مكون مستقل
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

// **البيانات والتجليد (Data Binding)**
INTERPOLATION_START : '{{' -> pushMode(ANGULAR_EXPRESSION_MODE); // بدء التعبير
INTERPOLATION_END   : '}}' -> popMode;                          // انتهاء التعبير

PROPERTY_BINDING
    : '[' IDENTIFIER ']';  // [property]
EVENT_BINDING
    : '(' IDENTIFIER ')';  // (event)
TWO_WAY_BINDING
    : '[(' IDENTIFIER ')]'; // [(ngModel)]

// **الرموز (Symbols)**
LPAREN        : '(';  // قوس مفتوح
RPAREN        : ')';  // قوس مغلق
LBRACE        : '{';  // قوس معقوف مفتوح
RBRACE        : '}';  // قوس معقوف مغلق
LBRACKET      : '[';  // قوس مربع مفتوح
RBRACKET      : ']';  // قوس مربع مغلق
ASSIGN        : '=';  // رمز التخصيص
COLON         : ':';  // النقطتين
SEMICOLON     : ';';  // فاصلة منقوطة
COMMA         : ',';  // فاصلة
DOT           : '.';  // نقطة
AT            : '@';  // تاغ

PLUS          : '+';
MINUS         : '-';
MULTIPLY      : '*';
DIVIDE        : '/';
EQUAL         : '==';
NOT_EQUAL     : '!=';
LESS          : '<';
LESS_EQUAL    : '<=';
GREATER       : '>';
GREATER_EQUAL : '>=';
AND           : '&&';
OR            : '||';
NOT           : '!';
QUESTION      : '?';  // تعريف رمز علامة الاستفهام
PIPE          : '|';  // تعريف رمز الـ Pipe

// **النصوص (Strings)**
STRING
    : '"' (ESC | ~["\r\n])* '"'
    | '\'' (ESC | ~['\r\n])* '\''
    | '`' (ESC | ~[`])* '`'
    ;

fragment ESC : '\\' .; // للتعامل مع أحرف الإفلات

// **المعرفات والأرقام (Identifiers & Numbers)**
IDENTIFIER    : [a-zA-Z_][a-zA-Z0-9_]*; // معرف
NUMBER        : [0-9]+;                 // رقم
WHITESPACE    : [ \t\r\n]+ -> skip;     // تجاهل المسافات

// **الوضع الأساسي للتعبيرات داخل Angular**
mode ANGULAR_EXPRESSION_MODE;

// التعبيرات داخل {{ }}
ANGULAR_EXPRESSION_CONTENT
    : ~[\{\}]+;  // النصوص داخل التعبير

ANGULAR_EXPRESSION_END
    : '}}' -> popMode; // العودة إلى الوضع الأساسي

// **دمج HTML ضمن قوالب Angular**
TEMPLATE_START
    : 'template:`' -> pushMode(HTML_MODE); // نقل التحكم إلى HTML

TEMPLATE_END
    : '`' -> popMode; // العودة إلى الوضع الأساسي

// **تحديد الوضع عند نهاية نصوص HTML داخل القوالب**
mode HTML_MODE;

HTML_TEXT
    : ~[`]* '`' -> popMode;
*/


//PROPERTY_BINDING_START
//    : '[' -> pushMode(ANGULAR_EXPRESSION_MODE)
//    ;
//
//PROPERTY_BINDING_END
//    :']' ->popMode
//    ;
//
//EVENT_BINDING_START
//    : '(' ->pushMode(ANGULAR_EXPRESSION_MODE)
//    ;
//
//EVENT_BINDING_END
//    : ')' ->popMode
//    ;
//
//TWO_WAY_BINDING_START
//    :  '[(' ->pushMode(ANGULAR_EXPRESSION_MODE)
//    ;
//TWO_WAY_BINDING_END
//        :  ')]' ->popMode
//        ;