package com.homeworks.aca_book.inheritence;

/**
 * Created by home on 10/29/2018.
 */
public class Violin extends StringInstrument implements MusicCreator{
    public Long play() {
        return 12l;
    }

}
interface MusicCreator { public Number play(); }
abstract class StringInstrument { public Long play() {return 3L;} }