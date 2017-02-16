package com.practice.my.book;

public class Car {
	private String name;
	private int speed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	
	public Car(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Car() {
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + speed;
		return result;
	}
	
	
	
	
	
	
}
