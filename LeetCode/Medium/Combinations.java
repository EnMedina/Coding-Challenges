
/**
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 */

/**
 * https://leetcode.com/problems/combinations/
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * @Author EnMedina
 * 
 * Backtracking
 */

class Solution {
  public List<List<Integer>> combine(int n, int k) {
      List<List<Integer>> combinations = new LinkedList<>();
      List<Integer> currList = new LinkedList<>();
      
      backtrack( combinations, currList, 1 , n , k);
      return combinations;
  }
  
  private void backtrack( List<List<Integer>> combinations, List<Integer> currList, int currNum , int maxNum, int requiredLen) {
    if( currList.size() > requiredLen) return;
    if( currList.size() == requiredLen) {
      combinations.add( new LinkedList<>(currList));
      return;
    }
    
    while( currNum <= maxNum ) {
      currList.add(currNum);
      backtrack( combinations, currList, currNum+1, maxNum, requiredLen);
      currList.remove(currList.size()-1);
      currNum++;
    }
    return;
  }
}
