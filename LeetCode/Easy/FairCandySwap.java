package com.enriquemedina.leetcode.easy;

import java.util.Arrays;

/**
 * 	https://leetcode.com/problems/fair-candy-swap/submissions/
 *  Distribute fairly candy for two people
 */
public class FairCandySwap{
	public static void main(String[] args) {
	     	System.out.println(Arrays.toString(fairCandySwap(new int[] {1,1}, new int[] {2,2} )));
	}
	
	public static int[] fairCandySwap(int[] A, int[] B) {
	      int sumA = 0;
	      int sumB = 0;
	      
	      for(int i = 0 ; i < A.length ; i++ ) sumA += A[i];
	      for(int i = 0 ; i < B.length ; i++ ) sumB += B[i];
	      
	      
	      Arrays.sort(B);
	      int answer[] = new int[2];
	      
	      for(int i = 0 ; i < A.length ; i++ ){
	        int numToSearch = (sumB-sumA+(2*A[i]))/2;
	        int binSearch = Arrays.binarySearch(B, numToSearch);
	        if(binSearch >= 0){
	          answer[0] = A[i];
	          answer[1] = numToSearch;
	          return answer;
	        }
	      }
	      
	      
	      return answer;
	      
	      
	    }
	
}