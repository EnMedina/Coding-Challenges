
/**
 * https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
 * Add the values to a colums and rows as specified
 * @author EMMEDINA
 */

class Solution {
    public int oddCells(int n, int m, int[][] indices) {
    	int[] rowIncreases = new int[n];
    	int[] colIncreases = new int[m];
    	for( int[] increase : indices) {
    		rowIncreases[increase[0]]++;
    		colIncreases[increase[1]]++;
    	}
    	int rowIncreaseOddNum = 0;
    	for( int num : rowIncreases) {
    		if( num % 2 == 1 ) rowIncreaseOddNum++;
    	}
    	
    	int totalOddNumbers = 0;
    	for( int num : colIncreases) {
    		totalOddNumbers += num % 2 == 0 ? rowIncreaseOddNum : n-rowIncreaseOddNum;
    	}
     
    	return totalOddNumbers;
    }
}
