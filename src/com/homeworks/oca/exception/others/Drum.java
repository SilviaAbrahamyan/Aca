package com.homeworks.oca.exception.others;

/**
 * Created by home on 11/22/2018.
 */
public class Drum extends Instrument {
        public Drum(int beats) {
        super(beats);
    }
    public void play(int count) {
    }

    public void concert() {
        super.play();
    }

    public static void main(String[] beats) {
        MakesNoise mn = new Drum(7);
       // mn.concert();
    }

}

interface MakesNoise {
}

abstract class Instrument implements MakesNoise {
    public Instrument(int beats) {
    }

    public void play() {
    }
}