package com.homeworks.oca.exception.withdatatypes;

/**
 * Created by home on 11/21/2018.
 */
public class Sand {
    public Sand() {
        System.out.print(1);
    }
    public void Sand() {
        System.out.print(2);
    }
    public void run() {
        new Sand();
        Sand();
    }
    public static void main(String... args) {
        new Sand().run();
    }
}
