package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * Determine cost to turn an array into a magic square
 * https://www.hackerrank.com/challenges/magic-square-forming/problem
 * @author medin
 *
 */
public class MagicSquareForming {

	public static void main(String[] args) {
		System.out.println(mySolution(new int[]{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}});

	}
	
	static int[][][] magicSquares = new int[][][]{
            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}, 
            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}, 
            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}}, 
            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
			} ;

    static int mySolution(int[][] s) {
        int minCost = Integer.MAX_VALUE;
        for(int[][] currSq : magicSquares){
            int currCost = 0;
            for(int i = 0 ; i < 3 ; i++){
                for(int j = 0 ; j < 3 ; j++){
                    if(currSq[i][j] != s[i][j]){
                        currCost += Math.abs(s[i][j]-currSq[i][j]);
                    }
                }
            }
            minCost = Math.min(currCost,minCost);
        }
        return minCost;
    }
}
