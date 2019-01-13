package com.homeworks.aca_book.nested.newNested;

/**
 * Created by home on 11/13/2018.
 */
public class Task8 {
    class Task8Inner {
        private int ii1 = 1;
        private int ii2 = 2;
        private void showIi2() { System.out.println(ii2); }
        private void hi() { System.out.println("Inner hi"); }
    }
    // Need to create objects to access private elements of Inner:
    int oi = new Task8Inner().ii1;
    void showOi() { System.out.println(oi); }
    void showIi2() { new Task8Inner().showIi2(); }
    void outerHi() { new Task8Inner().hi(); }
    public static void main(String[] args) {
        Task8 out = new Task8();
        out.showOi();
        out.showIi2();
        out.outerHi();
    }
}
