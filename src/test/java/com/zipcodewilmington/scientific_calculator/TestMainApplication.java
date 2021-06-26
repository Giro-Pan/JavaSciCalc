package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;

/**
 * Created by leon on 2/9/18.
 */

public class TestMainApplication {
    @org.junit.Test
    public void TestPrintMethod()
    {
        //double actualNumber= CoreClass.getCurValue();
        int actualNumber= (int) MainApplication.add(5,5);
        int expectedNumber=10;
        Assert.assertEquals(expectedNumber,actualNumber);
        //System.out.println("Hello");
    }

}
