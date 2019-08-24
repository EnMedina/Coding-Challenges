/**
 *	https://leetcode.com/problems/projection-area-of-3d-shapes/submissions/
 * 	Return the projection area of a shape
 * 	@Author EnMedina
 */


class Solution {
    public int projectionArea(int[][] grid) {
        int topSide = 0;
        int xSide = 0;
        int ySide = 0;
        
        //Top side can just be all the heights != 0 
        //xSide is top per column
        for(int[] row : grid){
            int maxRow = 0;
            for( int value : row ){
                if(value != 0) topSide ++;
               maxRow = Math.max(maxRow,value);
            }
            xSide += maxRow;
        }
        
        //ySide is top per row
       for( int i = 0 ; i < grid[0].length ; i++ ){
           int maxCol = 0;
           for( int j = 0 ; j < grid.length ; j++){
              maxCol =  Math.max(maxCol, grid[j][i]);              
           }
           ySide += maxCol;
       } 
       // System.out.println("Values are : " +topSide + " top, " + xSide + " xSide, " + ySide + " ySide.");
        return topSide + xSide + ySide;
    }
}
