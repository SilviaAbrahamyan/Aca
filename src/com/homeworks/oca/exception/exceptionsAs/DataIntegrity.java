package com.homeworks.oca.exception.exceptionsAs;

/**
 * Created by home on 10/24/2018.
 */
public class DataIntegrity {
    private int score;
    public DataIntegrity() {
        super();
        DataIntegrity.this.score = 5;
    }
    public static void main(String[] books) {
        final DataIntegrity johnny5 = new DataIntegrity();
        assert(johnny5.score>2) : johnny5.score++;
        //assert johnny5.score>=5 : System.out.print("");
        System.out.print("=");
    }
}
