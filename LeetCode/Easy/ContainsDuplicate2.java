
/**
 * https://leetcode.com/problems/contains-duplicate-ii/
 * Return the place where two lists interect
 * @author EMEDINA
 *	O(n) time O(1) space
 */

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
Map<Integer,Integer> valueIndexMap = new HashMap<>();
    	for( int i = 0 ; i < nums.length ; i++ ) {
    		if( valueIndexMap.containsKey(nums[i])) {
    			if( ( i - valueIndexMap.get(nums[i] ) ) <= k ) return true;
    		}
    		valueIndexMap.put(nums[i], i);
    	}
        return false;
    }
}


