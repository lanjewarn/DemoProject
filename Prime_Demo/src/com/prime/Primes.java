package com.prime;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/** Program for printing prime numbers.
 */
public class Primes {
    public static void main(String[] args) {
    	isPrime(Integer.parseInt(args[0]));
    }

    /** Return true iff num is prime. */
    public static boolean isPrime(int num) {
    	int temp;
    	boolean isPrime=true;
    	for(int i=2;i<=num/2;i++)
    	{
           temp=num%i;
    	   if(temp==0)
    	   {
    	      isPrime=false;
    	      break;
    	   }
    	}
    	//If isPrime is true then the number is prime else not
    	if(isPrime)
    	   System.out.println(num + " is a Prime Number");
    	else
    	   System.out.println(num + " is not a Prime Number");
		return isPrime;
		}
}