package com.homeworks.oca.exception.inheritance;

import java.io.FileNotFoundException;

/**
 * Created by home on 10/28/2018.
 */
public class InfiniteMath extends ComplexMath{
    public final double secret = 8;
    public static void main(String[] numbers) {
        Math math = new InfiniteMath();
        System.out.print(math.secret);
    }
}
class Math {
    protected void dance() throws FileNotFoundException {}
    public final double secret = 2;
}
class ComplexMath extends Math {
    public final void dance(){

    }
public final double secret = 4;
        }