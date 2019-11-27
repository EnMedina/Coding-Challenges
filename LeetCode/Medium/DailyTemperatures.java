/**
 * https://leetcode.com/problems/daily-temperatures/
 * Return which days in the future have a higher date
 * @Author EnMedina
 */

class Solution {
  public int[] dailyTemperatures(int[] T) {
    int[] higherT = new int[T.length];
    int[] tNextOccurrence = new int[71];

    for( int i = higherT.length-1 ; i >= 0 ; i-- ) {
      tNextOccurrence[T[i]-30] = i;
      int startSearch = T[i]-30;
      int currMin = Integer.MAX_VALUE;
      while( startSearch < 70 ) {
        startSearch++;
        if( tNextOccurrence[startSearch] != 0 ) {
          currMin = Math.min(currMin, tNextOccurrence[startSearch]);
        }
      }
      higherT[i] = currMin == Integer.MAX_VALUE ? 0 : currMin-i;
    }
    
    return higherT;
  }
  
  
  public int[] dailyTemperatures2(int[] temperatures) {
    int[] stack = new int[temperatures.length];
    int top = -1;
    int[] ret = new int[temperatures.length];
    for(int i = 0; i < temperatures.length; i++) {
        while(top > -1 && temperatures[i] > temperatures[stack[top]]) {
            int idx = stack[top--];
            ret[idx] = i - idx;
        }
        stack[++top] = i;
        System.out.println("Ret   : " +   Arrays.toString(ret));
        System.out.println("Stack : " + Arrays.toString(stack));
       
    }
    return ret;
}
  
}
