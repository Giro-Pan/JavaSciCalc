package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        String operator;
        println(prompt);
        Scanner keyboardInput = new Scanner(System.in);
        operator=keyboardInput.nextLine();
        return operator;
    }

    public static Integer getIntegerInput(String prompt) {
        return null;
    }

    public static Double getDoubleInput(String prompt) {
        Double value;
        println(prompt);
        Scanner keyboardInput = new Scanner(System.in);
        value=keyboardInput.nextDouble();
        return value;
    }

    public static void printActions() {
        System.out.println("Available actions: press\n");
        System.out.println("Q: to quit\n" +
                "+: to add\n"+
                "-: to substract\n"+
                "/: to divide\n"+
                "displayCurrent\n" +
                "clearDisplay\n" +
                "changeNumber\n" +
                "square\n" +
                "sqrt\n" +
                "exponent\n" +
                "inverse\n" +
                "invertSign\n" +
                "sin\n" +
                "cos\n" +
                "tan\n" +
                "sin-1\n" +
                "cos-1\n" +
                "tan-1\n" +
                "log\n" +
                "10^x\n" +
                "ln\n" +
                "e^x\n" +
                "!\n" +
                "areaR(length,width)\n" +
                "areaT(base,height)\n" +
                "areaC(radius)\n" +
                "cubed\n" +
                "cube root\n");

        //System.out.println("Enter your choice");

    }
}



