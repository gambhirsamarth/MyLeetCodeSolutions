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

//  Brute Force -> Traverse the linked list to find its length then subtract it from the given number to delete it TC = O(2N)

/* Optimized solution -> Take slow and fast pointers, move fast pointers by N,  while slow is at beginning of LL
    then move both slow and fast by 1 place. as soon as fast reaches the end, delete slow pointer's next node.
*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;

        ListNode slow = start;
        ListNode fast = start;

        for(int i=1; i<=n; i++){
            fast = fast.next;
        }

        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return start.next;
    }
}
