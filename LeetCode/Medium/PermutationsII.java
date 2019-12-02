/**
 * https://leetcode.com/problems/permutations-ii/
 * Return the possible unique permutations, might have repeated elements
 * @Author EnMedina
 *
 * Backtracking
 */

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> permutations = new LinkedList<>();
        List<Integer> tempList = new LinkedList<>();
        boolean[] seen = new boolean[nums.length];
        backtracking( permutations, nums, seen, tempList);
        return permutations;
    }
    
    
    public void backtracking( List<List<Integer>> permutations, int[] nums, boolean[] seen , List<Integer> currList  ){
        if( currList.size() == nums.length ){
            permutations.add( currList);
            return;
        }
        
        Set<Integer> seenSet = new HashSet<>();
        for( int i = 0 ; i < nums.length ; i++ ){
            if( seen[i] == false && !seenSet.contains(nums[i])){
                seen[i] = true;
                List<Integer> tempList = new ArrayList<>(currList);
                tempList.add( nums[i]);
                backtracking( permutations, nums, seen, tempList);
                seen[i] = false;
                seenSet.add( nums[i]);
            }
        }
        return ;
    }
}
