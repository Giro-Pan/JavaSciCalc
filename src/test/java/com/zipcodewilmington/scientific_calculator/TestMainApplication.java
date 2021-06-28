package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.CalculatorDisplay;
import com.zipcodewilmington.scientificcalculator.Computer;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    Computer comp = new Computer();
    CalculatorDisplay display = new CalculatorDisplay();

    /*@org.junit.Test
    public void getCurrentValue() {
        //given
        double currValue = 6;
        double expectedNumber = 6;
        //when
        double actualNumber = display.getCurrentValue(currValue);
        //then
        Assert.assertEquals(expectedNumber, actualNumber, 0.001);
    }
    @org.junit.Test
    public void testGetOperator() {
        //given
        String currInput = "+";
        String expectedValue = "+";
        //when
        String actualValue = calc.getOperator(currInput);
        //then
        Assert.assertEquals(expectedValue, actualValue);
    }*/


    @org.junit.Test
    public void TestAdd() {
        //given
        double input1 = 5;
        double input2 = 4;
        double expectedNumber = 9;
        //when
        double actualNumber = comp.add(input1, input2);
        //then
        Assert.assertEquals(expectedNumber, actualNumber, .001);
    }
    /*@org.junit.Test
    public void displayResult() {
        double result = 5;
        String expectedValue = "Your result is 5";
        //when
        String actualValue = display.displayResult(result);
        //then
        Assert.assertEquals(expectedValue, actualValue);
    }*/
    @org.junit.Test
    public void TestSubtract() {
        double input1 = 9;
        double input2 = 2;
        double expectedValue = 7;
        //when
        double actualValue = comp.subtract(input1, input2);
        //then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }
    @org.junit.Test
    public void TestMultiply() {
        double input1 = 9;
        double input2 = 2;
        double expectedValue = 18;
        //when
        double actualValue = comp.multiply(input1, input2);
        //then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }
    @org.junit.Test
    public void TestDivide() {
        double input1 = 8;
        double input2 = 2;
        double expectedValue = 4;
        //when
        double actualValue = comp.divide(input1, input2);
        //then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }
    @org.junit.Test
    public void TestInverse() {
        double input = 8;
        double expectedValue = 0.125;
        //when
        double actualValue = comp.findInverse(input);
        //then
        Assert.assertEquals(expectedValue, actualValue, .001);
    }
    /*@org.junit.Test
    public void TestIsRadian(){
        //given
        double input = 1.047;
        //then
        boolean actualValue = MainApplicationsv1.isRadian(input);
        //when
        Assert.assertTrue(actualValue);
    }*/
    @org.junit.Test
    public void TestSinMethod() {
        double actualNumber = comp.findSinValue(60);
        double expectedNumber= 0.8660254037844386;
        Assert.assertEquals(expectedNumber, actualNumber, 0);
    }
    @org.junit.Test
    public void TestCosMethod() {
        double actualNumber = comp.findCosValue(60);
        double expectedNumber= 0.5000000000000001;
        Assert.assertEquals(expectedNumber, actualNumber, 0);
    }
    @org.junit.Test
    public void TestTanMethod() {

        double actualNumber = comp.findTanValue(60);
        double expectedNumber= 1.7320508075688767;
        Assert.assertEquals(expectedNumber, actualNumber, 0);
    }
    @org.junit.Test
    public void TestInSinMethod() {
        double actualNumber = comp.findInverseSinValue(1.0);
        double expectedNumber= 1.5707963267948966;
        Assert.assertEquals(expectedNumber, actualNumber, 0);
    }
    @org.junit.Test
    public void TestInCosMethod() {
        double actualNumber = comp.findInverseCosValue(-1.0);
        double expectedNumber= 3.141592653589793;
        Assert.assertEquals(expectedNumber, actualNumber, 0);
    }
    @org.junit.Test
    public void TestInTanMethod() {
        double actualNumber = comp.findInverseTanValue(1.5);
        double expectedNumber = 0.982793723247329;
        Assert.assertEquals(expectedNumber, actualNumber, 0);
    }
    /**
     * Test logs
     */
    @org.junit.Test
    public void TestLogarithms() {
        double actualNumber = comp.findLog(100);
        double expectedNumber = 2;
        Assert.assertEquals(expectedNumber, actualNumber, 0);
    }
    @org.junit.Test
    public void TestInverseLogs() {
        double actualNumber = comp.findInverseLog(10);
        double expectedNumber = 10000000000.00;
        Assert.assertEquals(expectedNumber, actualNumber, 0);
    }
    @org.junit.Test
    public void TestNaturalLogarithms() {
        double actualNumber = comp.findLn(100);
        double expectedNumber = 4.605170185988092;
        Assert.assertEquals(expectedNumber, actualNumber, 0);
    }
    @org.junit.Test
    public void TestInverseNLogs() {
        double actualNumber = comp.findInverseLn(5);
        double expectedNumber = 148.41315910257657;
        Assert.assertEquals(expectedNumber, actualNumber, 0);
    }
    @org.junit.Test
    public void TestFactorial(){
        double actualNumber = comp.findFactorial(5);
        double expectedNumber = 120;
        Assert.assertEquals(expectedNumber, actualNumber, 0);
    }
    @org.junit.Test
    public void TestBinary(){
        String actualNumber = display.toBinary(250);
        String expectedNumber = "11111010";
        Assert.assertEquals(expectedNumber, actualNumber);
    }
    @org.junit.Test
    public void TestOctal(){
        String actualNumber = display.toOctal(250);
        String expectedNumber = "372";
        Assert.assertEquals(expectedNumber, actualNumber);
    }
    @org.junit.Test
    public void TestDecimal(){
        int actualNumber = display.toDecimal(250);
        int expectedNumber = 250;
        Assert.assertEquals(expectedNumber, actualNumber, 0);
    }
    @org.junit.Test
    public void TestHexadecimal(){
        String actualNumber = display.toHexadecimal(10);
        String expectedNumber = "a";
        Assert.assertEquals(expectedNumber, actualNumber);
    }
}