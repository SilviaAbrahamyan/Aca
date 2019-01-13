package com.homeworks.aca_book.test;

/**
 * Created by home on 10/3/2018.
 */
public class Deer {
    public Deer() {
        System.out.print("Deer");
    }

    public Deer(int age) {
        this();
        System.out.print("DeerAge");
    }

    public boolean hasHorns() {
        return false;
    }

    public static void main(String[] args) {
        Deer deer = new Reindeer(5);
        System.out.println("," + deer.hasHorns());
    }
}

class Reindeer extends Deer {
    public Reindeer(int age) {
        System.out.print("Reindeer");
    }

    public boolean hasHorns() {
        return true;
    }
}

