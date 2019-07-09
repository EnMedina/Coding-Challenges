package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/the-hurdle-race/problem
 * Print out the extra height the person would need to carry out all the jumps
 * @author medin
 *
 */
public class safdadsfdsa {

	public static void main(String[] args) {
		System.out.println(mySolution(new int[]{100,100,50,40,40,20,10});
	}
	
	public static int[] mySolution(int k, int[] height) {
        int currMax = Integer.MIN_VALUE;
        for(int i : height){
            currMax = Math.max(currMax,i);
        }
        return currMax > k ? currMax - k : 0;
    }
	
}
