package com.homeworks.HM3;

/**
 * Created by home on 9/15/2018.
 */
public class Euclidean {
    public static void main(String[] args) {
        System.out.println(GCDRecursive(216, 594));
        System.out.println(GCDIterative(216, 594));
    }

    public static long GCDRecursive(int a, int b) {

        int div = a % b;
        if (div == 0) {
            return b;
        } else {
            return GCDRecursive(b, div);
        }
    }

    public static long GCDIterative(int a, int b) {

        int div = a % b;

        while (div != 0) {

//            int t = b;
//            b = a % b;
//            a = t;

            a = b;
            b = div;
            div = a % b;
        }

        return b;
    }
}
