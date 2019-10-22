
/**
 * https://leetcode.com/problems/number-of-1-bits/submissions/ 
 * Return the number of 1 bits in an integer
 * @author EMEDINA
 *
 */

public class Solution {
    // you need to treat n as an unsigned value
public int hammingWeight(int n) {
      long nLong = Integer.toUnsignedLong(n);
      int oneBitCount = 0;
      while( nLong != 0 ) {
        if( nLong%2 == 1 ) oneBitCount++;
        nLong /= 2;
      }
      
      return oneBitCount;
    }
} 


