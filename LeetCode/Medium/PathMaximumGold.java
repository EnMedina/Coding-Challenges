

public class Main {
  public static void main( String[] args) {
    Solution solution = new Solution();
    int[][] test1 = new int[][] {{0,6,0},{5,8,7},{0,9,0}};
    System.out.println(solution.getMaximumGold(test1));

    
    
  }
}

/**
 * In a gold mine grid of size m * n, each cell in this mine has an integer representing the amount of gold in that cell, 0 if it is empty.
 * 
 * Return the maximum amount of gold you can collect under the conditions:

 * Every time you are located in a cell you will collect all the gold in that cell. 
 * From your position you can walk one step to the left, right, up or down. 
 * You can't visit the same cell more than once.
 * Never visit a cell with 0 gold.
 * You can start and stop collecting gold from any position in the grid that has some gold.
 */



/**
 * https://leetcode.com/problems/path-with-maximum-gold
 * Return the amount of gold in the path with the most
 * @Author EnMedina
 */

class Solution {
  public int getMaximumGold(int[][] grid) {
      int currMax = 0;
      for( int y = 0 ; y < grid.length ; y++ ){
          for( int x = 0 ; x < grid[0].length ; x++ ){
              currMax = Math.max(currMax, maxGold(0, y, x, grid));
          }
      }
      return currMax;
  }
  
  private int maxGold(int currSum , int y , int x , int[][] grid ) {
    if( y < 0 || x < 0 || y >= grid.length || x >= grid[0].length || grid[y][x] == 0) return currSum;
    int backtracker = grid[y][x];
    grid[y][x] = 0;
    int currMax = backtracker;
    
    currMax = Math.max(currMax, maxGold(currSum + backtracker, y+1, x , grid));
    currMax = Math.max(currMax, maxGold(currSum + backtracker, y-1, x , grid));
    currMax = Math.max(currMax, maxGold(currSum + backtracker, y, x-1 , grid));
    currMax = Math.max(currMax, maxGold(currSum + backtracker, y, x+1 , grid));
    
    grid[y][x] = backtracker;
    
    
    return currMax;
  }
  

}
