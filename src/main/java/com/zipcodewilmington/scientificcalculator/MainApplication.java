package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */

public class MainApplication {
    private static double curValue;
    private static String operator;
    private final double input;

    public MainApplication(double input, String operator) {
        this.input=input;
    }

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        Console.getStringInput();
    }

        public static double getCurValue() {
            return curValue;
        }

        public void setCurValue(double curValue) {
            this.curValue = curValue;
        }

        public static String getOperator() {
            return operator;
        }

        public void setOperator(String operator) {
            this.operator = operator;
        }

        public static double add(double input1,double input2) {
            return input1+input2;
        }

        public static void display(String result){
            System.out.println("Your result is: "+result);
        }

    double substract(double input1, double input2) {
        return input1-input2;
    }
}
