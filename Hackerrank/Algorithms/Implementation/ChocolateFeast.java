package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/chocolate-feast/problem
 * Return the number of chocolates that  kid eats
 * 
 * @author MedinaEn
 *
 */
public class ChocolateFeast {

	public static void main(String[] args) {
		System.out.println(mySolution(10,2,5);
	}
	
	public static int mySolution(int money, int cost, int wrappers) {
        int nChocolates = money/cost;
        int nWrappers = money/cost;
        while(nWrappers >= wrappers){
            nChocolates += nWrappers/wrappers;
            nWrappers = nWrappers%wrappers + nWrappers/wrappers;
        }
        return nChocolates;
    }

	
}




