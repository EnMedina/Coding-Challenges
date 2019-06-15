package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthdayBar {

	public static void main(String[] args) {
		List<Integer> s = new ArrayList<>(Arrays.asList(new Integer[]{1, 2, 1, 3, 2}));
		System.out.println(mySolution(s,3,2));

	}
	
	public static int mySolution(List<Integer> s, int d, int m) {
		if(s == null || s.size() < m) return 0;
        int currSum = 0;
        int numOcurrences = 0;
        for(int i = 0 ; i < m ; i++){
            currSum += s.get(i);
        }
        if(currSum == d) numOcurrences++;
        for(int i = m ; i < s.size() ; i++){
            currSum -= s.get(i-m);
            currSum += s.get(i);
            if(currSum == d) numOcurrences++;
            //System.out.println(currSum);
        }

        return numOcurrences;
	}

}
