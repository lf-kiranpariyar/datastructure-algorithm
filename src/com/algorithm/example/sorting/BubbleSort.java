package com.algorithm.example.sorting;

import com.algorithm.example.utils.RandomNumberGenerator;

import java.util.Arrays;

/**
 * Created by kiran on 8/21/16.
 */
public class BubbleSort {

    public static int[] sort(int[] data) {

        for (int i = 1; i < data.length; i++) {
            boolean sorted = true;
            for (int j = 0; j < data.length - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    sorted = false;
                }
            }
            if(sorted){
                break;
            }
        }

        return data;
    }

    public static void main(String[] args) {
        int[] data = RandomNumberGenerator.generateRandomNumber(100000);
//        int[] data = {5,7,4,1,6,3};
//        int[] data = {1,3,4,5,6,7};
        long start = System.nanoTime();
        int[] sortedData = sort(data);
        System.out.println("Sorted Data : " + Arrays.toString(sortedData));
        System.out.println("Time taken to sort : " + (System.nanoTime() - start) / 1000000000.0 + "second");
    }
}
