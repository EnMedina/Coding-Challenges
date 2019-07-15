package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/repeated-string/problem
 * Return the number of occurrences of 'a' in a repeated String
 * 
 * @author medin
 *
 */
public class RepeatedString {

	public static void main(String[] args) {
		System.out.println(mySolution("a",1000000000000));
	}
	
	public static int mySolution(String s, long n) {
        int[] occurrencesSoFar = new int[s.length()];
        int occurrencesInString = 0;
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == 'a') occurrencesInString++;
            occurrencesSoFar[i] = occurrencesInString;
        }
        long answer = occurrencesInString * (n/s.length());
        answer += n%s.length() == 0 ? 0 : occurrencesSoFar[(int)(-1 + n%s.length())];
        return answer;
    }
	
}
