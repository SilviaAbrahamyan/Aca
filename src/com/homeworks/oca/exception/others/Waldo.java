package com.homeworks.oca.exception.others;

/**
 * Created by home on 11/23/2018.
 */
public class Waldo extends Wanda implements Finder {
   // public long find() {return 40;}
    public static final void main(String[] pictures) {
        final Finder f = new Waldo();
        System.out.print(f.find());
    }

    @Override
    public long find() {
        return 0;
    }
}

 interface  Finder {
    default long find() {
        return 20;
    }
}

abstract class Wanda {
  protected   abstract long find();
}

abstract class A1{
    abstract void foo();
}

interface A2{
    default void foo(){}
}

class A3 extends A1 implements A2{

    @Override
    public void foo() {

    }
}