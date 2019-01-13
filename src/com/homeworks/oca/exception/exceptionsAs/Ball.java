package com.homeworks.oca.exception.exceptionsAs;

import java.text.ParseException;

/**
 * Created by home on 10/24/2018.
 */
public class Ball {
    public void toss() throws LostBallException {
        throw new ArrayStoreException();
    }

    public static void main(String[] bouncy) {
        try {
            new Ball().toss();
        } catch (Throwable e) {
            System.out.print("Caught");
        }
    }
}
    class LostBallException extends Exception {
    }