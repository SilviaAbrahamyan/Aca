package com.homeworks.oca.exception.others;

import java.util.stream.Stream;

/**
 * Created by home on 11/23/2018.
 */
public class PreSchool1 {
    public static void main(String[] args) {
        Blankie1 b1 = new Blankie1();
        Blankie1 b2 = new Blankie1();
        b1.color = "pink";
        Stream.of(b1, b2).filter(Blankie1::isPink).forEach(System.out::println);
    }
}
class Blankie1 {
    String color;
    boolean isPink() {
        return "pink".equals(color);
    }
}