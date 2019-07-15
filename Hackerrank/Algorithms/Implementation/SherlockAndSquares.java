package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-squares/problem
 * Return the number of perfect squares between two numbers
 * @author medin
 *
 */
public class SherlockAndSquares {

	public static void main(String[] args) {
		System.out.println(mySolution(3,9));
	}
	
	public static int mySolution(int a, int b) {
        return (int)(Math.floor((Math.sqrt(b))) - Math.floor(Math.sqrt(a-1))); 
    }
	
}




