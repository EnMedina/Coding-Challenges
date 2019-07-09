package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/strange-advertising/problem
 * Return the number of people who will be exposed to an advertising after n days
 * 
 * @author medin
 *
 */
public class StrangeAdvertising {

	public static void main(String[] args) {
		System.out.println(mySolution(5);
	}
	
	public static int mySolution(int n) {
        int currentLikes = 5;
        int totalLikes = 0;
        for(int i = 0 ; i < n ; i++){
            totalLikes += currentLikes/2;
            currentLikes = (currentLikes/2)*3;
        }
        return totalLikes;
    }
	
}