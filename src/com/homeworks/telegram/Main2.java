package com.homeworks.telegram;

/**
 * Created by home on 10/27/2018.
 */
public class Main2 {
//    private static int x = 0;
//    static class E {
//        class F {
//            void goo() {
//                {
//                    System.out.print("F");
//                    System.out.print(x);
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        D.E.F f = new D.E().new F();
        f.goo();
    }
}

class D {
    private static int x = 0;
    static class E {
        class F {
            void goo() {
                {
                    System.out.print("F");
                    System.out.print(x);
                }
            }

        }
    }
}