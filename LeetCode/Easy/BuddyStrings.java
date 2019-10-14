/**
 *  https://leetcode.com/problems/buddy-strings/submissions/
 *  Return whether two strings can be made equal with a single char swap
 *  @Author EnMedina
 */

class Solution {
    public boolean buddyStrings(String A, String B) {
        if(A == null || B == null || A.length() != B.length()) return false;
        if(A.equals(B)) return repeatedChar(A);
        int[] charInstances = new int[26];
        for(int i = 0 ; i  < A.length() ; i++ ) charInstances[A.charAt(i) - 'a']++;
        for(int i = 0 ; i  < A.length() ; i++ ) charInstances[B.charAt(i) - 'a']--;
        for(int i = 0 ; i  < 26 ; i++ ) if ( charInstances[i] != 0 ) return false; 
        
        int diffChars = 0;
        for( int i = 0 ; i < A.length() ; i++ ){
            if(A.charAt(i) != B.charAt(i)){ 
                diffChars++;
                if(diffChars > 2) return false;
            }
        }
        return diffChars == 2;
        
    }
    
    private boolean repeatedChar(String s){
        Set<Character> seenChars = new HashSet<>();
        for( int i = 0 ; i < s.length() ; i++ ){
            if( seenChars.contains(s.charAt(i))) return true;
            seenChars.add(s.charAt(i));
        }
        return false;
    }
}
