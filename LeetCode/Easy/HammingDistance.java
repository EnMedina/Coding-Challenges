/**
 * https://leetcode.com/problems/hamming-distance/submissions/
 * Return the number of different bits in two ints
 * @autor EnMedina
 **/

class Solution {
    public int hammingDistance(int x, int y) {
      int difBits = x ^ y ;
      double bitChecker = Math.pow(2,31);
      int countDifBits = 0 ;
      while(bitChecker != 0 && difBits != 0 ){
        if( difBits >= bitChecker ){
          difBits -= bitChecker;
          countDifBits++;
        }
        bitChecker/=2;
      }
      return countDifBits;
    }
}
