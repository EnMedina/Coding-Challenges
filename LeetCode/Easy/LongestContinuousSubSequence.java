/**
 * https://leetcode.com/problems/longest-continuous-increasing-subsequence/
 * Return longest increasing continuous subarray
 * @author EMEDINA
 *
 */
class Solution {
  public int findLengthOfLCIS(int[] nums) {
    if( nums == null || nums.length < 1) return 0;
    int currMax = 1;
    for( int i = 1 ; i < nums.length ; i++ ) {
      int currCount = 1;
      while( i < nums.length && nums[i] > nums[i-1]) {
        i++;
        currCount++;
      }
      currMax = Math.max(currMax, currCount);
    }
    return currMax;
  }
}

