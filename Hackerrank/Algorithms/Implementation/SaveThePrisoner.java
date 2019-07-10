package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/save-the-prisoner/problem
 * Return who will get the last candy in a circle
 * 
 * @author medin
 *
 */
public class SaveThePrisoner {

	public static void main(String[] args) {
		System.out.println(mySolution(10,15,2);
	}
	
	public static int mySolution(int nPrisoners, int nSweets, int startI) {
        int moves = nSweets + startI - 1;
        return moves%nPrisoners == 0 ? nPrisoners : moves%nPrisoners;
    }


	
}