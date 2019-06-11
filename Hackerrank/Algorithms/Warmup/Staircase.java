package com.enriquemedina.codingchallenges.hackerrank.algorithms.warmup;
/**
 * 
 */
import java.util.Arrays;

/**
 * Write a program that prints a staircase of size n
 * @author Enrique Medina
 *
 */
public class Staircase {
	public static void main(String[] args) {
		mySolution(3);
		mySolution(6);
		mySolution(1);
	}
	
	public static void mySolution(int n) {
		char[] arr = new char[n];
		Arrays.fill(arr, ' ');
		for(int i = 1 ; i <= n ; i++) {
			arr[n-i] = '#';
			System.out.println(Arrays.toString(arr));
		}

	}
}
