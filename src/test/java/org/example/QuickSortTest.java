package org.example;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class QuickSortTest {
    @Test
    public void testQuickSort() {
        int[] arr = {6, 3, 9, 5, 2};
        int[] expected = {2, 3, 5, 6, 9};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }
}