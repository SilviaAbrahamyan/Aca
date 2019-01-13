package com.homeworks.live;

/**
 * Created by home on 9/20/2018.
 */
public class Person {
    public String
            name;
    public double
            weight;

    public double
            height;
    private int age;

    public double getBMI() {
        return weight / (height* height);
    }

    public int getAge() {
        return age;
    }
}
