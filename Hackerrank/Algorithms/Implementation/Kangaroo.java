package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * Print YES if they can land on the same location at the same time; otherwise, print NO.
 * https://www.hackerrank.com/challenges/kangaroo/problem
 * @author medin
 *
 */
public class Kangaroo {

	public static void main(String[] args) {
		System.out.println(mySolution(0,2,5,3));

	}
	
	static String mySolution(int x1, int v1, int x2, int v2) {
		 if(v2 == v1) return "NO";
	     return ((x1-x2)%(v2-v1)) == 0 && (x1-x2)/(v2-v1) > 0 ? "YES" : "NO";
	}

}
