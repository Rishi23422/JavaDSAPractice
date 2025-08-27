package com.dsapractise.smartpaisa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RiskCalculatorTest {
    
    private RiskCalculator riskCalculator = new RiskCalculator();
    
    @Test
    public void testInvestmentCombinations() {
        // Arjun has 3 investment priorities: SIP, PPF, FD
        // How many ways to arrange them? 3! = 6 ways
        Assert.assertEquals(riskCalculator.calculateFactorial(3), 6);
        
        // 4 different mutual funds to prioritize: 4! = 24 ways  
        Assert.assertEquals(riskCalculator.calculateFactorial(4), 24);
        
        // 5 financial goals to rank: 5! = 120 arrangements
        Assert.assertEquals(riskCalculator.calculateFactorial(5), 120);
        
        // Edge cases
        Assert.assertEquals(riskCalculator.calculateFactorial(0), 1); // 0! = 1
        Assert.assertEquals(riskCalculator.calculateFactorial(1), 1); // 1! = 1
    }
    
    @Test 
    public void testRiskProbabilityCalculations() {
        // Trailing zeroes in factorials for risk probability models
        Assert.assertEquals(riskCalculator.countTrailingZeroes(10), 2);  // 10! has 2 trailing zeroes
        Assert.assertEquals(riskCalculator.countTrailingZeroes(25), 6);  // 25! has 6 trailing zeroes
        Assert.assertEquals(riskCalculator.countTrailingZeroes(5), 1);   // 5! has 1 trailing zero
        
        // Edge cases for financial models
        Assert.assertEquals(riskCalculator.countTrailingZeroes(0), 0);   // 0! has no trailing zeroes
        Assert.assertEquals(riskCalculator.countTrailingZeroes(3), 0);   // 3! has no trailing zeroes
    }
}