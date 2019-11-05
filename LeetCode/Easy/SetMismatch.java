
/**
 * https://leetcode.com/problems/set-mismatch
 * Check what the missing and repeating numbers are
 * @author EMEDINA
 */


class Solution {
  public int[] findErrorNums(int[] nums) {
    int[] res = new int[2];
    for (int i : nums) {
        if (nums[Math.abs(i) - 1] < 0) res[0] = Math.abs(i);
  else nums[Math.abs(i) - 1] *= -1;
    }
    for (int i=0;i<nums.length;i++) {
        if (nums[i] > 0) res[1] = i+1;
    }
    return res;
  }
}
