package com.homeworks.oca.exception.io;

import java.io.*;

/**
 * Created by home on 11/13/2018.
 */
public class Guitar {
        public void readMusic(File f) throws IOException {
            try (BufferedReader r = new BufferedReader(new FileReader(f))) {
                String music = null;
                try {
                    while((music = r.readLine()) != null)
                        System.out.println(music);
                } catch (IOException e) {}
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } finally {}
    }
}
