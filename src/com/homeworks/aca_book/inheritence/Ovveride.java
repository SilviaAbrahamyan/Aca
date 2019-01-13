package com.homeworks.aca_book.inheritence;

import java.lang.annotation.Annotation;

/**
 * Created by home on 11/9/2018.
 */
public interface Ovveride {
    void over(String x);
}

class OvverideChild implements Ovveride{

    @Override
    public void over(String x) {

    }

    public void over() {

    }
}