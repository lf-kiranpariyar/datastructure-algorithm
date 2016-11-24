package com.algorithm.example.sorting;

import com.algorithm.example.utils.RandomNumberGenerator;

import java.util.Arrays;

/**
 * Created by kiran on 11/6/16.
 */
public class InsertionSort {

    public static int[] sort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int valueToInsert = data[i];
            int holePosition = i;
            for (; holePosition > 0 && data[holePosition - 1] > valueToInsert; holePosition--) {
               data[holePosition] = data[holePosition-1];
            }
            data[holePosition] = valueToInsert;
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
