/**
*	https://leetcode.com/problems/univalued-binary-tree/submissions/
*	Return whether a tree has a single unique value or not.
*	@Author EnMedina
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode.left;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
      int universalVal = root.val;
      Deque<TreeNode> queue = new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()){
        TreeNode currNode = queue.remove();
        if(currNode.val != universalVal) return false;
        if(currNode.left != null) queue.add(currNode.left);
        if(currNode.right != null) queue.add(currNode.right);
      }
      return true;
    }
}