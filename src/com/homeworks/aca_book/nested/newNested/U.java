package com.homeworks.aca_book.nested.newNested;

/**
 * Created by home on 11/13/2018.
 */
public interface U {
    void method1();

    void method2();

    void method3();

}

class A {
    U ref() {
        return new U() {
            @Override
            public void method1() {
                System.out.println("1");
            }

            @Override
            public void method2() {
                System.out.println("2");
            }

            @Override
            public void method3() {
                System.out.println("3");
            }
        };
    }
}

class B{
    U [] arr = new U[3];
    int index = 0;
    void add(U u){
        arr[index++] = u;
    }
    void set(int arg, U u){
        arr[arg] = u;
    }
    void move(){
        arr[index].method1();
        arr[index].method2();
        arr[index].method3();
    }

    public U[] getArr() {
        return arr;
    }
}
class Main{
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        B b = new B();
        b.add(a1.ref());
        b.add(a2.ref());
        b.add(a3.ref());
        System.out.println(b.getArr());
        b.set(1, null);
        System.out.println(b.getArr());
    }
}