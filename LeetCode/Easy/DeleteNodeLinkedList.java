/**
 *  https://leetcode.com/problems/delete-node-in-a-linked-list/submissions/
 *  Delete a given node from a linkedlist
 *  @Author EnMedina
 */
 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
      node.val = node.next.val;
      node.next = node.next.next;
      
    }
}
