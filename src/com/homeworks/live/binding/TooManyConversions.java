package com.homeworks.live.binding;

/**
 * Created by home on 10/3/2018.
 */
public class TooManyConversions {
  //  public static void play(Long l) { }
   public static void play(Object l) { }
    //public static void play(Long... l) { }
    public static void main(String[] args) {
        play(4l); // DOES NOT COMPILE
        play(4L); // calls the Long version
    }
}
