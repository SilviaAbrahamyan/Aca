package com.homeworks.aca_book.nested;

/**
 * Created by home on 10/18/2018.
 */
public class Enclosing {
    static class Nested {
        private int price = 6;
        static class Nested1 {
            private int price = 5;
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
    }
}
