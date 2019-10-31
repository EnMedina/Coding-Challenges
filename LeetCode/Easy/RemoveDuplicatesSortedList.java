/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * Remove duplicate values from a sorted list
 * @Author ENMedina
 */

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pointer = head;
        while(pointer != null){
            while( pointer.next != null && pointer.val == pointer.next.val) pointer.next = pointer.next.next;
            pointer = pointer.next; 
        }
        return head;
    }
}
