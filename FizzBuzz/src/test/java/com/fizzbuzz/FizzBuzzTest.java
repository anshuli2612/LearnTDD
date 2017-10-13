package com.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzBuzzObj;

	public FizzBuzzTest() {
	}

	@Before
	public void setUp() throws Exception {
		fizzBuzzObj = new FizzBuzz();
	}

	@Test
	public void should_return_fizz_number_dividable_by_3() {	
		
		assertEquals("fizz", fizzBuzzObj.checkNaturalNumber(6));
	}
	
	@Test
	public void should_return_fizz_number_dividable_by_5() {
		
		assertEquals("buzz", fizzBuzzObj.checkNaturalNumber(10));
	}

	@Test
	public void should_return_fizz_number_dividable_by_15() {
		
		assertEquals("fizzbuzz", fizzBuzzObj.checkNaturalNumber(30));
	}
	
	@Test
	public void should_return_same_number_if_not_dividable_by_3or5or15() {
		
		assertEquals("28", fizzBuzzObj.checkNaturalNumber(28));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void should_throw_exception_if_number_is_zero() {
		
		fizzBuzzObj.checkNaturalNumber(0);
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throw_exception_if_number_is_negative() {
		
		fizzBuzzObj.checkNaturalNumber(-10);
	}

}
