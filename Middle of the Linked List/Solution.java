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

// Brute Force -> Count no. of elements. if even divide by 2 else add 1 and divide by 2. traverse again and return the node O(2n)

/*
Optimal Solution: Tortoise Method
take 2 nodes at head. fast and slow. Move fast by 2 steps, slow by 2 step. When fast reaches end of LL, slow is at the middle of LL


*/ 

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;

        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
