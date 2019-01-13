package com.homeworks.example1;
public class Audi extends Car{


	public Audi(){
		this(4,5);

		System.out.println("Audi no-argument constructor");
	}
	public Audi(int y, int x){
		super();
		System.out.println("Audi constructor");
	}
}