package com.mycompany.app_practica_1.Instructions;

import java.io.Serializable;
import java.util.ArrayList;


public class Settings implements Serializable {
    private ArrayList<Double> nums = new ArrayList<>();
       
    public Settings() {
        
    }
    public ArrayList getNums() {
        return nums;
    }
    public void agregarNumero(double num){
        this.nums.add(num);
    }
    public void setNums(ArrayList nums) {
        this.nums = nums;
    }
}
