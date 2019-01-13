package com.homeworks.live.convert;

/**
 * Created by home on 9/20/2018.
 */
public class StringEqualent {
    static int i = 129998;
    static int j = 129998;
    int longExpanded() {
        int temp = (int)9L; // DOES NOT COMPILE
        return temp;
    }

    public static void walk(int  nums) {
        System.out.println(nums);

    }
    public static void main(String args[]) {


walk(5);
        int i = 4;
        int j = 34;


//        String s1 = "ab" + 3;
//        String s2 = "ab3";
//
//        s1 = s1.concat(s2);
      String s3 = "Hello";

        String t = new String(s3);
        if ("Hello".equals(s3)) System.out.println("one");
        if (t.equals(s3)) System.out.println("three");


//
//        String s6 = i + "a" + j;
//
//        String s4 = "4a34";
//        String s5 = "4a" + "34";

//        System.out.println(s1);
//
//        System.out.println(s1 == s2);
//        System.out.println(s3 == s4);
//        System.out.println(s5 == s3);
//        System.out.println(s6 == s3);

        System.out.println(StringEqualent.i == StringEqualent.j);

        final short sh = 28 ;
        final byte b = 99;

        short b2 = b + sh ;


        byte result = sh + b;
        //String letters = "abcdef";
       // System.out.println(letters.length());
        //System.out.println(letters.charAt(3));
//        String numbers = "012345678";
//        System.out.println(numbers.substring(1, 3));
//        System.out.println(numbers.substring(7, 7));
//        System.out.println(numbers.substring(7));

        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1, 2).length();
        total += letters.substring(6, 6).length();
//       total += letters.substring(6, 5).length();
        StringBuilder numbers = new StringBuilder("0123456789");
        numbers.delete(2, 8);
        //numbers.append("-").insert(2, "+");
        System.out.println(numbers);
    }
}
