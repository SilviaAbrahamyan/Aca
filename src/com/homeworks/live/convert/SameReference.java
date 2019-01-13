package com.homeworks.live.convert;

/**
 * Created by home on 9/20/2018.
 */
public class SameReference {
    public static void main(String args[]){

        char a = 1;
       // short b = 2;
       //b = ( a == null) ? null : a + 10;

        int c = a + 3;



//        if ( a == null){
//            b = a;
//        }else {
//           b = a + 10;
//        }

        //System.out.println(b);

        short i1 = 3;
        Byte i2 = 10;

       // System.out.println(false ? i1 : i2);

        //double d = true ? i2 : i1 / 3.0;


        Integer i3 = null;
        Integer i4 = 130;

        Integer q = true ? i3 : i3 + 10;

        System.out.println(q);

        short i    = 1;
        long l = 4;

        long k = i + l;

        float f  = 1.0f;
        double d = 2.0;
        // First int*float is promoted to float*float, then
        // float==double is promoted to double==double:
        System.out.println(i * f == d);
        byte b = 0x1f;
        f = true ? i : 4.0f;
        System.out.println(f);


//        System.out.println(i1 == i3);
//        System.out.println(i3 == i4);
    }
}
