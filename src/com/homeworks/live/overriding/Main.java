package com.homeworks.live.overriding;

/**
 * Created by home on 10/2/2018.
 */
public class Main {
    public static void main(String [] args) {
        new Child().foo();
    }

}

class Base{
    int x ;

    {
        System.out.println("Inside Base Instate");
        this.x = 4;
        System.out.println(this.x);
    }
    Base(){
        System.out.println("Inside Base");
        foo();
    }

    void foo(){
        System.out.println("Inside Base foo");
        System.out.println(this.x);
    }
}

class Child extends Base{

    int x ;
    {
        System.out.println("Inside Child Instate");
        this.x = 10;
        System.out.println(this.x);
    }


    void foo(){
        System.out.println("Inside Child foo");
        System.out.println(this.x);
    }
}
