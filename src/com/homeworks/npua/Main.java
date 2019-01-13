package com.homeworks.npua;

import java.io.*;
import java.util.*;

/**
 * Created by home on 9/22/2018.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert words");
        File f = null;
        BufferedReader br = null;
        String strLine = "";
        Set<String> uniqueWordFromAllDoc = new HashSet<>();
        Map<String, Doc> map = new HashMap<>();
        Map<String, Integer> result1 = new HashMap<>();
        String result = "";
        String[] words = scanner.nextLine().split("\\s+");
        for (int j = 0; j < words.length; j++) {
            uniqueWordFromAllDoc.add(words[j]);
        }
        for (int i = 1; i <= 4; i++) {
            Doc d = new Doc("Doc" + i);
            br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\temp\\" + i + ".txt")));
            while ((strLine = br.readLine()) != null) {
                d.put(strLine);
            }

            map.put(d.getName(), d);
        }
        for (String uniqueWord : uniqueWordFromAllDoc) {
          //  System.out.print(uniqueWord + " ");
            result = result +" " + uniqueWord;
            for (String docName : map.keySet()) {
                if (map.get(docName).getArray().containsKey(uniqueWord.toLowerCase())) {

                    if (result1.containsKey(docName)) {
                        result1.put(docName, result1.get(docName) + 1);
                    } else {
                        result1.put(docName, 1);
                    }
              //   System.out.print(" " + map.get(docName).getName() + "(" + map.get(docName).getArray().get(uniqueWord.toLowerCase()) + ")");
                }

            }
            //System.out.println();
        }

      //  System.out.println();
        System.out.print(result + " ");
        for (String docName : result1.keySet()) {
            if (result1.get(docName) == uniqueWordFromAllDoc.size()) {
                System.out.print(docName +  " ");
            }

        }
        System.out.println();
    }

}



