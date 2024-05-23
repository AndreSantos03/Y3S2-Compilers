grammar Javamm;

@header {
    package pt.up.fe.comp2024;
}

WS : [ \t\n\r\f]+ -> skip ;

SINGLE_COMMENT : '//' ~[\r\n]* -> skip ;
MULTI_COMMENT : '/*' .*? '*/' -> skip ;

INTEGER : '0' | [1-9] [0-9]*;
ID : [a-zA-Z_$] [a-zA-Z_0-9$]*;
STRING : '"' ( ~["\\\r\n] | '\\' . )* '"';


program
    : (importDeclaration)* classDeclaration methodDeclaration? EOF
    ;

importDeclaration
    : 'import' value+=ID ('.' value+=ID)* ';' #ImportStmt
    ;

classDeclaration
    : 'public'? 'class' className=ID ('extends' superClassName=ID)? '{' ( fieldDeclaration )* ( methodDeclaration )* '}' #ClassDecl
    ;

type
    : typeName='int' '[' ']' #IntArray
    | typeName='int' #Int
    | typeName='int' '...' #vararg
    | typeName='boolean' #boolean
    | typeName='String' #string
    | typeName='void' #void
    | typeName=ID #id
    ;

fieldDeclaration
    : type variable=ID ('[' ']')? ';' 
    ;

methodDeclaration
    :(isPublic='public')? isStatic='static' 'void' 'main' '(' 'String' '[' ']' 'args' ')' '{'(fieldDeclaration)* ( statement )* '}'
    |(isPublic='public')? (isStatic='static')? type methodName=ID '(' (argument)? (',' argument)* ')' '{'(fieldDeclaration)* ( statement )* returnDeclaration? '}' 
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


parameter
    : expression (',' expression) *
    ;

expression
    : '(' expression ')' # ParenthesisExpression
    | 'new' 'int' '[' size=expression ']' # NewIntArrayExpression
    | 'new' classname=ID '(' parameter? ')'  # ClassInstantiationExpression
    | expression '[' index=expression ']' # ArrayAccessExpression
    | value=ID '(' parameter? ')'  # FunctionCallExpression
    | expression '.' value=ID '(' parameter? ')'  # FunctionCallExpression
    | expression '.' 'length' # ArrayLengthExpression
    | '[' expression (',' expression)* ']' # ArrayInitializationExpression
    | 'this' # ThisReferenceExpression
    | '!' expression   # NegationExpression
    | expression  operation=('*' | '/') expression  # BinaryExpression
    | expression operation=('+' | '-') expression   # BinaryExpression
    | expression operation=('<' | '>' | '==' | '!=') expression  # BinaryExpression
    | expression operation=('&&' | '||') expression  # BinaryExpression
    | value=INTEGER   # IntegerLiteral
    | value='true'   # BooleanLiteral
    | value='false'  # BooleanLiteral
    | value=STRING    # StringLiteral
    | variable=ID (op=('++' | '--'))? # VariableReferenceExpression
    ;
