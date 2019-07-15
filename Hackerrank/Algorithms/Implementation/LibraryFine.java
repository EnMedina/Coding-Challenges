package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/library-fine/problem
 * Return the calculation for the libary fine
 * @author medin
 *
 */
public class LibraryFine {

	public static void main(String[] args) {
		System.out.println(mySolution(9,6,2015,6,6,2015));
	}
	
	public static int mySolution(int d1, int m1, int y1, int d2, int m2, int y2) {
        if(y1 > y2) return 10000;
        if(y1 == y2 && m1 > m2) return 500 * (m1-m2);
        if(y1 == y2 && m1 == m2 && d1 > d2) return 15 * (d1-d2);
        return 0;
    }
	
}




