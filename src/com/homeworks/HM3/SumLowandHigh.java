package com.homeworks.HM3;

/**
 * Created by home on 9/15/2018.
 */
public class SumLowandHigh {
    int x = 0;
    public static void main(String[] args) {


        System.out.println(sumRecursive(2, 5));
        System.out.println(sumIterative(2, 5));
    }


    public static long sumRecursive(int low, int high) {
        if(low >= high) {
            return 0;
        }

        return low + high + sumRecursive(low + 1, high - 1);
    }

    public static long sumIterative(int low, int high) {
        long result = 0;

        if ( low >= high) {
            for (int i = low; i <= high; i++) {
                result += i;
            }
        }

        return result;
    }
}
