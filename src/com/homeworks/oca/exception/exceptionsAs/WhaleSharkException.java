package com.homeworks.oca.exception.exceptionsAs;

/**
 * Created by home on 10/24/2018.
 */
public class WhaleSharkException extends Exception {
    public WhaleSharkException() {
        super("erhazt");
    }

    public WhaleSharkException(String message) {
        super(new Exception(new WhaleSharkException()));
    }

    public WhaleSharkException(Exception cause) {
    }
}

