package com.homeworks.live;

/**
 * Created by home on 9/20/2018.
 */
public class BMICalculator {
    public static void main(String args
                            []) {

        Person jim = new Person();

        jim.weight = 85 / 2.2;

        jim.height = 1.78 / 39;

        System.out.println(jim.getBMI());

    }
}
