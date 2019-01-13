package com.homeworks.HM3;

/**
 * Created by home on 9/15/2018.
 */
public class Fibanocci {
    public static void main(String[] args) {
        System.out.println(fibonacciRecursive(6));
        System.out.println(fibonacciIterative(6));
    }

    public static long fibonacciRecursive(int n) {
        if (n <= 1) return n;

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static long fibonacciIterative(int n) {
        long result = 0;
        long fibo1 = 0, fibo2 = 1;

       if ( n == 1) {
           return 1;
       }
       for (int i = 2; i <= n; i++){

           result = fibo1 + fibo2;
           fibo1 = fibo2;
           fibo2 = result;

       }

        return result;
    }
}
