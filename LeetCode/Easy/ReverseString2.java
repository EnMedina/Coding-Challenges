/**
 * Given a string and an integer k, you need to reverse the first k 
 * characters for every 2k characters counting from the start of the 
 * string. If there are less than k characters left, reverse all of them.
 * If there are less than 2k but greater than or equal to k characters,
 * then reverse the first k characters and left the other as original.
 */


/**
 * https://leetcode.com/problems/reverse-string-ii/
 * Reverse the string for every k characters
 * @author EMEDINA
 *
 */
class Solution {
  public String reverseStr(String s, int k) {
    StringBuilder sb = new StringBuilder();
    StringBuilder helperSb = new StringBuilder();
    boolean reverseThis = true;
    int currI = 0;
    while( currI < s.length() ) {
      if( (currI + k) < s.length() ) {
        helperSb.append(s.substring(currI, currI+k));
      } else {
        helperSb.append(s.substring(currI));
      }
      
      if( reverseThis ) {
        sb.append(helperSb.reverse().toString());
      }
      else {
        sb.append(helperSb.toString());
      }
      helperSb.setLength(0);
      reverseThis = reverseThis ? false : true;
      currI+=k;
    }
    
    return sb.toString();
  }
}
