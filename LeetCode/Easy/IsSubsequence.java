/**
 *  https://leetcode.com/problems/is-subsequence/
 *  Return whether a substring is a subsequence
 *  @Author ENMedina
 */

class Solution {
    public boolean isSubsequence(String s, String t) {
        if( s == null || s.length() < 1 ) return true;
        if( t == null || t.length() < s.length() ) return false;
        int substringIndex = 0;
        char currChar = s.charAt(0);
        for( int i = 0 ; i < t.length() ; i++ ){
            if( t.charAt(i) == currChar ){
                substringIndex++;
                if( substringIndex == s.length() ) return true;
                currChar = s.charAt(substringIndex);
            }
        }
        return false;
    }
}
