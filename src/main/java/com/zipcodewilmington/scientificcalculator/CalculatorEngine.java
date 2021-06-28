package com.zipcodewilmington.scientificcalculator;

public class CalculatorEngine {
    private Computer computer=new Computer();//does calculations
    private CalculatorDisplay display=new CalculatorDisplay();//stores result and also previous calculations

    public void performAdd() {
        double firstValue=Console.getDoubleInput("Please Enter ur first Number: ");
        double secondValue=Console.getDoubleInput("Enter second number: ");
        double sum=computer.add(firstValue,secondValue);
        display.setValue(sum);
        display.displayResult(sum);
    }

    public void performSubstract() {
        double firstValue = Console.getDoubleInput("Please Enter ur first Number: ");
        double secondValue = Console.getDoubleInput("Enter second number: ");
        double difference = computer.substract(firstValue, secondValue);
        display.setValue(difference);
        display.displayResult(difference);
    }

    public void performMultiply() {
        double firstValue=Console.getDoubleInput("Please Enter ur first Number: ");
        double secondValue=Console.getDoubleInput("Enter second number: ");
        double multiplication=computer.multiply(firstValue,secondValue);
        display.setValue(multiplication);
        display.displayResult(multiplication);
    }

    public void performDivide() {
        double firstValue=Console.getDoubleInput("Please Enter ur first Number: ");
        double secondValue=Console.getDoubleInput("Enter second number: ");
        if(secondValue==0){
            display.displayResult("ERR");
        }
        double division=computer.divide(firstValue,secondValue);
        display.setValue(division);
        display.displayResult(division);
    }

    public void performSquare() {
        double firstValue=Console.getDoubleInput("Please Enter ur first Number: ");
        double square=computer.findSquare(firstValue);
        display.displayResult(square);
    }

    public void performSquareRoot() {
        double firstValue=Console.getDoubleInput("Please Enter ur first Number: ");
        double squareRoot=computer.findSquareRoot(firstValue);
        display.displayResult(squareRoot);
    }

    public void performExponentiation() {
        double firstValue=Console.getDoubleInput("Please Enter ur first Number: ");
        double secondValue=Console.getDoubleInput("Enter second number: ");
        double exponent=computer.findExponent(firstValue,secondValue);
        display.displayResult(exponent);
    }

    public void performInverse() {
        double firstValue=Console.getDoubleInput("Please Enter ur first Number: ");
        if(firstValue<0){
            System.out.println("ERR");
            System.exit(0);
        }
        double inverse=computer.findInverse(firstValue);
        display.displayResult(inverse);
    }


    public void invertSign() {
        double firstValue=Console.getDoubleInput("Please Enter ur first Number: ");
        double invert=computer.findInvert(firstValue);
        display.displayResult(invert);
    }

    public void displayCurrent() {
        display.getCurrentValue();
    }

    public void clearCurrent() {
        display.setValue(0.0);
    }

    public void changeNumber() {
        double firstValue=Console.getDoubleInput("Please Enter ur first Number: ");
        display.setValue(firstValue);
    }
}

