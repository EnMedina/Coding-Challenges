/**
 *  https://leetcode.com/problems/n-th-tribonacci-number/submissions/
 *  Return the nth tribonacci number
 *  @Author EnMedina
 */

class Solution {
    public int tribonacci(int n) {
      int[] nacci = new int[4];
      nacci[1] = 1;
      nacci[2] = 1;
      if(n < 3 ) return nacci[n];
      for( int i = 2 ; i < n ; i++){
        nacci[3] = nacci[0];
        nacci[0] = nacci[1];
        nacci[1] = nacci[2];
        nacci[2] = nacci[1] + nacci[0] + nacci[3];
        //System.out.println(Arrays.toString(nacci));
      }
      return nacci[2];
    }
}
