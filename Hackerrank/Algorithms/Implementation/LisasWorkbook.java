package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * Return the number of problems in their same page
 * https://www.hackerrank.com/challenges/lisa-workbook/problem
 * @author MedinaEn
 *
 */
public class LisaWorkbook{

	public static void main(String[] args) {
		System.out.println(mySolution(1120);
	}
	

    static int mySolution(int n, int k, int[] arr) {
        int nSpProblems = 0;
        int currPage = 1;
        for(int chapterI = 0 ; chapterI < arr.length ; chapterI++){
            for(int problemN = 1 ; problemN <= arr[chapterI] ; problemN++){
                if(problemN == currPage) nSpProblems++;
                if(problemN % k == 0)currPage++;
            }
            if(arr[chapterI] % k != 0) currPage++;
        }
        return nSpProblems;
    }
}
