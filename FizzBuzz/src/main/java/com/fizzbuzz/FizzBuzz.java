package com.fizzbuzz;

public class FizzBuzz {

	public String checkNaturalNumber(int i) {
		
		if( i%3 == 0 ){
			
			return "fizz";
			
		} else if ( i%5 == 0){
			
			return "buzz";
		}
		
		return null;
	}

}
