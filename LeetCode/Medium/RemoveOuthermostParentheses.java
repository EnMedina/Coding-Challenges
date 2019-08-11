package com.enriquemedina.codingchallenges.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/remove-outermost-parentheses
 * Remove outhermost parentheses from groups of them
 * @author MedinaEn
 *
 */
public class RemoveOutermostParentheses {

	public static void main(String[] args) {
		System.out.println(mySolution("()(())"));
	}
	
		
	
	static String mySolution(String S) {
        int openBraces = 0;
        int startIndex = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < S.length() ; i++){
            if(S.charAt(i) == '('){
                openBraces++;
            }
            else{
                openBraces--;
            }
            if(openBraces == 0){
                sb.append(S.substring(startIndex+1,i));
                startIndex = i+1;
            }
        }
        return sb.toString();
    }
}
