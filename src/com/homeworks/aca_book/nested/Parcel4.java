package com.homeworks.aca_book.nested;

/**
 * Created by home on 10/18/2018.
 */
public class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }
}

interface Contents {
    int i = 11;

    public int value();
}

interface Destination {
    String label = "0";

    String readLabel();


}

class TestParcel {
    public static void main(String[] args) {

        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
// Illegal -- can’t access private class:
      //  Parcel4. pc = p.new PContents();
    }

}
