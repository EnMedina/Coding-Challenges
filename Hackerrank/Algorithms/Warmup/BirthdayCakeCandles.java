package com.enriquemedina.codingchallenges.hackerrank.algorithms.warmup;

import java.util.TreeMap;
/**
 * Return the number of tallest candles
 * https://www.hackerrank.com/challenges/birthday-cake-candles/
 * @author medin
 *
 */
public class BirthdayCakeCandles {
	public static void main(String[] args) {
		System.out.println(new int[] {3, 2, 1, 3});
	}
	
	public static int mySolution(int[] ar) {
		TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        for(int number : ar){
            if(treeMap.containsKey(number)){
                treeMap.put(number,treeMap.get(number)+1);
            }
            else{
                treeMap.put(number,1);
            }
        }
        return treeMap.get(treeMap.lastKey());
	}
}
