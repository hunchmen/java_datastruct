package com.via.datastruct.recursion;

import static org.junit.Assert.assertEquals;

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
		assertEquals("5 dolls are opened", Recursion.openRussionDoll(5));
		
	}
	
	@Test
	public void test2() {
		Recursion.openRussionDoll(1);
		assertEquals("All dolls are opened", Recursion.openRussionDoll(1));
	}
	
	// factorial using recursive solution
	@Test
	public void test3() {
		assertEquals(32, Recursion.powerOfTwo(5));
	}
	
	// factorial iterative
	@Test
	public void test4() {
		assertEquals(32, Recursion.powerOfTwoIT(5));
	}
	
	@Test
	public void test5() {
		Recursion.factorial(3);
		assertEquals(6, Recursion.factorial(3));
	}
	
	// Test fibonacci
	@Test
	public void test6() {
		
		assertEquals(2, Recursion.fibonacci(4));;
	}
}
