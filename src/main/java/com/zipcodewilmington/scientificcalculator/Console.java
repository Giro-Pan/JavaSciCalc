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
        MainApplication core1=new MainApplication();

            System.out.println("Can you pls enter a number? ");
            double currInput=keyboardInput.nextDouble();
            keyboardInput.nextLine();
            core1.setCurValue(currInput);
            System.out.println("Can you pls enter an operator? ");
            //while(keyboardInput.hasNext()){
            String operator=keyboardInput.nextLine();
            core1.setOperator(operator);

            //switch case for operator begins

            switch(operator){
                case "+":
                    System.out.println("Now can you pls enter another number? ");
                    double input2 = keyboardInput.nextDouble();
                    double result = core1.add(currInput, input2);
                    core1.display((result));
                    break;
                case "-":
                    System.out.println("Now can you pls enter another number? ");
                    input2=keyboardInput.nextDouble();
                    core1.setCurValue(input2);
                    result=core1.substract(currInput,input2);
                    core1.display((result));
                    break;
                case "*":
                    System.out.println("Now can you pls enter another number? ");
                    input2=keyboardInput.nextDouble();
                    core1.setCurValue(input2);
                    result=core1.multiply(currInput,input2);
                    core1.display((result));
                    break;
                case "/":
                    System.out.println("Now can you pls enter another number? ");
                    input2=keyboardInput.nextDouble();
                    if(input2==0){
                        System.out.println("ERR");
                        System.exit(0);
                    }
                    core1.setCurValue(input2);
                    result=core1.divide(currInput,input2);
                    core1.display((result));
                    break;
                case "displayCurrent":
                    core1.display(core1.getCurValue());
                    break;
                case "clearDisplay":
                    core1.display(0);
                    break;
                case "changeNumber":
                    System.out.println("Enter the number");
                    double changedNumber= keyboardInput.nextDouble();
                    core1.setCurValue(changedNumber);
                    core1.display(core1.curValue);
                    break;
                case "sqrare":
                    core1.display(Math.pow(currInput,2));
                    break;
                case "sqrt":
                    core1.display(Math.sqrt(currInput));
                    break;
                case "exponent":
                    System.out.println("Now can you pls enter another number? ");
                    input2=keyboardInput.nextDouble();
                    core1.display(Math.pow(currInput,input2));
                    break;
                case "inverse":
                    if(currInput<0){
                        System.out.println("ERR");
                        System.exit(0);
                    }
                    core1.display(core1.inverse(currInput));
                    break;
                case "invertSign":
                    core1.setCurValue(-currInput);
                    System.out.println("Now the number is: "+(-currInput));
                    break;
            }
            keyboardInput.nextLine();
       // }
        System.out.println("Do u want to continue(y/n)?");
        String userInput=keyboardInput.nextLine();
        //keyboardInput.nextLine();
        //System.out.println(userInput);
        if(userInput.equals("y")) {Console.getStringInput();}
    }

    public static Integer getIntegerInput(String prompt) {
        return null;
    }

    public static Double getDoubleInput(String prompt) {
        return null;
    }
}
