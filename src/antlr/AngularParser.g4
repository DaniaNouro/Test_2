parser grammar AngularParser;
//import HtmlParser;
 options { tokenVocab = AngularLexer; }

 // القاعدة الرئيسية (Root Rule)
 // برنامج مكون من مكونات متعددة وينتهي بنهاية الملف
 program
     : component+ EOF
     ; // مثال: @Component({ selector: 'app-root', template: '<h1>Hello World</h1>' })

 // تعريف المكون (Component Definition)
 // تعريف المكون باستخدام @Component مع محتوى الجسم
 component
     : AT SELECTOR LPAREN LBRACE componentBody RBRACE RPAREN

     ; // مثال: @Component({ selector: 'app-root', templateUrl: './app.component.html' })

 // محتوى المكون (Component Body)
 // يحتوي على خاصية إلزامية واحدة على الأقل مع إمكانية إضافة خصائص اختيارية
 componentBody
     : mandatoryProperty (COMMA optionalProperty)* COMMA?
     ; // مثال: { templateUrl: './app.component.html', styles: 'h1 { color: blue; }' }

 // قاعدة إلزامية (Mandatory Property)
 // تحتوي على القالب أو رابط القالب
 mandatoryProperty
     : template
     | templateUrl
     ; // مثال: template: '<h1>Hello World</h1>', templateUrl: './app.component.html'

 // قاعدة اختيارية (Optional Property)
 // تحتوي على الأنماط، Standalone، أو عمليات الربط
 optionalProperty
     : propertyAssign
     | styles
     | standalone
     | binding
     | directive
     ; // مثال: styles: 'h1 { color: blue; }', standalone: true

 // خاصية مكون (Component Property Assignment)
 // خاصية تأخذ اسمًا وقيمة
 propertyAssign
     : IDENTIFIER COLON value COMMA?
     ; // مثال: styles: 'h1 { color: red; }'

 // تعريف القالب (Template Definition)
 // القالب يمكن أن يكون نصًا متعدد الأسطر أو نصًا بسطر واحد

htmlTemplate
    : HTML_TEMPLATE  /*{pushMode(TAG);}*/htmlDocument HTML_TEMPLATE_END /*{popMode();}*/
    ;


 template
     : TEMPLATE COLON  htmlTemplate
     | TEMPLATE COLON STRING
     ; // مثال: template: '<h1>Hello World</h1>'

 // رابط القالب (Template URL Definition)
 // يشير إلى ملف قالب خارجي
 templateUrl
     : TEMPLATEURL COLON STRING
     ; // مثال: templateUrl: './app.component.html'

 // الأنماط (Styles Definition)
 // لتعريف أنماط CSS
 styles
     : STYLES COLON (SINGLE_LINE_STRING | STRING)
     ; // مثال: styles: 'h1 { color: blue; }'

 // تعريف Standalone
 // خاصية تحدد إذا كان المكون مستقلًا
 standalone
     : STANDALONE COLON BOOLEAN
     ; // مثال: standalone: true

 // عمليات الربط (Data Binding)
 // تشمل الربط النصي، ربط الخصائص، ربط الأحداث، والربط الثنائي
 binding
     : interpolation
     | propertyBinding
     | eventBinding
     | twoWayBinding
     ; // مثال: {{ user.name }}, [src]="imageUrl", (click)="onClick()", [(ngModel)]="user.name"


