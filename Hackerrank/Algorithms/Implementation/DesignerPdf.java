package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
 * Calculate the area of the rectangle of highlited letters
 * @author medin
 *
 */
public class DesignerPdf {

	public static void main(String[] args) {
		int[] h = new int[]{1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7};
		System.out.println(mySolution(h,"abc");
	}
	
	public static int[] mySolution(int[] h, String word) {
        int maxHeight = 0;
        for(int i = 0 ; i < word.length() ; i++){
            maxHeight = Math.max(maxHeight, h[word.charAt(i)-'a']);
        }
        return maxHeight*word.length();
    }
	
}
