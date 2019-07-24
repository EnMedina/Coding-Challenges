package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

/**
 * Return the time in a String
 * https://www.hackerrank.com/challenges/the-time-in-words/problem
 * @author medin
 *
 */
public class TimeInWords {

	public static void main(String[] args) {
		System.out.println(mySolution(12, 58));
	}
	
		
	
	static String mySolution(int h, int m) {
        String[] hourText = new String[]{"one","two","three","four","five","six","seven","eight",
        "nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen",
        "nineteen","twenty"};
        
        
        
        if(m == 0) return hourText[h-1] + " o' clock";
        if(m == 15) return "quarter past " + hourText[h-1];
        if(m == 30) return "half past " + hourText[h-1];
        if(m == 45) return "quarter to " + hourText[h];
        if(m < 30){
            if(m == 1) return "one minute past " + hourText[h-1];
            if( m <= 20) return hourText[m-1] + " minutes past " + hourText[h-1];
            return "twenty " + hourText[m -20 - 1] + " minutes past " + hourText[h-1];
        }
        else{
            m = 60 - m;
            if(m == 1) return "one minute to " + hourText[h];
            if(m <= 20) return hourText[m-1] + " minutes to " + hourText[h];
            return "twenty " + hourText[m - 20 - 1] + " minutes to " + hourText[h];
        }
    }
}
