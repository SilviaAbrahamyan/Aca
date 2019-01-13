package com.homeworks.oca.exception.encapsulatemethods;

/**
 * Created by home on 11/14/2018.
 */
public class Phone {
    private int size;
    public Phone(int size) {this.size=size;}
    public static void sendHome(Phone p, int newSize) {
        p = new Phone(newSize);
        p.size = 4;
    }
    public static final void main(String... params) {
        final Phone phone = new Phone(3);
        sendHome(phone,7);
        System.out.print(phone.size);
        call(9,"f","df");
    }
    public static void call(int count, String me, String... data){}
}
