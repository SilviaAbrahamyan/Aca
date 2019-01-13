package com.homeworks.npua;

import java.io.*;
import java.util.*;

/**
 * Created by home on 10/21/2018.
 */
public class Main1 {
    public static void main(String[ ] args)
    {
        // **THIS CREATES A TREE MAP**
        TreeMap<String, Integer> frequencyData = new TreeMap<String, Integer>();
        Map<String, Set<String>> filenames = new HashMap<String, Set<String>>();
        Map<String, Integer> countByWords = new HashMap<String, Integer>();

        Map[] mapArray = new Map[5];
        mapArray[0] = new HashMap<String, Integer>();

        readWordFile(countByWords, frequencyData, filenames);
        printAllCounts(countByWords, frequencyData, filenames);
    }


    public static int getCount(String word, TreeMap<String, Integer> frequencyData)
    {

        if (frequencyData.containsKey(word))
        {  // The word has occurred before, so get its count from the map
            return frequencyData.get(word); // Auto-unboxed
        }
        else
        {  // No occurrences of this word
            return 0;
        }
    }



    public static void printAllCounts(  Map<String, Integer> countByWords, TreeMap<String, Integer> frequencyData, Map<String, Set<String>> filenames)
    {
        System.out.println("-----------------------------------------------");
        System.out.print("Search for a word: ");

        String worde;
        int result = 0;
        Scanner input = new Scanner(System.in);
        worde=input.nextLine();

        if(!filenames.containsKey(worde)){
            System.out.println("The word does not exist");
        }

        else{
            for(String filename : filenames.get(worde)){


                System.out.println(filename);
                System.out.println(countByWords.get(worde));




            }


        }

        System.out.println("\n-----------------------------------------------");
    }


    public static void readWordFile(Map<String, Integer> countByWords ,TreeMap<String, Integer> frequencyData, Map<String, Set<String>> filenames)
    {
        Scanner wordFile;
        String word;     // A word read from the file
        Integer count; // The number of occurrences of the word
        int counter = 0;

        int docs = 0;

        //**FOR LOOP TO READ THE DOCUMENTS**
        for(int x=0; x<Docs.length; x++)
        { //start of for loop [*

            try
            {
                wordFile = new Scanner(new FileReader(Docs[x]));
            }
            catch (FileNotFoundException e)
            {
                System.err.println(e);
                return;
            }

            while (wordFile.hasNext( ))
            {
                // Read the next word and get rid of the end-of-line marker if needed:
                word = wordFile.next( );

                // This makes the Word lower case.
                word = word.toLowerCase();

                word = word.replaceAll("[^a-zA-Z0-9\\s]", "");

                // Get the current count of this word, add one, and then store the new count:
                count = countByWords.get(word);
                if(count != null){
                    countByWords.put(word, count + 1);
                }



                else{
                    countByWords.put(word, 1);
                }
                Set<String> filenamesForWord = filenames.get(word);
                if (filenamesForWord == null) {
                    filenamesForWord = new HashSet<String>();

                }

                filenamesForWord.add(Docs[x]);
                filenames.put(word, filenamesForWord);
                counter++;
                docs = x + 1;

            }




        } //End of for loop *]
        System.out.println("There are " + counter + " terms in the collection.");
        System.out.println("There are " + docs + " documents in the collection.");

    }


    // Array of documents
    static String Docs [] = {"C:\\temp\\1.txt", "C:\\temp\\2.txt", "C:\\temp\\3.txt", "C:\\temp\\4.txt"};

}
