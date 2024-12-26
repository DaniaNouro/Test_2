parser grammar CssParser;
options {tokenVocab=CssLexer;}
stylesheet
    : rule+
    ;

rule
    : selector OPEN property* ClOSE
    ;

selector
    : CLASS_SELECTOR
    ;

property
    : PROPERTY_NAME TwoPoint PROPERTY_VALUE Simicolon
    ;