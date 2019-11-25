/**
 * https://leetcode.com/problems/partition-array-for-maximum-sum/
 * Return the maximum sum for a partitined array
 * @Author EnMedina
 */
class Solution {
  public int maxSumAfterPartitioning(int[] A, int K) {
    int[] dp = new int[A.length];
    int currMax = 0;
    for( int i = 0 ; i < K ; i++ ) {
      currMax = Math.max(currMax, A[i]);
      dp[i] = currMax*(i+1);
    }
    
    for( int i = K ; i < A.length ; i++ ) {
      currMax = 0;
      for( int offset = 1 ; offset <= K ; offset++) {
        currMax = Math.max(currMax, A[i-offset+1]);
        dp[i] = Math.max(dp[i], dp[i-offset] + (currMax*offset));
      }      
    }
    //System.out.println(Arrays.toString(dp));
    return dp[A.length-1];
  }
}
