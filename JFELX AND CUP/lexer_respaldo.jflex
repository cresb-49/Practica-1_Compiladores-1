/*PRIMER SECCION, CODIGO DE USUARIO*/
package com.mycompany.pruebaspractica1compiladores.Lexer;
import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.List;
import static com.mycompany.pruebaspractica1compiladores.Lexer.sym.*;
import com.mycompany.pruebaspractica1compiladores.Parcer.ParamsSymbol;

%%

/*segunda seccion, configuracion*/
%class appLexer
%cup
/*%standalone*/
%unicode
%line
%column
%public
%{
    private Symbol after_symbl = new Symbol(0);
    private Symbol tmp_symbl = new Symbol(0);

    private List<String> errorsList;
%}
/*EXPRECIONES REGULARES*/
LineTerminator = [\r|\n|\r\n]+
WhiteSpace = [ \t\n]+
RecervateWords = (graficar|animar|objeto|anterior)
Colors = (azul|rojo|verde|amarillo|naranja|morado|cafe|negro)
TypeAnimation = (linea|curva)
TypeShape = (circulo|cuadrado|rectangulo|linea|poligono)
Numbers = [0-9]+
Words = [a-zA-Z]+
%{
    private void error(String lexeme) {
        System.out.printf("Error Lexico en el Texto: %s  linea %d,  columna %d. \n", lexeme, yyline + 1, yycolumn + 1);
            errorsList.add(String.format("Error Lexico en el Texto: %s  linea %d, columna %d. Corrige e intenta de nuevo.", lexeme, yyline + 1, yycolumn + 1));
    }
    public List<String> getErrorsList() {
        return errorsList;
    }
%}

%%

/*LEXIX RULES*/
<YYINITIAL>{
    {RecervateWords}
        {
            //System.out.println("Palabra recervada: "+yytext());
            switch (yytext()) {
                case "graficar":
                    tmp_symbl = new Symbol (RESERVATE_WORD_GRAPHIC,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
                    after_symbl = tmp_symbl;
                    return tmp_symbl;
                case "animar":
                    tmp_symbl = new Symbol (RESERVATE_WORD_ANIMATION,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
                    after_symbl = tmp_symbl;
                    return tmp_symbl;
                case "objeto":
                    tmp_symbl = new Symbol (RESERVATE_WORD_OBJECT,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
                    after_symbl = tmp_symbl;
                    return tmp_symbl;
                case "anterior":
                    tmp_symbl = new Symbol (RESERVATE_WORD_REFERENCE,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
                    after_symbl = tmp_symbl;
                    return tmp_symbl;
            }
            
        }
    {Colors}
        {   
            //System.out.println("Color de la figura: "+yytext());
            tmp_symbl = new Symbol (COLOR,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
            after_symbl = tmp_symbl;
            return tmp_symbl;
        }
    {TypeAnimation}
        {   
            //System.out.println("Tipo de animacion: "+yytext());
            tmp_symbl = new Symbol (ANIMATION,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
            after_symbl = tmp_symbl;
            return tmp_symbl;
        }
    {TypeShape}
        {   
            //System.out.println("Tipo de figura: "+yytext());
            switch (yytext()) {
                case "circulo":
                    tmp_symbl = new Symbol (SHAPE_CIR,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
                    after_symbl = tmp_symbl;
                    return tmp_symbl;
                case "cuadrado":
                    tmp_symbl = new Symbol (SHAPE_CUA,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
                    after_symbl = tmp_symbl;
                    return tmp_symbl;
                case "rectangulo":
                    tmp_symbl = new Symbol (SHAPE_REC,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
                    after_symbl = tmp_symbl;
                    return tmp_symbl;
                case "linea":
                    tmp_symbl = new Symbol (SHAPE_LIN,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
                    after_symbl = tmp_symbl;
                    return tmp_symbl;
                case "poligono":
                    tmp_symbl = new Symbol (SHAPE_POL,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
                    after_symbl = tmp_symbl;
                    return tmp_symbl;
            }
        }
    {Numbers}
        {
            //System.out.println("Numero encontrado: "+yytext());
            tmp_symbl = new Symbol (NUMBER,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
            after_symbl = tmp_symbl;
            return tmp_symbl;
        }
    ","
        {
            //System.out.println("Separador coma: "+yytext());
            tmp_symbl = new Symbol (COMA,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
            after_symbl = tmp_symbl;
            return tmp_symbl;
        }
    "+"
        {
            //System.out.println("Signo mas: "+yytext());
            tmp_symbl = new Symbol (SUMA,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
            after_symbl = tmp_symbl;
            return tmp_symbl;
        }
    "-"
        {
            //System.out.println("Signo menos: "+yytext());
            tmp_symbl = new Symbol (RESTA,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
            after_symbl = tmp_symbl;
            return tmp_symbl;
        }
    "*"
        {
            //System.out.println("Signo multiplicacion: "+yytext());
            tmp_symbl = new Symbol (MULTI,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
            after_symbl = tmp_symbl;
            return tmp_symbl;
        }
    "/"
        {
           //System.out.println("Signo divicion: "+yytext());
           tmp_symbl = new Symbol (DIV,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
           after_symbl = tmp_symbl;
            return tmp_symbl;
        }
    "("
        {
            //System.out.println("Parentecis Apertura: "+yytext());
            tmp_symbl = new Symbol (PARENTECIS_APERTURA,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
            after_symbl =tmp_symbl;
            return tmp_symbl;
        }
    ")"
        {
            //System.out.println("Parentecis Cierre: "+yytext());
            tmp_symbl = new Symbol (PARENTECIS_CIERRE,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
            after_symbl = tmp_symbl;
            return tmp_symbl;
        }
    {Words}
        {
            System.out.println("\""+yytext()+"\" no es una intruccion del programa");
            tmp_symbl = new Symbol (ERROR,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
            after_symbl = tmp_symbl;
            return tmp_symbl;
        }
    {LineTerminator}
        {
            /*Do nothing*/
        }
    {WhiteSpace}
        {
            /*Do nothing*/
        }
}
[^] {System.out.println("Caracter invalido en el lenguaje: "+yytext()+" Linea: "+(yyline+1)+" Columna: "+(yycolumn+1));}
