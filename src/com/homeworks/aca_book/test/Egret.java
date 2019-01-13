package com.homeworks.aca_book.test;

import com.homeworks.aca_book.statickeyword._C;

/**
 * Created by home on 10/3/2018.
 */

///???
public class Egret {
    private String color;

    public Egret() {

        this("white");
        System.out.println("Egret:");
    }

    public Egret(String colo) {
        color = colo;
        System.out.println("Egret c: ");
    }

    public static void main(String[] args) {

        _C c = new _C(5);
        Egret e = new Egret("white");
        System.out.println("Color:" + e.color);
        Integer t = new Integer(6);
        Integer t1 = new Integer(t);

    }
}
