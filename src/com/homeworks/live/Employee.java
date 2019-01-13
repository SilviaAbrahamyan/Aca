package com.homeworks.live;


import com.homeworks.HM4.Circle;

/**
 * Created by home on 9/20/2018.
 */
public class Employee {

    String name;
    boolean age;

    public Employee() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String args[]){
        Employee emp = new Employee();

        System.out.println(emp.age);
        System.out.println(emp.name);
    }
}
