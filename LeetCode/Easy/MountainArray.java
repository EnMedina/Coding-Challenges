/**
 * https://leetcode.com/problems/valid-mountain-array/
 * Return whether an array is a valid mountain
 * @author EMEDINA
 *	O(n) time O(1) space
 */
class Solution {
    public boolean validMountainArray(int[] A) {
        if( A.length < 3 ) return false; 
        int currI = 1;
        while( currI < A.length && A[currI] > A[currI-1] ) currI++;
        if( currI == A.length || currI == 1) return false;
        
        //System.out.println( "Peak is at index " + currI);
        if( currI == A.length ) return false;
        while( currI < A.length && A[currI] < A[currI-1] ) currI++;
        
        return currI == A.length;
    }
}
