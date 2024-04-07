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
    : (importDeclaration)* classDeclaration methodDeclaration? EOF
    ;

importDeclaration
    : 'import' value+=ID ('.' value+=ID)* ';' #ImportStatement
    ;

classDeclaration
    : 'class' className=ID ('extends' superClassName=ID)? '{' ( fieldDeclaration )* ( methodDeclaration )* '}' #ClassDecl
    ;

type
    : type '[' ']' 
    | typeName='int'
    | typeName='int' '...'
    | typeName='boolean'
    | typeName='String'

    | typeName=ID 
    ;

fieldDeclaration
    : type fieldName=ID ('[' ']')? ';' 
    ;

methodDeclaration
    : ('public')? ('static')? returnType=type methodName=ID '(' (argument)? (',' argument)* ')' '{'(fieldDeclaration | statement )* 'return' expression ';' '}'  #MethDeclaration
    | ('public')? ('static')? 'void' methodName=ID '(' (argument)? (',' argument)* ')' '{'(fieldDeclaration | statement )* '}'  #MethDeclarationVoid
    | 'public' 'static' 'void' 'main' '(' 'String' '[' ']' argName=ID ')' '{'(fieldDeclaration | statement )* '}'  #MainMethDeclaration
    ;

argument
    : type argName=ID  #argumentDecl
    ;

    

statement
    : expression ';'
    | '{' statement* '}'
    | 'if' '(' expression ')' statement ('else' statement)
    | 'while' '(' expression ')' statement
    | ID '=' expression ';'
    | ID '[' expression ']' '=' expression ';'
    ;

expression
    : '(' expression ')' # ParenthesisExpression
    | 'new' 'int' '[' size=expression ']' # NewIntArrayExpression
    | 'new' classname=ID ('(' (expression (',' expression)*)? ')')? # ClassInstantiationExpression
    | expression '[' index=expression ']' # ArrayAccessExpression
    | expression '.' value=ID '(' (expression (',' expression)*)? ')' # FunctionCallExpression
    | expression '.' 'length' # ArrayLengthExpression
    | '[' expression (',' expression)* ']' # ArrayInitializationExpression
    | 'this' # ThisReferenceExpression
    | '!' expression   # NegationExpression
    | expression (('*' | '/') expression)  # BinaryExpression
    | expression (('+' | '-') expression)   # BinaryExpression
    // | expression (('<' | '>' | '<=' | '>=' | '==' | '!=' | '+=' | '-=' | '*=' | '/=') expression)  # BinaryExpression
    | expression (('<' | '>' | '==' | '!=') expression)  # BinaryExpression
    | expression ('&&' | '||') expression  # BinaryExpression
    | INTEGER   # IntegerLiteral
    | 'true'   # BooleanLiteral
    | 'false'  # BooleanLiteral
    | variable=ID (op=('++' | '--'))? # VariableReferenceExpression
    ;
