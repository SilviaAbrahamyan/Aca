package com.homeworks.aca_book.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by home on 10/28/2018.
 */
public class ShowFile {
    public static void main(String args[])
    {
        int i;
        FileInputStream fin;
        File f = new File("file.exe");
// First, confirm that a filename has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }
// Attempt to open the file.
        try {
            fin = new FileInputStream(f);
        } catch(FileNotFoundException e) {
            System.out.println("Cannot Open File");
            return;
        }
// At this point, the file is open and can be read.
// The following reads characters until EOF is encountered.
        try {
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);
        } catch(IOException e) {
            System.out.println("Error Reading File");
        }
// Close the file.
        try {
            fin.close();
        } catch(IOException e) {
            System.out.println("Error Closing File");
        }
    }
}
