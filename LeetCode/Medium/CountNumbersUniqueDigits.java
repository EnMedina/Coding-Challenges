
/**
 * Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.
 */

/**
 * https://leetcode.com/problems/count-numbers-with-unique-digits
 * Count all the numbers with unique digits 
 * @Author EnMedina
 * 
 * Backtracking
 */

class Solution {
  public int countNumbersWithUniqueDigits(int n) {
      if( n == 0 ) return 1; 
      if( n == 1 ) return 10;
      int[] dp =  new int[n];
      dp[0] = 10;
      dp[1] = 91;
      int currVal = 81;
      int currMult = 8;
      for( int i = 2 ; i < n ; i++ ){
          dp[i] = dp[i-1] + currVal*currMult;
          currVal *= currMult;
          currMult--;
          if( i > 9 ) dp[i] = dp[i-1];
      }
      return dp[n-1];
  }
}
