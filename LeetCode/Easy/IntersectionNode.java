/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * Return the place where two lists interect
 * @author EMEDINA
 *	O(n) time O(1) space
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;
        
        while( p1 != p2 ) {
        	p1 = p1 == null ? headB : p1.next;
        	p2 = p2 == null ? headA : p2.next;
        }
        
        return p1;
    }
}
