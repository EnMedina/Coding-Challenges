package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/cut-the-sticks/problem
 * Return sticks remaining before a cut is done
 * 
 * @author medin
 *
 */
public class CutTheSticks {

	public static void main(String[] args) {
		System.out.println(mySolution(new int[]{1,2,3,4,3,3,2,1}));
	}
	
	public static int mySolution(int[] arr) {
        int remainingSticks = arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> remainingList = new ArrayList<>();
        remainingList.add(remainingSticks);
        for(int i = 0 ; i < arr.length ; i++){
            remainingSticks--;
            while( i < arr.length - 1 && arr[i] == arr[i+1]){
                remainingSticks--;
                i++;
            }
            remainingList.add(remainingSticks);
        }
        remainingList.remove(remainingList.size()-1);
        return remainingList.stream().mapToInt(n -> n).toArray();
    }
	
}
