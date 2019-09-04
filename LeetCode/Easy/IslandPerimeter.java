/**
 *  https://leetcode.com/problems/island-perimeter/submissions/
 *  Return the island perimeter
 *  @Author EnMedina
 */

class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for(int y = 0 ; y < grid.length ; y++){
            for( int x = 0 ; x < grid[0].length ; x++ ){
               if(grid[y][x] == 1){
                   if(x == 0 || grid[y][x-1] == 0) perimeter++;
                   if(y == 0 || grid[y-1][x] == 0) perimeter++;
                   if(x == grid[0].length-1 || grid[y][x+1] == 0) perimeter++;
                   if(y == grid.length-1 || grid[y+1][x] == 0) perimeter++;
                   
               } 
            }
        }
        return perimeter;
    }
}
