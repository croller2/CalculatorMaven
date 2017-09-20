/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.car.calculatormaven.models;

public class TriangleService {
    private double sideA;
    private double sideB;
    
    public TriangleService(String sideA , String sideB){
        setSideA(sideA);
        setSideB(sideB);
    }

    private final void setSideA(String sideA) {
        try
        {
            double input = Double.parseDouble(sideA);
            if(input > 0){
                this.sideA = input;
            }
        }catch(NumberFormatException e)
        {
            this.sideA = 0.0;
        }
    }

    private final void setSideB(String sideB) {
        try
        {
            double input = Double.parseDouble(sideB);
            if(input > 0){
                this.sideB = input;
            }
        }catch(NumberFormatException e)
        {
            this.sideB = 0.0;
        }
    }
    
    public double calcSideC(){
        return Math.sqrt((sideA*sideA) + (sideB * sideB));
    }
}
