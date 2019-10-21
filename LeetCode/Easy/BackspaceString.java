/**
 * https://leetcode.com/problems/backspace-string-compare/ 
 * Return whether two strings are equal when typed
 * @author EMEDINA
 *	O(n) time O(1) space
 */

class Solution {
	 public boolean backspaceCompare(String S, String T) {
	   return afterBackspaceString(S).equals(afterBackspaceString(T));
	 }
	 
	 private String afterBackspaceString( String s) {
	   StringBuilder sb = new StringBuilder();
	   for( int i = 0 ; i < s.length() ; i++ ) {
         if( s.charAt(i) == '#' && sb.length() > 0 ) {
           sb.deleteCharAt(sb.length()-1);
         }else if( s.charAt(i) != '#' ) {
        	 sb.append(s.charAt(i));
         }	
	   }
		 return sb.toString();
	 }
}
