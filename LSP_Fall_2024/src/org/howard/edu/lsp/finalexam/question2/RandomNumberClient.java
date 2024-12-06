package org.howard.edu.lsp.finalexam.question2;

/**
 * A client class that demonstrates the use of RandomNumberService.
 * It switches strategies at runtime and displays results to the screen.
 */
public class RandomNumberClient {
    /**
     * The main method to run the client application.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Get the singleton instance of the service
        RandomNumberService service = RandomNumberService.getInstance();

        // Use the JavaRandomNumberGenerator strategy
        service.setStrategy(new JavaRandomNumberGenerator());
        int javaRand = service.getRandomNumber();
        System.out.println("Using JavaRandomNumberGenerator: " + javaRand);

        // Switch to the CustomRandomNumberGenerator strategy
        service.setStrategy(new CustomRandomNumberGenerator());
        int customRand = service.getRandomNumber();
        System.out.println("Using CustomRandomNumberGenerator: " + customRand);
    }
}
