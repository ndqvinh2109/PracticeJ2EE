package com.practice.my.book;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWords {
	private static void printDuplicateWords(String input) {
		
		Map<String, Integer> mapWords = new HashMap<>();
		String [] str = input.split("\\s");
		
		for(String s: str) {
			if(mapWords.containsKey(s)) {
				mapWords.put(s, mapWords.get(s) + 1);
			} else {
				mapWords.put(s, 1);
			}
		}
		
		Set<Map.Entry<String, Integer>> entry = mapWords.entrySet();
		
		for(Map.Entry<String, Integer> e: entry) {
			if(e.getValue() >= 2) {
				System.out.println(e.getKey() + ": " + e.getValue());
			}
		}
		
	} 
	
	public static void main(String[] args) {
		String test = "This sentence contains two words, one and two";
		printDuplicateWords(test);
	}
}
