package com.homeworks.oca.exception.exceptionsAs;

/**
 * Created by home on 10/24/2018.
 */
public class SpellChecker {
    public final static void main(String... participants) {
        try {
            if(!"c".equals("k")) {
                new SpellingException();
            }
        } catch (SpellingException | NullPointerException e) {
            System.out.println("6");
        } catch (Exception e) {
            System.out.println("wer");
        } finally {
            System.out.println("erag");
        }
    }
}
class SpellingException extends RuntimeException {}