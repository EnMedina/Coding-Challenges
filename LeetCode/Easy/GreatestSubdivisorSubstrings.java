/**
 * https://leetcode.com/problems/greatest-common-divisor-of-strings/
 * Return the greatest common divisor of strings
 * @author EMMEDINA
 */

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        //Make str2 always the shortest
        if( str2.length() > str1.length() ){
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        
        //Get a list of possible divisors
        ArrayList<Integer> mutualDivisors = new ArrayList<>();
        for( int i = 1 ; i <= str2.length() ; i++ ){
            if( str1.length()%i == 0 && str2.length()%i == 0){
                mutualDivisors.add(i);
            }
        }
        
        //Try the common divisors, return at first found
        for( int i = mutualDivisors.size()-1 ; i >=0 ; i-- ) {
        	boolean isValidDivisor = true;
        	int currDivisor = mutualDivisors.get(i);
        	String currDivisorStr = str2.substring(0, currDivisor );
        	for( int j = 0 ; j < str2.length() ; j+= currDivisor ) {
        		if( !str2.substring(j,j+currDivisor).equals(currDivisorStr) ) {
        			isValidDivisor = false;
        			break;
        		}
        	}
        	if( !isValidDivisor ) continue;
        	
        	for( int j = 0 ; j < str1.length() ; j+= currDivisor ) {
        		if( !str1.substring(j,j+currDivisor).equals(currDivisorStr) ) {
        			isValidDivisor = false;
        			break;
        		}
        	}
        	
        	
        	if( isValidDivisor ) return currDivisorStr;
        }
        return "";
    }
}
