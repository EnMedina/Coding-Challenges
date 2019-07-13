package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/append-and-delete/problem
 * Return whether String transformation is possible
 * 
 * @author medin
 *
 */
public class UtopianTree {

	public static void main(String[] args) {
		System.out.println(mySolution("ashley","ash",2));
	}
	
	public static int mySolution(String s, String t, int k) {
        if(Math.abs(s.length()-t.length()) > k) return "No";
        if(k >= s.length() + t.length()) return "Yes";


        // Get the minimum characters we need to delete
        int minDeletions = 0;
        boolean foundDif = false;
        for(int i = 0 ; i<s.length() && !foundDif ; i++){
            // In this case we don't need deletions
            // But the number of k should be even
            if(i == t.length() || s.charAt(i) != t.charAt(i)){
                minDeletions = s.length() - i;
                foundDif = true;
            }
        }
        System.out.println("We need to delete at least " + minDeletions + " characters");
        int equalStringLength = s.length() - minDeletions;
        k -= minDeletions; // We subract what needs to be deleted from remaining moves
        k -= t.length() - equalStringLength;  //- needed characters to reach t
        if(k < 0) return "No";
        return k % 2 == 0 ? "Yes" : "No";

    }
	
}
