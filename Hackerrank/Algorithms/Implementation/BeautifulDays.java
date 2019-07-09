package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/beautiful-days
 * Return the number of beautiful days as per the formula below
 * 
 * @author medin
 *
 */
public class BeautifulDays {

	public static void main(String[] args) {
		System.out.println(mySolution(20,23);
	}
	
	public static int mySolution(int i, int j, int k) {
        int beautifulDays = 0;
        while(i <= j){
            if(Math.abs(i - reverseNumber(i))%k == 0 ) beautifulDays++;
            i++;
        }
        return beautifulDays;
    }

    static int reverseNumber(int x){
        String s = String.valueOf(x);
        StringBuilder sb = new StringBuilder(s);
        return Integer.parseInt(sb.reverse().toString());
    }
	
}