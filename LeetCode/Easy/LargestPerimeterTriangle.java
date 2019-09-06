package com.enriquemedina.leetcode.easy;
import java.util.Arrays;

/**
 * https://leetcode.com/problems/largest-perimeter-triangle/
 * Return the larges possible triangle's perimeter
 * @author EMEDINA
 *
 */

public class LargestPerimeterTriangle{
	
	public static void main(String[] args) {
		System.out.println(largestPerimeter(new int[] {3,6,2,3}));
	}
	
    public static int largestPerimeter(int[] A) {
      Arrays.sort(A);
      for(int i = A.length - 1 ; i >= 2 ; i-- ){
        if( A[i] < A[i-1] + A[i-2] ) return A[i] + A[i-1] + A[i-2];
      }
      return 0;
    }
  
}