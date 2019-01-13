package com.homeworks.aca_book.nested.newNested;

import com.homeworks.aca_book.nested.app.Task6Interface;

/**
 * Created by home on 11/13/2018.
 */
public class Task6 {
    protected class Task6Inner implements Task6Interface {
        public Task6Inner() {
        }

        @Override
        public void foo() {
            System.out.println("Task6Inner");
        }
    }
}
