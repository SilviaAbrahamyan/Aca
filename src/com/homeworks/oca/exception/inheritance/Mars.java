package com.homeworks.oca.exception.inheritance;

/**
 * Created by home on 10/28/2018.
 */
public class Mars extends Planet implements Sphere {
public Mars() {
        super();
    }
    public String getName() { return "sf"; }
    public static void main(final String[] probe) {
        System.out.print(((Planet)new Mars()).getName());
    }
}
interface Sphere {
    default  String getName() { return "u"; }
}
abstract class Planet {
    abstract String getName();
}