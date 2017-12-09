package com.algorithm.example.logical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kiranpariyar on 12/14/16.
 */
public class EquilibriumIndex {



    private static List<Integer> getEquilibriumPoints(List<Double> list) {
        List<Integer> results = new ArrayList<>();

        Double totalSum = list.stream().reduce(0.0, (a, b) -> a+b);

        Double currentSum = 0.0;

        for (int i =0; i < list.size(); i++) {
            currentSum += list.get(i);

            if (currentSum.equals(totalSum/2))
                results.add(i);
        }

        return results;
    }

    public static void main(String args[]){
//        int[] data = {2,4,4,4,5,1};
        List<Double> data = Arrays.asList(2.0, 4.0, 4.0, 4.0, 5.0, 1.0, -5.0, 2.0, -7.0, -5.0, 15.0);
//        int size = 5;
//        int left = 0;
//        int right = size;
//        int leftSum = 0;
//        int rightSum = 0;
//        boolean solutionFound = false;
//
//        while(right-left >= 1) {
//            if(leftSum == rightSum && right-left == 1){
//                solutionFound = true;
//                System.out.println("Solution found: left =" + left + "right =" + right);
//                break;
//            }else if(leftSum > rightSum){
//                rightSum += data[right];
//                System.out.println("rightSum :" + rightSum);
//                right--;
//            }else {
//                leftSum += data[left];
//                System.out.println("leftSum :" + leftSum);
//                left++;
//            }
//        }
//
//        if(solutionFound){
//            System.out.println("leftSum :" + leftSum);
//            System.out.println("rightSum :" + rightSum);
//        }else {
//            System.out.println("Solution Not Found");
//        }

        System.out.println(getEquilibriumPoints(data));
    }
}
