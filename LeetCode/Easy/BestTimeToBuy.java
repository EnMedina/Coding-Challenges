/**
 *  https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/
 *  Give the maximum profit that can be made selling stocks
 *  @Author EnMedina
 */
class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2 ) return 0;
        int maxProfit = 0;
        int currMin = prices[0];
        int currHighest = 0;
        for( int indPrices = 1 ; indPrices < prices.length ; indPrices++ ){
            if( prices[indPrices] < prices[indPrices-1] ){
                maxProfit += currHighest-currMin > 0 ? currHighest-currMin : 0;
                currMin = prices[indPrices];
                currHighest = 0;
            }
            else if( prices[indPrices] > currHighest){
                currHighest = prices[indPrices];
            }
        }
        maxProfit +=  currHighest-currMin > 0 ? currHighest-currMin : 0;
        return maxProfit;

    }
    //Taking a dp approach
     public int maxProfitDP(int[] prices) {
        int[] dp = new int[prices.length];
        if( prices.length < 2 ) return 0;
        dp[0] = 0;
       int minVal = prices[0];
       for( int i = 1 ; i < dp.length ; i++ ){
           dp[i] = Math.max(dp[i-1], prices[i] - minVal);
           if( prices[i] < minVal ) minVal = prices[i];
       }
        return dp[prices.length-1];
    }
}
