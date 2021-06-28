package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Calculator {
    double input1 = 0;
    double input2 = 0;
    String operator;
    int choice;

    private CalculatorEngine engine = new CalculatorEngine();
    private CalculatorDisplay display = new CalculatorDisplay();

    public Calculator(String s) {
        this.operator = s;
    }

    public String getOperator() {
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
        boolean quit = false;
        while (!quit) {
            System.out.println();
            //MainApplication main1=new MainApplication();
            //Calculator calc=new Calculator();
            //CalculatorEngine engine=new CalculatorEngine();
            //CalculatorDisplay display=new CalculatorDisplay();

            //switch case for operator begins
            switch (getOperator()) {
                case "Q":
                    System.out.println("Shutting down...");
                    quit = true;
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
                case "sin":
                    engine.performSin();
                    break;
                case "cos":
                    engine.performCos();
                    break;
                case "tan":
                    engine.performTan();
                    break;
                case "sin-1":
                    engine.performInverseSin();
                    break;
                case "cos-1":
                    engine.performInverseCos();
                    break;
                case "tan-1":
                    engine.performInverseTan();
                    break;
                case "log":
                    engine.performLog();
                    break;
                case "10^x":
                    engine.performInverseLog();
                    break;
                case "ln":
                    engine.performLn();
                    break;
                case "e^x":
                    engine.performInverseLn();
                    break;
                case "!":
                    engine.performFactorial();
                    break;
                    //Areas
                case "areaR":
                    engine.performAreaRectangle();
                    break;
                case "areaT":
                    engine.performAreaTriangle();
                    break;
                case "areaC":
                    engine.performAreaCircle();
                    break;
                case "cube root":
                    engine.performCubeRoot();
                    break;
                case "cubed":
                    engine.performCubed();
                    break;
                    //Display
            /*case "Binary":
                display.toBinary();
            case "Octal":
                display.toOctal();
            case "Decimal":
                display.toDecimal();
            case "Hex":
                display.toHexadecimal();*/

            }
        }
    }
}

