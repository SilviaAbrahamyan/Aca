package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public class LightBulb implements Source {
    public void flipSwitch() {
        try {
          //  System.out.print("0");
            throw new RuntimeException("1");

        } finally {
            System.out.print("2");
        }
    }

    public static void main(String... electricity) throws Throwable {
        final Source bulb = new LightBulb();
        bulb.flipSwitch();
    }
}

interface Source {
    void flipSwitch() throws Exception;
}