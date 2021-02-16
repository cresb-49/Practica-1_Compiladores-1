package com.mycompany.app_practica_1.Lexer;

import com.mycompany.app_practica_1.Parser.ParamsSymbol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java_cup.runtime.Symbol;

public class reportLexer implements Serializable {
    public List<Symbol> countMas = new ArrayList();
    public List<Symbol> countMenos = new ArrayList();
    public List<Symbol> countMulti = new ArrayList();
    public List<Symbol> countDiv = new ArrayList();

    public int shapeCirculo =0;
    public int shapeCuadrado =0;
    public int shapeRect =0 ;
    public int shapeLinea=0;
    public int shapePoligono=0;

    public int animCurva=0;
    public int animLinea=0;

    public int countAzul=0;
    public int countRojo=0;
    public int countVerde=0;
    public int countAmarillo=0;
    public int countNaranja=0;
    public int countMorado=0;
    public int countCafe=0;
    public int countNegro=0;

    public reportLexer(){

    }

    public String getReport(){
        String report="";
        if(!(countMas.isEmpty()&&countMenos.isEmpty()&&countMulti.isEmpty()&&countDiv.isEmpty())){
            ParamsSymbol tmp;
            report= report+"\n\tOPERADORES MATEMATICOS\n";
            if(!countMas.isEmpty()){
                for(Symbol sym: countMas){
                     tmp = (ParamsSymbol)sym.value;
                     report = report +"\t"+ "Signo:"+tmp.lexema+" Linea: "+tmp.line+" Columna: "+tmp.column+"\n";
                }
            }
            if(!countMenos.isEmpty()){
                for(Symbol sym: countMenos){
                    tmp = (ParamsSymbol)sym.value;
                    report = report +"\t"+"Signo:"+tmp.lexema+" Linea: "+tmp.line+" Columna: "+tmp.column+"\n";
                }
            }
            if(!countMulti.isEmpty()){
                for(Symbol sym: countMulti){
                    tmp = (ParamsSymbol)sym.value;
                    report = report +"\t"+"Signo:"+tmp.lexema+" Linea: "+tmp.line+" Columna: "+tmp.column+"\n";
                }
            }
            if(!countDiv.isEmpty()){
                for(Symbol sym: countDiv){
                    tmp = (ParamsSymbol)sym.value;
                    report = report +"\t"+"Signo:"+tmp.lexema+" Linea: "+tmp.line+" Columna: "+tmp.column+"\n";
                }
            }
        }
        report= report+"\n\tFIGURAS GRAFICADAS\n";
        if(shapeCirculo!=0){
            report= report+"\t"+"Circulos: "+shapeCirculo+"\n";
        }
        if(shapeCuadrado!=0){
            report= report+"\t"+"Cuadrados: "+shapeCuadrado+"\n";
        }
        if(shapeRect!=0){
            report= report+"\t"+"Rectangulos: "+shapeRect+"\n";
        }
        if(shapeLinea!=0){
            report= report+"\t"+"Lineas: "+shapeCirculo+"\n";
        }
        if(shapePoligono!=0){
            report= report+"\t"+"Poligonos: "+shapeCirculo+"\n";
            }

        if(animLinea>0&&animCurva>0){
            report= report+"\n\t"+"ANIMACIONES UTILIZADAS\n";
            if(animCurva!=0){
                report= report+"\t"+"Animacion curva: "+animCurva+"\n";
            }
            if(animLinea!=0){
                report= report +"\t"+"Animacion linea: "+animCurva+"\n";
            }
        }

        report= report+"\n\t"+"COLORES USADOS\n";
        if(countAzul>0){
            report= report+"\t"+"azul: "+countAzul+"\n";
        }
        if(countRojo>0){
            report= report+"\t"+"rojo: "+countRojo+"\n";
        }
        if(countVerde>0){
            report= report+"\t"+"verde: "+countVerde+"\n";
        }
        if(countAmarillo>0){
            report= report+"\t"+"amarillos: "+countAmarillo+"\n";
        }
        if(countNaranja>0){
            report= report+"\t"+"naranja: "+countNaranja+"\n";
        }
        if(countMorado>0){
            report= report+"\t"+"morado: "+countMorado+"\n";
        }
        if(countCafe>0){
            report= report+"\t"+"cafe: "+countCafe+"\n";
        }
        if(countNegro>0){
            report= report+"\t"+"negro: "+countNegro+"\n";
        }
        return report;
    }

    @Override
    public String toString() {
        return "reportLexer{" +
                "countMas=" + countMas +
                ", countMenos=" + countMenos +
                ", countMulti=" + countMulti +
                ", countDiv=" + countDiv +
                ", shapeCirculo=" + shapeCirculo +
                ", shapeCuadrado=" + shapeCuadrado +
                ", shapeRect=" + shapeRect +
                ", shapeLinea=" + shapeLinea +
                ", shapePoligono=" + shapePoligono +
                ", animCurva=" + animCurva +
                ", animLinea=" + animLinea +
                ", countAzul=" + countAzul +
                ", countRojo=" + countRojo +
                ", countVerde=" + countVerde +
                ", countAmarillo=" + countAmarillo +
                ", countNaranja=" + countNaranja +
                ", countMorado=" + countMorado +
                ", countCafe=" + countCafe +
                ", countNegro=" + countNegro +
                '}';
    }

}
