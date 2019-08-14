package com.enriquemedina.codingchallenges.leetcode.algorithms.easy;

/**
 *  https://leetcode.com/problems/n-repeated-element-in-size-2n-array/submissions/  
 *  Return the number that is repeated N+1 times on an 2N Size array 
 *  @author Emedina
 *
 */
public class NRepeatedElement{

	public static void main(String[] args) {
		System.out.println(mySolution(new int[]{1,2,3,3}));
	}



	static int mySolution(TreeNode root){
		Set<Integer> seen = new HashSet<>();
		int answer = -1;
		for(int i = 0 ; answer == -1 && i < A.length ; i++ ){
			if(seen.contains(A[i])) answer = A[i];
			seen.add(A[i]);
		}
		return answer;
	} 

}
