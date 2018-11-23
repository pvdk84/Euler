package pvdk84.euler;

/*
 * What is the smallest positive number that is evenly 
 * divisible by all of the numbers from 1 to 20?
 */

public class Problem5Divisors {

    	public static void main(String[] args) {
		
		System.out.println(solutionToEuler5());
    	}
	
	static int solutionToEuler5() {
		
		int number = 20; // because the number should first of all be divisible by 20
		int top = 19; // because we know steps of 20 are going to be divisible by 20
		int bottom = 11; // because we know numbers 1-10 are divisors of 11-20
		
		
		return findSmallestNumberDivisibleFromTopToBottom(top, bottom, number);
	}
		
	static int findSmallestNumberDivisibleFromTopToBottom(int top, int bottom, int number) {

		while (!isMultipleOfTopToBottom(top, bottom, number)) {
			number += 20; // steps of 20 because it needs to be divisible by 20 anyway
		}

		return number;		
	}

	static boolean isMultipleOfTopToBottom(int top, int bottom, int number) {

		boolean result = false;

		for (int i = top; i >= bottom; i--) {
			if (number % i == 0) {
				result = true;
			} else {
				result = false;
				return result;
			}
		}

		return result;
	}		
}
