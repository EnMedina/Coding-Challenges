package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/circular-array-rotation/problem
 * Return new positions after array rotation
 * 
 * @author medin
 *
 */
public class CircularArrayRotation {

	public static void main(String[] args) {
		System.out.println(mySolution(new int[]{1,2,3},2,new int[]{0,1,2});
	}
	
	public static int mySolution(int[] arr, int rotations, int[] queries) {
       int[] ansArr = new int[queries.length];
       rotations = rotations % arr.length;

       for(int i = 0; i < queries.length ; i++){
           //System.out.println("The index we want to know is: " +queries[i]);
           int rotatedIndex = queries[i] - rotations;
           //System.out.println("The rotated index will be: " + rotatedIndex );
           if(rotatedIndex < 0) rotatedIndex += arr.length;
           System.out.println("Final Index will be : " + rotatedIndex);
           ansArr[i] = arr[rotatedIndex];
       }
       return ansArr;
    }


	
}