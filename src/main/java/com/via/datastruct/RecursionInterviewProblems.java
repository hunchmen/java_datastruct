package com.via.datastruct;

/**
 * @author hunchmen
 *
 */
public class RecursionInterviewProblems {
	
	// Problem 1:
	// How to find the sum of digits of a positive integer number using recursion?
	// Step 1: Recursive case - the flow:
	// 10 10/10 = 1 and remainder = 0
	// 54 54/10 = 5 and remainder = 4
	// 112 112/10 = 11 and remainder = 2
	//     11/10 = 1 and remainder = 1
	//
	// Step 2: Base condition: n = 0
	//
	// Step 3: Unintentional case:
	// - sumOfDigits(-11)
	// - sumOfDigits(1.5)
	
	
	// Solution
	static int sumOfTwoDigits(int n) { 
		
		
		// check base condition and handles negative number
		if (n == 0 || n < 0) {
			return 0;
		}
		
		System.out.println(n%10 + sumOfTwoDigits(n/10));
		return n%10 + sumOfTwoDigits(n/10);
	}
}
