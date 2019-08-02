package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * Return value on the counter below
 * https://www.hackerrank.com/challenges/strange-code/problem
 * @author MedinaEn
 *
 */
public class StrangeCounter {

	public static void main(String[] args) {
		System.out.println(mySolution(58));
	}
	
		
	
	static String mySolution(long t) {
        long currLength = 3;

        while(t > currLength){
            t -= currLength;
            currLength *=2;
        }
        return currLength-t+1;
    }
}
