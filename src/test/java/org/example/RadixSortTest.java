package org.example;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class RadixSortTest {
    @Test
    public void testRadixSort() {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        int[] expected = {2, 24, 45, 66, 75, 90, 170, 802};
        RadixSort.radixSort(arr);
        assertArrayEquals(expected, arr);
    }
}