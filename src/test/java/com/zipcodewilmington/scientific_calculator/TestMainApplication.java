package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.junit.Assert;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    @org.junit.Test
    public void TestSinMethod() {
        double actualNumber = MainApplication.sin(60);
        double expectedNumber= 0.8660254037844386;
        Assert.assertEquals(expectedNumber, actualNumber, 0);
    }
    @org.junit.Test
    public void TestCosMethod() {
        double actualNumber = MainApplication.cos(60);
        double expectedNumber= 0.5000000000000001;
        Assert.assertEquals(expectedNumber, actualNumber, 0);
    }
    @org.junit.Test
    public void TestTanMethod() {
        double actualNumber = MainApplication.tan(60);
        double expectedNumber= 1.7320508075688767;
        Assert.assertEquals(expectedNumber, actualNumber, 0);
    }
    @org.junit.Test
    public void TestInSinMethod() {
        double actualNumber = MainApplication.inverseSin(1.0);
        double expectedNumber= 1.5707963267948966;
        Assert.assertEquals(expectedNumber, actualNumber, 0);
    }
    @org.junit.Test
    public void TestInCosMethod() {
        double actualNumber = MainApplication.inverseCos(-1.0);
        double expectedNumber= 3.141592653589793;
        Assert.assertEquals(expectedNumber, actualNumber, 0);
    }
    @org.junit.Test
    public void TestInTanMethod() {
        double actualNumber = MainApplication.inverseTan(1.5);
        double expectedNumber= 0.982793723247329;
        Assert.assertEquals(expectedNumber, actualNumber, 0);
    }
}
