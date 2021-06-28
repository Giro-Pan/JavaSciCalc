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

                case "displayCurrent":
                    engine.displayCurrent();
                    break;
                case "clearDisplay":
                    engine.clearCurrent();
                    break;
                case "changeNumber":
                    engine.changeNumber();
                    break;
                case "square":
                    engine.performSquare();
                    break;
                case "sqrt":
                    engine.performSquareRoot();
                    break;
                case "exponent":
                    engine.performExponentiation();
                    break;
                case "inverse":
                    engine.performInverse();
                    break;
                case "invertSign":
                    engine.invertSign();
                    break;
            //keyboardInput.nextLine();
        }
    }

}
