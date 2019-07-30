package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * Return the minimum amount of loaves to give out
 * https://www.hackerrank.com/challenges/fair-rations/problem
 * @author MedinaEn
 *
 */
public class FairRations {

	public static void main(String[] args) {
		System.out.println(mySolution(12, 58));
	}
	
		
	
	static String mySolution(int[] B) {
        int loaves = 0 ;
        for(int i = 0 ; i < B.length - 1 ; i++){
            if(B[i] % 2 != 0){
                B[i]++;
                B[i+1]++;
                loaves += 2;
            }
        }

        for(int i = B.length - 1 ; i > 0 ; i--){
            if(B[i] % 2 != 0){
                B[i]++;
                B[i-1]++;
                loaves += 2;
            }
        }
        boolean allEven = true;
        for(int i = 0 ; i < B.length && allEven; i++){
            if(B[i]%2 != 0) allEven = false;
        }
        return allEven ? loaves : -1;
    }
}
