package com.enriquemedina.leetcode.easy;

/**
 * https://leetcode.com/problems/binary-number-with-alternating-bits/
 * Check whether a number has alternating bits
 * @author EMEDINA
 *
 */
public class HasAlternatingBits {
	public static void main(String[] args) {
		System.out.println(hasAlternatingBits(7));
	}
	
	private static boolean hasAlternatingBits(int n) {
		long currPow = (long)Math.pow(2, 32);
		while( currPow > n ) currPow /=2;
		int prevVal = 0;
		while(currPow != 0) {
			if(n >= currPow) {
				if(prevVal == 1) return false;
				n-=currPow;
				prevVal = 1;
			}else {
				if(prevVal == 0) return false;
				prevVal = 0;
			}
			currPow /= 2;
		}
		return true;
	}
}
