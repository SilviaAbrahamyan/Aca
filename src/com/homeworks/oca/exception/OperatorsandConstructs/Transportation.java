package com.homeworks.oca.exception.OperatorsandConstructs;

/**
 * Created by home on 11/21/2018.
 */
public class Transportation {
    public static String travel(int distance) {
        return distance<1000 ? "t": "d";
    }
    public static void main(String[] answer) {
        System.out.print(travel(500));

        String myTestVariable = "G";
        System.out.println(myTestVariable.equals(null));


        String bob = new String("b");
        String notBob = bob;
        System.out.println((bob==notBob)+" "+(bob.equals(notBob)));
        System.out.println(12 + 6 * 3 % (1 + 1) );
        switch (2){
            default:
             //   System.out.println();
                break;
        }
    }
}
