package euler;

/*
Euler problem 2: By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/

public class Problem2Fibonacci 
{
    
    public static void main(String[] args) 
    {
        System.out.println(solutionToEuler1());
    }
    
    public static int solutionToEuler1()
    {
        int limit = 4000000;
        return findSumFibonacciEven(limit);
    }

    public static int findSumFibonacciEven(int limit) 
    {
        int a = 0;
        int b = 1;
        int sum = 0;

        while (b <= limit) 
        {
            if (b % 2 == 0) 
            {
                sum += b;
            }
            b = a + b;
            a = b - a;
        }
        return sum;
    }
}