package com.homeworks.live.aa;

public class Shark extends Fish {
	public Shark(String name, int weight, int speed, int fins) {
		super(name, weight, speed, fins);
	}

	@Override
	public void eat() {
		System.out.println("Shark is eating");
	}
}
