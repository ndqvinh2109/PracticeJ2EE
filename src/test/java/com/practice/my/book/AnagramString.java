package com.practice.my.book;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class AnagramString {

	public boolean isAnagram(String input, String anagramInput) {

		char[] charFromInput = input.toCharArray();
		char[] charFromAnagramInput = anagramInput.toCharArray();

		Arrays.sort(charFromInput);
		Arrays.sort(charFromAnagramInput);

		return Arrays.equals(charFromInput, charFromAnagramInput);
	}

	@Test
	public void testCaseAnagramString() {
		Assert.assertTrue(isAnagram("Vinh", "iVnh"));
		Assert.assertTrue(isAnagram("a", "a"));

		Assert.assertFalse(isAnagram("Vinh", "iVh"));
		Assert.assertFalse(isAnagram("Vih", "Vinh"));
	}
	
	@Test
	public void testCaseAnagramString2() {
		Assert.assertTrue(isAnagram2("Vinh", "iVnh"));
		Assert.assertTrue(isAnagram2("a", "a"));

		Assert.assertFalse(isAnagram2("Vinh", "iVh"));
		Assert.assertFalse(isAnagram2("Vih", "Vinh"));
	}

	public boolean isAnagram2(String input, String anagramInput) {

		char[] charFromInput = input.toCharArray();

		StringBuilder stringBuilder = new StringBuilder(anagramInput);

		for (char c : charFromInput) {
			int index = stringBuilder.indexOf("" + c);
			if (index != -1) {
				stringBuilder.deleteCharAt(index);
			} else {
				return false;
			}
		}

		return stringBuilder.length() == 0 ? true : false;
	}
}
