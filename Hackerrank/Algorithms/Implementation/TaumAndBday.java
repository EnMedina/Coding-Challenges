package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/taum-and-bday/problem
 * Return the minimum cost of gifts
 * 
 * @author medin
 *
 */
public class TaumAndBday {

	public static void main(String[] args) {
		System.out.println(mySolution(10,10,1,1,1));
	}
	
	public static int mySolution(long b, long w, long bc, long wc, long z) {
		if((bc+z) < wc) return (bc*b) + ((bc+z)*w);
		if((wc+z) < bc) return (wc*w) + ((wc+z)*b);
		return b*bc + w*wc;
    }
	
}
