/**
 *  https://leetcode.com/problems/move-zeroes/
 *  Move the zeroes to the back of an array, preserve order
 *  @Author EnMedina
 */

class Solution {
    public void moveZeroes(int[] nums) {
      int indCurr = 0;
      while(indCurr < nums.length && nums[indCurr] != 0) indCurr++;
      boolean foundNum = true;
      int numSwitch = indCurr+1;
      while( numSwitch < nums.length && foundNum ){
        while( numSwitch < nums.length && nums[numSwitch] == 0) numSwitch++;
        if( numSwitch == nums.length ) foundNum = false;
        else{
          nums[indCurr] = nums[numSwitch];
          nums[numSwitch] = 0;
          indCurr++;
        }
      }
      while(indCurr < nums.length) nums[indCurr++] = 0;
        
      
    }
}
