/*
 * https://leetcode.com/problems/array-partition-i/
 * Given an array return the maximum sum of min(a,b) pairs
*/ @Author EnMedina

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0 ;
        for(int i = 0 ; i < nums.length ; i+= 2){
          sum += nums[i];
        }
      return sum;
    }
}
