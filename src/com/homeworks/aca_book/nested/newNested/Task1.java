package com.homeworks.aca_book.nested.newNested;

/**
 * Created by home on 11/13/2018.
 */
public class Task1 {
    private String field;

    public Task1(String field) {
        this.field = field;
    }

    class Task1Inner{
        public Task1Inner() {
            System.out.println("Inner()");
        }

        @Override
        public String toString() {
            return field;
        }
    }

    Task1Inner makeInner(){
        return new Task1Inner();
    }

    public static void main(String[] args) {
        Task1 t = new Task1("hello");
        Task1.Task1Inner task1Inner = t.makeInner();
        System.out.println(task1Inner.toString());
    }
}
