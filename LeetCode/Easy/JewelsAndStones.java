package com.enriquemedina.codingchallenges.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/jewels-and-stones/submissions/
 * Return the number of stones I have that are also jewels
 * @author MedinaEn
 *
 */
public class JewelsAndStones {

	public static void main(String[] args) {
		System.out.println(mySolution("aA","aAAbbbb"));
	}
	
		
	
	static String mySolution(String J, String S) {
        Set<Character> jewelStones = new HashSet<>();
        for( char c : J.toCharArray()){
            jewelStones.add(c);
        }
        int jewelCount = 0;
        for(char c : S.toCharArray()){
            if(jewelStones.contains(c))jewelCount++;
        }
        return jewelCount;
    }
}
