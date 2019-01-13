package com.homeworks.aca_book.test;

/**
 * Created by home on 10/5/2018.
 */
public class Test138 {
    double f1 = 1.0;

    public static void stringReplace (String text)
    {
        text = text.replace ('j' , 'c'); /* Line 5 */
    }
    public static void bufferReplace (StringBuffer text)
    {
        text = text.append ("c");  /* Line 9 */
    }
    public static void main (String args[])
    {
        String textString = new String ("java");
        StringBuffer textBuffer = new StringBuffer ("java"); /* Line 14 */
        stringReplace(textString);
        bufferReplace(textBuffer);
        System.out.println (textString + textBuffer);

        float f = 1;




        try
        {
            int x = 0;
            int y = 5 / x;
        }
        catch (Exception e)
        {
            System.out.println("Exception");
        }
        System.out.println("finished");


        {
            int x= 0;
            int y= 0;
            for (int z = 0; z < 5; z++)
            {
                if (( ++x > 2 ) || (++y > 2))
                {
                    x++;
                }
            }
            System.out.println(x + " " + y);
        }
    }
}
