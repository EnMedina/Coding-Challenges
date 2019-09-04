/**
 *  https://leetcode.com/problems/baseball-game/submissions/
 *  Return the number of points in this baseball game
 *  @Author EnMEdina
 */

class Solution {
    public int calPoints(String[] ops) {
        Deque<Integer> stack = new LinkedList<>();
        int currentValue = 0;
        for(String operation : ops){
            if(operation.charAt(0) == 'C'){
                currentValue -= stack.removeFirst();
            }
            else if(operation.charAt(0) == '+'){
                int added = 0;
                int n1 = stack.removeFirst();
                int n2 = stack.peek();
                added = n1 + n2;
                stack.addFirst(n1);
                stack.addFirst(added);
                currentValue += added;
            }
            
            else if(operation.charAt(0) == 'D'){
                int added = stack.peek()*2;
                stack.addFirst(added);
                currentValue += added;
            }
            else{
                int added = Integer.parseInt(operation);
                stack.addFirst(added);
                currentValue += added;
            }
        }
        return currentValue;
    }
}
