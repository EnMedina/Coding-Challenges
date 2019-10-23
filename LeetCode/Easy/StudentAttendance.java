
/**
 * https://leetcode.com/problems/student-attendance-record-i/
 * REturn whether a student can get an attendance bonus
 * @author EMEDINA
 *
 */

class Solution {
  public boolean checkRecord(String s) {
    boolean previousAbsence = false;
    for( int i = 0 ; i < s.length() ; i++ ) {
      char currChar = s.charAt(i);
      if( currChar == 'A' ) {
        if(previousAbsence) return false;
        previousAbsence = true;
      } 
      else if( currChar == 'L' && i < s.length() - 2 ) {
        if( s.charAt(i+1) == 'L' && s.charAt(i+1) == 'L') return false;
      }
    }
    return true;
  }
}

