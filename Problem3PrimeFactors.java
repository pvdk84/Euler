package pvdk84.euler;

/*
 * Euler problem 3:  
 * What is the largest prime factor of the number 600851475143?
 */

import java.util.*;
import java.math.*;

public class Problem3PrimeFactors {
	
	
	public static void main (String[] args) {
		
		System.out.println(solutionToEuler3());
	} 

	
	static long solutionToEuler3() {
		
		long number = 600851475143L;
		
		long answer = Collections.max(findPrimeFactors(number));
	
		return answer;
	}
	
	
    	static ArrayList<Long> findPrimeFactors(long number) {
		
		if (number < 4) {
			throw new IllegalArgumentException(String.format("No prime factors for %s", number));
        	}

		ArrayList<Long> primeFactors = new ArrayList<>();
		
		while (number > 1) {
			long factor = findSmallestFactor(number);
			primeFactors.add(factor);
			number = number / factor;			
		}

        	return primeFactors;
    	}
	
	
	static long findSmallestFactor(long number) {
		
		int max = (int) Math.sqrt(number);
		
		for (int i = 2; i <= max; i++) {
			if (number % i == 0)
				return i;
		}
		
		return number;
	}
}
