package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;
import com.zipcodewilmington.scientificcalculator.MainApplication;
/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public Console(double input, String operator) {

    }

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static void getStringInput() {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Hello! Please enter the operation to be performed");
        while(keyboardInput.hasNext()){
            String operator=keyboardInput.nextLine();
            System.out.println("Can you pls enter a number? ");
            double currInput=keyboardInput.nextDouble();

            MainApplication core1=new MainApplication(currInput,operator);
            switch(operator){
                case "+":
                    System.out.println("Now can you pls enter another number? ");
                    double input2 = keyboardInput.nextDouble();
                    double result = core1.add(currInput, input2);
                    core1.display(Double.toString(result));
                    break;
                case "-":
                    System.out.println("Now can you pls enter another number? ");
                    input2=keyboardInput.nextDouble();
                    result=core1.substract(currInput,input2);
                    core1.display(Double.toString(result));
                    break;
            }
        }
    }

    public static Integer getIntegerInput(String prompt) {
        return null;
    }

    public static Double getDoubleInput(String prompt) {
        return null;
    }
}
