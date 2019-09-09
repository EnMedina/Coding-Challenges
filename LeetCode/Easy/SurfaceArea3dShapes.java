/**
 *  https://leetcode.com/problems/surface-area-of-3d-shapes/submissions/
 *  REturn the surface area of a 3d shape
 *  @Author EnMedina
 */

class Solution {
    public int surfaceArea(int[][] grid) {
        int totalSurfaceArea = 0;
        for(int y = 0 ; y < grid.length ; y++ ){
            for( int x = 0 ; x < grid[0].length ; x++ ){
                //First getting the z axis area
                if( grid[y][x] != 0 ) totalSurfaceArea+=2;
                //Exposed right
                if( y == grid.length - 1){
                    totalSurfaceArea += grid[y][x];
                }else{
                    if( grid[y][x] > grid[y+1][x] ) totalSurfaceArea += grid[y][x] - grid[y+1][x];
                    
                }
                //Exposed left
                if( y == 0){
                    totalSurfaceArea += grid[y][x];
                }else{
                    if( grid[y][x] > grid[y-1][x] ) totalSurfaceArea += grid[y][x] - grid[y-1][x];
                    
                }
                //Exposed Up
                if( x == 0){
                    totalSurfaceArea += grid[y][x];
                }else{
                    if( grid[y][x] > grid[y][x-1] ) totalSurfaceArea += grid[y][x] - grid[y][x-1];
                    
                }
                //Exposed Down
                if( x == grid[0].length - 1){
                    totalSurfaceArea += grid[y][x];
                }else{
                    if( grid[y][x] > grid[y][x+1] ) totalSurfaceArea += grid[y][x] - grid[y][x+1];
                }
                
       
            }
        }
        return totalSurfaceArea;
    }
}
