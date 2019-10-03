/**
 *  https://leetcode.com/problems/image-smoother/submissions/
 *  Return an average of the surrounding pixels
 *  @Author EnMedina
 */

class Solution {
    public int[][] imageSmoother(int[][] M) {
        int[][] N = new int[M.length][M[0].length];
        for( int y = 0 ; y < M.length ; y++ ){
            for( int x =  0 ; x < M[0].length ; x++ ){
                N[y][x] = averageSurrounding(M, y, x);
            }
        }
        return N;
    }
    
    private int averageSurrounding(int[][] M , int y , int x){
        int average = M[y][x];
        int count = 1;
        if( y > 0 ){
            count++;average+=M[y-1][x];
            if( x > 0 ){count++;average+=M[y-1][x-1];}
            if( x < M[0].length-1){count++;average+=M[y-1][x+1];}
        }
        
        if( y < M.length - 1 ){
            count++;
            average+=M[y+1][x];
            if( x > 0 ){count++;average+=M[y+1][x-1];}
            if( x < M[0].length-1){count++;average+=M[y+1][x+1];}
        }
        
        if( x > 0 ){count++;average+=M[y][x-1];}
        if( x < M[0].length-1 ){count++;average+=M[y][x+1];}
        
        
        
        return average/count;
    }
}
