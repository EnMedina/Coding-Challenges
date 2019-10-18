
/**
 * https://leetcode.com/problems/repeated-string-match/
 * Return the number of repetitions of a string A to have B as substring
 * @author EMEDINA
 *	O(n*m) time O(1) space
 */

class Solution {
    public int repeatedStringMatch( String A, String B) {
    	int startCheckIndex = 0;
    	while( startCheckIndex < A.length() ) {
    		if( A.charAt(startCheckIndex) == B.charAt(0) ) {
    			int numberRepetitions = 0;
    			int currBIndex = 0;
    			int currAIndex = startCheckIndex;
    			while( currBIndex < B.length() && A.charAt(currAIndex) == B.charAt(currBIndex)) {
    				if( currBIndex == B.length() - 1) return numberRepetitions;
    				currBIndex++;
    				currAIndex++;
    				if( currAIndex == A.length()) {
    					numberRepetitions++;
    					currAIndex = 0;
    				} 
    			}
    		}
    		startCheckIndex++;
    	}
    	
    	return -1;
    }
}
