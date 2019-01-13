package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public class Element {
    public int getSymbol() throws GasException { return -1; } // g1
}

class GasException extends Exception {}
class Oxygen extends Element {
    public int getSymbol() {
        return 8;
    } // g2

    public void printData() {
        try {
            System.out.print(getSymbol());
        } catch(Exception e) { // g3
            System.out.print("favg");
        }
    }
}