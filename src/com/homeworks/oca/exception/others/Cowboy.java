package com.homeworks.oca.exception.others;

/**
 * Created by home on 11/22/2018.
 */
public class Cowboy {
    private int space = 5;
    private double ship = space < 2 ? 1 : 10; // g1
    public void printMessage() {
        if(ship>1) {
            System.out.println("Goodbye");
        } if(ship<10 && space>=2) System.out.println("Hello"); // g2
        else System.out.println("See you again");
    }
    public static final void main(String... stars) {
        new Cowboy().printMessage();
        seasons("Summer", "Fall", "Winter", "Spring");
    }

    private static void seasons(String ... spring) {
        int l = spring[1].length(); // s1
        System.out.println(spring[l]);
    }


}
