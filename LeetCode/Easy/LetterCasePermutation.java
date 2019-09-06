package com.enriquemedina.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

	public static void main(String[] args) {
		System.out.println(letterCasePermutation("a1b2"));
		System.out.println(letterCasePermutation("3z4"));
		System.out.println(letterCasePermutation("12345"));
		System.out.println(letterCasePermutation("a12c"));
	}
	
	public static List<String> letterCasePermutation(String s){
		List<String> permutations = new ArrayList<>();
		permutations.add(s);
		for( int i = 0 ; i < s.length() ; i++ ) {
			if( Character.isAlphabetic(s.charAt(i)) ) {
				if( permutations.isEmpty() ) {
					permutations.add(s.substring(0,i) + Character.toLowerCase(s.charAt(i)) + s.substring(i+1) );
					permutations.add(s.substring(0,i) + Character.toUpperCase(s.charAt(i)) + s.substring(i+1) );
				}else {
					int currListLength = permutations.size();
					for(int j = 0 ; j < currListLength ; j++ ) {
						String permutation = permutations.get(j);
						if( Character.isLowerCase(s.charAt(i))) {
							permutations.add(permutation.substring(0,i) + Character.toUpperCase(s.charAt(i)) + permutation.substring(i+1));
						}else {
							permutations.add(permutation.substring(0,i) + Character.toLowerCase(s.charAt(i)) + permutation.substring(i+1));
						}
					}
				}
			}
		}
		
		
		return permutations;
	}

}
