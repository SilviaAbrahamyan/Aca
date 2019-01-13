package com.homeworks.oca.exception.others;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by home on 11/22/2018.
 */
public class ExamAnswers {
    private static ExamAnswers instance = new ExamAnswers();
    private List<String> answers = new ArrayList<>();

    public static List<String> getAnswers() {
        return instance.answers;
    }
}

class TestAnswers {
    private static TestAnswers instance = new TestAnswers();
    private List<String> answers = new ArrayList<>();

    public static TestAnswers getTestAnswers() {
        return instance;
    }

    public List<String> getAnswers() {
        return answers;
    }
}
