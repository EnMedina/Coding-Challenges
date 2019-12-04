/**
 * https://leetcode.com/problems/beautiful-arrangement/
 * Return the number of beautiful arrangements
 * @Author EnMedina
 * 
 * Backtracking
 */

class Solution {
  public int countArrangement(int N) {
      boolean[] seen = new boolean[N];
      return backtrackingCount( seen,  0);
  }
  
  private int backtrackingCount(boolean[] seen, int currIndex ) {
    if( currIndex == seen.length ) return 1;
    int countOccurr = 0;
    for( int i = 0 ; i < seen.length ; i++ ) {
      if( !seen[i] && ( (currIndex+1)%(i+1) == 0 || (i+1)%(currIndex+1) == 0 )) {
        seen[i] = true;
        countOccurr += backtrackingCount(seen, currIndex+1);
        seen[i] = false;
      }
    }
    return countOccurr;
  }
  
}
