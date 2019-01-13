package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public class Transport {
    public int travel() throws CapsizedException {
        return 2;
    }
}

class CapsizedException extends Exception {
}

class Boat {
    public int travel() throws Exception{
      return 4;

    }



    public static void main(String... distance) {

        try {
            System.out.print(new Boat().travel());
        } catch (Exception e) {
            System.out.print(8);
        }


    }
}