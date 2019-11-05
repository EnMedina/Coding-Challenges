/**
 * https://leetcode.com/problems/path-sum/
 * Check if a root to leaf has a given sum
 * @author EMEDINA
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return checkPathExists(0,root,sum);
    }
    
    public boolean checkPathExists(int currSum, TreeNode currNode, int goal){
        if(currNode.left == null && currNode.right == null ) return currSum+currNode.val == goal;
        boolean leftSubtreeResult  = currNode.left == null ? false : checkPathExists(currSum+currNode.val, currNode.left,goal);
        boolean rightSubtreeResult = currNode.right == null ? false : checkPathExists(currSum+currNode.val, currNode.right,goal);;
        return leftSubtreeResult || rightSubtreeResult;
    }
}
