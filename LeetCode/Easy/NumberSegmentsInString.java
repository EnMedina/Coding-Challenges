/**
 * https://leetcode.com/problems/number-of-segments-in-a-string
 * Return the number of segments separated by ' ' in a String
 * @Author EnMedina
 */

class Solution {
    public int countSegments(String s) {
        int segments = 0;
        int currI = 0;
        while( currI < s.length() ){
            while( currI < s.length() && s.charAt(currI) == ' ')currI++;
            if( currI < s.length()) segments++;
            while( currI < s.length() && s.charAt(currI) != ' ') currI++;
        }
        return segments;
    }
}
