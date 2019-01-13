package com.homeworks.aca_book.nested;

/**
 * Created by home on 10/18/2018.
 */
public class Outer2 {

    static {
        class B{

        }
    }

    private String s;

    public Outer2(String s) {
        class A{

        }

        this.s = s;
    }

    class Inner {
        Outer2 k;
        private String s = "3245";
        public String toString() {
            return this.s;
        }

    }

    public Inner foo() {
        Inner i = new Inner();
        Object s = i.k;
        i.toString();
        return i;
    }
    public void foow() {
        Inner i = new Inner();
        Object s = i.k;
        i.toString();

        

    }


    public static void main(String[] args) {
        Outer2 o = new Outer2("fdss");
        Outer2.Inner  i =  o.new Inner();
        System.out.println(i.toString());
    }
}
