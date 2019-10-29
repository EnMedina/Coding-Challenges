
/**
 * https://leetcode.com/problems/rotting-oranges/
 * Return how long it would take for all oranges to rot
 * @author EMEDINA
 *
 */
class Solution {
  public int orangesRotting(int[][] grid) {
   boolean gridHasChanged = true;
   boolean goodApples = true;
   int nMinutes = 0;
   while( gridHasChanged ) {
     if( !goodApplesExist(grid) ) return nMinutes;
     gridHasChanged = false;
     for( int y = 0 ; y < grid.length ; y++ ) {
       for( int x = 0 ; x < grid[0].length ; x++ ) {
         if( grid[y][x] == 2 ) {
           if( x > 0 && grid[y][x-1] == 1) { 
             grid[y][x-1] = 3;
             gridHasChanged = true;
           }
           
           if( y > 0 && grid[y-1][x] == 1) {
             grid[y-1][x] = 3;
             gridHasChanged = true;
           }
           if( x < grid[0].length-1 && grid[y][x+1] == 1) {
             grid[y][x+1] = 3;
             gridHasChanged = true;
           }
           if( y < grid.length-1 && grid[y+1][x] == 1) {
             grid[y+1][x] = 3;
             gridHasChanged = true;
           }
         }
       }
     }
     
     for( int y = 0 ; y < grid.length ; y++ ) {
       for( int x = 0 ; x < grid[0].length ; x++ ) {
         if( grid[y][x] == 3) grid[y][x] = 2;
       }
     }
     nMinutes++;
   }
   return -1;
 }
 
 private boolean goodApplesExist( int[][] grid ) {
   for( int y = 0 ; y < grid.length ; y++ ) {
     for( int x = 0 ; x < grid[0].length ; x++ ) {
       if( grid[y][x] == 1) return true;
     }
   }
   
   return false;
 }
}
