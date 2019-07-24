package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * Return the number of games that can be bought
 * https://www.hackerrank.com/challenges/halloween-sale/problem
 * @author medin
 *
 */
public class HalloweenSale {

	public static void main(String[] args) {
		System.out.println(mySolution(20, 3, 6, 80));
	}
	
	static String mySolution(int startPrice, int discount, int minimum, int money) {
        int nextPrice = startPrice;
        int nGamesBought = 0;
        while(money >= nextPrice){
            money -= nextPrice;
            nGamesBought++;
            nextPrice = nextPrice-discount > minimum ? nextPrice-discount : minimum; 
        }
        return nGamesBought;
    }
}
