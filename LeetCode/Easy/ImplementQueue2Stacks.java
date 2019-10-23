
/**
 * https://leetcode.com/problems/implement-queue-using-stacks/
 * Implement a queue with 2 stacks
 * @author EMEDINA
 *
 */
class MyQueue {
  Deque<Integer> stack1;
  Deque<Integer> stack2;
  
  /** Initialize your data structure here. */
  public MyQueue() {
      stack1 = new LinkedList<>();
      stack2 = new LinkedList<>();
  }
  
  /** Push element x to the back of queue. */
  public void push(int x) {
      stack1.addFirst(x);
  }
  
  /** Removes the element from in front of queue and returns that element. */
  public int pop() {
    if( stack2.isEmpty() ) {
      while( !stack1.isEmpty() ) {
        stack2.addFirst(stack1.pop());
      }
    }
    
    return stack2.pop();
  }
  
  /** Get the front element. */
  public int peek() {
      if( stack2.isEmpty() ) {
        while( !stack1.isEmpty() ) stack2.addFirst(stack1.pop());
      }
      return stack2.peek();
  }
  
  /** Returns whether the queue is empty. */
  public boolean empty() {
      return stack1.isEmpty() && stack2.isEmpty();
  }
}

/**
* Your MyQueue object will be instantiated and called as such:
* MyQueue obj = new MyQueue();
* obj.push(x);
* int param_2 = obj.pop();
* int param_3 = obj.peek();
* boolean param_4 = obj.empty();
*/
