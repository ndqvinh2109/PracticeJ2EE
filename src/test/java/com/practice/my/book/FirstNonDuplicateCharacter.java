package com.practice.my.book;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonDuplicateCharacter {
	
	public static void main(String[] args) {
		printFirstNonDuplicate("Programming");
	}
	
	public static void printFirstNonDuplicate(String str) {
		char[] chars = str.toCharArray();
				
		Map<Character, Integer> mapChar = new LinkedHashMap<>();
		
		for(char c: chars) {
			mapChar.put(c, mapChar.containsKey(c) ? mapChar.get(c) + 1: 1);
		}
		
		for(Map.Entry<Character, Integer> entry: mapChar.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println("First non duplicate character: " + entry.getKey());
				break;
			}
		}
				
 	}
}
