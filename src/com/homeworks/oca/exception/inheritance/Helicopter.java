package com.homeworks.oca.exception.inheritance;

/**
 * Created by home on 11/14/2018.
 */
public class Helicopter  extends Rotorcraft {
    private int height = 10;
    protected int fly() {
        return super.height;
    }
    public static void main(String[] unused) {
        Helicopter h = (Helicopter)new Rotorcraft();
        System.out.print(h.fly());
    }
}

 class   Rotorcraft {
    protected final int height = 5;
     int fly(){
         return this.height;
     }
}