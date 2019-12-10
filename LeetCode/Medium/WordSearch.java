/**
 * Given a 2D board and a word, find if the word exists in the grid.
 * The word can be constructed from letters of sequentially adjacent cell,
 * where "adjacent" cells are those horizontally or vertically neighboring. 
 * The same letter cell may not be used more than once.
 * 
 */

/**
 * https://leetcode.com/problems/word-search/
 * Return the kth ordered permutaton
 * @Author EnMedina
 * 
 * Backtracking
 */
class Solution {
  public boolean exist(char[][] board, String word) {
      boolean[][] seen = new boolean[board.length][board[0].length];
      return backtrack( board, seen, word, 0, 0, 0);
  }

  private boolean backtrack(char[][] board, boolean[][] seen,String word, int currI, int y, int x) {
    if( currI == word.length()) return true;
    if( y == board.length || y < 0 || x < 0 || x == board[0].length) return false;
    boolean result = false;
    if( !seen[y][x] && board[y][x] == word.charAt(currI)) {
      seen[y][x] = true;
      result = backtrack(board, seen, word, currI+1, y+1, x );
      result = result || backtrack(board, seen, word, currI+1, y - 1,x );
      result = result || backtrack(board, seen, word, currI+1, y, x + 1);
      result = result || backtrack(board, seen, word, currI+1, y, x - 1);
      if( result) return true;
      seen[y][x] = false;
    }
    
    return false;
  }
}


