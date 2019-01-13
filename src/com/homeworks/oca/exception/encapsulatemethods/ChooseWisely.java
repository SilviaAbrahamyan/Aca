package com.homeworks.oca.exception.encapsulatemethods;

/**
 * Created by home on 11/14/2018.
 */
public class ChooseWisely {
    public ChooseWisely() {
        super();
    }

    public int choose(int choice) {
        return 5;
    }

    public int choose(short choice) {
        return 2;
    }

    public int choose(long choice) {
        return (int) choice;
    }

    public static void main(String[] path) {
        System.out.print(new ChooseWisely().choose((2 + 1)));
    }
}
