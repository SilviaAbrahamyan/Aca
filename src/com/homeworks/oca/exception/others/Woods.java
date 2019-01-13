package com.homeworks.oca.exception.others;

/**
 * Created by home on 11/22/2018.
 */
public class Woods {
    static class Tree {}
    public static void main(String[] leaves) {
        int water = 10+5;
        final class Oak extends Tree { // p1
            public int getWater() {
                return water; // p2
            }
        }
        System.out.print(new Oak().getWater());
    }
}
