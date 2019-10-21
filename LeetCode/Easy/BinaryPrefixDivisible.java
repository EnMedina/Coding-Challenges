/**
 * https://leetcode.com/problems/binary-prefix-divisible-by-5/
 * Return the number of divisible by 5 numbers
 * @author EMEDINA
 *	O(n) time O(1) space
 */

class Solution {
	public List<Boolean> prefixesDivBy5(int[] A) {
        int k = 0;
        List<Boolean> ans = new ArrayList<>();
        for (int a : A) {
            k = (k << 1 | a) % 5; // left shift k by 1 bit and plus current element a is the binary number.
            ans.add(k == 0); 
        }
        return ans;
    }	
}

