package com.dsapractise.smartpaisa;

public class RiskCalculator {
    
    /**
     * Calculates factorial - used for investment combinations
     * Example: Arjun has 5 different mutual funds, how many ways can he rank them?
     * Answer: 5! = 120 different priority arrangements
     */
    public long calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
    
    /**
     * Counts trailing zeroes in factorial - used in risk probability calculations
     * Important for Monte Carlo simulations in portfolio risk assessment
     */
    public int countTrailingZeroes(int n) {
        int count = 0;
        for (int i = 5; i<=n; i *= 5) {
            count = count + (n / i);
        }
        return count;
    }
}