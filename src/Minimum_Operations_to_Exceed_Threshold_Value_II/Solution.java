import java.util.PriorityQueue;

class Solution {

    public static void main(String[] args) {
        // [1000000000,999999999,1000000000,999999999,1000000000,999999999]
        int[] nums = {1000000000, 999999999, 1000000000, 999999999, 1000000000, 999999999};
        int k = 1000000000;
        System.out.println(minOperations(nums, k));
    }

    public static int minOperations(int[] nums, int k) {
        if (nums.length < 2) return 0;
        int result = 0;
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add((long) num);
        }
        while (!pq.isEmpty() && pq.peek() <= k) {
            Long x = pq.poll();
            Long y = pq.poll();
            if (x != null && y != null && (x < k || y < k)) {
                pq.add(Math.min(x, y) * 2 + Math.max(x, y));
                result++;
                continue;
            }
            break;
        }
        return result;
    }
}
