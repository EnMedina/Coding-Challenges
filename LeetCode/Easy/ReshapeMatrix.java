/**
 *  https://leetcode.com/problems/reshape-the-matrix/submissions/
 *  Return a reshaped Matrix if possible
 *  @Author EnMedina
 */

class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
      if( r * c != nums.length * nums[0].length) return nums;
      int[][] reshapedMatrix = new int[r][c];
      int origY = 0; 
      int origX = 0;
      for( int y = 0 ; y < r ; y++ ){
        for( int x = 0 ; x < c ; x++ ){
          if( origX == nums[0].length){
            origX = 0;
            origY++;
          }
          reshapedMatrix[y][x] = nums[origY][origX++];
        }
      }
      
      return reshapedMatrix;
      
    }
}
