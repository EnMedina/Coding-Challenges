/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/
 * Return the maximum depth of a binary tree
 * @Author EnMedina
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
    public int maxDepth(TreeNode root) {
        return maxDepth(root,0);
    }
    
    public int maxDepth(TreeNode node, int currDepth){
        if(node == null) return currDepth;
        
        return Math.max(maxDepth(node.left,currDepth+1),maxDepth(node.right,currDepth+1));
        
    }
}
