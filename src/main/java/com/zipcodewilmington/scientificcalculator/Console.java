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
        System.out.println("+: to add\n"+
                "-: to substract\n"+
                "/: to divide\n"+
                "5: to print Menu\n"+
                "0: to Quit\n");
        //System.out.println("Enter your choice");

    }
}
