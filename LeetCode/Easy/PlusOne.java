

/**
 * https://leetcode.com/problems/plus-one
 * Add 1 to a number given as an array
 * @Author EnMedina
 */

class Solution {
  public int[] plusOne(int[] digits) {
      boolean carry = true;
      for( int i = digits.length -1 ; i >= 0 && carry ; i-- ){
          digits[i] = digits[i] == 9 ? 0 : (digits[i]+1);
          if( digits[i] != 0) carry = false;
      }
      if( carry ){
          int[] tempDigits = new int[digits.length + 1];
          tempDigits[0] = 1;
          digits = tempDigits;
      }
          
      return digits;
  }
}
