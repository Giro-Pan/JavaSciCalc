package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;
import java.util.concurrent.Callable;


/**
 * Created by leon on 2/9/18.
 */
import java.util.Scanner;
import java.util.concurrent.Callable;


/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {

        Console.println("Welcome to my calculator!");
        Console.printActions();
        String s = Console.getStringInput("Enter your choice. Press 0 to quit.");
        Console.println("The user input %s: ", s);
        Calculator calc1=new Calculator(s);
        calc1.run();
        //Integer i = Console.getIntegerInput("Enter an integer");
        //Double d = Console.getDoubleInput(" ");
    }

 }