package com.homeworks.oca.exception.GenericandCollection;

import java.util.function.Predicate;

/**
 * Created by home on 10/24/2018.
 */
public class Tourist {
    public Tourist(double distance) {
        this.distance = distance;
    }
    public double distance;
}
class Lifeguard {
    private void saveLife(Predicate<Tourist> canSave, Tourist tourist) {
        System.out.print(canSave.test(tourist) ? "1" : "2"); // y1
    }
    public final static void main(String... sand) {
        new Lifeguard().saveLife(s -> s.distance<4, new Tourist(2)); // y2
    }
}