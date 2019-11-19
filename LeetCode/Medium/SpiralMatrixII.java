
/**
 * https://leetcode.com/problems/queens-that-can-attack-the-king/
 * Return order of visit in spiral walk
 * @Author EnMedina
 */
class Solution {
  public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
      int[][] order = new int[R*C][2];
      order[0][0] = r0;
      order[0][1] = c0;
      int currIndex = 1;
      int currR = r0;
      int currC = c0;
      int currJump = 1;
      while( currIndex < order.length) {
        
        //Move right
        for( int i = 0 ; i < currJump ; i++ ) {
          currC++;
          if( currR < R && currR >= 0 && currC >= 0 && currC < C) {
            order[currIndex][0] = currR;
            order[currIndex][1] = currC;
            currIndex++;
          }
        }
        //Move down
        for( int i = 0 ; i < currJump ; i++ ) {
          currR++;
          if( currR < R && currR >= 0 && currC >= 0 && currC < C) {
            order[currIndex][0] = currR;
            order[currIndex][1] = currC;
            currIndex++;
          }
        }
        currJump++;
        
        //Move left
        for( int i = 0 ; i < currJump ; i++ ) {
          currC--;
          if( currR < R && currR >= 0 && currC >= 0 && currC < C) {
            order[currIndex][0] = currR;
            order[currIndex][1] = currC;
            currIndex++;
          }
        }
        //Move up
        for( int i = 0 ; i < currJump ; i++ ) {
          currR--;
          if( currR < R && currR >= 0 && currC >= 0 && currC < C) {
            order[currIndex][0] = currR;
            order[currIndex][1] = currC;
            currIndex++;
          }
        }
        currJump++;
      }
      return order;
  }
  
}
