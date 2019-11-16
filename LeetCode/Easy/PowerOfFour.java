/**
 * https://leetcode.com/problems/power-of-four/
 * return Whether a number is a power of four
 * @author EMEDINA
 */

class Solution {
  public boolean isPowerOfFour(int num) {
      if( num <= 0) return false;
      while( num > 1 ){
          //System.out.println("Trying for " + num); 
          if( num % 4 != 0) return false;
          num /= 4;
      }
      return true;
  }
}
