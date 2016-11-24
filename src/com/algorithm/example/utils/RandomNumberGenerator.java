package com.algorithm.example.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by kiran on 8/22/16.
 */
public class RandomNumberGenerator {

    public static int[] generateRandomNumber(int totalNumber) {
        int[] randomNumbers = new int[totalNumber];
        for (int i = 0; i < totalNumber; i++) {
            randomNumbers[i] = ThreadLocalRandom.current().nextInt(0, 10000);
        }
        return randomNumbers;
    }

    public static List<Integer> generateRandomInteger(int total){
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<total; i++){
            list.add(ThreadLocalRandom.current().nextInt(0,1000));
        }
        return list;
    }
}
