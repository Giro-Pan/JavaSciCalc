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
        double difference = computer.subtract(firstValue, secondValue);
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

    public void performSin() {
        double firstValue=Console.getDoubleInput("Please Enter ur first Number: ");
        double sinValue = computer.findSinValue(firstValue);
        display.displayResult(sinValue);
    }

    public void performCos() {
        double firstValue=Console.getDoubleInput("Please Enter ur first Number: ");
        double cosValue = computer.findCosValue(firstValue);
        display.displayResult(cosValue);
    }

    public void performTan() {
        double firstValue=Console.getDoubleInput("Please Enter ur first Number: ");
        double tanValue = computer.findTanValue(firstValue);
        display.displayResult(tanValue);
    }

    public void performInverseSin() {
        double firstValue=Console.getDoubleInput("Please Enter ur first Number: ");
        double inverseSin = computer.findInverseSinValue(firstValue);
        display.displayResult(inverseSin);
    }

    public void performInverseCos() {
        double firstValue=Console.getDoubleInput("Please Enter ur first Number: ");
        double inverseCos = computer.findInverseCosValue(firstValue);
        display.displayResult(inverseCos);
    }

    public void performInverseTan() {
        double firstValue = Console.getDoubleInput("Please Enter ur first Number: ");
        double inverseTan = computer.findInverseTanValue(firstValue);
        display.displayResult(inverseTan);
    }

    public void performLog() {
        double firstValue = Console.getDoubleInput("Please Enter ur first Number: ");
        double logValue = computer.findLog(firstValue);
        display.displayResult(logValue);
    }

    public void performInverseLog() {
        double firstValue = Console.getDoubleInput("Please Enter ur first Number: ");
        double inverseLogValue = computer.findInverseLog(firstValue);
        display.displayResult(inverseLogValue);
    }

    public void performLn() {
        double firstValue = Console.getDoubleInput("Please Enter ur first Number: ");
        double lnValue = computer.findLn(firstValue);
        display.displayResult(lnValue);
    }

    public void performInverseLn() {
        double firstValue = Console.getDoubleInput("Please Enter ur first Number: ");
        double inverseLnValue = computer.findInverseLn(firstValue);
        display.displayResult(inverseLnValue);
    }

    public void performFactorial() {
        double firstValue = Console.getDoubleInput("Please Enter ur first Number: ");
        double factorialValue = computer.findFactorial(firstValue);
        display.displayResult(factorialValue);
    }

    public void performAreaRectangle() {
        double firstValue = Console.getDoubleInput("Please Enter ur first Number: ");
        double secondValue = Console.getDoubleInput("Enter second number: ");
        double areaRectangleValue = computer.areaRectangle(firstValue, secondValue);
        display.displayResult(areaRectangleValue);
    }

    public void performAreaTriangle() {
        double firstValue = Console.getDoubleInput("Please Enter ur first Number: ");
        double secondValue = Console.getDoubleInput("Enter second number: ");
        double areaTriangleValue = computer.areaTriangle(firstValue, secondValue);
        display.displayResult(areaTriangleValue);
    }

    public void performAreaCircle() {
        double firstValue = Console.getDoubleInput("Please Enter ur first Number: ");
        double areaCircleValue = computer.areaCircle(firstValue);
        display.displayResult(areaCircleValue);
    }

    public void performCubeRoot() {
        double firstValue = Console.getDoubleInput("Please Enter ur first Number: ");
        double cubeRoot = computer.cubeRoot(firstValue);
        display.displayResult(cubeRoot);
    }

    public void performCubed() {
        double firstValue = Console.getDoubleInput("Please Enter ur first Number: ");
        double cubed = computer.cubed(firstValue);
        display.displayResult(cubed);
    }
}
