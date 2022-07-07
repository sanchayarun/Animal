package com.qa.domain;

public class WildCats extends Animal {

	// Attribute

	public int speed;

	// Getter and Setter

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	// Method

	public void speed(Integer speed) {
		setSpeed(speed);
		System.out.println("These lions can reach up to " + speed + "km/h, in short bursts.");
	}

	// Extended Abstract Method

	@Override
	public void noise() {
		System.out.println("Graaaaauuuuuu!");
	}
}
