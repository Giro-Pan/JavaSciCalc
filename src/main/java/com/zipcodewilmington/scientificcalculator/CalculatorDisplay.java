package com.zipcodewilmington.scientificcalculator;

public class CalculatorDisplay {
    private Double newValueToBeSet;
    public void setValue(Double newValueToBeSet){
        this.newValueToBeSet=newValueToBeSet;
    }
    public void displayResult(double result) {
        System.out.printf ("The result is: %.2f",result);
        System.out.println();
    }
    public void displayResult(String result) {
        System.out.printf (result);
        System.out.println();
    }
}
