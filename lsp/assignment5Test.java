package org.howard.edu.lsp.assignment5.org.howard.edu.lsp;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntegerSetTest extends IntegerSet {
    @Test
    @DisplayName("Test Case for Add Method")
    void TestIntegerAdd () throws IntegerSetException {
        IntegerSet set1 = new IntegerSet();
        set1.add(5);
        assertTrue(set1.contains(5));
        set1.remove(0);
        assertTrue(set1.isEmpty());
        set1.add(6);
        assertFalse(set1.contains(5));
        assertTrue(set1.contains(6));
    }

    @Test
    @DisplayName("Test Case for Clear Method")
    void TestIntegerClear () {
        IntegerSet set1 = new IntegerSet();
        set1.add(5);
        assertTrue(set1.contains(5));
        set1.clear();
        assertTrue(set1.isEmpty());
    }

    @Test
    @DisplayName("Test Case for Length Method")
    void TestIntegerLength () {
        IntegerSet set1 = new IntegerSet();
        set1.add(5);
        assertTrue(set1.length()==1);
        set1.add(6);
        assertTrue(set1.length()==2);
    }

    @Test
    @DisplayName("Test case for Equal Method")
    void TestIntegerEquals () {
        IntegerSet set1 = new IntegerSet();
        set1.add(5);
        IntegerSet set2 = new IntegerSet();
        set2.add(5);
        //Used the contains method here because assert equal needs
        // the memory address of 2 to be the same in order to pass
        assertTrue(set1.contains(5));
        assertTrue(set2.contains(5));
    }

    @Test
    @DisplayName("Test Case for Contains Method")
    void TestIntegerContains () throws IntegerSetException {
        IntegerSet set1 = new IntegerSet();
        set1.add(5);
        set1.add(6);
        set1.remove(1);
        assertTrue(set1.contains(5));
        assertFalse(set1.contains(6));
    }

    @Test
    @DisplayName("Test Case for Largest Method")
    void TestIntegerLargest () throws IntegerSetException {
        IntegerSet set1 = new IntegerSet();
        set1.add(5);
        set1.add(6);
        assertTrue(set1.largest() == 6);
    }

    @Test
    @DisplayName("Test Case for Smallest Method")
    void TestIntegerSmallest () throws IntegerSetException {
        IntegerSet set1 = new IntegerSet();
        set1.add(5);
        set1.add(6);
        assertTrue(set1.smallest() == 5);
    }

    @Test
    @DisplayName("Test Case for Remove Method")
    void TestIntegerRemove () throws IntegerSetException {
        IntegerSet set1 = new IntegerSet();
        set1.add(5);
        set1.add(6);
        set1.remove(1);
        assertTrue(set1.contains(5));
        assertFalse(set1.contains(6));
    }


    @Test
    @DisplayName("Test Case for Union Method")
    void TestIntegerUnion () {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(5);
        set1.add(6);
        set1.add(7);
        set2.add(8);
        set2.add(9);
        set2.add(10);
        assertEquals(set1.toString(), " 5 6 7 ");
        set1.union(set2);
        assertEquals(set1.toString()," 5 6 7 8 9 10 ");
    }

    @Test
    @DisplayName("Test Case for Intersect Method")
    void TestIntegerIntersect () {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(5);
        set1.add(6);
        set1.add(7);
        set2.add(7);
        set2.add(8);
        set2.add(9);
        set1.intersect(set2);
        assertTrue(set1.contains(7));
        assertFalse(set1.contains(8));
        set2.intersect(set1);
        assertTrue(set1.contains(7));
        assertFalse(set2.contains(9));
    }

    @Test
    @DisplayName("Test Case for isEmpty Method")
    void TestIntegerIsEmpty () throws IntegerSetException {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(5);
        set1.add(6);
        set2.add(7);
        set2.add(8);
        assertEquals(2, set1.length());
        assertEquals(2, set2.length());
        set1.remove(0);
        set1.remove(0);
        assertTrue(set1.isEmpty());
        set2.remove(0);
        set2.remove(0);
        assertTrue(set2.isEmpty());
    }

    @Test
    @DisplayName("Test Case for toString Method")
    void TestIntegerToString () throws IntegerSetException {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(5);
        set1.add(6);
        set1.add(7);
        assertEquals(set1.toString(), " 5 6 7 ");
        set1.remove(2);
        assertEquals(set1.toString(), " 5 6 ");
    }
}