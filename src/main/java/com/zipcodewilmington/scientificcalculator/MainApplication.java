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

    /**
     * Start of Trig Functions
     */
    public static double sin(int a){
        double sinVal = 0.0;
        double b = Math.toRadians(a);
        sinVal += Math.sin(b);
        return sinVal;
    }
    public static double cos(int a){
        double cosVal = 0.0;
        double b = Math.toRadians(a);
        cosVal += Math.cos(b);
        return cosVal;
    }
    public static double tan(int a){
        double tanVal = 0.0;
        double b = Math.toRadians(a);
        tanVal += Math.tan(b);
        return tanVal;
    }
    public static double inverseSin(double a) {
        double inverseSinVal = 0.0;
        inverseSinVal += Math.asin(a);
        return inverseSinVal;
    }
    public static double inverseCos(double a){
        double inverseCosVal = 0.0;
        inverseCosVal += Math.acos(a);
        return inverseCosVal;
    }
    public static double inverseTan(double a){
        double inverseTanVal = 0.0;
        inverseTanVal += Math.atan(a);
        return inverseTanVal;
    }
}
