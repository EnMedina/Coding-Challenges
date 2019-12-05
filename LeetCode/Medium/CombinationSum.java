
/**
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique 
 * combinations in candidates where the candidate numbers sums to target.
 * 
 * The same repeated number may be chosen from candidates unlimited number of times.
 */

/**
 * https://leetcode.com/problems/combination-sum/
 * Return the number of combinations that add to a given sum
 * @Author EnMedina
 * 
 * Backtracking
 */

class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> combinations = new LinkedList<>();
      Arrays.sort(candidates);
      backtrack( 0, candidates, combinations, new LinkedList<Integer>() , 0, target);
      return combinations;
  }
  
  private void backtrack(int currI, int[] candidates, List<List<Integer>> combinations, List<Integer> currList , int currSum , int target) {
    if( currSum > target) return;
    if( currSum == target ) {
      combinations.add(new LinkedList<>(currList));
    }
    for( int i = currI ; i < candidates.length && candidates[i]+currSum <= target ; i++ ) {
      currList.add(candidates[i]);
      backtrack(i, candidates, combinations, currList, currSum + candidates[i], target);
      currList.remove(currList.size()-1);
    }
    
    return;
  }
}
