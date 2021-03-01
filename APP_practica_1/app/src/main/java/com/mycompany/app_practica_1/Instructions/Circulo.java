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
public class Circulo implements Serializable {
    private double posx;
    private double posy;
    private double radio;
    private String color;
    public Circulo(){
        
    }
    public Circulo(double posx,double posy,double radio,String color){
        this.posx=posx;
        this.posy=posy;
        this.radio=radio;
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

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circulo{" + "posx=" + posx + ", posy=" + posy + ", radio=" + radio + ", color=" + color + '}';
    }
    
}
