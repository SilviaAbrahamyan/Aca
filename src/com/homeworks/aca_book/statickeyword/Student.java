package com.homeworks.aca_book.statickeyword;

/**
 * Created by home on 10/3/2018.
 */
public class Student {
    static  int value = 10;
    int x;
    int getValueNonStatic(){
        x = 10;
        return value;
    }


   static int getValueStatic(){

        return value;
    }

    public static void main(String [] args){

        Student s1 = null;

        s1.getValueNonStatic();
        s1.getValueStatic();
    }
}
