// Name: Vanessa Omeibe
package org.howard.edu.lsp.assignment6;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * A class that represents a set of integers, with common set operations.
 */
public class IntegerSet {
    // Store the set elements in an ArrayList.
    private List<Integer> set = new ArrayList<>();

    // Default Constructor
    /**
     * Default constructor that creates an empty set.
     */
    public IntegerSet() {}

    // Constructor if you want to pass in already initialized
    /**
     * Constructor that accepts an already initialized set of integers.
     * @param set The list of integers to initialize the set with.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    // Clears the internal representation of the set. 5 pts.
    /**
     * Clears the set by removing all elements.
     */
    public void clear() {
        set.clear();
    }

    // Returns the length of the set. 5 pts.
    /**
     * Returns the number of elements in the set.
     * @return the size of the set
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if this set is equal to another set.
     * Two sets are equal if they contain all the same elements in any order.
     * @param o The object to compare with.
     * @return true if the sets are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntegerSet that = (IntegerSet) o;
        return set.containsAll(that.set) && that.set.containsAll(set);
    }

    // Returns true if the set contains the value, otherwise false. 5 pts.
    /**
     * Checks if the set contains a specific value.
     * @param value The value to check for.
     * @return true if the set contains the value, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    // Returns the largest item in the set. 5 pts.
    /**
     * Returns the largest element in the set.
     * @return the largest integer in the set
     * @throws NoSuchElementException if the set is empty
     */
    public int largest() {
        if (set.isEmpty()) throw new NoSuchElementException("Set is empty.");
        return set.stream().max(Integer::compareTo).get();
    }

    // Returns the smallest item in the set. 5 pts.
    /**
     * Returns the smallest element in the set.
     * @return the smallest integer in the set
     * @throws NoSuchElementException if the set is empty
     */
    public int smallest() {
        if (set.isEmpty()) throw new NoSuchElementException("Set is empty.");
        return set.stream().min(Integer::compareTo).get();
    }

    // Adds an item to the set or does nothing it already there. 5 pts.
    /**
     * Adds an item to the set if it's not already present.
     * @param item The item to add to the set.
     */
    public void add(int item) {
        if (!set.contains(item)) {
            set.add(item);
        }
    }

    // Removes an item from the set or does nothing if not there. 5 pts.
    /**
     * Removes an item from the set if it exists.
     * @param item The item to remove from the set.
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    // Set union. 11 pts.
    /**
     * Performs the union of this set and another set.
     * The result is stored in this set.
     * @param intSetb The other set to perform the union with.
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            if (!set.contains(item)) {
                set.add(item);
            }
        }
    }

    // Set intersection, all elements in s1 and s2. 12 pts.
    /**
     * Performs the intersection of this set and another set.
     * The result is stored in this set.
     * @param intSetb The other set to perform the intersection with.
     */
    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    // Set difference, i.e., s1 –s2. 12 pts.
    /**
     * Performs the difference operation (this set - another set).
     * The result is stored in this set.
     * @param intSetb The other set to subtract from this set.
     */
    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    // Set complement, all elements not in s1. 11 pts.
    /**
     * Performs the complement operation (all elements not in both sets).
     * The result is stored in this set.
     * @param intSetb The other set to compare against.
     */
    public void complement(IntegerSet intSetb) {
        for (int item : set) {
            if (!intSetb.set.contains(item)) {
                set.remove(item);
            }
        }
    }

    // Returns true if the set is empty, false otherwise. 5 pts.
    /**
     * Checks if the set is empty.
     * @return true if the set is empty, false otherwise
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    // Return String representation of your set. 5 pts.
    /**
     * Returns a string representation of the set.
     * @return the string representation of the set
     */
    @Override
    public String toString() {
        return set.toString();
    }
}
