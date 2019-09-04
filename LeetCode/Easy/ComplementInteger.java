/**
 *  https://leetcode.com/problems/complement-of-base-10-integer/submissions/
 *  Return the complement of the base 10 integer
 *  @Author EnMedina
 */

class Solution {
    public int bitwiseComplement(int N) {
      if(N == 0) return 1;
      long currPow = (long) Math.pow(2,32);
      boolean foundFirst = false;
      int resultNum = 0;
      while( currPow != 0){
        if( N >= currPow ){
          if(foundFirst == false) foundFirst = true;
          N-= currPow;
        }else{
          if(foundFirst){
            resultNum += currPow;
          }
        }
        currPow /= 2;
      }
      return resultNum;
    }
}
