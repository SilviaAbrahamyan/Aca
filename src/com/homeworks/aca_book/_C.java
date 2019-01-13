package com.homeworks.aca_book;

/**
 * Created by home on 9/19/2018.
 */
 class _C {
      int $ = 4;

    public _C() {

        $ = 3;
    }

    public static void main(String[] main) {


        _C c = new _C();
        System.out.println(c.$);

        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));

    }
}

class D{

}