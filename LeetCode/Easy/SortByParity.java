package com.enriquemedina.codingchallenges.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/sort-array-by-parity/submissions/ 
 * Return an array with the even elements first and the odd ones afterwards
 * @author MedinaEn
 *
 */
public class SortByParity {

	public static void main(String[] args) {
		System.out.println(mySolution(new int[][]{{3,0,8},{2,4,5},{9,2,6}}));
	}
	
		
	
	static int[] mySolution(int[] A) {
        int pointerOdd  = A.length -1;
        for(int i = 0 ; i < pointerOdd ; i++){
            if(A[i] % 2 == 1){
                while(pointerOdd > i && A[pointerOdd] % 2 == 1){
                    pointerOdd--;
                }
                int temp = A[i];
                A[i] = A[pointerOdd];
                A[pointerOdd] = temp;
            }
        }
        return A;
    }
    
}
