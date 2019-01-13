package com.homeworks.oca.exception.inheritance;

/**
 * Created by home on 10/28/2018.
 */
public class SoccerBall extends Ball implements Equipment {
    public SoccerBall() {
        super(5);
    }

    public Ball get() {
        return this;
    }

    public static void main(String[] passes) {
        Ball equipment =  (Ball) new SoccerBall().get();
        System.out.print(((SoccerBall) equipment).size);
        System.out.print(( new SoccerBall().get().size));
    }
}

abstract class Ball {
    protected final int size;

    public Ball(int size) {
        this.size = size;
    }
}

interface Equipment {
}