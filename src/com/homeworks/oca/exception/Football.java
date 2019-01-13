package com.homeworks.oca.exception;


/**
 * Created by home on 10/23/2018.
 */
public class Football {
    public static void main(String officials[]) {
        try {
            System.out.print("A");
            throw new RuntimeException("out");
        } catch (RuntimeException aioobe) {
            System.out.print("b");
           throw aioobe;
        } finally {
            System.out.print("c");
        }
    }
}
