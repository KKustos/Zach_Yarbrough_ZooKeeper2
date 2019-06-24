package com.codingdojo.zookeeper;

public class Bat extends Mammal {
	public Bat() {
		this.energyLevel = 300;
	}
	public void fly() {
		this.energyLevel -= 50;
		System.out.println("Uses Fly: Its super effective! Energy decreased by 50");
		displayEnergy();
	}
	public void eatHumans() {
		this.energyLevel += 25;
		System.out.println("Uses Consume: Its super effective! Energy increased by 25");
		displayEnergy();
	}
	public void attackTown() {
		this.energyLevel -= 100;
		System.out.println("Uses Flame: Its super effective! Energy decreased by 100");
		displayEnergy();
	}
}
