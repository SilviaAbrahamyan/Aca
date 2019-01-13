package com.homeworks.aca_book.nested.newNested;

/**
 * Created by home on 11/13/2018.
 */
public class Task152 {
    Task151 returnTask151(int x){
        return new Task151(x){};
    }
    public static void main(String[] args) {
        Task152 x = new Task152();
        System.out.println(x.returnTask151(4).getX());
    }
}
