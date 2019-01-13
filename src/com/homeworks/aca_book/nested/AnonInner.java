package com.homeworks.aca_book.nested;

/**
 * Created by home on 10/18/2018.
 */
public class AnonInner {
    interface SaleTodayOnly {
        int dollarsOff();
    }

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            public int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }
}
