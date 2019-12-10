
/**
 * https://leetcode.com/problems/subsets-ii/
 * Return all possible subsets
 * @Author EnMedina
 * 
 * Backtracking
 */
class Solution {
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.parallelSort(nums);
    List<List<Integer>> permutationList = new LinkedList<>();
    List<Integer> currList = new LinkedList<>();
    permutationList.add(new LinkedList<>());
    
    backtrack( nums, permutationList, currList,  0);
    return permutationList;
  }

  private void backtrack(int[] nums, List<List<Integer>> permutationList, List<Integer> currList, int currI) {
    for( int i = currI ; i < nums.length ; i++ ) {
      currList.add(nums[i]);
      permutationList.add(new LinkedList<>(currList));
      backtrack( nums, permutationList, currList, i + 1);
      currList.remove(currList.size()-1);
      while( (i+1) < nums.length && nums[i] == nums[i+1]) i++;
    }
  } 
}
