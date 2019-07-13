package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * Complete the permutationEquation function
 * https://www.hackerrank.com/challenges/permutation-equation/problem
 * @author medin
 *
 */
public class PermutationEquation{

	public static void main(String[] args) {
		System.out.println(mySolution(new int[]{4,3,5,1,2});

	}
	

    static int mySolution(int[] p) {
        int[] ppy = new int[p.length];
        for(int i = 0 ; i < p.length ; i++){
            ppy[p[p[i]-1]-1] = i+1; 
        }
        return ppy;
    }
}
