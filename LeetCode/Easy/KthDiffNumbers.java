/**
 *  https://leetcode.com/problems/k-diff-pairs-in-an-array/submissions/
 *  Return the number of distinct kth difference pairs 
 *  @Author EnMedina
 */


class Solution {
    public int findPairs(int[] nums, int k) {
        if( k < 0 ) return 0; 
        Set<Integer> uniques = new HashSet<>();
        Set<Integer> repeated = new HashSet<>();
        int zeroSum = 0;
        for( int num : nums ){
            if( k == 0 && uniques.contains(num) ){
                if( !repeated.contains(num) ) {
                    zeroSum++;
                    repeated.add(num);
                }
            }
            uniques.add( num );
        }
        if( k == 0 ) return zeroSum;
        
        int numKDiff = 0;
        for( int currNum : uniques ){
            if( uniques.contains( currNum - k)) numKDiff++;
        }
        
        
        return numKDiff;
    }
}
