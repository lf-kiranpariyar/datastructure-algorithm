package com.algorithm.example.sorting;

import com.algorithm.example.utils.RandomNumberGenerator;

import java.util.List;

/**
 * Created by kiran on 8/21/16.
 */
public class QuickSort {

    private static void sort(List<Integer> list) {
        if (list.size() <= 1) return;
        int pivotElement = list.get(list.size() - 1);
        int leftIndex = 0;

        for (int i = 0; i < list.size() - 1; i++) {
            int currentVal = list.get(i);
            if (pivotElement > currentVal) {
                list.set(i, list.get(leftIndex));
                list.set(leftIndex, currentVal);
                leftIndex++;
            }
        }
        //swap left index element and pivot element
        list.set(list.size() - 1, list.get(leftIndex));
        list.set(leftIndex, pivotElement);

        sort(list.subList(0, leftIndex));
        sort(list.subList(leftIndex + 1, list.size()));
    }

    public static void main(String[] args) {
        List<Integer> array = RandomNumberGenerator.generateRandomInteger(100000);
        long start = System.nanoTime();
        sort(array);
        System.out.println(array);
        System.out.println((System.nanoTime()-start)/1000000000.0);

    }
}
