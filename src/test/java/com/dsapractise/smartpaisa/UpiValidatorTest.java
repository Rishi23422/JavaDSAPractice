package com.dsapractise.smartpaisa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UpiValidatorTest {
    
    private UpiValidator validator = new UpiValidator();
    
    @Test
    public void testIndianMobileNumbers() {
        // Arjun's mobile number (10 digits)
        Assert.assertEquals(validator.countDigits(9876543210L), 10);
        
        // Chai wallah's number (10 digits)  
        Assert.assertEquals(validator.countDigits(8765432109L), 10);
        
        // Wrong number (9 digits) - should catch this error
        Assert.assertEquals(validator.countDigits(987654323L), 9);
    }

    @Test
    public void testPalindromePins() {
        // Good palindrome PINs that Arjun can easily remember
        Assert.assertTrue(validator.isPalindrome(1221));  // Easy to remember
        Assert.assertTrue(validator.isPalindrome(5775));  // Another good one
        Assert.assertTrue(validator.isPalindrome(9339));  // Easy pattern
    
        // Regular PINs that are NOT palindromes
        Assert.assertFalse(validator.isPalindrome(1234)); // Common but not palindrome
        Assert.assertFalse(validator.isPalindrome(5678)); // Sequential, not palindrome
    }
}
