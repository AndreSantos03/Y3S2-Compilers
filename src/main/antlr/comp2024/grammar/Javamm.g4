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
    : 'class' className=ID ('extends' superClassName=ID)? '{' ( varDeclaration )* ( methodDeclaration )* '}' #CLASS_DECL
    ;

type
    : type '[' ']' #ARRAY_TYPE
    | 'int' #INT_TYPE
    | 'int' '...' #INT_VARARGS_TYPE
    | 'boolean' #BOOLEAN_TYPE
    | 'String' #STRING_TYPE
    | 'double' #DOUBLE_TYPE
    | 'float' #FLOAT_TYPE
    | className=ID #CUSTOM_TYPE
    ;


varDeclaration
    : type value=ID ('[' ']')? ';' 
    ;

methodDeclaration
    : ('public' | 'private' | 'protected')? returnType=type methodName=ID '(' (parameters+=parameter (',' parameters+=parameter)*)? ')' methodBody  #METHOD_DECL
    | 'public' 'static' 'void' 'main' '(' 'String' '[' ']' argName=ID ')' methodBody  #METHOD_DECL
    ;


parameter
    : parameterType=type paramName=ID  #PARAM
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
    | expression (('*' | '/') expression)  # BINARY_EXPR
    | expression (('+' | '-') expression)   # BINARY_EXPR
    | expression (('<' | '>' | '<=' | '>=' | '==' | '!=' | '+=' | '-=' | '*=' | '/=') expression)  # BINARY_EXPR
    | expression ('&&' | '||') expression  # BINARY_EXPR
    | INTEGER   # INTEGER_LITERAL
    | 'true'   # INTEGER_LITERAL
    | 'false'  # INTEGER_LITERAL
    | variable=ID (op=('++' | '--'))? # VAR_REF_EXPR
    ;

