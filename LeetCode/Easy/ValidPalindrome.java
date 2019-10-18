/**
 * https://leetcode.com/problems/valid-palindrome/
 * Return whether a string is a valid alphanumeric palindrome
 * @Author EnMedina
 */

class Solution {
    public boolean isPalindrome(String s) {
        int pointer1 = s.length() - 1;
        int pointer2 = 0;
        boolean is1Digit = false;
        boolean is2Digit = false;
        while( pointer1 > pointer2 ){
            
            //Get pointer2 to next character
            while( pointer2 < pointer1 && !Character.isLetter(s.charAt(pointer2)) && !Character.isDigit(s.charAt(pointer2))) pointer2++;
            if( Character.isDigit(s.charAt(pointer2)) ) is1Digit = true;
            
            //Get pointer1 to previous character
            while( pointer1 > pointer2 && !Character.isLetter(s.charAt(pointer1)) && !Character.isDigit(s.charAt(pointer1) ) ) pointer1--;
            if( pointer1 == pointer2 ) return true;
            if( Character.isDigit( s.charAt( pointer1 ) ) ) is2Digit = true;
            if( is1Digit != is2Digit) return false;
            
            //Do comparison, if false exit
            if( !is1Digit && Character.toLowerCase(s.charAt(pointer1)) != Character.toLowerCase(s.charAt(pointer2)) ) return false;
            if( is1Digit && s.charAt(pointer1) != s.charAt(pointer2) ) return false;
            
            //System.out.println("The values of the pointers are : " + pointer1 + ", " + pointer2);
            pointer2++;
            pointer1--;
        }
        return true;
    }
}
