package com.homeworks.oca.exception.others;

/**
 * Created by home on 11/22/2018.
 */
public class DesertTortoise {
}
interface CanBurrow {
    public abstract void burrow();
}
@FunctionalInterface interface HasHardShell extends CanBurrow {

} // k1
abstract class Tortoise implements HasHardShell { // k2
    public abstract int toughness();
}