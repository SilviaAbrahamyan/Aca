package com.homeworks.oca.exception.others;

/**
 * Created by home on 11/22/2018.
 */
public final class Clownfish extends Fish {
    public final Clownfish getFish() {
        throw new RuntimeException("clown!");
    }
    public static void main(String[] bubbles) throws BubbleException {
        final Fish f = new Clownfish();
        f.getFish();
        System.out.println("swim!");
    }
}
class BubbleException extends Exception {}
class Fish {
    Fish getFish() throws BubbleException {
        throw new RuntimeException("fish!");
    }
}