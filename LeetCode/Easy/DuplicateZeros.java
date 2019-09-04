/**
 * https://leetcode.com/problems/duplicate-zeros/submissions/
 * Duplicate the zeros in an array, keep length
 * @Author EnMedina
 */


class Solution {
    public void duplicateZeros(int[] arr) {
      int currIndex = 0;
      int arr1Index = 0;
      int[] arr2 = new int[arr.length];
      while( currIndex < arr2.length ){
        arr2[currIndex] = arr[arr1Index];
        if( arr2[currIndex] == 0 && currIndex < arr2.length-1 ){
          arr2[++currIndex] = 0;
        }
        arr1Index++;
        currIndex++;
      }
     for(int i = 0 ; i < arr.length ; i++){
       arr[i] = arr2[i];
     } 
    }
}
