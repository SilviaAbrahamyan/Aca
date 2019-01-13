package com.homeworks.live.aa;


import com.homeworks.live.a.A;

public class Main {

    public static void main(String... args) throws Exception {
        new A() {
            public void foo() throws Exception {
                System.out.println(this.x);
            }
        }.foo();

        Animal animal = new Animal("Animal", 1, 1) {
            @Override
            public void eat() {
                System.out.println("No-Name Animal is eating");
            }
        };

        Animal shark = new Shark("Shark", 3, 3, 3) {
        //    @Override
//            public void eat() {
//                System.out.println("No-Name Shark is eating");
//            }
        };

        System.out.print(animal.getClass() + " ");
        animal.eat();
        System.out.print(shark.getClass() + " ");
        shark.eat();

        X x = new Y();
        //x.bar(); //DOES NOT COMPILE

        new Y().bar();
    }

}


class X {
    void foo() {
    }
}

class Y extends X {
    void bar() {
    }
}
