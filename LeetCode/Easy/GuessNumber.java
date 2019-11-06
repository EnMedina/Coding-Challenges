
/**
 * https://leetcode.com/problems/guess-number-higher-or-lower/
 * Guess with an API the number chosen
 * @author EMEDINA
 */


/* The guess API is defined in the parent class GuessGame.
@param num, your guess
@return -1 if my number is lower, 1 if my number is higher, otherwise return 0
   int guess(int num); */

public class Solution extends GuessGame {
 public int guessNumber(int n) {
   int high = n, low = 1, mid = 0;
   while( low <= high ) {
      mid = low + (high-low)/2;
      int result = guess(mid);
      if( result == 0 ) return mid;
      else if( result == -1 ) high = mid;
      else low = mid+1;
   }     
      return -1; 
 }
}
