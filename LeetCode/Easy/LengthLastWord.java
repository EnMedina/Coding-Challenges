/**
 *  https://leetcode.com/problems/length-of-last-word/submissions/
 *  Return the length of the last word
 *  @Author EnMedina
 */

class Solution {
    public int lengthOfLastWord(String s) {
        int lastCharI = s.length()-1;
        while( lastCharI >= 0 && !Character.isLetter(s.charAt(lastCharI)) ) lastCharI--;
        if( lastCharI == -1 ) return 0;
        int firstILastWord = lastCharI;
        while( firstILastWord >= 0 && Character.isLetter(s.charAt(firstILastWord)) )firstILastWord--;
        if( firstILastWord == -1 ||  s.charAt(firstILastWord) == ' ') firstILastWord++;
        
        return lastCharI - firstILastWord  +1;
    }
}
