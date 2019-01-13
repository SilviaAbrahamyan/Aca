package com.homeworks.oca.exception.others;

/**
 * Created by home on 11/23/2018.
 */
public class Watch {
    private String getType() {
        return "watch";
    }

    public String getName(String suffix) {
        return getType() + suffix;
    }

    public static void main(String[] args) {
        Watch watch = new Watch();
        Watch smartWatch = new SmartWatch();
        System.out.print(watch.getName(","));
        System.out.print(smartWatch.getName(""));
    }
}

class SmartWatch extends Watch {
    private String getType() {
        return "smart watch";
    }

    public String getName(String suffix) {
        return getType() + suffix;
    }
}