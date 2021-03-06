package com.homeworks.oca.exception.others;

/**
 * Created by home on 11/22/2018.
 */
public enum  Proposition {
    //TRUE(-10) { @Override String getNickName() { return "RIGHT"; }},
    FALSE(-10) { public String getNickName() { return "WRONG"; }},
    UNKNOWN(0) { @Override public String getNickName() { return "LOST"; }};
    private final int value;
    Proposition(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
   protected  abstract String getNickName();
}
