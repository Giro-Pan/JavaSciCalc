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
        //PrintClass print =new PrintClass();
        Scanner keyboardInput = new Scanner(System.in);
        MainApplication core1=new MainApplication();
        //Calculator calc=new Calculator();
        //CalculatorEngine engine=new CalculatorEngine();
        //CalculatorDisplay display=new CalculatorDisplay();
        boolean quit=false;
            while(!quit){
                System.out.println();


            printActions();
            //print.printActions();
            System.out.println("Enter your choice (Press 5 for menu)");
            String operator=keyboardInput.nextLine();
            keyboardInput.nextLine();
            core1.setOperator(operator);
            double currInput=0;

                //System.out.println("current value is: ");core1.display(core1.getCurValue());
            //switch case for operator begins

            switch(operator){
                case "QUIT":
                    System.out.println("Shutting down...");
                    quit=true;
                    break;
                case "5":
                    printActions();
                    break;
                case "+":
                    System.out.println("Can you pls enter a number? ");
                    currInput=keyboardInput.nextDouble();
                    //keyboardInput.nextLine();
                    core1.setCurValue(currInput);
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
                        break;
                    }
                    core1.setCurValue(input2);
                    result=core1.divide(currInput,input2);
                    core1.display((result));
                    break;
                case "displayCurrent":
                    System.out.println("Your Current Value is: ");
                    core1.display(core1.getCurValue());
                    break;
                case "clearDisplay":
                    core1.setCurValue(0);
                    core1.display(core1.getCurValue());
                    break;
                case "changeNumber":
                    System.out.println("Enter the number");
                    double changedNumber= keyboardInput.nextDouble();
                    core1.setCurValue(changedNumber);
                    core1.display(core1.curValue);
                    break;
                case "square":
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
            //keyboardInput.nextLine();
        }
        System.out.println("Do u want to continue(y/n)?");
        String userInput=keyboardInput.nextLine();
        //keyboardInput.nextLine();
        if(userInput.equals("y")) {Console.getStringInput();}
    }

    public static Integer getIntegerInput(String prompt) {
        return null;
    }

    public static Double getDoubleInput(String prompt) {
        return null;
    }

    public static void printActions(){
        System.out.println("Available actions: press\n");
        System.out.println("+: to add\n"+
                "-: to substract\n"+
                "/: to divide\n"+
                "5: to print Menu\n"+
                "0: to Quit\n");
        System.out.println("Enter your choice");
    }
}
