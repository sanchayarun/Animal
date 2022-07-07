package com.qa.animal;

public abstract class Animal implements Age, Size{

	// Variables

	private String animalclass;
	private String diet;
	private String size;

	// Getters and Setters

	public String getAnimalClass() {
		return this.animalclass;
	}

	public void setAnimalClass(String animalclass) {
		this.animalclass = animalclass;
	}

	public String getDiet() {
		return this.diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	// Methods

	public void type() {
		System.out.println("These are " + size + " size " + animalclass + " known to be " + diet + ".");
	}

	public void updateInfo(String animalclass, String diet, String size) {
		setAnimalClass(animalclass);
		setDiet(diet);
		setSize(size);
		type();
	}

	// Abstract Method
	// Has to be used in all Classes that extend this (Animal) class.
	
	public abstract void noise();

	// Interface Methods 
	
	// As this is an Abstract class you don't have to use all the interface methods, 
	// you can pick then when extended to the other classes they have access to those methods
	
	@Override
	public void lifeSpan(double years) {
		System.out.println("These animals can live up to " + years + " years.");
	}
	
	@Override
	public void weight(double weight) {
		System.out.println("These animals can grow up to " + weight + "kg." );
	
		
	// The weightPounds() method was not implemented as an example.
	}
}
