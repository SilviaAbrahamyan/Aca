package com.homeworks.aca_book.overriding.staticversion;

/**
 * Created by home on 10/5/2018.
 */
public class Marsupial {
    public static boolean isBiped() {
        return false;
    }

    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: " + isBiped());
    }
}

class Kangaroo extends Marsupial {
    public static   boolean isBiped() {
        return true;
    }

    public void getKangarooDescription() {


        System.out.println("Kangaroo hops on two legs: " + isBiped());
    }

    public static void main(String[] args) {
        Marsupial joey = new Kangaroo();


        joey.getMarsupialDescription();
        //joey.getKangarooDescription();
    }
}
