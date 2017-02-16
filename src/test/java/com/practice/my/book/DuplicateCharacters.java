package com.practice.my.book;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String str = "Programming";
		
		printDuplicateCharacters(str);
	}
	public static void printDuplicateCharacters(String word) {
		char[] chars = word.toCharArray();
		
		HashMap<Character, Integer> charMap = new HashMap<>();
		
		for(char c : chars) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		

		entrySet.stream()
		.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
		System.out.println();
		for(Map.Entry<Character, Integer> entry: entrySet) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		entrySet.stream().filter(entry -> entry.getValue() > 1)
		.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

	}
}
