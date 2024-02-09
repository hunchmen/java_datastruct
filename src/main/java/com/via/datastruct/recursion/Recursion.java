package com.via.datastruct.recursion;

/**
 * @author hunchmen
 *
 */
public class Recursion {

	// recursive implementation
	static int powerOfTwo(int n) {
		if (n == 0) {
			return 1;
		} else {
			int power = 2 * powerOfTwo(n - 1);
			return power;
		}
	}

	// iterative implementation
	static int powerOfTwoIT(int n) {
		int i = 0;
		int power = 1;
		while (i < n) {
			power = power * 2;
			i = i + 1;
		}

		return power;
	}

	// sample code for recursion
	static String openRussionDoll(int doll) {
		if (doll == 1) {
			return "All dolls are opened";
		} else {
			openRussionDoll(doll - 1);
			return doll + " dolls are opened";
		}
	}

	// factorial method
	static int factorial(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}

		System.out.println(n);
		return n * factorial(n - 1);
	}

	// Fibonacci - solving using recursion
	static int fibonacci(int n) {

		// handles the negative input
		if (n < 0) {
			return -1;
		}

		if (n == 0 || n == 1) {
			return n;
		}

		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
