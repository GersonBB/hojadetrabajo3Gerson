package org.example;

import static org.junit.jupiter.api.Assertions.*;


import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class MergeSortTest {
    @Test
    public void testMergeSort() {
        int[] arr = {6, 3, 9, 5, 2};
        int[] expected = {2, 3, 5, 6, 9};
        MergeSort.mergeSort(arr);
        assertArrayEquals(expected, arr);
    }
}