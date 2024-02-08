package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class SortingFromFile {
    public static void main(String[] args) {
        int[] numbers = readNumbersFromFile("random_numbers.txt");

        System.out.println("Numbers read from file:");
        printArray(numbers);

        // Sorting using Gnome sort
        int[] gnomeSorted = Arrays.copyOf(numbers, numbers.length);
        GnomeSort.gnomeSort(gnomeSorted);
        System.out.println("\nAfter Gnome sort:");
        printArray(gnomeSorted);

        // Sorting using Merge sort
        int[] mergeSorted = Arrays.copyOf(numbers, numbers.length);
        MergeSort.mergeSort(mergeSorted);
        System.out.println("\nAfter Merge sort:");
        printArray(mergeSorted);

        // Sorting using Quick sort
        int[] quickSorted = Arrays.copyOf(numbers, numbers.length);
        QuickSort.quickSort(quickSorted, 0, quickSorted.length - 1);
        System.out.println("\nAfter Quick sort:");
        printArray(quickSorted);

        // Sorting using Radix sort
        int[] radixSorted = Arrays.copyOf(numbers, numbers.length);
        RadixSort.radixSort(radixSorted);
        System.out.println("\nAfter Radix sort:");
        printArray(radixSorted);

        // Sorting using Selection sort
        int[] selectionSorted = Arrays.copyOf(numbers, numbers.length);
        SelectionSort.selectionSort(selectionSorted);
        System.out.println("\nAfter Selection sort:");
        printArray(selectionSorted);
    }

    public static int[] readNumbersFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int[] numbers = new int[3000];
            int index = 0;
            while ((line = reader.readLine()) != null) {
                numbers[index++] = Integer.parseInt(line);
            }
            return numbers;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
