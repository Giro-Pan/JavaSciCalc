package com.zipcodewilmington.scientificcalculator;

public class Computer {
    public double add(double input1, double input2) {
        return input1+input2;
    }

    public double substract(double value, double value1) {
        return value+value1;
    }


    public double multiply(double value, double value1) {
        return value*value1;
    }

    public double divide(double value, double value1) {
        return value/value1;
    }

    public double findSquare(double value) {
        return Math.pow(value,2);
    }

    public double findSquareRoot(double value) {
        return Math.sqrt(value);
    }

    public double findExponent(double value, double value1) {
        return Math.pow(value,value1);
    }

    public double findInverse(double value) {
        return 1/value;
    }

    public double findInvert(double value) {
        return -value;
    }
}
