package com.via.datastruct.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionInterviewProblemsTest {

	@Test
	public void test1() {
		assertEquals(0, RecursionInterviewProblems.sumOfTwoDigits(-9));
	}

	@Test
	public void test1dot1(){
		assertEquals(3, RecursionInterviewProblems.sumOfTwoDigits(12));
	}

	@Test
	public void test2() {

		assertEquals(8, RecursionInterviewProblems.power(2, 3));
	}

	@Test
	public void test3() {

		assertEquals(4, RecursionInterviewProblems.gcd(8, 4));
	}

	@Test
	public void test4() {

		assertEquals(1010, RecursionInterviewProblems.decimalToBinary(10));
	}
}
