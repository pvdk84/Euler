package euler;

/*
Euler problem 1: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
*/

import java.util.*;

class Problem1Multiples {
	
	
	public static void main(String[] args) {

        	System.out.println(solutionToEuler1());
	} 

	
	static int solutionToEuler1() {
		
		int number1 = 3;
		int number2 = 5;
		int limit = 1000;
	
		return sum(findMultiples(number1, number2, limit));
    	
	}
	
	
	static int sum(ArrayList<Integer> in) {
		
		int sum = 0;

		for (int i : in) {
			sum += i;
		}
		
		return sum;		
	}

	
	static ArrayList<Integer> findMultiples(int number1, int number2, int limit) {
		
		ArrayList<Integer> multiples = new ArrayList<Integer>();

		for (int i = 0; i < limit; i++) {

			if ((i % number1 == 0) || (i % number2 == 0)) {
                multiples.add(i);
            }
        }
		
        return multiples;				
	}
}
