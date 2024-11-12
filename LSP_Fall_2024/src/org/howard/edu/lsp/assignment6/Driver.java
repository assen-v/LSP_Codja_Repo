//Name: Vanessa Omeibe
package org.howard.edu.lsp.assignment6;

/**
 * Driver class for testing the IntegerSet class.
 */
public class Driver {
    /**
     * Default constructor for the Driver class.
     */
    public Driver() {
        // Default constructor
    }

    /**
     * Main method to test the IntegerSet class.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Set1: " + set1);

        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("Set2: " + set2);

        // Test smallest and largest
        try {
            System.out.println("Set1 smallest: " + set1.smallest() + ", largest: " + set1.largest());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test equality
        System.out.println("Set1 equals Set2: " + set1.equals(set2));

        // Test contains
        System.out.println("Set1 contains 2: " + set1.contains(2));
        System.out.println("Set1 contains 10: " + set1.contains(10));

        // Test remove and union
        set1.remove(2);
        System.out.println("Set1 after removing 2: " + set1);
        set1.union(set2);
        System.out.println("Set1 after union with Set2: " + set1);

        // Test intersection
        set1.intersect(set2);
        System.out.println("Set1 after intersection with Set2: " + set1);

        // Test difference
        set1.diff(set2);
        System.out.println("Set1 after difference from Set2: " + set1);

        // Test isEmpty and clear
        System.out.println("Set1 is empty: " + set1.isEmpty());
        set1.clear();
        System.out.println("Set1 after clear: " + set1);
        System.out.println("Set1 is empty after clear: " + set1.isEmpty());
    }
}
