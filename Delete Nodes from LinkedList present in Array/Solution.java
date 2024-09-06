import java.util.HashMap;

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

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i], 0) + 1);
        }
        ListNode result = new ListNode(0);
        ListNode pointer = head;
        ListNode resultPointer = result;

        while (pointer != null) {
            if (!frequencyMap.containsKey(pointer.val)) {
                resultPointer.next = new ListNode(pointer.val);
                resultPointer = resultPointer.next;
            }
            pointer = pointer.next;
        }
        return result.next;
    }
}
