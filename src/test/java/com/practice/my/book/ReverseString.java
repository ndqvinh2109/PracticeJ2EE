package com.practice.my.book;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseString {

	public static void reverseStringUsingStringBuilder(String input) {
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		input1.reverse();

		for (int i = 0; i < input1.length(); i++) {
			System.out.println(input1.charAt(i));
		}
	}
	
	public static void reverseStringUsingToCharArray(String input) {
		char[] chars = input.toCharArray();
		
		List<Character> list = new LinkedList<>();
		for(char c: chars) {
			list.add(c);
		}
		Collections.reverse(list);

		list.stream().forEach(c -> System.out.println(c));
	}
	
	public static void main(String[] args) {
		String input = "TMONAwesome";
		reverseStringUsingStringBuilder(input);
		
		//reverseStringUsingToCharArray(input);
		
	}
	
	
}
