package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * A strategy that uses Java's built in Random class 
 * to generate a positive random integer.
 */
public class JavaRandomNumberGenerator implements RandomNumberGenerator {
    private Random rand = new Random();

    /**
     * Generates a positive random integer using the built-in Random class.
     * Ensures the result is always >= 1.
     * 
     * @return a positive integer greater than 0
     */
    @Override
    public int generate() {
        // nextInt(Integer.MAX_VALUE) returns a value in [0, Integer.MAX_VALUE)
        // Add 1 to ensure it's positive (> 0)
        return rand.nextInt(Integer.MAX_VALUE) + 1;
    }
}
