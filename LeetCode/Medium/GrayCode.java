
/**
 * https://leetcode.com/problems/gray-code/
 * Count all the numbers with unique digits 
 * @Author EnMedina
 * 
 * Backtracking
 */


class Solution {
  public List<Integer> grayCode(int n) {
    List<Integer> currList = new LinkedList<>();
    currList.add(0);
    if( n == 0 ) return currList;

    int maxNum = (int) (Math.pow(2, n));
    boolean[] seen = new boolean[maxNum];   
    seen[0] = true;
    backtrack( currList,  seen, n );
    return currList;
  }

  private void backtrack(List<Integer> currList, boolean[] seen, int n) {
    if( currList.size() == seen.length) return; 
    for( int i = 0 ; i < seen.length ; i++ ) {
      if( !seen[i] && countDiffBits( currList.get(currList.size()-1), i ) == 1 ) {
        seen[i] = true;
        currList.add(i);
        backtrack( currList, seen, n);
        if( currList.size() == seen.length) return;
        seen[i] = false;
        currList.remove(currList.size()-1);
      }
    }
    return;
  }

  private int countDiffBits(int  a, int b) {
    int combination = a ^ b;
    int count = 0; 
    while (combination > 0) { 
      combination &= (combination - 1); 
      count++; 
    } 
    return count; 
  }

}


//Better Solution
//
[200~/**
          * https://leetcode.com/problems/gray-code/
          *  * Count all the numbers with unique digits 
          *   * @Author EnMedina
          *    * 
          *     * Backtracking
          *      */

/**
 * https://leetcode.com/problems/gray-code/
 * Count all the numbers with unique digits 
 * @Author EnMedina
 * 
 * Backtracking
 */


class Solution {
  public List<Integer> grayCode(int n) {
    List<Integer> currList = new LinkedList<>();
    currList.add(0);
    for( int i = 0 ; i < n ; i++ ) {
      int increase = (int)(Math.pow(2, i));
      int currLen  = currList.size();
      for( int j = currLen-1 ; j >= 0 ; j-- ) {
        currList.add(currList.get(j)+increase);
      }
    }
    
    return currList;
  }
 
}
