package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
	https://www.hackerrank.com/challenges/happy-ladybugs/problem
	Return whether ladybugs are happy or not
	Author MedinaEn
**/

public class HappyLadybugs {

	public static void main(String[] args) {
		System.out.println(mySolution("___AABBBBFFDSR"));

	}

	private static void mySolution(String b) {
        int[] occurrences = new int[26];
        boolean blankExists = false;
        for(int boardI = 0 ; boardI < b.length() ; boardI++){

            if(b.charAt(boardI) != '_')occurrences[b.charAt(boardI)-'A']++;
            else blankExists = true;
        }
        if(!blankExists){
            if(b.length() < 2) return "NO";
            boolean isHappy = true;
            if(b.charAt(0) != b.charAt(1)) isHappy = false;
            if(b.charAt(b.length()-1) != b.charAt(b.length()-2)) isHappy = false;
            for(int i = 1 ; i < b.length() - 1 ; i++){
                if(b.charAt(i-1) != b.charAt(i) && b.charAt(i) != b.charAt(i+1)){
                    isHappy = false;
                }
            }
            return isHappy ? "YES" : "NO";
        }
        int maxVal = 0;
        for(int i = 0 ; i < 26 ; i++){
            if(occurrences[i] == 1) return "NO";
        }
        return "YES";
    }

}
