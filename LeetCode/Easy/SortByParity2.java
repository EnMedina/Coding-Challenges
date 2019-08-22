package com.enriquemedina.codingchallenges.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/sort-array-by-parity-ii/submissions/
 * Return an array with the even elements in even index, odds in odd
 * @author MedinaEn
 *
 */
class Solution {
	public int[] sortArrayByParityII(int[] A) {
		int wrongOddI  = 1;
		for( int i = 0 ; i < A.length -1 ; i+=2 ){
			if(A[i]%2 == 1){
				while(wrongOddI < A.length && A[wrongOddI]%2 == 1){
					wrongOddI+=2;
				}
				int temp = A[wrongOddI];
				A[wrongOddI] = A[i];
				A[i] = temp;
			}
		}
		return A;
	}
}
