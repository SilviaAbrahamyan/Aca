package com.homeworks.oca.exception.others;

/**
 * Created by home on 11/23/2018.
 */
public class Exam {
    boolean pass;
    protected boolean passed() {
        return pass;
    }
}
class JavaProgrammerCert extends Exam {
    private Exam oca;
    private Exam ocp;
// assume getters and setters are here
public boolean passed() { return super.passed(); }
}