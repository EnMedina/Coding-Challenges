/**https://leetcode.com/problems/n-ary-tree-postorder-traversal/submissions/
*Return postorder traversal for a nth node tree
*Author @Emedina
**/
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
  public List<Integer> postorder(Node root) {
    List<Integer> traversal = new LinkedList<>();
    if(root == null) return traversal;
    Deque<Node> stack = new LinkedList<>(); 
    stack.add(root);
    while(!stack.isEmpty()){
      Node currNode = stack.remove();
      traversal.add(0,currNode.val);
      if(currNode.children != null ){
        for(Node n : currNode.children){
          stack.addFirst(n);
        }
      }
    }
    return traversal;
  }
}
