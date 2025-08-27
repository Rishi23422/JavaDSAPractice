package com.dsapractise.smartpaisa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WealthCalculatorTest {

    private WealthCalculator calculator = new WealthCalculator();

    @Test
    public void testCompoundInterestCalculations() {
        // Basic power calculations for financial formulas
        Assert.assertEquals(calculator.computePower(2, 3), 8); // 2^3 = 8
        Assert.assertEquals(calculator.computePower(10, 2), 100); // 10^2 = 100
        Assert.assertEquals(calculator.computePower(3, 4), 81); // 3^4 = 81

        // Arjun's realistic scenarios with manageable numbers
        // Small SIP growth calculations
        Assert.assertEquals(calculator.computePower(2, 10), 1024); // 2^10 = 1024
        Assert.assertEquals(calculator.computePower(5, 3), 125); // 5^3 = 125

        // Edge cases - most important for financial apps
        Assert.assertEquals(calculator.computePower(5, 0), 1); // Any number^0 = 1
        Assert.assertEquals(calculator.computePower(100, 1), 100); // Any number^1 = itself
        Assert.assertEquals(calculator.computePower(1, 50), 1); // 1^anything = 1
    }
}