grammar ProLang;

// Gramáticas
program
    : START statement* END
    ;

statement
    : variableDeclaration
    | assignment
    | ifStatement
    | switchStatement
    | whileStatement
    | forStatement
    | printFunction
    ;

variableDeclaration
    : DEFINE ID AS type (ASSIGN expression)? SEMICOLON
    ;

printFunction
    : PRINT LPAREN (expression (',' expression)*) RPAREN SEMICOLON
    ;

assignment
    : ID ASSIGN expression SEMICOLON
    ;

ifStatement
    : IF LPAREN expression RPAREN COLON statement*
      (ELSE LPAREN expression RPAREN COLON statement*)*
      (ELSE COLON statement*)?
      END
    ;

switchStatement
    : SWITCH LPAREN expression RPAREN COLON
      caseBlock+
      (DEFAULT COLON statement*)?
      END
    ;

caseBlock
    : CASE expression COLON statement* BREAK SEMICOLON
    ;


whileStatement
    : WHILE LPAREN expression RPAREN COLON statement* END
    ;

forStatement
    : FOR LPAREN forInit SEMICOLON forCondition SEMICOLON forUpdate RPAREN COLON statement* END
    ;

forInit
    : DEFINE ID AS INTEGER ASSIGN expression
    | ID ASSIGN expression
    ;

forCondition
    : expression
    ;

forUpdate
    : ID ASSIGN expression
    ;

type
    : INTEGER
    | DECIMAL
    | BOOLEAN
    | VARCHAR
    | GENERIC
    ;

expression
    : LPAREN expression RPAREN                             #parenExpression
    | left=expression op=POWER right=expression            #binaryOp
    | (NOT | MINUS) expression                             #unaryOp
    | left=expression op=(MULTIPLICATION | DIVISION | MOD) right=expression  #binaryOp
    | left=expression op=(PLUS | MINUS) right=expression   #binaryOp
    | left=expression op=(GREATER_THAN | GREATER_OR_EQUAL | LESS_THAN | LESS_OR_EQUAL) right=expression #binaryOp
    | left=expression op=(EQUAL_THAN | DIFFERENT_THAN) right=expression #binaryOp
    | left=expression AND right=expression                 #binaryOp
    | left=expression OR right=expression                  #binaryOp
    | ID                                                   #idExpression
    | NUMBER                                               #numberExpression
    | TEXT                                                 #textExpression
    | boolean                                              #booleanExpression
    ;

boolean
    : TRUE
    | FALSE
    ;

NUMBER
    : INTEGER_NUMBER
    | DECIMAL_NUMBER
    ;

// Operadores relacionales
AND : 'and' | '&&';
OR  : 'or' | '||';
NOT : '!';

// Operadores matemáticos
PLUS : '+';
MINUS : '-';
MULTIPLICATION : '*';
DIVISION : '/';
MOD : '%';
POWER : '^';

// Operadores de comparación
EQUAL_THAN : '==';
DIFFERENT_THAN : '<>';
GREATER_THAN : '>';
GREATER_OR_EQUAL : '>=';
LESS_THAN : '<';
LESS_OR_EQUAL : '<=';

// Palabras reservadas
START : 'start';
END : 'end';
DEFINE : 'define';
AS : 'as';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
FOR : 'for';
INTEGER : 'integer';
DECIMAL : 'decimal';
BOOLEAN : 'boolean';
VARCHAR : 'varchar';
GENERIC : 'generic';
TRUE : 'true';
FALSE : 'false';
PRINT : 'print';
SWITCH : 'switch';
CASE   : 'case';
DEFAULT: 'default';
BREAK: 'break';

// Identificadores
ID : '@'[a-zA-Z_][a-zA-Z_0-9]* ;

// Puntuación y otros símbolos especiales
ASSIGN : '=';
SEMICOLON : ';';
COLON : ':';
LPAREN : '(';
RPAREN : ')';

// Números y cadenas de texto
INTEGER_NUMBER : [0-9]+;
DECIMAL_NUMBER : [0-9]+ '.' [0-9]+;
TEXT : '"' .*? '"';

// Espacios
WS : [ \t\r\n]+ -> skip;