package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * Return the factorial of number n 
 * https://www.hackerrank.com/challenges/extra-long-factorials/problem
 * @author medin
 *
 */
public class ExtraLongFactorials{

	public static void main(String[] args) {
		System.out.println(mySolution(25);
	}
	

    static int mySolution(int n) {
        BigInteger result = new BigInteger("1");
        for(int i = 2 ; i <= n ; i++){
            result = result.multiply(new BigInteger(""+i));
        }
        System.out.println(result.toString());
    }
}
