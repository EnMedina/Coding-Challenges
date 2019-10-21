/**
 * https://leetcode.com/problems/maximum-product-of-three-numbers/
 * Return three largest number with the maximum product
 * @author EMEDINA
 *	O(n) time O(1) space
 */

class Solution {
  public int maximumProduct(int[] nums) {
    if(nums.length < 3) return -1;
    Arrays.sort(nums);
    int x = nums.length;
    return Math.max((nums[0]*nums[1]*nums[x-1] ), (nums[x-1]*nums[x-2]*nums[x-3]));
  }
}
