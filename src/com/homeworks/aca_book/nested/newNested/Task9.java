package com.homeworks.aca_book.nested.newNested;

/**
 * Created by home on 11/13/2018.
 */
public class Task9 {
    private Task9Interface resutl(){
        class Task9Inner implements Task9Interface{

            @Override
            public int foo() {
                return 0;
            }
        }
        return  new Task9Inner();
    }
}

 interface Task9Interface{
    int foo();
}