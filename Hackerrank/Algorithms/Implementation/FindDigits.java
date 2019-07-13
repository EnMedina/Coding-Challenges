package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * Count the number of divisors occurring within the integer.
 * https://www.hackerrank.com/challenges/find-digits/problem
 * @author medin
 *
 */
public class FindDigits{

	public static void main(String[] args) {
		System.out.println(mySolution(1120);
	}
	

    static int mySolution(int n) {
        int tempN = n;
        int nDivisors = 0;
        while(tempN != 0){
            int tempDivisor = tempN % 10;
            tempN /= 10;
            if(tempDivisor != 0) nDivisors += n%tempDivisor == 0 ? 1 : 0;
        }
        return nDivisors;
    }
}
