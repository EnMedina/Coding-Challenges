package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/migratory-birds/problem
 * @author medin
 *
 */
public class MigratoryBirds {

	public static void main(String[] args) {
		System.out.println(mySolution(Arrays.asList(new Integer[] {1,4,4,4,5,3})));

	}
	
	private static int mySolution(List<Integer> arr) {
		if(arr == null || arr.size() == 0) return 0;
        int[] occurences = new int[5];
        for(int bird : arr){
            occurences[bird - 1]++;
        }

        int currMax = 0;
        int maxVal = occurences[0];

        for(int i = 1 ; i < 5 ; i++){
            if(maxVal < occurences[i]){
                maxVal = occurences[i];
                currMax = i;
            }
        }

        return currMax+1;
	}
}
