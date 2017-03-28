package edu.info448.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.walk();

		Dog[] pups = Dog.createPuppies(3);
		System.out.println(Arrays.toString(pups));

		Husky husky = new Husky("Max");
		husky.bark();

		//dog.pullSled();

		Dog v1 = new Husky("Jimmy");
		//Husky v2 = new Dog();
		Huggable v2 = new Husky("Carl");
		Huggable v3 = new TeddyBear();
		//Husky v4 = new TeddyBear();

		GiftBox<Husky> huskyBox = new GiftBox(new Husky("Jill"));
	}
}