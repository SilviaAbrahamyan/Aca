package com.homeworks.oca.exception.others;

import java.time.LocalTime;

/**
 * Created by home on 11/22/2018.
 */
public class Highway {
    int drive = 0;
    public int drive(long car) { return 2; }
    public int drive(double car) { return 3; }
    public int drive(int car) { return 5; }
    public int drive(short car) { return 3; }
    public static void main(String[] gears) {
        int value = 5;
        System.out.println(new Highway().drive(value));


        System.out.println(new StringBuilder("zelda")
                == new StringBuilder("zelda"));
        System.out.println(3 == 3);
        System.out.println("bart" == "bart");
        System.out.println(new int[0] == new int[0]);
        System.out.println(LocalTime.now() == LocalTime.now());
    }

    public void convert() {
        Building b = new Building();
        House h = new House();
        Building bh = new House();
        Building p = (House) b;
      //  House q = (Building) h;
        Building r = (Building) bh;
        House s = (House) bh;
    }
    public void convert1() {
        Building b = new Building();
        House h = new House();
        Building bh = new House();
        House p = (House) b;
        House q = (House) h;
        House r = (House) bh;
    }


    class Building {}
    class House extends Building{}
}
