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

    private List<String> errorsList = new ArrayList<>();


    private List<Symbol> countMas = new ArrayList();
    private List<Symbol> countMenos = new ArrayList();
    private List<Symbol> countMulti = new ArrayList();
    private List<Symbol> countDiv = new ArrayList();
    
    private int shapeCirculo =0;
    private int shapeCuadrado =0;
    private int shapeRect =0 ;
    private int shapeLinea=0;
    private int shapePoligono=0;

    private int animCurva=0;
    private int animLinea=0;

    private int countAzul=0;
    private int countRojo=0;
    private int countVerde=0;
    private int countAmarillo=0;
    private int countNaranja=0;
    private int countMorado=0;
    private int countCafe=0;
    private int countNegro=0;
    


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
        System.out.printf("Error lexico \"%s\" linea %d,  columna %d. \n", lexeme, yyline + 1, yycolumn + 1);
        errorsList.add(String.format("Error Lexico en el Texto: %s  linea %d, columna %d. Corrige e intenta de nuevo.", lexeme, yyline + 1, yycolumn + 1));
    }
    public List<String> getErrorsList() {
        return errorsList;
    }
    public List<Symbol> getCountMas() {
        return countMas;
    }

    public List<Symbol> getCountMenos() {
        return countMenos;
    }

    public List<Symbol> getCountMulti() {
        return countMulti;
    }

    public List<Symbol> getCountDiv() {
        return countDiv;
    }

    public int getShapeCirculo() {
        return shapeCirculo;
    }

    public int getShapeCuadrado() {
        return shapeCuadrado;
    }

    public int getShapeRect() {
        return shapeRect;
    }

    public int getShapeLinea() {
        return shapeLinea;
    }

    public int getShapePoligono() {
        return shapePoligono;
    }

    public int getAnimCurva() {
        return animCurva;
    }

    public int getAnimLinea() {
        return animLinea;
    }

    public int getCountAzul() {
        return countAzul;
    }

    public int getCountRojo() {
        return countRojo;
    }

    public int getCountVerde() {
        return countVerde;
    }

    public int getCountAmarillo() {
        return countAmarillo;
    }

    public int getCountNaranja() {
        return countNaranja;
    }

    public int getCountMorado() {
        return countMorado;
    }

    public int getCountCafe() {
        return countCafe;
    }

    public int getCountNegro() {
        return countNegro;
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
            switch(yytext()){
                case "azul":
                    countAzul++;
                break;
                case "rojo":
                    countRojo++;
                break;
                case "verde":
                    countVerde++;
                break;
                case "amarillo":
                    countAmarillo++;
                break;
                case "naranja":
                    countNaranja++;
                break;
                case "morado":
                    countMorado++;
                break;
                case "cafe":
                    countCafe++;
                break;
                case "negro":
                    countNegro++;
                break;
            }
            return tmp_symbl;
        }
    {TypeAnimation}
        {   
            //System.out.println("Tipo de animacion: "+yytext());
            if(yytext().equals("linea")){
                if(after_symbl.value != null){
                    if(after_symbl.sym==COMA){
                        tmp_symbl = new Symbol (ANIMATION,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
                        animLinea++;
                    }else{
                        tmp_symbl = new Symbol (SHAPE_LIN,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
                        shapeLinea++;
                    }
                }else{
                    tmp_symbl = new Symbol (ANIMATION,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
                    animLinea++;
                }
            }else{
                tmp_symbl = new Symbol (ANIMATION,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
                animCurva++;
            }
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
                    shapeCirculo++;
                    return tmp_symbl;
                case "cuadrado":
                    tmp_symbl = new Symbol (SHAPE_CUA,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
                    after_symbl = tmp_symbl;
                    shapeCuadrado++;
                    return tmp_symbl;
                case "rectangulo":
                    tmp_symbl = new Symbol (SHAPE_REC,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
                    after_symbl = tmp_symbl;
                    shapeRect++;
                    return tmp_symbl;
                case "linea":
                    tmp_symbl = new Symbol (SHAPE_LIN,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
                    after_symbl = tmp_symbl;
                    shapeLinea++;
                    return tmp_symbl;
                case "poligono":
                    tmp_symbl = new Symbol (SHAPE_POL,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
                    after_symbl = tmp_symbl;
                    shapePoligono++;
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
            countMas.add(tmp_symbl);
            return tmp_symbl;
        }
    "-"
        {
            //System.out.println("Signo menos: "+yytext());
            tmp_symbl = new Symbol (RESTA,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
            after_symbl = tmp_symbl;
            countMenos.add(tmp_symbl);
            return tmp_symbl;
        }
    "*"
        {
            //System.out.println("Signo multiplicacion: "+yytext());
            tmp_symbl = new Symbol (MULTI,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
            after_symbl = tmp_symbl;
            countMulti.add(tmp_symbl);
            return tmp_symbl;
        }
    "/"
        {
           //System.out.println("Signo divicion: "+yytext());
           tmp_symbl = new Symbol (DIV,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
           after_symbl = tmp_symbl;
           countDiv.add(tmp_symbl);
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
            error(yytext());
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
[^]     {
            error(yytext());
            tmp_symbl = new Symbol (ERROR,after_symbl.sym,0, new ParamsSymbol(yyline+1, yycolumn+1,yytext()));
            after_symbl = tmp_symbl;
            return tmp_symbl;
        }
