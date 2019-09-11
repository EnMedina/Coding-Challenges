/**
 *  https://leetcode.com/problems/max-consecutive-ones/submissions/
 *  Return the maximum number of consecutive ones
 *  @Author EnMedina
 */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int currMax = 0;
        for(int iArr = 0 ; iArr < nums.length ; iArr++ ){
            currMax = iArr;
            while( iArr < nums.length && nums[iArr] == 1){ iArr++;}
            currMax = iArr - currMax;
            maxOnes = Math.max( maxOnes, currMax );
        }
        return maxOnes;
    }
}
