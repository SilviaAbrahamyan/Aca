package com.homeworks.aca_book.nested.newNested;

/**
 * Created by home on 11/13/2018.
 */
public class Task7 {
    private String field = " 02387";

    private void foo() {
        System.out.println("Task7");

    }
    class Task7Inner {

        void foo1() {
            field = "dsfagv";
            foo();
        }

    }
    public void showOi() { System.out.println(field); }
    void testInner() {
        Task7Inner in = new Task7Inner();
        in.foo1();
    }

    public static void main(String[] args) {
        Task7 task7 = new Task7();
        task7.showOi();
        task7.testInner();
        task7.showOi();
    }

}
