/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Map<Integer, ListNode[]> nodes = new HashMap<>(); 

        int i = 1;
        ListNode curr = head; 
        ListNode prev = null; 

        while(curr != null) {
            ListNode[] arr = {prev, curr, curr.next};
            nodes.put(i, arr); 
            
            i++; 
            prev = curr;
            curr = curr.next;
        }

        ListNode[] toRemove = nodes.get(i - n); 

        if(toRemove[1].equals(head)) {
            head = toRemove[2];
        } 
        else {
            toRemove[0].next = toRemove[2]; 
        }

        return head; 
    }
}
