/**
 *  https://leetcode.com/problems/shortest-completing-word/submissions/
 *  Return the shortest word that has all the required characters
 *  @Author EnMedina
 */

class Solution {
   
    public String shortestCompletingWord(String licensePlate, String[] words) {
      int[] countArr = getCountArr(licensePlate);
      String ans = "";
      int shortestLen = Integer.MAX_VALUE;
      // Sort Arrays by length
      //Arrays.sort(words, (String a, String b) -> Integer.compare(a.length(),b.length()));
      //System.out.println(Arrays.toString(words));
      for( String word : words ){
        int[] tempArr = getCountArr(word);
        if(word.length() < shortestLen && isPossible(countArr,tempArr)) {
          ans = word;
          shortestLen = word.length();
        }
      } 
      

      return ans;
      
      
    }
  
  
    private int[] getCountArr( String licensePlate ){
      int[] countArr = new int[27];
      for( int indPlate = 0 ; indPlate < licensePlate.length() ; indPlate++ ){
        if( licensePlate.charAt( indPlate) > '9'){
        char minusChar;
        if( licensePlate.charAt( indPlate ) > 'Z' ){
          minusChar = 'a';
        }else{
          minusChar = 'A';
        }
        countArr[licensePlate.charAt( indPlate ) - minusChar]++;
      }
      }
      return countArr;
    }
  
  private boolean isPossible(int[] arr1 , int[] arr2){
    for(int i = 0 ; i < arr1.length ; i++) if( arr1[i] > arr2[i]) return false;
    return true;
  }
}
  
