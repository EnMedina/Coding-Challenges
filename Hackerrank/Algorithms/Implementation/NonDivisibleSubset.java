package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/non-divisible-subset/problem
 * Return the highest nondivisible subset
 * 
 * @author medin
 *
 */
public class NonDivisibleSubset {

	public static void main(String[] args) {
		System.out.println(mySolution(3, new int[]{1,7,2,4}));
	}
	
	public static int mySolution(int k, int[] S) {
        int[] remainders = new int[k];
        for(int i = 0 ; i < S.length ; i++){
            remainders[S[i]%k]++;
        }
        // In the case of S[i]%k == 0 we can only afford 1
        if(remainders[0] > 1 ) remainders[0] = 1;
        // In the case of S[i]%k * 2 == k and we can only afford 1
        if(k%2 == 0 && remainders[k/2] > 1) remainders[k/2] = 1;

        // Add the longest of the complementing numbers
        int answer = remainders[0];
        for(int i = 1 ; i <= remainders.length/2 ; i++){
            answer += Math.max(remainders[i],remainders[remainders.length - i]);
        }
        return answer;
    }
	
}
