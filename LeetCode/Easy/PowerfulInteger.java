
/**
 * https://leetcode.com/problems/powerful-integers/
 * Check the sums of powers that can be created in a range
 * @author EMEDINA
 */

class Solution {
  public List<Integer> powerfulIntegers(int x, int y, int bound) {
      Set<Integer> xSquares = generateSquares( x, bound );
      Set<Integer> ySquares = generateSquares( y, bound );
      Set<Integer> possibleSums = new HashSet<>();
      
      for( int squaredX : xSquares ) {
        for( int squaredY : ySquares ) {
          if( squaredX+squaredY <= bound) {
            possibleSums.add(squaredX+squaredY);
          }
        }
      }
      
      return new ArrayList<>(possibleSums);
      
  }
  
  private Set<Integer> generateSquares(int n , int limit ){
    Set<Integer> squares = new HashSet<>();
    if( n <= 1 ) {
      squares.add(n);
    }else {
      int currPow = 0;
      int currVal = 1;
      while( currVal <= limit ) {
        squares.add( currVal);
        currPow++;
        currVal = (int) Math.pow(n, currPow);
      }
    }
    
    return squares;
  }
}
