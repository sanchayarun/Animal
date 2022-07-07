package com.qa.animal;

public class Rabbits extends Animal {

	// Attribute

	public String rabbitfood;

	// Getter and Setter

	public String getRabbitFood() {
		return this.rabbitfood;
	}
	
	public void setRabbitFood(String food) {
		 this.rabbitfood = food;
	
	}
	
	// Method

	public void food(String food) {
		setRabbitFood(food);
		System.out.println("These rabbits' diet consisits of " + food + "."  );
	}
	
	// Extended Abstract Method
	
	@Override
	public void noise() {
		System.out.println("Squeak Squeak");
	}

	// Extended Interface Method
	
	
	}


