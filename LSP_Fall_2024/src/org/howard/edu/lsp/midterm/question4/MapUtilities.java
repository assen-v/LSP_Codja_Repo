package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

public class MapUtilities {

    // Method to find the number of common key/value pairs between two HashMaps
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // Return 0 if either map is empty
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }
        int commonCount = 0;
        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                commonCount++;
            }
        }
        return commonCount;
    }

    public static void main(String[] args) {
        // map1 and key-value pairs
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Alice", "Healthy");
        map1.put("Mary", "Ecstatic");
        map1.put("Bob", "Happy");
        map1.put("Chuck", "Fine");
        map1.put("Felix", "Sick");

        // map2 and key-value pairs
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("Mary", "Ecstatic");
        map2.put("Felix", "Healthy");
        map2.put("Ricardo", "Superb");
        map2.put("Tam", "Fine");
        map2.put("Bob", "Happy");

        // Call the method and print the result
        int result = MapUtilities.commonKeyValuePairs(map1, map2);
        System.out.println("Number of common key/value pairs is: " + result);
    }
}