package com.dsapractise.smartpaisa;

public class WealthCalculator {
    
    /**
     * Calculates power using efficient method - used for compound interest
     * Example: Arjun's ₹5,000 monthly SIP at 12% annual return
     * Future Value = Present Value × (1.12)^years
     */
    public long computePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        
        long result = 1;
        long tmp = base;
        
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = result * tmp;
            }
            tmp = tmp * tmp;
            exponent = exponent/2;
        }
        
        return result;
    }

    public long computePowerRecursively(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        
        long tmp = computePowerRecursively(base, exponent/2);
        tmp = tmp * tmp;

        if(exponent % 2 == 0){
            return tmp;   
        }
        else{
            return tmp * base;
        }
    }
}