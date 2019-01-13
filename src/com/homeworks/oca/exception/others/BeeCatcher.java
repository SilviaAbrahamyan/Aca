package com.homeworks.oca.exception.others;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by home on 11/23/2018.
 */
public class BeeCatcher {
//    public static void main(String... bees) {
//        try (Suit s = new Suit(),Suit t=new Suit() {
//        } catch (IOException e) {
//            e.printStackTrace();
//        }{
//            throw new StungException();
//        } catch(Exception e){
//        } catch(StungException e){
//        } finally{
//        }
//    }
}

class StungException extends Exception {
}

class Suit implements Closeable {
    public void close() throws IOException {
    }
}