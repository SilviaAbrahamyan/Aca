package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public class Lair {
        public void openDrawbridge() throws Exception{ // r1
            try {
                throw new Exception("“This Exception”");
            } catch (RuntimeException e) {
                throw new DragonException(); // r2
            } finally {
                throw new RuntimeException("srgrfgv");
            }
        }
        public static void main(String[] moat) throws Exception {
            new Lair().openDrawbridge(); // r3
        }
}
class DragonException extends Exception {}