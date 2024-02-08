package org.example;

import java.util.Arrays;

public class SortingProfiler {
    public static void main(String[] args) {
        int[] data = SortingFromFile.readNumbersFromFile("random_numbers.txt");

        if (data == null || data.length == 0) {
            System.out.println("Error: No se pudo leer ningún dato del archivo.");
            return;
        }

        int[] dataCopy;

        // Ordenar datos desordenados
        dataCopy = Arrays.copyOf(data, data.length);
        int[] finalDataCopy = dataCopy;
        measureAndPrintSortingTime("GnomeSort", () -> GnomeSort.gnomeSort(finalDataCopy));

        dataCopy = Arrays.copyOf(data, data.length);
        int[] finalDataCopy1 = dataCopy;
        measureAndPrintSortingTime("MergeSort", () -> MergeSort.mergeSort(finalDataCopy1));

        dataCopy = Arrays.copyOf(data, data.length);
        int[] finalDataCopy2 = dataCopy;
        int[] finalDataCopy3 = dataCopy;
        measureAndPrintSortingTime("QuickSort", () -> QuickSort.quickSort(finalDataCopy2, 0, finalDataCopy3.length - 1));

        dataCopy = Arrays.copyOf(data, data.length);
        int[] finalDataCopy4 = dataCopy;
        measureAndPrintSortingTime("RadixSort", () -> RadixSort.radixSort(finalDataCopy4));

        dataCopy = Arrays.copyOf(data, data.length);
        int[] finalDataCopy5 = dataCopy;
        measureAndPrintSortingTime("SelectionSort", () -> SelectionSort.selectionSort(finalDataCopy5));

        // Ordenar datos ya ordenados
        Arrays.sort(data); // Ordenar los datos antes de medir el tiempo

        dataCopy = Arrays.copyOf(data, data.length);
        int[] finalDataCopy6 = dataCopy;
        measureAndPrintSortingTime("GnomeSort (Already Sorted)", () -> GnomeSort.gnomeSort(finalDataCopy6));

        dataCopy = Arrays.copyOf(data, data.length);
        int[] finalDataCopy7 = dataCopy;
        measureAndPrintSortingTime("MergeSort (Already Sorted)", () -> MergeSort.mergeSort(finalDataCopy7));

        dataCopy = Arrays.copyOf(data, data.length);
        int[] finalDataCopy8 = dataCopy;
        int[] finalDataCopy9 = dataCopy;
        measureAndPrintSortingTime("QuickSort (Already Sorted)", () -> QuickSort.quickSort(finalDataCopy8, 0, finalDataCopy9.length - 1));

        dataCopy = Arrays.copyOf(data, data.length);
        int[] finalDataCopy10 = dataCopy;
        measureAndPrintSortingTime("RadixSort (Already Sorted)", () -> RadixSort.radixSort(finalDataCopy10));

        dataCopy = Arrays.copyOf(data, data.length);
        int[] finalDataCopy11 = dataCopy;
        measureAndPrintSortingTime("SelectionSort (Already Sorted)", () -> SelectionSort.selectionSort(finalDataCopy11));
    }

    public static void measureAndPrintSortingTime(String algorithmName, Runnable sortingTask) {
        long startTime = System.nanoTime();
        sortingTask.run();
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        System.out.println(algorithmName + ": " + elapsedTime + " nanoseconds");
    }
}
