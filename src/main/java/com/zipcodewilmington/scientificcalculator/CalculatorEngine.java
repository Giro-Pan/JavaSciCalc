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
}

