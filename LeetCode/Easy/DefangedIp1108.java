package com.enriquemedina.codingchallenges.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/defanging-an-ip-address/
 * Given a valid IP address return a defanged version of it
 * @author MedinaEn
 *
 */
public class DefangedIp1108 {

	public static void main(String[] args) {
		System.out.println(mySolution("122.71.3.1"));
	}
	
		
	
	static String mySolution(String address) {
        return address.replace(".","[.]");
    }
}
