grammar Javamm;

@header {
    package pt.up.fe.comp2024;
}

WS : [ \t\n\r\f]+ -> skip ;

SINGLE_COMMENT : '//' ~[\r\n]* -> skip ;
MULTI_COMMENT : '/*' .*? '*/' -> skip ;

INTEGER : '0' | [1-9] [0-9]*;
ID : [a-zA-Z_$] [a-zA-Z_0-9$]*;

program
    : (importDeclaration)* classDeclaration* methodDeclaration? EOF
    ;

importDeclaration
    : 'import' value+=ID ('.' value+=ID)* ';' #ImportStatement
    ;

classDeclaration
    : 'class' className=ID ('extends' superClassName=ID)? '{' ( varDeclaration )* ( methodDeclaration )* '}' #ClassStatement
    ;

type
    : type '[' ']' #Array
    | 'int' #IntTypeLabel
    | 'int' '...' #VarArgsTypeLabel
    | 'boolean' #BooleanTypeLabel
    | 'String' #StringTypeLabel
    | 'double' #DoubleTypeLabel
    | 'float' #FloatTypeLabel
    | className=ID #CustomTypeLabel
    ;


varDeclaration
    : type value=ID ('[' ']')? ';' 
    ;

methodDeclaration
    : ('public' | 'private' | 'protected')? returnType=type methodName=ID '(' (parameters+=parameter (',' parameters+=parameter)*)? ')' methodBody  #NormalMethodDeclaration
    | 'public' 'static' 'void' 'main' '(' 'String' '[' ']' argName=ID ')' methodBody  #MainMethodDeclaration
    ;


parameter
    : parameterType=type paramName=ID  #ParameterDefinition
    ;

methodBody
    : '{' (varDeclaration | statement | 'return' expression ';' )* '}' 
    ;

statement
    : expression ';'
    | '{' statement* '}'
    | 'if' '(' expression ')' statement ('else' statement)?
    | 'while' '(' expression ')' statement
    | ID '=' expression ';'
    | ID '[' expression ']' '=' expression ';'
    ;

expression
    : '(' expression ')' # Parenthesis
    | 'new' 'int' '[' size=expression ']' # NewIntArrayExpression
    | 'new' classname=ID ('(' (expression (',' expression)*)? ')')? # ClassInstantiation
    | expression '[' index=expression ']' # ArrayAccess
    | expression '.' value=ID '(' (expression (',' expression)*)? ')' # FunctionCall
    | expression '.' 'length' # ArrayLengthExpression
    | '[' expression (',' expression)* ']' # ArrayInitializationExpression
    | 'this' # ThisReferenceExpression
    | '!' expression   # NegationExpression
    | expression (('*' | '/') expression)  # binaryOp
    | expression (('+' | '-') expression)   # binaryOp
    | expression (('<' | '>' | '<=' | '>=' | '==' | '!=' | '+=' | '-=' | '*=' | '/=') expression)  # binaryOp
    | expression ('&&' | '||') expression  # binaryOp
    | INTEGER   # IntegerLiteral
    | 'true'   # TrueLiteral
    | 'false'  # FalseLiteral
    | variable=ID (op=('++' | '--'))? # VariableExpression
    ;
