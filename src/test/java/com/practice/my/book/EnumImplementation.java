package com.practice.my.book;


public class EnumImplementation {
	public static final EnumImplementation BIG = new EnumImplementation("BIG", 0);
	public static final EnumImplementation HUGE = new EnumImplementation("HUGE", 1);
	public static final EnumImplementation OVERWHELMING = new EnumImplementation("OVERWHELMING", 2);
	
	public EnumImplementation(String enumName, int index) {
		
	}
	
	public static void main(String[] args) {
		EnumImplementation coffeeSize = EnumImplementation.BIG;
	}
}
