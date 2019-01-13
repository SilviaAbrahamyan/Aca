package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public class Organ {
    public void operate() throws Exception {
        try {
            throw new Exception("Not supported");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Heart extends Organ {
    public void operate()  {
        System.out.print("beat");
    }


    public static void main(String... cholesterol) {

            new Heart().operate();

    }
}