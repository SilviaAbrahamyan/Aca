package com.homeworks.live;

/**
 * Created by home on 10/15/2018.
 */
public class Main5 {
    public static void main(String... args) throws Exception {
        D a = new D();
        D.B b = a.new B();

        b.foo();
    }
}

class D {
    private int a;
    class B {
       private int a = 20;
        public void foo() {
            int a = 5;
            System.out.println(this.a);
        }
    }
}
