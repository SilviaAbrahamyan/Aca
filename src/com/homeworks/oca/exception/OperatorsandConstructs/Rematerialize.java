package com.homeworks.oca.exception.OperatorsandConstructs;

/**
 * Created by home on 11/21/2018.
 */
public class Rematerialize {
    public static void main(String[] input) {
        int dog = 11;
        int cat = 3;
        int partA = dog / cat;
        int partB = dog % cat;
        int newDog = partB + partA * cat;
        System.out.print(newDog);
    }
}
