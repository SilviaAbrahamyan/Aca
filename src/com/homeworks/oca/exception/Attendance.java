package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public class Attendance {
    private Boolean[] list; // value omitted
    public int printTodaysCount() {
        int count=0;
        for(int i=0; i<10; i++) {
            if(list[i]) ++count;
        }
        return count;
    }
    public static void main(String[] roster) {
        new Attendance().printTodaysCount();
    }
}
