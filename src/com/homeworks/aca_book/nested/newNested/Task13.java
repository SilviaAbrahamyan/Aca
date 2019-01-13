package com.homeworks.aca_book.nested.newNested;

/**
 * Created by home on 11/13/2018.
 */
public class Task13 {
    private Task13Interface resutl(){
        return  new Task13Interface(){
            @Override
            public int foo() {
                return 0;
            }
        };
    }
}
interface Task13Interface{
    int foo();
}