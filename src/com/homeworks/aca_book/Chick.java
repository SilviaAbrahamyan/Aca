package com.homeworks.aca_book;

import java.util.HashSet;

/**
 * Created by home on 9/19/2018.
 */
public class Chick {


    { System.out.println(this.name); } // DOES NOT COMPILE

    private String name = "Fluffy";
    {

        System.out.println("setting field");
        System.out.println(this.x);
    }
    char x ;

    public Chick() {
        name = "Tiny";
        System.out.println("setting constructor");
    }


    { System.out.println("Feathers"); }
    public static void main(String[] args) {
       // Chick chick = new Chick();
        HashSet<? super ClassCastException> set = new HashSet<Exception>();
        HashSet<? extends Number> set1 = new HashSet<Integer>();

        int x = 3;
        Double d = 4d;
        int y = ++x * 5 / x-- + --x;
        System.out.println("d is " + d);
        System.out.println("x is " + x);
        System.out.println("y is " + y);
       final byte a = 40, b = 50;
        byte sum = (byte) a + b;
        int xx = 0;
        long yy = xx * 4 - xx++;
        while(xx++ < 10) {}
        String message = xx > 10 ? "Greater than" : "d";
        System.out.println(message+","+xx);


        String s = null;
        if(x == yy){
            System.out.println(5 * 4 % 3);
        }

    }


}