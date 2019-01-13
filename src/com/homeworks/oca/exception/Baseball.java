package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public class Baseball {
 // int score;
//    static void foo(){
//
//    }
    public static void main(String... teams) {
       int score = 1;
        try {
           // int score = 1;
            System.out.print(score++);
        } catch (Throwable t) {
            System.out.print(score++);
        } finally {
            System.out.print(score++);
        }
        System.out.print(score++);
    }
}
