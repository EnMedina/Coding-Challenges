
/**
 * https://leetcode.com/problems/combination-sum-ii/
 * Return the unique combinations that add up to a number
 * @Author EnMedina
 * 
 * Backtracking
 */


class Solution {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      Arrays.sort(candidates); 
      boolean[] seen = new boolean[candidates.length];
      List<List<Integer>> combinations = new LinkedList<>();
      List<Integer> currList = new LinkedList<>();
      backtrack( candidates, seen, combinations, currList, target, 0, 0);
      
      return combinations;
  }

  private void backtrack(int[] candidates, boolean[] seen, List<List<Integer>> combinations, List<Integer> currList,
      int target, int currSum , int currI) {
    // System.out.println("CurrSum = " + currSum); 
    if( currSum == target ) {
      combinations.add(new LinkedList<>(currList));
      return;
    }
    for( int i = currI ; i < seen.length ; i++ ) {
      if( !seen[i] && currSum+candidates[i] <= target) {
        seen[i] = true;
        currList.add(candidates[i]);
        backtrack( candidates, seen, combinations, currList,  target, currSum + candidates[i], i);
        currList.remove(currList.size()-1);
        seen[i] = false;
        while( i < seen.length-1 && candidates[i] == candidates[i+1]) i++;  
      }
    }
    return;
  }
}
