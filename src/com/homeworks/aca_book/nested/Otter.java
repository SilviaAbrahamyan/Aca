package com.homeworks.aca_book.nested;

/**
 * Created by home on 10/18/2018.
 */
public interface Otter {
    default void play() { }
}
class RiverOtter implements Otter {
    @Override public void play() { }


}