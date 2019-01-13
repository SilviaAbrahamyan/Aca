package com.homeworks.aca_book.exception;

/**
 * Created by home on 10/12/2018.
 */
public class MyFinalTest {
    int x;

    public int doMethod(){
        try{
            x = 0;
            throw new Exception();
        }
        catch(Exception ex){
            x = 5;
           // return 5;
        }
        finally{
            x = 4;
            return 10;
        }
    }

    public static void main(String[] args) {

        MyFinalTest testEx = new MyFinalTest();
        int rVal = testEx.doMethod();
        System.out.println("The return Val : "+testEx.x);
    }

}
