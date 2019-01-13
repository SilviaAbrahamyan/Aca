package com.homeworks.oca.exception.inheritance;

/**
 * Created by home on 10/28/2018.
 */
public class ElectricCar extends Car {
    public final String drive() { return "xcjh"; }
    public static void main(String[] wheels) {
        final Car car = new ElectricCar();
        System.out.print(car.drive());
    }
}

class Automobile {
    private final String drive() {
        return "rgf";
    }
}

class Car extends Automobile {
    protected String drive() {
        return "e";
    }
}