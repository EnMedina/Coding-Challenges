package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/queens-attack-2/problem
 * Return the possible moves of a queen
 * 
 * @author medin
 *
 */
public class QueensAttack {

	public static void main(String[] args) {
		//TODO
	}
	
	public static int mySolution(int boardSize, int nObstacles, int y, int x, int[][] obstacles) {
       int[] distance = new int[8];
        distance[0] = x-1;
        distance[1] = boardSize - x;
        distance[2] = y-1;
        distance[3] = boardSize - y;
        distance[4] = Math.min(x,y) - 1;
        distance[5] = boardSize - Math.max(x,y);
        distance[6] = Math.min(x,y) - 1;
        distance[7] = boardSize - Math.max(x,y);


       for(int[] obs : obstacles){

           //Spots 0 and 1 will be x closeness
           if(obs[0] == y){
               if(obs[1] > x){
                distance[1] = Math.min(distance[1], obs[1]-x-1);
               }else if(obs[1] < x){
                distance[0] = Math.min(distance[0], x-obs[1]-1);
               }
           }
           //Spots 2 and 3 will be y closeness
            if(obs[1] == x){
               if(obs[0] > y){
                distance[3] = Math.min(distance[3], obs[0]-y-1);
               }else if(obs[0] < y){
                distance[2] = Math.min(distance[2], y-obs[0]-1);
               }
           }
           
       }
       System.out.println(Arrays.toString(distance));
       return -1;
    }
	
}
