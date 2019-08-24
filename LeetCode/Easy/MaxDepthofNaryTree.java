/**
 * https://leetcode.com/problems/maximum-depth-of-n-ary-tree/submissions/
 * Return the highest depth of an n nary tree
 * @Author EnMedina
 */

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        if(root == null ) return 0;
        return recMaxDepth(root,1);
    }
    
    public int recMaxDepth(Node n, int currD){
        if( n.children == null || n.children.size()== 0 ) return currD;
        int maxVal = currD;
        for(Node i : n.children){
            maxVal = Math.max(recMaxDepth(i,currD+1),maxVal);
        }
        return maxVal;
    }
    
}
