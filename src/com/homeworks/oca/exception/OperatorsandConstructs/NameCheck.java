package com.homeworks.oca.exception.OperatorsandConstructs;

/**
 * Created by home on 11/21/2018.
 */
public class NameCheck {
    public static void main(String... data) {
        String john = "john";
        String jon = new String(john);
        System.out.print((john==jon)+" "+(john.equals(jon)));
    }
}
