package com.zipcodewilmington.scientificcalculator;

public class Computer {
    public static double add(double input1, double input2) {
        return input1+input2;
    }

    public double subtract(double value, double value1) {
        return value-value1;
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

    public double findSinValue(double value) {
        double sinVal = 0.0;
        double b = Math.toRadians(value);
        sinVal += Math.sin(b);
        return sinVal;
    }

    public double findCosValue(double firstValue) {
        double cosVal = 0.0;
        double b = Math.toRadians(firstValue);
        cosVal += Math.cos(b);
        return cosVal;
    }

    public double findTanValue(double firstValue) {
        double tanVal = 0.0;
        double b = Math.toRadians(firstValue);
        tanVal += Math.tan(b);
        return tanVal;
    }

    public double findInverseSinValue(double firstValue) {
        double inverseSinVal = 0.0;
        if (firstValue > 1.0 || firstValue < -1) { System.out.println("Please select a number greater than zero and less than 1."); }
        inverseSinVal += Math.asin(firstValue);
        return inverseSinVal;
    }

    public double findInverseCosValue(double firstValue) {
        double inverseCosVal = 0.0;
        if (firstValue > 1.0 || firstValue < -1) {
            System.out.println("Please select a number greater than zero and less than 1."); }
        inverseCosVal += Math.acos(firstValue);
        return inverseCosVal;
    }

    public double findInverseTanValue(double firstValue) {
        double inverseTanVal = 0.0;
        if (firstValue > 1.0 || firstValue < -1) {
            System.out.println("Please select a number greater than zero and less than 1."); }
        inverseTanVal += Math.atan(firstValue);
        return inverseTanVal;
    }

    public double findLog(double firstValue) {
        return Math.log10(firstValue);
    }

    public double findInverseLog(double firstValue) {
        return Math.pow(10, firstValue);
    }

    public double findLn(double firstValue) {
        return Math.log(firstValue);
    }

    public double findInverseLn(double firstValue) {
        return Math.pow(Math.E, firstValue);
    }

    public double findFactorial(double firstValue) {
        double factoralFunction = 1.0;
        int i;
        for(i = 2; i <= firstValue; i++){
            factoralFunction += factoralFunction * (i-1);
        } return factoralFunction;
    }

    public double areaRectangle(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }

    public double areaTriangle(double firstValue, double secondValue) {
        return (1/2) * firstValue * secondValue;
    }

    public double areaCircle(double firstValue) {
        return Math.PI * Math.pow(firstValue, 2);
    }

    public double cubeRoot(double firstValue) {
        return java.lang.Math.cbrt(firstValue);
    }

    public double cubed(double firstValue) {
        return Math.pow(firstValue, 3);
    }
}

