package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/encryption/problem
 * Return encrypted message as per specifications
 * 
 * @author medin
 *
 */
public class EncryptionProblem {

	public static void main(String[] args) {
		System.out.println(mySolution("haveaniceday"));
	}
	
	public static int mySolution(String s) {
        int rows = (int)Math.floor(Math.sqrt(s.length()));
        int cols = (int)Math.ceil(Math.sqrt(s.length()));
        if(rows == cols) rows--;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= rows ; i++){
            for(int j = 0 ; i+j < s.length() ; j+=cols){
                sb.append(s.charAt(i+j));
            }
            sb.append(" ");
        }
        return sb.toString();
    }
	
}
