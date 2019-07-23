package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/beautiful-triplets/problem
 * Return the number of beautiful triplets in an array
 * 
 * @author medin
 *
 */
public class BeautifulTriplets{

	public static void main(String[] args) {
		System.out.println(mySolution(3,new int{1,2,4,5,7,8,10}));
	}
	
	public static int mySolution(int d, int[] arr) {
        Map<Integer,Integer> seen = new HashMap<>();
        for( int element : arr) {
            if(seen.keySet().contains(element)){
                seen.put(element,seen.get(element) + 1);
            }else{
                seen.put(element,1);
            }
        }
        int occurrences = 0 ;
        for(int j = 1 ; j < arr.length-1 ; j++){
            if(seen.keySet().contains(arr[j]-d) && seen.keySet().contains(d + arr[j])){
                occurrences += seen.get(arr[j] - d) * seen.get(d + arr[j]);
            } 
        }
        return occurrences;
    }

}
