/**
 * You are given an array coordinates, coordinates[i] = [x, y], 
 * where [x, y] represents the coordinate of a point. Check if 
 * these points make a straight line in the XY plane. 
*/

/**
 * https://leetcode.com/problems/check-if-it-is-a-straight-line/
 * Return whether a set of points are in a straight line
 * @author EMEDINA
 *
 */
class Solution {
  public boolean checkStraightLine(int[][] coordinates) {
    double inclination = getInclination(coordinates[0],coordinates[1]);
    for( int i = 2 ; i < coordinates.length ; i++ ) {
      if( inclination != getInclination(coordinates[i-1], coordinates[i])) {
        return false;
      }
    }
    return true;
  }
  
  private double getInclination( int[] cord1, int[] cord2) {
    if( cord1[0] > cord2[0]) {
      int[] temp = cord1;
      cord1 = cord2;
      cord2 = temp;
    }
    return((double)(cord2[0]-cord1[0]))/((double)(cord2[1]-cord1[1]));
  }
}
