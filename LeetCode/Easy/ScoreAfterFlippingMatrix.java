/**
 *  https://leetcode.com/problems/score-after-flipping-matrix/submissions/
 *  Return the score after flipping rows and columns of a Matrix
 *  @Author EnMedina
 */

class Solution {
    public int matrixScore(int[][] A) {
        int nRows = A.length;
        int nCols = A[0].length;
        int currPow = (int)Math.pow(2,nCols-1);
        int totalSum = nRows*currPow;
        
        // Transform the matrixes to have msb 1
        for( int currRow = 0 ; currRow < nRows ; currRow++ ){
            if( A[currRow][0] == 0 ){
                for( int i = 0 ; i < nCols ; i++ ){
                    A[currRow][i] = A[currRow][i] == 0 ? 1 : 0;
                }
            }
        }

        for( int i = 1 ; i < nCols ; i++ ){
            currPow /= 2;
            int colZeros = 0;
            int colOnes  = 0;
            for( int currRow = 0 ; currRow < nRows ; currRow++ ){
                if( A[currRow][i] == 1){
                    colOnes++;
                }else{
                    colZeros++;
                }
            }
            totalSum += Math.max(colOnes,colZeros)*currPow;
        }
        return totalSum;
    }
}
