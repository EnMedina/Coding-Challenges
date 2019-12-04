
/**
 * https://leetcode.com/problems/permutations/
 * Return the permutations from distinct integers
 * @Author ENMedina
 *
 * Backtracking
 */


class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new LinkedList<>();
        List<Integer> workingList = new LinkedList<>();
        boolean[] seenArray = new boolean[nums.length];
        backtrack( nums, seenArray, workingList, permutations );
        
        
        return permutations;
        
    }
    
    private void backtrack( int[] nums , boolean[] seen,  List<Integer> currList , List<List<Integer>> parentList ){
        if( currList.size() == nums.length ){
            parentList.add( currList);
            return;
        }
        for( int i = 0 ; i < nums.length ; i++ ){
            if( seen[i] == false  ){
                List<Integer> clone = new LinkedList<>(currList);
                clone.add( nums[i] );
                seen[i] = true;
                backtrack( nums, seen, clone, parentList);
                seen[i] = false;
            }
        }
        return ;
    }
}
