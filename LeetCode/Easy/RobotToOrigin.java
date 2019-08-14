package com.enriquemedina.codingchallenges.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/defanging-an-ip-address/
 * Given a valid IP address return a defanged version of it
 * @author MedinaEn
 *
 */
public class RobotToOrigin { 

	public static void main(String[] args) {
		System.out.println(mySolution("LLLLLLLLLLL"));
	}



	static String mySolution(String moves) {
		int xMov = 0;
		int yMov = 0;
		for(int i = 0 ; i < moves.length() ; i++){
			if( moves.charAt(i) == 'U') yMov++;
			else if( moves.charAt(i) == 'D' ) yMov--;
			else if( moves.charAt(i) == 'L') xMov++;
			else if( moves.charAt(i) == 'R' ) xMov--;
		}
		return yMov == 0 && xMov == 0;
	}
}	
