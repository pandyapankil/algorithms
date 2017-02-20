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
    int findLength(ListNode node){
        int length = 0;
        
        while(node != null){
            node = node.next;
            length++;
        }
        
        return length;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int m = findLength(headA), n = findLength(headB);
        int d = m - n, i;
        if(d < 0){
           d = -d;
           ListNode temp = headB;
           headB = headA;
           headA = temp;
        }
           
        
        for(i=0; i<d; i++){
            if(headA == null)
                return null;
            headA = headA.next;
        }
        
        while(headA != null && headB != null){
            if(headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        
        return null;
    }
}