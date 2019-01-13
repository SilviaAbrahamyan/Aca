package com.homeworks.aca_book.exception;

/**
 * Created by home on 10/12/2018.
 */
public class Hopper {
    public void hop() { }
}

class CanNotHopException extends Exception { }

class Bunny extends Hopper {
   // public void hop() throws CanNotHopException { } // DOES NOT COMPILE
}