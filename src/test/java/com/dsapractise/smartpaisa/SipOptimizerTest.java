package com.dsapractise.smartpaisa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SipOptimizerTest {

    private SipOptimizer sipOptimizer = new SipOptimizer();

    @Test
    public void testOptimalReviewCycle() {
        // Arjun's real scenario:
        // Nifty 50 SIP review: every 3 months
        // Small Cap SIP review: every 6 months
        // GCD(3,6) = 3 -> He should review portfolio every 3 months
        Assert.assertEquals(sipOptimizer.findGCD(3, 6), 3);

        // Another scenario:
        // ELSS fund: every 12 months (for tax planning)
        // Debt fund: every 4 months
        // GCD(12,4) = 4 -> Review every 4 months
        Assert.assertEquals(sipOptimizer.findGCD(12, 4), 4);
    }

    @Test
    public void testInvestmentAlignment() {
        // Arjun's real investment scenario:
        // Monthly SIP: every 1 month
        // PPF contribution: every 12 months (yearly)
        // LCM(1,12) = 12 -> Comprehensive planning every 12 months
        Assert.assertEquals(sipOptimizer.findLCM(1, 12), 12);

        // Another scenario:
        // Quarterly bonus investment: every 3 months
        // Annual insurance premium: every 12 months
        // LCM(3,12) = 12 -> All align every 12 months for tax planning
        Assert.assertEquals(sipOptimizer.findLCM(3, 12), 12);

        // FD renewal: every 2 months
        // SIP review: every 6 months
        // LCM(2,6) = 6 -> Major financial review every 6 months
        Assert.assertEquals(sipOptimizer.findLCM(2, 6), 6);
    }
}