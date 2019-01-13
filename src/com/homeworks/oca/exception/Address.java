package com.homeworks.oca.exception;

/**
 * Created by home on 10/23/2018.
 */
public class Address {
    public String getAddress(String street, String city) {
        try {
            return street.toString() + ":" + city.toString();
        } finally {
            System.out.print("Posted");
        }
    }

    public static void main(String[] form) {
                String street = "1";// value omitt
                String city = "";// value omitt

                System.out.print(new Address().getAddress(street, city));
    }
}
