package com.via.datastruct;

/**
 * @author hunchmen
 *
 */
public class RecursionInterviewProblems {
	
	/** Problem 1:
	* How to find the sum of digits of a positive integer number using recursion?
	* Step 1: Recursive case - the flow:
	* 10 10/10 = 1 and remainder = 0
	* 54 54/10 = 5 and remainder = 4
	* 112 112/10 = 11 and remainder = 2
	*     11/10 = 1 and remainder = 1
	*
	* Step 2: Base condition: n = 0
	*
	* Step 3: Unintentional case:
	* - sumOfDigits(-11)
	* - sumOfDigits(1.5)
	*/ 
	
	
	// Solution
	static int sumOfTwoDigits(int n) { 
		
		
		// check base condition and handles negative number
		if (n == 0 || n < 0) {
			return 0;
		}
		
		System.out.println(n%10 + sumOfTwoDigits(n/10));
		return n%10 + sumOfTwoDigits(n/10);
	}
	
	/**
	 * Problem 2:
	 * How to calculate power of a number using recursion?
	 * 
	 * Step 1: Recursive case - the flow:
	 * x^4 = x*x*x*x
	 * 2^4 = 2*2*2*2
	 *  
	 * Step 2: Base case - the stopping criterion
	 * n = 0
	 * n = 1 
	 *  
	 */	
	
	//Solution
	static int power(int base, int exponent) {
		
		// handles the negative number
		if(exponent < 0) {
			return -1;
		}
		
		if(exponent == 0 || exponent == 1) {
			return base;
		}
		
		return base * power(base, exponent-1);
	}
	
	/**
	 * Problem 3: 
	 * How to find GCD(Greateast Common Divisor) of 2 numbers using recursion
	 *
	 * Step 1: Recursive case - the flow:
	 * gcd(8,12)  
	 * 8 = 2*2*2
	 * 12 = 2*2*3
	 * 
	 * Euclidean algorithm
	 * gcd(48, 18)
	 * 	Step 1: 48/18 = 2 remainder 12
	 * 	Step 2: 18/12 = 1 remainder 6
	 * 	Step 3: 12/6 = 2 remainder 0
	 * 
	 * Step 2: Base case - case that will handle the infinite loop
	 * b = 0
	 * 
	 */
	
	// Solution
	static int gcd(int a, int b) {
		
		// handles negative number
		if( a < 0 || b < 0) {
			return -1;
		}
		
		if(b == 0) {
			return a;
		}
		
		return gcd(b, a%b);
	}
	
	/**
	 * Problem 4:
	 * How to convert a number from Decimal to Binary using recursion
	 * 
	 * Step 1: Recursive case - the flow
	 * 		Step 1: Divide the number by 2
	 * 		Step 2: Get the integer quotient for the next iteration
	 * 		Step 3: Get the remainder for the binary digit
	 * 		Step 4: Repeat the steps until the quotient is equal to zero
	 * 
	 * Step 2: Base condition
	 * 		
	 * 
	 */

	// Solution
	static int decimalToBinary(int n) {
		
		if(n == 0) {
			return 0;
		}
		
		return n % 2 + 10 * decimalToBinary(n/2);
	}
	
}
