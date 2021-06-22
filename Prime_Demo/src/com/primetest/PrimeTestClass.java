package com.primetest;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.prime.Primes;

public class PrimeTestClass {
	/** Sample data for testIsPrime. */
    private static final int number = 4;

    @Test
    public void testIsPrime() {
        assertTrue(number + " should be prime.", Primes.isPrime(number));
    }
}
