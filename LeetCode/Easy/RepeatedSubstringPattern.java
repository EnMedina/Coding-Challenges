
/**
 * https://leetcode.com/problems/repeated-substring-pattern
 * Check whether a string can be constructed repeating a substring of itself
 * @author EMEDINA
 */

class Solution {
  public boolean repeatedSubstringPattern(String s) {
      for( int i = 1 ; i <= s.length()/2 ; i++ ){
          if( s.length() % i == 0){
              boolean isSubstring = true;
              for( int j = 0 ; j < s.length() && isSubstring ; j+=i ){
                  if( ! s.substring(0,i).equals(s.substring(j,j+i))) isSubstring = false;
              }
              if( isSubstring) return true;
          }
      }
      return false;
  }
}
