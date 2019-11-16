/**
 * https://leetcode.com/problems/largest-number-at-least-twice-of-others/
 *  Return whether the largest number is twice as big as the others
 *  @Author EnMedina
 */

class Solution {
    public int dominantIndex(int[] nums) {
        //Keep track of the two largest numbers
        int firstLargest  = 0;
        int secondLargest = 0;
        int firstLargestI = -1;
        
        for( int i = 0 ; i < nums.length ; i++ ){
            if( nums[i] > firstLargest ){
                firstLargestI = i;
                secondLargest = firstLargest;
                firstLargest = nums[i];
            }else if( nums[i] > secondLargest ){
                secondLargest = nums[i];
            }
            
        }
        return firstLargest >= secondLargest*2 ? firstLargestI : -1;
    }
}
