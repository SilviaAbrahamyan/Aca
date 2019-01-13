package com.homeworks.oca.exception.io;

import java.io.Serializable;

/**
 * Created by home on 11/13/2018.
 */
public class Employee extends superEmployee {
    public String firstName;
    private  final long serialVersionUID = 5462223600l;
}

class superEmployee implements Serializable {
    public String lastName;
    static String companyName ;
    transient String address ;
    static transient String companyCEO ;
}
