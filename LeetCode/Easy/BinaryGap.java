/**
 *  https://leetcode.com/problems/binary-gap/submissions/
 *  Return the biggest distance between 1s 
 *  @Author EnMedina
 */


class Solution {
    public int binaryGap(int N) {
     long currPow = (long) Math.pow(2,32);
     int prevOneI = -1;
     int minDiff = 0;
     int currLoop = 32;
      while(N != 0){
        if( N >= currPow){
          N-=currPow;
          if( prevOneI != -1 ){
            minDiff = Math.max(minDiff, prevOneI - currLoop);
          }
          prevOneI = currLoop;
        }
        
        currPow /= 2;
        currLoop--;
      }
      return  minDiff;
    }
}
