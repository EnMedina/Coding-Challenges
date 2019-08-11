package com.enriquemedina.codingchallenges.leetcode.algorithms.medium;

/**
 * https://leetcode.com/problems/insert-into-a-binary-search-tree/submissions/
 * Insert into a binary search tree
 * @author MedinaEn
 *
 */
public class InsertIntoBST {

	public static void main(String[] args) {
		System.out.println(mySolution(new int[][]{{3,0,8},{2,4,5},{9,2,6}}));
	}
	
		
	
	static String mySolution(TreeNode root, int val) {
        TreeNode currNode = root;
        boolean inserted = false;
        while(!inserted){
            if(val > currNode.val && currNode.right != null){
                currNode = currNode.right;
            }
            else if( val < currNode.val && currNode.left != null){
                currNode = currNode.left;
            }
            else if( val > currNode.val ){
                currNode.right = new TreeNode(val);
                inserted = true;
            }
            else{
                currNode.left = new TreeNode(val);
                inserted = true;
            }
        }
        return root;
    }
}
