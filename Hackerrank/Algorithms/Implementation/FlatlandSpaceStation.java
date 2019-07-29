package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * Return the max distance from a city to a space station
 * https://www.hackerrank.com/challenges/flatland-space-stations/problem
 * @author MedinaEn
 *
 */
public class FlatlandSpaceStations{

	public static void main(String[] args) {
		System.out.println(mySolution(6,new int[]{0,1,2,3,4,5});
	}
	

    static int mySolution(int n, int[] stations) {
        Arrays.sort(stations);
        int maxDist = Math.max(stations[0], n-1 - stations[stations.length - 1] );
        for(int i = 1 ; i < stations.length ; i++){
            maxDist = Math.max(maxDist, (stations[i]-stations[i-1])/2);
        }
        return maxDist;
    }
}
