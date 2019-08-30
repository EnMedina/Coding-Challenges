/**
 * https://leetcode.com/problems/toeplitz-matrix/submissions/
 * Check whether all top left to bottom right diagonals are equal
 * @Author EnMedina
 */

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        //Chec y axis diagonals
        for(int y = 0 ; y < matrix.length - 1 ; y++ ){
            int sameElement = matrix[y][0];
            for(int offset = 0 ; y+offset < matrix.length && offset < matrix[0].length ; offset++){
                if( matrix[y+offset][offset] != sameElement){
                    return false;
                }
            }
        }
        
        //Check x axis diagonals
        for(int x = 1 ; x < matrix[0].length - 1 ; x++ ){
            int sameElement = matrix[0][x];
            for(int offset = 0 ; x+offset < matrix[0].length && offset < matrix.length ; offset++){
                if( matrix[offset][x+offset] != sameElement){
                    return false;
                }
            }
        }
        
        
        
        
        return true;
    }
}
