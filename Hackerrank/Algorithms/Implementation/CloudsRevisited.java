package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * Return Energy remaining after a game
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
 * @author medin
 *
 */
public class CloudsRevisited{

	public static void main(String[] args) {
		System.out.println(mySolution(new int[]{0,0,1,0,0,1,1,0}, 2);
	}
	

    static int mySolution(int[] c, int k) {
        int currEnergy = 100;
        int i = 0 ;
        while(i+k < c.length){
            i+=k;
            currEnergy -= c[i] == 1 ? 3 : 1;
        }
        currEnergy -= c[(i+k)%c.length] == 1 ? 3 : 1;
        return currEnergy;
    }
}
