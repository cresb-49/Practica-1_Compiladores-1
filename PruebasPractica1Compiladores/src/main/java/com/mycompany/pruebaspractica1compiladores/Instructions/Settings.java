package com.mycompany.pruebaspractica1compiladores.Instructions;

import java.util.ArrayList;


public class Settings {
    private ArrayList<Integer> nums = new ArrayList<>();
       
    public Settings() {
        
    }
    public ArrayList getNums() {
        return nums;
    }
    public void agregarNumero(int num){
        this.nums.add(num);
    }
    public void setNums(ArrayList nums) {
        this.nums = nums;
    }
}
