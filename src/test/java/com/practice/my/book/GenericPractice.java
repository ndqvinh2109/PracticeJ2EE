package com.practice.my.book;

import java.util.ArrayList;
import java.util.List;

class Animal {
	
}

class Dog extends Animal {
	
}

class Cat extends Animal {
	
}

public class GenericPractice {

	public void addAnimal(List<? super Animal> animals) {
		animals.add(new Dog());
	}
	
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		GenericPractice gp = new GenericPractice();
		gp.addAnimal(animals);
		
		List<Dog> dogs = new ArrayList<>();
	}
}
