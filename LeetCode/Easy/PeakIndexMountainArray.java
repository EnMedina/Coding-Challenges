
/**
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 * Return the index of the peak of a mountain array
 * @author EMMEDINA
 */

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int maxHeight = 0;
        int maxHeightIndex = -1; 
        for( int i = 0 ; i < A.length ; i++ ){
            if( A[i] > maxHeight ){
                maxHeight = A[i];
                maxHeightIndex = i;
            }
        }
        return maxHeightIndex;
    }
}
