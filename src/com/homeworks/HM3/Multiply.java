package com.homeworks.HM3;

/**
 * Created by home on 9/15/2018.
 */
public class Multiply {
    public static void main(String[] args) {
        System.out.println(multiplyRecursive(3, 5));
        System.out.println(multiplyIterative(3, 5));

    }

    public static long multiplyRecursive(int a, int b) {
        if(b < 1) {
            return 0;
        }

        return a + multiplyRecursive(a, b - 1);
    }



    public static long multiplyIterative(int a, int b) {
        long result = 0;

        for (int i = 1; i <= b; i++){
            result += a;
        }

        return result;
    }
}
