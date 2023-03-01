grammar Grammar
	;

import Lexicon
	;

start
	: (definicion|funcion)* EOF
	;

definicion
	:	'var ' IDENT ':' tipo';'
	|	'var ' IDENT ':' ('[' LITENT ']')+ tipo';'
	;

funcion
	:IDENT '('parametro (','parametro)*')' ':' tipo '{'definicion* sentencia+ '}'
	|IDENT '('parametro (','parametro)*')''{' definicion*	sentencia+ '}'
	|IDENT '()' ':' tipo '{'definicion* sentencia+ '}'
	|IDENT '()' '{' definicion* sentencia+ '}'
	;

parametro
	:	IDENT ':' tipo
	;

tipo
	: 'int'
	| 'float'
	| 'char'
	;

sentencia
	: 'print' expr ';'
	| 'read' IDENT ';'
	| IDENT '=' expr ';'
	| 'if' '(' expr ')' '{' sentencia+ '}'
	| 'if' '(' expr ')' '{' sentencia+ '}' 'else' '{' sentencia+ '}'
	| 'while' '(' expr ')' '{' sentencia+ '}'
	| 'return' expr ';'
	| 'return' ';'
	;

expr
	: LITENT
	| LITREAL
	| IDENT
	| expr '[' expr ']'
	| expr '.' IDENT 
	| '(' expr ')'
	| 'to' '<' tipo '>' '(' expr ')'
	| expr ('*' | '/') expr
	| expr ('+' | '-') expr 
	| expr ('>' | '<' | '>=' | '<=') expr
	| expr ('=' | '!=') expr 
	| expr '&&' expr
	| expr '||' expr
	| '!' expr
	;
