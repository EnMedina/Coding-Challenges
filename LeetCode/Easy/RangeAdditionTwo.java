/**
 * https://leetcode.com/problems/range-addition-ii/submissions/
 * Find the number of largest  numbers that exist within a range
 * @Author EnMedina
 */

class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minY = m;
        int minX = n;
        
        for( int[] operation : ops){
            minY = Math.min(minY, operation[0]);
            minX = Math.min(minX, operation[1]);
        }
        return minX*minY;
    }
}
