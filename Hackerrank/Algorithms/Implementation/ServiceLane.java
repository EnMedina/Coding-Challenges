package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/service-lane/problem
 * Return the minimum witdth in an subarray
 * 
 * @author MedinaEn
 *
 */
public class ServiceLane {

	public static void main(String[] args) {
		System.out.println(mySolution(2, new int[]{{0,3}{1,4}});
	}
	
	public static int mySolution(int n, int[][] cases) {
        int[] minDistances = new int[cases.length];
        for(int i = 0 ; i < cases.length ; i++){
            int tempMin = 3;
            for(int j = cases[i][0]; j <= cases[i][1]; j++){
                tempMin = Math.min(tempMin,width[j]);
                if(tempMin == 1) break;
            }
            minDistances[i] = tempMin;
        }
        return minDistances;
    }

	
}




