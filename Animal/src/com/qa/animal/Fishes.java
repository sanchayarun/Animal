package com.qa.animal;

public class Fishes extends Animal {

		// Attribute

		public int distance;

		// Getter and Setter

		public int getDistance() {
			return this.distance;
		}
		
		public void setDistance(Integer distance) {
			 this.distance = distance;
		
		}
		
		// Method

		public void distance(Integer distance) {
			setDistance(distance);
			System.out.println("These fish migrate over " + distance  + "km" + " to find a mate and reproduce."  );
		}
		
		// Extended Abstract Method
		
		@Override
		public void noise() {
			System.out.println("Gulp Gulp Gulp");
		}
}
