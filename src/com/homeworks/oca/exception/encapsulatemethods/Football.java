package com.homeworks.oca.exception.encapsulatemethods;

/**
 * Created by home on 11/14/2018.
 */
public class Football {
    public static Long  $sprint(Long timeRemaining) {
        return 2*timeRemaining; // m1
    }
    public static void main(String[] refs) {
        long startTime = 4;
        System.out.print( $sprint(startTime)); // m2
    }
}
