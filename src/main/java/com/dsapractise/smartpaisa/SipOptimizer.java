package com.dsapractise.smartpaisa;

public class SipOptimizer {

    /**
     * Finds GCD - helps Arjun find optimal review cycle for his SIPs
     * Example: SIP1 every 3 months, SIP2 every 6 months -> review every GCD(3,6) =
     * 3 months
     */
    public int findGCD(int cycle1, int cycle2) {
        if (cycle2 == 0) {
            return cycle1;
        }
        return findGCD(cycle2, cycle1 % cycle2);
    }

    /**
     * Finds LCM - helps Arjun know when all his investments align
     * Example: SIP every 1 month, PPF every 12 months, EPF every 1 month
     * LCM tells him when to do comprehensive financial planning
     */
    public int findLCM(int cycle1, int cycle2) {
        return (cycle1 * cycle2) / findGCD(cycle1, cycle2);
    }
}