package com.practice.my.book;


/**
 * This example is thread safe and lazy load also b/c we did double check in method that using synchronize keyword
 * @author Quang
 *
 */
public class SingletonLazyLoad {
	
	private static SingletonLazyLoad INSTANCE = null;
	
	private SingletonLazyLoad() {}
			
	public static synchronized SingletonLazyLoad getInstance() {
		if(INSTANCE == null) INSTANCE = new SingletonLazyLoad();
		return INSTANCE;
	}
	
	public void show() {
		System.out.println("Test singleton lazy load");
	}
	

}
