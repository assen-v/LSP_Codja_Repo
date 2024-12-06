package org.howard.edu.lsp.finalexam.question2;

/**
 * A singleton service class that uses a RandomNumberGenerator strategy
 * to produce positive random integers.
 */
public class RandomNumberService {
    // Single instance of RandomNumberService
    private static RandomNumberService instance = null;
    
    // Current strategy for generating random numbers
    private RandomNumberGenerator strategy;

    /**
     * Private constructor to prevent direct instantiation.
     */
    private RandomNumberService() {
        // Default strategy could be one of your implemented strategies.
        this.strategy = new JavaRandomNumberGenerator();
    }

    /**
     * Returns the singleton instance of RandomNumberService.
     * 
     * @return the single RandomNumberService instance
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the random number generation strategy at runtime.
     * 
     * @param generator the chosen RandomNumberGenerator strategy
     */
    public void setStrategy(RandomNumberGenerator generator) {
        this.strategy = generator;
    }

    /**
     * Generates a positive random number using the currently selected strategy.
     * 
     * @return a positive integer greater than 0
     */
    public int getRandomNumber() {
        return strategy.generate();
    }
}
