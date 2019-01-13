package com.homeworks.aca_book.overriding.a;

/**
 * Created by home on 10/4/2018.
 */
public class Base {
    public int x = 1;
      public void foo(){
        System.out.println("Base" + this.x);
    }



    public int getX() {

        return x;
    }
}
