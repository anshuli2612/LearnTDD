package com.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

	public FizzBuzzTest() {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void should_return_fizz_number_dividable_by_3() {
		
		FizzBuzz fizzBuzzObj = new FizzBuzz();
		
		assertEquals("fizz", fizzBuzzObj.checkNaturalNumber(6));
	}
	
	@Test
	public void should_return_fizz_number_dividable_by_5() {
		
		FizzBuzz fizzBuzzObj = new FizzBuzz();
		
		assertEquals("buzz", fizzBuzzObj.checkNaturalNumber(10));
	}


}