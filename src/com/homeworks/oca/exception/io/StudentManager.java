package com.homeworks.oca.exception.io;

import java.io.*;

/**
 * Created by home on 11/13/2018.
 */
public class StudentManager {
    public static void main(String[] grades) {
        try (ObjectInputStream ios = new ObjectInputStream(
                new FileInputStream(new File("C://temp//1.txt")))) {
            Student record;
            while ((record = (Student) ios.readObject()) != null) {
                System.out.print(record);
            }
        } catch (EOFException e) {
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Student implements Serializable {
}