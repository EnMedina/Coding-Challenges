
/**
 * https://leetcode.com/problems/rotate-array
 * Rotate the given array in place
 * @author EMEDINA
 *	O(n) time O(k) space
 */

class Solution {
    public void rotate(int[] nums, int k) {
    	k = k % nums.length;
    	if( k == 0 ) return;
    	int[] numBackup = new int[k];
    	
    	for( int index = 0 ; index < k ; index++ ) {
    		numBackup[index] = nums[nums.length -k + index]; 
    	}
    	
    	for( int index = nums.length-1  ; index >= k ; index-- ) {
    		nums[index] = nums[index-k];
    	}
    	
    	for( int index = 0 ; index < k ; index++ ) {
    		nums[index] = numBackup[index];
    	}
    	
    	return;
    }
}
