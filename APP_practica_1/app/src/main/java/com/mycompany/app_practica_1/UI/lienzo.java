package com.mycompany.app_practica_1.UI;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import com.mycompany.app_practica_1.Instructions.*;

import java.util.List;

public class lienzo extends View {
    private List<Object> sentencias;
    private static final int ANCHO = 15;
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

    public void dibujarFiguras(List<Object> sentencias, Canvas canvas){
        for(Object obj: sentencias){
            if(obj instanceof Circulo){

                Circulo tmp = (Circulo)obj;
                canvas.drawCircle(tmp.getPosx(),tmp.getPosy(),tmp.getRadio(),color(tmp.getColor()));

                //canvas.drawCircle(tmp.getPosx(),tmp.getPosy(),(tmp.getRadio()-ANCHO),color("default"));

                /*
                Paint tmpPincel = color(tmp.getColor());
                tmpPincel.setStrokeWidth(ANCHO);
                double j =0;
                while (j<361){
                    float x,y,xt,yt;
                    xt = (float) (tmp.getRadio()*(Math.cos((j*Math.PI/180))));
                    yt = (float) (tmp.getRadio()*(Math.sin(j*Math.PI/180)));

                    x=tmp.getPosx()+xt;
                    y=tmp.getPosy()+yt;
                    canvas.drawPoint(x,y,tmpPincel);
                    j=j+0.1;
                }
                /*
                for (int i =0;i<=360;i++){
                    float x,y,xt,yt;
                    xt = (float) (tmp.getRadio()*(Math.cos(i)));
                    yt = (float) (tmp.getRadio()*(Math.sin(i)));

                    x=tmp.getPosx()+xt;
                    y=tmp.getPosy()+yt;
                    canvas.drawPoint(x,y,tmpPincel);
                }
                */


            }
            if(obj instanceof Cuadrado){
                Cuadrado tmp = (Cuadrado)obj;
                //this.drawCuadrilatero(tmp.getPosx(),tmp.getPosy(),tmp.getTamLado(),tmp.getTamLado(),tmp.getColor(),canvas);
                canvas.drawRect(tmp.getPosx(),tmp.getPosy(),tmp.getPosx()+tmp.getTamLado(),tmp.getPosy()+tmp.getTamLado(),color(tmp.getColor()));
                //canvas.drawRect(tmp.getPosx()+ANCHO,tmp.getPosy()+ANCHO,tmp.getPosx()+tmp.getTamLado()-ANCHO,tmp.getPosy()+tmp.getTamLado()-ANCHO,color("default"));


            }
            if(obj instanceof Linea){
                Linea tmp =(Linea)obj;
                Paint tmpPincel = color(tmp.getColor());
                tmpPincel.setStrokeWidth(ANCHO);
                canvas.drawLine(tmp.getPosx(),tmp.getPosy(),tmp.getPosx2(),tmp.getPosy2(),tmpPincel);
            }
            if(obj instanceof Poligono){
                Poligono tmp = (Poligono)obj;
                this.drawPoligono(canvas,tmp);
            }
            if(obj instanceof Rectangulo){
                Rectangulo tmp = (Rectangulo)obj;
                //this.drawCuadrilatero(tmp.getPosx(),tmp.getPosy(),tmp.getAlto(),tmp.getAncho(),tmp.getColor(),canvas);
                canvas.drawRect(tmp.getPosx(),tmp.getPosy(),tmp.getPosx()+tmp.getAlto(),tmp.getPosy()+tmp.getAncho(),color(tmp.getColor()));
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

    public void drawCuadrilatero(int px,int py,int alto,int ancho,String color,Canvas canvas){
        if(px==0){
            px=ANCHO/2;
        }
        if(py==0){
            py=ANCHO/2;
        }
        Paint tmpPincel =  color(color);
        tmpPincel.setStrokeWidth(ANCHO);
        //ARRIBA
        canvas.drawLine(px-(ANCHO/2),py,px+ancho+(ANCHO/2),py,tmpPincel);
        //LADO DERECHO
        canvas.drawLine(px,py,px,py+alto,tmpPincel);
        //ABAJO
        canvas.drawLine(px-(ANCHO/2),py+alto,px+ancho+(ANCHO/2),py+alto,tmpPincel);
        //LADO IZQUIERDO
        canvas.drawLine(px+ancho,py,px+ancho,py+alto,tmpPincel);
    }
    public void drawPoligono(Canvas canvas,Poligono poligono){
        Paint pincel = color(poligono.getColor());
        pincel.setStrokeWidth(ANCHO);

        double a=poligono.getAncho()/2,b=poligono.getAlto()/2;

        int lados = poligono.getLados();

        double angulos[]= new double[lados+1];
        Point puntos[] = new Point[lados+1];

        for (int i = 0; i <= lados; i++) {
            angulos[i]=(i*(360/lados));
        }
        double tx,ty,r;
        int cont =0;

        for(double an:angulos){
            r = radio(an, a, b);
            tx = r*Math.cos(an*Math.PI/180);
            ty = r*Math.sin(an*Math.PI/180);
            puntos[cont]=new Point(tx, ty);
            cont++;
        }

        for(int i=0;i<(lados);i++){
            if(i==(lados-1)){
                canvas.drawLine((float) puntos[i].getX()+poligono.getPosx(),(float) puntos[i].getY()+poligono.getPosy(),(float) puntos[0].getX()+poligono.getPosx(),(float)puntos[0].getY()+poligono.getPosy(),pincel);
            }else{
                canvas.drawLine((float) puntos[i].getX()+poligono.getPosx(),(float) puntos[i].getY()+poligono.getPosy(),(float) puntos[i+1].getX()+poligono.getPosx(),(float)puntos[i+1].getY()+poligono.getPosy(),pincel);
            }

        }



    }
    private double radio(double angulo,double a,double b){
        double tmp1,tmp2,tmp3,cos,sin;

        cos = Math.cos(angulo*Math.PI/180);

        sin = Math.sin(angulo*Math.PI/180);


        tmp1 = (Math.pow(cos, 2))/(Math.pow(a, 2));
        tmp2 = (Math.pow(sin, 2))/(Math.pow(b, 2));

        tmp3 = Math.sqrt(1/(tmp1+tmp2));

        return tmp3;
    }

}
