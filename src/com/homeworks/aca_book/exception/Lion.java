package com.homeworks.aca_book.exception;

/**
 * Created by home on 10/12/2018.
 */
public class Lion implements Roar {
    @Override
    public void roar() {

    }
}
interface Roar {
    void roar() throws HasSoreThroatException;
}

class HasSoreThroatException extends Exception {}
class TiredException extends RuntimeException {}

