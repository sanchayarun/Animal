package com.qa.runner;

import com.qa.domain.Fishes;
import com.qa.domain.Rabbits;
import com.qa.domain.Snakes;
import com.qa.domain.WildCats;

public class Runner {

	public static void main(String[] args) {

		System.out.println("==========Rabbits==========");
		Rabbits Rex = new Rabbits();
		Rex.updateInfo("mammals", "herbivores", "small");
		Rex.food("mostly hay, fresh vegetables and pellets");
		Rex.noise();
		Rex.lifeSpan(8);
		Rex.weight(3.5);
		
		System.out.println("==========Snakes==========");
		Snakes Cobra = new Snakes();
		Cobra.updateInfo("reptiles", "carnivores", "small");
		Cobra.growth(2.0);
		Cobra.noise();
		Cobra.lifeSpan(24);
		Cobra.weight(3);
		
		System.out.println("==========Fishes==========");
		Fishes Salmon = new Fishes();
		Salmon.updateInfo("fish", "omnivores", "small");
		Salmon.distance(1500);
		Salmon.noise();
		Salmon.lifeSpan(7);
		Salmon.weight(5.5);

		System.out.println("==========Wild Cats==========");
		WildCats Lion = new WildCats();
		Lion.updateInfo("mammals", "carnivores", "medium");
		Lion.speed(80);
		Lion.noise();
		Lion.lifeSpan(16);
		Lion.weight(190);
		
		System.out.println("==========Wild Cats==========");
		System.out.println(Rex.toString());
		System.out.println(Cobra.toString());
		System.out.println(Salmon.toString());
		System.out.println(Lion.toString());
		
	}

}
