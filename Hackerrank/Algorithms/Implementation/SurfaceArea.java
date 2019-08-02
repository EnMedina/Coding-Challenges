package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * Return the Surface Area of a figure
 * https://www.hackerrank.com/challenges/3d-surface-area/problem
 * @author MedinaEn
 *
 */
public class CavityMap {

	public static void main(String[] args) {
		System.out.println(mySolution(new int[]{{1,3,4},{2,2,3},{1,2,4}}));
	}
	
		
	
	static String mySolution(int[][] A) {
        int surfaceArea = 0;
        for(int y = 0 ; y < A.length ; y++){
            for(int x = 0 ; x < A[0].length ; x++){
                if(A[y][x] != 0) surfaceArea += 2;
                if(y == 0) surfaceArea += A[y][x];
                if(y == A.length - 1) surfaceArea += A[y][x];
                if(x == 0) surfaceArea += A[y][x];
                if(x == A[0].length - 1) surfaceArea += A[y][x];

                if(y > 0 && A[y-1][x] < A[y][x] ) surfaceArea+= A[y][x] - A[y-1][x];
                if(y < A.length-1 && A[y+1][x] < A[y][x] ) surfaceArea+= A[y][x] - A[y+1][x];
                if(x > 0 && A[y][x-1] < A[y][x] ) surfaceArea+= A[y][x] - A[y][x-1];
                if(x < A[0].length-1 && A[y][x+1] < A[y][x] ) surfaceArea+= A[y][x] - A[y][x+1];


            }
        }
        return surfaceArea;
    }
}
