package com.enriquemedina.codingchallenges.leetcode.algorithms.easy;

/**
 * hhttps://leetcode.com/problems/unique-morse-code-words/
 * Return the number of unique morse code words
 * @author MedinaEn
 *
 */
public class UniqueMorseCodes {

	public static void main(String[] args) {
		System.out.println(mySolution(new String[]{"gin","gym","him","taco"}));
	}
	
		
	
	static String mySolution(String[] words) {
        String[] morseMapping = new String[]{".-","-...","-.-.","-..",".","..-.","--." ,"....","..",".---","-.-",
                                                    ".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
                                                    ".--","-..-","-.--","--.."};
        Set<String> transformations = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            for(char c : word.toCharArray()){
                sb.append(morseMapping[c-'a']);
            }
            transformations.add(sb.toString());
            sb = new StringBuilder();
        }
        /*for(String s : transformations){
            System.out.println(s);
        }*/
        return transformations.size();
    }
}
