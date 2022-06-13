package com.jap.insertionsort;

public class InsertionSort
{
    int[] insertionSort(int[] arr)
    {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {

                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }




    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    public static void main(String[] args)
    {
        int[] rollNos = {8,7,3,2,1,9,18,11,12};
        InsertionSort insertionSort = new InsertionSort();
        System.out.println("The Unsorted Roll Numbers : ");
        insertionSort.printArray(rollNos);
        System.out.println("\n"+"The Sorted Roll Numbers : ");
        int[] sortedArray = insertionSort.insertionSort(rollNos);
        insertionSort.printArray(sortedArray);

    }
}
