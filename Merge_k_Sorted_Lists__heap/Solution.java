/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    class QueueNode implements Comparable<QueueNode>{
        ListNode list;
        int value;
        public QueueNode(ListNode list, int value){
            this.list = list;
            this.value = value;
        }
        public int compareTo(QueueNode n){
            if(this.value < n.value)      return -1;
            else if(this.value > n.value) return 1;
            else                          return 0;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int i;
        PriorityQueue<QueueNode> pq = new PriorityQueue<QueueNode>();
        
        for(i=0; i<lists.length; i++){
            if(lists[i] != null)
                pq.add(new QueueNode(lists[i], lists[i].val));
        }
        
        ListNode result = new ListNode(0);
        ListNode curr = result;
        
        while(!pq.isEmpty()){
            QueueNode n = pq.poll();
            ListNode next = n.list.next;
            curr.next = n.list;
            if(next != null)
                pq.add(new QueueNode(next, next.val));
            curr = curr.next;
        }
        
        return result.next;
    }
}