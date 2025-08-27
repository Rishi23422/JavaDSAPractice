package com.dsapractise.smartpaisa;

public class UpiValidator {
    
    /**
     * Counts digits in a mobile number - Arjun uses this daily for UPI
     */
    public int countDigits(long mobileNumber) {
        if (mobileNumber == 0) return 1;
        
        mobileNumber = Math.abs(mobileNumber);
        int count = 0;
        while (mobileNumber > 0) {
            count++;
            mobileNumber = mobileNumber / 10;
        }
        return count;
    }

    /**
     * Checks if a UPI PIN is a palindrome - easier for Arjun to remember
     */
    public boolean isPalindrome(int pin) {
        int original = pin;
        int reversed = 0;
    
        while (pin > 0) {
            reversed = reversed * 10 + pin % 10;
            pin = pin / 10;
        }  
        return original == reversed;
    }
}
