package com.homeworks.live.binding;

/**
 * Created by home on 9/24/2018.
 */
public class Sub extends Super {


    @Override
    public short plus(short s1, short s2) {
        return super.plus(s1, s2);
    }

    public float plus(float s1, float s2, float s3) {
        this.plus(s1, s2, s3);
         //super.plus(s1, s2);
double d = 5;
        float f = 7;
        double j = d + f;
        char k = 4;
        k = k++;

        return  s1 + s2 + s3;
    }

    public double plus(int s1, int s2, int s3) {
        // return super.plus(s1, s2);

        return  s1 + s2 + s3;
    }
}
