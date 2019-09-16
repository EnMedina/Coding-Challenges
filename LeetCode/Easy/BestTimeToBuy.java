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
}
