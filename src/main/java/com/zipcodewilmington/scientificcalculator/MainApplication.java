package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
    }
    public static void switchUnitsMode(String mode){
        System.out.println("Please choose unit: Degrees or Radians");
        if(mode == "Degrees"){
            return Math.toDegrees();
            System.out.println("You are now working in Degrees.");
        }else if(mode == "Radians"){
            return Math.toRadians();
            System.out.println("You are now working in Radians.");
        }
    }
    public static void sin(){
        switchUnitsMode();
        if(mode == Degrees){
            
        }

    }
}
