/**
 * https://leetcode.com/problems/valid-palindrome-ii/ 
 * Return whether a string can be palindrome 
 * @author EMEDINA
 *	O(n) time O(1) space
 */
class Solution {
	public boolean validPalindrome(String s) {
		return checkPalindrome(s, true);
	}
	
	private boolean checkPalindrome(String s, boolean errorAllowed) {
        //System.out.println("Trying for " + s); 
		int p1 = 0;
		int p2 = s.length()-1;
		while( p1 < p2 ) {
			if( s.charAt(p1) != s.charAt(p2)  && errorAllowed ) {
				return checkPalindrome(s.substring(p1, p2),false) || checkPalindrome(s.substring(p1+1,p2+1),false);
			}else if( s.charAt(p1) != s.charAt(p2) ) {
				return false;
			}
			p1++;
			p2--;
		}
		return true;
	}
}
