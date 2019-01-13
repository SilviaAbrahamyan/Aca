package com.homeworks.oca.exception.others;

/**
 * Created by home on 11/22/2018.
 */
public class Trouble extends Big {
//    public Trouble() {
//
//    }

    public Trouble(int deep) {
        super(false);
    // this()
    }

    public Trouble(String now, int... deep) {
       this(3);
    }

//    public Trouble(long deep) {
//        this("check", deep);
//    }

    public Trouble(double test) {
        super(test > 5 ? true : false);

    }

}

class Big {
    public Big(boolean stillIn) {
        super();
    }

  void   $Hum2(){}
}