directive
     : ngIfDirective
     | ngForDirective
     ;
 // ربط النصوص (Interpolation)
 // لعرض قيمة ديناميكية باستخدام الأقواس المزدوجة {{ }}
 interpolation
     : INTERPOLATION_START expression INTERPOLATION_END
     ; // مثال: {{ user.name }}

 // ربط الخصائص (Property Binding)
 // ربط ديناميكي بين متغير وخصائص عنصر HTML
 propertyBinding
     : PROPERTY_BINDING ASSIGN expression
     ; // مثال: [src]="imageUrl"

 // ربط الأحداث (Event Binding)
 // ربط حدث (مثل النقر) بدالة في المكون
 eventBinding
     : EVENT_BINDING ASSIGN expression
     ; // مثال: (click)="onClick()"

 // الربط الثنائي (Two-way Binding)
 // لربط بيانات المكون مع واجهة المستخدم ثنائي الاتجاه
 twoWayBinding
     : TWO_WAY_BINDING ASSIGN expression
     ; // مثال: [(ngModel)]="user.name"

 // التعبيرات (Expressions)
 // أي تعبير يمكن تقييمه إلى قيمة
 /*
 expression
     : pipeExpr
     ; // مثال: {{ user.name | uppercase }}

 // تعبير Pipe
 // لتحويل القيم باستخدام أنابيب (Pipes)
 pipeExpr
     : ternaryExpr (PIPE IDENTIFIER (PIPE IDENTIFIER)*)?
     ; // مثال: {{ user.name | uppercase | slice:0:5 }}

 // تعبير الشرط الثلاثي (Ternary Expression)
 // تعبير شرط بسيط يتبع الصيغة condition ? value1 : value2
 ternaryExpr
     : logicalOrExpr (QUESTION expression COLON expression)?
     ; // مثال: {{ isLoggedIn ? 'Welcome' : 'Please Login' }}

 // التعبير المنطقي (Logical OR)
 // يستخدم العمليات المنطقية OR
 logicalOrExpr
     : logicalAndExpr (OR logicalAndExpr)*
     ; // مثال: a || b

 // التعبير المنطقي (Logical AND)
 // يستخدم العمليات المنطقية AND
 logicalAndExpr
     : equalityExpr (AND equalityExpr)*
     ; // مثال: a && b

 // تعبير المساواة (Equality Expression)
 // للتحقق من المساواة أو عدم المساواة
 equalityExpr
     : relationalExpr ((EQUAL | NOT_EQUAL) relationalExpr)?
     ; // مثال: a == b, a != b

 // التعبير العلائقي (Relational Expression)
 // يقارن بين القيم (أكبر، أصغر، إلخ)
 relationalExpr
     : additiveExpr ((LESS | LESS_EQUAL | GREATER | GREATER_EQUAL) additiveExpr)?
     ; // مثال: a < b, a >= b

 // التعبير الجمعي (Additive Expression)
 // العمليات الحسابية + و -
 additiveExpr
     : multiplicativeExpr ((PLUS | MINUS) multiplicativeExpr)*
     ; // مثال: a + b, a - c

 // التعبير الضربي (Multiplicative Expression)
 // العمليات الحسابية * و /
 multiplicativeExpr
     : unaryExpr ((MULTIPLY | DIVIDE) unaryExpr)*
     ; // مثال: a * b, c / d

 // التعبير الأحادي (Unary Expression)
 // تعبير يحتوي على عامل وحيد (! أو -)
 unaryExpr
     : (NOT | MINUS)? primaryExpr
     ; // مثال: -a, !isTrue

 // التعبير الأساسي (Primary Expression)
 // العناصر الأساسية للتعبيرات
 primaryExpr
     : IDENTIFIER
     | literal
     | functionCall
     | LPAREN expression RPAREN
     | arrayAccess
     | objectAccess
     ; // مثال: user.name, calculateSum(a, b), items[0]

 // القيم الحرفية (Literals)
 // الأرقام، النصوص، أو القيم المنطقية
 literal
     : NUMBER
     | STRING
     | BOOLEAN
     ; // مثال: 42, "Hello", true

 // استدعاء الدالة (Function Call)
 // استدعاء دالة مع المعاملات
 functionCall
     : IDENTIFIER LPAREN (expression (COMMA expression)*)? RPAREN
     ; // مثال: calculateSum(5, 10)

 // الوصول إلى عناصر المصفوفة (Array Access)
 arrayAccess
     : IDENTIFIER LBRACKET expression RBRACKET
     ; // مثال: items[0]

 // الوصول إلى خصائص الكائن (Object Access)
 objectAccess
     : IDENTIFIER DOT IDENTIFIER(DOT IDENTIFIER)*?
     ; // مثال: user.name
*/
 // القيم (Value)
 // قيمة عامة يمكن أن تكون نصًا أو رقمًا أو Boolean
 value
     : STRING
     | NUMBER
     | BOOLEAN
     | binding
     ; // مثال: "Hello", 42, true, {{ user.name }}


expression
    : pipeExpr
    ;

