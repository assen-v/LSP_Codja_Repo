package org.howard.edu.lsp.assignment6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;

public class TestIntegerSet {

    private IntegerSet set;

    @BeforeEach
    public void setup() {
        set = new IntegerSet();
    }

    @Test
    @DisplayName("Test Clear Method")
    public void testClear() {
        set.add(1);
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test Length Method")
    public void testLength() {
        set.add(1);
        set.add(2);
        assertEquals(2, set.length());
    }

    @Test
    @DisplayName("Test Equals Method")
    public void testEquals() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set2.add(1);
        assertTrue(set1.equals(set2));
    }

    @Test
    @DisplayName("Test Contains Method")
    public void testContains() {
        set.add(1);
        assertTrue(set.contains(1));
        assertFalse(set.contains(2));
    }

    @Test
    @DisplayName("Test Largest Method with Values Present")
    public void testLargest() {
        set.add(1);
        set.add(5);
        assertEquals(5, set.largest());
    }

    @Test
    @DisplayName("Test Largest Method with Empty Set")
    public void testLargestException() {
        assertThrows(NoSuchElementException.class, set::largest);
    }

    @Test
    @DisplayName("Test Smallest Method with Values Present")
    public void testSmallest() {
        set.add(1);
        set.add(5);
        assertEquals(1, set.smallest());
    }

    @Test
    @DisplayName("Test Smallest Method with Empty Set")
    public void testSmallestException() {
        assertThrows(NoSuchElementException.class, set::smallest);
    }

    @Test
    @DisplayName("Test Add Method")
    public void testAdd() {
        set.add(1);
        set.add(1); // Adding duplicate
        assertEquals(1, set.length());
    }

    @Test
    @DisplayName("Test Remove Method")
    public void testRemove() {
        set.add(1);
        set.remove(1);
        assertFalse(set.contains(1));
    }

    @Test
    @DisplayName("Test Union Method")
    public void testUnion() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set2.add(2);
        set.union(set2);
        assertTrue(set.contains(1) && set.contains(2));
    }

    @Test
    @DisplayName("Test Intersect Method")
    public void testIntersect() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set.add(2);
        set2.add(2);
        set.intersect(set2);
        assertTrue(set.contains(2));
        assertFalse(set.contains(1));
    }

    @Test
    @DisplayName("Test Diff Method")
    public void testDiff() {
        IntegerSet set2 = new IntegerSet();
        set.add(1);
        set.add(2);
        set2.add(2);
        set.diff(set2);
        assertTrue(set.contains(1));
        assertFalse(set.contains(2));
    }

    @Test
    @DisplayName("Test IsEmpty Method")
    public void testIsEmpty() {
        assertTrue(set.isEmpty());
        set.add(1);
        assertFalse(set.isEmpty());
    }

    @Test
    @DisplayName("Test ToString Method")
    public void testToString() {
        set.add(1);
        set.add(2);
        assertEquals("[1, 2]", set.toString());
    }
}
