/**
 * https://leetcode.com/problems/custom-sort-string/submissions/
 * Return a custom ordered string
 * @Author EnMedina
 */

class Solution {
    public String customSortString(String S, String T) {
        int[] letterOccurrences = new int[26];
        for( int i = 0 ; i < T.length() ; i++ ){
            letterOccurrences[T.charAt(i) - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        //First add the sorted characters
        for( int i = 0 ; i < S.length() ; i++ ){
            for( int j = 0 ; j < letterOccurrences[S.charAt(i) - 'a']; j++ ){
                sb.append(S.charAt(i));
            }
            letterOccurrences[S.charAt(i) - 'a'] = 0;
        }
        //Add the rest of the characters
        for( int i = 0 ; i < letterOccurrences.length ; i++ ){
            for( int j = 0 ; j < letterOccurrences[i] ; j++ ){
                sb.append((char) ( i + 'a' ) );
            }
        }
        return sb.toString();
    }
}
