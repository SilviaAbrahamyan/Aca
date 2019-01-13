package com.homeworks.aca_book.nested.newNested.task6;

import com.homeworks.aca_book.nested.app.Task6Interface;
import com.homeworks.aca_book.nested.newNested.Task6;

/**
 * Created by home on 11/13/2018.
 */
public class Task6Main extends Task6 {
    Task6Interface createTask6implim(){
        return this.new Task6Inner();
    }

    public static void main(String[] args) {
        Task6Main task6Main = new Task6Main();
        Task6Interface task6Interface = task6Main.createTask6implim();
        task6Main.createTask6implim().foo();
    }
}
