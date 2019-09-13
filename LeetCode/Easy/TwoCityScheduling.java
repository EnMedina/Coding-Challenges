/**
 *  https://leetcode.com/problems/two-city-scheduling/submissions/
 *  Return the possible savings of flying two different people 
 *  @Author EnMedina
 */

class Solution {
    public int twoCitySchedCost(int[][] costs) {
      Arrays.sort(costs, (int[] a, int[] b) ->  { return Integer.compare( Math.abs(a[0]-a[1]), Math.abs( b[0] - b[1]) );} );
      //for( int[] cost : costs)
      //System.out.println(Arrays.toString(cost));
      
      int totalPrice = 0;
      int currA = 0;
      int currB = 0;
      for( int i = costs.length-1 ; i >= 0 ; i-- ){
        if      ( currA == costs.length / 2 ) totalPrice += costs[i][0];
        else if ( currB == costs.length / 2 ) totalPrice+= costs[i][1];
        else{
          if( costs[i][0] > costs[i][1] ){
            totalPrice += costs[i][1];
            currA++;
          }else{
            totalPrice += costs[i][0];
            currB++;
          }
        }
      }
      
      return totalPrice;
         
               
    }
}
