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
public class Linea implements Serializable {
    private double posx;
    private double posy;
    private double posx2;
    private double posy2;
    private String color;
    public Linea(){
        
    }
    public Linea(double posx,double posy,double posx2,double posy2,String color){
        this.posx=posx;
        this.posy=posy;
        this.posx2=posx2;
        this.posy2=posy2;
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

    public double getPosx2() {
        return posx2;
    }

    public void setPosx2(double posx2) {
        this.posx2 = posx2;
    }

    public double getPosy2() {
        return posy2;
    }

    public void setPosy2(double posy2) {
        this.posy2 = posy2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Linea{" + "posx=" + posx + ", posy=" + posy + ", posx2=" + posx2 + ", posy2=" + posy2 + ", color=" + color + '}';
    }
    
}
