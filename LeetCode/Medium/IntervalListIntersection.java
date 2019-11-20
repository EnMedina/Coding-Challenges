/**
 * https://leetcode.com/problems/interval-list-intersections/
 * Return the list of overlapping intervals
 * @Author EnMedina
 */

class Solution {
  public int[][] intervalIntersection(int[][] A, int[][] B) {
      int currAIndex = 0 ; 
      int currBIndex = 0 ;
      List<List<Integer>> listIntersection = new ArrayList<>();
      while( currAIndex < A.length && currBIndex < B.length ) {
        while(B[currBIndex][0] > A[currAIndex][1] ) {
          currAIndex++;
          if( currAIndex >= A.length )break;
        }
        
        if( currAIndex >= A.length )break;
        
        while( currBIndex < B.length && A[currAIndex][0] > B[currBIndex][1] ) {
          currBIndex++;
        }
        if( currBIndex >= B.length )break;
        if( A[currAIndex][1] < B[currBIndex][0]  ) {
          List<Integer> listTemp = new ArrayList<>();
          listTemp.add(Math.max(A[currAIndex][0], B[currBIndex][0]));
          listTemp.add(Math.min(A[currAIndex][1], B[currBIndex][1]));
          listTemp.add(A[currAIndex][1]);
          listIntersection.add(listTemp);
        }
          if( A[currAIndex][1] > B[currBIndex][1]) {
            currBIndex++;
          } else {
            currAIndex++;
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
