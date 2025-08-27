package com.dsapractise.smartpaisa;

import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecurityManagerTest {

    private SecurityManager securityManager = new SecurityManager();

    @Test
    public void testPrimeNumbersForSecurity() {
        // Prime numbers good for banking security tokens
        Assert.assertTrue(securityManager.isPrime(17)); // Good for session tokens
        Assert.assertTrue(securityManager.isPrime(23)); // Strong security
        Assert.assertTrue(securityManager.isPrime(101)); // Excellent for encryption
        Assert.assertTrue(securityManager.isPrime(997)); // Bank-grade security

        // Non-prime numbers - weaker for security
        Assert.assertFalse(securityManager.isPrime(15)); // 3×5, easily broken
        Assert.assertFalse(securityManager.isPrime(100)); // Too many factors
        Assert.assertFalse(securityManager.isPrime(1)); // Not prime by definition
        Assert.assertFalse(securityManager.isPrime(0)); // Not prime
    }

    @Test
    public void testPrimeFactorizationForEncryption() {
        // Small numbers used in RSA-style encryption demos
        List<Integer> factors15 = securityManager.getPrimeFactors(15);
        Assert.assertEquals(factors15, Arrays.asList(3, 5)); // 15 = 3 × 5

        List<Integer> factors21 = securityManager.getPrimeFactors(21);
        Assert.assertEquals(factors21, Arrays.asList(3, 7)); // 21 = 3 × 7

        List<Integer> factors35 = securityManager.getPrimeFactors(35);
        Assert.assertEquals(factors35, Arrays.asList(5, 7)); // 35 = 5 × 7

        // Banking-level security number
        List<Integer> factors77 = securityManager.getPrimeFactors(77);
        Assert.assertEquals(factors77, Arrays.asList(7, 11)); // 77 = 7 × 11
    }

    @Test
    public void testBulkPrimeGeneration() {
        // Generate primes up to 30 for banking key pool
        List<Integer> primes30 = securityManager.generatePrimesUpTo(30);
        List<Integer> expected30 = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        Assert.assertEquals(primes30, expected30);

        // Small prime pool for mobile banking app
        List<Integer> primes10 = securityManager.generatePrimesUpTo(10);
        List<Integer> expected10 = Arrays.asList(2, 3, 5, 7);
        Assert.assertEquals(primes10, expected10);

        // Edge cases important for banking apps
        List<Integer> primes1 = securityManager.generatePrimesUpTo(1);
        Assert.assertTrue(primes1.isEmpty()); // No primes below 2

        List<Integer> primes2 = securityManager.generatePrimesUpTo(2);
        List<Integer> expected2 = Arrays.asList(2);
        Assert.assertEquals(primes2, expected2); // Only 2 is prime up to 2
    }
}