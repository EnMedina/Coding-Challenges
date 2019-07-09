package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
 * Print out Alice's current place in the leaderboard
 * @author medin
 *
 */
public class safdadsfdsa {

	public static void main(String[] args) {
		System.out.println(mySolution(new int[]{100,100,50,40,40,20,10},new int[]{5,25,50,100});
	}
	
	public static int[] mySolution(int[] scores, int[] alice) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i : scores){
            set.add(i);
        }

        int[] scoresForPlace = new int[set.size()];
        Iterator<Integer> iterator = set.descendingIterator();
        for(int i = 0 ; i < set.size() ; i++){
            scoresForPlace[i] = iterator.next();
        }

        int currPlace = scoresForPlace.length - 1;
        for(int i = 0 ; i < alice.length ; i++){
            int currScore = alice[i];
            if(currPlace == -1){
                alice[i] = 1;
            }
            else{    
                while(currPlace >= 0 && currScore >= scoresForPlace[currPlace]){
                    currPlace--;
                }
                alice[i] = currPlace + 2;
            }
        }



        System.out.println(Arrays.toString(scoresForPlace));

        return alice;
    }
	
}
