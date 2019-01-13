package com.homeworks.oca.exception.others;

/**
 * Created by home on 11/22/2018.
 */
public class ApplePicking {
    public static void main(String[] food) {
        Edible edible = new Edible() {
            @Override
            public void eat() {
                System.out.print("Yummy!");
            }
        };
    }
}
interface Edible { void eat(); }