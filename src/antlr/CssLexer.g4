lexer grammar CssLexer;

OPEN:'{';
ClOSE:'}';
TwoPoint: ':';
Simicolon: ';';
CLASS_SELECTOR : '.' [a-zA-Z0-9_-]+;
PROPERTY_NAME : [a-zA-Z-]+;
PROPERTY_VALUE : ~[;]+;
WS : [ \t\r\n]+ -> skip;
