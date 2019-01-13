package com.homeworks.aca_book.interfaceexamples;

/**
 * Created by home on 10/13/2018.
 */
public class Cat  implements Run,Walk{

//    @Override
//    public int getSpeed() {
//        return 0;
//    }

    public static void main(String[] args) {
        Walk w = new Cat();
//        System.out.println(w.getSpeed());
//        System.out.println(new Cat().getSpeed());
  // System.out.println(new Cat().getJumpHeight());
    }
}
