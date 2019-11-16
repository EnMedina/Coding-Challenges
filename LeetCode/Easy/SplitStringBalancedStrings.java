/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
 * How many balanced substrings in a balanced string?
 * @author EMMEDINA
 */
class Solution {
    public int balancedStringSplit(String s) {
        int currI = 0;
        int numBalStr = 0;
        while( currI < s.length() ) {
        	int numL = 0;
        	int numR = 0;
        	do{
        		if( s.charAt(currI) == 'L') numL++;
            	else numR++;
        		currI++;
        	} while( numL != numR);
        	numBalStr++;
        }
        
        return numBalStr;
    }
}
