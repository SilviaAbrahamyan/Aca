package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public class Stranger {
    public static String getFullName(String firstName, String lastName) {
        try {
            return firstName.toString() + " " + lastName.toString();
        }catch (NullPointerException e) {
            System.out.print("Problem");
        } finally {
            System.out.print("Finished");
        }

        return null;
    }
    public static void main(String[] things) {
        System.out.print(getFullName("Joyce","Hopper"));
    }
}
