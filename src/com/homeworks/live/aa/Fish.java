package com.homeworks.live.aa;

public abstract class Fish extends Animal {
	private int fins;

	public Fish(String name, int weight, int speed, int fins) {
		super(name, weight, speed);
		this.fins = fins;
	}

	public void swim() {

	}

	public int getFins() {
		return this.fins;
	}
}
