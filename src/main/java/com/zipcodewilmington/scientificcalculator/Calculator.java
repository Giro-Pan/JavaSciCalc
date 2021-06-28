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
                case "sin-1":
                    engine.performInverseSin();
                case "cos-1":
                    engine.performInverseCos();
                case "tan-1":
                    engine.performInverseTan();
                case "log":
                    engine.performLog();
                case "10^x":
                    engine.performInverseLog();
                case "ln":
                    engine.performLn();
                case "e^x":
                    engine.performInverseLn();
                case "!":
                    engine.performFactorial();
                    //Areas
                case "areaR":
                    engine.performAreaRectangle();
                case "areaT":
                    engine.performAreaTriangle();
                case "areaC":
                    engine.performAreaCircle();
                case "cube root":
                    engine.performCubeRoot();
                case "cubed":
                    engine.performCubed();
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

