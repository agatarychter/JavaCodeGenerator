grammar JavaGrammar;
Parameter: (ParamName ':' ParamType Default*) ;
ParamType: 'int'|'Integer'|'char'|'Character'|'double'|'Double'|
           'float'|'Float'|'String'|'boolean'|'Boolean'|'long'|'Long';
GS: 'g'|'s'|'gs'|'nogs';
Singleton: 'singl'|'nosingl';
prule: 'create ' ClassName ' ' (Parameter ' ')+ '; ' GS ' ' Singleton;
ClassName:  ('A'..'Z') ('a'..'z' | 'A'..'Z' | Digit)*;
Digit: '0'..'9';
ParamName: ('a'..'z')*('a'..'z'|'A'..'Z'|'0'..'9');
Default: '='('a'..'z'|'0'..'9')*('a'..'z'|'A'..'Z'|'0'..'9');
