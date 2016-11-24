package com.algorithm.example.sorting;

import com.algorithm.example.utils.RandomNumberGenerator;

import java.util.Arrays;

/**
 * Created by kiran on 11/11/16.
 */
public class MergeSort {

    private static int[] data;

    public static void sort(int[] arrayToSort) {
//        System.out.println(Arrays.toString(arrayToSort));
        int arrayLength = arrayToSort.length;

        if (arrayLength < 2) return;

        int middleIndex = arrayLength / 2;
        int leftArrayLength = middleIndex;
        int rightArrayLength = arrayLength - leftArrayLength;
        int[] leftArray = new int[leftArrayLength];
        int[] rightArray = new int[rightArrayLength];
        for (int i = 0; i < leftArrayLength; i++) {
            leftArray[i] = arrayToSort[i];
        }
        for (int i = middleIndex; i < arrayLength; i++) {
            rightArray[i-middleIndex] = arrayToSort[i];
        }
        sort(leftArray);
        sort(rightArray);
        merge(leftArray, rightArray, arrayToSort);
    }


    public static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftArrayLength = leftArray.length;
        int rightArrayLength = rightArray.length;
        int i = 0, j = 0, k = 0;

        while (i < leftArrayLength && j < rightArrayLength) {
            if (leftArray[i] < rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArrayLength) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightArrayLength) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
//        int[] x = {1,8};
//        int[] y = {3,9};
//        int[] z = new int[4];
//        System.out.println(Arrays.toString(merge(x,y,z)));
        data = RandomNumberGenerator.generateRandomNumber(100000);
        long start = System.nanoTime();
        sort(data);
        System.out.println("Sorted Data : " + Arrays.toString(data));
        System.out.println("Time taken to sort : " + (System.nanoTime() - start) / 1000000000.0 + "second");
    }
}
