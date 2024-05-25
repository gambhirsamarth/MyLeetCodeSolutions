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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        if(head == null) return null;
	
	    // if the head.next == null it means that the list contains only one node (head) 
	    //so there is no duplicates  we will simply return the head of the list
	
        if(head.next == null) return head;
        else{
            while(curr.next != null){
		    //we compare the data of the current node with the next node if they are equal
		    //we remove the next node 
                if(curr.val == curr.next.val) 
                    curr.next = curr.next.next;
                else
			    //if they are not equal we simply move forward
                    curr=curr.next;
            }
        }
        return head;
    }
}
