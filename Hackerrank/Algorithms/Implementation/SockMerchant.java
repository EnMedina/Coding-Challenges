package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;
/**
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 * @author medin
 *
 */
public class SockMerchant {
	public static void main(String[] args) {
		System.out.println(mySolution(new int[] {10,20,20,10,10,30,50,10,20}));
	}
	
	static int mySolution(int[] ar) {
		boolean[] foundRight = new boolean[100];
        int pairCount = 0;
        for(int sock : ar){
            if(foundRight[sock-1]){
                pairCount++;
                foundRight[sock-1] = false;
            }else{
                foundRight[sock-1] = true;
            }
        }
        return pairCount;
	}
}
