package com.homeworks.oca.exception;

import java.io.IOException;

/**
 * Created by home on 10/23/2018.
 */
public class Remember {
    public static void think() throws Exception { // k1
        try {
            throw new Exception();
        } catch (IOException e){

        } catch (Exception e){

        }
    }
    public static void main(String... ideas) throws Exception {
        think();
    }
}
