package com.homeworks.aca_book.nested;

/**
 * Created by home on 10/18/2018.
 */
public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface {
        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }


    }
}
