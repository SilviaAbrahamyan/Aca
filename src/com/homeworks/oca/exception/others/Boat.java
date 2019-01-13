package com.homeworks.oca.exception.others;

/**
 * Created by home on 11/23/2018.
 */
public class Boat {
    public int travel() throws Exception { return 4; }; // j1
    public static void main(String... distance) throws Exception{
        try {
            System.out.print(new Boat().travel());

        } catch (Exception e) {
                System.out.print(8);
    }
    }
}
class CapsizedException extends Exception {}
class Transport1 {
    public int travel() throws CapsizedException { return 2; };
}