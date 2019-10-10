/**
 *  https://leetcode.com/problems/longest-palindrome/submissions/
 *  Give the longest palindrome with the given characters
 *  @Author EnMedina
 */

class Solution {
    public int longestPalindrome(String s) {
        if( s == null || s.length() == 0 ) return 0;
        int[] charOccurrences = new int[52];
        for( int charIndex = 0 ; charIndex < s.length() ; charIndex++ ){
            char valueToSubtract = s.charAt(charIndex) >= 97 ? 'a' : '\''; // ' is 39 ascii to ensure uppercase go from index 26 to 51
            charOccurrences[s.charAt(charIndex) - valueToSubtract]++;
        }
        //System.out.println(Arrays.toString(charOccurrences)); 
        
        int count = 0;
        boolean oddExists = false;
        for( int i = 0 ; i < charOccurrences.length ; i++ ){
            if( charOccurrences[i] % 2 == 1) oddExists = true;
            count += charOccurrences[i]/2;
        }
        count*=2;
        if(oddExists) count++;
        return count;
    }
}
