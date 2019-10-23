
/**
 * https://leetcode.com/problems/pascals-triangle-ii/
 * Return kth row of pascals triangle
 * @author EMEDINA
 *
 */

class Solution {
  public List<Integer> getRow(int rowIndex) {
    List<Integer> prevRow = new ArrayList<>();
    prevRow.add(1);
    while( rowIndex > 0 ) {
      rowIndex--;
      List<Integer> newRow =  new ArrayList<>();
      int newLength = prevRow.size();
      for( int i = 0 ; i <= newLength ; i++ ) {
        int newNumber = 0;
        if( i > 0)            newNumber += prevRow.get(i-1);
        if( i < newLength ) newNumber += prevRow.get(i);
        newRow.add(newNumber);
      }
      prevRow = newRow;
    }
    return prevRow;
  }
}


