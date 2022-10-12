grammar Expr;

compileUnit : expr EOF;

// parser rules
prog : (expr ';' NEWLINE?)*;
expr : '(' expr ')'         # parensExpr
     | ('+'|'-') expr # unaryExpr
     | expr ADD expr  # infixExpr
     | expr MUL expr  # infixExpr
     | expr SUB expr  # infixExpr
     | expr DIV expr  # infixExpr
     | var ASSIGN num  # infixExpr
     | func           # funcExpr
     | num            # numberExpr
     | var            # varExpr
     ;
     
num  : INT
     | REAL
     ;

var  : ID;
func : ID '(' param ')';
param : (num COMMA)* num;
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