package com.homeworks.oca.exception.exceptionsAs;

import java.util.MissingResourceException;

/**
 * Created by home on 10/24/2018.
 */
public class Step {
//    static {
//        try (Shelf shelf = new Shelf()) {
//throws new IllegalArgumentException();
//        } catch (Exception e) {
//        } catch (IllegalArgumentException e) {
//        } finally {
//            shelf.close();
//        }
//    }

}

interface Closing {
    void close() throws Exception;
}

class Shelf implements Closing {
    public void close() throws Exception {
    }
}