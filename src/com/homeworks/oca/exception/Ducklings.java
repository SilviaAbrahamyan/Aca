package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public class Ducklings extends Duck{
    private int age;
    public Ducklings(int age) { this.age = age; }
    public int getDuckies() { return this.age/count; }
    public static void main(String[] pondInfo) {
        Duck itQuacks = new Ducklings(5);
        System.out.print(itQuacks.getDuckies());
    }
}
abstract class Duck {
    protected int count;
    public abstract int getDuckies();
}