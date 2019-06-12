package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

public class AppleAndOrange {

	public static void main(String[] args) {
		mySolution(7,11,5,15,new int[] {-2,2,1},new int[] {5,-6});

	}

	private static void mySolution(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int applesOnHouse = 0;
        int orangesOnHouse = 0;
        for(int apple : apples){
            if( (apple + a) >= s && (apple + a) <=t ) applesOnHouse++;
        }
        for(int orange : oranges){
            if( ( b + orange) >= s && (b + orange) <=t ) orangesOnHouse++;
        }
        System.out.println(applesOnHouse);
        System.out.println(orangesOnHouse);
    }

}
