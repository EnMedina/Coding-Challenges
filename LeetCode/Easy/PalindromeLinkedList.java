
/**
 * https://leetcode.com/problems/palindrome-linked-list/ 
 * Return whether a linkedList is a palindrome
 * @Author EnMedina
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
    public boolean isPalindrome(ListNode head) {
        //Find the length of the list
        int nNodes = 0;
        ListNode pointer1 = head;
        while( pointer1 != null ){
            nNodes++;
            pointer1 = pointer1.next;
        }
        if(nNodes <= 1 ) return true; 
        pointer1 = head;
        for( int i = 0 ; i < (nNodes/2)-1 ; i++ ) pointer1 = pointer1.next;
        ListNode pointer2 = pointer1.next;
        if( nNodes % 2 == 1) pointer2 = pointer2.next;
        pointer1.next = null;
        pointer1 = reverseNodes(head);
        while( pointer1 != null ){
            //System.out.println("Pointer 1 "+pointer1.val + ", Pointer 2 " + pointer2.val);
            if( pointer1.val != pointer2.val) return false;
            pointer2 = pointer2.next; 
            pointer1 = pointer1.next;
        }
        
        return true;
    }
    
    private ListNode reverseNodes( ListNode root ){
        ListNode prev = null;
        ListNode next = root.next;
        while( next != null){
            root.next = prev;
            prev = root;
            root = next;
            next = root.next;
        }
        root.next = prev;
        return root;
    }
}
