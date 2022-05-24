package com.via.datastruct;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * @author hunchmen
 *
 */
@RunWith(JUnit4.class)
public class RecursionTest {

	@Test
	public void test1() {
		Recursion.openRussionDoll(5);
		assertEquals(Recursion.openRussionDoll(5), "5 dolls are opened");
		
	}
	
	@Test
	public void test2() {
		Recursion.openRussionDoll(1);
		assertEquals(Recursion.openRussionDoll(1), "All dolls are opened");
	}
	
	// factorial using recursive solution
	@Test
	public void test3() {
		assertEquals(Recursion.powerOfTwo(5), 32);
	}
	
	// factorial iterative
	@Test
	public void test4() {
		assertEquals(Recursion.powerOfTwoIT(5), 32);
	}
	
	@Test
	public void test5() {
		Recursion.factorial(3);
		assertEquals(Recursion.factorial(3), 6);
	}
	
	// Test fibonacci
	@Test
	public void test6() {
		
		assertEquals(2, Recursion.fibonacci(4));;
	}
}
