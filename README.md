# Project-Entiny
A own Scriptlanguage Project for Entities, Items and Effects for Minecraft

### BNF for the Scriptlanguage

<block> ::= '{' {<statement>+} '}'
<statement> ::= <if> | <while> | <block> | <print> | <assignment>

<if> ::= if '(' <boolCond> ')' <statement> [ else <statement> ]
<while> ::= while '(' <boolCond> ')' <statement>
<assignment> ::= <var> '=' <numExpr> ';'
<print> ::= print <var> ';'

<numExpr> ::= <numProduct> { ( '+' | '-' ) <numProduct> }
<numProduct> ::= <numLiteral> { ( '*' | '/' | '%' ) <numLiteral> }
<numLiteral> ::= <var> | <number> | '(' <numExpr> ')'
  
<boolCond> ::= <numExpr> ( '<' | '>' | '==' | '<=' | '>=' | '!=' ) <numExpr> 
