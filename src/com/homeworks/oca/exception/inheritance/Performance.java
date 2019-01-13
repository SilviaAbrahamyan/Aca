package com.homeworks.oca.exception.inheritance;

/**
 * Created by home on 10/28/2018.
 */
public class Performance implements SpeakDialogue,SingMonologue{
    public int talk(String... x) {
        return x.length;
    }
    public static void main(String[] notes) {
        System.out.print(new Performance().talk(notes));
    }

    @Override ///petqa lini
    public int talk() {
        return 0;
    }
}
interface SpeakDialogue  { default int talk() { return 7; } }
interface SingMonologue { default int talk() { return 5; } }