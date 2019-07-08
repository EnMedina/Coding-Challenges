package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * Longest subarray with difference of 1
 * https://www.hackerrank.com/challenges/picking-numbers/problem
 * @author medin
 *
 */
public class PickingNumbers {

	public static void main(String[] args) {
		List<Integer> valueList = Arrays.asList(1,4,5,6,7,8,9,4,2,1,3,4,6,8,9,7,6,5,4,3,2,1,3,4,5,6,7);
		ArrayList<Integer> a = new ArrayList<>();
		a.addAll(valueList);
		System.out.println(mySolution(a));

	}
	
	public static int pickingNumbers(List<Integer> a) {
        int[] occurrences = new int[99];
        for(int i : a){
            occurrences[i-1]++;
        }
        int maxPair = 0;
        for(int i = 0 ; i < 98 ; i++){
            maxPair = Math.max(maxPair, occurrences[i]+occurrences[i+1]);
        }
        return maxPair;
    }
}
