/*
 * https://leetcode.com/problems/minimum-falling-path-sum/submissions/
 * Return the minimum falling path value for an object
 * @author EnMedina
 * Dynamic Programming
 */

class Solution {
    public int minFallingPathSum(int[][] A) {
        for( int y = 1 ; y < A.length ; y++ ){
            for( int x = 0 ; x < A[0].length ; x++ ){
                int minToAdd = A[y-1][x];
                if( x > 0 ) minToAdd = Math.min(minToAdd, A[y-1][x-1]);
                if( x < A[0].length-1 ) minToAdd = Math.min(minToAdd, A[y-1][x+1]);
                A[y][x] += minToAdd;
            }
        }
        int minValue = Integer.MAX_VALUE;
        for( int x = 0 ; x < A[0].length ; x++ ){
            minValue = Math.min( minValue, A[A.length-1][x]);
        }
        return minValue;
    }
}
