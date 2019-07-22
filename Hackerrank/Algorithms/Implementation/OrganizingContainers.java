package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem
 * Return whether it's possible to swap balls and organize some containers
 * 
 * @author medin
 *
 */
public class OrganizingContainers {

	public static void main(String[] args) {
		System.out.println(new int[][]{{1,3,1},{2,1,2},{3,3,3}});
	}
	
	public static int mySolution(int[][] container) {
        int n = container.length;
        long[] nBallsPerColor = new long[n];
        long[] nBallsPerCont  = new long[n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                nBallsPerColor[i%n] += (long)container[i][j];
                nBallsPerCont[j%n] += (long)container[i][j];
            }
        }
        System.out.println(Arrays.toString(nBallsPerColor));
        System.out.println(Arrays.toString(nBallsPerCont));
        Arrays.sort(nBallsPerColor);
        Arrays.sort(nBallsPerCont);
        if(!Arrays.equals(nBallsPerColor,nBallsPerCont)) return "Impossible";


    return "Possible";
    }
	
}
