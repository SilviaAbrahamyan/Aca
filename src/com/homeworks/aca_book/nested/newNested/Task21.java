package com.homeworks.aca_book.nested.newNested;

/**
 * Created by home on 11/13/2018.
 */
public interface Task21 {
    String f();
    String g();
    class Nested {
        static void testIn(Task21 i) {
            System.out.println(i.f() + i.g());
        }
    }
}
class Ex21 implements Task21 {
    public String f() { return "hello "; }
    public String g() { return "friend"; }
    public static void main(String[] args) {
        Ex21 x = new Ex21();
        Task21.Nested.testIn(x);
    }
}