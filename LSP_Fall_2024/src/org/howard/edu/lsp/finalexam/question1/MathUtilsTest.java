package org.howard.edu.lsp.finalexam.question1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathUtilsTest {

    private MathUtils mathUtils;

    /**
     * Initializes a new MathUtils instance before each test.
     */
    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    // ----------------------------
    // Tests for factorial method
    // ----------------------------

    /**
     * Tests that factorial(0) returns 1.
     */
    @Test
    void testFactorial_givenZero_shouldReturnOne() {
        int result = mathUtils.factorial(0);
        assertEquals(1, result, "factorial(0) should return 1");
    }

    /**
     * Tests that factorial(1) returns 1.
     */
    @Test
    void testFactorial_givenOne_shouldReturnOne() {
        int result = mathUtils.factorial(1);
        assertEquals(1, result, "factorial(1) should return 1");
    }

    /**
     * Tests that factorial of a positive number (5) returns the correct value (120).
     */
    @Test
    void testFactorial_givenPositiveNumber_shouldReturnCorrectFactorial() {
        int result = mathUtils.factorial(5);
        assertEquals(120, result, "factorial(5) should return 120");
    }

    /**
     * Tests that factorial of a negative number throws IllegalArgumentException.
     */
    @Test
    void testFactorial_givenNegativeNumber_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.factorial(-1);
        }, "factorial(-1) should throw IllegalArgumentException");
    }

    // ----------------------------
    // Tests for isPrime method
    // ----------------------------

    /**
     * Tests that isPrime(0) returns false since 0 is not prime.
     */
    @Test
    void testIsPrime_givenZero_shouldReturnFalse() {
        boolean result = mathUtils.isPrime(0);
        assertFalse(result, "0 is not prime");
    }

    /**
     * Tests that isPrime(1) returns false since 1 is not considered a prime number.
     */
    @Test
    void testIsPrime_givenOne_shouldReturnFalse() {
        boolean result = mathUtils.isPrime(1);
        assertFalse(result, "1 is not prime");
    }

    /**
     * Tests that isPrime(7) returns true since 7 is a known prime number.
     */
    @Test
    void testIsPrime_givenPrimeNumber_shouldReturnTrue() {
        boolean result = mathUtils.isPrime(7);
        assertTrue(result, "7 is prime");
    }

    /**
     * Tests that isPrime(10) returns false since 10 is a composite number.
     */
    @Test
    void testIsPrime_givenNonPrimeNumber_shouldReturnFalse() {
        boolean result = mathUtils.isPrime(10);
        assertFalse(result, "10 is not prime");
    }

    // ----------------------------
    // Tests for gcd method
    // ----------------------------

    /**
     * Tests that gcd(0, 0) throws IllegalArgumentException.
     */
    @Test
    void testGcd_givenBothZero_shouldThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            mathUtils.gcd(0, 0);
        }, "gcd(0,0) should throw IllegalArgumentException");
    }

    /**
     * Tests that gcd(0, 5) returns 5 and gcd(-7, 0) returns 7, confirming that if one
     * number is zero, the result is the absolute value of the other number.
     */
    @Test
    void testGcd_givenOneZero_shouldReturnAbsoluteOfOther() {
        int result = mathUtils.gcd(0, 5);
        assertEquals(5, result, "gcd(0,5) should return 5");
        
        result = mathUtils.gcd(-7, 0);
        assertEquals(7, result, "gcd(-7,0) should return 7");
    }

    /**
     * Tests gcd of positive numbers (e.g, gcd(12, 8) = 4).
     */
    @Test
    void testGcd_givenPositiveNumbers_shouldReturnCorrectGcd() {
        int result = mathUtils.gcd(12, 8);
        assertEquals(4, result, "gcd(12,8) should return 4");
    }

    /**
     * Tests gcd involving negative numbers. For example, gcd(-12,8) = 4
     * and gcd(-36,-48) = 12, confirming that gcd operates on absolute values.
     */
    @Test
    void testGcd_givenNegativeNumbers_shouldReturnCorrectGcd() {
        int result = mathUtils.gcd(-12, 8);
        assertEquals(4, result, "gcd(-12,8) should return 4");
        
        result = mathUtils.gcd(-36, -48);
        assertEquals(12, result, "gcd(-36,-48) should return 12");
    }
}
