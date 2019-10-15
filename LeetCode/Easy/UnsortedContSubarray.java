/**
 *  https://leetcode.com/problems/shortest-unsorted-continuous-subarray/submissions/
 *  Return the shortst subarray we can sort to make the array sorted
 *  @Author EnMedina
 */

class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] sortedNums = new int[nums.length];
        for( int i = 0 ; i < nums.length ; i++ ){
            sortedNums[i] = nums[i];
        }
        Arrays.sort(sortedNums);
        int firstWrongSpot = 0;
        while( firstWrongSpot < nums.length && sortedNums[firstWrongSpot] == nums[firstWrongSpot]) firstWrongSpot++;
        if( firstWrongSpot == nums.length ) return 0;
        
        int lastWrongSpot = nums.length - 1;
        while( lastWrongSpot > 0 && sortedNums[lastWrongSpot] == nums[lastWrongSpot]) lastWrongSpot--;
        
        
        
        return lastWrongSpot - firstWrongSpot + 1;
    }
}
