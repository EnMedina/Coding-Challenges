package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 * @author medin
 *
 */
public class BreakingRecords {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(mySolution(new int[]{10,5,20,20,4,5,2,25,1})));
	}
	
	public static int[] mySolution(int[] arr) {
		if(arr == null || arr.length <= 1) return new int[] {0,0};
		int currMin = arr[0];
		int currMax = arr[0];
		int brokenMin = 0;
		int brokenMax = 0;
		for(int i = 1 ; i < arr.length ; i++) {
			if(arr[i] < currMin) {
				currMin = arr[i];
				brokenMin++;
			} else if(arr[i] > currMax) {
				currMax = arr[i];
				brokenMax++;
			}
		}
		return new int[] {brokenMax,brokenMin};
	}

}
