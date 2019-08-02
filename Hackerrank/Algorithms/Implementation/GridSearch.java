package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * hhttps://www.hackerrank.com/challenges/the-grid-search/problem
 * Return whether a pattern occurs in a 2d array of chars
 * 
 * @author MedinaEn
 *
 */
public class GridSearch {

	public static void main(String[] args) {
		System.out.println(mySolution(4,10,100});
	}
	
	public static int mySolution(String[] G, String[] P) {
        int matches = 0;
        for(int y = 0 ; matches == 0 && y <= G.length - P.length ; y++){
            for(int x = 0 ;matches == 0 && x <= G[0].length() - P[0].length(); x++){
                if(G[y].charAt(x) == P[0].charAt(0)){
                    int pY = 1;
                    int pX = 0;
                    while(G[y+pY].charAt(x+pX) == P[pY].charAt(pX)){
                        if(pY == P.length-1 && pX == P[0].length()-1){
                             matches++;
                             break;
                    }
                        else if(pY == P.length-1){
                            pY = 0;
                            pX++;
                        }
                        else{
                            pY++;
                        }
                    }
                }
            }
        }
        return matches == 0 ? "NO" : "YES";
    }
}




