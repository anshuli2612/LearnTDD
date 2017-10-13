package com.fizzbuzz;

public class FizzBuzz {

	public String checkNaturalNumber(int inputNaturalNumber) {
		
		if( inputNaturalNumber <= 0 ){
			
			throw new IllegalArgumentException();
		}
		if( inputNaturalNumber%15 == 0 ) {
			
			return "fizzbuzz";
			
		}
		else if( inputNaturalNumber%3 == 0 ){
			
			return "fizz";
			
		} else if ( inputNaturalNumber%5 == 0){
			
			return "buzz";
			
		} else {
			
			return String.valueOf(inputNaturalNumber);
		}
		
		
	}

}
