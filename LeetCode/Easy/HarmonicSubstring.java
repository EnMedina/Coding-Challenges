/**
 * https://leetcode.com/problems/symmetric-tree/
 * Return whether a tree is symmetric 
 * @author EMEDINA
 *
 */
class Solution {
  public int findLHS(int[] nums) {
    Map<Integer,Integer> occCountMap = new HashMap<>();
    for( int num : nums ) {
      int tempNum = occCountMap.containsKey(num) ? occCountMap.get(num)+1 : 1;
      occCountMap.put(num, tempNum);
    }
    int currMax = 0;
    for( int occurrence : occCountMap.keySet()) {
      int nextOccurrence = occCountMap.containsKey(occurrence+1) ? occCountMap.get(occurrence+1) : 0;
      if(nextOccurrence > 0 ) currMax = Math.max(currMax, occCountMap.get(occurrence)+ nextOccurrence);
    }
        
    return currMax;
  }
}
