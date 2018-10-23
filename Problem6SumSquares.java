package pvdk84.euler;

/*
* Euler problem 6:
* Find the difference between the sum of the squares of the first 
* one hundred natural numbers and the square of the sum.
*/

public class Problem6SumSquares {

	public static void main(String[] args) {
		
		System.out.println(solutionToEuler6());
    	}

	static int solutionToEuler6() {

		// first, find sum of squares first hundred natural numbers
        	int sumSquares = 0;
        	int i = 1;
        	while (i <= 100) {
            		sumSquares += (i * i);
            		i += 1;
        	}

		// second, find square of sum first hundred natural numbers
        	int squareSum = 0;
        	int j = 1;
        	while (j <= 100) {
            		squareSum += j;
            		j += 1;
        	}
		squareSum = squareSum * squareSum;

        	// third step: find difference between sumSquares and squareSum
        	int result = squareSum - sumSquares;
		return result;
	}
}