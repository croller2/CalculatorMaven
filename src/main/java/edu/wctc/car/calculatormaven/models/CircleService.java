/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.car.calculatormaven.models;

/**
 *
 * @author chris
 */
public class CircleService implements AreaCalculatorService {
    private double radius;
    
    
    public CircleService(String radius){
        setRadius(radius);
    }
    
    @Override
    public double calculateArea() {
        return (Math.PI * radius * radius);
    }

    private final void setRadius(String radius) {
        try
        {
            double input = Double.parseDouble(radius);
            if(input > 0){
                this.radius = input;
            }
        }catch(NumberFormatException e)
        {
            this.radius = 0.0;
        }
    }
    
    public final double getRadius(){
        return this.radius;
    }
    
}
