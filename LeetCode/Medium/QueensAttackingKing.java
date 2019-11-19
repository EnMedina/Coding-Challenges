/**
 * https://leetcode.com/problems/queens-that-can-attack-the-king/
 * Return how many queens can attack a king
 * @Author EnMedina
 */
class Solution {
  public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
      List<List<Integer>> attackingQueens = new ArrayList<>();
      for( int yJump = -1 ; yJump <= 1 ; yJump++ ) {
        for( int xJump = -1; xJump <= 1 ; xJump++ ) {
          List<Integer> tempList = checkCollision(queens, king, yJump, xJump);
          if( tempList != null ) attackingQueens.add(tempList);
        }
      }
      return attackingQueens;
  }
  
  private List<Integer> checkCollision( int[][] queens, int[] king , int yJump , int xJump ){
    if( xJump == 0 && yJump == 0 ) return null;
    int currY = king[0]+yJump;
    int currX = king[1]+xJump;
    while( currY >= 0 && currY < 8 && currX >= 0 && currX < 8) {
      for( int[] queen : queens ) {
        if( queen[0] == currY && queen[1] == currX ) {
          List<Integer> attackingQueen = new ArrayList<>();
          attackingQueen.add(currY);
          attackingQueen.add(currX);
          return attackingQueen;
        }
      }
      currY += yJump;
      currX += xJump;
    }
    
    return null;
  }
}
