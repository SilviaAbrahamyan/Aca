package com.homeworks.live.aa;

public abstract class Animal {
	private int weight;
	private int speed;
	private String name;

	public Animal(String name, int weight, int speed) {
		this.name = name;
		this.weight = weight;
		this.speed = speed;
	}

	public abstract void eat();

	public String getName() {
		return this.name;
	}

	public int getWeight() {
		return this.weight;
	}

	public int getSpeed() {
		return this.speed;
	}
}
