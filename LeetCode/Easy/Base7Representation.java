/**
 * https://leetcode.com/problems/base-7
 * Convert a number to its base 7 representation
 * @author EMEDINA
 *
 */

class Solution {
  public String convertToBase7(int num) {
   if(num == 0) return "0";
      StringBuilder sb = new StringBuilder();
   boolean isNegative = false;
   if( num < 0 ) isNegative = true;
   num = Math.abs(num);
   while( num > 0 ) {
     sb.append(num%7);
     num /= 7;
   }
   if( isNegative) sb.append('-');
   return sb.reverse().toString();
 }
}
