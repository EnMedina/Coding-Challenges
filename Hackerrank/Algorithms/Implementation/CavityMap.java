package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * Map the Cavities with an "X"
 * https://www.hackerrank.com/challenges/cavity-map/problem
 * @author MedinaEn
 *
 */
public class CavityMap {

	public static void main(String[] args) {
		System.out.println(mySolution(new String[]{"1112","1912","1892","1234"}));
	}
	
		
	
	static String mySolution(String[] gr) {
        char[][] c = new char[gr.length][gr[0].length()];
        for(int i = 0 ; i < gr.length ; i++){
            c[i] = gr[i].toCharArray();
        }

        for(int y = 1 ; y < c.length-1 ; y++){
            for(int x = 1 ; x < c[0].length - 1 ; x++){
                int maxVal = Math.max(Math.max(c[y+1][x],c[y-1][x]),Math.max(c[y][x+1],c[y][x-1]));
                if(c[y][x] > maxVal) c[y][x] = 'X';
            }
        }

        for(int i = 0 ; i < gr.length ; i++){
            gr[i] = new String(c[i]);
        }
        return gr;
    }
}
