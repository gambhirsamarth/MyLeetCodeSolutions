
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {

    public static void main(String[] args) {
//        [18,6,10,3]
        ListNode head = new ListNode(18);
        head.next = new ListNode(6);
        head.next.next = new ListNode(10);
        head.next.next.next = new ListNode(3);
        insertGreatestCommonDivisors(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null) return head;

        ListNode pointer = head;
        ListNode nextPointer = head.next;
        while (nextPointer != null) {
            ListNode gcd = new ListNode(gcd(pointer.val, nextPointer.val));
            pointer.next = gcd;
            gcd.next = nextPointer;
            pointer = gcd.next;
            nextPointer = pointer.next;
        }
        return head;
    }

    public static int gcd(int a, int b) {
        if (a == 0 || b == 0) return Math.max(a, b);
        return gcd(Math.max(a, b) % Math.min(a, b), Math.min(a, b));
    }
}
