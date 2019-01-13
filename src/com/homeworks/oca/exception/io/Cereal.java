package com.homeworks.oca.exception.io;

/**
 * Created by home on 11/13/2018.
 */
public class Cereal {
    private String name = "1";
    private transient int sugar;
    public Cereal() {
        super();
        this.name = "2";
    }
    {
        name = "3";
    }
    public String getName() { return name; }
    public void setName(String name) {
        this.name = name;
    }
    public int getSugar() { return sugar; }
    public void setSugar(int sugar) {
        this.sugar = sugar;
    }
}
