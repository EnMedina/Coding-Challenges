package com.enriquemedina.codingchallenges.hackerrank.algorithms.warmup;

public class TimeConversion {

	public static void main(String[] args) {
		System.out.println(mySolution("07:01:33PM"));

	}
	
	public static String mySolution(String s) {
		int hour = Integer.parseInt(s.substring(0,2));
        if(s.substring(8,10).equals("PM") && !s.substring(0,2).equals("12")){
            hour += 12;
        }
        if(s.substring(8,10).equals("AM") && s.substring(0,2).equals("12")){
            hour = 0;
        }
        String hourString = String.valueOf(hour);
        if(hourString.length() == 1) hourString = "0" + hourString;

        return hourString + s.substring(2,8);
	}
}
