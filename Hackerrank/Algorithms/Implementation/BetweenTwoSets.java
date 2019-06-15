package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * https://www.hackerrank.com/challenges/between-two-sets/problem
 * @author medin
 *
 */
public class BetweenTwoSets {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();
		a.addAll(Arrays.asList(new Integer[]{2,4}));
		b.addAll(Arrays.asList(new Integer[]{16,32,96}));
		System.out.println(mySolution(a,b));
		

	}
	
	 public static int mySolution(List<Integer> a, List<Integer> b) {
		    Collections.sort(a);
		    Collections.sort(b);
		    int maxPossible = b.get(0);
		    int minPossible = a.get(a.size()-1);

		    int numberTested = minPossible;
		    int validNumber = 0;
		    while(numberTested <= maxPossible){
		        boolean valid = true;
		        for( int i : a){
		            if(numberTested%i != 0){
		                valid = false;
		                break;
		            }
		        }
		        if(valid){
		            for(int i : b){
		                if(i%numberTested != 0){
		                    valid = false;
		                    break;
		                }
		            }
		        }
		        validNumber += valid ? 1 : 0;
		        numberTested += minPossible;
		    }
		    
		    return validNumber;
		    }
}
