package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
 * Give the minimum number of jumps to end
 * 
 * @author medin
 *
 */
public class JumpingOnClouds {

	public static void main(String[] args) {
		System.out.println(mySolution(new int[]{0,0,0,0,1,0}));
	}
	
	public static int mySolution(int[] c) {
        int minJumps = -1;
        for(int i = 0 ; i < c.length ; i++){
            minJumps++;
            if(i+2 < c.length && c[i+2] == 0) i++;
        }
        return minJumps;
    }
	
}
