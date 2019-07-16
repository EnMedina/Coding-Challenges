package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/equality-in-a-array/problem
 * Give the minimum number of jumps to end
 * 
 * @author medin
 *
 */
public class EqualityInArray {

	public static void main(String[] args) {
		System.out.println(mySolution(new int[]{0,0,0,0,1,0}));
	}
	
	public static int mySolution(int[] arr) {
        int[] occurrences = new int[100];
        int maxOccurrence = 0;
        for(int i = 0 ; i < arr.length ; i++){
            occurrences[arr[i] - 1]++;
            maxOccurrence = Math.max(maxOccurrence,occurrences[arr[i] - 1]);
        }
        return arr.length - maxOccurrence;
    }
	
}
