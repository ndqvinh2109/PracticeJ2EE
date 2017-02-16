package com.practice.my.book;


/**
 * This example is singleton thread safe but it is lazy load
 * @author Quang
 *
 */
public class SingletonStaticField {
	// final because it is thread safe
	private static final SingletonStaticField INSTANCE = new SingletonStaticField();
	private SingletonStaticField() {}
	
	public static SingletonStaticField getInstance() {
		return INSTANCE;
	}
	
	public void show() {
		System.out.println("Test singleton static field");
	}
}
