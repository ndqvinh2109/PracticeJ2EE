package com.practice.my.codility;

import java.util.Arrays;
import java.util.List;

public class BinaryGap {

	public static int solution(int N) {
		// write your code in Java SE 8
		String binaryString = Integer.toBinaryString(N);
		
		List<String> list = Arrays.asList(binaryString.split(""));

		int maxBinaryGap = 0;
	    int currentBinaryGap = 0;
		
		for(String str: list) {
			if(str.equals("0")) {
				currentBinaryGap ++;
			} else {
				maxBinaryGap = currentBinaryGap > maxBinaryGap ? currentBinaryGap: maxBinaryGap;
				currentBinaryGap = 0;
			}
		}
		
		return maxBinaryGap;
	}

	public static void main(String[] args) {
		int n = solution(142);
		System.out.println(n);
	}
}
