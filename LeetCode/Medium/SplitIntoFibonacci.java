
/**
 * https://leetcode.com/problems/split-array-into-fibonacci-sequence/
 * Return all possible fibonacci series from a String
 * @Author EnMedina
 * 
 * Backtracking
 */

class Solution {
  public List<Integer> splitIntoFibonacci(String S) {
      List<Integer> currList = new LinkedList<>();
      boolean result = backtrack( currList , S, 0);
      if( result ) return currList;
      return new LinkedList<>();
  }

  private boolean backtrack(List<Integer> currList, String s, int startI) {  
    if( currList.size() > 2 && startI == s.length()) return true;
    for( int i = startI+1 ; i <= s.length() ; i++ ) {
      long nextNum = Long.parseLong(s.substring(startI, i));
      if( nextNum > Integer.MAX_VALUE) break;
      if( currList.size() < 2 || ( currList.size() >= 2 && nextNum == currList.get(currList.size()-1)+currList.get(currList.size()-2)  )) {
        currList.add((int)nextNum);
        if( backtrack(currList, s, i)) return true;
        currList.remove(currList.size()-1);
        if( nextNum == 0) break;
      }
    }
    return false;
  }
}
