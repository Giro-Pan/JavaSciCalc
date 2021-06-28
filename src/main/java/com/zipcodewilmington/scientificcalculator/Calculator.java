package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Calculator {
    double input1 = 0;
    double input2 = 0;
    String operator;

    private CalculatorEngine engine = new CalculatorEngine();
    private CalculatorDisplay display = new CalculatorDisplay();

    public Calculator(String s) {
        this.operator = s;
    }

    private String getOperator() {
        return this.operator;
    }

    private void setOperator(String operator) {
        this.operator = operator;
    }

    public void operatorUsed(String s) {
        this.operator = s;
    }

    public Calculator(double input1, double input2, String operator, CalculatorEngine engine, CalculatorDisplay display) {
        this.input1 = input1;
        this.input2 = input2;
        this.operator = getOperator();
        this.engine = engine;
        this.display = display;
    }

    public void run() {
        Scanner keyboardInput = new Scanner(System.in);
        //MainApplication main1=new MainApplication();
        //Calculator calc=new Calculator();
        //CalculatorEngine engine=new CalculatorEngine();
        //CalculatorDisplay display=new CalculatorDisplay();

        //switch case for operator begins

        switch (getOperator()) {
            case "5":
                Console.printActions();
                break;
            case "+":
                engine.performAdd();
                break;
            case "-":
                engine.performSubstract();
                break;
            case "*":
                engine.performMultiply();
                break;
            case "/":
                engine.performDivide();
                break;
                    /*
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
                    break;*/
            //keyboardInput.nextLine();
        }
    }

}
