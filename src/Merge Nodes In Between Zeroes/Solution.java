class Solution {
    public static ListNode mergeNodes(ListNode head) {
        ListNode result = new ListNode(0);
        ListNode resultPointer = result;
        int sum = 0;
        while (head != null) {
            if (head.val == 0) {
                if (sum != 0) {
                    result.next = new ListNode(sum);
                    result = result.next;
                    sum = 0;
                }
            } else {
                sum += head.val;
            }
            head = head.next;
        }
        return resultPointer.next;
    }
}
