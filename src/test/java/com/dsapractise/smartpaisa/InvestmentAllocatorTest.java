package com.dsapractise.smartpaisa;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.List;

public class InvestmentAllocatorTest {

    private InvestmentAllocator allocator = new InvestmentAllocator();

    @Test
    public void testInvestmentAllocationOptions() {
        // Arjun's small bonus: ₹12 (easier to verify all divisors)
        List<Integer> options12 = allocator.getAllocationOptions(12);
        List<Integer> expected12 = Arrays.asList(1, 2, 3, 4, 6, 12);
        Assert.assertEquals(options12, expected12);

        // Monthly savings: ₹24
        List<Integer> options24 = allocator.getAllocationOptions(24);
        List<Integer> expected24 = Arrays.asList(1, 2, 3, 4, 6, 8, 12, 24);
        Assert.assertEquals(options24, expected24);

        // Perfect square case: ₹16
        List<Integer> options16 = allocator.getAllocationOptions(16);
        List<Integer> expected16 = Arrays.asList(1, 2, 4, 8, 16);
        Assert.assertEquals(options16, expected16);

        // Prime number case: ₹7 (only divisors are 1 and itself)
        List<Integer> options7 = allocator.getAllocationOptions(7);
        List<Integer> expected7 = Arrays.asList(1, 7);
        Assert.assertEquals(options7, expected7);
    }
}