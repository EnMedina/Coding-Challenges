package com.enriquemedina.codingchallenges.hackerrank.algorithms.warmup;

/**
 * Calculate the maximum and min sum from 4 out of 5 ints
 * @author medin
 *
 */
public class MinMaxSum {

	public static void main(String[] args) {
		mySolution(new int[] {1,3,5,7,9});
	}
	
	public static void mySolution(int[] arr) {
		int minVal = Integer.MAX_VALUE;
		int maxVal = Integer.MIN_VALUE;
		int sum = 0;
		for(int i : arr) {
			minVal = Math.min(minVal, i);
			maxVal = Math.max(maxVal, i);
			sum += i;
		}
		
		System.out.println("The maximum sum is " + (sum-minVal));
		System.out.println("The minimum sum is " + (sum -maxVal));
		
	}

}
