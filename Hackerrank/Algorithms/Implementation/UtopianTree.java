package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/utopian-tree/problem
 * Tree doubles size and then grows by 1 after a cycle, what is the height
 * after n cycles
 * @author medin
 *
 */
public class UtopianTree {

	public static void main(String[] args) {
		System.out.println(mySolution(5);
	}
	
	public static int mySolution(int n) {
        boolean doubleHeight = true;
        int treeHeight = 1;
        while(n != 0){
            n--;
            treeHeight += doubleHeight ? treeHeight : 1;
            doubleHeight ^= true;
        }
        return treeHeight;
    }
	
}




