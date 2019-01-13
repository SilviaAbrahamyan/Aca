package com.homeworks.live.vtable;
public class Main{
	public static void main(String[] args) {
		Base b = new Child();
		Child c = new Child();
		b.foo(5);
		c.foo(3);
		System.out.println(b.x);
		System.out.println(c.x);
	}
}
class Base{
	int x = 10;
	void foo(Integer i){
		System.out.println("Base");
	}
}
class Child extends Base{
	int x = 15;
	void foo(int i){
		System.out.println("Child");
	}
}