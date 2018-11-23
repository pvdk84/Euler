package pvdk84.euler;

/*
 * Euler problem 4: 
 * Find the largest palindrome made from 
 * the product of two 3-digit numbers.
 */

public class Problem4Palindrome {

	
	public static void main (String[] args) {
		
		System.out.println(solutionToEuler4());
	} 

	
	static int solutionToEuler4() {
		
		int startNumber1 = 999;
		
		int startNumber2 = 999;
		
		int start = 999*999;
		
		int answer = findLargestPalindrome(startNumber1, startNumber2);
	
		return answer;
	}
	
	
	static int findLargestPalindrome(int number1, int number2) {
		
		int largestPalindrome = 0;

        	int product;

        	while (number1 >= 100) {
            		for (int j = number2; j >= 100; j--) {
				product = number1 * j;
                		if (isPalindrome(product)) {
                    			if (product > largestPalindrome) {
                        			largestPalindrome = product;
                    			}
                		}
            		}
            		number1--;
        	}
		
		return largestPalindrome;
	}

	
	static boolean isPalindrome(int number) {
		
		String numberString = Integer.toString(number);
		String numberStringReverse = new StringBuilder(numberString).reverse().toString();
		
		return numberString.equals(numberStringReverse); 
	}
}
