/**
 *  https://leetcode.com/problems/distribute-candies/
 *  Say the different kinds of candies the sister can get
 *  @Author EnMedina
 */


class Solution {
    public int distributeCandies(int[] candies) {
      
      Set<Integer> candyKinds = new HashSet<>();
      for( int candy : candies){
        candyKinds.add(candy);
      }
      
      return Math.min(candies.length/2, candyKinds.size());
    }
}
