package com.homeworks.aca_book;

import com.homeworks.aca_book.inheritence.A;

/**
 * Created by home on 10/5/2018.
 */
public class UserInput {


    float i = 9.0f;

    Object c = new A(3,5);

    static String TextValue = new String("");
    public static class TextInput {
        public void add(char letter) {
            TextValue = new String (TextValue.toString() + letter);
        }

        public static String getValue() {
            return TextValue;
        }
    }

    public static class NumericInput extends TextInput {
        public void add(char letter) {
            if (letter >= '0' && letter <= '9') {
                TextValue = new String (TextValue.toString() + letter);
            }
        }
    }

    public static void main(String[] args) {


        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');

        

    }



    void foo()throws ClassNotFoundException{

    }
}
