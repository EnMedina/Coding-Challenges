package com.enriquemedina.codingchallenges.leetcode.algorithms.easy;

/**
 * https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree
 * Given a binary search tree, a node value should now be the sum of the elements bigger than itself
 * @author MedinaEn
 *
 */
public class BinarySearchGreaterSum {

	public static void main(String[] args) {
		System.out.println(mySolution(new int[][]{{3,0,8},{2,4,5},{9,2,6}}));
	}
	
		
	
	static String mySolution(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> valueList = new ArrayList<>();
        TreeNode currNode;
        if(root != null) queue.add(root);
        while(!queue.isEmpty()){
            currNode = queue.remove();
            valueList.add(subTreeSum(root, currNode.val));
            if(currNode.right != null) queue.add(currNode.right);
            if(currNode.left != null) queue.add(currNode.left);     
        }
        int valueIndex = 0;
        if(root != null) queue.add(root);
        while(!queue.isEmpty()){
            currNode = queue.remove();
            currNode.val = valueList.get(valueIndex++);
            if(currNode.right != null) queue.add(currNode.right);
            if(currNode.left != null) queue.add(currNode.left);     
        }
        
        return root;
    }
    
    private int subTreeSum(TreeNode root, int val){
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode currNode;
        int sum = 0;
        if(root != null) queue.add(root);
        while(!queue.isEmpty()){
            currNode = queue.remove();
            if(currNode.val >= val) sum += currNode.val;
            if(currNode.right != null) queue.add(currNode.right);
            if(currNode.left != null) queue.add(currNode.left);            
        }
        return sum;
    }
}
