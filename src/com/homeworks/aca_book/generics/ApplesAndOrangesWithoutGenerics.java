package com.homeworks.aca_book.generics;

import java.util.ArrayList;

/**
 * Created by home on 11/15/2018.
 */
public class ApplesAndOrangesWithoutGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Braeburn());
        for (Apple c : apples)
            System.out.println(c);
    }
// Not prevented from adding an Orange to apples:
    //apples.add(new Orange());

// Orange is detected only at run time

}

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {
}

class GrannySmith extends Apple {
}

class Gala extends Apple {
}

class Fuji extends Apple {
}

class Braeburn extends Apple {
}