package com.zipcodewilmington.scientificcalculator;

public class PrintClass {
    public PrintClass() {
    }

    public void printActions(){
        System.out.println("Available actions: press\n");
         System.out.println("+: to add\n"+
                            "-: to substract\n"+
                            "/: to divide\n"+
                            "5: to print Menu\n"+
                            "0: to Quit\n");
        System.out.println("Enter your choice");
    }
}
