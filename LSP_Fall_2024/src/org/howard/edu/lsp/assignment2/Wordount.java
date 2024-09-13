/*
Name: Vanessa Omeibe
*/

package org.howard.edu.lsp.assignment2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Wordount {
    public static void main(String[] args) {
        
        Map<String, Integer> wordCount = new HashMap<>();
        String pathToFile = "src/org/howard/edu/lsp/assignment2/words.txt";
        
        try (BufferedReader fileReader = new BufferedReader(new FileReader(pathToFile))) {
            String lineContent;
            
            while ((lineContent = fileReader.readLine()) != null) {
                String[] splitWords = lineContent.trim().split("\\s+");

                for (String rawWord : splitWords) {
                    String formattedWord = rawWord.replaceAll("[^a-zA-Z]", "").toLowerCase();

                    if (formattedWord.length() > 3) {
                        wordCount.merge(formattedWord, 1, Integer::sum);
                    }
                }
            }
            
        } catch (IOException exception) {
            System.out.println("File reading error: " + exception.getMessage());
        }
        
        wordCount.forEach((word, count) -> {
            System.out.println(word + " " + count);
        });
    }
}