/**
 *  https://leetcode.com/problems/leaf-similar-trees/submissions/
 *  Return whether two tree leaves are similar or not
 *  @Author EnMedina
 */


/**
 *  * Definition for a binary tree node.
 *   * public class TreeNode {
 *    *     int val;
 *     *     TreeNode left;
 *      *     TreeNode right;
 *       *     TreeNode(int x) { val = x; }
 *        * }
 *         */
class Solution {
	public boolean leafSimilar(TreeNode root1, TreeNode root2) {
		if(root1 == null && root2 == null) return true;
		if(root1 == null || root2 == null) return false; 
		ArrayList<Integer> leaves1 = new ArrayList<>();
		ArrayList<Integer> leaves2 = new ArrayList<>();

		Deque<TreeNode> queue = new LinkedList<>();
		queue.addFirst(root1);
		while(!queue.isEmpty()){
			TreeNode currNode = queue.removeFirst();
			if(currNode.left == null && currNode.right == null) leaves1.add(currNode.val);
			if(currNode.left != null) queue.addFirst(currNode.left);
			if(currNode.right != null) queue.addFirst(currNode.right);
		}
		queue = new LinkedList<>();
		queue.addFirst(root2);
		while(!queue.isEmpty()){
			TreeNode currNode = queue.removeFirst();
			if(currNode.left == null && currNode.right == null) leaves2.add(currNode.val);
			if(currNode.left != null) queue.addFirst(currNode.left);
			if(currNode.right != null) queue.addFirst(currNode.right);
		}
		if(leaves1.size() != leaves2.size()) return false;
		return leaves1.equals(leaves2);
	}
}
*/
