package com.algorithm.example.recursion;

/**
 * Created by kiran on 11/5/16.
 */
public class Exponentiation {

    public static Long calculateExponentiation1(Long x, Long n) {
        if (n == 0)
            return 1L;
        return x * calculateExponentiation1(x, n - 1);
    }

    public static Long calculateExponentiation2(Long x, Long n) {
        if (n == 0)
            return 1L;
        else if(n % 2 == 0){
            Long y = calculateExponentiation1(x,n/2);
            return y*y;
        }else
            return x*calculateExponentiation2(x,n-1);
    }

    public static void main(String[] args) {
        Long start1 = System.nanoTime();
        Long value1 = calculateExponentiation1(2L, 62L);
        Long end1 = System.nanoTime();
        Long timeTaken1 = end1 - start1;
        System.out.println("Value : " + value1);
        System.out.println("Time taken to calculate exponention is : " + timeTaken1 + " nano second");

        Long start2 = System.nanoTime();
        Long value2 = calculateExponentiation2(2L, 62L);
        Long end2 = System.nanoTime();
        Long timeTaken2 = end2 - start2;
        System.out.println("Value : " + value2);
        System.out.println("Time taken to calculate exponention is : " + timeTaken2 + " nano second");
    }
}