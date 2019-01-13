package com.homeworks.HM3;

/**
 * Created by home on 9/15/2018.
 */
public class Sum {
    public static void main(String[] args) {
        System.out.println(sumRecursive(3));
        System.out.println(sumIterative(3));
    }

    public static long sumRecursive(int n) {
        if(n < 2) {
            return 1;
        }

        return n + sumRecursive(n - 1);
    }

    public static long sumIterative(int n) {
        long result = 1;

        for (int i = 2; i <= n; i++){
            result += i;
        }

        return result;
    }
}
