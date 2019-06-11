package com.enriquemedina.codingchallenges.hackerrank.algorithms.warmup;
/**
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 * @author medin
 *
 */
public class DiagonalDifference {
	public static void main(String[] args) {
		int[][] arr = new int[][] {{6,2,3},{4,5,6,},{12,8,9}};// Expected 0
		System.out.println(mySolution(arr));
	}
	
	public static int mySolution(int[][] arr) {
		int leftDiagonal = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			leftDiagonal += arr[i][i];
		}
		
		int rightDiagonal = 0 ;
		for(int i = 0 ; i < arr.length ; i++){
			rightDiagonal += arr[i][arr.length - 1 - i];
		}
		
		return Math.abs(leftDiagonal-rightDiagonal);
	}
	
}
