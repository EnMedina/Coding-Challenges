package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/angry-professor/problem
 * Rturn whether class is cancelled related to attendance
 * 
 * @author medin
 *
 */
public class UtopianTree {

	public static void main(String[] args) {
		System.out.println(mySolution(2, new int[]{-1,-3,4,2});
	}
	
	public static int mySolution(int k, int[] a) {
        int presentStudents = 0;
        for(int i : a){if(i <= 0) presentStudents++;}
        return presentStudents >= k ? "NO" : "YES";
    }
	
}
