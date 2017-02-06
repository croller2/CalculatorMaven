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
public class RectangleService implements AreaCalculatorService {
    private double width;
    private double height;
    
    public RectangleService(String width, String height){
            setWidth(width);
            setHeight(height);
    }

    public final double getWidth() {
        return width;
    }

    public final void setWidth(String width) {
        try
        {
            double input = Double.parseDouble(width);
            if(input > 0){
                this.width = input;
            }
        }catch(NumberFormatException e)
        {
            this.width = 0.0;
        }
    }

    public final double getHeight() {
        return height;
    }

    public final void setHeight(String height) {
        try
        {
            double input = Double.parseDouble(height);
            if(input > 0){
                this.height = input;
            }
        }catch(NumberFormatException e)
        {
            this.height = 0.0;
        }
    }
    
    @Override
    public final double calculateArea(){
        return height*width;
    }
}


