package com.practice.my.book;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
		Car car1 = new Car("Ferrari", 10);
		Car car2 = new Car("Ferrari2", 10);
		
		Map<Car, Integer> maps = new HashMap<>();
		maps.put(car1, 1);
		maps.put(car2, 2);
		
		Car car3 = new Car("Ferrari", 10);
		
		System.out.println(maps.get(car3));
	}
}
