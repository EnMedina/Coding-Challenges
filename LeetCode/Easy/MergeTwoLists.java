/**
 *  https://leetcode.com/problems/merge-two-sorted-lists/submissions/
 *  Merge two already sorted lists
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode root = l2.val < l1.val ? l2 : l1;
        if(root == l2) l2 = l2.next;
        else l1 = l1.next;
        ListNode currNode = root;
        while(l2 != null && l1 != null){
            if( l2.val <= l1.val ) {
                currNode.next = l2;
                l2 = l2.next;
            }else{
                currNode.next = l1;
                l1 = l1.next;
            }
            currNode = currNode.next;
        }
        if( l1 == null) currNode.next = l2;
        else currNode.next = l1;
        return root;
    }
}
