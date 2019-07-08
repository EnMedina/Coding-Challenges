package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * Print the highest amount that can be spent on a keyboard and drive -1 if not possible.
 * https://www.hackerrank.com/challenges/electronics-shop/problem
 * @author medin
 *
 */
public class ElectronicsShop {

	public static void main(String[] args) {
		System.out.println(mySolution(new int[]{3,1},new int[]{5, 2, 8},10);

	}
	
	static int mySolution(int[] keyboards, int[] drives, int b) {
        Arrays.sort(drives);
        Arrays.sort(keyboards);

        int maxSum = drives[0] + keyboards[0];
        if(maxSum > b) return -1;
        if(maxSum == b) return b;
        int maxKeyboardI = keyboards.length - 1;
        for(int i = 0 ; i < drives.length ; i++){
            while(maxKeyboardI >= 0 && drives[i] + keyboards[maxKeyboardI] > b)maxKeyboardI--;
            if(maxKeyboardI < 0) return maxSum;
            maxSum = Math.max(maxSum,drives[i] + keyboards[maxKeyboardI]);
            if(maxSum == b) return b;
        }
        return maxSum;

    }
}
