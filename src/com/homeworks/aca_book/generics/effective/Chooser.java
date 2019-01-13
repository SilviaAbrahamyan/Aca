package com.homeworks.aca_book.generics.effective;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by home on 12/21/2018.
 */
public class Chooser<T> {
    T[] choiceArray;

    public Chooser(Collection<T> choices) {
        choiceArray = (T[])choices.toArray();
    }
}
class Chooser1<T> {
    private final List<T> choiceList;
    public Chooser1(Collection<T> choices) {
        choiceList = new ArrayList<>(choices);
    }
    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }
}