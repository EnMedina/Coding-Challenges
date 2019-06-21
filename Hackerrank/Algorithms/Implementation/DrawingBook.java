package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;
/**
 * https://www.hackerrank.com/challenges/drawing-book/problem
 * @author Enrique Medina
 *
 */
public class DrawingBook {
	public static void main(String[] args) {
		
	}
	
	static int mySolution(int nPages, int page) {
		if(page <= nPages/2) {
			return page/2;
		}
		if(nPages % 2 == 0 ) nPages++;
		return (nPages-page)/2;
	}
}
