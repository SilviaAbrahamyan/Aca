package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public interface Outfielder {
     void catchBall() throws OutOfBoundsException;
}
class OutOfBoundsException extends BadCatchException {}
class BadCatchException extends Exception {}

class Child implements Outfielder{
    @Override
    public void catchBall() throws OutOfBoundsException {

    }
}