package com.homeworks.oca.exception.inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by home on 10/28/2018.
 */
public class HighSchool extends School {
    public int getNumberOfStudentsPerClassroom() throws FileNotFoundException
    {
        return 2;
    }
    public static void main(String[] students) throws IOException {
        School school = new HighSchool();
        System.out.print(school.getNumberOfStudentsPerClassroom());
    }
}

class School {
    public int getNumberOfStudentsPerClassroom(String... students)
            throws IOException {
        return 3;
    }
    public int getNumberOfStudentsPerClassroom() throws IOException {
        return 9;
    }
}