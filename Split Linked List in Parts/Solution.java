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
    public static ListNode[] splitListToParts(ListNode head, int k) {
        int sizeOfLinkedList = 0;
        ListNode pointer = head;
        while (pointer != null) {
            sizeOfLinkedList++;
            pointer = pointer.next;
        }
        ListNode[] lists = new ListNode[k];
        int[] frequency = new int[50];
        Arrays.fill(frequency, sizeOfLinkedList / k);
        int i = 0;
        while (i < frequency.length && sizeOfLinkedList % k != 0) {
            frequency[i]++;
            i++;
            sizeOfLinkedList--;
        }

        for (int p = 0; p < lists.length; p++) {
            int count = 1;
            ListNode node = new ListNode(0);
            ListNode prev = null;
            ListNode curr = node;
            while (count <= frequency[p]) {
                curr.next = head;
                prev = curr;
                curr = curr.next;
                head = head != null ? head.next : null;
                count++;
            }
            if (prev != null) prev.next.next = null;
            lists[p] = node.next;
        }
        return lists;
    }
}
