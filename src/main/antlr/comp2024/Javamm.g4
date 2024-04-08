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
    : 'public'? 'class' className=ID ('extends' superClassName=ID)? '{' ( fieldDeclaration )* ( methodDeclaration )* '}' #ClassDecl
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
    : type variable=ID ('[' ']')? ';' 
    ;

methodDeclaration
    : ('public')? (isStatic='static')? returnType=type methodName=ID '(' (argument)? (',' argument)* ')' '{'(fieldDeclaration | statement )* returnDeclaration? '}'  #MethDeclaration
    | 'public' 'static' 'void' 'main' '(' 'String' '[' ']' argName=ID ')' '{'(fieldDeclaration | statement )* '}'  #MainMethDeclaration
    ;


returnDeclaration
    :'return' expression ';'
    ;
    
argument
    : type argName=ID  #argumentDecl
    ;

    

statement
    : expression ';' #SimpleExpression
    | '{' statement* '}' #Block
    | 'if' '(' expression ')' statement ('else' statement) #IfStatement
    | 'while' '(' expression ')' statement #WhileStatement
    | variable=ID '=' expression ';' #Assignment
    | variable=ID '[' expression ']' '=' expression ';' #AssignmentArray
    ;

expression
    : '(' expression ')' # ParenthesisExpression
    | 'new' 'int' '[' size=expression ']' # NewIntArrayExpression
    | 'new' classname=ID ('(' (expression (',' expression)*)? ')')? # ClassInstantiationExpression
    | expression '[' index=expression ']' # ArrayAccessExpression
    | expression '.' value=ID ('(' (expression (',' expression)*)? ')')? # FunctionCallExpression
    | expression '.' 'length' # ArrayLengthExpression
    | '[' expression (',' expression)* ']' # ArrayInitializationExpression
    | 'this' # ThisReferenceExpression
    | '!' expression   # NegationExpression
    | expression ( operation=('*' | '/') expression)  # BinaryExpression
    | expression (operation=('+' | '-') expression)   # BinaryExpression
    | expression (operation=('<' | '>' | '==' | '!=') expression)  # BinaryExpression
    | expression operation=('&&' | '||') expression  # BinaryExpression
    | INTEGER   # IntegerLiteral
    | value='true'   # BooleanLiteral
    | value='false'  # BooleanLiteral
    | variable=ID (op=('++' | '--'))? # VariableReferenceExpression
    ;
