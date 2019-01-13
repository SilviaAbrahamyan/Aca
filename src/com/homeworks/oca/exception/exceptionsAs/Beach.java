package com.homeworks.oca.exception.exceptionsAs;

import java.io.IOException;

/**
 * Created by home on 10/24/2018.
 */
public class Beach {
    class TideException extends Exception {}
    public void surf() throws RuntimeException {

        try {
            throw new TideException();
        } catch (RuntimeException | TideException t ) {
            t.printStackTrace();
        }

    }
}

