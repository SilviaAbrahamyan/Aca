package com.homeworks.oca.exception.others;

/**
 * Created by home on 11/22/2018.
 */
public class Vacation {
    public static void main(String... unused) {
        final A input = A.Thanksgiving;
        switch(input) {
            default:
            case ValentinesDay:
                System.out.print("1");
            case PresidentsDay:
                System.out.print("2");
        }
    }
}
enum DaysOff {
  //  Thanksgiving, PresidentsDay, ValentinesDay
}