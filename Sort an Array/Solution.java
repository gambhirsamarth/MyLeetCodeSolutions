/*
Step 1 : Take one ans array to store the sorted array and PriorityQueue pq. Default PriorityQueue is Min Heap , It store all elements in ascending order.
Step 2 : Add all elements in PriorityQueue.
Step 3 : Now add elements of pq to the ans array.
Step 4 : Return ans array.
*/

class Solution {
    public int[] sortArray(int[] nums) {

        int i=0;
        int[] ans = new int[nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums) pq.offer(num);
        while(!pq.isEmpty()) ans[i++] = pq.poll();
        return ans;
    }
}
