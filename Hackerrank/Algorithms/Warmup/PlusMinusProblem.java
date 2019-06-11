package com.enriquemedina.codingchallenges.hackerrank.algorithms.warmup;
/**
 * Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros.
 * https://www.hackerrank.com/challenges/plus-minus/problem
 * @author medin
 *
 */
public class PlusMinusProblem {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,5,9,0,7,6,4,3,2,4};
		mySolution(arr);

	}
	
	public static void mySolution(int[] arr) {
		float[] percentages = new float[3];
		int[] occurrences = new int[3];
		for(int number : arr) {
			if(number > 0) occurrences[0]++;
			else if(number < 0) occurrences[1]++;
			else occurrences[2]++;
		}

		percentages[0] = ((float)occurrences[0])/((float)arr.length);
		percentages[1] = ((float)occurrences[1])/((float)arr.length);
		percentages[2] = ((float)occurrences[2])/((float)arr.length);

		System.out.println(String.format("%.6f", percentages[0]));
		System.out.println(String.format("%.6f", percentages[1]));
		System.out.println(String.format("%.6f", percentages[2]));

	}
}
