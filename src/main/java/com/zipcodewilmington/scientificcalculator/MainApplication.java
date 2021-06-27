package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */

public class MainApplication {
     double curValue=0;
     String operator=null;
     double input;

    public MainApplication(){
        setCurValue(0);
        setOperator(null);
    }

    public MainApplication(double input, String operator) {
        this.curValue=input;
    }

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        Console.getStringInput();
    }

        public  double getCurValue() {
            return curValue;
        }

        public void setCurValue(double curValue) {
            this.curValue = curValue;
        }

        public  String getOperator() {
            return this.operator;
        }

        public void setOperator(String operator) {
            this.operator = operator;
        }

        public static double add(double input1,double input2) {
            return input1+input2;
        }

        public void display(double result)
        {
            System.out.printf("Your result is: %5.2f",result);
        }

    public static double substract(double input1, double input2) {
        return input1-input2;
    }

    public double multiply(double input, double input2) {
        return input*input2;
    }

    public void storeCurrentNumber(double input) {
        this.setCurValue(input);
    }

    public double divide(double input, double input2) {
        return input/input2;
    }


    public double inverse(double input) {
        return 1/input;
    }
}
