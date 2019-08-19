

/**
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 * Find a value and return its subree, return null otherwise
 * @Autor EMedina
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null){
          if(root.val == val) return root;
          if(root.val > val)root = root.left;
          else if(root.val < val) root = root.right;
        }
      return null;
    }
}
