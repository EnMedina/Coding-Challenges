/**
 * In a list of songs, the i-th song has a duration of time[i] seconds. 
 * Return the number of pairs of songs for which their total duration in
 * seconds is divisible by 60.  Formally, we want the number of indices 
 * i < j with (time[i] + time[j]) % 60 == 0.
*/

/**
 * https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/
 * Return the possible pairs of songs with duration as a whole minute
 * @author EMEDINA
 *
 */
class Solution {
  public int numPairsDivisibleBy60(int[] time) {
    int[] mods = new int[60];
    int numPairs = 0;
    for( int song : time ) {
      int currMod = song%60;
      numPairs += mods[(60-currMod)%60];
      mods[currMod]++;
    }
    
    return numPairs;
  }
}
