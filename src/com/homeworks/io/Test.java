package com.homeworks.io;

import java.io.*;

/**
 * Created by home on 10/27/2018.
 */
public class Test {
    public void sendAlert(File fn) {
        try(BufferedWriter w = new BufferedWriter(new FileWriter(fn))) {
            w.write("wRg");
            w.flush();
            w.write('g');
            System.out.print("asrg");
        } catch (IOException e) {
            System.out.print("");
        } finally {
            System.out.print("");
        }
    }
    public static void main(String[] testSignal) throws FileNotFoundException {
        new Test().sendAlert(new File("alarm.txt"));

      Writer  p = new PrintWriter(new File("alarm.txt"));
    }
}
