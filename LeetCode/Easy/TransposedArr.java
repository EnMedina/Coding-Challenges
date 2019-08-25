/**
 *  https://leetcode.com/problems/transpose-matrix/submissions/
 *  Return a transposed array
 *  @Author EnMedina
 */

class Solution {
	public int[][] transpose(int[][] A) {
		int[][] transposedArr = new int[A[0].length][A.length];
		for(int y = 0 ; y < A.length ; y++ ){
			for( int x = 0 ; x < A[0].length ; x++ ){
				transposedArr[x][y] = A[y][x];
			}
		}
		return transposedArr;
	}
}
