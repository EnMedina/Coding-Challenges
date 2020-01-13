
/**
 * https://leetcode.com/problems/palindrome-partitioning/
 * Return all possible palindrome substrings
 * @Author EnMedina
 * 
 * Backtracking
 */
class Solution {
  public List<List<String>> partition(String s) {
      List<List<String>> partitions = new LinkedList<>();
      List<String> currList = new LinkedList<>();
      backtrack( partitions, currList, s, 0);
      return partitions;
  }

  private void backtrack(List<List<String>> partitions, List<String> currList, String s, int currI) {
    if( currI == s.length()) {
      partitions.add(new LinkedList<>(currList));
    }
    for( int i  = currI+1 ; i <= s.length() ; i++ ) {
      if( isPalindrome( s.substring(currI, i) ) ) {
        currList.add(s.substring(currI, i));
        backtrack( partitions, currList, s, i);
        currList.remove(currList.size()-1);
      }
    }
  }
  
  private boolean isPalindrome( String s ) {
    for( int i = 0 ; i < s.length()/2 ; i++ ) {
      if( s.charAt(i) != s.charAt(s.length()-1-i)) return false;
    }
    return true;
  }
}
