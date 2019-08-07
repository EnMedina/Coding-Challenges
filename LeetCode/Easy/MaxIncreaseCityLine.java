package com.enriquemedina.codingchallenges.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/max-increase-to-keep-city-skyline/
 * Return the max increase to city skyline skyscrappers
 * @author MedinaEn
 *
 */
public class MaxIncreaseCitySkyline {

	public static void main(String[] args) {
		System.out.println(mySolution(new int[][]{{3,0,8},{2,4,5},{9,2,6}}));
	}
	
		
	
	static String mySolution(int[][] grid) {
        int[] sideView = new int[grid.length];
        int[] topView = new int[grid[0].length];
        
        for(int y = 0; y < sideView.length ; y++){
            int highestBuilding = 0;
            for(int x = 0  ; x < topView.length; x++){
                highestBuilding = Math.max(highestBuilding,grid[y][x]);
            }
            sideView[y] = highestBuilding;
        }
        
        for(int x = 0; x < topView.length ; x++){
            int highestBuilding = 0;
            for(int y = 0  ; y < sideView.length; y++){
                highestBuilding = Math.max(highestBuilding,grid[y][x]);
            }
            topView[x] = highestBuilding;
        }
        
        int maxAdd = 0;
        for(int y = 0 ; y < sideView.length ; y++){
            for(int x = 0 ; x < topView.length ; x++){
                if(sideView[y] > grid[y][x] && topView[x] > grid[y][x]){
                    maxAdd += Math.min(sideView[y],topView[x]) - grid[y][x];
                }
            }
        }
        
        return maxAdd;
    }
}
