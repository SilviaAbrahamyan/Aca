package com.homeworks.oca.exception.withdatatypes;

/**
 * Created by home on 11/21/2018.
 */
public class Toy {
    public void play() {
        System.out.print("play-");
    }
    public void finalizer() {
        System.out.print("clean-");
    }
    public static void main(String[] fun) {
        Toy car = new Toy();
        car.play();
        System.gc();
        Toy doll = new Toy();
        doll.play();
    }
}