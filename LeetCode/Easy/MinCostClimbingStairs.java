/**
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 * Determine the minimum cost of climbing stairs, you can climb one or two at a time.
 * Dynamic programming
 * @Author EnMedina
 */


class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if( cost == null || cost.length == 0 ) return 0;
        if( cost.length == 1) return cost[0];
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for( int i = 2 ; i < cost.length ; i++ ){
            dp[i] = cost[i] + Math.min(dp[i-1],dp[i-2]);
        }
        System.out.println(Arrays.toString(dp));
        return Math.min(dp[dp.length-1],dp[dp.length-2]);
    }
}
