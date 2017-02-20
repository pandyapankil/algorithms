/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    ListNode reverseList(ListNode first, ListNode rev){
        if(first == null)
            return rev;
        ListNode second = first.next;
        first.next = rev;
        return reverseList(second, first);
    }
    public ListNode reverseList(ListNode head) {
        return reverseList(head, null);
    }
}