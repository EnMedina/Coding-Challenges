/**
 *  https://leetcode.com/problems/detect-capital/submissions/
 *  Detect whether capital use is correct in a String
 *  @Author EnMedina
 */

class Solution {
    public boolean detectCapitalUse(String word) {
        if(word == null || word.length() == 0) return false;
        if(word.length() == 1) return true;
        boolean booleanEqual = Character.isUpperCase(word.charAt(0)) == Character.isUpperCase(word.charAt(1));
        if(booleanEqual){
            for( int indChar = 2 ; indChar < word.length() ; indChar++ ){
                if( Character.isUpperCase(word.charAt(indChar)) != Character.isUpperCase(word.charAt(indChar-1))) return false;
            }
        }
        else{
            for( int indChar = 1 ; indChar < word.length() ; indChar++ ){
                if(Character.isUpperCase(word.charAt(indChar))) return false;
            }
        }
        return true;
    }
}
