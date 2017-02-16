package com.practice.my.book;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintCountNumber {
	
	public static void printCountNumber() {
		Map<Character, Integer> mapNumber = new HashMap<>();
		
		for(int i = 1; i <= 1000; i++) {
			String str = String.valueOf(i);
			char[] chars = str.toCharArray();
			
			for(char c: chars) {
				mapNumber.put(c, mapNumber.containsKey(c) ? mapNumber.get(c) + 1: 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entry = mapNumber.entrySet();
		for(Map.Entry<Character, Integer> e : entry) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		printCountNumber();
	}
}
