package com.homeworks.aca_book.lambda;

/**
 * Created by home on 12/30/2018.
 */
public class ConstructorRefDemo {
    public static void main(String args[]) {
// Create a reference to the MyClass constructor.
// Because func() in MyFunc takes an argument, new
// refers to the parameterized constructor in MyClass,
// not the default constructor.
        MyFunc myClassCons = MyClass::new;
        MyFunc myClassCons1 = (v) -> new MyClass(v);
// Create an instance of MyClass via that constructor reference

        MyClass mc = myClassCons.func(100);
// Use the instance of MyClass just created.
        System.out.println("val in mc is " + mc.getVal( ));
    }
}
interface MyFunc {
    MyClass func(int n);
}
class MyClass {
    private int val;
    // This constructor takes an argument.
    MyClass(int v) { val = v; }
    // This is the default constructor.
    MyClass() { val = 0; }
    // ...
    int getVal() { return val; };
}