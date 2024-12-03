
parser grammar HtmlParser;
options {tokenVocab=HtmlLexer;}

// قواعد البداية
htmlElement
    : OPEN_TAG tagName (attribute | angularAttribute)* CLOSE_TAG (htmlElement | text)* END_TAG?
    ;

//// تعريف النصوص
text
    : TEXT
    ;

// تعريف أسماء العناصر
tagName
    : TAG_NAME
    ;

// تعريف السمات العادية
attribute
    : ATTR_NAME EQUAL ATTR_VALUE
    ;

// تعريف خصائص Angular
angularAttribute
    : ANGULAR_BINDING
    | ANGULAR_EVENT
    | ANGULAR_DIRECTIVE
    ;