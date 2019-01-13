package com.homeworks.oca.exception.others;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by home on 11/22/2018.
 */
public class RopeSwing {
    private static Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();

    {
        System.out.println(rope1.length);
    }

    public static void main(String[] args) {
      RopeSwing r =  new RopeSwing();
        rope1.length = 2;
        rope2.length = 8;
        int x = -1;
        System.out.println(rope1.length);
        System.out.println(r instanceof RopeSwing );


    }
}



