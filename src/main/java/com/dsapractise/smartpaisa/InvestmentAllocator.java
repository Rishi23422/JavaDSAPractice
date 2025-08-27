package com.dsapractise.smartpaisa;

import java.util.List;
import java.util.ArrayList;

public class InvestmentAllocator {
    
    /**
     * Finds all divisors - helps Arjun see all possible investment split options
     * Example: ₹12,000 bonus → can split into ₹1k, ₹2k, ₹3k, ₹4k, ₹6k, ₹12k chunks
     */
    public List<Integer> getAllocationOptions(int amount) {
        List<Integer> options = new ArrayList<>();
        
        for (int i = 1; i * i <= amount; i++) {
            if (amount % i == 0) {
                options.add(i);
                if (i != amount / i) {  // Avoid duplicate for perfect squares
                    options.add(amount / i);
                }
            }
        }      
        // Sort for better readability
        options.sort(Integer::compareTo);
        return options;
    }
}