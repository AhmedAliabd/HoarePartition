package com.company;

public class QuickSort {


    static int HoarePartition(int[] arr, int left, int right)
    {
        int pivot = arr[left];
        int i = left - 1, j = right + 1;

        while (true) {
            // Find leftmost element greater
            // than or equal to pivot
            do {
                i++;
            } while (arr[i] < pivot);

            // Find rightmost element smaller
            // than or equal to pivot
            do {
                j--;
            } while (arr[j] > pivot);

            // If two pointers met.
            if (i >= j)
                return j;

            // swap(arr[i], arr[j]);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    static void quickSort(int[] arr, int left, int right)
    {
        if (left < right) {
            int s = HoarePartition(arr, left, right);// s is the split position

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, left, s);
            quickSort(arr, s + 1, right);
        }
    }
    static void printArray(int[] arr, int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(" " + arr[i]);
        System.out.println();
    }
}
