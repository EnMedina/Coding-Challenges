package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/manasa-and-stones/problem
 * Return the permutations possible of stones given the two possible jumps
 * 
 * @author MedinaEn
 *
 */
public class ManasaStones {

	public static void main(String[] args) {
		System.out.println(mySolution(4,10,100});
	}
	
	public static int mySolution(int n, int a, int b) {
        SortedSet<Integer> possibleSums = new TreeSet<>();
        for(int i = 0 ; i < n-1 ; i++){
            possibleSums.add((a*i)+ (b*(n-i-1)));
            possibleSums.add(b*i + (a*(n-i-1)));
        }
        return  possibleSums.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();


    }

	
}




