package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * https://www.hackerrank.com/challenges/bigger-is-greater/problem
 * Return the lexicographically next string
 * 
 * @author medin
 *
 */
public class BiggerIsGreater{

	public static void main(String[] args) {
		System.out.println(mySolution("abcd"));
	}
	
	public static int mySolution(String w) {
        char[] strArr = w.toCharArray();
        int sortStart = -1;
        char minMax = '{';
        int minMaxI = -1;
        for(int i = strArr.length -2 ; i >= 0 ; i--){
            for(int j = i + 1 ; j < strArr.length ; j++){
                if(strArr[i] < strArr[j]){
                    if(strArr[j] < minMax){
                        minMax = strArr[j];
                        minMaxI = j;
                    }
                }

            }
            if(minMax != '{'){
                    char temp = strArr[i];
                    strArr[i] = minMax;
                    strArr[minMaxI] = temp;
                    sortStart  = i+1;
                    Arrays.sort(strArr,sortStart,strArr.length);
                    return new String(strArr);
            }
        }

        return "no answer";
    }

}
