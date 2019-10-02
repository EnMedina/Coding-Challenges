/**
 *  https://leetcode.com/problems/first-unique-character-in-a-string/
 *  Return the index of the first character that occurs only once
 *  @Author EnMedina
 */

class Solution {
    public int firstUniqChar(String s) {
        int[] charOcurrences = new int[27];
        for( int i = 0 ; i < s.length() ; i++ ){
            if( charOcurrences[s.charAt(i)-'a'] == 0 ){
                charOcurrences[s.charAt(i)-'a'] = i+1;
            }else{
                charOcurrences[s.charAt(i)-'a'] = -1;
            }
        }
        
        int minInd = Integer.MAX_VALUE;
        
        for( int i = 0 ; i < 27 ; i++ ){
            if( charOcurrences[i] > 0 ) 
                minInd = Math.min(minInd, charOcurrences[i]-1);
        }
        
        return minInd == Integer.MAX_VALUE ? -1 : minInd;
        
    }
}
