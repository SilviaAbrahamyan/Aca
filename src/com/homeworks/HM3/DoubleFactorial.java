package com.homeworks.HM3;

/**
 * Created by home on 9/15/2018.
 */
public class DoubleFactorial {
    public static void main(String[] args) {
        System.out.println(factorialDoubleRecursive(5));
        System.out.println(factorialDoubleIterative(5));
    }

    public static long factorialDoubleRecursive(int n) {
        if(n < 2) return 1;

        return n * factorialDoubleRecursive(n - 2);
    }

    public static long factorialDoubleIterative(int n) {
        long result = 1;

        for(; n > 0; n -= 2) {
            result *= n;
        }

        return result;
    }
}
