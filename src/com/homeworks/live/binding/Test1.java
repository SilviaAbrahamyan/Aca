package com.homeworks.live.binding;

/**
 * Created by home on 9/23/2018.
 */
public class Test1 {
    public static void main( String [] args){
        byte b1 = 0;
        byte b2 = 10;

        Test1 t = new Test1();
       t.foo(b1, b2);
    }

    public void foo(byte b1, byte b2){
        System.out.println("1");
    }

    public void foo(short b1, byte b2){
        System.out.println("2");
    }
    public void foo(int b1, byte b2){
        System.out.println("6");
    }

    public void foo(Byte b1, byte b2){
        System.out.println("3");
    }

    public void foo(Integer  b1, int b2){
        System.out.println("4");
    }
    public void foo(Short  b1, Byte b2){
        System.out.println("5");
    }
}
