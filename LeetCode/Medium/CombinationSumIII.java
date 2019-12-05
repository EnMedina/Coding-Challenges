

/**
 * Find all possible combinations of k numbers that add up to a number n, 
 * given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.
 */

/**
 * https://leetcode.com/problems/combination-sum-iii
 * Return the number of combinations that add to a given sum for digits 1-9 non repeated
 * @Author EnMedina
 * 
 * Backtracking
 */

class Solution {
  public List<List<Integer>> combinationSum3(int k, int n) {
    int[] candidates = new int[9];
    for( int i = 0 ; i < candidates.length ; i++ ) candidates[i] = i+1;
    List<List<Integer>> combinations = new LinkedList<>();
    List<Integer> currList = new LinkedList<>();
    backtrack( 0 , candidates, combinations, currList, 0 , n, k);
    return combinations;
  } 
  
  private void backtrack(int currI, int[] candidates, List<List<Integer>> combinations, List<Integer> currList , int currSum , int target, int sizeLim) {
    if( currSum > target || currList.size() > sizeLim ) return;
    if( currSum == target  ) {
      if( currList.size() == sizeLim ) {
        combinations.add( new LinkedList<Integer>(currList));
      }
      return;
    }
    for( int i = currI ; i < candidates.length && candidates[i]+currSum <= target ; i++ ) {
      currList.add(candidates[i]);
      backtrack(i+1, candidates, combinations, currList, currSum + candidates[i], target, sizeLim);
      currList.remove(currList.size()-1);
    }
    
    return;
  }
}
