package com.homeworks.live.binding;

/**
 * Created by home on 10/3/2018.
 */
public class Glider2 {
//    public static String glide(String s) {
//        return "1";
//    }

    public static String glide(Object o) {
        return "3";
    }
    public static String glide(String o) {
        return "5";
    }
    public static String glide(String ... s) {
        return "4";
    }
    public static void main(String[] args) {
        System.out.print(glide(7));
        System.out.print(glide("a", "b"));

    }
}
