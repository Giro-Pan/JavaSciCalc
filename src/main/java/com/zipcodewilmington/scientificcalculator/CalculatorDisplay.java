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
    public static String toBinary(double currValue) {
        int value = (int) Math.round(currValue);
        return Integer.toBinaryString(value);
    }
    public static String toOctal(double currValue) {
        int value = (int) Math.round(currValue);
        return Integer.toOctalString(value);
    }
    public static int toDecimal(double currValue) {
        int value = (int) Math.round(currValue);
        return Integer.parseInt(String.valueOf(value), 10);
    }
    public static String toHexadecimal(double currValue) {
        int value = (int) Math.round(currValue);
        return Integer.toHexString(value);
    }
    public double toRadians(double currValue) {
        return Math.toRadians(currValue);
    }
    public double toDegrees(double currValue) {
        return Math.toDegrees(currValue);
    }
}
