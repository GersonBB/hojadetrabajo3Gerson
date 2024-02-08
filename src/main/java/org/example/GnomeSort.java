package org.example;

public class GnomeSort {
    public static void gnomeSort(int[] arr) {
        int n = arr.length;
        int index = 0;

        while (index < n) {
            if (index == 0)
                index++;
            if (arr[index] >= arr[index - 1])
                index++;
            else {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2};
        System.out.println("Array before sorting:");
        printArray(arr);
        gnomeSort(arr);
        System.out.println("Array after sorting:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
