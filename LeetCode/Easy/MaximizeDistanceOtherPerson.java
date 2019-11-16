/**
 * https://leetcode.com/problems/maximize-distance-to-closest-person/
 * Return the maximum distance to another person
 * @Author EnMedina
 */

class Solution {
  public int maxDistToClosest(int[] seats) {
    //Get distance to first and last 1
    int maxDistance = 0;
    int currI = 0;
    while( currI < seats.length && seats[currI] == 0) currI++;
    maxDistance  = currI;
    int previousI = currI;
    currI++;
    while( currI < seats.length ) {
      if( seats[currI] == 1 ) {
        maxDistance = Math.max(maxDistance, (currI - previousI)/2);
        previousI = currI;
      }
      currI++;
    }
    
    //Now calculate rightmost distance
    currI = seats.length-1;
    while( currI >= 0 && seats[currI] == 0) currI--;
    maxDistance = Math.max(maxDistance, seats.length - 1 - currI );
    return maxDistance;
  }
}
