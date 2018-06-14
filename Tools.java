package euler;

/*
Some useful stand-alone tools from the euler problems.
*/

import java.util.ArrayList;

public class Tools {
    
    public static void main(String[] args) {
		
    }

    // returns the sum of an int arraylist
    public static int sum(ArrayList<Integer> in) {
		
        int sum = 0;
        
        for (int i : in) {
            sum += i;
        }
        
        return sum;
    }

    // returns an arraylist with fibonacci ints below limit
    public static ArrayList<Integer> fibonacci(int limit) {
        ArrayList<Integer> fib = new ArrayList<Integer>();
        
        int a = 0;
        int b = 1;
        
        fib.add(a);
        fib.add(b);

        while ((a + b) < limit) {
            a = a + b;
            fib.add(a);
            b = a + b;
            if (b < limit) {
                fib.add(b);
            } else {
                break;
            }
        }
        return fib;
    }
	
	// finds primes below int limit
    public static ArrayList<Integer> primeSieve (int limit) {
		
		// initialize arraylist where all the primes are going to be stored
		ArrayList<Integer> primes = new ArrayList<>();
		
		// initialize boolean array where false is going to denote primality
		boolean[] isNotPrime = new boolean[limit];
        isNotPrime[0] = true; // because 0 is not prime
        isNotPrime[1] = true; // because 1 is not prime	
		
        // check every number > 1 for primality
        for (int i = 2; i < limit; i++) {
            
            // if isNotPrime[i] is not set to true
            if (isNotPrime[i] == false) {
                
                // then i must be prime
                primes.add(i);

                // and all subsequent multiples of i can be set to true
                for (int j = i+i; j < limit; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
		
        return primes;
    }
}
