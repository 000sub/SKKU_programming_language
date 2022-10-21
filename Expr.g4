grammar Expr;



// parser rules
prog : ((decl | expr) ';' NEWLINE?)*
     ; 

decl : ID ASSIGN num 
     ;

expr : '(' expr ')'   # parensExpr
     | op=('+'|'-') expr # unaryExpr
     | left=expr op=('*'|'/') right=expr  # infixExpr
     | left=expr op=('+'|'-') right=expr  # infixExpr
     | func           # funcExpr
     | num            # numberExpr
     | ID             # variableExpr
     ;
     
num  : INT
     | REAL
     ;

func : ID '(' param ')';
param : (expr COMMA)* expr;
// lexer rules                    
NEWLINE: [\r\n]+ ;
INT: [0-9]+ ;          // should handle negatives
REAL: [0-9]+'.'[0-9]* ; // should handle signs(+/-)
ID: [a-zA-Z]+ ;
WS: [ \t\r\n]+ -> skip ;
ADD: '+';
MUL: '*';
SUB: '-';
DIV: '/';
ASSIGN: '=';
COMMA: ',';