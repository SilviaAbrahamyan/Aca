package com.homeworks.oca.exception.inheritance;

/**
 * Created by home on 10/28/2018.
 */
abstract public  class Ballroom extends Room {
    protected abstract Object getSpace();
    public static void main(String[] squareFootage) {
        System.out.print("ryj");
    }

}

abstract class House {
    protected abstract Object getSpace();
}

abstract class Room extends House {
    abstract Object getSpace(Object list);
}