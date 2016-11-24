package com.algorithm.example.sorting;

import com.algorithm.example.utils.RandomNumberGenerator;

import java.util.Arrays;

/**
 * Created by kiran on 8/30/16.
 */
public class SelectionSort {

    public static int[] sort(int[] data) {

        for (int i = 0; i < data.length - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[indexMin]) {
                    indexMin = j;
                }
            }
            int temp = data[i];
            data[i] = data[indexMin];
            data[indexMin] = temp;
        }
        return data;
    }

    public static void main(String[] args) {
        int[] data = RandomNumberGenerator.generateRandomNumber(100000);
//        int[] data = {5,7,4,1,6,3};
        long start = System.nanoTime();
        int[] sortedData = sort(data);
        System.out.println("Sorted Data : " + Arrays.toString(sortedData));
        System.out.println("Time taken to sort : " + (System.nanoTime() - start) / 1000000000.0 + "second");
    }
}
