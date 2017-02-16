package com.practice.my.book;

public class Fibonacci {

	public static int fibonacciRecursion(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			System.out.print(fibonacciLoop(i) + " ");
		}
	}

	public static int fibonacciLoop(int n) {
		int result[] = { 0, 1 };

		if (n < 2)
			return result[n];
		
		int fibN = 0;
		int fib1 = 0;
		int fib2 = 1;
		for (int i = 2; i <= n; i++) {
			fibN = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibN;
		}
		
		return fibN;
	}

}
