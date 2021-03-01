/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.app_practica_1.Instructions;

import java.io.Serializable;

/**
 *
 * @author carlo
 */
public class Cuadrado implements Serializable {
    private double posx;
    private double posy;
    private double tamLado;
    private String color;
    public Cuadrado(){
        
    }
    public Cuadrado(double posx,double posy,double tamLado,String color){
        this.posx=posx;
        this.posy=posy;
        this.tamLado=tamLado;
        this.color=color;
    }

    public double getPosx() {
        return posx;
    }

    public void setPosx(double posx) {
        this.posx = posx;
    }

    public double getPosy() {
        return posy;
    }

    public void setPosy(double posy) {
        this.posy = posy;
    }

    public double getTamLado() {
        return tamLado;
    }

    public void setTamLado(double tamLado) {
        this.tamLado = tamLado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "posx=" + posx + ", posy=" + posy + ", tamLado=" + tamLado + ", color=" + color + '}';
    }
    
}
