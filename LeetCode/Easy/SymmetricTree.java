
/**
 * https://leetcode.com/problems/symmetric-tree/
 * Return whether a tree is symmetric 
 * @author EMEDINA
 *
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
    public boolean isSymmetric(TreeNode root) {
        compareSymmetry(root, root);
    }
    
    public boolean compareSymmetry(TreeNode node1 , TreeNode node2) {
      if(node1 == null && node2 == null) return true;
      if( node1 == null || node2 == null) return false;
      if( node1.val != node2.val ) return false;
      if(!compareSymmetry(node1.right,node2.left) || !compareSymmetry(node2.right,node1.left)) {
        return false;
      }
      
      return true;
    }
}
