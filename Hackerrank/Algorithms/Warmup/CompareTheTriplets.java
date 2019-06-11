package com.enriquemedina.codingchallenges.hackerrank.algorithms.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Return an array of two integers denoting the respective comparison points earned by Alice and Bob.
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 * @author medin
 *
 */
public class CompareTheTriplets {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(5);
		a.add(6);
		a.add(7);
		List<Integer> b = new ArrayList<>();
		b.add(3);
		b.add(6);
		b.add(10);
		System.out.println(Arrays.toString(mySolution(a,b)));
		
	}
	
	public static int[] mySolution(List<Integer> a, List<Integer> b ) {
		int[] pointsArr = new int[2];
		if(a.get(0) > b.get(0)) pointsArr[0]++;
		if(a.get(1) > b.get(1)) pointsArr[0]++;
		if(a.get(2) > b.get(2)) pointsArr[0]++;
		if(b.get(0) > a.get(0)) pointsArr[1]++;
		if(b.get(1) > a.get(1)) pointsArr[1]++;
		if(b.get(2) > a.get(2)) pointsArr[1]++;
		
		return pointsArr;
	}

}
