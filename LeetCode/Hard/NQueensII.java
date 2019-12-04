/**
 * https://leetcode.com/problems/n-queens-ii/
 * Return the number of possible arrays for the queens that doensn't overlap
 * @Author EnMedina
 * 
 * Backtracking
 */

class Solution {
  public int totalNQueens(int n) {
      boolean[][] invalidMove = new boolean[n][n];
      return backtrack( invalidMove , 0 , n);
      
  }
  
  private int backtrack( boolean[][] invalidMove, int currIndex, int n) {
    if( currIndex == n) return 1;
    int currValid = 0;
    for( int i = 0 ; i < n ; i++ ) {
      if( !invalidMove[currIndex][i] ) {
        int offset = 0;
        for( int j = currIndex ; j < n ; j++ ) {
          invalidMove[j][i] = true;
          if( i+offset < n ) invalidMove[j][i+offset]=true;
          if( i-offset  >= 0 ) invalidMove[j][i-offset]=true;
          offset++;
        }
        currValid += backtrack( invalidMove, currIndex+1, n);
        offset = 0 ;
        for( int j = currIndex ; j < n ; j++ ) {
          invalidMove[j][i] = false;
          if( i+offset < n ) invalidMove[j][i+offset]=false;
          if( i-offset  >= 0 ) invalidMove[j][i-offset]=false;
          offset++;  
        }
      }
    }
    return currValid;
  }
}
