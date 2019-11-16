
/**
 * https://leetcode.com/problems/convert-a-number-to-hexadecimal/
 * Return an hexadecimal number, remember complement twos is used
 * @Author EnMedina
 */

class Solution {
  public String toHex(int num) {
      char[] mapping = new char[] {'0','1','2','3','4','5','6'
        ,'7','8','9','a','b','c','d','e','f'};
    char[] hexNum = new char[8];
      for( int digitsI = 7 ; digitsI >= 0 ; digitsI-- ) {
        int currDigit = 0;
        for( int bitsI = 0 ; bitsI < 4 ; bitsI++ ) {
          int currBit = num & 1;
          num = num >> 1;
          if(currBit == 1 )currDigit += (int) Math.pow(2, bitsI);
        }
        hexNum[digitsI] = mapping[currDigit];
      }
      int initialIndex = 0;
      while( initialIndex < 7 && hexNum[initialIndex] == '0') {
        initialIndex++;
      }
     // System.out.println(Arrays.toString(hexNum));
      return new String(hexNum).substring(initialIndex);
  }
}
