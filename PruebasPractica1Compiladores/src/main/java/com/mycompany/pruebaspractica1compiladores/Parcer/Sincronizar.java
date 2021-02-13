package com.mycompany.pruebaspractica1compiladores.Parcer;

import com.mycompany.pruebaspractica1compiladores.Instructions.*;
import java.util.ArrayList;
import java.util.List;

public class Sincronizar {

    public Sincronizar() {

    }

    public List<Object> asignar(List<Integer> numeros, List<Object> sentencias) {
        int size = numeros.size()-1;
        int tmsize = sentencias.size()-1;
        
        
        for (Object sentancia : sentencias) {
            if (sentancia instanceof Circulo) {
                Circulo temp = (Circulo)sentancia;
                temp.setPosx(numeros.get(size-2));
                temp.setPosy(numeros.get(size-1));
                temp.setRadio(numeros.get(size));
                size = size-3;
            }
            if (sentancia instanceof Cuadrado) {
                Cuadrado tmp = (Cuadrado)sentancia;
                tmp.setPosx(numeros.get(size-2));
                tmp.setPosy(numeros.get(size-1));
                tmp.setTamLado(numeros.get(size));
                size = size-3;
            }
            if (sentancia instanceof Linea) {
                Linea tmp = (Linea)sentancia;
                tmp.setPosx(numeros.get(size-3));
                tmp.setPosy(numeros.get(size-2));
                tmp.setPosx2(numeros.get(size-1));
                tmp.setPosy2(numeros.get(size));
                size=size-4;
            }
            if (sentancia instanceof Poligono) {
                Poligono tmp = (Poligono)sentancia;
                tmp.setPosx(numeros.get(size-4));
                tmp.setPosy(numeros.get(size-3));
                tmp.setAlto(numeros.get(size-2));
                tmp.setAncho(numeros.get(size-1));
                tmp.setLados(numeros.get(size));
                size = size - 5;
            }
            if (sentancia instanceof Rectangulo) {
                Rectangulo tmp = (Rectangulo)sentancia;
                tmp.setPosx(numeros.get(size-3));
                tmp.setPosy(numeros.get(size-2));
                tmp.setAlto(numeros.get(size-1));
                tmp.setAncho(numeros.get(size));
                size = size - 4;
            }
            if (sentancia instanceof Animar) {
                Animar tmp = (Animar)sentancia;
                tmp.setDestinox(numeros.get(size -1));
                tmp.setDestinoy(numeros.get(size));
                size = size-2;
            }
        }
        
        List<Object> tmp = new ArrayList();
        
        for(int i=tmsize;i>=0;i--){
            //System.out.println(sentencias.get(i).toString());
            tmp.add(sentencias.get(i));
        }
        return tmp;
    }

    public int numeroDatos(Object sentancia) {
        if (sentancia instanceof Circulo) {
            return 3;
        }
        if (sentancia instanceof Cuadrado) {
            return 3;
        }
        if (sentancia instanceof Linea) {
            return 4;
        }
        if (sentancia instanceof Poligono) {
            return 5;
        }
        if (sentancia instanceof Rectangulo) {
            return 3;
        }
        if (sentancia instanceof Animar) {
            return 2;
        }
        return 0;
    }
}
