package com.enriquemedina.codingchallenges.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/range-sum-of-bst/submissions/
 * Given a binary search tree, return the sum of elements in a range
 * @author MedinaEn
 *
 */
public class RangeSumBST {

	public static void main(String[] args) {
		System.out.println(mySolution(new int[][]{{3,0,8},{2,4,5},{9,2,6}}));
	}
	
		
	
	static String mySolution(TreeNode root, int L, int R) {
        int sum = 0 ;
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null) queue.add(root);
        TreeNode curr;
        while(!queue.isEmpty()){
            curr = queue.remove();
            if(curr.val >= L && curr.val <= R) sum += curr.val;
            if(curr.left != null) queue.add(curr.left);
            if(curr.right != null) queue.add(curr.right);
        }
        return sum;
    }
}
