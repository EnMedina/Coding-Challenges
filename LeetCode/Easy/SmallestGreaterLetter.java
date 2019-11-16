/**
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 * Return the first letters that is largest than ours. 
 * @Author EnMedina
 */
class Solution {
  public char nextGreatestLetter(char[] letters, char target) {
      for( char letter : letters ){
          if( letter > target ) return letter;
      }
      int currI = 0 ;
      while(currI < letters.length &&  letters[currI] == target) currI++;
      
      return currI == letters.length ? letters[0] : letters[currI];
  }
}
