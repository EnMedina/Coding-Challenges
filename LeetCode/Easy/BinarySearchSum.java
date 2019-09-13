/**
 *  https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 *  Return whether a value exists in a binary search tree
 *  @Author EnMedina
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
    public boolean findTarget(TreeNode root, int k) {
      Set<Integer> seen = new HashSet<>();
      Deque<TreeNode> stack = new LinkedList<>();
      stack.add(root);
      while(!stack.isEmpty()){
        TreeNode currNode = stack.remove();
        if(seen.contains(k-currNode.val)) return true;
        seen.add(currNode.val);
        if(currNode.left != null)stack.add(currNode.left);
        if(currNode.right != null)stack.add(currNode.right);
        
      }
      return false;
    }
}
