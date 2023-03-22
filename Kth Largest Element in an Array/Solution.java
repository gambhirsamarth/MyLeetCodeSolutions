class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<k;i++){ // create a priority queue if size k or a min heap
            pq.add(nums[i]);
        }

        for(int i=k;i<nums.length;i++){ // start iterating from k to end of array
            
            // if nums[i] is greater than peak of heap, replace it peek with nums[i]
            if(pq.peek()<nums[i]){
                pq.poll();
                pq.add(nums[i]);
            }
        }

        return pq.peek(); // return the peek, it will be the kth largest element
    }
}
