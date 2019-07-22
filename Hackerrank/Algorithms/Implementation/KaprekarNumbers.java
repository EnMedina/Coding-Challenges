package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/kaprekar-numbers/problem
 * Return which are kaprekarNumbers
 * 
 * @author medin
 *
 */
public class KaprekarNumbers {

	public static void main(String[] args) {
		System.out.println(mySolution(1,99999));
	}
	
	public static int mySolution(int p, int q) {
        int counter = 0;
        while(p <= q){
            String square = String.valueOf(((long)p)*p);
            String p1 = square.substring(0,square.length()/2);
            String p2 = square.substring(square.length()/2,square.length());
            if(p1.length() == 0) p1 = "0";
            if(p2.length() == 0) p2 = "0";

            if(Integer.valueOf(p1)+Integer.valueOf(p2) == p){
                System.out.print(p+" ");
                counter++;
            } 
            p++;
        }
        if(counter == 0) System.out.println("INVALID RANGE");

    }

}
