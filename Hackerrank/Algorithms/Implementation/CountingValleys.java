package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;
/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 * @author medin
 *
 */
public class CountingValleys {
	public static void main(String[] args ) {
		
	}
	
	static int mySolution(int nSteps, String steps) {
		int nValleys = 0;
		int currentHeight = 0;
		for( char c : steps.toCharArray()) {
			currentHeight += c == 'U' ? 1 : -1;
			if(currentHeight  == -1 && c == 'D') nValleys++;
		}
		
		return nValleys;
	}
}
