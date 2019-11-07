/**
 * https://leetcode.com/problems/find-pivot-index/
 * Find a pivot Index
 * @Author EnMedina
 */

class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for( int num : nums ) sum += num;
        int currIndex = 0;
        int currLeftSum = 0;
        while( currIndex < nums.length  ){
            if( sum  - nums[currIndex] == currLeftSum*2 ) return currIndex;
            currLeftSum+= nums[currIndex++];
        }
        return -1;
    }
}
