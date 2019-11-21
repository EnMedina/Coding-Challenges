
/**
 * https://leetcode.com/problems/pancake-sorting/
 * Return the pancake sorting 
 * @Author EnMedina
 */
class Solution {
  public List<Integer> pancakeSort(int[] A) {
      int currSearch = A.length;
      List<Integer> movesList = new ArrayList<>();
      while( currSearch > 0 ){
          if( A[currSearch-1] != currSearch){
              int currI = 0;
              while( currI < currSearch &&  A[currI] != currSearch ) currI++;
              //System.out.println("Calling for index " + currI);
              flipBits(A,currI);
              movesList.add( currI+1 );
              movesList.add( currSearch );
              flipBits(A, currSearch-1);
          }
          //System.out.println(Arrays.toString(A));
          currSearch--;
      }
      return movesList;
  }
  
  private void flipBits( int[] arr , int lim ){
      for( int i = 0 ; i <= lim/2 ; i++ ){
          int temp = arr[i];
          arr[i] = arr[lim-i];
          arr[lim-i] = temp;
      }
     //System.out.println(" From flipbits " + Arrays.toString(arr));
  }
}
