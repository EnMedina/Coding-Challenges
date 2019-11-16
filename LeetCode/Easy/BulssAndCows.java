/**
 * https://leetcode.com/problems/bulls-and-cows
 * return how close user is to guessing a String
 * @author EMEDINA
 */

class Solution {
  public String getHint(String secret, String guess) {
      int aCount = 0;
      int[] secretDigits = new int[10];
      int[] guessDigits  = new int[10];
      for( int i = 0 ; i < secret.length(); i++ ){
          secretDigits[secret.charAt(i) - '0']++;
      }
      for( int i = 0 ; i < guess.length(); i++ ){
          guessDigits[guess.charAt(i) - '0']++;
          if( guess.charAt(i) == secret.charAt(i))aCount++;
      }
      int bCount = 0;
      for( int i = 0 ; i < 10 ; i++ ){
          bCount+= Math.min( secretDigits[i], guessDigits[i]);
      }
      
      bCount-=aCount;
      return aCount + "A" + bCount + "B";
  }
}