pipeExpr
    : ternaryExpr (PIPE IDENTIFIER (PIPE IDENTIFIER)*)?
    ;

ternaryExpr
    : logicalOrExpr (QUESTION expression COLON expression)?
    ;

logicalOrExpr
    : logicalAndExpr (OR logicalAndExpr)*
    ;

logicalAndExpr
    : equalityExpr (AND equalityExpr)*
    ;

equalityExpr
    : relationalExpr ((EQUAL | NOT_EQUAL) relationalExpr)?
    ;

relationalExpr
    : additiveExpr ((LESS | LESS_EQUAL | GREATER | GREATER_EQUAL) additiveExpr)?
    ;

additiveExpr
    : multiplicativeExpr ((PLUS | MINUS) multiplicativeExpr)*
    ;

multiplicativeExpr
    : unaryExpr ((MULTIPLY | DIVIDE) unaryExpr)*
    ;

unaryExpr
    : (NOT | MINUS)? primaryExpr
    ;

primaryExpr
    : IDENTIFIER
    | literal
    | functionCall
    | LPAREN expression RPAREN
    | arrayAccess
    | objectAccess
    ;

literal
    : NUMBER
    | STRING
    | BOOLEAN
    ;

functionCall
    : IDENTIFIER LPAREN (expression (COMMA expression)*)? RPAREN
    ;

arrayAccess
    : IDENTIFIER LBRACKET expression RBRACKET
    ;

objectAccess
    : IDENTIFIER DOT IDENTIFIER (DOT IDENTIFIER)*
    ;
// القواعد الخاصة بالتوجيهات (Directives)
//هون عندي مشكلة في كيفية معالجة else
ngIfDirective
    : NGIF ASSIGN expression ( ELSE IDENTIFIER)? SEMICOLON?
    ;


ngForDirective
    : NGFOR ASSIGN forExpression
    ;

forExpression
    :   LET IDENTIFIER OF    expression (SEMICOLON forOptions)?
    ;

forOptions
    : IDENTIFIER AS IDENTIFIER (SEMICOLON IDENTIFIER AS IDENTIFIER)*
    ;


htmlDocument
    : scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs* htmlElements*
    ;

scriptletOrSeaWs
    : SCRIPTLET
    | SEA_WS
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc*
    ;

htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute*
      (TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)? | TAG_SLASH_CLOSE)
    | SCRIPTLET
    | script
    | style
    ;


htmlContent
    : htmlChardata? ((htmlElement | CDATA | htmlComment|interpolation) htmlChardata?)*
    ;

htmlAttribute
    :binding
    |{pushMode(NGFOR;}ngForDirective{popMode();}
    |directive
    | NGFOR NG_ATTRBIUTE SINGLE_QOUTE ngfor_body SINGLE_QOUTE
    | TAG_NAME (TAG_EQUALS  ATTVALUE_VALUE)?
    ;

ngfor_body: ID IN ID;


htmlChardata
    : STRING
    | SEA_WS
    ;

htmlMisc
    : htmlComment
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT
    ;

script
    : SCRIPT_OPEN (SCRIPT_BODY | SCRIPT_SHORT_BODY)
    ;

style
    : STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY)
    ;


/////////////////////////HTml WITH ANGULAR//////////////////
/*

ngForDirective
    : NGFOR ASSIGN STRING
    ;

ngIfDirective
    : NGIF ASSIGN STRING
    ;

// القواعد الأخرى
eventBinding
    : EVENTBIND ASSIGN STRING
    ;

propertyBinding
    : NGBIND ASSIGN STRING
    ;

twoWayBinding
    : NGMODEL ASSIGN STRING
    ;


/*
 // التعبيرات (Expressions)
 expression
     : IDENTIFIER
     | IDENTIFIER DOT IDENTIFIER    // الوصول إلى الخاصيات
     | IDENTIFIER LPAREN (expression (COMMA expression)*)? RPAREN // استدعاء الدوال
     | NUMBER
     | STRING
     | BOOLEAN
     | expression OPERATOR expression // العمليات الحسابية أو المنطقية
     | LPAREN expression RPAREN       // الأقواس للتعبيرات المركبة
     ;
*/


