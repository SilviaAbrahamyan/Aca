package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public class BigCat {
    void roar(int level) throws RuntimeException { // m1
        if(level <3) throw new IllegalArgumentException("Incomplete");
        System.out.print("Roar");
    }
}
class Lion extends BigCat {
    public void roar() { // m2
        System.out.print("Roar");
    }
    public static void main(String[] cubs) {
        final BigCat kitty = new Lion(); // m3
        kitty.roar(2);
    }
}