/**
 *  https://leetcode.com/problems/single-number/submissions/
 *  All numbers are repeated except one, print it.
 *  @Author EnMEdina
 */

class Solution {
    public int singleNumber(int[] nums) {
        int value = 0;
        for(int num : nums) value ^= num;
        return value;
    }
}
