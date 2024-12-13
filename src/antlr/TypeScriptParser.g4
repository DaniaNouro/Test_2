parser grammar TypeScriptParser;

// تعريف خيارات المترجم
options { tokenVocab = TypeScriptLexer; }

// البرنامج الرئيسي يحتوي على تعريفات الكلاسات
program: ts_classDeclaration+;

// تعريف الكلاس باستخدام الكلمة المفتاحية EXPORT وCLASS مع الجسم الخاص به
ts_classDeclaration:
    EXPORT CLASS IDENTIFIER LCURLY ts_classBody RCURLY;

// الجسم الخاص بالكلاس، يحتوي على أعضاء الكلاس
ts_classBody:
     ts_classBodyMember*;

// عضو في الجسم الخاص بالكلاس، يمكن أن يكون enum أو عضو كلاس آخر
ts_classBodyMember:
       ts_enumDeclaration
       | ts_classMember;

// تعريف نوع enum مع أعضائه
ts_enumDeclaration:
    ENUM IDENTIFIER LCURLY ts_enumMember (COMMA ts_enumMember)* RCURLY;

// تعريف عضو ضمن enum
ts_enumMember:
    IDENTIFIER;

// عضو الكلاس يمكن أن يكون متغيرًا، دالة، أو دالة سهمية
ts_classMember:
    ts_variableDeclaration
    | ts_methodDeclaration
    | ts_arrowFunctionDeclaration;

// تعريف متغير داخل الكلاس
ts_variableDeclaration:
    (LET)? IDENTIFIER (COLON ts_typeWithBrackets)?  EQ  ts_value SEMICOLON;

// تعريف مصفوفة تحتوي على قيم
ts_array:
    LBRACK (ts_value (COMMA ts_value)*)? RBRACK;

// تعريف دالة داخل الكلاس
ts_methodDeclaration:
    IDENTIFIER (EQ FUNCTION)? LPAREN ts_parameterList? RPAREN (COLON ts_typeWithBrackets)? LCURLY ts_methodBody RCURLY;

// جسم الدالة يمكن أن يحتوي على عمليات أو جمل برمجية
ts_methodBody:
    THIS DOT IDENTIFIER EQ LPAREN ts_value AS IDENTIFIER RPAREN DOT IDENTIFIER SEMICOLON
    | ts_statement*;

// قائمة المعاملات التي تقبلها الدالة
ts_parameterList:
    ts_parameter (COMMA ts_parameter)*;

// تعريف معامل لدالة مع خيارات للتوسيع أو القيم الافتراضية
ts_parameter:
    IDENTIFIER (QUESTION_MARK)? COLON ts_typeWithBrackets (EQ ts_value)?
    | (SPREAD)? IDENTIFIER (COLON ts_typeWithBrackets)? (EQ ts_value)?;

// تعريف نوع البيانات مع إمكانية استخدام الأقواس
ts_typeWithBrackets:
    TYPE
    |TYPE OR NULL
    |TYPE OR TYPE
    | IDENTIFIER
    | TYPE LBRACK RBRACK
    | ts_tupleType
    | ts_enumType
    | ts_objectType;

// تعريف نوع بيانات الكائن (object)
ts_objectType:
    LCURLY ts_objectTypeProperty (SEMICOLON ts_objectTypeProperty)* SEMICOLON? RCURLY;

// خاصية داخل نوع بيانات الكائن
ts_objectTypeProperty:
    IDENTIFIER COLON ts_typeWithBrackets;

// تعريف نوع enum كمتحول
ts_enumType:
    IDENTIFIER DOT IDENTIFIER;

// تعريف نوع tuple
ts_tupleType:
    LBRACK ts_typeWithBrackets (COMMA ts_typeWithBrackets)* RBRACK;

// تعريف القيم التي يمكن استخدامها
ts_value:
    STRING
    | NUMBER
    | BOOLEAN
    | NULL
    | THIS
    | IDENTIFIER
    |ts_array
    | ts_object
    | LPAREN ts_expression RPAREN
    | ts_tupleValue
    | ts_parenthesizedValue
    | ts_methodInvocation
    | ts_negation
    | ts_enumType
    | ts_templateString
    | ts_value QUESTION_MARK ts_value COLON ts_value
    |THIS DOT IDENTIFIER
    | ts_value DOT IDENTIFIER LPAREN ts_argumentList? RPAREN;

// تعريف دالة سهمية
ts_arrowFunctionDeclaration:
    IDENTIFIER EQ LPAREN ts_parameterList? RPAREN (COLON ts_typeWithBrackets)? ARROW ts_value* (OPERATION ts_value)* SEMICOLON;

// تعريف نصوص قوالب يمكن أن تحتوي على تعبيرات
ts_templateString:
    BACKTICK (ts_templateExpression | .)* BACKTICK;

// تعريف تعبير داخل نص قالب
ts_templateExpression:
    SDOLER LCURLY ts_value RCURLY;

// تعريف قيم tuple
ts_tupleValue:
    LBRACK ts_value (COMMA ts_value)* RBRACK;

// تعريف كائن يحتوي على خصائص
ts_object:
    LCURLY (ts_objectProperty (COMMA ts_objectProperty)*)? RCURLY;

// خاصية داخل كائن
ts_objectProperty:
    IDENTIFIER COLON ts_value
    | IDENTIFIER;

// تعريف جملة برمجية
ts_statement:
    ts_variableDeclaration
    | ts_methodInvocation
    |ts_ifStatement
    | ts_assignment
    | ts_returnStatement;

// تعريف جملة إرجاع (return)
ts_returnStatement:
    RETURN ts_value* (OPERATION ts_value)* SEMICOLON;

// استدعاء دالة داخل الكود
ts_methodInvocation:
    (THIS DOT IDENTIFIER | IDENTIFIER) (DOT IDENTIFIER)* LPAREN ts_argumentList? RPAREN SEMICOLON;

// قائمة الوسائط عند استدعاء دالة
ts_argumentList:
    ts_value (COMMA ts_value)*;

// نفي قيمة أو تعبير
ts_negation:
    NOT ts_value;

// تعريف جملة شرطية if
ts_ifStatement:
    IF LPAREN   ts_ex RPAREN LCURLY ts_statement* RCURLY
    (ELSE (ts_ifStatement | LCURLY ts_statement* RCURLY))?;

// تعبير داخل جملة شرطية
ts_ex:
    ts_expression| NOT ts_expression;

// تعريف تعبير يمكن أن يكون عملية مقارنة أو شرط
ts_expression:
    ts_value
    | ts_methodInvocation
    | ts_p1
    | ts_value COMPARISON_OPERATOR ts_value
    | ts_value (COMPARISON_OPERATOR ts_value)?
    | ts_expression LOGICAL_OPERATOR ts_expression
    | ts_value QUESTION_MARK ts_value COLON ts_value;

// جزء من تعبير يحتوي على عمليات أو مقارنات
ts_p1:
    ts_value(EQ|COMPARISON_OPERATOR ts_value)? ;

// تعريف عملية إسناد قيم
ts_assignment:
    (THIS DOT IDENTIFIER | IDENTIFIER (DOT IDENTIFIER)*) EQ ts_expression SEMICOLON;

// تعريف قيمة داخل أقواس
ts_parenthesizedValue:
    LPAREN ts_value RPAREN;

