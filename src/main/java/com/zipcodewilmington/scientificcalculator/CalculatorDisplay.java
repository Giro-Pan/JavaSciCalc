package com.zipcodewilmington.scientificcalculator;

public class CalculatorDisplay {
    private Double currValue=0.0;

    public void setValue(Double newValueToBeSet){
        this.currValue=newValueToBeSet;
    }
    public void displayResult(double result) {
        System.out.printf ("The result is: %.2f",result);
        System.out.println();
    }
    public void displayResult(String result) {
        System.out.printf (result);
        System.out.println();
    }
    public double getCurrentValue(){
        return currValue;
    }
}
