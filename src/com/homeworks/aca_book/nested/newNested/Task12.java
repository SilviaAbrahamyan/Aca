package com.homeworks.aca_book.nested.newNested;

/**
 * Created by home on 11/13/2018.
 */
public class Task12 {
    private int oi = 1;
    private void foo() {
        System.out.println(oi);
    }
    public Inner12 inner() {
        return new Inner12() {
            public void modifyOuter() {
                oi *= 2;
                foo();
            }
        };
    }
    public void showOi() { System.out.println(oi); }
    public static void main(String[] args) {
        Task12 out = new Task12();
        out.showOi();
        out.inner().modifyOuter();
        out.showOi();
    }
}
interface Inner12 {
    void modifyOuter();
}