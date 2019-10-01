/**
 *  https://leetcode.com/problems/ransom-note/
 *  Return whether a Ransome note can be generaated from the magazine
 *  @Author EnMedina
 */

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int[] charArr = new int[27];
        for( int indChar = 0 ; indChar < magazine.length() ; indChar++ ){
            charArr[magazine.charAt(indChar)-'a']++;
        }
        
        for( int indChar = 0 ; indChar < ransomNote.length() ; indChar++ ){
            charArr[ransomNote.charAt(indChar) - 'a']--;
        }
       
        for( int ind = 0 ; ind < 27 ; ind++){
            if( charArr[ind] < 0) return false;
        }
        return true;
    }
}
