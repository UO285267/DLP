lexer grammar Lexicon
	;

LITENT
	: [0-9]+
	;
LITREAL
	: [0-9]+ '.' [0-9]+
	;
LITCHAR
	: '\'' (. | '\\n') '\''
	;
LITBOOL
: 'false'| 'true'
;
IDENT
	: [a-zA-Z0-9_]+
	;

LINE_COMMENT
	: '//' .*? ('\n' | EOF) -> skip
	;

MULTILINE_COMMENT
	: '/*' .*? '*/' -> skip
	;

WHITESPACE
	: [ \t\r\n]+ -> skip
	;
