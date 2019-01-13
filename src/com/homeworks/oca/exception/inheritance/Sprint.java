package com.homeworks.oca.exception.inheritance;

/**
 * Created by home on 10/28/2018.
 */
public class Sprint implements Run, Jog {
    public void walk() {
        System.out.print("Sprint");
    }

    public static void main1() {
        new Sprint().walk();
    }
    public static void main(String... args) {
         Sprint.main1();
    }
}

interface Run {
    default void walk() {
        System.out.print("Run");
    }
}
interface Jog{
default void walk(){
        System.out.print("Jog");
        }
        }