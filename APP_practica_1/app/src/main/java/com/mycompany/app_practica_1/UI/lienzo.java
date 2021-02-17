package com.mycompany.app_practica_1.UI;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import com.mycompany.app_practica_1.Instructions.Circulo;
import com.mycompany.app_practica_1.Instructions.Cuadrado;
import com.mycompany.app_practica_1.Instructions.Linea;
import com.mycompany.app_practica_1.Instructions.Poligono;
import com.mycompany.app_practica_1.Instructions.Rectangulo;

import java.util.List;

public class lienzo extends View {
    private List<Object> sentencias;

    public lienzo(Context context,List<Object> sentencias){
        super(context);
        this.sentencias=sentencias;
    }
    protected void onDraw(Canvas canvas){
        canvas.drawRGB(255,255,255);


        /*
        for (int i=1; i<=5; i++){
            pincel.setStrokeWidth(15);
            canvas.drawLine(100, i*100, 300, i*100, pincel);
        }*/

        dibujarFiguras(sentencias,canvas);



    }

    public void dibujarFiguras(List<Object> sentencias,Canvas canvas){
        for(Object obj: sentencias){
            if(obj instanceof Circulo){
                Circulo tmp = (Circulo)obj;
                canvas.drawCircle(tmp.getPosx(),tmp.getPosy(),tmp.getRadio(),color(tmp.getColor()));
                canvas.drawCircle(tmp.getPosx(),tmp.getPosy(),(tmp.getRadio()-10),color("default"));
            }
            if(obj instanceof Cuadrado){

            }
            if(obj instanceof Linea){

            }
            if(obj instanceof Poligono){

            }
            if(obj instanceof Rectangulo){

            }
        }
    }

    public Paint color(String color){
        Paint pincel = new Paint();
        switch (color){
            case "rojo":
                pincel.setARGB(255,255,0,0);
                return pincel;
            case "azul":
                pincel.setARGB(255,0,102,255);
                return pincel;
            case "verde":
                pincel.setARGB(255,0,153,51);
                return pincel;
            case "amarillo":
                pincel.setARGB(255,255,204,0);
                return pincel;
            case "naranja":
                pincel.setARGB(255,255,153,0);
                return pincel;
            case "morado":
                pincel.setARGB(255,153,51,255);
                return pincel;
            case "cafe":
                pincel.setARGB(255,153,102,51);
                return pincel;
            case "negro":
                pincel.setARGB(255,0,0,0);
                return pincel;
            default:
                pincel.setARGB(255,255,255,255);
                return pincel;
        }

    }

}
