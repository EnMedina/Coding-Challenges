
/**
 * https://leetcode.com/problems/reverse-bits/
 * Reverse the bits of an unsigned Integer
 * @author EMEDINA
 *	O(1) time O(1) space
 */
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        long currPow = (long) (Math.pow(2, 31));
        long longN = Integer.toUnsignedLong(n);
        	 long reversedNum = 0;
        	 while( currPow != 0 ) { 
        		 if( longN % 2 == 1 ) {
        			 reversedNum += currPow;
                   // System.out.println(" added " + currPow + " number is now " + reversedNum); 
        		 }
        		 currPow /=2;
        		 longN /= 2;
        	 }
        	 
        	 return (int)reversedNum;
    }
}
