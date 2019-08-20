/**
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/submissions/
 * Return the preorder traversal for a N-ary tree
 * @Author EnMedina
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
    public List<Integer> preorder(Node root) {
      List<Integer> preorderList = new LinkedList<>();
      if(root == null) return preorderList;
      Deque<Node> toProcess = new LinkedList<>();
      toProcess.push(root);
      while(!toProcess.isEmpty()){
        Node currNode = toProcess.removeFirst();
        preorderList.add(currNode.val);
        while(currNode.children != null && currNode.children.size() > 0){
          preorderList.add(currNode.children.get(0).val);
          for(int i = currNode.children.size()-1 ; i > 0 ; i--){
            toProcess.addFirst(currNode.children.get(i));
          }
          currNode = currNode.children.get(0);
        }
      }
      return preorderList;
    }
}
