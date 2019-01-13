package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public class Citadel {
    public void openDrawbridge() throws RuntimeException { // q1
        try {
            throw new KnightAttackingException();
        } catch (Exception e) {
            throw new ClassCastException();
        } finally {
         //   throw new CastleUnderSiegeException(); // q2
        }
    }
    public static void main(String[] moat) {
        new Citadel().openDrawbridge(); // q3
    }
}
class CastleUnderSiegeException extends Exception {}
class KnightAttackingException extends CastleUnderSiegeException {}