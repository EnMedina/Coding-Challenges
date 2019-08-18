/**
 * https://leetcode.com/problems/delete-columns-to-make-sorted/submissions/
 * REturn the number of unordered columns 
**/
class Solution {
    public int minDeletionSize(String[] A) {
      if(A == null || A.length == 0 || A.length == 1) return 0;
      int stringsLength = A[0].length();
      int nonSortedCols = 0;
      for( int charI = 0 ; charI < stringsLength  ; charI++ ){
        boolean isSorted = true;
        for(int i = 1 ; i < A.length ; i++){
            if(A[i-1].charAt(charI) > A[i].charAt(charI) ) {
             isSorted = false;
             break;
            }
        }
        if(!isSorted) nonSortedCols++;
      }
      return nonSortedCols;
    }
}
