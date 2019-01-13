package com.homeworks.oca.exception.others;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Supplier;

/**
 * Created by home on 11/23/2018.
 */
public class Ready {
    private static double getNumber() {
        return .007;
    }
    public static void math() {
        Supplier<Double> s = Ready::getNumber;
        double d = s.get();
        System.out.println(d);

        Set<Integer> dice = new TreeSet<>();
        dice.add(6);
        dice.add(6);
        dice.add(4);
        dice.stream().filter(n -> n != 4).forEach(System.out::println);
    }
}
