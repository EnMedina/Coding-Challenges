package com.enriquemedina.codingchallenges.hackerrank.algorithms.implementation;

public class DayOfTheProgrammer {
	public static void main(String[] args) {
		System.out.println(mySolution(1918));
	}
	
	private static String mySolution(int year) {
		if(year == 1918) return "26.09.1918";
        if(year < 1917 && year % 4 == 0) return "12.09."+String.valueOf(year);
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            return "12.09."+String.valueOf(year);
        } else{
            return "13.09."+String.valueOf(year);
        }
	}
}
