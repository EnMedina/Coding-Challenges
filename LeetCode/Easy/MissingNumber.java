/**
 *  https://leetcode.com/problems/missing-number/submissions/
 *  Return the missing number in the array
 *  @Author EnMedina
 */

class Solution {
    public int missingNumber(int[] nums) {
        int supposedResult = nums.length * ( (nums.length +1)/2);
        if( nums.length % 2 == 0 ) supposedResult += nums.length/2;
        for( int num : nums ){
            supposedResult -= num;
        }
        return supposedResult;
    }
}
