package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

public class DivisibleSumPairs {
	public static void main(String[] args) {
		System.out.println(mySolution(3, new int[] {1,3,2,6,1,2}));
	}
	
	static int mySolution(int k , int[] ar) {
		int[] mod = new int[k];
        for(int i = 0 ; i < ar.length ; i++){
            mod[ar[i]%k]++;
        }
        int countPairs = 0;
        for(int i = 0 ; i < ar.length ; i++){
            int curMod = ar[i] % k ;
            if(curMod == 0 || curMod * 2 == k){
                countPairs += mod[curMod]-1;
            } else{
                countPairs += mod[k-curMod];
            }
            mod[curMod]--;
        }
        return countPairs;
	}
}
