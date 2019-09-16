/**
 *  https://leetcode.com/problems/cousins-in-binary-tree/submissions/
 *  Return whether two nodes are cousins
 *  @Author EnMedina
 */

class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        int levelx = -1;
        int levely = -1;
        TreeNode parentx = null;
        TreeNode parenty = null;
        Deque<TreeNode> parentStack = new LinkedList<>();
        Deque<TreeNode> nodeStack = new LinkedList<>();
        Deque<Integer> levelStack = new LinkedList<>();
        nodeStack.add(root);
        levelStack.add(0);
        parentStack.add(null);
        while( (levelx == -1 || levely == -1) && !nodeStack.isEmpty()){
            TreeNode currNode = nodeStack.remove();
            int currLevel = levelStack.remove();
            TreeNode currParent = parentStack.remove();
            
            if( currNode.val == x){ 
                levelx = currLevel;
                parentx = currParent;
            }
            if( currNode.val == y) {
                levely = currLevel;
                parenty = currParent;
            }
            if( currNode.left != null ){
                nodeStack.add(currNode.left);
                levelStack.add(currLevel+1);
                parentStack.add(currNode);
            }
            if( currNode.right != null ){
                nodeStack.add(currNode.right);
                levelStack.add(currLevel+1);
                parentStack.add(currNode);
            }
            
        }
        if(levelx == -1 || levely == -1) return false;
        
        return (levelx == levely) && (parentx != parenty);
    }
}
