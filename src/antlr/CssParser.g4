parser grammar CssParser;

options { tokenVocab=CssLexer; }

/* القواعد */

/* القاعدة الرئيسية التي تحتوي على مجموعة من القواعد (rules) وتنتهي بـ EOF */
stylesheet: rule+ EOF;

/* تعريف قاعدة لكل قاعدة CSS، تحتوي على محدد (selector) واختياريًا Pseudo-Class
   وكتلة الخصائص المحاطة بالأقواس */
rule: selector PSEUDO_CLASS? LBRACE property* RBRACE;

/* تعريف محددات CSS، يمكن أن تكون معرفًا (identifier) أو مجموعة من الأصناف (classes) أو معرف ID */
selector: IDENTIFIER | CLASS* | ID;

/* تعريف خصائص CSS، تتكون من اسم الخاصية وقيمتها، وتنتهي بفاصلة منقوطة */
property: IDENTIFIER COLON value SEMICOLON;

/* تعريف القيم التي يمكن أن تحتوي على عناصر متعددة مثل أرقام، دوال، وحدات، أو كلمات مفتاحية */
value: (valueItem | SPACE | IDENTIFIER(COMMA IDENTIFIER)? | NUMBER | FUNCTION | FUNCTION1 | UNIT | KEYWORD)*;

/* تعريف عناصر القيم التي تشمل ألوان، وحدات، نصوص، كلمات مفتاحية، أو دوال */
valueItem: COLOR | UNIT | STRING | KEYWORD | FUNCTION;
