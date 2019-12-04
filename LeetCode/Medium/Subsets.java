/**
 * https://leetcode.com/problems/subsets/submissions/
 * Return the possible subsets of an array
 * @Author EnMedina
 *
 * Backtracking
 */

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsetList = new LinkedList<>();
        List<Integer> currList = new LinkedList<>();
        subsetList.add( currList);
        backtrack( nums, subsetList, currList, 0);
        return subsetList;
    }
    
    private void backtrack(int[] nums,List<List<Integer>> subsetList, List<Integer> currList, int currIndex ){
        if( currIndex >= nums.length )return;
        
        for( int i = currIndex ; i < nums.length ; i++ ){
            currList.add( nums[i]);
            subsetList.add( new LinkedList<>(currList));
            backtrack( nums, subsetList, currList, i+1);
            currList.remove( currList.size()-1);
        }
        return ;
        
    }
}
