/**
 *  https://leetcode.com/problems/minimum-absolute-difference-in-bst/
 *  Return the absolute difference in a bst
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
    public int getMinimumDifference(TreeNode root) {
        
        Deque<TreeNode> stack = new LinkedList<>();
        stack.add(root);
        List<Integer>  values = new ArrayList<>();
        while( !stack.isEmpty() ){
            TreeNode currNode = stack.remove();
            values.add(currNode.val);
            if(currNode.left != null)stack.add(currNode.left);
            if(currNode.right != null)stack.add(currNode.right);
        }
        Collections.sort(values);
        int minDiff = Integer.MAX_VALUE;
        for( int i = 1 ; i < values.size() ; i++ ){
            minDiff = Math.min(minDiff, values.get(i)-values.get(i-1));
        }
       return minDiff; 
    }
}


