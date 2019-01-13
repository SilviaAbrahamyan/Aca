package com.homeworks.live.convert;

/**
 * Created by home on 10/3/2018.
 */
public class Main1 {
    public static void main(String args[]) {
        Integer a = null;
        Object b;

        b = ( a == null) ? null : a + 10;

//        if ( a == null){
//            b = a;
//
//        }else {
//            b = a + 10;
//        }


        int i    = 1;
        float f  = 2.0f;
        double d = 2.0;
        // First int*float is promoted to float*float, then
        // float==double is promoted to double==double:
        if (i * f == d) System.out.println("oops");


        Integer in = 5;
        Long l = 4l;

        long c = in + l;

         final byte b1 = 8;
       final byte b2 = 9;
        byte b3 = b1 + b2;

        //System.out.println(( a != null) ? null : a);
    }
}
