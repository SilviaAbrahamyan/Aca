package com.homeworks.aca_book.nested;

/**
 * Created by home on 10/18/2018.
 */
public class TestBed {
    public void f() { System.out.println("f()"); }
    public static class Tester {
        public static void main(String[] args) {
            TestBed t = new TestBed();
            t.f();
        }
    }
}
