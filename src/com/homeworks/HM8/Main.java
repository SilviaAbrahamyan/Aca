package com.homeworks.HM8;

import java.io.*;

import java.util.List;



/**
 * Created by home on 10/20/2018.
 */
public class Main {
    public static void main(String... args) {
        InputStream inputStream = null;
        Reader inputStreamReader = null;
        BufferedReader br = null;
        String[] words;
        Table table = null;
        ArrayList arrayList = new ArrayList();
        ArrayList sortedList = new ArrayList();
        ArrayList searchedList = new ArrayList();
        Sorting sorting = null;
        Searching searching = null;
        int id = -1;
        try {
            inputStream = new FileInputStream("C:\\tableToJsonandXMLformat\\table.csv");
            inputStreamReader = new InputStreamReader(inputStream);
            br = new BufferedReader(inputStreamReader);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println("Line entered : " + line);
                words = line.trim().split(",");
                id++;
                table = new Table(id);
                table.add(words);
                //list.add(table);
                arrayList.add(table);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (br != null || inputStream!= null || inputStreamReader!= null) {
                    br.close();
                    inputStream.close();
                    inputStreamReader.close();
                }
            }
	            catch (IOException ioe) {
                System.out.println("Error while closing stream: " + ioe);
            }
        }

        System.out.println("\n");
        System.out.println("\n");

        for(Object obj: arrayList.getElements()){
            Table tab = (Table) obj;
            if(obj instanceof Table){
                System.out.println(tab.toXml());
                System.out.println(tab.toJson());
            }
        }
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("   a      " + "   b       " +  "    c         " + "   d          " + "   e        "  +
                            "  f         " + "   g       " + "   h            " + "   i           " + "   j           "
                + "k              " + "l              " + "m              " + "n              ");

        for(Object obj: arrayList.getElements()){
            Table tab = (Table) obj;
            if(obj instanceof Table){
                System.out.println(tab.toString());
            }
        }
        System.out.println("\n");
        System.out.println("\n");
        sorting = new Sorting(arrayList);
        sortedList = sorting.sortingByName(table.getM());
        for(Object obj: sortedList.getElements()){
            Table tab = (Table) obj;
            if(obj instanceof Table){
                System.out.println(tab.toString());
            }
        }
        System.out.println("\n");
        System.out.println("\n");
        searching = new Searching();
        searchedList = searching.searchingByName(arrayList, "Սերգեյի");
        for(Object obj: searchedList.getElements()){
            Table tab = (Table) obj;
            if(obj instanceof Table){
                System.out.println(tab.toString());
            }
        }
    }
}
