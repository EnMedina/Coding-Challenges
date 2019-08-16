/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
 * https://leetcode.com/problems/merge-two-binary-trees/submissions/
 * Merge two Binary Trees
 * @author EnMedina
class MergeBinaryTrees{
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
      Queue<TreeNode> seen1 = new LinkedList<>();
      Queue<TreeNode> seen2 = new LinkedList<>();
      if(t1 == null && t2 == null) return null;
      if(t1 == null ) return t2;
      if(t2 == null ) return t1;
      seen1.add(t1);
      seen2.add(t2);
      while(!seen1.isEmpty()){
        TreeNode curr1 = seen1.remove();
        TreeNode curr2 = seen2.remove();
        // We add the value
        curr1.val += curr2.val;
        
        // Carry out logic in case there are some nulls
        if(curr1.right != null && curr2.right != null){
          seen1.add(curr1.right);
          seen2.add(curr2.right);
        }
        else if(curr1.right == null) curr1.right = curr2.right;
        
        
         // Repeat same process for left
        if(curr1.left != null && curr2.left != null){
          seen1.add(curr1.left);
          seen2.add(curr2.left);
        }
        else if(curr1.left == null) curr1.left = curr2.left;
      }
      return t1;
    }
}
