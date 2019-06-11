package com.enriquemedina.codingchallenges.hackerrank.algorithms.warmup;
/**
 * Given an array of integers, find the sum of its elements
 * https://www.hackerrank.com/challenges/simple-array-sum/problem
 * @author Enrique Medina
 *
 */
public class SimpleArraySum {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		int arrSum = mySolution(new int[]{2,3,4,5,3,22,3,4,5,3,22,3,4,5,3,22,3,4,5,3,22,3,4,5,3,2});
		time = System.currentTimeMillis()-time;
		System.out.println("Solution is " + arrSum + " it took " + time + " ms to calculate");
		
	}
	
	public static int mySolution(int[] arr) {
		int totalSum = 0;
		for(int number : arr) {
			totalSum += number;
		}
		return totalSum;
	}
}
