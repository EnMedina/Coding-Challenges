
/**
 * https://leetcode.com/problems/permutation-sequence/
 * Return the kth ordered permutaton
 * @Author EnMedina
 * 
 * Backtracking
 */


class Solution {
  public String getPermutation(int n, int k) {
      List<Integer>numbersToPlace = new LinkedList<>();
      int possiblePerm = 1;
      for( int i = 1 ; i <= n ; i++ ) {
        numbersToPlace.add(i);
        possiblePerm *= i;
      }
      
      char[] numbers = new char[n];
      
      for( int i = n-1 ; numbersToPlace.size() > 1 ; i-- ) {
        Collections.sort(numbersToPlace);
        int nextArea = (k-1) / (possiblePerm/(i+1));
        k -= nextArea*(possiblePerm/(i+1));
        if( nextArea < 0 ) nextArea = 0;
        numbers[n-i-1] = (char) (numbersToPlace.get(nextArea)+'0');
        numbersToPlace.remove(nextArea);
        possiblePerm /= (i+1);
      }
      numbers[n-1] = (char) (numbersToPlace.get(0)+'0');
      return new String(numbers);
  }
}
