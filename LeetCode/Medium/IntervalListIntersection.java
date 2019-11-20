
/**
 * https://leetcode.com/problems/interval-list-intersections/
 * Return the list of overlapping intervals
 * @Author EnMedina
 */

class Solution {
  public int[][] intervalIntersection(int[][] A, int[][] B) {
     int indexA = 0;
     int indexB = 0;
     List<List<Integer>> listIntersection = new ArrayList<>();
     
     while( indexA < A.length && indexB < B.length ) {
       int minStart = Math.max( A[indexA][0], B[indexB][0] );
       int maxEnd   = Math.min( A[indexA][1], B[indexB][1] );
       
       if( minStart <= maxEnd ) {
         List<Integer> listTemp = new ArrayList<>();
         listTemp.add(minStart);
         listTemp.add(maxEnd);
         listIntersection.add(listTemp);
       }
       
       if( A[indexA][1] < B[indexB][1] ) {
         indexA++;
       }else {
         indexB++;
       }
       
     }
     return listToArray(listIntersection);
  }
  
  private int[][] listToArray( List<List<Integer>> list){
    int[][] array = new int[list.size()][2];
    for( int i = 0 ; i < array.length ; i++ ) {
      array[i][0] = list.get(i).get(0);
      array[i][1] = list.get(i).get(1);
    }
    return array;
  }
}
