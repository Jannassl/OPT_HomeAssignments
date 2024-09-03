import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 7 };
        assertArrayEquals("Should be equal", a1, a2);
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        ArrayEquality arrayEquality = new ArrayEquality();
        int[][] a11 = { { 1, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 1, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a13 = { { 2, 4 }, { 6, 8 }, { 10, 12 } };

        // Test for equality
        assertTrue("Should be equal", arrayEquality.areMultiDimensionalArraysEqual(a11, a12));

        // Test for inequality
        assertFalse("Should not be equal", arrayEquality.areMultiDimensionalArraysEqual(a11, a13));
    }
    @Test
    public void testDifferentTypeArrayEquality() {
        // Test for String array equality
        String[] s1 = { "apple", "banana", "cherry" };
        String[] s2 = { "apple", "banana", "cherry" };
        assertArrayEquals("String arrays should be equal", s1, s2);

        // Test for double array equality
        double[] d1 = { 1.1, 2.2, 3.3 };
        double[] d2 = { 1.1, 2.2, 3.3 };
        assertArrayEquals("Double arrays should be equal", d1, d2, 0.0);
    }
}