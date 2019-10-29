/**
 *  https://leetcode.com/problems/remove-linked-list-elements/
 *  Remove all elements of value val from a linkedlist
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode prevVal = null;
        while( head != null && head.val == val ){
           prevVal = head;
           head = head.next; 
        } 
        if( head == null ) return head;
        
        ListNode pointer1 = head;
        while(pointer1 != null ){
            if( pointer1.val == val ){
                prevVal.next = pointer1.next;
                pointer1 = prevVal.next;
            }else{
                prevVal =  pointer1;
                pointer1 = pointer1.next;
            }
        }
        return head;
    }
}
