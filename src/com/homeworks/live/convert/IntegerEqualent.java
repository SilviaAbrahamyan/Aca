package com.homeworks.live.convert;

/**
 * Created by home on 9/21/2018.
 */
public class IntegerEqualent {
    int x = 0;
    //static int l = 1;

    Float l = 51f;

    static void method(int l) {

        l = 3;
        System.out.println(l);
    }

    void method2(int j) {

        j = 4;
        System.out.println(j);
    }


    static Integer xx = 444;
    static Integer yyy = 444;


    public static void main(String args[]) {

        Integer i1 = new Integer("6");
        Integer i2 = new Integer(6);

        int i3 = 6;
        int i4 = 6;
        Integer i5 = 56;
        Integer i6 = 56;
        String s = null;



        int i7 = -128;
        Integer i8 = -128;

//        System.out.println(i1 == i2);
//        System.out.println(i1.equals(i2));
//        System.out.println(i1.equals(i3));
//        //System.out.println(i4.equals(i3));
//        System.out.println(i3 == i4);
//        System.out.println(i5 == i6);
//        System.out.println(i7 == i8);
//        int d = 1;
//        IntegerEqualent.method(d);
//        IntegerEqualent i = new IntegerEqualent();
//
//        i.method2(d);

//        int y = 1;
//        int z = 1;
//        final int x = y<10 ? y++ : z++;
//        System.out.println(y+","+z+"," + x );


//        long y = 10;
//        for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
//            System.out.print(x + " ");
//        }

        int x = 5;
      // System.out.println(x > 6 ? x < 4 ? 10 : 8 : 7);
        byte a = 4, b = 5;
         byte sum = (byte) (a + b);
        boolean g = true;
        if(g = false) sum = b;
        else a = 8;

//        int  y = 15;
//        while (x < 10) {
//            y --;
//            x++;
//        }
//         System.out.println(x+", "+y);

        Integer i = 10;
        Double d  = 1.8;

        final String ab = "ab";
        String x1 = "abc";
        String x2 = ab + "c";



        Object d1 = false? true : d;
        System.out.println(d1);
        System.out.println(x2 == x1);
        System.out.println(x2.equals(x1));
        System.out.println(yyy.equals(xx));
        System.out.println(yyy == xx);
    }


}

