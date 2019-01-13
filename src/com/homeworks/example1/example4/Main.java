
package com.homeworks.example1.example4;
public class Main{
	public static void main(String[] args) {
		Base b = new Child();
		Child c = new Child();
		b.foo();
		c.foo();
		System.out.println(b.x);
		System.out.println(c.x);
	}
}
