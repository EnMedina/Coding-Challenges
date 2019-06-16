package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BonAppetit {

	public static void main(String[] args) {
		List<Integer> bill = new ArrayList<>(Arrays.asList(new Integer[] {3,10,2,9}));
		mySolution(bill, 1, 12);

	}
	
	static void mySolution(List<Integer> bill, int k , int b) {
		int sum = bill.stream().mapToInt(Integer::intValue).sum();
        int actualBill = (sum - bill.get(k))/2;
        String answer = actualBill == b ? "Bon Appetit" : String.valueOf(b-actualBill);
        System.out.println(answer);
	}

}
