package org.howard.edu.lsp.finalexam.question2;

/**
 * A concrete strategy that uses a simple linear congruential generator (LCG)
 * algorithm to produce a random positive integer.
 * 
 * Reference: "Linear congruential generator" on Wikipedia
 * (https://en.wikipedia.org/wiki/Linear_congruential_generator)
 *
 */

public class CustomRandomNumberGenerator implements RandomNumberGenerator {
    // Parameters for LCG (commonly used example values)
    private long a = 1664525;
    private long c = 1013904223;
    private long m = (long) Math.pow(2, 31);
    private long seed = System.currentTimeMillis(); // initial seed

    /**
     * Generates a positive random integer using an LCG formula.
     * Updates the internal seed for each generation.
     * 
     * @return a positive integer greater than 0
     */
    @Override
    public int generate() {
        seed = (a * seed + c) % m;
        // seed is now in range [0, m)
        // We want a positive integer, so ensure it's at least 1
        int result = (int) (seed % Integer.MAX_VALUE) + 1;
        return result;
    }
}
