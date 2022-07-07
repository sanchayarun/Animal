package com.qa.animal;

public class Snakes extends Animal {

	// Attribute

	private double snakelength;

	// Getter and Setter

	public double getSnakeLength() {
		return this.snakelength;
	}

	public void setSnakeLength(double snakelength) {
		this.snakelength = snakelength;
	}

	// Method

	public void growth(double snlength) {
		setSnakeLength(snlength);
		System.out.println("These snakes can grow up to " + snakelength + "m.");
	}

	// Extended abstract method

	@Override
	public void noise() {
		System.out.println("sssss sssss sssss");

	}

}
