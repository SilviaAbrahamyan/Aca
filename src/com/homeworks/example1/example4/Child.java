
package com.homeworks.example1.example4;
public class Child extends Base{
	int x = 15;


	int foo(){
		System.out.println("Child");
		return 1;
	}

	Integer foo(int x){
		System.out.println("Child");
		return 1;
	}
}