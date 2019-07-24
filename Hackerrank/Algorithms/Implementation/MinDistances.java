package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * Find the minimum distance from two equal elements in an array
 * https://www.hackerrank.com/challenges/minimum-distances/problem
 * @author medin
 *
 */
public class MinDifference {

	public static void main(String[] args) {
		System.out.println(mySolution(new int[]{7,1,3,4,1,7}));
	}
	
	static String mySolution(int[] a) {
        Map<Integer,Integer> firstIndex  = new HashMap<>();
        int minDif = Integer.MAX_VALUE;
        for(int i = 0 ; i < a.length ; i++){
            if(firstIndex.keySet().contains(a[i])){
                minDif = Math.min(minDif, i - firstIndex.get(a[i]));
            }else{
                firstIndex.put(a[i],i);
            }
        }
        return minDif == Integer.MAX_VALUE ? -1 : minDif;

    }
}
