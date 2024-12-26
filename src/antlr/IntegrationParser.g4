parser grammar IntegrationParser;

options { tokenVocab = IntegrationLexer; }

// **القاعدة الرئيسية للملف**
htmlDocument
    : htmlElement+ EOF
    ;


htmlElement
    : TAG_OPEN tagName (attribute)* (TAG_CLOSE htmlContent? TAG_OPEN TAG_SLASH tagName TAG_CLOSE | TAG_SLASH_CLOSE)
    ;



// **محتوى عنصر HTML**
htmlContent
    :htmlElement
    |interpolation
    |HTML_TEXT
    ;

// **اسم التاغ**
tagName
    : TAG_NAME
    ;

// **السمات العامة**
attribute
    : TAG_NAME (TAG_EQUALS  ATTVALUE_VALUE)?
    | eventBinding
    ;

// **توجيهات Angular**
angularDirective
    : NG_DIRECTIVES TAG_EQUALS angularExpression
    ;

// **تعبيرات Angular**
angularExpression
    : STRING
    ;

// **التعبيرات الديناميكية (Interpolation)**
angularInterpolation
    : INTERPOLATION_START expression INTERPOLATION_END
    ;



binding
     : propertyBinding
     | eventBinding
     | twoWayBinding
     ;

interpolation
     : INTERPOLATION_START expression INTERPOLATION_END
     ; // مثال: {{ user.name }}

 // ربط الخصائص (Property Binding)
 // ربط ديناميكي بين متغير وخصائص عنصر HTML
 propertyBinding
     :PROPERTY_BINDING
     ; // مثال: [src]="imageUrl"

 // ربط الأحداث (Event Binding)
 // ربط حدث (مثل النقر) بدالة في المكون
 eventBinding
     :EVENT_BINDING
     ; // مثال: (click)="onClick()"

 // الربط الثنائي (Two-way Binding)
 // لربط بيانات المكون مع واجهة المستخدم ثنائي الاتجاه
 twoWayBinding
     :TWO_WAY_BINDING
     ; // مثال: [(ngModel)]="user.name"



// **تعبير داخل Interpolation**
expression:
    IDENTIFIER                     // تعبير بسيط

;
























































/*
parser grammar IntegrationParser;
import HtmlParser,AngularParser,TypeScriptParser;
options { tokenVocab = IntegrationLexer; }
htmlAngularDocument
    : htmlAngularElement+ EOF
    ;

htmlAngularElement
    : TAG_OPEN TAG_NAME htmlAngularAttributes*
      (TAG_CLOSE (htmlAngularContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)? | TAG_SLASH_CLOSE)
    ;

htmlAngularContent
    : htmlChardata? ((htmlAngularElement | angularStructuralDirective | angularExpression) htmlChardata?)*
    ;


htmlAngularAttributes
    : htmlAttribute
    | propertyBinding
    | angularEventBinding
    | angularTwoWayBinding
    | angularStructuralDirective
    ;


angularStructuralDirective
    : ngForDirective
    | NGIF ASSIGN expression (ELSE IDENTIFIER)?
    ;

ngForBody
    : LET IDENTIFIER OF expression
    ;


angularPropertyBinding
    : PROPERTY_BINDING ASSIGN expression
    ;

angularEventBinding
    : EVENT_BINDING ASSIGN expression
    ;

angularTwoWayBinding
    : TWO_WAY_BINDING ASSIGN expression
    ;


angularExpression
    : INTERPOLATION_START expression INTERPOLATION_END
    ;


htmlChardata
    : HTML_TEXT
    | SEA_WS
    ;

*/























/*
// **القاعدة الجذرية للنص الكامل**
file
    : importStatement* component* EOF;

importStatement
    : IMPORT LBRACE importList RBRACE FROM STRING SEMICOLON
    ;
// **تعريف المكونات**
component
    : AT SELECTOR LBRACE componentBody RBRACE;

componentBody
    : (selector | template | styles | standalone | imports)*;

selector
    : SELECTOR COLON STRING;

template
    : TEMPLATE COLON STRING
    | TEMPLATE COLON '`' templateBody '`';

templateBody
    : (htmlElement | angularExpression)*;

styles
    : STYLES COLON STRING;

standalone
    : STANDALONE COLON BOOLEAN;

imports
    : IMPORT LBRACE importList RBRACE FROM STRING;

importList
    : IDENTIFIER (COMMA IDENTIFIER)*;

// **عناصر HTML**
htmlElement
    : TAG_OPEN htmlAttributes? TAG_SELF_CLOSE
    | TAG_OPEN htmlAttributes? TAG_CLOSE htmlContent TAG_CLOSE;

htmlAttributes
    : (HTML_ATTRIBUTE_NAME HTML_ATTRIBUTE_EQUAL HTML_ATTRIBUTE_VALUE)*;

htmlContent
    : (htmlElement | angularExpression | STRING)*;

// **تعبيرات Angular**
angularExpression
    : INTERPOLATION_START angularExpressionBody INTERPOLATION_END;

angularExpressionBody
    : (IDENTIFIER | NUMBER | BOOLEAN | STRING | angularOperators)+;

angularOperators
    : PLUS | MINUS | MULTIPLY | DIVIDE | EQUAL | NOT | PIPE;
*/
