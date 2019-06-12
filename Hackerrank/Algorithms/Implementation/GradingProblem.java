package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

import java.util.Arrays;
/**
 * Given initial value of grade automate rounding up
 * https://www.hackerrank.com/challenges/grading
 * @author medin
 *
 */
public class GradingProblem {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(mySolution(new int[] {73, 67, 38, 33})));
	}
	
	public static int[] mySolution(int[] grades) {
		for(int i = 0 ; i < grades.length ; i++){
            if(grades[i] >= 38 && grades[i] % 5 >= 3) grades[i]+= 5 - grades[i]%5;
        }
        return grades;
	}

}
