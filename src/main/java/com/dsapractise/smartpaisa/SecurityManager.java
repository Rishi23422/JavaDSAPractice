package com.dsapractise.smartpaisa;

import java.util.ArrayList;
import java.util.List;

public class SecurityManager {

    /**
     * Checks if a number is prime - used for secure token generation
     * Banking apps use prime numbers for better security
     */
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Finds prime factors - used in RSA encryption for secure banking
     * Arjun's financial data can be encrypted using prime factorization
     */
    public List<Integer> getPrimeFactors(int number) {
        List<Integer> factors = new ArrayList<>();

        // Handle factor 2
        while (number % 2 == 0) {
            factors.add(2);
            number = number / 2;
        }

        // Handle factor 3
        while (number % 3 == 0) {
            factors.add(3);
            number = number / 3;
        }

        // Handle odd factors from 5 onwards
        for (int i = 5; i * i <= number; i += 6) {
            while (number % i == 0) {
                factors.add(i);
                number = number / i;
            }
            while (number % (i + 2) == 0) {
                factors.add(i + 2);
                number = number / (i + 2);
            }
        }

        // If number is still > 3, then it's prime
        if (number > 3) {
            factors.add(number);
        }

        return factors;
    }

    /**
     * Generates all prime numbers up to limit using Sieve of Eratosthenes
     * Banks use this to create a pool of prime numbers for secure key generation
     */
    public List<Integer> generatePrimesUpTo(int limit) {
        List<Integer> primes = new ArrayList<>();
        if (limit < 2) {
            return primes;
        }

        boolean[] isPrime = new boolean[limit + 1];
        // Initialize all as prime
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Collect all primes
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}