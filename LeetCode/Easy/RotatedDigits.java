/**
 *  https://leetcode.com/problems/rotated-digits/submissions/
 *  Return the number of valid rotates numbers
 *  @Author EnMedina
 */
class Solution {
    public int rotatedDigits(int N) {
      int validNums = 0;
        for(int i = 1 ; i <= N ; i++){
          if(isValid(i)) validNums++;
        }
      return validNums;
    }
  
   private boolean isValid(int num ){
     boolean digitChange = false;
     while( num > 0 ){
       int tempNum = num%10;
       if(tempNum == 3 || tempNum == 4 || tempNum == 7) return false;
       if( tempNum == 6 || tempNum == 9 || tempNum == 5 || tempNum == 2) digitChange = true;
       num/=10;
     }
     return digitChange;
     
   }
}
