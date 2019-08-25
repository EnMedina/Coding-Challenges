/**
 *  https://leetcode.com/problems/reverse-words-in-a-string-iii/submissions/
 *  Given a string return it with each word reversed
 *  @Author EnMedina
 */

class Solution {
	public String reverseWords(String s) {
		String[] words = s.split(" ");
		StringBuilder reversedWords = new StringBuilder();
		StringBuilder currWord ;
		for(String word : words){
			currWord = new StringBuilder(word);
			reversedWords.append(currWord.reverse().toString()+" ");
		}
		return reversedWords.substring(0,reversedWords.length()-1);
	}
}
