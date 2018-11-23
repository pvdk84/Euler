package pvdk84.euler;

import java.util.ArrayList;

/**
 * Euler problem 7:
 * What is the 10001st prime?
 */

public class Problem7PrimeFinder {

    	public static void main(String[] args) {
		
		System.out.println(solutionToEuler7());
    	}
	
	static int solutionToEuler7() {
		
		int target = 10001;
		int solution = findNthPrime(target);	
		return solution;
	}

	static int findNthPrime(int target) {

		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2); // we know 2 is prime, as well as 3
		primes.add(3); // we are going to start checking from 3

		while (primes.size() < target) {
			int nextPrime = findNextPrimeInArrayOfPrimes(primes);
			primes.add(nextPrime);
		}
		
		int nthPrime = primes.get(primes.size() - 1);
		return nthPrime;
	}

	static int findNextPrimeInArrayOfPrimes(ArrayList<Integer> primes) {

		boolean primeFound = false; // hypothesis that is going to be verified

		int number = primes.get(primes.size() - 1) + 2; // first odd number after the last prime

		while (!primeFound) {

			for (int divisor : primes) {

				// max divisor for x is sqrt of x, break if greater
				if (divisor > Math.sqrt(number)) { 
					primeFound = true;			
					break;
				}
	
				// if number is evenly divisible, try next odd number
				else if (number % divisor == 0) {
					number += 2;
					break;
				}
			
			}
				
		}
		return number; // the surviving number must be prime
	}
}