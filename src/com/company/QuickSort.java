package com.company;

public class QuickSort {
    static void Swap(int[] array,
                     int position1,
                     int position2)
    {
        // Swaps elements in an array
        // Copy the first position's element
        int temp = array[position1];

        // Assign to the second element
        array[position1] = array[position2];

        // Assign to the first element
        array[position2] = temp;
    }

    static int HoarePartition(int[] arr, int left, int right)
    {
        int pivot = arr[left];
        int i = left, j = right + 1;
        System.out.println("Pivot is: " + pivot + "||  left is : " + left+ "||  right is : " + right);
        do {
            do {
                i++;
            } while (arr[i] < pivot);

            do {
                j--;
            } while (arr[j] > pivot);
            Swap(arr,i,j);
        } while(i<=j);

        Swap(arr,i,j);
        Swap(arr,left,j);
        return j;

    }

    static void quickSort(int[] arr, int left, int right)
    {
        if (left < right) {
            int s = HoarePartition(arr, left, right);// s is the split position
            // Separately sort elements before
            // partition and after partition
            quickSort(arr, left, s-1);
            quickSort(arr, s + 1, right);

        }
    }
    static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(" " + arr[i]);
        System.out.println();
    }
}
