package com.homeworks.aca_book.inheritence;

/**
 * Created by home on 10/14/2018.
 */
public class Rodent {
    protected static Integer chew() throws Exception {
    System.out.println("Rodent is chewing");
    return 1;
}
}
 class Beaver extends Rodent {
    public static Integer chew() throws RuntimeException {
        System.out.println("Beaver is chewing on wood");
        return 2;
    }
}