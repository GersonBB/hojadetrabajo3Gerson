package org.example;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class GnomeSortTest {
    @Test
    public void testGnomeSort() {
        int[] arr = {6, 3, 9, 5, 2};
        int[] expected = {2, 3, 5, 6, 9};
        GnomeSort.gnomeSort(arr);
        assertArrayEquals(expected, arr);
    }
}
