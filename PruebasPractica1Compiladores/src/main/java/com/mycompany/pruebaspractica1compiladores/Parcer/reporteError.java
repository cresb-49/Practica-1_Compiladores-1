package com.mycompany.pruebaspractica1compiladores.Parcer;

import static com.mycompany.pruebaspractica1compiladores.Lexer.sym.*;
public class reporteError {

    public reporteError() {

    }

    public String simboloEsperado(int sym) {
        switch (sym) {
            case RESERVATE_WORD_GRAPHIC:
                return "graficar";
            case PARENTECIS_APERTURA:
                return "(";
            case PARENTECIS_CIERRE:
                return ")";
            case SUMA:
                return "+";
            case MULTI:
                return "*";
            case SHAPE_CIR:
                return "circulo";
            case COLOR:
                return "color [azul|rojo|verde|amarillo|naranja|morado|cafe|negro]";
            case SHAPE_LIN:
                return "linea";
            case RESERVATE_WORD_REFERENCE:
                return "anterior";
            case SHAPE_REC:
                return "rectangulo";
            case COMA:
                return ",";
            case ANIMATION:
                return "animacion [linea|curva]";
            case NUMBER:
                return "digito";
            case SHAPE_POL:
                return "poligono";
            case DIV:
                return "/";
            case SHAPE_CUA:
                return "cuadrado";
            case RESERVATE_WORD_ANIMATION:
                return "animar";
            case RESTA:
                return "-";
            case RESERVATE_WORD_OBJECT:
                return "objeto";
            case ERROR:
                break;
            default:
                return "";

        }
        return "";
    }
}
